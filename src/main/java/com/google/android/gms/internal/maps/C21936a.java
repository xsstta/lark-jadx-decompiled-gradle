package com.google.android.gms.internal.maps;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.maps.a */
public class C21936a {

    /* renamed from: a */
    private static final ClassLoader f53372a = C21936a.class.getClassLoader();

    private C21936a() {
    }

    /* renamed from: a */
    public static boolean m79267a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: a */
    public static void m79266a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m79263a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m79265a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: b */
    public static void m79269b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }

    /* renamed from: a */
    public static void m79264a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: b */
    public static ArrayList m79268b(Parcel parcel) {
        return parcel.readArrayList(f53372a);
    }
}
