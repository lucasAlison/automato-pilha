/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatopilha.dto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lucas Alison de Lima
 */
public class TableTransicoesModel extends AbstractTableModel{

    private List<Transicao> dados = new ArrayList<>();
    private String[] colunas = {"Estado atual","Entrada","Pilha","Entrar Pilha", "Próximo estado"};

    @Override
    public String getColumnName(int i) {
        return colunas[i];
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch (coluna) {
            case 0:
                return dados.get(linha).getEstadoAtual().getNome();
            case 1:
                return dados.get(linha).getEntrada();
            case 2:
                return dados.get(linha).getValorPilha();
            case 3:
                return dados.get(linha).getValorEntradaPilha();
            case 4:
                return dados.get(linha).getProximoEstado().getNome();
        }
        return null;    
    }
    
    public void addRow(Transicao transicao){
        this.dados.add(transicao);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public List<Transicao> getListaTransicoes(){
        return this.dados;
    }
    
    public List<Transicao> getListaTransicaoPorEstado(Estado estado){
        if (estado == null) return null;
        List<Transicao> retorno = new ArrayList<>();
        dados.stream().filter((dado) -> (dado.getEstadoAtual().getNome().equals(estado.getNome()))).forEachOrdered((dado) -> {
            retorno.add(dado);
        });
        return retorno;
    }
    
}
