package com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class LanguageDisplaySettingInfo implements Parcelable, AbstractC54376b<LanguageDisplayRule> {
    public static final Parcelable.Creator<LanguageDisplaySettingInfo> CREATOR = new Parcelable.Creator<LanguageDisplaySettingInfo>() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageDisplaySettingInfo.C543741 */

        /* renamed from: a */
        public LanguageDisplaySettingInfo[] newArray(int i) {
            return new LanguageDisplaySettingInfo[i];
        }

        /* renamed from: a */
        public LanguageDisplaySettingInfo createFromParcel(Parcel parcel) {
            return new LanguageDisplaySettingInfo(parcel);
        }
    };

    /* renamed from: a */
    private String f134502a;

    /* renamed from: b */
    private String f134503b;

    /* renamed from: c */
    private String f134504c;

    /* renamed from: d */
    private LanguageDisplayRule f134505d;

    public int describeContents() {
        return 0;
    }

    public LanguageDisplaySettingInfo() {
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b
    /* renamed from: a */
    public String mo185939a() {
        return this.f134502a;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b
    /* renamed from: b */
    public String mo185943b() {
        return this.f134503b;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b
    /* renamed from: c */
    public String mo185945c() {
        return this.f134504c;
    }

    /* renamed from: e */
    public LanguageDisplayRule mo185947d() {
        return this.f134505d;
    }

    public String toString() {
        return this.f134505d.toString();
    }

    /* renamed from: a */
    public void mo185941a(LanguageDisplayRule languageDisplayRule) {
        this.f134505d = languageDisplayRule;
    }

    /* renamed from: b */
    public void mo185960b(String str) {
        this.f134503b = str;
    }

    /* renamed from: c */
    public void mo185961c(String str) {
        this.f134504c = str;
    }

    /* renamed from: a */
    public void mo185959a(String str) {
        this.f134502a = str;
    }

    protected LanguageDisplaySettingInfo(Parcel parcel) {
        LanguageDisplayRule languageDisplayRule;
        this.f134502a = parcel.readString();
        this.f134503b = parcel.readString();
        this.f134504c = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            languageDisplayRule = null;
        } else {
            languageDisplayRule = LanguageDisplayRule.values()[readInt];
        }
        this.f134505d = languageDisplayRule;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.f134502a);
        parcel.writeString(this.f134503b);
        parcel.writeString(this.f134504c);
        LanguageDisplayRule languageDisplayRule = this.f134505d;
        if (languageDisplayRule == null) {
            i2 = -1;
        } else {
            i2 = languageDisplayRule.ordinal();
        }
        parcel.writeInt(i2);
    }
}
