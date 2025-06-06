package com.rock.micro.common.serivce.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rock.micro.base.data.BaseDO;
import com.rock.micro.common.mapper.TestMapper;
import com.rock.micro.common.pojo.mdo.TestDO;
import com.rock.micro.common.serivce.TestService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, TestDO> implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public Collection<TestDO> create(Collection<TestDO> doList) {
        //判空
        if (CollectionUtils.isEmpty(doList)) {
            //过
            return new ArrayList<>();
        }
        //循环
        for (TestDO testDO : doList) {
            //初始化创建
            BaseDO.createBuild(testDO);
        }
        //实现
        this.saveBatch(doList);
        //返回
        return doList;
    }

    @Override
    public List<TestDO> selectByCondition(Map<String, Object> params) {
        //返回
        return testMapper.selectByCondition(params);
    }

}