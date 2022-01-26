package studsluzba.jpatest;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import studsluzba.model.AktivnostStudenta;
import studsluzba.model.ObnovaGodine;
import studsluzba.model.Student;
import studsluzba.model.StudentIndeks;
import studsluzba.model.UpisGodine;
import studsluzba.repositories.AktivnostStudentaRepository;
import studsluzba.repositories.StudentIndeksRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AktivnostRepositoryTest {
	
	@Autowired
	AktivnostStudentaRepository aktivnostRepo;
	
	@Autowired
	StudentIndeksRepository indeksRepo;
	
	@Test
    public void saveStudentTest() throws Exception {
		
	   StudentIndeks si = new StudentIndeks(45,2019);	   
	   indeksRepo.save(si);
	   
	   ObnovaGodine og = new ObnovaGodine();
       og.setDatum(LocalDate.of(2018, 9, 22));
       og.setGodinaObnove(2);
       og.setIndeks(si);
		
       UpisGodine ug = new UpisGodine();
       ug.setDatum(LocalDate.of(2019, 9, 25));
       ug.setGodinaUpisa(3);
       ug.setIndeks(si);
              
       aktivnostRepo.save(ug);
       aktivnostRepo.save(og);
       
       
       
       List<AktivnostStudenta> aktivnosti = aktivnostRepo.getAktivnostiZaIndeks(si);
       for(AktivnostStudenta as:aktivnosti)
    	   System.out.println(as.getDatum()+"  "+as.getClass().getSimpleName());
      
       
       
    }

}
