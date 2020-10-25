package br.com.roubarammeukayn.playlisttracker.domain;

import java.util.List;

public interface PlaylistTrackerRepositoryInterface {
    Playlist save(Playlist playlist);
    Playlist findById(Long playlistId);
    List<Playlist> findAll();
    void deleteById(Playlist playlist);
}
