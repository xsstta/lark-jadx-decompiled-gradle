package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new C21707e();

    /* renamed from: a */
    private final String f52540a;

    /* renamed from: b */
    private final int f52541b;

    /* renamed from: c */
    private final long f52542c;

    public Feature(String str, int i, long j) {
        this.f52540a = str;
        this.f52541b = i;
        this.f52542c = j;
    }

    /* renamed from: a */
    public String mo73143a() {
        return this.f52540a;
    }

    /* renamed from: b */
    public long mo73144b() {
        long j = this.f52542c;
        return j == -1 ? (long) this.f52541b : j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, mo73143a(), false);
        SafeParcelWriter.writeInt(parcel, 2, this.f52541b);
        SafeParcelWriter.writeLong(parcel, 3, mo73144b());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((mo73143a() == null || !mo73143a().equals(feature.mo73143a())) && (mo73143a() != null || feature.mo73143a() != null)) || mo73144b() != feature.mo73144b()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(mo73143a(), Long.valueOf(mo73144b()));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", mo73143a()).add(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, Long.valueOf(mo73144b())).toString();
    }
}
