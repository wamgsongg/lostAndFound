package com.example.lostandfound.database.service.impl;

import com.example.lostandfound.database.entity.Person;
import com.example.lostandfound.database.mapper.PersonMapper;
import com.example.lostandfound.database.service.IPersonService;
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
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
