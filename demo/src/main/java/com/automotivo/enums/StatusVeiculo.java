package com.automotivo.enums;

public enum StatusVeiculo {
    DISPONIVEL("Disponível"),
    VENDIDO("Vendido"),
    INATIVO("Inativo");

    private String descricao;

    StatusVeiculo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}