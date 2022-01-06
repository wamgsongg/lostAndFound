package com.example.lostandfound.controller;

import com.example.lostandfound.database.entity.Person;
import com.example.lostandfound.database.repository.PersonRepository;
import com.example.lostandfound.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/register")
    public ResultBean<Person> register(@RequestBody Person person){
        ResultBean<Person> result = new ResultBean<>();

        try {
            Person save = personRepository.save(person);
            if (save!=null){
                result.setData(save);
            }
            return result;

        }catch (Exception e){
            e.printStackTrace();
            result.setData(null);
            result.setCode(ResultBean.FAIL);
            result.setMsg(e.getMessage());
            return result;
        }
    }
}
