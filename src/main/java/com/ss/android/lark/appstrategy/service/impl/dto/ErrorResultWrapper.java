package com.ss.android.lark.appstrategy.service.impl.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.framework.callback.Entity.ErrorResult;

public class ErrorResultWrapper implements Parcelable {
    public static final Parcelable.Creator<ErrorResultWrapper> CREATOR = new Parcelable.Creator<ErrorResultWrapper>() {
        /* class com.ss.android.lark.appstrategy.service.impl.dto.ErrorResultWrapper.C292761 */

        /* renamed from: a */
        public ErrorResultWrapper[] newArray(int i) {
            return new ErrorResultWrapper[i];
        }

        /* renamed from: a */
        public ErrorResultWrapper createFromParcel(Parcel parcel) {
            return new ErrorResultWrapper(parcel);
        }
    };

    /* renamed from: a */
    public ErrorResult f73297a;

    public int describeContents() {
        return 0;
    }

    public ErrorResultWrapper(ErrorResult errorResult) {
        this.f73297a = errorResult;
    }

    protected ErrorResultWrapper(Parcel parcel) {
        this.f73297a = (ErrorResult) parcel.readSerializable();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f73297a);
    }
}
