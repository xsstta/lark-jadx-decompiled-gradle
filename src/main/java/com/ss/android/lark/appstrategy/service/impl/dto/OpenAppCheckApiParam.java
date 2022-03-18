package com.ss.android.lark.appstrategy.service.impl.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class OpenAppCheckApiParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<OpenAppCheckApiParam> CREATOR = new Parcelable.Creator<OpenAppCheckApiParam>() {
        /* class com.ss.android.lark.appstrategy.service.impl.dto.OpenAppCheckApiParam.C292781 */

        /* renamed from: a */
        public OpenAppCheckApiParam[] newArray(int i) {
            return new OpenAppCheckApiParam[i];
        }

        /* renamed from: a */
        public OpenAppCheckApiParam createFromParcel(Parcel parcel) {
            return new OpenAppCheckApiParam(parcel);
        }
    };
    public String mAppId;
    public int mCode;

    public int describeContents() {
        return 0;
    }

    public OpenAppCheckApiParam() {
    }

    protected OpenAppCheckApiParam(Parcel parcel) {
        this.mAppId = parcel.readString();
        this.mCode = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAppId);
        parcel.writeInt(this.mCode);
    }
}
