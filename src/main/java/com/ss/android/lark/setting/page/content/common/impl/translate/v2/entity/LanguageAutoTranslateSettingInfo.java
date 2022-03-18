package com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class LanguageAutoTranslateSettingInfo implements Parcelable, AbstractC54376b<C54377c> {
    public static final Parcelable.Creator<LanguageAutoTranslateSettingInfo> CREATOR = new Parcelable.Creator<LanguageAutoTranslateSettingInfo>() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageAutoTranslateSettingInfo.C543731 */

        /* renamed from: a */
        public LanguageAutoTranslateSettingInfo[] newArray(int i) {
            return new LanguageAutoTranslateSettingInfo[i];
        }

        /* renamed from: a */
        public LanguageAutoTranslateSettingInfo createFromParcel(Parcel parcel) {
            return new LanguageAutoTranslateSettingInfo(parcel);
        }
    };

    /* renamed from: a */
    private String f134498a;

    /* renamed from: b */
    private String f134499b;

    /* renamed from: c */
    private String f134500c;

    /* renamed from: d */
    private C54377c f134501d;

    public int describeContents() {
        return 0;
    }

    public LanguageAutoTranslateSettingInfo() {
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b
    /* renamed from: a */
    public String mo185939a() {
        return this.f134498a;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b
    /* renamed from: b */
    public String mo185943b() {
        return this.f134499b;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b
    /* renamed from: c */
    public String mo185945c() {
        return this.f134500c;
    }

    /* renamed from: e */
    public C54377c mo185947d() {
        return this.f134501d;
    }

    public String toString() {
        return this.f134501d.toString();
    }

    /* renamed from: a */
    public void mo185941a(C54377c cVar) {
        this.f134501d = cVar;
    }

    /* renamed from: b */
    public void mo185944b(String str) {
        this.f134499b = str;
    }

    /* renamed from: c */
    public void mo185946c(String str) {
        this.f134500c = str;
    }

    protected LanguageAutoTranslateSettingInfo(Parcel parcel) {
        this.f134498a = parcel.readString();
        this.f134499b = parcel.readString();
        this.f134500c = parcel.readString();
        this.f134501d = C54377c.m211101a(parcel.readInt());
    }

    /* renamed from: a */
    public void mo185942a(String str) {
        this.f134498a = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f134498a);
        parcel.writeString(this.f134499b);
        parcel.writeString(this.f134500c);
        parcel.writeInt(this.f134501d.mo185982g());
    }
}
