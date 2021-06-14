/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dormidospizza;

import java.util.ArrayList;

/**
 *
 * @author HP2021
 */
public class DormidosPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Datospizzeria> Listapizza2 = new ArrayList<Datospizzeria>();
        ArrayList<ordenespizza> Listapizza = new ArrayList<ordenespizza>();
        // TODO code application logic here
         Menu a = new Menu(Listapizza2,Listapizza);
        a.setVisible(true);
      
       
    }
    
}
