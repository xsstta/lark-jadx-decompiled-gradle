package com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class DetectResponse implements Parcelable {
    public static final Parcelable.Creator<DetectResponse> CREATOR = new Parcelable.Creator<DetectResponse>() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.DetectResponse.C542601 */

        /* renamed from: a */
        public DetectResponse[] newArray(int i) {
            return new DetectResponse[i];
        }

        /* renamed from: a */
        public DetectResponse createFromParcel(Parcel parcel) {
            return new DetectResponse(parcel);
        }
    };

    /* renamed from: a */
    private final List<ParcelableLanguageInfo> f134308a;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public List<ParcelableLanguageInfo> mo185683a() {
        return this.f134308a;
    }

    public DetectResponse(List<ParcelableLanguageInfo> list) {
        this.f134308a = list;
    }

    protected DetectResponse(Parcel parcel) {
        this.f134308a = parcel.createTypedArrayList(ParcelableLanguageInfo.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f134308a);
    }
}
