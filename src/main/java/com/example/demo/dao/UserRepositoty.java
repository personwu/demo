package com.example.demo.dao;

import com.example.demo.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepositoty extends JpaRepository<User,Long> {


    @Query("select t from User t where t.name = :name")
    User findByName(@Param("name") String name);




}
