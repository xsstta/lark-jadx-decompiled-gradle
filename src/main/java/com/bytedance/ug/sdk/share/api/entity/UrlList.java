package com.bytedance.ug.sdk.share.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class UrlList implements Parcelable, Serializable {
    public static final Parcelable.Creator<UrlList> CREATOR = new Parcelable.Creator<UrlList>() {
        /* class com.bytedance.ug.sdk.share.api.entity.UrlList.C208151 */

        /* renamed from: a */
        public UrlList[] newArray(int i) {
            return new UrlList[i];
        }

        /* renamed from: a */
        public UrlList createFromParcel(Parcel parcel) {
            return new UrlList(parcel);
        }
    };
    @SerializedName("url")
    public String mUrl;

    public int describeContents() {
        return 0;
    }

    public UrlList() {
    }

    protected UrlList(Parcel parcel) {
        this.mUrl = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUrl);
    }
}
