package cn.mikulink.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author MikuLink
 * 2020/8/1 10:51
 * For the Reisen!
 * 管理后台
 */
@Controller
public class AdminController {

    /**
     * 网站后台
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "admin/admin";
    }
}