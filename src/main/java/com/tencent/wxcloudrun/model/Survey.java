package com.tencent.wxcloudrun.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Author: Liuyan
 * @Date: 2024/1/10 上午 10:21
 * @Version 1.0
 */
public class Survey implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;



    // 省略构造函数、Getter和Setter
}
