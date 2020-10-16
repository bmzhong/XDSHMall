package com.reservation.bean;

public class Clerk {
    private Integer clerkId;

    private String clearkName;

    private String clearkPassword;

    private String clerkEmail;

    private String clerkPhone;

    public Integer getClerkId() {
        return clerkId;
    }

    public void setClerkId(Integer clerkId) {
        this.clerkId = clerkId;
    }

    public String getClearkName() {
        return clearkName;
    }

    public void setClearkName(String clearkName) {
        this.clearkName = clearkName == null ? null : clearkName.trim();
    }

    public String getClearkPassword() {
        return clearkPassword;
    }

    public void setClearkPassword(String clearkPassword) {
        this.clearkPassword = clearkPassword == null ? null : clearkPassword.trim();
    }

    public String getClerkEmail() {
        return clerkEmail;
    }

    public void setClerkEmail(String clerkEmail) {
        this.clerkEmail = clerkEmail == null ? null : clerkEmail.trim();
    }

    public String getClerkPhone() {
        return clerkPhone;
    }

    public void setClerkPhone(String clerkPhone) {
        this.clerkPhone = clerkPhone == null ? null : clerkPhone.trim();
    }
}