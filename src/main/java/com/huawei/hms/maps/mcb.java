package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.PatternItem;
import java.util.List;

public interface mcb extends mby {

    public static abstract class maa extends Binder implements mcb {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mcb$maa$maa  reason: collision with other inner class name */
        public static class C70273maa implements mcb {

            /* renamed from: a */
            private IBinder f58664a;

            C70273maa(IBinder iBinder) {
                this.f58664a = iBinder;
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: a */
            public final String mo84114a() {
                return mbz.m86555d(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 3);
            }

            @Override // com.huawei.hms.maps.mcb
            /* renamed from: a */
            public final void mo84128a(double d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.ICircleDelegate");
                    obtain.writeDouble(d);
                    this.f58664a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: a */
            public final void mo84115a(float f) {
                mbz.m86544a(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 23, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcb
            /* renamed from: a */
            public final void mo84129a(int i) {
                mbz.m86544a(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 16, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: a */
            public final void mo84116a(IObjectWrapper iObjectWrapper) {
                mbz.m86542a(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 21, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mcb
            /* renamed from: a */
            public final void mo84130a(LatLng latLng) {
                mbz.m86543a(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 14, latLng);
            }

            @Override // com.huawei.hms.maps.mcb
            /* renamed from: a */
            public final void mo84131a(List<PatternItem> list) {
                mbz.m86553b(list, this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 19);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: a */
            public final void mo84117a(boolean z) {
                mbz.m86548a(z, this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 15);
            }

            @Override // com.huawei.hms.maps.mcb
            /* renamed from: a */
            public final boolean mo84132a(mcb mcb) {
                return mbz.m86551a(mcb, this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 24);
            }

            public final IBinder asBinder() {
                return this.f58664a;
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: b */
            public final IObjectWrapper mo84118b() {
                return IObjectWrapper.Stub.asInterface(mbz.m86560i(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 8));
            }

            @Override // com.huawei.hms.maps.mcb
            /* renamed from: b */
            public final void mo84133b(float f) {
                mbz.m86544a(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 20, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcb
            /* renamed from: b */
            public final void mo84134b(int i) {
                mbz.m86544a(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 18, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: b */
            public final void mo84119b(boolean z) {
                mbz.m86548a(z, this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 22);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: c */
            public final float mo84120c() {
                return mbz.m86554c(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 9);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: d */
            public final int mo84121d() {
                return mbz.m86552b(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 10);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: e */
            public final boolean mo84122e() {
                return mbz.m86549a(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 11);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: f */
            public final boolean mo84123f() {
                return mbz.m86549a(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 12);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: g */
            public final void mo84124g() {
                mbz.m86559h(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 13);
            }

            @Override // com.huawei.hms.maps.mcb
            /* renamed from: h */
            public final LatLng mo84135h() {
                return mbz.m86556e(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 1);
            }

            @Override // com.huawei.hms.maps.mcb
            /* renamed from: i */
            public final int mo84136i() {
                return mbz.m86552b(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 2);
            }

            @Override // com.huawei.hms.maps.mcb
            /* renamed from: j */
            public final double mo84137j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.ICircleDelegate");
                    this.f58664a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readDouble();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mcb
            /* renamed from: k */
            public final int mo84138k() {
                return mbz.m86552b(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 5);
            }

            @Override // com.huawei.hms.maps.mcb
            /* renamed from: l */
            public final List<PatternItem> mo84139l() {
                return mbz.m86558g(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 6);
            }

            @Override // com.huawei.hms.maps.mcb
            /* renamed from: m */
            public final float mo84140m() {
                return mbz.m86554c(this.f58664a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 7);
            }
        }

        /* renamed from: a */
        public static mcb m86579a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.ICircleDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mcb)) ? new C70273maa(iBinder) : (mcb) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo84128a(double d);

    /* renamed from: a */
    void mo84129a(int i);

    /* renamed from: a */
    void mo84130a(LatLng latLng);

    /* renamed from: a */
    void mo84131a(List<PatternItem> list);

    /* renamed from: a */
    boolean mo84132a(mcb mcb);

    /* renamed from: b */
    void mo84133b(float f);

    /* renamed from: b */
    void mo84134b(int i);

    /* renamed from: h */
    LatLng mo84135h();

    /* renamed from: i */
    int mo84136i();

    /* renamed from: j */
    double mo84137j();

    /* renamed from: k */
    int mo84138k();

    /* renamed from: l */
    List<PatternItem> mo84139l();

    /* renamed from: m */
    float mo84140m();
}
