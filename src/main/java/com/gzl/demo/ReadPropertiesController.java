package com.gzl.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gzl
 * @description 此时没有用 lombok;读取配置文件-不提倡
 * @Date 2018/7/28
 */
@RestController
public class ReadPropertiesController {
    @Value("${cupSize}")
    private String cupSize;
    @Value("${age}")
    private String age;
    @Value("${content}")
    private String content;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/readProperties" ,method = RequestMethod.GET)
    public String readProperties(){
        return cupSize;
    }
    /**
     * 对配置文件进行复合运算
     * @return
     */
    @RequestMapping(value = "/readAdd" ,method = RequestMethod.GET)
    public String readAdd(){
        return content;
    }
    @RequestMapping(value = "/readGirl" ,method = RequestMethod.GET)
    public String readGirl(){
        return girlProperties.getAge();
    }


}
