package com.hundi.entity;

/**
 * @author LZHONG
 * @package com.hundi.entity
 * @date 3/22/2018
 */
public class User {
    private String userID;
    private String userPassword;
    private String userAlias;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserAlias() {
        return userAlias;
    }

    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias;
    }
}


