package cn.gzcc.feibao.dao;

import cn.gzcc.feibao.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserJpa extends JpaRepository<User,String>{

    @Query("from User where username=:name")
    List<User> findUserByName(@Param("name")String name);
}
