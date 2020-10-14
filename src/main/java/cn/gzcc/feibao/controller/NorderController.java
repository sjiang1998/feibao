package cn.gzcc.feibao.controller;


import cn.gzcc.feibao.entity.Order_N;
import cn.gzcc.feibao.repository.NorderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NorderController {

    @Autowired
    private NorderRepository norderRepository;

    @RequestMapping("/nrders")
    @ResponseBody
    public List<Order_N> getAll(){
        List<Order_N> order_n=(List<Order_N>) norderRepository.findAll();
        return order_n;
    }

    @RequestMapping("/nrders/delete/{id}")
    @ResponseBody
    public boolean deletById(@PathVariable int id){
        norderRepository.deleteById(id);
        return true;
    }


    @RequestMapping("/nrders/create")
    @ResponseBody
    public String create(Order_N order_a){
        norderRepository.save(order_a);
        return "success";
    }




}
