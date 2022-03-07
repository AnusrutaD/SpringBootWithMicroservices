package com.user.user_service.entity;

public class Contact {
    private Long cId;
    private String email;
    private String contactNumber;

    private Long userId;

    public Contact(Long cId, String email, String contactNumber, Long userId) {
        this.cId = cId;
        this.email = email;
        this.contactNumber = contactNumber;
        this.userId = userId;
    }

    public Contact() {
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
