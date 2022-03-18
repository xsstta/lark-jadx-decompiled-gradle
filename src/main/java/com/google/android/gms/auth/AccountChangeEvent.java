package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new C21541a();

    /* renamed from: a */
    private final int f52323a;

    /* renamed from: b */
    private final long f52324b;

    /* renamed from: c */
    private final String f52325c;

    /* renamed from: d */
    private final int f52326d;

    /* renamed from: e */
    private final int f52327e;

    /* renamed from: f */
    private final String f52328f;

    AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f52323a = i;
        this.f52324b = j;
        this.f52325c = (String) Preconditions.checkNotNull(str);
        this.f52326d = i2;
        this.f52327e = i3;
        this.f52328f = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f52323a);
        SafeParcelWriter.writeLong(parcel, 2, this.f52324b);
        SafeParcelWriter.writeString(parcel, 3, this.f52325c, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f52326d);
        SafeParcelWriter.writeInt(parcel, 5, this.f52327e);
        SafeParcelWriter.writeString(parcel, 6, this.f52328f, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public String toString() {
        int i = this.f52326d;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.f52325c;
        String str3 = this.f52328f;
        int i2 = this.f52327e;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f52323a), Long.valueOf(this.f52324b), this.f52325c, Integer.valueOf(this.f52326d), Integer.valueOf(this.f52327e), this.f52328f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            return this.f52323a == accountChangeEvent.f52323a && this.f52324b == accountChangeEvent.f52324b && Objects.equal(this.f52325c, accountChangeEvent.f52325c) && this.f52326d == accountChangeEvent.f52326d && this.f52327e == accountChangeEvent.f52327e && Objects.equal(this.f52328f, accountChangeEvent.f52328f);
        }
    }
}
