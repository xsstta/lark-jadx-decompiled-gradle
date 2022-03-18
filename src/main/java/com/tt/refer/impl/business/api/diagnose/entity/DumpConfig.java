package com.tt.refer.impl.business.api.diagnose.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class DumpConfig implements Parcelable {
    public static final Parcelable.Creator<DumpConfig> CREATOR = new Parcelable.Creator<DumpConfig>() {
        /* class com.tt.refer.impl.business.api.diagnose.entity.DumpConfig.C678891 */

        /* renamed from: a */
        public DumpConfig[] newArray(int i) {
            return new DumpConfig[i];
        }

        /* renamed from: a */
        public DumpConfig createFromParcel(Parcel parcel) {
            return new DumpConfig(parcel);
        }
    };

    /* renamed from: a */
    private String f170985a;

    /* renamed from: b */
    private String f170986b;

    /* renamed from: c */
    private int f170987c;

    /* renamed from: d */
    private String f170988d;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo235516a() {
        return this.f170985a;
    }

    /* renamed from: b */
    public void mo235519b(String str) {
        this.f170988d = str;
    }

    public DumpConfig(String str) {
        this.f170985a = str;
    }

    /* renamed from: a */
    public void mo235517a(int i) {
        this.f170987c = i;
    }

    /* renamed from: a */
    public void mo235518a(String str) {
        this.f170986b = str;
    }

    protected DumpConfig(Parcel parcel) {
        this.f170985a = parcel.readString();
        this.f170986b = parcel.readString();
        this.f170987c = parcel.readInt();
        this.f170988d = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f170985a);
        parcel.writeString(this.f170986b);
        parcel.writeInt(this.f170987c);
        parcel.writeString(this.f170988d);
    }
}
