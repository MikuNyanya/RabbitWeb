package cn.mikulink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author MikuLink
 * 2020/7/29 10:51
 * For the Reisen!
 */
@Controller
public class IndexController {

    /**
     * 网站主页
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}