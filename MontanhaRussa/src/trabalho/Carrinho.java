/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class Carrinho extends Thread{
    
    MontanhaRussa montanhaRussa;
    
    Carrinho(MontanhaRussa montanhaRef){
        montanhaRussa = montanhaRef;
    }
    
    @Override
    public void run() 
    {
        montanhaRussa.passageirosDentro = 0;
        
        while(montanhaRussa.quantidadeVoltasRestantes != 0){
            if(montanhaRussa.lugaresDisponiveis == montanhaRussa.passageirosDentro){
                System.out.println(".."); 
                System.out.println("Deu a volta!"); 
                System.out.println(".."); 
                montanhaRussa.passageirosDentro = 0;
                montanhaRussa.quantidadeVoltasRestantes--;
            }
        }
    }
}
