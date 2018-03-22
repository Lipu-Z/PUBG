package com.hundi.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author LZHONG
 * @package com.hundi.dao
 * @date 3/22/2018
 */
public interface UserDao {
    int addUser(String userId, String userpwd);

    String getPassord(String userId);

    String modifyPassword(String userId, String newpwd);

    String getPlayerId(String userId);

}
