package com.xiaomei.example.service;

import com.xiaomei.example.domain.User;

import java.util.List;

/**
 * @author zwd
 * @date 2018/9/18 14:46
 * @Email stephen.zwd@gmail.com
 */
public interface UserService {
    List<User> selectByUsernameAndPassword(User user);
}
