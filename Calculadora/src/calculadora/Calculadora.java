/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author pioca_000
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x;
        double y;
        int escolha=50;
        
        Calculos calculo=new Calculos();
        
        while(escolha!=0){
            escolha=Integer.parseInt(JOptionPane.showInputDialog("Informe a funcao que deseja fazer:\n 1-Somar.\n 2-Subtracao.\n 3-Multiplicacao.\n 4-Divisao.\n 5-Elevar.\n 6-Tirar Raiz Quadrada.\n 7-Fatorial.\n 8-Log.\n 9-Porcentagem. \n 0-Sair."));
            switch(escolha){
                case 1:
                    x=Double.parseDouble(JOptionPane.showInputDialog("Informe o numero: "));
                    y=Double.parseDouble(JOptionPane.showInputDialog("Informe o outro numero: "));
                    JOptionPane.showMessageDialog(null, calculo.somar(x, y));
                    break;
                case 2:
                   x=Double.parseDouble(JOptionPane.showInputDialog("Informe o numero: "));
                   y=Double.parseDouble(JOptionPane.showInputDialog("Informe o outro numero: ")); 
                   JOptionPane.showMessageDialog(null, calculo.subtrair(x, y));
                   break;
                case 3:
                   x=Double.parseDouble(JOptionPane.showInputDialog("Informe o numero: "));
                   y=Double.parseDouble(JOptionPane.showInputDialog("Informe o outro numero: "));
                   JOptionPane.showMessageDialog(null, calculo.multiplicar(x, y));
                   break;
                case 4:    
                   x=Double.parseDouble(JOptionPane.showInputDialog("Informe o numero: "));
                   y=Double.parseDouble(JOptionPane.showInputDialog("Informe o outro numero: "));
                    JOptionPane.showMessageDialog(null, calculo.dividir(x, y));
                   break;
                case 5:
                   x=Double.parseDouble(JOptionPane.showInputDialog("Informe o numero: "));
                   y=Double.parseDouble(JOptionPane.showInputDialog("Informe o expoente: "));
                   JOptionPane.showMessageDialog(null, calculo.elevar(x, y));
                   break;
                case 6:
                   x=Double.parseDouble(JOptionPane.showInputDialog("Informe o radicando: "));
                   JOptionPane.showMessageDialog(null, calculo.raiz_quadrada(x));
                   break;
                case 7:
                   x=Double.parseDouble(JOptionPane.showInputDialog("Informe o numero: "));
                   JOptionPane.showMessageDialog(null, calculo.fatorial(x));
                   break;
                case 8:  
                   x=Double.parseDouble(JOptionPane.showInputDialog("Informe o numero: "));
                   y=Double.parseDouble(JOptionPane.showInputDialog("Informe o outro numero: "));
                   JOptionPane.showMessageDialog(null, calculo.log(x, y));
                   break;
                case 9:
                   x=Double.parseDouble(JOptionPane.showInputDialog("Informe o numero: "));
                   y=Double.parseDouble(JOptionPane.showInputDialog("Informe o outro numero: "));
                   JOptionPane.showMessageDialog(null, calculo.porcentagem(x, y));
                   break; 
            }
        }
        
    }
    
}
