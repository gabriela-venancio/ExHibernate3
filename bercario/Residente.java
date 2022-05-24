package bercario;


@Entity

public class Residente {

	
	 @Id
	 @OneToOne
	 @JoinColumn(name = "MedicoCRM")
	 @Column(name "MedicoCRM", length =7)
	 @NotNull
	Medico Medico;
	 
	 @Column(name "Instituicao_Ensino", length =50)
	 @NotNull
	String instituicao_Ensino;
	 
	 @Column(name "Ano_Ingresso", length =10)
	 @NotNull
	int ano_ingresso;
	 
	public Medico getMedico() {
		return Medico;
	}
	public void setMedico(Medico medicoCRM) {
		Medico = medicoCRM;
	}
	public String getInstituicao_Ensino() {
		return instituicao_Ensino;
	}
	public void setInstituicao_Ensino(String instituicao_Ensino) {
		this.instituicao_Ensino = instituicao_Ensino;
	}
	public int getAno_ingresso() {
		return ano_ingresso;
	}
	public void setAno_ingresso(int ano_ingresso) {
		this.ano_ingresso = ano_ingresso;
	}
	
	
	
}
