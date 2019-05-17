package com.yunding.dao.entities;

import java.io.Serializable;

/**
 * user
 * @author 
 */
public class UserExtend extends User implements Serializable {
    private String userFans;

    private String userConcern;

    private String userFavorite;

    private static final long serialVersionUID = 1L;

    public String getUserFans() {
        return userFans;
    }

    public void setUserFans(String userFans) {
        this.userFans = userFans;
    }

    public String getUserConcern() {
        return userConcern;
    }

    public void setUserConcern(String userConcern) {
        this.userConcern = userConcern;
    }

    public String getUserFavorite() {
        return userFavorite;
    }

    public void setUserFavorite(String userFavorite) {
        this.userFavorite = userFavorite;
    }
}