package com.droidkernel.metereagleapi.entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "meters")
public class Meter {
    @Id
    @GeneratedValue          // let the DB generate the id
    private UUID id;

    @Column(name = "org_id", nullable = false)
    private UUID orgId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String unit;

    @Column(nullable = false)
    private Integer int_digits;

    protected Meter() {};

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getOrgId() {
        return orgId;
    }

    public void setOrgId(UUID orgId) {
        this.orgId = orgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getInt_digits() {
        return int_digits;
    }

    public void setInt_digits(Integer int_digits) {
        this.int_digits = int_digits;
    }
}
