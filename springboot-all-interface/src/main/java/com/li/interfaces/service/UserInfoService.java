package com.li.interfaces.service;

import com.li.interfaces.model.UserInfo;

import java.util.List;

/**
 * @author li
 * @create 2021-03-23 23:07
 */
public interface UserInfoService {
    public int addUserInfo(UserInfo userInfo);

    public int deleteUserInfoById(Integer id);

    public int updateUserInfo(UserInfo userInfo);

    public UserInfo getUserInfoById(Integer id);

    public List<UserInfo> getUserInfoByPage(Integer startRow, Integer limit);

    public int getUserInfoByTotals();
}
