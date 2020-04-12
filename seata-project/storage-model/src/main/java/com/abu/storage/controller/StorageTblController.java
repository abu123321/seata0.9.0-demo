package com.abu.storage.controller;



import com.abu.storage.pojo.Storage;
import com.abu.storage.service.StorageTblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/storage")
public class StorageTblController {

    @Autowired
    private StorageTblService orderService;

    @PostMapping("insert")
    public void save(@RequestBody Storage storage) {
        this.orderService.save(storage);
    }
}

