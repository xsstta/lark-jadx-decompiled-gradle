package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.List;

public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new C21966t();

    /* renamed from: a */
    private List<DetectedActivity> f53373a;

    /* renamed from: b */
    private long f53374b;

    /* renamed from: c */
    private long f53375c;

    /* renamed from: d */
    private int f53376d;

    /* renamed from: e */
    private Bundle f53377e;

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2, int i, Bundle bundle) {
        boolean z = true;
        Preconditions.checkArgument(list != null && list.size() > 0, "Must have at least 1 detected activity");
        Preconditions.checkArgument((j <= 0 || j2 <= 0) ? false : z, "Must set times");
        this.f53373a = list;
        this.f53374b = j;
        this.f53375c = j2;
        this.f53376d = i;
        this.f53377e = bundle;
    }

    /* renamed from: a */
    private static boolean m79270a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || ((bundle != null && bundle2 == null) || bundle.size() != bundle2.size())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!m79270a(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            return this.f53374b == activityRecognitionResult.f53374b && this.f53375c == activityRecognitionResult.f53375c && this.f53376d == activityRecognitionResult.f53376d && Objects.equal(this.f53373a, activityRecognitionResult.f53373a) && m79270a(this.f53377e, activityRecognitionResult.f53377e);
        }
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f53374b), Long.valueOf(this.f53375c), Integer.valueOf(this.f53376d), this.f53373a, this.f53377e);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f53373a);
        long j = this.f53374b;
        long j2 = this.f53375c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + SmActions.ACTION_CALLING_EXIT);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f53373a, false);
        SafeParcelWriter.writeLong(parcel, 2, this.f53374b);
        SafeParcelWriter.writeLong(parcel, 3, this.f53375c);
        SafeParcelWriter.writeInt(parcel, 4, this.f53376d);
        SafeParcelWriter.writeBundle(parcel, 5, this.f53377e, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
