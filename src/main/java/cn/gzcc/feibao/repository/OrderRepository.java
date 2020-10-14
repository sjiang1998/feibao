package cn.gzcc.feibao.repository;

import cn.gzcc.feibao.entity.Order_C;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order_C,Integer> {
}
