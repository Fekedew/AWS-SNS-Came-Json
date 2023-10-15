
package com.example.demo.purchase;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class PurchaseOrder {

    @SerializedName("header")
    private Header mHeader;
    @SerializedName("line")
    private List<Line> mLine;

    public Header getHeader() {
        return mHeader;
    }

    public void setHeader(Header header) {
        mHeader = header;
    }

    public List<Line> getLine() {
        return mLine;
    }

    public void setLine(List<Line> line) {
        mLine = line;
    }

}
