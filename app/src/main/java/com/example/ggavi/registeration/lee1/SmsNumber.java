package com.example.ggavi.registeration.lee1;

public class SmsNumber{

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setSmsNum1(String smsNum1) {
        this.smsNum1 = smsNum1;
    }

    public String getNumsName() {
        return numsName;
    }

    public void setNumsName(String numsName) {
        this.numsName = numsName;
    }

    String numsName;
    String userID;

    public String getUserID() {
        return userID;
    }

    public String getSmsNum1() {
        return smsNum1;
    }

    String smsNum1;

   public SmsNumber(String userID, String smsNum1, String numsName){
       this.userID = userID;
       this.smsNum1 = smsNum1;
       this.numsName = numsName;

   }
}
