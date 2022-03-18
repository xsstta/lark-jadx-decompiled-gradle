package com.ss.android.lark.opmonitor.model;

import android.os.Parcel;
import android.os.Parcelable;

public class OPMonitorHeartBeatMonitorData implements Parcelable {
    public static final Parcelable.Creator<OPMonitorHeartBeatMonitorData> CREATOR = new Parcelable.Creator<OPMonitorHeartBeatMonitorData>() {
        /* class com.ss.android.lark.opmonitor.model.OPMonitorHeartBeatMonitorData.C489171 */

        /* renamed from: a */
        public OPMonitorHeartBeatMonitorData[] newArray(int i) {
            return new OPMonitorHeartBeatMonitorData[i];
        }

        /* renamed from: a */
        public OPMonitorHeartBeatMonitorData createFromParcel(Parcel parcel) {
            return new OPMonitorHeartBeatMonitorData(parcel);
        }
    };

    /* renamed from: a */
    private String f122885a;

    /* renamed from: b */
    private String f122886b;

    /* renamed from: c */
    private int f122887c;

    /* renamed from: d */
    private int f122888d;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo170783a() {
        return this.f122885a;
    }

    /* renamed from: b */
    public String mo170785b() {
        return this.f122886b;
    }

    /* renamed from: c */
    public int mo170786c() {
        return this.f122887c;
    }

    /* renamed from: e */
    public int mo170789e() {
        return this.f122888d;
    }

    /* renamed from: d */
    public void mo170787d() {
        this.f122888d++;
    }

    /* renamed from: a */
    public void mo170784a(int i) {
        this.f122887c = i;
    }

    protected OPMonitorHeartBeatMonitorData(Parcel parcel) {
        this.f122886b = parcel.readString();
        this.f122885a = parcel.readString();
        this.f122887c = parcel.readInt();
        this.f122888d = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f122886b);
        parcel.writeString(this.f122885a);
        parcel.writeInt(this.f122887c);
        parcel.writeInt(this.f122888d);
    }

    public OPMonitorHeartBeatMonitorData(String str, String str2, int i) {
        this.f122886b = str;
        this.f122885a = str2;
        this.f122887c = i;
    }
}
