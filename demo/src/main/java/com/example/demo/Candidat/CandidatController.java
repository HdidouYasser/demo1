package com.example.demo.Candidat;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidats")
@CrossOrigin("*")
public class CandidatController {

    private final CandidatService service;

    public CandidatController(CandidatService service) {
        this.service = service;
    }

    @GetMapping
    public List<CandidatModel> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public CandidatModel getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public CandidatModel create(@RequestBody CandidatModel candidat) {
        return service.create(candidat);
    }

    @PutMapping("/{id}")
    public CandidatModel update(@PathVariable Long id, @RequestBody CandidatModel candidat) {
        return service.update(id, candidat);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/search")
    public List<CandidatModel> searchByName(@RequestParam String name) {
        return service.searchByName(name);
    }
}