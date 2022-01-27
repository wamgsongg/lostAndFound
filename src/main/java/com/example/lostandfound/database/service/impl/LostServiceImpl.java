package com.example.lostandfound.database.service.impl;

import com.example.lostandfound.database.entity.Lost;
import com.example.lostandfound.database.mapper.LostMapper;
import com.example.lostandfound.database.service.ILostService;
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
public class LostServiceImpl extends ServiceImpl<LostMapper, Lost> implements ILostService {

}
