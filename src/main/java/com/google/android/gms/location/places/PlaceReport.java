package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new C21962a();

    /* renamed from: a */
    private final int f53437a;

    /* renamed from: b */
    private final String f53438b;

    /* renamed from: c */
    private final String f53439c;

    /* renamed from: d */
    private final String f53440d;

    PlaceReport(int i, String str, String str2, String str3) {
        this.f53437a = i;
        this.f53438b = str;
        this.f53439c = str2;
        this.f53440d = str3;
    }

    /* renamed from: a */
    public String mo74371a() {
        return this.f53438b;
    }

    /* renamed from: b */
    public String mo74372b() {
        return this.f53439c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return Objects.equal(this.f53438b, placeReport.f53438b) && Objects.equal(this.f53439c, placeReport.f53439c) && Objects.equal(this.f53440d, placeReport.f53440d);
    }

    public int hashCode() {
        return Objects.hashCode(this.f53438b, this.f53439c, this.f53440d);
    }

    public String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add("placeId", this.f53438b);
        stringHelper.add("tag", this.f53439c);
        if (!"unknown".equals(this.f53440d)) {
            stringHelper.add(ShareHitPoint.f121868c, this.f53440d);
        }
        return stringHelper.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53437a);
        SafeParcelWriter.writeString(parcel, 2, mo74371a(), false);
        SafeParcelWriter.writeString(parcel, 3, mo74372b(), false);
        SafeParcelWriter.writeString(parcel, 4, this.f53440d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
