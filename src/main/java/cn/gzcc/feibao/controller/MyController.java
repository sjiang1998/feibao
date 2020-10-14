package cn.gzcc.feibao.controller;

import cn.gzcc.feibao.entity.My;
import cn.gzcc.feibao.repository.MyReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class MyController {


        @Autowired
        private MyReposity myReposity;

        @RequestMapping("/myorder")
        @ResponseBody
        public List<My> getAll() {
            List<My> my = (List<My>) myReposity.findAll();
            return my;
        }

        @RequestMapping("/myorder/delete/{id}")
        @ResponseBody
        public boolean deletById(@PathVariable int id) {
            myReposity.deleteById(id);
            return true;
        }


        @RequestMapping("/myorder/create")
        @ResponseBody
        public String create(My my) {
            myReposity.save(my);
            return "success";
        }

}
