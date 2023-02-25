package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String password;
    private String mobile;
@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
List<TripBooking> tripBookingList=new ArrayList<>();

    public Customer() {
    }

    public Customer(int customerId, String password, String mobile, List<TripBooking> tripBookingList) {
        this.customerId = customerId;
        this.password = password;
        this.mobile = mobile;
        this.tripBookingList = tripBookingList;
    }

    public Customer(int customerId, String password, String mobile) {
        this.customerId = customerId;
        this.password = password;
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }
}