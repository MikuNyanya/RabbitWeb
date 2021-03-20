package cn.mikulink.rabbitweb.filemanager;

import cn.mikulink.rabbitweb.controller.RabbitClickerController;
import cn.mikulink.rabbitweb.entity.RabbitWebDataInfo;
import cn.mikulink.rabbitweb.utils.FileUtil;
import com.alibaba.fastjson.JSONObject;

import java.io.*;

/**
 * create by MikuLink on 2019/12/5 15:44
 * for the Reisen
 * <p>
 * 配置文件文件专用管理器
 */
public class FileManagerData {
    //配置文件
    private static File configFile = null;
    private static final String CONFIG_FILE_PATH = "data/data";

    /**
     * 文件初始化
     * 以及加载文件到系统
     *
     * @throws IOException 读写异常
     */
    private static void fileInit() throws IOException {
        //先载入文件
        if (null != configFile) {
            return;
        }
        configFile = FileUtil.fileCheck(CONFIG_FILE_PATH);
    }

    /**
     * 加载文件内容
     *
     * @throws IOException 读写异常
     */
    private static RabbitWebDataInfo loadFile() throws IOException {
        fileInit();
        //创建读取器
        BufferedReader reader = new BufferedReader(new FileReader(configFile));
        //读取第一行
        String loadStr = null;
        while ((loadStr = reader.readLine()) != null) {
            //过滤掉空行
            if (loadStr.length() <= 0) continue;
            //关闭读取器
            reader.close();
            return JSONObject.parseObject(loadStr, RabbitWebDataInfo.class);
        }
        return null;
    }

    /**
     * 对文件写入内容
     *
     * @throws IOException 读写异常
     */
    public static void writeFile(RabbitWebDataInfo rabbitWebDataInfo) throws IOException {
        fileInit();
        //创建写入流
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(CONFIG_FILE_PATH, false)));
        //覆写原本配置
        out.write(JSONObject.toJSONString(rabbitWebDataInfo));
        //关闭写入流
        out.close();
    }

    /**
     * 资源文件初始化
     */
    public static void dataFileInit() {
        try {
            //读取数据
            RabbitWebDataInfo rabbitWebDataInfo = loadFile();
            if (null != rabbitWebDataInfo) {
                RabbitClickerController.setClickCount(rabbitWebDataInfo.getClickCount());
            }

        } catch (Exception ex) {
//            logger.error("资源文件读取异常:{}", ex.getMessage(), ex);
            ex.printStackTrace();
        }
    }
}
