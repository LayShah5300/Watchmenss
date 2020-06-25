package com.example.watchmenss;
/**
 * Created by ad on 08/06/2020.
 */

public class UserModel {

    boolean isSelected;
    String username;

    public UserModel(boolean isSelected, String username) {
        this.isSelected = isSelected;
        this.username = username;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}