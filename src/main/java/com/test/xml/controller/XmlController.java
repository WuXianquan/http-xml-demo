package com.test.xml.controller;

import com.test.xml.pojo.MessageAccept;
import com.test.xml.pojo.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/xml")
public class XmlController {

    //请求地址:http://localhost:8080/xml/test
    //请求Head:Content-Type:application/xml
    //请求参数:<?xml version="1.0" encoding="UTF-8"?><Param><Id>111</Id></Param>
    //返回数据:
    // <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
    // <MessageAccept>
    //     <Id>111</Id>
    //     <Username>test</Username>
    //     <Password>123456</Password>
    // </MessageAccept>

    //produces标记返回类型为xml格式
    @RequestMapping(value = "/test", method = RequestMethod.POST, produces = {"application/xml; charset=UTF-8"})
    @ResponseBody
    public MessageAccept test(@RequestBody Param param) {
        return new MessageAccept(param.getId(), "test", "123456");
    }
}
