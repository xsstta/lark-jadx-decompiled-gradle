package com.google.android.gms.internal.p977authapiphone;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.auth-api-phone.a */
public class C21848a {

    /* renamed from: a */
    private static final ClassLoader f53258a = C21848a.class.getClassLoader();

    private C21848a() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m79162a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m79163a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
