package com.management.starter;

import com.management.service.read.EnterPriseBaseInfoReadService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DataManagementStarterApplication.class)
class DataManagementStarterApplicationTests {

    @Resource
    private EnterPriseBaseInfoReadService readService;

    @Test
        void contextLoads() {
            System.out.println(777);
            List<Map<String,Object>> list = readService.getQueryAll();
            System.out.println();
    }

}
