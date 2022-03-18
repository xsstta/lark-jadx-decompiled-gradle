package com.ss.android.lark.image.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.framework.callback.Entity.ErrorResult;

public class ErrorResultWrapper implements Parcelable {
    public static final Parcelable.Creator<ErrorResultWrapper> CREATOR = new Parcelable.Creator<ErrorResultWrapper>() {
        /* class com.ss.android.lark.image.service.ErrorResultWrapper.C389231 */

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
    public ErrorResult f100013a;

    public int describeContents() {
        return 0;
    }

    public ErrorResultWrapper(ErrorResult errorResult) {
        this.f100013a = errorResult;
    }

    protected ErrorResultWrapper(Parcel parcel) {
        this.f100013a = (ErrorResult) parcel.readSerializable();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f100013a);
    }
}
