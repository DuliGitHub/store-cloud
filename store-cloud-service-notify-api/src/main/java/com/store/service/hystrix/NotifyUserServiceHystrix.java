package com.store.service.hystrix;

import com.store.service.NotifyUserService;
import org.springframework.stereotype.Component;

/**
 * 用户通知 熔断处理
 *
 * @author xubin.
 * @create 2017-05-05 下午12:35
 */

@Component
public class NotifyUserServiceHystrix implements NotifyUserService {

    @Override
    public String mobileNotify(String mobile) {
        return null;
    }
}
