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
public class Found implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;

    private Long foundId;

    private String info;

    private String title;

    private String location;

    private Integer likes;

    private Boolean delete;

    private Boolean follow;

    private Boolean like;


}
