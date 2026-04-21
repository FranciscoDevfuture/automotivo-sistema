package com.automotivo.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "marcas")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    private String paisOrigem;

    @OneToMany(mappedBy = "marca")
    private List<Modelo> modelos = new ArrayList<>();

    public Marca() {}

    public Marca(String nome, String paisOrigem) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getPaisOrigem() { return paisOrigem; }
    public void setPaisOrigem(String paisOrigem) { this.paisOrigem = paisOrigem; }
    public List<Modelo> getModelos() { return modelos; }
    public void setModelos(List<Modelo> modelos) { this.modelos = modelos; }
}