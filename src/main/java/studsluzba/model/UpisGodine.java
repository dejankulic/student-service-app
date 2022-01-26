package studsluzba.model;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;


@Entity
public class UpisGodine extends AktivnostStudenta {
	
	private int godinaUpisa;
	
	@ManyToMany
	private List<Predmet> prenetiPredmeti;
	
	
	
	

	public int getGodinaUpisa() {
		return godinaUpisa;
	}

	public void setGodinaUpisa(int godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}

	public List<Predmet> getPrenetiPredmeti() {
		return prenetiPredmeti;
	}

	public void setPrenetiPredmeti(List<Predmet> prenetiPredmeti) {
		this.prenetiPredmeti = prenetiPredmeti;
	}
	
	
	
	
}
