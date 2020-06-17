package com.hqk.springcloudconsumer.service.impl;

import com.hqk.springcloudconsumer.feignclient.TestService;
import com.hqk.springcloudconsumer.mapper.TestUserMapper;
import com.hqk.springcloudconsumer.service.TestUserService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @version V1.0
 * @author: hqk
 * @date: 2020/6/17 12:48
 * @Description:
 */
@Service
public class TestUserServiceImpl implements TestUserService {

    @Autowired
    private TestUserMapper testUserMapper;

    @Autowired
    private TestService testService;

    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    //@Transactional(rollbackFor = Exception.class)
    public Object updateAge(int age) {

        // 本服务 修改数据
        testUserMapper.updateAge(age);

        // 通过 fegin 调用服务
        testService.updateUserName("test");

        // 两个都执行成功时，这里发生异常 测试是否两个库的数据都会回滚
        System.out.println(1/0);

        return 1;
    }
}
