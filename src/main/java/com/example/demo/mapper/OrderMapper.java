/*
* 永旺数字科技有限公司版权所有.
*/

package com.example.demo.mapper;


import com.example.demo.mapper.domain.OrderDomain;
import org.apache.ibatis.annotations.Mapper;

/**
 * Mapper接口
 *
 * @author 今天例外
 * @version 1.0.0
 * @date 2021-04-07
 */
@Mapper
public interface OrderMapper {

    void save(OrderDomain orderDomain);

}