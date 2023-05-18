/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consulta;

/**
 *
 * @author Miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) {
		Sistema sistema = new Sistema();
		Medico medico1 = new Medico("Dr. Pep", "111-111-111-11", "04/02/1987", "(88)8 8888-8888");
		
		sistema.consultarAgenda(medico1);
                sistema.marcarConsulta(medico1, new Paciente("Luan", "444-444-444-44", "02/02/2002", "4002-8922", "Andou demais"));
		sistema.marcarConsulta(medico1, new Paciente("Real madrid", "444.444.444.44", "06/03/1902", "4444-0000","Tomou sacode do ciy"));
                
		
                
		sistema.consultarAgenda(medico1);
		sistema.cancelarConsulta(medico1);
		medico1.realizarConsulta();
		sistema.consultarAgenda(medico1);
		medico1.realizarConsulta();
                
                
                
                
	}
}

    
    

