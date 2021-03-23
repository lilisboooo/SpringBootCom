package com.li.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.li.interfaces.model.UserInfo;
import com.li.interfaces.service.UserInfoService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author li
 * @create 2021-03-23 22:54
 */
@Component
@Service(timeout = 10000,interfaceClass = UserInfoService.class)
public class UserInfoServiceImpl implements UserInfoService{
    @Override
    public int addUserInfo(UserInfo userInfo) {
        return 0;
    }

    @Override
    public int deleteUserInfoById(Integer id) {
        return 0;
    }

    @Override
    public int updateUserInfo(UserInfo userInfo) {
        return 0;
    }

    @Override
    public UserInfo getUserInfoById(Integer id) {
        return null;
    }

    @Override
    public List<UserInfo> getUserInfoByPage(Integer startRow, Integer limit) {
        return null;
    }

    @Override
    public int getUserInfoByTotals() {
        return 0;
    }
}
