/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatopilha.dto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Lucas Alison de Lima
 */
public class Automato {
    
    private List<Estado> estados;
    private List<String> alfabeto;
    private List<String> alfabetoPilha;
    private Estado estadoInicial;
    private String simboloInicialPilha;
    private Estado estadoAtual;
    private LinkedList<String> pilha;

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }
    
    public void addEstado(Estado estado){
        if (this.estados == null)
            this.estados = new ArrayList<>();
        this.estados.add(estado);
    }

    public void addAlfabeto(String s){
        if (this.alfabeto == null)
            this.alfabeto = new ArrayList<>();
        this.alfabeto.add(s);
    }
    
    public void addAlfabetoPilha(String s){
        if (this.alfabetoPilha == null)
            this.alfabetoPilha = new ArrayList<>();
        this.alfabetoPilha.add(s);
    }
    
    public List<String> getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(List<String> alfabeto) {
        this.alfabeto = alfabeto;
    }

    public List<String> getAlfabetoPilha() {
        return alfabetoPilha;
    }

    public void setAlfabetoPilha(List<String> alfabetoPilha) {
        this.alfabetoPilha = alfabetoPilha;
    }

    public Estado getEstadoInicial() {
        return estadoInicial;
    }

    public void setEstadoInicial(Estado estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public String getSimboloInicialPilha() {
        return simboloInicialPilha;
    }

    public void setSimboloInicialPilha(String simboloInicialPilha) {
        this.simboloInicialPilha = simboloInicialPilha;
    }

    public Estado getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(Estado estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
    
    public Estado buscarEstadoPorNome(String nome){ 
        if (this.estados == null)
            return null;
        for (Estado estado : this.estados) {
            if (estado.getNome().equals(nome)){
                return estado;
            }
        }
        return null;
    }
    
    public String buscarAlfabetoPorValor(String valor){ 
        if (this.alfabeto == null)
            return null;
        for (String a : this.alfabeto) {
            if (a.equals(valor)){
                return a;
            }
        }
        return null;
    }
    
    public String buscarSimboloPilhaPorValor(String valor){ 
        if (this.alfabetoPilha == null)
            return null;
        for (String a : this.alfabetoPilha) {
            if (a.equals(valor)){
                return a;
            }
        }
        return null;
    }

    public LinkedList<String> getPilha() {
        return pilha;
    }

    public void setPilha(LinkedList<String> pilha) {
        this.pilha = pilha;
    }
    
    public void addValorPilha(String s){
        if (this.pilha == null)
            this.pilha = new LinkedList<>();
        this.pilha.add(s);
    }
    
    public String topoPilha(){
        return pilha.get(pilha.size()-1);
    }
    
    public void removerTopo(){
        pilha.remove(pilha.size()-1);
    }
    
    public int posicaoTopo(){
        return pilha.size();
    }
    
}
