package co.capitole.inditex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.capitole.inditex.model.ResponseServiceDTO;
import co.capitole.inditex.services.IPrices;

@RestController
@RequestMapping(path = "${context.path}")
public class ApiRestController {

    @Autowired
    IPrices iPrices;

    @GetMapping("getPrices")
    public ResponseEntity<ResponseServiceDTO> getPrices(
            @RequestParam("applicationDate") String applicationDate,
            @RequestParam("productId") int productId,
            @RequestParam("brandId") int brandId) {
        return new ResponseEntity<ResponseServiceDTO>(iPrices.getPrices(applicationDate, productId, brandId),
                HttpStatus.OK);
    }
}
