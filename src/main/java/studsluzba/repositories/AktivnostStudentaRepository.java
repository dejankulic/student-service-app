package studsluzba.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import studsluzba.model.AktivnostStudenta;
import studsluzba.model.StudentIndeks;

public interface AktivnostStudentaRepository extends CrudRepository<AktivnostStudenta, Integer> {
	
	
	@Query("select a from AktivnostStudenta a where a.indeks = :si")
	List<AktivnostStudenta> getAktivnostiZaIndeks(StudentIndeks si);

}
