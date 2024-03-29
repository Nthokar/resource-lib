package org.zavsoft.museum.album;

import org.zavsoft.museum.resource.Resource;
import org.zavsoft.museum.resource.ResourceOwner;

import java.util.List;
import java.util.function.Predicate;

public class Album extends Resource implements AlbumApi {
    List<Content> contents;

    @Override
    public List<Content> getContent(ResourceOwner owner) {
        if (isAllowed(Permission.READ, owner)) {
            return List.copyOf(contents);
        }
        else {
            throw new RuntimeException();
        }
    }

    @Override
    public List<Content> getContent(ResourceOwner owner, Predicate<Content> predicate) {
        return contents.stream().filter(predicate).toList();
    }

    @Override
    public void addContent(ResourceOwner owner, Content content) {
        contents.add(content);
    }

    @Override
    public void deleteContent(ResourceOwner owner, Content content) {
        contents.remove(content);
    }
}
