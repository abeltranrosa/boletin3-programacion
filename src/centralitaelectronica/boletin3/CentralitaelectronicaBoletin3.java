
package centralitaelectronica.boletin3;

import javax.swing.JOptionPane;


public class CentralitaelectronicaBoletin3 {

   
    public static void main(String[] args) {
        Consumo cons1 = new Consumo();
        cons1.setLitros(50f);
        cons1.setPgas(1.57f);
        Consumo cons2 = new Consumo(96.5f,5.5f,126f,1.20f);
        
        cons2.consumoMedio();
        System.out.println();
        
        cons2.setLitros(Float.parseFloat(JOptionPane.showInputDialog("introduzca nuevo consumo ")));
         
        
        System.out.print("la velocidad media es "+ cons2.getvMed());
        
        
        
        
    }
    
}
