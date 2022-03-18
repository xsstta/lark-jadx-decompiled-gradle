package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zaa extends AbstractSafeParcelable implements AbstractC21641i {
    public static final Parcelable.Creator<zaa> CREATOR = new C22073b();

    /* renamed from: a */
    private final int f53690a;

    /* renamed from: b */
    private int f53691b;

    /* renamed from: c */
    private Intent f53692c;

    zaa(int i, int i2, Intent intent) {
        this.f53690a = i;
        this.f53691b = i2;
        this.f53692c = intent;
    }

    public zaa() {
        this(0, null);
    }

    private zaa(int i, Intent intent) {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.AbstractC21641i
    public final Status getStatus() {
        if (this.f53691b == 0) {
            return Status.RESULT_SUCCESS;
        }
        return Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53690a);
        SafeParcelWriter.writeInt(parcel, 2, this.f53691b);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f53692c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
