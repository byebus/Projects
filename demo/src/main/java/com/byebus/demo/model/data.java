package com.byebus.demo.model;
public class data {
    private Integer user_id ;
    private String user_name;
    private String user_surname;
    private String email;
    private String phoneNo;
 
    /**
     * @return the empId
     */
    public Integer getEmpId() {
        return user_id;
    }
 
    /**
     * @param empId the empId to set
     */
    public void setEmpId(Integer empId) {
        this.user_id = empId;
    }
 
    /**
     * @return the empName
     */
    public String getEmpName() {
        return user_name;
    }
 
    /**
     * @param empName the empName to set
     */
    public void setEmpName(String empName) {
        this.user_name = empName;
    }
 
    /**
     * @return the designation
     */
    public String getDesignation() {
        return user_surname;
    }
 
    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.user_surname = designation;
    }
 
    /**
     * @return the address
     */
    public String getAddress() {
        return email;
    }
 
    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.email = address;
    }
 
    /**
     * @return the phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }
 
    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
