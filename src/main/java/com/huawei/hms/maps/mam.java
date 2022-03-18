package com.huawei.hms.maps;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.feature.dynamic.IObjectWrapper;

public interface mam extends IInterface {

    public static abstract class maa extends Binder implements mam {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mam$maa$maa  reason: collision with other inner class name */
        public static class C70265maa implements mam {

            /* renamed from: a */
            private IBinder f58643a;

            C70265maa(IBinder iBinder) {
                this.f58643a = iBinder;
            }

            @Override // com.huawei.hms.maps.mam
            /* renamed from: a */
            public final IObjectWrapper mo83975a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.internal.IMapFragmentDelegate");
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
                    this.f58643a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return IObjectWrapper.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mam
            /* renamed from: a */
            public final void mo83976a() {
                mbz.m86543a(this.f58643a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 3, new Parcelable[0]);
            }

            @Override // com.huawei.hms.maps.mam
            /* renamed from: a */
            public final void mo83977a(Bundle bundle) {
                mbz.m86543a(this.f58643a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 12, bundle);
            }

            @Override // com.huawei.hms.maps.mam
            /* renamed from: a */
            public final void mo83978a(IObjectWrapper iObjectWrapper) {
                mbz.m86542a(this.f58643a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 7, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mam
            /* renamed from: a */
            public final void mo83979a(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.internal.IMapFragmentDelegate");
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    if (huaweiMapOptions != null) {
                        obtain.writeInt(1);
                        huaweiMapOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f58643a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mam
            /* renamed from: a */
            public final void mo83980a(mbc mbc) {
                IBinder asBinder = mbc.asBinder();
                mbz.m86542a(this.f58643a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 11, asBinder);
            }

            public final IBinder asBinder() {
                return this.f58643a;
            }

            @Override // com.huawei.hms.maps.mam
            /* renamed from: b */
            public final void mo83981b() {
                mbz.m86559h(this.f58643a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 5);
            }

            @Override // com.huawei.hms.maps.mam
            /* renamed from: c */
            public final void mo83982c() {
                mbz.m86559h(this.f58643a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 6);
            }

            @Override // com.huawei.hms.maps.mam
            /* renamed from: d */
            public final void mo83983d() {
                mbz.m86559h(this.f58643a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 8);
            }

            @Override // com.huawei.hms.maps.mam
            /* renamed from: e */
            public final void mo83984e() {
                mbz.m86559h(this.f58643a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 9);
            }

            @Override // com.huawei.hms.maps.mam
            /* renamed from: f */
            public final void mo83985f() {
                mbz.m86559h(this.f58643a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 10);
            }

            @Override // com.huawei.hms.maps.mam
            /* renamed from: g */
            public final void mo83986g() {
                mbz.m86559h(this.f58643a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 16);
            }

            @Override // com.huawei.hms.maps.mam
            /* renamed from: h */
            public final void mo83987h() {
                mbz.m86559h(this.f58643a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 17);
            }
        }

        /* renamed from: a */
        public static mam m86366a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IMapFragmentDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mam)) ? new C70265maa(iBinder) : (mam) queryLocalInterface;
        }
    }

    /* renamed from: a */
    IObjectWrapper mo83975a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle);

    /* renamed from: a */
    void mo83976a();

    /* renamed from: a */
    void mo83977a(Bundle bundle);

    /* renamed from: a */
    void mo83978a(IObjectWrapper iObjectWrapper);

    /* renamed from: a */
    void mo83979a(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions, Bundle bundle);

    /* renamed from: a */
    void mo83980a(mbc mbc);

    /* renamed from: b */
    void mo83981b();

    /* renamed from: c */
    void mo83982c();

    /* renamed from: d */
    void mo83983d();

    /* renamed from: e */
    void mo83984e();

    /* renamed from: f */
    void mo83985f();

    /* renamed from: g */
    void mo83986g();

    /* renamed from: h */
    void mo83987h();
}
