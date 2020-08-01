package cn.mikulink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author MikuLink
 * 2020/7/29 10:51
 * For the Reisen!
 * 欢迎页面
 */
@Controller
public class IndexController {

    /**
     * 欢迎页面
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}