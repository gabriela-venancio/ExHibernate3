package bercario;


@Embeddable
public class Medico {

	 @Id
	 @Column(name "CRM", length =7)
	 @NotNull
	String CRM;
	 
	 @Column(name "Nome", length =60)
	 @NotNull
	String nome;
	 
	 @Column(name "Telefone_Celular", length =11)
	 @NotNull
	String celular;
	 
	 @Column(name "Especialidade", length =30)
	 @NotNull
	String especialidade;
	 
	public String getCRM() {
		return CRM;
	}
	public void setCRM(String cRM) {
		CRM = cRM;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	
	
}
