package com.yunding.dao.entities;

import java.io.Serializable;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    private String userId;

    private String userEmail;

    private String userPassword;

    private Integer userPieces;

    private String userSignature;

    private String userHeadShot;

    private Integer userPopularity;

    private String userName;

    private String userBirthday;

    private String userSex;

    private String userCareer;

    private String userPlace;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserPieces() {
        return userPieces;
    }

    public void setUserPieces(Integer userPieces) {
        this.userPieces = userPieces;
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature;
    }

    public String getUserHeadShot() {
        return userHeadShot;
    }

    public void setUserHeadShot(String userHeadShot) {
        this.userHeadShot = userHeadShot;
    }

    public Integer getUserPopularity() {
        return userPopularity;
    }

    public void setUserPopularity(Integer userPopularity) {
        this.userPopularity = userPopularity;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserCareer() {
        return userCareer;
    }

    public void setUserCareer(String userCareer) {
        this.userCareer = userCareer;
    }

    public String getUserPlace() {
        return userPlace;
    }

    public void setUserPlace(String userPlace) {
        this.userPlace = userPlace;
    }
}