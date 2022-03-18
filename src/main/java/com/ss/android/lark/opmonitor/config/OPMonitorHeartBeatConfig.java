package com.ss.android.lark.opmonitor.config;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

public class OPMonitorHeartBeatConfig implements Parcelable {
    public static final Parcelable.Creator<OPMonitorHeartBeatConfig> CREATOR = new Parcelable.Creator<OPMonitorHeartBeatConfig>() {
        /* class com.ss.android.lark.opmonitor.config.OPMonitorHeartBeatConfig.C489091 */

        /* renamed from: a */
        public OPMonitorHeartBeatConfig[] newArray(int i) {
            return new OPMonitorHeartBeatConfig[i];
        }

        /* renamed from: a */
        public OPMonitorHeartBeatConfig createFromParcel(Parcel parcel) {
            return new OPMonitorHeartBeatConfig(parcel);
        }
    };

    /* renamed from: a */
    private int f122856a;

    /* renamed from: b */
    private boolean f122857b;

    /* renamed from: c */
    private int f122858c = 240;

    public int describeContents() {
        return 0;
    }

    /* renamed from: c */
    public int mo170760c() {
        return this.f122858c;
    }

    public OPMonitorHeartBeatConfig() {
    }

    /* renamed from: b */
    public boolean mo170759b() {
        return this.f122857b;
    }

    /* renamed from: a */
    public int mo170755a() {
        if (this.f122856a <= 0) {
            mo170756a(30);
        }
        return this.f122856a;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f122856a), Boolean.valueOf(this.f122857b), Integer.valueOf(this.f122858c));
    }

    public String toString() {
        return "OPMonitorHeartBeatConfig{heartBeatInterval=" + this.f122856a + ", enableHeartBeatMonitor=" + this.f122857b + ", maxReportCount=" + this.f122858c + '}';
    }

    /* renamed from: a */
    public void mo170756a(int i) {
        this.f122856a = i;
    }

    /* renamed from: b */
    public void mo170758b(int i) {
        this.f122858c = i;
    }

    /* renamed from: a */
    public void mo170757a(boolean z) {
        this.f122857b = z;
    }

    public OPMonitorHeartBeatConfig(Parcel parcel) {
        this.f122856a = parcel.readInt();
        this.f122857b = parcel.readInt() != 1 ? false : true;
        this.f122858c = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OPMonitorHeartBeatConfig oPMonitorHeartBeatConfig = (OPMonitorHeartBeatConfig) obj;
        if (this.f122856a == oPMonitorHeartBeatConfig.f122856a && this.f122857b == oPMonitorHeartBeatConfig.f122857b && this.f122858c == oPMonitorHeartBeatConfig.f122858c) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f122856a);
        if (this.f122857b) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f122858c);
    }
}
