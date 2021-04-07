package com.li.mapper;

import com.li.interfaces.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author li
 * @create 2021-03-25 21:54
 */
@Mapper
public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(UserInfo userInfo);
    int insertSelective(UserInfo userInfo);
    UserInfo selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(UserInfo userInfo);
    int updateByPrimaryKey(UserInfo userInfo);
    int selectUserInfoByTotals();
    List<UserInfo> selectUserInfoByPage(@Param("startRow")Integer startRow,@Param("limit")Integer limit);



}
