package com.google.android.gms.internal.location;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.location.p */
public class C21928p {

    /* renamed from: a */
    private static final ClassLoader f53332a = C21928p.class.getClassLoader();

    private C21928p() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m79250a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m79251a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: a */
    public static void m79252a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: a */
    public static void m79253a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
