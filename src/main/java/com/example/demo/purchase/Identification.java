
package com.example.demo.purchase;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Identification {

    @SerializedName("articleNumber")
    private String mArticleNumber;
    @SerializedName("ean")
    private String mEan;
    @SerializedName("supplierArticleNumber")
    private String mSupplierArticleNumber;

    public String getArticleNumber() {
        return mArticleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        mArticleNumber = articleNumber;
    }

    public String getEan() {
        return mEan;
    }

    public void setEan(String ean) {
        mEan = ean;
    }

    public String getSupplierArticleNumber() {
        return mSupplierArticleNumber;
    }

    public void setSupplierArticleNumber(String supplierArticleNumber) {
        mSupplierArticleNumber = supplierArticleNumber;
    }

}
