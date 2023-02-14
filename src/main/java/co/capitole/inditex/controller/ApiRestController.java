package co.capitole.inditex.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.capitole.inditex.model.ResponseService;
import co.capitole.inditex.services.IPrices;

@RestController
@RequestMapping(path = "${context.path}")
public class ApiRestController {

	@Autowired
	IPrices iPrices;

	@GetMapping("getPrices")
	public ResponseEntity<ResponseService> getPrices(
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime applicationDate,
			@RequestParam("productId") int productId, @RequestParam("brandId") int brandId) {
		return new ResponseEntity<ResponseService>(iPrices.getPrices(applicationDate, productId, brandId),
				HttpStatus.OK);
	}
}
