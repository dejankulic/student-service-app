package studsluzba.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import studsluzba.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	@Query("select s from Student s where "
			+ "(:ime is null or lower(s.ime) like :ime) and "
			+ "(:prezime is null or lower(s.prezime) like :prezime)")			
	List<Student> findStudent(String ime, String prezime);
	
	
	@Query("select s from Student s join fetch s.indeksi i where i.aktivan=true")
	List<Student> getStudenteAktivanIndeks();
	
	@Query("select s from Student s left join s.indeksi i where i.studProgram.skraceniNaziv like :naziv ")
	List<Student> getStudenteiIndekse(String naziv);


}
