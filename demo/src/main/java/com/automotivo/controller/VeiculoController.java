package com.automotivo.controller;

import com.automotivo.model.Veiculo;
import com.automotivo.enums.StatusVeiculo;
import com.automotivo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
@CrossOrigin(origins = "*")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping
    public List<Veiculo> listarTodos() {
        return veiculoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(veiculoService.buscarPorId(id));
    }

    @GetMapping("/filtros")
    public List<Veiculo> filtrar(
            @RequestParam(required = false) Long marcaId,
            @RequestParam(required = false) Long modeloId,
            @RequestParam(required = false) Double precoMin,
            @RequestParam(required = false) Double precoMax,
            @RequestParam(required = false) Integer ano,
            @RequestParam(required = false) StatusVeiculo status) {
        return veiculoService.filtrar(marcaId, modeloId, precoMin, precoMax, ano, status);
    }

    @PostMapping
    public ResponseEntity<Veiculo> criar(@RequestBody Veiculo veiculo) {
        Veiculo novoVeiculo = veiculoService.salvar(veiculo);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoVeiculo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> atualizar(@PathVariable Long id, @RequestBody Veiculo veiculo) {
        return ResponseEntity.ok(veiculoService.atualizar(id, veiculo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        veiculoService.removerLogico(id);
        return ResponseEntity.noContent().build();
    }
}