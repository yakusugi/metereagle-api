package com.droidkernel.metereagleapi.controller;

import com.droidkernel.metereagleapi.entity.Meter;
import com.droidkernel.metereagleapi.repository.MeterRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/meters")
public class MeterController {

    private final MeterRepository repo;

    public MeterController(MeterRepository repo) {
        this.repo = repo;   // Spring injects the repository automatically
    }

    @GetMapping                              // GET /products
    public List<Meter> listAll() {
        return repo.findAll();
    }

    @PostMapping                             // POST /products
    public Meter create(@RequestBody Meter meter) {
        return repo.save(meter);
    }

}
