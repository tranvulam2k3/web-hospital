package com.web.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.hospital.mapper.dbo.bookingMapper;

@Service
public class BookingService {

    @Autowired
    private bookingMapper bookingMapper;


}
