package com.github.nthokar.resource.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public interface Permission {
    @Id
    String getId();
}
