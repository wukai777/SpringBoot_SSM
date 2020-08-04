package com.everyweek.ssm.service.Impl;

import com.everyweek.ssm.dao.userDaoMapper;
import com.everyweek.ssm.entrty.User;
import com.everyweek.ssm.service.userService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class userServiceImpl implements userService {

    @Resource
    userDaoMapper userDao;

    @Override
    public User getUserByUserId(String userId) {
        return userDao.getUserByUserId(userId);
    }
}
