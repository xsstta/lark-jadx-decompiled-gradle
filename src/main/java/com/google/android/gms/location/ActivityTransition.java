package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new C21967u();

    /* renamed from: a */
    private final int f53378a;

    /* renamed from: b */
    private final int f53379b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SupportedActivityTransition {
    }

    ActivityTransition(int i, int i2) {
        this.f53378a = i;
        this.f53379b = i2;
    }

    /* renamed from: a */
    public static void m79271a(int i) {
        boolean z = true;
        if (i < 0 || i > 1) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        Preconditions.checkArgument(z, sb.toString());
    }

    /* renamed from: a */
    public int mo74279a() {
        return this.f53378a;
    }

    /* renamed from: b */
    public int mo74280b() {
        return this.f53379b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f53378a == activityTransition.f53378a && this.f53379b == activityTransition.f53379b;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f53378a), Integer.valueOf(this.f53379b));
    }

    public String toString() {
        int i = this.f53378a;
        int i2 = this.f53379b;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, mo74279a());
        SafeParcelWriter.writeInt(parcel, 2, mo74280b());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
