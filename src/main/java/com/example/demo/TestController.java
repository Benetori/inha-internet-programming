package com.example.demo;

/**
 * Created by NDS_047 on 2019-12-18.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping("/index")
    private String jspIndex() {
        return "index"; // jsp확장자를 생략가능
    }

}
