/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.rectorias;

import com.unicahiccpmp.dao.Rector;
import java.util.Arrays;
/**
 *
 * @author josem
 */
public class RectoresTableModel extends GenericDomainTableModel<Rector>{
 public RectoresTableModel(){
        super( Arrays.asList( new Object[]{"Código", "Nombre Completo", "Universidad", "Correo"} ));
    }   
 
 @Override
    public Class<?> getColumnClass(int colIndex){
        switch(colIndex){
            case 0:
                return Double.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
        }
        throw new ArrayIndexOutOfBoundsException(colIndex);
    }
    
    @Override
    public Object getValueAt(int rowIndex, int colIndex) {
        Rector item = getDomainObject(rowIndex);
        switch(colIndex){
            case 0:
                return item.getID();
            case 1:
                return item.getNOMBRECOMPLETO();
            case 2:
                return item.getUNIVERSIDAD();
            case 3:
                return item.getCORREO();
        }
        throw new ArrayIndexOutOfBoundsException(colIndex);
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int colIndex){
       // return rowIndex>0 && colIndex > 1;
       return false;
    }
    
    @Override
    public void setValueAt(Object valor, int rowIndex, int colIndex){
        ///Implementación
        
        //Dispanara un Evento de Notificacion
        notifyTableCellUpdated(rowIndex, colIndex);
    } 

}
