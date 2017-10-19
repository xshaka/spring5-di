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
public class PropertyInjectedServiceTest {

    public static final String PROPERTY_TEST_MESSAGE = "Hello property injection gurus!!!";

    @BeforeClass
    public static void setPropertyTestMessage() {
        System.setProperty("message", PROPERTY_TEST_MESSAGE);
    }

    private PropertyInjectedService service;

    @Autowired
    public void setService(PropertyInjectedService service) {
        this.service = service;
    }

    @Test
    public void testGreet() {
        Assert.assertEquals(PROPERTY_TEST_MESSAGE, service.greet());
    }
}
