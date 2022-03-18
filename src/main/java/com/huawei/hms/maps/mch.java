package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.model.Cap;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.PatternItem;
import java.util.List;

public interface mch extends mby {

    public static abstract class maa extends Binder implements mch {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mch$maa$maa  reason: collision with other inner class name */
        public static class C70279maa implements mch {

            /* renamed from: a */
            private IBinder f58670a;

            C70279maa(IBinder iBinder) {
                this.f58670a = iBinder;
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: a */
            public final String mo84114a() {
                return mbz.m86555d(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 4);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: a */
            public final void mo84115a(float f) {
                mbz.m86544a(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 28, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: a */
            public final void mo84235a(int i) {
                mbz.m86544a(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 18, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: a */
            public final void mo84116a(IObjectWrapper iObjectWrapper) {
                mbz.m86542a(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 25, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: a */
            public final void mo84236a(Cap cap) {
                mbz.m86543a(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 19, cap);
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: a */
            public final void mo84237a(List<PatternItem> list) {
                mbz.m86553b(list, this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 22);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: a */
            public final void mo84117a(boolean z) {
                mbz.m86548a(z, this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 17);
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: a */
            public final boolean mo84238a(mch mch) {
                return mbz.m86551a(mch, this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 1);
            }

            public final IBinder asBinder() {
                return this.f58670a;
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: b */
            public final IObjectWrapper mo84118b() {
                return IObjectWrapper.Stub.asInterface(mbz.m86560i(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 9));
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: b */
            public final void mo84239b(float f) {
                mbz.m86544a(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 27, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: b */
            public final void mo84240b(int i) {
                mbz.m86544a(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 21, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: b */
            public final void mo84241b(Cap cap) {
                mbz.m86543a(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 24, cap);
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: b */
            public final void mo84242b(List<LatLng> list) {
                mbz.m86547a(list, this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 23);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: b */
            public final void mo84119b(boolean z) {
                mbz.m86548a(z, this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 26);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: c */
            public final float mo84120c() {
                return mbz.m86554c(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 11);
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: c */
            public final void mo84243c(boolean z) {
                mbz.m86548a(z, this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 20);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: d */
            public final int mo84121d() {
                return mbz.m86552b(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 12);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: e */
            public final boolean mo84122e() {
                return mbz.m86549a(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 13);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: f */
            public final boolean mo84123f() {
                return mbz.m86549a(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 15);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: g */
            public final void mo84124g() {
                mbz.m86559h(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 16);
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: h */
            public final int mo84244h() {
                return mbz.m86552b(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 2);
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: i */
            public final Cap mo84245i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.IPolylineDelegate");
                    this.f58670a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? Cap.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: j */
            public final int mo84246j() {
                return mbz.m86552b(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 5);
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: k */
            public final List<PatternItem> mo84247k() {
                return mbz.m86558g(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 6);
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: l */
            public final List<LatLng> mo84248l() {
                return mbz.m86557f(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 7);
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: m */
            public final Cap mo84249m() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.IPolylineDelegate");
                    this.f58670a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? Cap.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: n */
            public final float mo84250n() {
                return mbz.m86554c(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 10);
            }

            @Override // com.huawei.hms.maps.mch
            /* renamed from: o */
            public final boolean mo84251o() {
                return mbz.m86549a(this.f58670a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 14);
            }
        }

        /* renamed from: a */
        public static mch m86813a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.IPolylineDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mch)) ? new C70279maa(iBinder) : (mch) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo84235a(int i);

    /* renamed from: a */
    void mo84236a(Cap cap);

    /* renamed from: a */
    void mo84237a(List<PatternItem> list);

    /* renamed from: a */
    boolean mo84238a(mch mch);

    /* renamed from: b */
    void mo84239b(float f);

    /* renamed from: b */
    void mo84240b(int i);

    /* renamed from: b */
    void mo84241b(Cap cap);

    /* renamed from: b */
    void mo84242b(List<LatLng> list);

    /* renamed from: c */
    void mo84243c(boolean z);

    /* renamed from: h */
    int mo84244h();

    /* renamed from: i */
    Cap mo84245i();

    /* renamed from: j */
    int mo84246j();

    /* renamed from: k */
    List<PatternItem> mo84247k();

    /* renamed from: l */
    List<LatLng> mo84248l();

    /* renamed from: m */
    Cap mo84249m();

    /* renamed from: n */
    float mo84250n();

    /* renamed from: o */
    boolean mo84251o();
}
