package com.chihab.springbootbooksellerNew1.service;

import com.chihab.springbootbooksellerNew1.model.PurchaseHistory;
import com.chihab.springbootbooksellerNew1.repository.IBookRepository;
import com.chihab.springbootbooksellerNew1.repository.IPurchaseRepository;
import com.chihab.springbootbooksellerNew1.repository.Projection.IPurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryImp implements IPurchaseHistory {

    @Autowired
    private IPurchaseRepository purchaseRepository;

    @Override
    public PurchaseHistory savePurchase(PurchaseHistory purchaseHistory){
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchaseHistory);

    }
    @Override
    public List<IPurchaseItem> findPurchaseItemOfUser(Long userId){
        return purchaseRepository.findAllPurchaseOfUser(userId);
    }
}
