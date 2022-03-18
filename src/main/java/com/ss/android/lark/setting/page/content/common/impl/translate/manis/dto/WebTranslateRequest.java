package com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto;

import android.os.Parcel;
import android.os.Parcelable;

public class WebTranslateRequest implements Parcelable {
    public static final Parcelable.Creator<WebTranslateRequest> CREATOR = new Parcelable.Creator<WebTranslateRequest>() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.WebTranslateRequest.C542661 */

        /* renamed from: a */
        public WebTranslateRequest[] newArray(int i) {
            return new WebTranslateRequest[i];
        }

        /* renamed from: a */
        public WebTranslateRequest createFromParcel(Parcel parcel) {
            return new WebTranslateRequest(parcel);
        }
    };

    /* renamed from: a */
    String f134323a;

    /* renamed from: b */
    String f134324b;

    /* renamed from: c */
    private final String[] f134325c;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo185740a() {
        return this.f134323a;
    }

    /* renamed from: b */
    public String mo185741b() {
        return this.f134324b;
    }

    /* renamed from: c */
    public String[] mo185742c() {
        return this.f134325c;
    }

    protected WebTranslateRequest(Parcel parcel) {
        this.f134323a = parcel.readString();
        this.f134324b = parcel.readString();
        this.f134325c = parcel.createStringArray();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f134323a);
        parcel.writeString(this.f134324b);
        parcel.writeStringArray(this.f134325c);
    }

    public WebTranslateRequest(String str, String str2, String[] strArr) {
        this.f134323a = str;
        this.f134324b = str2;
        this.f134325c = strArr;
    }
}
