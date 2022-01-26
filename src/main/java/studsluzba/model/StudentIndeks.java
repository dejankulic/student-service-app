package studsluzba.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StudentIndeks {
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int broj;
	private int godinaUpisa;
	
	@ManyToOne
	@JoinColumn(name="idstudProgram")
	private StudProgram studProgram;
	
	@ManyToOne 
	@JoinColumn(name="idStudent")
	private Student student;
	
	
	private boolean aktivan;
	
	
	
	public StudentIndeks() {
		
	}
	
	
	
	public StudentIndeks(int broj, int godinaUpisa) {
		super();
		this.broj = broj;
		this.godinaUpisa = godinaUpisa;
	}
	public StudentIndeks(int broj, int godinaUpisa, StudProgram studProgram, Student student, boolean aktivan) {
		super();
		this.broj = broj;
		this.godinaUpisa = godinaUpisa;
		this.studProgram = studProgram;
		this.student = student;
		this.aktivan = aktivan;
	}
	
	public StudentIndeks(int broj, int godinaUpisa, StudProgram studProgram, boolean aktivan) {
		super();
		this.broj = broj;
		this.godinaUpisa = godinaUpisa;
		this.studProgram = studProgram;		
		this.aktivan = aktivan;
	}
	
	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public int getGodinaUpisa() {
		return godinaUpisa;
	}
	public void setGodinaUpisa(int godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}
	public boolean isAktivan() {
		return aktivan;
	}
	public void setAktivan(boolean aktivan) {
		this.aktivan = aktivan;
	}
	public StudProgram getStudProgram() {
		return studProgram;
	}
	public void setStudProgram(StudProgram studProgram) {
		this.studProgram = studProgram;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "StudentIndeks [id=" + id + ", broj=" + broj + ", godinaUpisa=" + godinaUpisa + ", studProgram="
				+ studProgram + ", aktivan=" + aktivan + "]";
	}

	
	
}
