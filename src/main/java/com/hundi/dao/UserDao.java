package com.hundi.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author LZHONG
 * @package com.hundi.dao
 * @date 3/22/2018
 */
public interface UserDao {
    int addUser(@Param("userID") String userID, @Param("userpwd") String userpwd);

    String getPassword(String userID);

    int modifyPassword(@Param("userID") String userID, @Param("newpwd") String newpwd);

    String getPlayerID(String userID);

}
