package com.example.lostandfound.service;

import com.example.lostandfound.database.entity.Person;
import com.example.lostandfound.util.ResultBean;

public interface IUserService {

    public ResultBean<Person> register(Person p);
}
