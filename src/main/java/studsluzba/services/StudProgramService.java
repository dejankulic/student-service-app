package studsluzba.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import studsluzba.model.StudProgram;
import studsluzba.repositories.StudProgramRepository;

@Service
public class StudProgramService{
	
	@Autowired
	StudProgramRepository studProgramRepo;
	
	public StudProgram saveStudProgram(String punNaziv, String skraceniNaziv){
		StudProgram sp = new StudProgram();
		sp.setNaziv(punNaziv);
		sp.setSkraceniNaziv(skraceniNaziv);
		return studProgramRepo.save(sp);				
	}
	
	
	
	
	

}
