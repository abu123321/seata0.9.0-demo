package com.abu.order.service.impl;

import com.abu.order.pojo.Order;
import com.abu.order.mapper.OrderTblMapper;
import com.abu.order.service.OrderTblService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 阿布
 * @since 2020-04-12
 */
@Service
public class OrderTblServiceImpl extends ServiceImpl<OrderTblMapper, Order> implements OrderTblService {

}
