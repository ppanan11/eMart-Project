package com.emart.jpa.service;

import java.util.List;

public interface PurchaseService {

    /**
     * get a list of a user purchase history of for a seller
     */

    List getReportForSeller(String username);
}
