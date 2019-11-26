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
public class Estado {
    
    private boolean ehFinal;
    private String nome;

    public boolean isEhFinal() {
        return ehFinal;
    }

    public void setEhFinal(boolean ehFinal) {
        this.ehFinal = ehFinal;
    }      

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
