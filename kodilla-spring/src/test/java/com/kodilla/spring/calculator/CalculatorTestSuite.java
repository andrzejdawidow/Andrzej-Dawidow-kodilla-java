package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val1 = calculator.add(4, 2);
        double val2 = calculator.sub(4, 2);
        double val3 = calculator.mul(4, 2);
        double val4 = calculator.div(4, 2);
        //Then
        Assert.assertEquals(6.0, val1, 0.1);
        Assert.assertEquals(2.0, val2, 0.1);
        Assert.assertEquals(8.0, val3, 0.1);
        Assert.assertEquals(2.0, val4, 0.1);
    }
}
