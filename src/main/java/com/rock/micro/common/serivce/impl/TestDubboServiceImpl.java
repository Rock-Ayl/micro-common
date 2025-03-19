package com.rock.micro.common.serivce.impl;

import com.rock.micro.api.user.UserRemoteService;
import com.rock.micro.common.serivce.TestDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * 测试远程调用服务
 *
 * @Author ayl
 * @Date 2025-03-19
 */
@Service
public class TestDubboServiceImpl implements TestDubboService {

    /**
     * 服务注入,并指定 负载均衡 为 轮询
     */
    @DubboReference(loadbalance = "roundrobin", group = "groupA")
    private UserRemoteService userRemoteService;

    @Override
    public String helloWorld() {
        return userRemoteService.helloWorld();
    }

    @Override
    public String helloWorld2(String word) {
        return userRemoteService.helloWorld2(word);
    }

}