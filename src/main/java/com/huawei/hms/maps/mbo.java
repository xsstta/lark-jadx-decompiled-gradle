package com.huawei.hms.maps;

import android.graphics.Point;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.VisibleRegion;

public interface mbo extends IInterface {

    public static abstract class maa extends Binder implements mbo {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mbo$maa$maa  reason: collision with other inner class name */
        public static class C70268maa implements mbo {

            /* renamed from: a */
            private IBinder f58646a;

            C70268maa(IBinder iBinder) {
                this.f58646a = iBinder;
            }

            @Override // com.huawei.hms.maps.mbo
            /* renamed from: a */
            public final Point mo84049a(LatLng latLng) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.internal.IProjectionDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f58646a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Point) Point.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mbo
            /* renamed from: a */
            public final LatLng mo84050a(Point point) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.internal.IProjectionDelegate");
                    if (point != null) {
                        obtain.writeInt(1);
                        point.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f58646a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? LatLng.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mbo
            /* renamed from: a */
            public final VisibleRegion mo84051a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.internal.IProjectionDelegate");
                    this.f58646a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? VisibleRegion.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f58646a;
            }
        }

        /* renamed from: a */
        public static mbo m86409a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IProjectionDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mbo)) ? new C70268maa(iBinder) : (mbo) queryLocalInterface;
        }
    }

    /* renamed from: a */
    Point mo84049a(LatLng latLng);

    /* renamed from: a */
    LatLng mo84050a(Point point);

    /* renamed from: a */
    VisibleRegion mo84051a();
}
