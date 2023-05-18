/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consulta;

/**
 *
 * @author Miguel
 */

public class Pessoa {
	protected String nome;
	protected String CPF;
	protected String email;
	protected String Telefone;
	
	public Pessoa(String nome, String CPF, String email, String telefone) {
		this.nome = nome;
		this.CPF = CPF;
		this.email = email;
		this.Telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		CPF = CPF;
	}

	public String email() {
		return email;
	}

	public void email(String email) {
		this.email = email;
	}
	
	
}


