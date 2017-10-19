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
public class ConstructorInjectedServiceTest {

    public static final String CONSTRUCTOR_TEST_MESSAGE = "Hello constructor injection gurus!!!";

    @BeforeClass
    public static void setConstructorTestMessage() {
        System.setProperty("message", CONSTRUCTOR_TEST_MESSAGE);
    }

    private ConstructorInjectedService service;

    @Autowired
    public void setService(ConstructorInjectedService service) {
        this.service = service;
    }

    @Test
    public void testGreet() {
        Assert.assertEquals(CONSTRUCTOR_TEST_MESSAGE, service.greet());
    }

}
