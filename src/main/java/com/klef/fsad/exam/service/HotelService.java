package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.klef.fsad.exam.model.Hotel;
import com.klef.fsad.exam.repository.HotelRepository;

@Service
public class HotelService {

    @Autowired
    private HotelRepository repo;

    public Hotel addHotel(Hotel h) {
        if(h.getHotelId() == 0)
            throw new RuntimeException("ID required");
        return repo.save(h);
    }

    public Hotel updateHotel(int id, Hotel h) {
        Optional<Hotel> obj = repo.findById(id);

        if(obj.isPresent()) {
            Hotel x = obj.get();
            x.setName(h.getName());
            x.setDate(h.getDate());
            x.setStatus(h.getStatus());
            x.setLocation(h.getLocation());
            x.setPrice(h.getPrice());
            return repo.save(x);
        }
        else {
            throw new RuntimeException("Not Found");
        }
    }
}