package co.capitole.inditex.services.imp;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.capitole.inditex.entity.BrandsEntity;
import co.capitole.inditex.entity.PricesEntity;
import co.capitole.inditex.model.ResponseService;
import co.capitole.inditex.repository.BrandsRepository;
import co.capitole.inditex.repository.PricesRepository;
import co.capitole.inditex.services.IPrices;

@Service
public class GetPricesServices implements IPrices {

	@Autowired
	PricesRepository pricesRepository;

	@Autowired
	BrandsRepository brandsRepository;

	public ResponseService getPrices(LocalDateTime applicationDate, int productId, int brandId) {
		List<PricesEntity> listPrices = (List<PricesEntity>) pricesRepository.findAll();
		List<BrandsEntity> listBrands = (List<BrandsEntity>) brandsRepository.findAll();

		listPrices = listPrices.stream().filter(
				obj -> applicationDate.isAfter(obj.getStartDate()) && applicationDate.isBefore(obj.getEndDate()))
				.toList();

		if (listPrices.size() >= 2) {
			listPrices = listPrices.stream().filter(obj -> obj.getPriority() == 1).toList();
		}

		return new ResponseService.ResponseServiceBuilder().productId(listPrices.get(0).getProductId())
				.brandId(listBrands.get(listPrices.get(0).getBrandId() - 1).getDesc())
				.priceList(listPrices.get(0).getPriceList())
				.startDate(listPrices.get(0).getStartDate() + "-" + listPrices.get(0).getEndDate())
				.price(listPrices.get(0).getPrice()).builder();
	}
}