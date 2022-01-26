package studsluzba.client.fxmlcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import studsluzba.model.StudProgram;
import studsluzba.services.StudProgramService;

@Component
public class StudProgramController {
	
    @Autowired
	StudProgramService studProgramService;
	
	
	@FXML private TextField nazivTf;
	@FXML private TextField skraceniNazivTf;
	
	public void handleSaveStudProgram(ActionEvent event) {
		StudProgram sp = studProgramService.saveStudProgram(nazivTf.getText(), skraceniNazivTf.getText());
		// ubaciti u listi svih programa		
	}
	
	

}
