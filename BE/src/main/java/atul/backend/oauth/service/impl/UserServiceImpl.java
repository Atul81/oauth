package atul.backend.oauth.service.impl;

import atul.backend.oauth.config.EmailConfig;
import atul.backend.oauth.model.EmailModel;
import atul.backend.oauth.repository.UserRepository;
import atul.backend.oauth.entity.UserEntity;
import atul.backend.oauth.service.EmailService;
import atul.backend.oauth.service.UserService;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.*;


@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailService emailService;


    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(userId);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority());
    }

    private List<SimpleGrantedAuthority> getAuthority() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
    }

    public List<UserEntity> findAll() {
        List<UserEntity> list = new ArrayList<>();
        userRepository.findAll().iterator().forEachRemaining(list::add);
        EmailModel mail = new EmailModel();
        mail.setMailTo("shujaatalinbd@gmail.com");
        mail.setMailSubject("Face to Face Interview at Oracle" + new Date());

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("firstName", "Shujaat");
        model.put("lastName", "Ali");
        model.put("location", "Hyderabad");
        model.put("signature", "Arre behenchod zoom karo");
        mail.setModel(model);

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(EmailConfig.class);
        try {
            emailService.sendEmail(mail);
        } catch (Exception e) {
            e.printStackTrace();
        }
        context.close();
        return list;
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserEntity findOne(long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public UserEntity save(UserEntity user) {
        return userRepository.save(user);
    }
}
