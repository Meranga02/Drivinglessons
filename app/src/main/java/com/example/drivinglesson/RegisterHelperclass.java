package com.example.drivinglesson;

public class RegisterHelperclass {
    String userName;
    String Password ;
    String RetypePassword;
    String Address;
    String City;
    String MobileNumber;
    String Addinonal;

    public RegisterHelperclass(String userName, String password, String retypePassword, String address, String city, String mobileNumber, String addinonal) {
        this.userName = userName;
        Password = password;
        RetypePassword = retypePassword;
        Address = address;
        City = city;
        MobileNumber = mobileNumber;
        Addinonal = addinonal;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRetypePassword() {
        return RetypePassword;
    }

    public void setRetypePassword(String retypePassword) {
        RetypePassword = retypePassword;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getAddinonal() {
        return Addinonal;
    }

    public void setAddinonal(String addinonal) {
        Addinonal = addinonal;
    }
}
