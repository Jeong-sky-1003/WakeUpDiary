package com.wakeupdiary.web;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.annotation.security.RunAs;

/**
 * JUnit 5로 올라가며 변경됨
 * https://jojoldu.tistory.com/539
 *
 * @RunWith -> @ExtendWith
 * SpringRunner.class -> SpringExtension
 */
@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

}
