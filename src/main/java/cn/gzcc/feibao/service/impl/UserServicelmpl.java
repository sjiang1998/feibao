package cn.gzcc.feibao.service.impl;

import cn.gzcc.feibao.entity.User;
import cn.gzcc.feibao.repository.UserRepository;
import cn.gzcc.feibao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user){
        if (user.getUsername()!=null && user.getPassword()!=null){
            userRepository.save(user);
        }
        else{
            user=null;
        }
        return user;
    }

}
