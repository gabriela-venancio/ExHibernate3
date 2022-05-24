package bercario;

import java.util.Date;


@Embeddable
public class Mae {
	
	 @Id
	 @Column(name "ID_Mae", length =10)
	 @NotNull
	int id_mae;
	 
	 
	 @Column(name "Nome", length =60)
	 @NotNull
	String nome;
	 
	 @Column(name "Logradouro_Endereco", length =100)
	 @NotNull
	String logradouro_endereco;
	 
	 @Column(name "CEP_Endereco", length =8)
	 @NotNull
	String cep;
	 
	 @Column(name "Complemento_Endereco", length =200)
	String complemento;
	 
	 @Column(name "Telefone", length =10)
	 @NotNull
	String telefone;
	 
	 @Column(name "Data_Nasc")
	 @NotNull
	Date Data_Nasc;
	public int getId_mae() {
		return id_mae;
	}
	public void setId_mae(int id_mae) {
		this.id_mae = id_mae;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogradouro_endereco() {
		return logradouro_endereco;
	}
	public void setLogradouro_endereco(String logradouro_endereco) {
		this.logradouro_endereco = logradouro_endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getData_Nasc() {
		return Data_Nasc;
	}
	public void setData_Nasc(Date data_Nasc) {
		Data_Nasc = data_Nasc;
	}
	
	
	
	
}
