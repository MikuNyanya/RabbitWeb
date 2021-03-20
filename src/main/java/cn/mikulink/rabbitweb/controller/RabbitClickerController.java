package cn.mikulink.rabbitweb.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * created by MikuNyanya on 2021/3/20 11:19
 * For the Reisen
 * 点击兔叽
 */
@Controller
@RequestMapping(value = "/rabbitclicker")
public class RabbitClickerController {
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
        return "rabbitclicker";
    }

    /**
     * 增量同步点击数量
     *
     * @param clickCountAfter 增加的点击数量
     * @return 点击功能状态信息
     */
    @RequestMapping(value = "syncClickCount", method = RequestMethod.POST)
    @ResponseBody
    public String syncClickCount(Integer clickCountAfter) {
        Map<String, Object> resultMap = new HashMap<>();

        if (null != clickCountAfter && clickCountAfter >= 0) {
            clickCount += clickCountAfter;
        }
        resultMap.put("clickCount", clickCount);
        return JSONObject.toJSONString(resultMap);
    }
}
