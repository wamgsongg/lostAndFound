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
public class Comment implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String commentInfo;

    private Boolean delete;

    private Long commentator;

    private Long postId;

    private Integer commentId;


}
