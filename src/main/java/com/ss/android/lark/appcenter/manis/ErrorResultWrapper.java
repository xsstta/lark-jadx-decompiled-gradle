package com.ss.android.lark.appcenter.manis;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.framework.callback.Entity.ErrorResult;

public class ErrorResultWrapper implements Parcelable {
    public static final Parcelable.Creator<ErrorResultWrapper> CREATOR = new Parcelable.Creator<ErrorResultWrapper>() {
        /* class com.ss.android.lark.appcenter.manis.ErrorResultWrapper.C290991 */

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
    public ErrorResult f72913a;

    public int describeContents() {
        return 0;
    }

    public ErrorResultWrapper(ErrorResult errorResult) {
        this.f72913a = errorResult;
    }

    protected ErrorResultWrapper(Parcel parcel) {
        this.f72913a = (ErrorResult) parcel.readSerializable();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f72913a);
    }
}
