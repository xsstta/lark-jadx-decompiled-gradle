package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new C21606c();

    /* renamed from: a */
    private final int f52333a;

    /* renamed from: b */
    private final List<AccountChangeEvent> f52334b;

    AccountChangeEventsResponse(int i, List<AccountChangeEvent> list) {
        this.f52333a = i;
        this.f52334b = (List) Preconditions.checkNotNull(list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f52333a);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f52334b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
