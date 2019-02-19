package atul.backend.oauth.service;


import atul.backend.oauth.entity.UserEntity;

import java.util.List;

public interface UserService {

    UserEntity save(UserEntity user);
    List<UserEntity> findAll();
    void delete(long id);

    UserEntity findOne(long id);
}
