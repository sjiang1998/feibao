package cn.gzcc.feibao.controller;


import cn.gzcc.feibao.entity.Courier;
import cn.gzcc.feibao.repository.CourierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CourierController {

    @Autowired
    private CourierRepository courierRepository;

    @RequestMapping("/courier")
    @ResponseBody
    public List<Courier> getAll(){
        List<Courier> couriers=(List<Courier>) courierRepository.findAll();
        return couriers;
    }

    @RequestMapping("/courier/delete/{id}")
    @ResponseBody
    public boolean deleteById(@PathVariable int id){
        courierRepository.deleteById(id);
        return true;
    }


    @RequestMapping("/courier/create")
    @ResponseBody
    public String create(Courier courier){
        courierRepository.save(courier);
        return "success";
    }
}
