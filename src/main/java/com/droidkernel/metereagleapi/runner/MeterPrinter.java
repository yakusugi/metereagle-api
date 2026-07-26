package com.droidkernel.metereagleapi.runner;

import com.droidkernel.metereagleapi.entity.Meter;
import com.droidkernel.metereagleapi.repository.MeterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component   // tells Spring to manage this class and run it
public class MeterPrinter implements CommandLineRunner {

    private final MeterRepository repo;

    // same constructor-injection you already used in your controller
    public MeterPrinter(MeterRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {
        System.out.println("=== METERS IN DATABASE ===");

        List<Meter> meters = repo.findAll();          // fetch all rows

        System.out.println("Found " + meters.size() + " meter(s):");

        for (Meter m : meters) {                      // loop each row
            System.out.println(
                    m.getName() + " | " +
                            m.getType() + " | " +
                            m.getUnit()
            );
        }

        System.out.println("=========================");
    }
}
