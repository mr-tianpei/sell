package com.sell.modules.sys.dao;

import com.sell.modules.store.entity.Feedback;
import com.sell.modules.sys.entity.Role;
import com.sell.modules.sys.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);
    int insertFeedback(Feedback feedback);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    User selectByUsername(String username);
    List<Role> selectRoleByUsername(String username);
    List<User> selectUserList();

    /**
     * 添加普通用户的角色给用户
     */
    int insertCustomerRole(String userId);
    int updateByPrimaryKey(User record);
    int checkUsername(String username);
    int checkMobile(String mobile);
    User selectLogin(@Param("username")String username,@Param("password")String password);
    int updatePasswordByUsername(@Param("username")String username,@Param("password")String password);
    int checkPassword(@Param("password")String password,@Param("userId")String userId);
    String selectUsernameByMobile(String phone);
}