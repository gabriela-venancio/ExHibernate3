package bercario;


@Entity
public class Bebe_medico {
	
	 @Id
	 @ManyToOne
	   @JoinColumn(name = "BebeId_id")
	 @Column(name "BebeID", length =10)
	Bebe id;
	
	
	
	 @Id
	 @OneToOne
	 @JoinColumn(name = "MedicoCRM")
	 @Column(name "MedicoCRM", length =7)
	Medico Medico;
	
	public Bebe getBebeId_id() {
		return BebeId_id;
	}
	public void setBebeId_id(Bebe bebeId_id) {
		BebeId_id = bebeId_id;
	}
	public Medico getMedicoCRM() {
		return MedicoCRM;
	}
	public void setMedicoCRM(Medico medicoCRM) {
		MedicoCRM = medicoCRM;
	}
	
	
}
