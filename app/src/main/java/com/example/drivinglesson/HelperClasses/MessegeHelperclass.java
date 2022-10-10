package com.example.drivinglesson.HelperClasses;

public class MessegeHelperclass {
    String Name;
    String Email;
    String Age;
    String Gender;
    String Mobile;
    String Online;
    String Offline;

    public MessegeHelperclass(String name, String email, String age, String gender, String mobile, String online, String offline) {
        Name = name;
        Email = email;
        Age = age;
        Gender = gender;
        Mobile = mobile;
        Online = online;
        Offline = offline;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getOnline() {
        return Online;
    }

    public void setOnline(String online) {
        Online = online;
    }

    public String getOffline() {
        return Offline;
    }

    public void setOffline(String offline) {
        Offline = offline;
    }
}
