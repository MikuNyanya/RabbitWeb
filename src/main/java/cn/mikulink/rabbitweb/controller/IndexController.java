package cn.mikulink.rabbitweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by MikuNyanya on 2021/3/18 17:19
 * For the Reisen
 * 主页
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    /**
     * 主页
     *
     * @return 主页视图
     */
    @RequestMapping(value = "")
    public String index() {
        return "index";
    }
}
