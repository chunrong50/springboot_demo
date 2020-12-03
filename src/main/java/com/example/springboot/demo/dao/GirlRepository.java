package com.example.springboot.demo.dao;

import com.example.springboot.demo.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface GirlRepository  extends JpaRepository<Girl,Integer> {

    List<Girl> findByAge(Integer age);
}
