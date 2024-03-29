package org.zavsoft.museum.album;

import org.zavsoft.museum.resource.Resource;
import org.zavsoft.museum.resource.ResourceApi;
import org.zavsoft.museum.resource.ResourceOwner;

import java.util.List;
import java.util.function.Predicate;

public interface AlbumApi extends ResourceApi {

    List<Content> getContent(ResourceOwner resourceOwner);
    List<Content> getContent(ResourceOwner resourceOwner, Predicate<Content> predicate);
    void addContent(ResourceOwner resourceOwner, Content content);
    void deleteContent(ResourceOwner resourceOwner, Content content);
}
