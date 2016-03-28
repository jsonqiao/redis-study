package com.jsonqiao.redis.service.impl;

import com.jsonqiao.redis.domain.UserDO;
import com.jsonqiao.redis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by jsonqiao on 2016-03-28.
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    @CachePut(value = "userCache", key = "#id")
    public String addAndCache(String id, String username) {
        UserDO userDO = new UserDO();
        userDO.setId(id);
        userDO.setUsername(username);
        return userDO.getId();
    }

    @Override
    @Cacheable(value = "userCache", key = "#id")
    public UserDO getById(String id) {
        logger.debug("用户信息不存在缓存中...");
        UserDO userDO = new UserDO();
        userDO.setId(id);
        userDO.setUsername("test" + id);
        return userDO;
    }
}
