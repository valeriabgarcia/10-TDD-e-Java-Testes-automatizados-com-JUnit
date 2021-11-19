package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusZeroParaFuncionarioComSalarioAlto() {

		BonusService service = new BonusService();
		// para testar exception no JUnit, é da seguinte maneira:
		 assertThrows(IllegalArgumentException.class, 
				 () -> service.calcularBonus(new Funcionario("Joao", LocalDate.now(), new BigDecimal("25000"))));

		// para testar exception no JUnit, também podemos usar:
//		try {
//			service.calcularBonus(new Funcionario("Joao", LocalDate.now(), new BigDecimal("25000")));
//			fail("Não deu a exception");
//		} catch (Exception e) {
//		}

	}

	@Test
	void bonus10PorCentoDoSalario() {

		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Joao", LocalDate.now(), new BigDecimal("2500")));
		assertEquals(new BigDecimal("250.0"), bonus);
	}

	@Test
	void bonusDezPorCentoDoSalario10000Reais() {

		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Joao", LocalDate.now(), new BigDecimal("10000")));
		assertEquals(new BigDecimal("1000.0"), bonus);
	}

}
