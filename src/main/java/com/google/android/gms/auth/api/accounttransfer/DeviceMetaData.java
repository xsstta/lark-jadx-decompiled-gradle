package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new C21556i();

    /* renamed from: a */
    private final int f52359a;

    /* renamed from: b */
    private boolean f52360b;

    /* renamed from: c */
    private long f52361c;

    /* renamed from: d */
    private final boolean f52362d;

    /* renamed from: a */
    public boolean mo72950a() {
        return this.f52360b;
    }

    /* renamed from: b */
    public long mo72951b() {
        return this.f52361c;
    }

    /* renamed from: c */
    public boolean mo72952c() {
        return this.f52362d;
    }

    DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.f52359a = i;
        this.f52360b = z;
        this.f52361c = j;
        this.f52362d = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f52359a);
        SafeParcelWriter.writeBoolean(parcel, 2, mo72950a());
        SafeParcelWriter.writeLong(parcel, 3, mo72951b());
        SafeParcelWriter.writeBoolean(parcel, 4, mo72952c());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
