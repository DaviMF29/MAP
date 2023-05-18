/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consulta;

/**
 *
 * @author Miguel
 */

public class Paciente extends Pessoa {
        
    String motivo;
	public Paciente(String nome, String CPF, String email, String telefone,String motivo) {
		super(nome, CPF, email, telefone);
                this.motivo = motivo;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " / " + "CPF: " + CPF;
	}

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
        
        
}


