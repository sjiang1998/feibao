package cn.gzcc.feibao.controller;


import cn.gzcc.feibao.entity.Order_A;
import cn.gzcc.feibao.repository.AorderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AorderController {

    @Autowired
    private AorderRepository aorderRepository;


    @RequestMapping("/arders")
    @ResponseBody
    public List<Order_A> getAll(){
        List<Order_A> order_a=(List<Order_A>) aorderRepository.findAll();
        return order_a;
    }

    @RequestMapping("/arders/delete/{id}")
    @ResponseBody
    public boolean deletById(@PathVariable int id){
        aorderRepository.deleteById(id);
        return true;
    }


    @RequestMapping("/arders/create")
    @ResponseBody
    public String create(Order_A order_a){
        aorderRepository.save(order_a);
        return "success";
    }

}
