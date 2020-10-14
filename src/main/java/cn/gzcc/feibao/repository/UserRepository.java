package cn.gzcc.feibao.repository;

import cn.gzcc.feibao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
