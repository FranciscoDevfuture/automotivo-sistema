package com.automotivo.model;

import com.automotivo.enums.StatusVeiculo;
import jakarta.persistence.*;

@Entity
@Table(name = "veiculos")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String placa;

    @ManyToOne
    @JoinColumn(name = "modelo_id", nullable = false)
    private Modelo modelo;

    private int anoFabricacao;
    private String cor;
    private double preco;
    private int quilometragem;

    @Enumerated(EnumType.STRING)
    private StatusVeiculo status;

    public Veiculo() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
    public Modelo getModelo() { return modelo; }
    public void setModelo(Modelo modelo) { this.modelo = modelo; }
    public int getAnoFabricacao() { return anoFabricacao; }
    public void setAnoFabricacao(int anoFabricacao) { this.anoFabricacao = anoFabricacao; }
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public int getQuilometragem() { return quilometragem; }
    public void setQuilometragem(int quilometragem) { this.quilometragem = quilometragem; }
    public StatusVeiculo getStatus() { return status; }
    public void setStatus(StatusVeiculo status) { this.status = status; }
}