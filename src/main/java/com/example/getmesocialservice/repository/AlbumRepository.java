package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {

    List<Album> albumList = new ArrayList();

    public List<Album> getAllAlbums() {
        return albumList;
    }

    public Album getAlbumById(int albumId) {
        for(Album album:albumList){
            if(album.getAlbumId() == albumId){
                return album;
            }
        }
        return null;
    }

    public Album saveAlbum(Album album) {
        albumList.add(album);
        return album;
    }

    public Album updateAlbum(int albumId, Album album) {
        for(Album a:albumList){
            if(a.getAlbumId()==albumId){
                a.setName(album.getName());
                a.setCoverPicUrl(album.getCoverPicUrl());
                a.setDescription(album.getDescription());
                return a;
            }
        }
        return null;
    }

    public Album deleteUser(int albumId) {
        Album deletedAlbum = null;
        for(Album a:albumList){
            if(a.getAlbumId() ==albumId){
                deletedAlbum = a;
                albumList.remove(deletedAlbum);
                return deletedAlbum;
            }
        }
        return deletedAlbum;
    }
}
