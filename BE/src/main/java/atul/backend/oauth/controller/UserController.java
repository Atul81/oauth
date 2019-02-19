package atul.backend.oauth.controller;

import atul.backend.oauth.entity.UserEntity;
import atul.backend.oauth.model.Response;
import atul.backend.oauth.service.EmailService;
import atul.backend.oauth.service.UserService;
import atul.backend.oauth.service.impl.EmailServiceImpl;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private EmailService emailService;

    @GetMapping(value = "/user")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "Authorization token",
                    required = true, dataType = "string", paramType = "header") })
    public ResponseEntity<Response<List<UserEntity>>> listUser() {
        List<UserEntity> userEntityList = userService.findAll();
        Response response =  new Response();
        response.setResponse(userEntityList);
        response.setHeaderModel(null);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(value = "/user")
    public UserEntity create(@RequestBody UserEntity user) {

        return userService.save(user);
    }


    @GetMapping(value = "/user/{id}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "Authorization token",
                    required = true, dataType = "string", paramType = "header") })
    public ResponseEntity<Response<UserEntity>> findOne(@PathVariable long id) {
        UserEntity userEntityList = userService.findOne(id);
        Response response = new Response();
        response.setResponse(userEntityList);
        response.setHeaderModel(null);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(value = "/user/{id}")
    public UserEntity update(@PathVariable long id, @RequestBody UserEntity user) {
        user.setId(id);
        return userService.save(user);
    }

    @DeleteMapping(value = "/user/{id}")
    public void delete(@PathVariable(value = "id") Long id) {
        userService.delete(id);
    }

}
