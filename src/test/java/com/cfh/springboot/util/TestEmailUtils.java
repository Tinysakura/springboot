package com.cfh.springboot.util;

import com.cfh.springboot.SpringbootApplicationTests;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: cfh
 * @Date: 2018/10/23 14:59
 * @Description:
 */

public class TestEmailUtils extends SpringbootApplicationTests {

    /**
     * 发送一封邮件进行测试（用来发送邮件的邮箱必须支持SMTP协议）
     */
    @Test
    public void sendEmail() {
        List<Map<String, String>> files = new ArrayList<>();
        Map<String, String> fileMap = new HashMap<>();
        fileMap.put("name", "附件1");
        fileMap.put("file", "/Users/chenfeihao/Desktop/attachfile.txt");
        files.add(fileMap);

        EmailUtils.sendEmail("测试邮件", new String[]{"2796191719@qq.com"}, null ,
                "hello email", files);
    }

}