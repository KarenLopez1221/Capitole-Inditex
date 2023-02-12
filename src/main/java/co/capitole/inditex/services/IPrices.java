package co.capitole.inditex.services;

import co.capitole.inditex.model.ResponseServiceDTO;

public interface IPrices {

    public ResponseServiceDTO getPrices(String applicationDate, int productId,
            int brandId);
}
