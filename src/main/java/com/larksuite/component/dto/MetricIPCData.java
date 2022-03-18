package com.larksuite.component.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetricIPCData implements Parcelable {
    public static final Parcelable.Creator<MetricIPCData> CREATOR = new Parcelable.Creator<MetricIPCData>() {
        /* class com.larksuite.component.dto.MetricIPCData.C241511 */

        /* renamed from: a */
        public MetricIPCData[] newArray(int i) {
            return new MetricIPCData[i];
        }

        /* renamed from: a */
        public MetricIPCData createFromParcel(Parcel parcel) {
            return new MetricIPCData(parcel);
        }
    };

    /* renamed from: a */
    private long f59726a;

    /* renamed from: b */
    private boolean f59727b;

    /* renamed from: c */
    private int f59728c;

    /* renamed from: d */
    private int f59729d;

    /* renamed from: e */
    private List<Integer> f59730e;

    /* renamed from: f */
    private Map<String, Object> f59731f;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public long mo86677a() {
        return this.f59726a;
    }

    /* renamed from: b */
    public boolean mo86678b() {
        return this.f59727b;
    }

    /* renamed from: c */
    public int mo86679c() {
        return this.f59728c;
    }

    /* renamed from: d */
    public int mo86680d() {
        return this.f59729d;
    }

    /* renamed from: e */
    public List<Integer> mo86682e() {
        return this.f59730e;
    }

    /* renamed from: f */
    public Map<String, Object> mo86683f() {
        return this.f59731f;
    }

    protected MetricIPCData(Parcel parcel) {
        this.f59729d = parcel.readInt();
        this.f59727b = parcel.readInt() != 1 ? false : true;
        this.f59728c = parcel.readInt();
        this.f59726a = parcel.readLong();
        this.f59730e = parcel.readArrayList(ClassLoader.getSystemClassLoader());
        this.f59731f = parcel.readHashMap(ClassLoader.getSystemClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f59730e == null) {
            this.f59730e = new ArrayList();
        }
        if (this.f59731f == null) {
            this.f59731f = new HashMap();
        }
        parcel.writeInt(this.f59729d);
        parcel.writeInt(this.f59727b ? 1 : 0);
        parcel.writeInt(this.f59728c);
        parcel.writeLong(this.f59726a);
        parcel.writeArray(this.f59730e.toArray());
        parcel.writeMap(this.f59731f);
    }

    public MetricIPCData(boolean z, long j, int i, int i2, List<Integer> list, Map<String, Object> map) {
        this.f59727b = z;
        this.f59726a = j;
        this.f59728c = i;
        this.f59729d = i2;
        this.f59730e = list;
        this.f59731f = map;
    }
}
