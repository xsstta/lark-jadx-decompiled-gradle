package com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableLanguageInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableLanguageInfo> CREATOR = new Parcelable.Creator<ParcelableLanguageInfo>() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableLanguageInfo.C542631 */

        /* renamed from: a */
        public ParcelableLanguageInfo[] newArray(int i) {
            return new ParcelableLanguageInfo[i];
        }

        /* renamed from: a */
        public ParcelableLanguageInfo createFromParcel(Parcel parcel) {
            return new ParcelableLanguageInfo(parcel);
        }
    };

    /* renamed from: a */
    private String f134312a;

    /* renamed from: b */
    private String f134313b;

    /* renamed from: c */
    private String f134314c;

    public int describeContents() {
        return 0;
    }

    public ParcelableLanguageInfo() {
    }

    /* renamed from: a */
    public String mo185704a() {
        return this.f134312a;
    }

    /* renamed from: b */
    public String mo185706b() {
        return this.f134313b;
    }

    /* renamed from: c */
    public void mo185708c(String str) {
        this.f134314c = str;
    }

    /* renamed from: a */
    public void mo185705a(String str) {
        this.f134312a = str;
    }

    /* renamed from: b */
    public void mo185707b(String str) {
        this.f134313b = str;
    }

    protected ParcelableLanguageInfo(Parcel parcel) {
        this.f134312a = parcel.readString();
        this.f134313b = parcel.readString();
        this.f134314c = parcel.readString();
    }

    public ParcelableLanguageInfo(String str, String str2) {
        this.f134312a = str;
        this.f134313b = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f134312a);
        parcel.writeString(this.f134313b);
        parcel.writeString(this.f134314c);
    }
}
