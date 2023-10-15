
package com.example.demo.purchase;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ScheduleLine {

    @SerializedName("lineCounter")
    private String mLineCounter;
    @SerializedName("quantity")
    private String mQuantity;

    public String getLineCounter() {
        return mLineCounter;
    }

    public void setLineCounter(String lineCounter) {
        mLineCounter = lineCounter;
    }

    public String getQuantity() {
        return mQuantity;
    }

    public void setQuantity(String quantity) {
        mQuantity = quantity;
    }

}
