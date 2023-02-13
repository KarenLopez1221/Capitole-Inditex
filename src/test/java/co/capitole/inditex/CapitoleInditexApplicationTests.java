package co.capitole.inditex;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import co.capitole.inditex.controller.ApiRestController;
import co.capitole.inditex.model.ResponseServiceDTO;

@SpringBootTest
class CapitoleInditexApplicationTests {

	@Autowired
	ApiRestController apiRestController;

	@Mock
	private ResponseServiceDTO responseServiceDTO;

	@BeforeEach
	public void setUp() {
		responseServiceDTO = new ResponseServiceDTO.ResponseServiceBuilder()
				.ProductId(35455)
				.BrandId("ZARA")
				.PriceList(1)
				.StartDate("2020-06-14T00:00-2020-12-31T23:59:59")
				.Price(35.5).builder();
	}

	String applicationDate = "2020-06-14 10:00:00";
	int productId = 35455;
	int brandId = 1;

	@Test
	void test1() {
		ResponseEntity<ResponseServiceDTO> ResponseService = apiRestController.getPrices(applicationDate, productId,
				brandId);
		Assertions.assertNotNull(ResponseService);
		Assertions.assertNotNull(ResponseService.getBody());
		assertEquals(HttpStatus.OK, ResponseService.getStatusCode());
		//assertEquals(responseServiceDTO, ResponseService.getBody());
	}

	@Test
	void test2() {

		String applicationDate = "2020-06-14 16:00:00";
		int productId = 35455;
		int brandId = 1;

		ResponseEntity<ResponseServiceDTO> ResponseService = apiRestController.getPrices(applicationDate, productId,
				brandId);
				Assertions.assertNotNull(ResponseService);
				Assertions.assertNotNull(ResponseService.getBody());
				assertEquals(HttpStatus.OK, ResponseService.getStatusCode());
	}

	@Test
	void test3() {

		String applicationDate = "2020-06-14 21:00:00";
		int productId = 35455;
		int brandId = 1;

		ResponseEntity<ResponseServiceDTO> ResponseService = apiRestController.getPrices(applicationDate, productId,
				brandId);
				Assertions.assertNotNull(ResponseService);
				Assertions.assertNotNull(ResponseService.getBody());
				assertEquals(HttpStatus.OK, ResponseService.getStatusCode());
	}

	@Test
	void test4() {

		String applicationDate = "2020-06-15 10:00:00";
		int productId = 35455;
		int brandId = 1;

		ResponseEntity<ResponseServiceDTO> ResponseService = apiRestController.getPrices(applicationDate, productId,
				brandId);
				Assertions.assertNotNull(ResponseService);
				Assertions.assertNotNull(ResponseService.getBody());
				assertEquals(HttpStatus.OK, ResponseService.getStatusCode());
	}

	@Test
	void test5() {

		String applicationDate = "2020-06-16 21:00:00";
		int productId = 35455;
		int brandId = 1;

		ResponseEntity<ResponseServiceDTO> ResponseService = apiRestController.getPrices(applicationDate, productId,
				brandId);
				Assertions.assertNotNull(ResponseService);
				Assertions.assertNotNull(ResponseService.getBody());
				assertEquals(HttpStatus.OK, ResponseService.getStatusCode());
	}
	
}
