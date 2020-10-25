package br.com.roubarammeukayn.playlisttracker.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistTrackerService {
    private final PlaylistTrackerRepositoryInterface repository;

    @Autowired
    public PlaylistTrackerService(PlaylistTrackerRepositoryInterface repository){
        this.repository = repository;
    }

    public Playlist create(Playlist playlist) {
        return new Playlist();
    }

    public Playlist retrieve(Long playlistId) {
        return new Playlist();
    }

    public List<Playlist> retireveAll() {
        return null;
    }

    public void delete(Long playlistId) {
        return;
    }
}
