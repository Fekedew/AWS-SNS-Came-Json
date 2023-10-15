
package com.example.demo.purchase;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Header {

    @SerializedName("actionCode")
    private String mActionCode;
    @SerializedName("deliveryDate")
    private String mDeliveryDate;
    @SerializedName("documentDate")
    private String mDocumentDate;
    @SerializedName("earliestDeliveryMoment")
    private String mEarliestDeliveryMoment;
    @SerializedName("goodsRecipient")
    private String mGoodsRecipient;
    @SerializedName("idocCreationDate")
    private String mIdocCreationDate;
    @SerializedName("latestDeliveryMoment")
    private String mLatestDeliveryMoment;
    @SerializedName("orderNumber")
    private String mOrderNumber;
    @SerializedName("orderType")
    private String mOrderType;
    @SerializedName("purchasingGroup")
    private String mPurchasingGroup;
    @SerializedName("receivingLocation")
    private String mReceivingLocation;
    @SerializedName("soldToParty")
    private String mSoldToParty;
    @SerializedName("supplierNumber")
    private String mSupplierNumber;

    public String getActionCode() {
        return mActionCode;
    }

    public void setActionCode(String actionCode) {
        mActionCode = actionCode;
    }

    public String getDeliveryDate() {
        return mDeliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        mDeliveryDate = deliveryDate;
    }

    public String getDocumentDate() {
        return mDocumentDate;
    }

    public void setDocumentDate(String documentDate) {
        mDocumentDate = documentDate;
    }

    public String getEarliestDeliveryMoment() {
        return mEarliestDeliveryMoment;
    }

    public void setEarliestDeliveryMoment(String earliestDeliveryMoment) {
        mEarliestDeliveryMoment = earliestDeliveryMoment;
    }

    public String getGoodsRecipient() {
        return mGoodsRecipient;
    }

    public void setGoodsRecipient(String goodsRecipient) {
        mGoodsRecipient = goodsRecipient;
    }

    public String getIdocCreationDate() {
        return mIdocCreationDate;
    }

    public void setIdocCreationDate(String idocCreationDate) {
        mIdocCreationDate = idocCreationDate;
    }

    public String getLatestDeliveryMoment() {
        return mLatestDeliveryMoment;
    }

    public void setLatestDeliveryMoment(String latestDeliveryMoment) {
        mLatestDeliveryMoment = latestDeliveryMoment;
    }

    public String getOrderNumber() {
        return mOrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        mOrderNumber = orderNumber;
    }

    public String getOrderType() {
        return mOrderType;
    }

    public void setOrderType(String orderType) {
        mOrderType = orderType;
    }

    public String getPurchasingGroup() {
        return mPurchasingGroup;
    }

    public void setPurchasingGroup(String purchasingGroup) {
        mPurchasingGroup = purchasingGroup;
    }

    public String getReceivingLocation() {
        return mReceivingLocation;
    }

    public void setReceivingLocation(String receivingLocation) {
        mReceivingLocation = receivingLocation;
    }

    public String getSoldToParty() {
        return mSoldToParty;
    }

    public void setSoldToParty(String soldToParty) {
        mSoldToParty = soldToParty;
    }

    public String getSupplierNumber() {
        return mSupplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        mSupplierNumber = supplierNumber;
    }

}
