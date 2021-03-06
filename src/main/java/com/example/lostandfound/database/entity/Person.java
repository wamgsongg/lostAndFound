package com.example.lostandfound.database.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ws
 * @since 2022-01-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Person implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private String email;

    private String tel;

    private String password;

    private String school;

    private String sex;

    private Double height;

    private Double weight;

    private String address;

    private String hometown;

    private String icon;


}
