package com.shaka.spring5di.service;


import com.shaka.spring5di.Spring5DiApplication;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Spring5DiApplication.class)
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class SetterInjectedServiceTest {
    public static final String SETTER_TEST_MESSAGE = "Hello setter injection gurus!!!";

    @BeforeClass
    public static void setSetterTestMessage() {
        System.setProperty("message", SETTER_TEST_MESSAGE);
    }

    private SetterInjectedService service;

    @Autowired
    public void setService(SetterInjectedService service) {
        this.service = service;
    }

    @Test
    public void testGreet() {
        Assert.assertEquals(SETTER_TEST_MESSAGE, service.greet());
    }
}
