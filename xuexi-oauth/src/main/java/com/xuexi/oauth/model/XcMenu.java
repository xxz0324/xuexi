package com.xuexi.oauth.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;


@Data
@ToString
public class XcMenu {

    private String id;
    private String code;
    private String pCode;
    private String pId;
    private String menuName;
    private String url;
    private String isMenu;
    private Integer level;
    private Integer sort;
    private String status;
    private String icon;
    private Date createTime;
    private Date updateTime;


}
