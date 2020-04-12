package com.abu.order.controller;


import com.abu.order.client.StorageClient;
import com.abu.order.pojo.Order;
import com.abu.order.service.OrderTblService;
import com.abu.storage.pojo.Storage;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 阿布
 * @since 2020-04-12
 */
@RestController
@RequestMapping("/order")
public class OrderTblController {

    @Autowired
    private OrderTblService orderservice;

    @Autowired
    private StorageClient storageClient;

    @PostMapping("insert")
    @GlobalTransactional
    public void createOrder(Order order) {
        this.orderservice.save(order);
        Storage storage = new Storage();
        storage.setCommodityCode("fsf");
        storage.setCount(1);
//        int a = 1 / 0;
        this.storageClient.save(storage);
    }
}

