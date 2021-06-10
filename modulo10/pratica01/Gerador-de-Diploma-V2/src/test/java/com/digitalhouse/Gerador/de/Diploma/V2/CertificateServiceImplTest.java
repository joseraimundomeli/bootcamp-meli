package com.digitalhouse.Gerador.de.Diploma.V2;

import com.digitalhouse.Gerador.de.Diploma.V2.detos.StudentDTO;
import com.digitalhouse.Gerador.de.Diploma.V2.detos.StudentResponseDTO;
import com.digitalhouse.Gerador.de.Diploma.V2.detos.SubjectTDO;
import com.digitalhouse.Gerador.de.Diploma.V2.services.CertificateServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class CertificateServiceImplTest {

	private CertificateServiceImpl studentService = new CertificateServiceImpl();

	@Test
	void bestCaseSubjectsAprove() {
		// Arrange
		List<SubjectTDO> subjectTDOListTest = new ArrayList<>();
		subjectTDOListTest.add(new SubjectTDO("Português", 10.0));
		subjectTDOListTest.add(new SubjectTDO("Matemática", 9.0));
		subjectTDOListTest.add(new SubjectTDO("Geográfia", 10.0));
		subjectTDOListTest.add(new SubjectTDO("Física", 8.0));

		StudentDTO studentDTOTest = new StudentDTO("Aluno Teste", subjectTDOListTest);

		// Act
		StudentResponseDTO studentResponseDTO = studentService.analyzeNotes(studentDTOTest);

		// Assert
		assertEquals(studentResponseDTO.getAverage(), 9.25);
	}


	@Test
	void badCaseSubjectsAprove() {
		// Arrange
		List<SubjectTDO> subjectTDOListTest = new ArrayList<>();
		subjectTDOListTest.add(new SubjectTDO("Português", 9.0));
		subjectTDOListTest.add(new SubjectTDO("Matemática", 9.0));
		subjectTDOListTest.add(new SubjectTDO("Geográfia", 10.0));
		subjectTDOListTest.add(new SubjectTDO("Física", 8.0));

		StudentDTO studentDTOTest = new StudentDTO("Aluno Teste", subjectTDOListTest);

		// Act
		StudentResponseDTO studentResponseDTO = studentService.analyzeNotes(studentDTOTest);

		// Assert
		assertNotEquals(studentResponseDTO.getAverage(), 9.25);
	}


	@Test
	void bestComputerAverage() {
		// Arrange
		List<Double> notesTest = List.of(9.0, 9.0, 9.5);

		// Act
		Double computerAverageResult = studentService.calculateAvarege(notesTest);

		// Assert
		assertEquals(computerAverageResult, 9.17);
	}

	void bedComputerAverage() {
		// Arrange
		List<Double> notesTest = List.of(9.0, 9.0, 9.5);

		// Act
		Double computerAverageResult = studentService.calculateAvarege(notesTest);

		// Assert
		assertEquals(computerAverageResult, 7.01);
	}



	@Test
	void bestCaseWithHonors() {
		// Arrange
		Double averageTest = 9.5;

		// Act
		String withHonorsResult = studentService.withHonors(averageTest);

		// Assert
		assertEquals(withHonorsResult, "Parabéns, 9.5, aprovado com louvor!");
	}


	@Test
	void badCaseWithHonors() {
		// Arrange
		Double averageTest = 9.5;

		// Act
		String withHonorsResult = studentService.withHonors(averageTest);

		// Assert
		assertNotEquals(withHonorsResult, "Sua média foi de 8.75!");
	}



}
