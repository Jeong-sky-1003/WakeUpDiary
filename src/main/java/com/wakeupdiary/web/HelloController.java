package com.wakeupdiary.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController : JSON을 반환하는 컨트롤러로 (@ResponseBody)를 메서드마다 선언했던 것을 한 번에 할 수 있게 함
 */
@RestController
public class HelloController {

    /**
     * HTTP Method 중 get 요청을 받을 수 있음
     *
     * @return
     */
    @GetMapping("/hello")
    public String getHello() {
        return "<h1>hello</h1>";
    }

}
