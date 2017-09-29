package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by wang on 2017/9/29.
 */
public interface IOrderService {
     ServerResponse pay(Long orderNo, Integer userId, String path);
}
