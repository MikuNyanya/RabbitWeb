package cn.mikulink.rabbitweb.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by MikuNyanya on 2021/3/18 17:19
 * For the Reisen
 * 主页
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {
    @Setter
    @Getter
    private static Long clickCount = 0L;

    /**
     * 主页
     *
     * @return 主页视图
     */
    @RequestMapping(value = "")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "syncClickCount", method = RequestMethod.POST)
    @ResponseBody
    public String syncClickCount(int clickCountAfter) {
        clickCount += clickCountAfter;

        return "{\"clickCount\":" + clickCount + "}";
    }
}
