package com.reva.ecommerce.service;

import com.reva.ecommerce.dto.Purchase;
import com.reva.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
