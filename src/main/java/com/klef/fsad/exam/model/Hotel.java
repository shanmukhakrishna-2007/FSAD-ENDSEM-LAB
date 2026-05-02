package com.klef.fsad.exam.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="hotel_table")
public class Hotel {

    @Id
    private int hotelId;   // manual ID

    private String name;
    private LocalDate date;
    private String status;
    private String location;
    private double price;

    // getters & setters
    public int getHotelId() { return hotelId; }
    public void setHotelId(int hotelId) { this.hotelId = hotelId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}