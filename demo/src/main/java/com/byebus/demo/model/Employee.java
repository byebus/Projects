package com.byebus.demo.model;
public class Employee {
    private Integer user_id ;
    private String user_name;
    private String user_surname;
    private String email;
    private String phone_no;

    /**
     * @return the user_id
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * @param user_name the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * @return the user_surname
     */
    public String getUser_surname() {
        return user_surname;
    }

    /**
     * @param user_surname the user_surname to set
     */
    public void setUser_surname(String user_surname) {
        this.user_surname = user_surname;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone_no
     */
    public String getPhoneNo() {
        return phone_no;
    }

    /**
     * @param phone_no the phone_no to set
     */
    public void setphone_no(String phone_no) {
        this.phone_no = phone_no;
    }
}
