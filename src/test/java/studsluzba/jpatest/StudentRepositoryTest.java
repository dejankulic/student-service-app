package studsluzba.jpatest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import studsluzba.model.StudProgram;
import studsluzba.model.Student;
import studsluzba.model.StudentIndeks;
import studsluzba.repositories.StudProgramRepository;
import studsluzba.repositories.StudentIndeksRepository;
import studsluzba.repositories.StudentRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRepositoryTest {
	
	@Autowired
	StudentRepository studRepo;
	
	@Autowired
	StudProgramRepository studProgramRepo;
	
	@Autowired
	StudentIndeksRepository studIndeksRepo;
	
	@Test
    public void saveStudentTest() throws Exception {
		
		StudProgram sp = new StudProgram();
		sp.setNaziv("Racunarske nauke");
		sp.setSkraceniNaziv("RN");
		studProgramRepo.save(sp);
		
		StudProgram sp1 = new StudProgram();
		sp1.setNaziv("Racunarsko inzenjerstvo");
		sp1.setSkraceniNaziv("RI");
		studProgramRepo.save(sp1);
		
        Student s = new Student();
        s.setIme("Misa");
        s.setPrezime("Misic");
        s.setSrednjeIme("Marko");
       
        
        Student s1 = new Student();
        s1.setIme("Petar");
        s1.setPrezime("Petrovic");        
        
        
        StudentIndeks si = new StudentIndeks(4, 2018, sp1, s ,false);
        StudentIndeks si1 = new StudentIndeks(78, 2019, sp,s, true);
        StudentIndeks si2 = new StudentIndeks(35, 2014, sp,s, false);
        
        
        studRepo.save(s);
        studRepo.save(s1);
        
        
        
        studIndeksRepo.save(si);
        studIndeksRepo.save(si1);
        studIndeksRepo.save(si2);
        
        
        List<Student> studenti = studRepo.getStudenteAktivanIndeks();
        for(Student st:studenti) {
        	System.out.println(st.getIme() +" " + st.getPrezime() + " broj aktivnih indeksa: "
        			+ st.getIndeksi().size());
        	if(st.getIndeksi().size()>0)
        		System.out.println("Aktivan indeks = "+st.getIndeksi().get(0));
        }
        
        System.out.println("select s from Student s left join s.indeksi i where i.studProgram.skraceniNaziv like :naziv ");
        studenti = studRepo.getStudenteiIndekse("RN");
        for(Student st:studenti) {
        	System.out.println(st.getIme() +" " + st.getPrezime());
        }
        
    }
	
	@Test
    public void findStudentTest() throws Exception {        
        List<Student> studenti = studRepo.findStudent("misa", null);
        //for(Student s:studenti)
        	//System.out.println(s);
	}
        
   }

