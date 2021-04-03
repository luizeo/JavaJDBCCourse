
package br.com.ltp2.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Util {

    public static Date converterToDate(String stringData) {
        
        DateFormat df;
        Date data = new Date();
        
        try {
            df = new SimpleDateFormat("dd/MM/yyyy");
            data = df.parse(stringData);
        } catch (ParseException ex) {
            JOptionPane.showInputDialog(null, "Ocorreu um erro converteParaData: "+ex);
        }
        
        return data;
        
    }
    
    public static String converteToString(Date data){
        DateFormat df;
        String dataString = null;
        
        df = new SimpleDateFormat("dd/MM/yyyy");
        dataString = df.format(data);
        
        return dataString;
    }
    
    

}
