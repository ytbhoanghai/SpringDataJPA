package com.nguyen.mapping.service;

import com.nguyen.mapping.entity.Guest;
import com.nguyen.mapping.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service(value = "guestService")
public class GuestServiceImpl implements GuestService {

    private GuestRepository repository;

    public GuestServiceImpl(@Autowired GuestRepository repository) {
        this.repository = repository;
    }

    @Override
    public Guest findById(Integer id) {
        Optional<Guest> optionalGuest = repository.findById(id);
        return optionalGuest.orElse(null);
    }
}
