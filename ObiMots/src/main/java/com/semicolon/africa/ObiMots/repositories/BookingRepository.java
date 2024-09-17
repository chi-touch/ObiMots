package com.semicolon.africa.ObiMots.repositories;

import com.semicolon.africa.ObiMots.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Address, Long> {
}
