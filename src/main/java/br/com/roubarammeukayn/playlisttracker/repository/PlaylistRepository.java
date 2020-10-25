package br.com.roubarammeukayn.playlisttracker.repository;

import br.com.roubarammeukayn.playlisttracker.entity.PlaylistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends JpaRepository<PlaylistEntity, Long> {
}
