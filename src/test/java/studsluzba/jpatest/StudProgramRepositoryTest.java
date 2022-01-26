package studsluzba.jpatest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import studsluzba.model.Predmet;
import studsluzba.model.StudProgram;
import studsluzba.repositories.PredmetRepository;
import studsluzba.repositories.StudProgramRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudProgramRepositoryTest {
	
	@Autowired
	StudProgramRepository studProgramRepo;
	
	@Autowired
	PredmetRepository predmetRepo;
	
	@Test
    public void saveStudentTest() throws Exception {
		StudProgram sp = new StudProgram();
		sp.setNaziv("Racunarske nauke");
		sp.setSkraceniNaziv("RN");
		studProgramRepo.save(sp);
		
		Predmet p = new Predmet();
		p.setNazivPredmeta("Upravljanje informacijama");
		p.setSifraPredmeta("888");
		p.setStudProgram(sp);
		predmetRepo.save(p);
		
		Predmet p1 = new Predmet();
		p1.setNazivPredmeta("Softverske komponente");
		p1.setSifraPredmeta("882");
		p1.setStudProgram(sp);
		predmetRepo.save(p1);
		
		StudProgram sp1 = studProgramRepo.getStudprogramWithPredmeti(sp.getIdstudProgram());
		System.out.println(sp1.getPredmeti().size());
		for(Predmet pr:sp1.getPredmeti()) {
			System.out.println(pr.getNazivPredmeta());
		}
		
		
		
    }
	

}
