/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consulta;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */



public class Medico extends Pessoa {
    

	Scanner input = new Scanner(System.in);
	ArrayList<Paciente> agenda = new ArrayList<Paciente>();
        
        
	
	public Medico(String nome, String CPF, String email, String telefone) {
		super(nome, CPF, email, telefone);
	}
	
	public ArrayList<Paciente> getAgenda() {
		return agenda;
	}
	public void setAgenda(ArrayList<Paciente> agenda) {
		this.agenda = agenda;
	}

        
        
        
	public void realizarConsulta() {
		if (agenda.size() > 0) {
			System.out.println("\nPaciente atendido: " + agenda.get(0).getNome()
                                + "\nMedicamentos Preescrevidos: " + preescreverMedicamentos()
                                + "\nExames solicitados: " + solicitarRealizacaoExames() 
                                + "\nMotivo da ida: " + agenda.get(0).getMotivo());
                        
                        
			agenda.remove(0);
			System.out.println("Paciente Atendido!");
		}
               
      
		else {
			System.out.println("\nNão há mais pacientes!");
		}
		
                
	}
	
	private String solicitarRealizacaoExames() {
		int valor = 0;
                String exames;
                System.out.println("(1: Sim | 2: Não)\nHá necessidade de solicitar exames?: ");
		valor = input.nextInt();
                while(valor >=3 || valor <=0){
                    System.out.println("Valor inválido! Apenas 1 ou 2.");
                }
		if(valor == 1){
                    System.out.println("Digite os exames solicitados: ");
                    exames = input.next();
                        return exames;
                }else {
                            return "Sem exames socilitados.";
                        }
                        
                }
                        
                            
	
    
	private String preescreverMedicamentos() {
		int valor = 0; 
                String exames = "";
                System.out.println("(1: Sim | 2: Não)\nHá necessidade de preescrever medicamento?: ");
		valor = input.nextInt();
                while(valor >=3 || valor <=0){
                    System.out.println("Valor inválido! Apenas 1 ou 2.");
                }
			if(valor == 1){
                            System.out.println("Digite os medicamentos preescritos: ");
                            exames = input.next();
                            return exames;
                        }
                        else {
                            return "Sem medicamentos preescritos.";
                        }
                }
        
        
}
