package com.alura.forumHub.repository;

import com.alura.forumHub.model.Topic;
import com.alura.forumHub.model.TopicDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.Optional;

public interface TopicRepository extends JpaRepository<Topic, String> {
    Optional<Topic> findByTituloAndMensagem(String titulo, String mensagem);
}
