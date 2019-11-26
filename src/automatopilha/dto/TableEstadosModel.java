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
public class TableEstadosModel extends AbstractTableModel{

    private List<Estado> dados = new ArrayList<>();
    private String[] colunas = {"Nome","É final?"};

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
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).isEhFinal();
        }
        return null;    
    }

    @Override
    public void setValueAt(Object o, int linha, int coluna) {
        switch (coluna) {
            case 0:
                dados.get(linha).setNome((String) o);
                break;
            case 1:
                dados.get(linha).setEhFinal((Boolean) o);
                break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    
    
    
    public void addRow(Estado estado){
        this.dados.add(estado);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public List<Estado> getListaEstados(){
        return this.dados;
    }
    
}
