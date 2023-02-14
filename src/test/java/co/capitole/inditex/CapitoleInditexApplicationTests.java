package co.capitole.inditex;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import co.capitole.inditex.controller.ApiRestController;
import co.capitole.inditex.model.ResponseService;

@SpringBootTest
class CapitoleInditexApplicationTests {

	@Autowired
	ApiRestController apiRestController;

	@Mock
	private ResponseService responseService;

	@BeforeEach
	public void setUp() {
		responseService = new ResponseService.ResponseServiceBuilder().productId(35455).brandId("ZARA").priceList(1)
				.startDate("2020-06-14T00:00-2020-12-31T23:59:59").price(35.5).builder();
	}

	LocalDateTime applicationDate = LocalDateTime.parse("2020-06-14T10:00:00");
	int productId = 35455;
	int brandId = 1;

	@Test
	void test1() {
		ResponseEntity<ResponseService> ResponseService = apiRestController.getPrices(applicationDate, productId,
				brandId);
		Assertions.assertNotNull(ResponseService);
		Assertions.assertNotNull(ResponseService.getBody());
		assertEquals(HttpStatus.OK, ResponseService.getStatusCode());
		// assertEquals(responseServiceDTO, ResponseService.getBody());
	}

	@Test
	void test2() {

		LocalDateTime applicationDate = LocalDateTime.parse("2020-06-14T16:00:00");
		int productId = 35455;
		int brandId = 1;

		ResponseEntity<ResponseService> ResponseService = apiRestController.getPrices(applicationDate, productId,
				brandId);
		Assertions.assertNotNull(ResponseService);
		Assertions.assertNotNull(ResponseService.getBody());
		assertEquals(HttpStatus.OK, ResponseService.getStatusCode());
	}

	@Test
	void test3() {

		LocalDateTime applicationDate = LocalDateTime.parse("2020-06-14T21:00:00");
		int productId = 35455;
		int brandId = 1;

		ResponseEntity<ResponseService> ResponseService = apiRestController.getPrices(applicationDate, productId,
				brandId);
		Assertions.assertNotNull(ResponseService);
		Assertions.assertNotNull(ResponseService.getBody());
		assertEquals(HttpStatus.OK, ResponseService.getStatusCode());
	}

	@Test
	void test4() {

		LocalDateTime applicationDate = LocalDateTime.parse("2020-06-15T10:00:00");
		int productId = 35455;
		int brandId = 1;

		ResponseEntity<ResponseService> ResponseService = apiRestController.getPrices(applicationDate, productId,
				brandId);
		Assertions.assertNotNull(ResponseService);
		Assertions.assertNotNull(ResponseService.getBody());
		assertEquals(HttpStatus.OK, ResponseService.getStatusCode());
	}

	@Test
	void test5() {

		LocalDateTime applicationDate = LocalDateTime.parse("2020-06-16T21:00:00");
		int productId = 35455;
		int brandId = 1;

		ResponseEntity<ResponseService> ResponseService = apiRestController.getPrices(applicationDate, productId,
				brandId);
		Assertions.assertNotNull(ResponseService);
		Assertions.assertNotNull(ResponseService.getBody());
		assertEquals(HttpStatus.OK, ResponseService.getStatusCode());
	}
}
