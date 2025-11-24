package com.example.demo.Candidat;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatService {

    private final CandidatRepository repository;

    public CandidatService(CandidatRepository repository) {
        this.repository = repository;
    }

    public List<CandidatModel> getAll() {
        return repository.findAll();
    }

    public CandidatModel getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public CandidatModel create(CandidatModel candidat) {
        return repository.save(candidat);
    }

    public CandidatModel update(Long id, CandidatModel candidat) {
        candidat.setId(id);
        return repository.save(candidat);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<CandidatModel> searchByName(String name) {
        return repository.findByNomCandidateArContainingIgnoreCase(name);
    }
}