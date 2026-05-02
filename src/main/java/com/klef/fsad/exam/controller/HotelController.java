package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.klef.fsad.exam.model.Hotel;
import com.klef.fsad.exam.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService service;

    @PostMapping("/add")
    public Hotel addHotel(@RequestBody Hotel h) {
        return service.addHotel(h);
    }

    @GetMapping("/{id}")
    public Hotel getHotel(@PathVariable int id) {
        return service.getHotel(id);
    }

    @GetMapping("/all")
    public List<Hotel> getAllHotels() {
        return service.getAllHotels();
    }

    @PutMapping("/update/{id}")
    public Hotel updateHotel(@PathVariable int id, @RequestBody Hotel h) {
        return service.updateHotel(id, h);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteHotel(@PathVariable int id) {
        return service.deleteHotel(id);
    }
}