package com.chihab.springbootbooksellerNew1.repository.Projection;

import java.time.LocalDateTime;

public interface IPurchaseItem {
        String getTitle();
        String getPrice();
        LocalDateTime getPurchaseTime();
}
