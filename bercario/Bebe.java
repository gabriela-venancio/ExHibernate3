package bercario;

import java.util.Date;


@Embeddable
public class Bebe {

	
	 @Id
	 @Column(name "BebeID", length =10)
	 @NotNull
	int id_bebe;
	 
	 @NotNull
	 @Column(name "BebeID", length =10)
	String nome;
	 
	 @NotNull
	 @Column(name "Data_Nasc")
	Date Data_nasc;
	 
	 @NotNull
	 @Column(name "Altura", length =7,2)
	Double altura;
	 
	@OneToMany
	@JoinColumn(name = "maeID_mae", length =10)
	 @NotNull
	Mae mae;
	
	public int getId_bebe() {
		return id_bebe;
	}
	public void setId_bebe(int id_bebe) {
		this.id_bebe = id_bebe;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData_nasc() {
		return Data_nasc;
	}
	public void setData_nasc(Date data_nasc) {
		Data_nasc = data_nasc;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Mae getMaeID_mae() {
		return maeID_mae;
	}
	public void setMaeID_mae(Mae maeID_mae) {
		this.maeID_mae = maeID_mae;
	}
	
	
	
	
}
