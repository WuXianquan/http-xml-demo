package com.test.xml.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "MessageAccept")//标记为根节点
@XmlAccessorType(XmlAccessType.FIELD)
public class MessageAccept {

    @XmlElement(name = "Id")//xml节点重命名
    private Integer id;

    @XmlElement(name = "Username")
    private String username;

    @XmlElement(name = "Password")
    private String password;


}
