/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class Passageiro extends Thread{
    
    MontanhaRussa montanhaRussa;
    
    Passageiro(MontanhaRussa montanhaRef){
        montanhaRussa = montanhaRef;
    }
    
     @Override
    public void run() 
    { 
        while(montanhaRussa.quantidadeVoltasRestantes != 0){
            if(montanhaRussa.lugaresDisponiveis > montanhaRussa.passageirosDentro){
                montanhaRussa.passageirosDentro++;
                System.out.println("Entrou passageiro"); 
            }
        }
    }
}
