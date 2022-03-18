package com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class GetTargetLangListResponse implements Parcelable {
    public static final Parcelable.Creator<GetTargetLangListResponse> CREATOR = new Parcelable.Creator<GetTargetLangListResponse>() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.GetTargetLangListResponse.C542611 */

        /* renamed from: a */
        public GetTargetLangListResponse[] newArray(int i) {
            return new GetTargetLangListResponse[i];
        }

        /* renamed from: a */
        public GetTargetLangListResponse createFromParcel(Parcel parcel) {
            return new GetTargetLangListResponse(parcel);
        }
    };

    /* renamed from: a */
    private final List<ParcelableLanguageInfo> f134309a;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public List<ParcelableLanguageInfo> mo185690a() {
        return this.f134309a;
    }

    public GetTargetLangListResponse(List<ParcelableLanguageInfo> list) {
        this.f134309a = list;
    }

    protected GetTargetLangListResponse(Parcel parcel) {
        this.f134309a = parcel.createTypedArrayList(ParcelableLanguageInfo.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f134309a);
    }
}
