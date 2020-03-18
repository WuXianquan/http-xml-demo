package com.test.xml.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@ToString
@XmlRootElement(name = "Param")
@XmlAccessorType(XmlAccessType.FIELD)
public class Param {

    @XmlElement(name = "Id")
    private Integer id;

}
