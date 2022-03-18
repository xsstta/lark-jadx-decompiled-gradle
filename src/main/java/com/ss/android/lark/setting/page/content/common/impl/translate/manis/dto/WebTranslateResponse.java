package com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class WebTranslateResponse implements Parcelable {
    public static final Parcelable.Creator<WebTranslateResponse> CREATOR = new Parcelable.Creator<WebTranslateResponse>() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.WebTranslateResponse.C542671 */

        /* renamed from: a */
        public WebTranslateResponse[] newArray(int i) {
            return new WebTranslateResponse[i];
        }

        /* renamed from: a */
        public WebTranslateResponse createFromParcel(Parcel parcel) {
            return new WebTranslateResponse(parcel);
        }
    };

    /* renamed from: a */
    private final List<String> f134326a;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public List<String> mo185749a() {
        return this.f134326a;
    }

    public WebTranslateResponse(List<String> list) {
        this.f134326a = list;
    }

    protected WebTranslateResponse(Parcel parcel) {
        this.f134326a = parcel.createStringArrayList();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f134326a);
    }
}
