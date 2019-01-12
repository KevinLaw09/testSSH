package com.tiny.ssh.action;


import com.opensymphony.xwork2.ActionSupport;
import com.tiny.ssh.beans.UserForm;
import com.tiny.ssh.service.UserManager;
import com.tiny.ssh.serviceImp.UserManagerImpl;

public class RegisterAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private UserForm user;

    private UserManager userManager;

    public UserForm getUser() {
        return user;
    }

    public void setUser(UserForm user) {
        this.user = user;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public String execute() {
        try {
            this.setUserManager(new UserManagerImpl());
            userManager.regUser(user);
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

}
