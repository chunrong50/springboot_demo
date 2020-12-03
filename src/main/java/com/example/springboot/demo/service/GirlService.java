package com.example.springboot.demo.service;


import com.example.springboot.demo.dao.GirlRepository;
import com.example.springboot.demo.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    /**
     * 同时插入2条记录，事务演示
     */
     @Transactional
    public void insertTwo(){
        Girl  girl=new Girl();
        girl.setName("如花");
        girl.setAge(29);
        girl.setCupSize("F");
        girlRepository.save(girl);

        Girl  girl1=new Girl();
        girl1.setName("柳岩");
        girl1.setAge(33);
    //    int i=1/0;
        girl1.setCupSize("D");
        girlRepository.save(girl1);
    }

}
