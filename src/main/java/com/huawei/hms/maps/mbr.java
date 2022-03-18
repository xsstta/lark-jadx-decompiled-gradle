package com.huawei.hms.maps;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;

public interface mbr extends IInterface {

    public static abstract class maa extends Binder implements mbr {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mbr$maa$maa  reason: collision with other inner class name */
        public static class C70269maa implements mbr {

            /* renamed from: a */
            private IBinder f58647a;

            C70269maa(IBinder iBinder) {
                this.f58647a = iBinder;
            }

            @Override // com.huawei.hms.maps.mbr
            /* renamed from: a */
            public final IObjectWrapper mo84063a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    if (iObjectWrapper2 != null) {
                        iBinder = iObjectWrapper2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f58647a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return IObjectWrapper.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mbr
            /* renamed from: a */
            public final void mo84064a() {
                mbz.m86559h(this.f58647a, "com.huawei.hms.maps.internal.IStreetViewPanoramaFragmentDelegate", 6);
            }

            @Override // com.huawei.hms.maps.mbr
            /* renamed from: a */
            public final void mo84065a(Bundle bundle) {
                mbz.m86543a(this.f58647a, "com.huawei.hms.maps.internal.IStreetViewPanoramaFragmentDelegate", 4, bundle);
            }

            @Override // com.huawei.hms.maps.mbr
            /* renamed from: a */
            public final void mo84066a(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    if (streetViewPanoramaOptions != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f58647a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mbr
            /* renamed from: a */
            public final void mo84067a(mbn mbn) {
                IBinder asBinder = mbn.asBinder();
                mbz.m86542a(this.f58647a, "com.huawei.hms.maps.internal.IStreetViewPanoramaFragmentDelegate", 2, asBinder);
            }

            public final IBinder asBinder() {
                return this.f58647a;
            }

            @Override // com.huawei.hms.maps.mbr
            /* renamed from: b */
            public final void mo84068b() {
                mbz.m86559h(this.f58647a, "com.huawei.hms.maps.internal.IStreetViewPanoramaFragmentDelegate", 7);
            }

            @Override // com.huawei.hms.maps.mbr
            /* renamed from: b */
            public final void mo84069b(Bundle bundle) {
                mbz.m86543a(this.f58647a, "com.huawei.hms.maps.internal.IStreetViewPanoramaFragmentDelegate", 12, bundle);
            }

            @Override // com.huawei.hms.maps.mbr
            /* renamed from: c */
            public final void mo84070c() {
                mbz.m86559h(this.f58647a, "com.huawei.hms.maps.internal.IStreetViewPanoramaFragmentDelegate", 9);
            }

            @Override // com.huawei.hms.maps.mbr
            /* renamed from: d */
            public final void mo84071d() {
                mbz.m86559h(this.f58647a, "com.huawei.hms.maps.internal.IStreetViewPanoramaFragmentDelegate", 10);
            }

            @Override // com.huawei.hms.maps.mbr
            /* renamed from: e */
            public final void mo84072e() {
                mbz.m86559h(this.f58647a, "com.huawei.hms.maps.internal.IStreetViewPanoramaFragmentDelegate", 11);
            }

            @Override // com.huawei.hms.maps.mbr
            /* renamed from: f */
            public final void mo84073f() {
                mbz.m86559h(this.f58647a, "com.huawei.hms.maps.internal.IStreetViewPanoramaFragmentDelegate", 13);
            }

            @Override // com.huawei.hms.maps.mbr
            /* renamed from: g */
            public final void mo84074g() {
                mbz.m86559h(this.f58647a, "com.huawei.hms.maps.internal.IStreetViewPanoramaFragmentDelegate", 14);
            }
        }

        /* renamed from: a */
        public static mbr m86433a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mbr)) ? new C70269maa(iBinder) : (mbr) queryLocalInterface;
        }
    }

    /* renamed from: a */
    IObjectWrapper mo84063a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle);

    /* renamed from: a */
    void mo84064a();

    /* renamed from: a */
    void mo84065a(Bundle bundle);

    /* renamed from: a */
    void mo84066a(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle);

    /* renamed from: a */
    void mo84067a(mbn mbn);

    /* renamed from: b */
    void mo84068b();

    /* renamed from: b */
    void mo84069b(Bundle bundle);

    /* renamed from: c */
    void mo84070c();

    /* renamed from: d */
    void mo84071d();

    /* renamed from: e */
    void mo84072e();

    /* renamed from: f */
    void mo84073f();

    /* renamed from: g */
    void mo84074g();
}
