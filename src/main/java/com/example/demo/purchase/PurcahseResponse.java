
package com.example.demo.purchase;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class PurcahseResponse {

    @SerializedName("data")
    private Data mData;
    @SerializedName("datacontenttype")
    private String mDatacontenttype;
    @SerializedName("id")
    private String mId;
    @SerializedName("source")
    private String mSource;
    @SerializedName("specversion")
    private String mSpecversion;
    @SerializedName("subject")
    private String mSubject;
    @SerializedName("time")
    private String mTime;
    @SerializedName("type")
    private String mType;

    public Data getData() {
        return mData;
    }

    public void setData(Data data) {
        mData = data;
    }

    public String getDatacontenttype() {
        return mDatacontenttype;
    }

    public void setDatacontenttype(String datacontenttype) {
        mDatacontenttype = datacontenttype;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getSource() {
        return mSource;
    }

    public void setSource(String source) {
        mSource = source;
    }

    public String getSpecversion() {
        return mSpecversion;
    }

    public void setSpecversion(String specversion) {
        mSpecversion = specversion;
    }

    public String getSubject() {
        return mSubject;
    }

    public void setSubject(String subject) {
        mSubject = subject;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        mTime = time;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
