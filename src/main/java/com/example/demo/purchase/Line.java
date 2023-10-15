
package com.example.demo.purchase;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Line {

    @SerializedName("actionCode")
    private String mActionCode;
    @SerializedName("deliveryQuantity")
    private String mDeliveryQuantity;
    @SerializedName("deliveryUnit")
    private String mDeliveryUnit;
    @SerializedName("identification")
    private Identification mIdentification;
    @SerializedName("lineNumber")
    private String mLineNumber;
    @SerializedName("numberOfPallets")
    private String mNumberOfPallets;
    @SerializedName("quantity")
    private Double mQuantity;
    @SerializedName("scheduleLine")
    private List<ScheduleLine> mScheduleLine;
    @SerializedName("unit")
    private String mUnit;

    public String getActionCode() {
        return mActionCode;
    }

    public void setActionCode(String actionCode) {
        mActionCode = actionCode;
    }

    public String getDeliveryQuantity() {
        return mDeliveryQuantity;
    }

    public void setDeliveryQuantity(String deliveryQuantity) {
        mDeliveryQuantity = deliveryQuantity;
    }

    public String getDeliveryUnit() {
        return mDeliveryUnit;
    }

    public void setDeliveryUnit(String deliveryUnit) {
        mDeliveryUnit = deliveryUnit;
    }

    public Identification getIdentification() {
        return mIdentification;
    }

    public void setIdentification(Identification identification) {
        mIdentification = identification;
    }

    public String getLineNumber() {
        return mLineNumber;
    }

    public void setLineNumber(String lineNumber) {
        mLineNumber = lineNumber;
    }

    public String getNumberOfPallets() {
        return mNumberOfPallets;
    }

    public void setNumberOfPallets(String numberOfPallets) {
        mNumberOfPallets = numberOfPallets;
    }

    public Double getQuantity() {
        return mQuantity;
    }

    public void setQuantity(Double quantity) {
        mQuantity = quantity;
    }

    public List<ScheduleLine> getScheduleLine() {
        return mScheduleLine;
    }

    public void setScheduleLine(List<ScheduleLine> scheduleLine) {
        mScheduleLine = scheduleLine;
    }

    public String getUnit() {
        return mUnit;
    }

    public void setUnit(String unit) {
        mUnit = unit;
    }

}
