package studsluzba.model;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class ObnovaGodine extends AktivnostStudenta {
	
	private int godinaObnove;
	
	@ManyToMany
	private List<Predmet> upisaniPredmeti;

	public int getGodinaObnove() {
		return godinaObnove;
	}

	public void setGodinaObnove(int godinaObnove) {
		this.godinaObnove = godinaObnove;
	}

	public List<Predmet> getUpisaniPredmeti() {
		return upisaniPredmeti;
	}

	public void setUpisaniPredmeti(List<Predmet> upisaniPredmeti) {
		this.upisaniPredmeti = upisaniPredmeti;
	}
	
	
	
	

}
