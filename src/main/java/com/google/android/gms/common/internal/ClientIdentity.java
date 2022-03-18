package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C21758o();

    /* renamed from: a */
    private final int f52998a;

    /* renamed from: b */
    private final String f52999b;

    public ClientIdentity(int i, String str) {
        this.f52998a = i;
        this.f52999b = str;
    }

    public int hashCode() {
        return this.f52998a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ClientIdentity)) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            return clientIdentity.f52998a == this.f52998a && Objects.equal(clientIdentity.f52999b, this.f52999b);
        }
    }

    public String toString() {
        int i = this.f52998a;
        String str = this.f52999b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f52998a);
        SafeParcelWriter.writeString(parcel, 2, this.f52999b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
