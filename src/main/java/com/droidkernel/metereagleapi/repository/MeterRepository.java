package com.droidkernel.metereagleapi.repository;

import com.droidkernel.metereagleapi.entity.Meter;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface MeterRepository extends JpaRepository<Meter, UUID> {
    // That's it. You get save(), findAll(), findById(), delete() for FREE.
}
