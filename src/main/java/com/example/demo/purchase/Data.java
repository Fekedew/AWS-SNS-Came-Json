
package com.example.demo.purchase;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Data {

    @SerializedName("purchaseOrder")
    private PurchaseOrder mPurchaseOrder;

    public PurchaseOrder getPurchaseOrder() {
        return mPurchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        mPurchaseOrder = purchaseOrder;
    }

}
