package com.automotivo.repository;

import com.automotivo.model.Veiculo;
import com.automotivo.enums.StatusVeiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    List<Veiculo> findByStatus(StatusVeiculo status);

    @Query("SELECT v FROM Veiculo v WHERE " +
            "(:marcaId IS NULL OR v.modelo.marca.id = :marcaId) AND " +
            "(:modeloId IS NULL OR v.modelo.id = :modeloId) AND " +
            "(:precoMin IS NULL OR v.preco >= :precoMin) AND " +
            "(:precoMax IS NULL OR v.preco <= :precoMax) AND " +
            "(:ano IS NULL OR v.anoFabricacao = :ano) AND " +
            "(:status IS NULL OR v.status = :status)")
    List<Veiculo> filtrar(@Param("marcaId") Long marcaId,
                          @Param("modeloId") Long modeloId,
                          @Param("precoMin") Double precoMin,
                          @Param("precoMax") Double precoMax,
                          @Param("ano") Integer ano,
                          @Param("status") StatusVeiculo status);
}