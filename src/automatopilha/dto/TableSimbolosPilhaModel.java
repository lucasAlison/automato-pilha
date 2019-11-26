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
public class TableSimbolosPilhaModel extends AbstractTableModel{

    private List<String> dados = new ArrayList<>();
    private String[] colunas = {"Valor"};

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
                return dados.get(linha);            
        }
        return null;    
    }

    
    
    public void addRow(String valor){
        this.dados.add(valor);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public List<String> getListaSimbolosPilha(){
        return this.dados;
    }
    
}
