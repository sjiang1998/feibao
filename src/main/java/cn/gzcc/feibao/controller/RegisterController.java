package cn.gzcc.feibao.controller;


import cn.gzcc.feibao.entity.Registers;
import cn.gzcc.feibao.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RegisterController {

    @Autowired
    private RegisterRepository registerRepository;

    @RequestMapping("/register")
    @ResponseBody
    public List<Registers> getAll(){
        List<Registers> registers=(List<Registers>) registerRepository.findAll();
        return registers;
    }


    @RequestMapping("/register/delete/{id}")
    @ResponseBody
    public boolean deletById(@PathVariable int id){
        registerRepository.deleteById(id);
        return true;
    }


    @RequestMapping("/register/create")
    @ResponseBody
    public String create(Registers registers){
        registerRepository.save(registers);
        return "success";
    }

}
