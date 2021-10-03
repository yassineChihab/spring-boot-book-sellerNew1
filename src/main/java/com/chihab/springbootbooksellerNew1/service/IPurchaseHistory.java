package com.chihab.springbootbooksellerNew1.service;

import com.chihab.springbootbooksellerNew1.model.PurchaseHistory;
import com.chihab.springbootbooksellerNew1.repository.Projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistory {
    PurchaseHistory savePurchase(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchaseItemOfUser(Long userId);
}
