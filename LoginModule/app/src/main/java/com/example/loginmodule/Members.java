package com.example.loginmodule;

public class Members {
    private String snum;
    private String fname;
    private String mname;
    private String lname;
    private Integer year;
    private Integer section;
    private String email;
    private Long mobilenum;
    private String bday;
    private String contactperson;
    private Long contactnum;
    private String address;
    private String membership_status = "Pending";


    public Members() {
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSection() {
        return section;
    }

    public void setSection(Integer section) {
        this.section = section;
    }

    public String getMembership_status() {
        return membership_status;
    }

    public void setMembership_status(String membership_status) {
        this.membership_status = membership_status;
    }
    public String getSnum() {
        return snum;
    }

    public void setSnum(String snum) {
        this.snum = snum;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobilenum() {
        return mobilenum;
    }

    public void setMobilenum(Long mobilenum) {
        this.mobilenum = mobilenum;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }


    public Long getContactnum() {
        return contactnum;
    }

        public void setContactnum(Long contactnum) {
        this.contactnum = contactnum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
