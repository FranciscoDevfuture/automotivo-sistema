package com.automotivo.service;

import com.automotivo.model.Veiculo;
import com.automotivo.enums.StatusVeiculo;
import com.automotivo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.Year;
import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> listarTodos() {
        return veiculoRepository.findAll();
    }

    public Veiculo buscarPorId(Long id) {
        return veiculoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado"));
    }

    @Transactional
    public Veiculo salvar(Veiculo veiculo) {
        if (veiculo.getAnoFabricacao() > Year.now().getValue()) {
            throw new IllegalArgumentException("Ano não pode ser futuro");
        }
        if (veiculo.getPreco() <= 0) {
            throw new IllegalArgumentException("Preço deve ser positivo");
        }
        if (veiculo.getStatus() == null) {
            veiculo.setStatus(StatusVeiculo.DISPONIVEL);
        }
        return veiculoRepository.save(veiculo);
    }

    @Transactional
    public Veiculo atualizar(Long id, Veiculo veiculoAtualizado) {
        Veiculo veiculo = buscarPorId(id);
        veiculo.setPlaca(veiculoAtualizado.getPlaca());
        veiculo.setModelo(veiculoAtualizado.getModelo());
        veiculo.setAnoFabricacao(veiculoAtualizado.getAnoFabricacao());
        veiculo.setCor(veiculoAtualizado.getCor());
        veiculo.setPreco(veiculoAtualizado.getPreco());
        veiculo.setQuilometragem(veiculoAtualizado.getQuilometragem());
        veiculo.setStatus(veiculoAtualizado.getStatus());
        return veiculoRepository.save(veiculo);
    }

    @Transactional
    public void removerLogico(Long id) {
        Veiculo veiculo = buscarPorId(id);
        veiculo.setStatus(StatusVeiculo.INATIVO);
        veiculoRepository.save(veiculo);
    }

    public List<Veiculo> filtrar(Long marcaId, Long modeloId, Double precoMin,
                                 Double precoMax, Integer ano, StatusVeiculo status) {
        return veiculoRepository.filtrar(marcaId, modeloId, precoMin, precoMax, ano, status);
    }
}