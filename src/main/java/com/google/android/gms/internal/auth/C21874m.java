package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.auth.m */
public class C21874m {

    /* renamed from: a */
    private static final ClassLoader f53273a = C21874m.class.getClassLoader();

    private C21874m() {
    }

    /* renamed from: a */
    public static boolean m79189a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: a */
    public static void m79188a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m79185a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m79187a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: a */
    public static void m79186a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
