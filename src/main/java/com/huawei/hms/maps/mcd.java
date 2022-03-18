package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public interface mcd extends IInterface {

    public static abstract class maa extends Binder implements mcd {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mcd$maa$maa  reason: collision with other inner class name */
        public static class C70275maa implements mcd {

            /* renamed from: a */
            private IBinder f58666a;

            C70275maa(IBinder iBinder) {
                this.f58666a = iBinder;
            }

            @Override // com.huawei.hms.maps.mcd
            /* renamed from: a */
            public final int mo84168a() {
                return mbz.m86552b(this.f58666a, "com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate", 1);
            }

            @Override // com.huawei.hms.maps.mcd
            /* renamed from: a */
            public final boolean mo84169a(mcd mcd) {
                return mbz.m86551a(mcd, this.f58666a, "com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate", 5);
            }

            public final IBinder asBinder() {
                return this.f58666a;
            }

            @Override // com.huawei.hms.maps.mcd
            /* renamed from: b */
            public final int mo84170b() {
                return mbz.m86552b(this.f58666a, "com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate", 2);
            }

            @Override // com.huawei.hms.maps.mcd
            /* renamed from: c */
            public final List<IBinder> mo84171c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate");
                    this.f58666a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createBinderArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mcd
            /* renamed from: d */
            public final boolean mo84172d() {
                return mbz.m86549a(this.f58666a, "com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate", 4);
            }

            @Override // com.huawei.hms.maps.mcd
            /* renamed from: e */
            public final int mo84173e() {
                return mbz.m86552b(this.f58666a, "com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate", 6);
            }
        }

        /* renamed from: a */
        public static mcd m86661a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mcd)) ? new C70275maa(iBinder) : (mcd) queryLocalInterface;
        }
    }

    /* renamed from: a */
    int mo84168a();

    /* renamed from: a */
    boolean mo84169a(mcd mcd);

    /* renamed from: b */
    int mo84170b();

    /* renamed from: c */
    List<IBinder> mo84171c();

    /* renamed from: d */
    boolean mo84172d();

    /* renamed from: e */
    int mo84173e();
}
