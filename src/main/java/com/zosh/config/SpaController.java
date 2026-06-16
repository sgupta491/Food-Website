package com.zosh.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpaController {

    @RequestMapping(value = {
            "/",
            "/cart",
            "/search",
            "/account/**",
            "/restaurant/**",
            "/payment/**",
            "/my-profile/**",
            "/admin/**"
    })
    public String redirect() {
        return "forward:/index.html";
    }
}