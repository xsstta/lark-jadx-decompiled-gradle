package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;

public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new C21971y();

    /* renamed from: a */
    private final List<ActivityTransitionEvent> f53387a;

    public ActivityTransitionResult(List<ActivityTransitionEvent> list) {
        Preconditions.checkNotNull(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                Preconditions.checkArgument(list.get(i).mo74287c() >= list.get(i + -1).mo74287c());
            }
        }
        this.f53387a = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public List<ActivityTransitionEvent> mo74296a() {
        return this.f53387a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f53387a.equals(((ActivityTransitionResult) obj).f53387a);
    }

    public int hashCode() {
        return this.f53387a.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, mo74296a(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
