package com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto;

import android.os.Parcel;
import android.os.Parcelable;

public class DetectRequest implements ITransmissionParcelable {
    public static final Parcelable.Creator<DetectRequest> CREATOR = new Parcelable.Creator<DetectRequest>() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.DetectRequest.C542591 */

        /* renamed from: a */
        public DetectRequest[] newArray(int i) {
            return new DetectRequest[i];
        }

        /* renamed from: a */
        public DetectRequest createFromParcel(Parcel parcel) {
            return new DetectRequest(parcel);
        }
    };

    /* renamed from: a */
    private final String[] f134307a;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String[] mo185676a() {
        return this.f134307a;
    }

    public DetectRequest(String[] strArr) {
        this.f134307a = strArr;
    }

    protected DetectRequest(Parcel parcel) {
        this.f134307a = parcel.createStringArray();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.f134307a);
    }
}
