package cn.mikulink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author MikuLink
 * 2020/8/1 10:51
 * For the Reisen!
 * 主页
 */
@Controller
public class HomeController {

    /**
     * 网站主页
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "home";
    }
}