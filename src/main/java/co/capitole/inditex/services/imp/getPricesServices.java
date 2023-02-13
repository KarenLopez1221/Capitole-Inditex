package co.capitole.inditex.services.imp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.capitole.inditex.entity.BrandsEntity;
import co.capitole.inditex.entity.PricesEntity;
import co.capitole.inditex.model.DatesDto;
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
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    LocalDateTime dateTime = LocalDateTime.parse(applicationDate, formatter);

    List<PricesEntity> listPrices = (List<PricesEntity>) pricesRepository.findAll();
    List<BrandsEntity> listBrands = (List<BrandsEntity>) brandsRepository.findAll();
    ResponseServiceDTO responseServiceDTO = new ResponseServiceDTO();
    List<PricesEntity> listDate = new ArrayList<>();
    for (PricesEntity prices : listPrices) {
      DatesDto fechas = new DatesDto(prices.getStartDate(), prices.getEndDate(), prices.getPriority());

      if (dateTime.isAfter(fechas.getStartDate()) && dateTime.isBefore(fechas.getEndDate())) {
        responseServiceDTO = new ResponseServiceDTO.ResponseServiceBuilder()
            .ProductId(prices.getProductId())
            .BrandId(listBrands.get(prices.getBrandId() - 1).getDesc())
            .PriceList(prices.getPriceList())
            .StartDate(prices.getStartDate() + "-" + prices.getEndDate())
            .Price(prices.getPrice()).builder();
        listDate.add(prices);
      }
    }
    for (PricesEntity pricesEntity : listDate) {
      if (pricesEntity.getPriority() == 1) {
        responseServiceDTO = new ResponseServiceDTO.ResponseServiceBuilder()
            .ProductId(pricesEntity.getProductId())
            .BrandId(listBrands.get(pricesEntity.getBrandId() - 1).getDesc())
            .PriceList(pricesEntity.getPriceList())
            .StartDate(pricesEntity.getStartDate() + "-" + pricesEntity.getEndDate())
            .Price(pricesEntity.getPrice()).builder();
      }
    }
    return responseServiceDTO;
  }
}