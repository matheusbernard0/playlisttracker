package br.com.roubarammeukayn.playlisttracker.repository;

import br.com.roubarammeukayn.playlisttracker.domain.Playlist;
import br.com.roubarammeukayn.playlisttracker.domain.PlaylistTrackerRepositoryInterface;
import br.com.roubarammeukayn.playlisttracker.entity.PlaylistEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlaylistRepositoryImpl implements PlaylistTrackerRepositoryInterface {

    private PlaylistRepository repository;

    @Autowired
    public PlaylistRepositoryImpl(PlaylistRepository repository) {
        this.repository = repository;
    }

    @Override
    public Playlist save(Playlist playlist) {
        final PlaylistEntity entity = new PlaylistEntity();
        entity.setUrl(playlist.getUrl());
        final PlaylistEntity save = this.repository.save(entity);
        return playlist;
    }

    @Override
    public Playlist findById(Long playlistId) {
        return null;
    }

    @Override
    public List<Playlist> findAll() {
        return null;
    }

    @Override
    public void deleteById(Playlist playlist) {

    }
}
