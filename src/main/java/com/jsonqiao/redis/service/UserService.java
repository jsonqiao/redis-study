package com.jsonqiao.redis.service;

import com.jsonqiao.redis.domain.UserDO;

/**
 * Created by jsonqiao on 2016-03-28.
 */
public interface UserService {

    String addAndCache(String id, String username);

    UserDO getById(String id);
}
