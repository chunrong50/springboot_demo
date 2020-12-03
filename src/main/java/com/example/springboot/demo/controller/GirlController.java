package com.example.springboot.demo.controller;

import com.example.springboot.demo.dao.GirlRepository;
import com.example.springboot.demo.entity.Girl;
import com.example.springboot.demo.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * 由于业务逻辑简单就放Controller中，
 * 正常需要放service中
 */

@RestController
public class GirlController {

    @Autowired
    private GirlRepository  girlRepository;

    @Autowired
    private GirlService girlService;


    /**
     *
     * @return 获取表girl中所以女生信息
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return   girlRepository.findAll();
    }

    @GetMapping(value = "/girls/{id}")
    public Optional<Girl> girlFindone(@PathVariable("id") Integer id){
        return  girlRepository.findById(id);
    }

    /**
     *
     * @param name
     * @param age
     * @param cupSize
     * @return  新增一女孩
     */
    @PostMapping(value = "/girls")
    public  Girl addGirl(
                         @RequestParam("name") String name ,
                         @RequestParam("age") Integer age,
                         @RequestParam("cupSize") String cupSize
                         ){
        Girl girl=new Girl();
        girl.setAge(age);
        girl.setName(name);
        girl.setCupSize(cupSize);
        return  girlRepository.save(girl);
    }

    /**
     * 修改更新ID为 id的girl信息
     * @param id
     * @param age
     * @param name
     * @return
     */
    @PutMapping("/girls/update/{id}")
    public Girl  girlUpdate(@PathVariable("id") Integer id,
                            @RequestParam("age") Integer age,
                            @RequestParam("name") String name){
        Girl girl=new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setName(name);

        return girlRepository.save(girl);
    }

    /**
     * 根据年龄查找
     * @param age
     * @return
     */
    @GetMapping("/girls/find/{age}")
    public  List<Girl>  findByAge(@PathVariable("age") Integer age ){

        return  girlRepository.findByAge(age);
    }


    @DeleteMapping("/girls/delete/{id}")
    public   void  delById(@PathVariable("id") Integer id )
    {
        girlRepository.deleteById(id);
    }

    @PostMapping("/girls/two")
    public  void  girlTwo(){
        girlService.insertTwo();

    }




}
