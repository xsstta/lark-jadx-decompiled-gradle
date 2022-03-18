package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new C21970x();

    /* renamed from: a */
    public static final Comparator<ActivityTransition> f53383a = new C21969w();

    /* renamed from: b */
    private final List<ActivityTransition> f53384b;

    /* renamed from: c */
    private final String f53385c;

    /* renamed from: d */
    private final List<ClientIdentity> f53386d;

    public ActivityTransitionRequest(List<ActivityTransition> list, String str, List<ClientIdentity> list2) {
        Preconditions.checkNotNull(list, "transitions can't be null");
        Preconditions.checkArgument(list.size() > 0, "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(f53383a);
        for (ActivityTransition activityTransition : list) {
            Preconditions.checkArgument(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.f53384b = Collections.unmodifiableList(list);
        this.f53385c = str;
        this.f53386d = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            return Objects.equal(this.f53384b, activityTransitionRequest.f53384b) && Objects.equal(this.f53385c, activityTransitionRequest.f53385c) && Objects.equal(this.f53386d, activityTransitionRequest.f53386d);
        }
    }

    public int hashCode() {
        int hashCode = this.f53384b.hashCode() * 31;
        String str = this.f53385c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<ClientIdentity> list = this.f53386d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f53384b);
        String str = this.f53385c;
        String valueOf2 = String.valueOf(this.f53386d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append('\'');
        sb.append(", mClients=");
        sb.append(valueOf2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f53384b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f53385c, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f53386d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
