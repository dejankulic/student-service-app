package studsluzba.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import studsluzba.model.StudProgram;

public interface StudProgramRepository extends CrudRepository<StudProgram, Integer> {
	
	@Query("select sp from StudProgram sp join fetch sp.predmeti where sp.idstudProgram like :id")
	StudProgram getStudprogramWithPredmeti(Integer id);

}
