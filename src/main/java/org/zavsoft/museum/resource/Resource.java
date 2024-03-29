package org.zavsoft.museum.resource;

import java.util.Set;

public abstract class Resource implements ResourceApi {
    private String id;
    private String name;
    private Set<ResourceOwner> owners;
}
