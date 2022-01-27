package com.example.lostandfound.service.impl;

import com.example.lostandfound.database.entity.Person;
import com.example.lostandfound.database.service.IPersonService;
import com.example.lostandfound.service.IUserService;
import com.example.lostandfound.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IPersonService personService;


    @Override
    public ResultBean<Person> register(Person p) {
        ResultBean<Person> result = new ResultBean<>();
        try {
            if (personService.save(p)){
                result.setData(p);
                result.setMsg("注册成功");
            }else {
                result.setCode(ResultBean.FAIL);
                result.setMsg("注册失败");
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(ResultBean.FAIL);
            result.setMsg(e.getMessage());
            return result;
        }
    }
}
