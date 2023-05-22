/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consulta;
import java.util.Scanner;
/**
 *
 * @author Miguel
 */

    

public class Sistema {

    
	public void marcarConsulta(Medico medico, Paciente paciente) {
		if (medico.getAgenda().size() >= 5) {
			System.out.println("\nA agenda do médico " 
                        + medico.getNome() + " está cheia");
		}
		else {
			medico.getAgenda().add(paciente);
		}
	}
        
   
        
	
	public void cancelarConsulta(Medico medico) {
		Scanner input = new Scanner(System.in);
		int posicaoPaciente = 0;
		if (medico.getAgenda().size() > 0) {
			for (int i = 0; i < medico.getAgenda().size(); i++) {
				System.out.println(i+1 + " - " + medico.getAgenda().get(i));
			}
			while (true) {
				System.out.println("\nDigite a posição do paciente para cancelar a consulta");
				posicaoPaciente = input.nextInt();
				if (posicaoPaciente > 0 && posicaoPaciente <= medico.getAgenda().size()) {
					System.out.println("\nConsulta cancelada");
					break;
				}
                                else{
                                    System.out.println("Posição inválida. Os valores vão de 1 à "+ medico.getAgenda().size());
                                }
			}
			medico.getAgenda().remove(posicaoPaciente-1);
		}
	}
	
	public void consultarAgenda(Medico medico) {
		if (medico.getAgenda().size() == 0) {
			System.out.println("A agenda do médico está vazia!");
		}
		else {
			System.out.println("\nMedico: " + medico.getNome());
			System.out.println("Pacientes:");
			for (int i = 0; i < medico.getAgenda().size(); i++) {
				System.out.println(medico.getAgenda().get(i));
			}
			System.out.println();
		}
	}
}


