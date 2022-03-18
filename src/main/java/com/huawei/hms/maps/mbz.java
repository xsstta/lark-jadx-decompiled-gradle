package com.huawei.hms.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;
import com.huawei.hms.maps.model.PatternItem;
import java.util.List;

public final class mbz {
    /* renamed from: a */
    public static IBinder m86536a(IBinder iBinder, String str, int i, IBinder iBinder2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            obtain.writeStrongBinder(iBinder2);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public static IBinder m86537a(IBinder iBinder, String str, int i, IBinder iBinder2, Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            obtain.writeStrongBinder(iBinder2);
            if (parcelable != null) {
                obtain.writeInt(1);
                parcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public static IBinder m86538a(IBinder iBinder, String str, int i, Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            if (parcelable != null) {
                obtain.writeInt(1);
                parcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public static LatLngBounds m86539a(IBinder iBinder, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? LatLngBounds.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static Number m86540a(IBinder iBinder, String str, int i, int i2, Parcelable... parcelableArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable != null) {
                    obtain.writeInt(1);
                    parcelable.writeToParcel(obtain, 0);
                } else {
                    obtain.writeInt(0);
                }
            }
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            if (i2 == 0) {
                Integer valueOf = Integer.valueOf(obtain2.readInt());
                obtain2.recycle();
                obtain.recycle();
                return valueOf;
            } else if (i2 == 1) {
                Float valueOf2 = Float.valueOf(obtain2.readFloat());
                obtain2.recycle();
                obtain.recycle();
                return valueOf2;
            } else if (i2 == 2) {
                Double valueOf3 = Double.valueOf(obtain2.readDouble());
                obtain2.recycle();
                obtain.recycle();
                return valueOf3;
            } else if (i2 != 3) {
                Log.e("DelegateUtil", "read number from parcel error , with not support type.".concat(String.valueOf(i2)));
                obtain2.recycle();
                obtain.recycle();
                return null;
            } else {
                Byte valueOf4 = Byte.valueOf(obtain2.readByte());
                obtain2.recycle();
                obtain.recycle();
                return valueOf4;
            }
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    public static void m86541a(IBinder iBinder, IBinder iBinder2, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            obtain.writeStrongBinder(iBinder);
            iBinder2.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public static void m86542a(IBinder iBinder, String str, int i, IBinder... iBinderArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            for (IBinder iBinder2 : iBinderArr) {
                obtain.writeStrongBinder(iBinder2);
            }
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public static void m86543a(IBinder iBinder, String str, int i, Parcelable... parcelableArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable != null) {
                    obtain.writeInt(1);
                    parcelable.writeToParcel(obtain, 0);
                } else {
                    obtain.writeInt(0);
                }
            }
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public static void m86544a(IBinder iBinder, String str, int i, Number... numberArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            for (Number number : numberArr) {
                m86545a(obtain, number);
            }
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    private static void m86545a(Parcel parcel, Number number) {
        if (number instanceof Integer) {
            parcel.writeInt(number.intValue());
        } else if (number instanceof Float) {
            parcel.writeFloat(number.floatValue());
        } else if (number instanceof Double) {
            parcel.writeDouble(number.doubleValue());
        } else if (number instanceof Byte) {
            parcel.writeByte(number.byteValue());
        } else {
            Log.e("DelegateUtil", "setNumber with not support type." + number.toString());
        }
    }

    /* renamed from: a */
    public static void m86546a(String str, IBinder iBinder, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str2);
            obtain.writeString(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public static void m86547a(List<LatLng> list, IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            obtain.writeTypedList(list);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public static void m86548a(boolean z, IBinder iBinder, String str, int i) {
        m86544a(iBinder, str, i, Integer.valueOf(z ? 1 : 0));
    }

    /* renamed from: a */
    public static boolean m86549a(IBinder iBinder, String str, int i) {
        return m86552b(iBinder, str, i) != 0;
    }

    /* renamed from: a */
    public static boolean m86550a(IBinder iBinder, String str, boolean z) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            obtain.writeInt(z ? 1 : 0);
            boolean z2 = false;
            iBinder.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z2 = true;
            }
            return z2;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public static boolean m86551a(IInterface iInterface, IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            obtain.writeStrongBinder(iInterface != null ? iInterface.asBinder() : null);
            boolean z = false;
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: b */
    public static int m86552b(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: b */
    public static void m86553b(List<PatternItem> list, IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            obtain.writeTypedList(list);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: c */
    public static float m86554c(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readFloat();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: d */
    public static String m86555d(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: e */
    public static LatLng m86556e(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? LatLng.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: f */
    public static List<LatLng> m86557f(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(LatLng.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: g */
    public static List<PatternItem> m86558g(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(PatternItem.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: h */
    public static void m86559h(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: i */
    public static IBinder m86560i(IBinder iBinder, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(str);
            iBinder.transact(i, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
