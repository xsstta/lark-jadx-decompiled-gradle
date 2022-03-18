package com.google.android.gms.internal.p978authapi;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.auth-api.a */
public class C21853a {

    /* renamed from: a */
    private static final ClassLoader f53260a = C21853a.class.getClassLoader();

    private C21853a() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m79168a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m79170a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: a */
    public static void m79169a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
