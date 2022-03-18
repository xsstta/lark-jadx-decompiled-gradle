package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new C21968v();

    /* renamed from: a */
    private final int f53380a;

    /* renamed from: b */
    private final int f53381b;

    /* renamed from: c */
    private final long f53382c;

    public ActivityTransitionEvent(int i, int i2, long j) {
        DetectedActivity.m79278a(i);
        ActivityTransition.m79271a(i2);
        this.f53380a = i;
        this.f53381b = i2;
        this.f53382c = j;
    }

    /* renamed from: a */
    public int mo74285a() {
        return this.f53380a;
    }

    /* renamed from: b */
    public int mo74286b() {
        return this.f53381b;
    }

    /* renamed from: c */
    public long mo74287c() {
        return this.f53382c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f53380a == activityTransitionEvent.f53380a && this.f53381b == activityTransitionEvent.f53381b && this.f53382c == activityTransitionEvent.f53382c;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f53380a), Integer.valueOf(this.f53381b), Long.valueOf(this.f53382c));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f53380a;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.f53381b;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.f53382c;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, mo74285a());
        SafeParcelWriter.writeInt(parcel, 2, mo74286b());
        SafeParcelWriter.writeLong(parcel, 3, mo74287c());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
