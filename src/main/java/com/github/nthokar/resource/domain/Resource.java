package com.github.nthokar.resource.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;

@Entity
public abstract class Resource implements ResourceApi {
    @Id
    private String id;
    @ManyToMany
    private Set<ResourceOwner> owners;
}
