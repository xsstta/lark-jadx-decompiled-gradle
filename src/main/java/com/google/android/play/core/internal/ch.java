package com.google.android.play.core.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class ch {
    static {
        ch.class.getClassLoader();
    }

    private ch() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m82407a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.os.IInterface */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m82408a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface);
    }

    /* renamed from: a */
    public static void m82409a(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }
}
