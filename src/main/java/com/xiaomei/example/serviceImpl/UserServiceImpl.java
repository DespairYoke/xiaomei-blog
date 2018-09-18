package com.xiaomei.example.serviceImpl;

import com.xiaomei.example.domain.User;
import com.xiaomei.example.domain.UserExample;
import com.xiaomei.example.mapper.UserMapper;
import com.xiaomei.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zwd
 * @date 2018/9/18 14:46
 * @Email stephen.zwd@gmail.com
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectByUsernameAndPassword(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andUsernameEqualTo(user.getUsername())
                .andPasswordEqualTo(user.getPassword());
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }
}
