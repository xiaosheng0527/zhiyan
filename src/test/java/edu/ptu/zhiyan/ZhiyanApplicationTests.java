package edu.ptu.zhiyan;

import edu.ptu.zhiyan.entity.User;
import edu.ptu.zhiyan.service.test.impl.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ZhiyanApplicationTests {

    //@Autowired
    //ChoiceQuestionService choiceQuestionService;
    @Autowired
    TestService testService;

    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("root2");
        user.setPassword("hhh");
        testService.saveUser(user);
    }

}
