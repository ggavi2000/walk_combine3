package com.example.ggavi.registeration.lee2;

public class BTSmsNumber {
    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setSmsNum1(String smsNum1) {
        this.smsNum1 = smsNum1;
    }

    private String numsName;

    public String getNumsName() {
        return numsName;
    }

    public void setNumsName(String numsName) {
        this.numsName = numsName;
    }

    private String userID;

    public String getUserID() {
        return userID;
    }

    public String getSmsNum1() {
        return smsNum1;
    }

    private String smsNum1;

    public BTSmsNumber(String userID, String smsNum1, String numsName){
        this.userID = userID;
        this.smsNum1 = smsNum1;
        this.numsName = numsName;
    }

}
