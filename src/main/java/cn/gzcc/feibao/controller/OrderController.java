package cn.gzcc.feibao.controller;


import cn.gzcc.feibao.entity.Order_C;
import cn.gzcc.feibao.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @RequestMapping("/orders")
    @ResponseBody
    public List<Order_C> getAll(){

        try{
        List<Order_C> orders =(List<Order_C>) orderRepository.findAll();
        return orders;}catch(Exception e){
            return  null;
        }
    }

    @RequestMapping("/orders/delete/{id}")
    @ResponseBody
    public boolean deletById(@PathVariable int id){
        orderRepository.deleteById(id);
        return true;
    }


    @RequestMapping("/orders/create")
    @ResponseBody
    public String create(Order_C orderC){
        orderRepository.save(orderC);
        return "success";
    }







}
