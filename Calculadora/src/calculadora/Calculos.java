/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author pioca_000
 */
public class Calculos {
    public double somar(double x, double y){
        double result=x+y;
        return result;
    }
    
    public double subtrair(double x, double y){
        double result=x-y;
        return result;
    }
    
    public double multiplicar(double x, double y){
        return x*y;
    }
    
    public double dividir(double x, double y){
        double result;
        if(y==0){
            return 0000000;
        }
        else{
            result=x/y;
        }
        return result;
    }
    
    public double elevar(double x, double y){
        double result=Math.pow(x,y);
        return result;
    }
    
    public double raiz_quadrada(double x){
        double result=Math.sqrt(x);
        return result;
    }
    
    public double log(double x, double y){
        double result=Math.log(x)/Math.log(y);
        return result;
    }
    
    public double porcentagem(double x, double y){
        double result=(x/100)*y;
        return result;
    }
    
    public double fatorial(double x){
        double fat=1;
        while(x>1){
            fat=fat*x;
            x--;
        }
        return fat;
    }
}
