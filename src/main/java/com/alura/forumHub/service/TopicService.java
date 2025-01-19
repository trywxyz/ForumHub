package com.alura.forumHub.service;

import com.alura.forumHub.model.Topic;
import com.alura.forumHub.repository.TopicRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;


@RestController
@RequestMapping("/topicos")
public class TopicService {

    @Autowired
    private TopicRepository repository;

    // Cadastro de um novo tópico
    @PostMapping
    public ResponseEntity<Topic> cadastrarTopico(@RequestBody @Valid Topic topico) {
        if (repository.findByTituloAndMensagem(topico.getTitulo(), topico.getMensagem()).isPresent()) {
            return ResponseEntity.status(400).body(null);
        }
        Topic savedTopico = repository.save(topico);
        return ResponseEntity.ok(savedTopico);
    }

    // Listagem de todos os tópicos
    @GetMapping
    public List<Topic> listarTopicos() {
        return repository.findAll();
    }

    // Detalhamento de um tópico
    @GetMapping("/{id}")
    public ResponseEntity<Topic> detalharTopic(@PathVariable String id) {
        return repository.findById(id)
                .map(topico -> ResponseEntity.ok(topico))
                .orElseGet(() -> ResponseEntity.status(404).body(null));
    }

    // Atualização de um tópico
    @PutMapping("/{id}")
    public ResponseEntity<Topic> atualizarTopic(@PathVariable String id, @RequestBody @Valid Topic topico) {
        return repository.findById(id)
                .map(existingTopic -> {
                    existingTopic.setTitulo(topico.getTitulo());
                    existingTopic.setMensagem(topico.getMensagem());
                    existingTopic.setAutor(topico.getAutor());
                    existingTopic.setCurso(topico.getCurso());
                    existingTopic.setStatus(topico.getStatus());
                    Topic updatedTopic = repository.save(existingTopic);
                    return ResponseEntity.ok(updatedTopic);
                })
                .orElseGet(() -> ResponseEntity.status(404).body(null));
    }

    // Exclusão de um tópico
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluirTopic(@PathVariable String id) {
        return repository.findById(id)
                .map(topico -> {
                    repository.deleteById(id);
                    return ResponseEntity.status(204).build();
                })
                .orElseGet(() -> ResponseEntity.status(404).build());
    }
}
