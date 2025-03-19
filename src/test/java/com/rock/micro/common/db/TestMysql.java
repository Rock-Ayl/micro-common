package com.rock.micro.common.db;

import com.rock.micro.common.pojo.mdo.TestDO;
import com.rock.micro.common.serivce.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class TestMysql {

    @Autowired
    private TestService testService;

    @Test
    void create() {

        List<TestDO> list = new ArrayList<>();
        TestDO one = new TestDO();
        TestDO two = new TestDO();
        one.setEmail("4444444444");
        two.setEmail("33333");
        list.add(one);
        list.add(two);
        testService.create(list);
        System.out.println();
    }

    @Test
    void sqlQuery() {
        //查询条件
        Map<String, Object> params = new HashMap<>();
        //限制邮箱
        params.put("email", "11111测试");
        //查询
        List<TestDO> doList = testService.selectByCondition(params);
        System.out.println();
    }

    @Test
    void search() {

        //todo
    }

    @Test
    void updateSkipNull() {
        //todo
    }

    @Test
    void updateSkipByWrapper() {
        //todo
    }

}
