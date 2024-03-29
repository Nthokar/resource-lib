package org.zavsoft.museum.resource.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public abstract class ResourceOwner {
    @Id
    private String id;
    @OneToMany
    Set<Permission> permissions;
}
