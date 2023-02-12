package co.capitole.inditex.services.imp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.capitole.inditex.entity.BrandsEntity;
import co.capitole.inditex.entity.PricesEntity;
import co.capitole.inditex.model.ResponseServiceDTO;
import co.capitole.inditex.repository.BrandsRepository;
import co.capitole.inditex.repository.PricesRepository;
import co.capitole.inditex.services.IPrices;

@Service
public class getPricesServices implements IPrices {

  @Autowired
  PricesRepository pricesRepository;

  @Autowired
  BrandsRepository brandsRepository;

  public ResponseServiceDTO getPrices(String applicationDate, int productId, int brandId) {
    List<PricesEntity> listPrices = (List<PricesEntity>) pricesRepository.findAll();
    List<BrandsEntity> listBrands = (List<BrandsEntity>) brandsRepository.findAll();
    ResponseServiceDTO responseServiceDTO = new ResponseServiceDTO();
    
    for (PricesEntity prices : listPrices) {
      responseServiceDTO = new ResponseServiceDTO.ResponseServiceBuilder()
          .ProductId(prices.getProductId())
          .BrandId(listBrands.get(prices.getBrandId()-1).getDesc())
          .PriceList(prices.getPriceList())
          .StartDate(prices.getStartDate() + "-" + prices.getEndDate())
          .Price(prices.getPrice()).builder();
    }
    return responseServiceDTO;
  }
}