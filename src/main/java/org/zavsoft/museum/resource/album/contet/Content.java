package org.zavsoft.museum.resource.album.contet;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public abstract class Content {

    @Id
    private Long id;
}
