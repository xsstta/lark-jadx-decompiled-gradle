package com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.framework.callback.Entity.ErrorResult;

public class ParcelableError implements Parcelable {
    public static final Parcelable.Creator<ParcelableError> CREATOR = new Parcelable.Creator<ParcelableError>() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableError.C542621 */

        /* renamed from: a */
        public ParcelableError[] newArray(int i) {
            return new ParcelableError[i];
        }

        /* renamed from: a */
        public ParcelableError createFromParcel(Parcel parcel) {
            return new ParcelableError(parcel);
        }
    };

    /* renamed from: a */
    private final int f134310a;

    /* renamed from: b */
    private final String f134311b;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public ErrorResult mo185697a() {
        return new ErrorResult(this.f134310a, this.f134311b);
    }

    /* renamed from: a */
    public static ParcelableError m210683a(ErrorResult errorResult) {
        return new ParcelableError(errorResult);
    }

    public ParcelableError(Parcel parcel) {
        this.f134310a = parcel.readInt();
        this.f134311b = parcel.readString();
    }

    public ParcelableError(ErrorResult errorResult) {
        this.f134310a = errorResult.getErrorCode();
        this.f134311b = errorResult.getMessage();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f134310a);
        parcel.writeString(this.f134311b);
    }
}
