package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.PatternItem;
import java.util.List;

public interface mcg extends mby {

    public static abstract class maa extends Binder implements mcg {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mcg$maa$maa  reason: collision with other inner class name */
        public static class C70278maa implements mcg {

            /* renamed from: a */
            private IBinder f58669a;

            C70278maa(IBinder iBinder) {
                this.f58669a = iBinder;
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: a */
            public final String mo84114a() {
                return mbz.m86555d(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 3);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: a */
            public final void mo84115a(float f) {
                mbz.m86544a(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 27, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: a */
            public final void mo84217a(int i) {
                mbz.m86544a(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 17, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: a */
            public final void mo84116a(IObjectWrapper iObjectWrapper) {
                mbz.m86542a(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 25, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: a */
            public final void mo84218a(List list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.IPolygonDelegate");
                    obtain.writeList(list);
                    this.f58669a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: a */
            public final void mo84117a(boolean z) {
                mbz.m86548a(z, this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 16);
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: a */
            public final boolean mo84219a(mcg mcg) {
                return mbz.m86551a(mcg, this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 28);
            }

            public final IBinder asBinder() {
                return this.f58669a;
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: b */
            public final IObjectWrapper mo84118b() {
                return IObjectWrapper.Stub.asInterface(mbz.m86560i(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 9));
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: b */
            public final void mo84220b(float f) {
                mbz.m86544a(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 24, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: b */
            public final void mo84221b(int i) {
                mbz.m86544a(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 21, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: b */
            public final void mo84222b(List<LatLng> list) {
                mbz.m86547a(list, this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 20);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: b */
            public final void mo84119b(boolean z) {
                mbz.m86548a(z, this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 26);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: c */
            public final float mo84120c() {
                return mbz.m86554c(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 10);
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: c */
            public final void mo84223c(int i) {
                mbz.m86544a(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 22, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: c */
            public final void mo84224c(List<PatternItem> list) {
                mbz.m86553b(list, this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 23);
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: c */
            public final void mo84225c(boolean z) {
                mbz.m86548a(z, this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 18);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: d */
            public final int mo84121d() {
                return mbz.m86552b(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 11);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: e */
            public final boolean mo84122e() {
                return mbz.m86549a(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 12);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: f */
            public final boolean mo84123f() {
                return mbz.m86549a(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 14);
            }

            @Override // com.huawei.hms.maps.mby
            /* renamed from: g */
            public final void mo84124g() {
                mbz.m86559h(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 15);
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: h */
            public final int mo84226h() {
                return mbz.m86552b(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 1);
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: i */
            public final List mo84227i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.IPolygonDelegate");
                    this.f58669a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: j */
            public final List<LatLng> mo84228j() {
                return mbz.m86557f(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 4);
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: k */
            public final int mo84229k() {
                return mbz.m86552b(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 5);
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: l */
            public final int mo84230l() {
                return mbz.m86552b(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 6);
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: m */
            public final List<PatternItem> mo84231m() {
                return mbz.m86558g(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 7);
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: n */
            public final float mo84232n() {
                return mbz.m86554c(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 8);
            }

            @Override // com.huawei.hms.maps.mcg
            /* renamed from: o */
            public final boolean mo84233o() {
                return mbz.m86549a(this.f58669a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 13);
            }
        }

        /* renamed from: a */
        public static mcg m86767a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.IPolygonDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mcg)) ? new C70278maa(iBinder) : (mcg) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo84217a(int i);

    /* renamed from: a */
    void mo84218a(List list);

    /* renamed from: a */
    boolean mo84219a(mcg mcg);

    /* renamed from: b */
    void mo84220b(float f);

    /* renamed from: b */
    void mo84221b(int i);

    /* renamed from: b */
    void mo84222b(List<LatLng> list);

    /* renamed from: c */
    void mo84223c(int i);

    /* renamed from: c */
    void mo84224c(List<PatternItem> list);

    /* renamed from: c */
    void mo84225c(boolean z);

    /* renamed from: h */
    int mo84226h();

    /* renamed from: i */
    List mo84227i();

    /* renamed from: j */
    List<LatLng> mo84228j();

    /* renamed from: k */
    int mo84229k();

    /* renamed from: l */
    int mo84230l();

    /* renamed from: m */
    List<PatternItem> mo84231m();

    /* renamed from: n */
    float mo84232n();

    /* renamed from: o */
    boolean mo84233o();
}
