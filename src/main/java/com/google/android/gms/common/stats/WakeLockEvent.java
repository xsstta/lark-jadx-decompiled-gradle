package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C21803b();

    /* renamed from: a */
    private final int f53176a;

    /* renamed from: b */
    private final long f53177b;

    /* renamed from: c */
    private int f53178c;

    /* renamed from: d */
    private final String f53179d;

    /* renamed from: e */
    private final String f53180e;

    /* renamed from: f */
    private final String f53181f;

    /* renamed from: g */
    private final int f53182g;

    /* renamed from: h */
    private final List<String> f53183h;

    /* renamed from: i */
    private final String f53184i;

    /* renamed from: j */
    private final long f53185j;

    /* renamed from: k */
    private int f53186k;

    /* renamed from: l */
    private final String f53187l;

    /* renamed from: m */
    private final float f53188m;

    /* renamed from: n */
    private final long f53189n;

    /* renamed from: o */
    private final boolean f53190o;

    /* renamed from: p */
    private long f53191p;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f53176a = i;
        this.f53177b = j;
        this.f53178c = i2;
        this.f53179d = str;
        this.f53180e = str3;
        this.f53181f = str5;
        this.f53182g = i3;
        this.f53191p = -1;
        this.f53183h = list;
        this.f53184i = str2;
        this.f53185j = j2;
        this.f53186k = i4;
        this.f53187l = str4;
        this.f53188m = f;
        this.f53189n = j3;
        this.f53190o = z;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5, boolean z) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5, z);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: a */
    public final long mo73814a() {
        return this.f53177b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: b */
    public final int mo73815b() {
        return this.f53178c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: c */
    public final long mo73816c() {
        return this.f53191p;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53176a);
        SafeParcelWriter.writeLong(parcel, 2, mo73814a());
        SafeParcelWriter.writeString(parcel, 4, this.f53179d, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f53182g);
        SafeParcelWriter.writeStringList(parcel, 6, this.f53183h, false);
        SafeParcelWriter.writeLong(parcel, 8, this.f53185j);
        SafeParcelWriter.writeString(parcel, 10, this.f53180e, false);
        SafeParcelWriter.writeInt(parcel, 11, mo73815b());
        SafeParcelWriter.writeString(parcel, 12, this.f53184i, false);
        SafeParcelWriter.writeString(parcel, 13, this.f53187l, false);
        SafeParcelWriter.writeInt(parcel, 14, this.f53186k);
        SafeParcelWriter.writeFloat(parcel, 15, this.f53188m);
        SafeParcelWriter.writeLong(parcel, 16, this.f53189n);
        SafeParcelWriter.writeString(parcel, 17, this.f53181f, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.f53190o);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: d */
    public final String mo73817d() {
        String str;
        String str2 = this.f53179d;
        int i = this.f53182g;
        List<String> list = this.f53183h;
        String str3 = "";
        if (list == null) {
            str = str3;
        } else {
            str = TextUtils.join(",", list);
        }
        int i2 = this.f53186k;
        String str4 = this.f53180e;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.f53187l;
        if (str5 == null) {
            str5 = str3;
        }
        float f = this.f53188m;
        String str6 = this.f53181f;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = this.f53190o;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 51 + String.valueOf(str).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str3).length());
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }
}
