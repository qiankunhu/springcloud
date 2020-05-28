package com.hqk.springcloudprovider.service.impl;

import com.hqk.springcloudprovider.mapper.TestMapper;
import com.hqk.springcloudprovider.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version V1.0
 * @author: hqk
 * @date: 2020/5/28 15:52
 * @Description:
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public String gettest() {
        //System.out.println("qqqq");
        return testMapper.getTest();
    }
}
