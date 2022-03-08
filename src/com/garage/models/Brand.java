package com.garage.models;

import java.time.LocalDateTime;

public class Brand {

    private String name;
    private LocalDateTime createAt;

    public Brand(String name, LocalDateTime createAt) {
        this.name = name;
        this.createAt = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
}
