package com.ss.android.lark.appstrategy.service.impl.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class UpdateOpenAppListHappenParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<UpdateOpenAppListHappenParam> CREATOR = new Parcelable.Creator<UpdateOpenAppListHappenParam>() {
        /* class com.ss.android.lark.appstrategy.service.impl.dto.UpdateOpenAppListHappenParam.C292801 */

        /* renamed from: a */
        public UpdateOpenAppListHappenParam[] newArray(int i) {
            return new UpdateOpenAppListHappenParam[i];
        }

        /* renamed from: a */
        public UpdateOpenAppListHappenParam createFromParcel(Parcel parcel) {
            return new UpdateOpenAppListHappenParam(parcel);
        }
    };
    public String mAppId;
    public String mBotId;
    public long mTime;

    public int describeContents() {
        return 0;
    }

    public UpdateOpenAppListHappenParam() {
    }

    protected UpdateOpenAppListHappenParam(Parcel parcel) {
        this.mAppId = parcel.readString();
        this.mBotId = parcel.readString();
        this.mTime = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAppId);
        parcel.writeString(this.mBotId);
        parcel.writeLong(this.mTime);
    }
}
