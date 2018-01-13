package com.huanghongxi.chiguoguoservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String productId;           //商品编号
    private String productName;         //商品名称
    private Integer stock;              //库存
    private BigDecimal price;           //价格
    private BigDecimal originalPrice;   //原价
    private String info;                //简介
    private String unit;                //单位
    private Integer status;             //状态(0:上架 1:下架 2:售完)
    private Integer recommendState;     //推荐状态（0:普通商品1:精选推荐）
    private String coverImgPath;        //封面图片
    private String productImgPath;      //商品图片
    private String recImgPath;          //推荐图片
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date launchedTime;          //上架时间
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date discontinuedTime;      //下架时间
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date sellOutTime;           //售完时间
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;            //更新时间
}
