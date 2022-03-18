package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;

public interface mca extends IInterface {

    public static abstract class maa extends Binder implements mca {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mca$maa$maa  reason: collision with other inner class name */
        public static class C70272maa implements mca {

            /* renamed from: a */
            private IBinder f58663a;

            C70272maa(IBinder iBinder) {
                this.f58663a = iBinder;
            }

            @Override // com.huawei.hms.maps.mca
            /* renamed from: a */
            public final IObjectWrapper mo84125a() {
                return IObjectWrapper.Stub.asInterface(mbz.m86560i(this.f58663a, "com.huawei.hms.maps.model.internal.IBitmapDescriptorDelegate", 1));
            }

            @Override // com.huawei.hms.maps.mca
            /* renamed from: a */
            public final IObjectWrapper mo84126a(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.IBitmapDescriptorDelegate");
                    obtain.writeFloat(f);
                    this.f58663a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return IObjectWrapper.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f58663a;
            }
        }

        /* renamed from: a */
        public static mca m86563a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.IBitmapDescriptorDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mca)) ? new C70272maa(iBinder) : (mca) queryLocalInterface;
        }
    }

    /* renamed from: a */
    IObjectWrapper mo84125a();

    /* renamed from: a */
    IObjectWrapper mo84126a(float f);
}
