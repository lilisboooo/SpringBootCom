package com.li.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.li.interfaces.service.UserInfoService;
import org.springframework.stereotype.Controller;

/**
 * @author li
 * @create 2021-03-23 22:04
 */
@Controller
public class UserInfoController {
    //引用远程dubbo服务
    @Reference
    private UserInfoService userInfoService;
    /**
     * RestFull原则：
     * 1、请求路径中建议不要使用动词，用名词 ,比如添加用户/api/adduser有动词, 应该用/api/user
     *    动词在请求方法中体现：4种请求方法 @PostMapping
     *
     * 2、不同请求应该采用不同的请求方法，
     *    新增操作使用@PostMapping，修改@PutMapping, 删除@DeleteMapping，查询@GetMapping
     *
     * 3、如果是对数据过滤、排序、分页等操作，使用 ?参数名=xxx 的方式, 不是所有的参数都是用斜杆/来请求
     *    http://localhost:8080/api/order?p=23&sort=asc
     *
     *
     * 说明：restFull风格主要是用来开发接口的，返回json数据，当然也可以用来跳转到页面（使用少一些）
     *
     * @return
     */

}
