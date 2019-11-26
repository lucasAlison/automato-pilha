/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatopilha.dto;

/**
 *
 * @author Lucas Alison de Lima
 */
public class Transicao {
    
    private Estado estadoAtual;
    private String entrada;
    private String valorPilha;
    private String valorEntradaPilha;
    private Estado proximoEstado;

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getValorPilha() {
        return valorPilha;
    }

    public void setValorPilha(String valorPilha) {
        this.valorPilha = valorPilha;
    }

    public String getValorEntradaPilha() {
        return valorEntradaPilha;
    }

    public void setValorEntradaPilha(String valorEntradaPilha) {
        this.valorEntradaPilha = valorEntradaPilha;
    }

    public Estado getProximoEstado() {
        return proximoEstado;
    }

    public void setProximoEstado(Estado proximoEstado) {
        this.proximoEstado = proximoEstado;
    }

    public Estado getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(Estado estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
    
}
