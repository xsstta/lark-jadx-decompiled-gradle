package com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableTranslateSettingConfig implements Parcelable {
    public static final Parcelable.Creator<ParcelableTranslateSettingConfig> CREATOR = new Parcelable.Creator<ParcelableTranslateSettingConfig>() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableTranslateSettingConfig.C542641 */

        /* renamed from: a */
        public ParcelableTranslateSettingConfig[] newArray(int i) {
            return new ParcelableTranslateSettingConfig[i];
        }

        /* renamed from: a */
        public ParcelableTranslateSettingConfig createFromParcel(Parcel parcel) {
            return new ParcelableTranslateSettingConfig(parcel);
        }
    };

    /* renamed from: a */
    ParcelableLanguageInfo f134315a;

    /* renamed from: b */
    ParcelableLanguageInfo f134316b;

    /* renamed from: c */
    String f134317c;

    /* renamed from: d */
    boolean f134318d;

    /* renamed from: e */
    boolean f134319e;

    /* renamed from: f */
    boolean f134320f;

    public int describeContents() {
        return 0;
    }

    public ParcelableTranslateSettingConfig() {
    }

    /* renamed from: a */
    public ParcelableLanguageInfo mo185715a() {
        return this.f134315a;
    }

    /* renamed from: b */
    public ParcelableLanguageInfo mo185719b() {
        return this.f134316b;
    }

    /* renamed from: c */
    public String mo185722c() {
        return this.f134317c;
    }

    /* renamed from: d */
    public boolean mo185724d() {
        return this.f134318d;
    }

    /* renamed from: e */
    public boolean mo185726e() {
        return this.f134319e;
    }

    /* renamed from: f */
    public boolean mo185727f() {
        return this.f134320f;
    }

    /* renamed from: a */
    public void mo185716a(ParcelableLanguageInfo parcelableLanguageInfo) {
        this.f134315a = parcelableLanguageInfo;
    }

    /* renamed from: b */
    public void mo185720b(ParcelableLanguageInfo parcelableLanguageInfo) {
        this.f134316b = parcelableLanguageInfo;
    }

    /* renamed from: c */
    public void mo185723c(boolean z) {
        this.f134320f = z;
    }

    /* renamed from: a */
    public void mo185717a(String str) {
        this.f134317c = str;
    }

    /* renamed from: b */
    public void mo185721b(boolean z) {
        this.f134319e = z;
    }

    /* renamed from: a */
    public void mo185718a(boolean z) {
        this.f134318d = z;
    }

    protected ParcelableTranslateSettingConfig(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f134315a = (ParcelableLanguageInfo) parcel.readParcelable(ParcelableLanguageInfo.class.getClassLoader());
        this.f134316b = (ParcelableLanguageInfo) parcel.readParcelable(ParcelableLanguageInfo.class.getClassLoader());
        this.f134317c = parcel.readString();
        boolean z3 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f134318d = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f134319e = z2;
        this.f134320f = parcel.readByte() == 0 ? false : z3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f134315a, i);
        parcel.writeParcelable(this.f134316b, i);
        parcel.writeString(this.f134317c);
        parcel.writeByte(this.f134318d ? (byte) 1 : 0);
        parcel.writeByte(this.f134319e ? (byte) 1 : 0);
        parcel.writeByte(this.f134320f ? (byte) 1 : 0);
    }
}
