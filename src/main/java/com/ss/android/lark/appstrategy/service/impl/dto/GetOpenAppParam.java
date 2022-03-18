package com.ss.android.lark.appstrategy.service.impl.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class GetOpenAppParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<GetOpenAppParam> CREATOR = new Parcelable.Creator<GetOpenAppParam>() {
        /* class com.ss.android.lark.appstrategy.service.impl.dto.GetOpenAppParam.C292771 */

        /* renamed from: a */
        public GetOpenAppParam[] newArray(int i) {
            return new GetOpenAppParam[i];
        }

        /* renamed from: a */
        public GetOpenAppParam createFromParcel(Parcel parcel) {
            return new GetOpenAppParam(parcel);
        }
    };
    public String mAppId;

    public int describeContents() {
        return 0;
    }

    public GetOpenAppParam() {
    }

    protected GetOpenAppParam(Parcel parcel) {
        this.mAppId = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAppId);
    }
}
