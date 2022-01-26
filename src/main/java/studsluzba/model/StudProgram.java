package studsluzba.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the studProgram database table.
 * 
 */
@Entity
@Table(name="studProgram")
@NamedQuery(name="StudProgram.findAll", query="SELECT s FROM StudProgram s")
public class StudProgram implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idstudProgram;

	private String naziv;

	private String skraceniNaziv;

	@OneToMany(mappedBy="studProgram")
	private List<Predmet> predmeti;

	public StudProgram() {
	}

	public int getIdstudProgram() {
		return this.idstudProgram;
	}

	public void setIdstudProgram(int idstudProgram) {
		this.idstudProgram = idstudProgram;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return this.skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}

	
	

	

	@Override
	public String toString() {
		return skraceniNaziv + "-" + naziv ;
	}

	public List<Predmet> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(List<Predmet> predmeti) {
		this.predmeti = predmeti;
	}
	
	
	

}