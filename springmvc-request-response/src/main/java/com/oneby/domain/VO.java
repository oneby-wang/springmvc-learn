package com.oneby.domain;

import java.util.List;

/**
 * @ClassName VO
 * @Description TODO
 * @Author Oneby
 * @Date 2021/3/8 18:38
 * @Version 1.0
 */
public class VO {

    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }

}
