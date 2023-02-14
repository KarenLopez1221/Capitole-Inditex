package co.capitole.inditex.services;

import java.time.LocalDateTime;

import co.capitole.inditex.model.ResponseService;

public interface IPrices {

	public ResponseService getPrices(LocalDateTime applicationDate, int productId, int brandId);
}
