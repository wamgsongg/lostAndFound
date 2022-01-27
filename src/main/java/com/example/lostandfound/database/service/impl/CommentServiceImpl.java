package com.example.lostandfound.database.service.impl;

import com.example.lostandfound.database.entity.Comment;
import com.example.lostandfound.database.mapper.CommentMapper;
import com.example.lostandfound.database.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ws
 * @since 2022-01-11
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
