package com.example.lostandfound.database.service.impl;

import com.example.lostandfound.database.entity.Category;
import com.example.lostandfound.database.mapper.CategoryMapper;
import com.example.lostandfound.database.service.ICategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
