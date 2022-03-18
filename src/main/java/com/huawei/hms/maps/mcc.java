package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;

public interface mcc extends IInterface {

    public static abstract class maa extends Binder implements mcc {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mcc$maa$maa  reason: collision with other inner class name */
        public static class C70274maa implements mcc {

            /* renamed from: a */
            private IBinder f58665a;

            C70274maa(IBinder iBinder) {
                this.f58665a = iBinder;
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: a */
            public final float mo84142a() {
                return mbz.m86554c(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 1);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: a */
            public final void mo84143a(float f) {
                mbz.m86544a(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 14, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: a */
            public final void mo84144a(float f, float f2) {
                mbz.m86544a(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 17, Float.valueOf(f), Float.valueOf(f2));
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: a */
            public final void mo84145a(IObjectWrapper iObjectWrapper) {
                mbz.m86542a(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 21, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: a */
            public final void mo84146a(LatLng latLng) {
                mbz.m86543a(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 18, latLng);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: a */
            public final void mo84147a(LatLngBounds latLngBounds) {
                mbz.m86543a(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 20, latLngBounds);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: a */
            public final void mo84148a(boolean z) {
                mbz.m86548a(z, this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 15);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: a */
            public final boolean mo84149a(mcc mcc) {
                return mbz.m86551a(mcc, this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 25);
            }

            public final IBinder asBinder() {
                return this.f58665a;
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: b */
            public final LatLngBounds mo84150b() {
                return mbz.m86539a(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate");
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: b */
            public final void mo84151b(float f) {
                mbz.m86544a(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 22, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: b */
            public final void mo84152b(IObjectWrapper iObjectWrapper) {
                mbz.m86542a(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 19, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: b */
            public final void mo84153b(boolean z) {
                mbz.m86548a(z, this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 23);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: c */
            public final float mo84154c() {
                return mbz.m86554c(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 3);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: c */
            public final void mo84155c(float f) {
                mbz.m86544a(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 24, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: d */
            public final String mo84156d() {
                return mbz.m86555d(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 4);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: d */
            public final void mo84157d(float f) {
                mbz.m86544a(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 16, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: e */
            public final LatLng mo84158e() {
                return mbz.m86556e(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 5);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: f */
            public final IObjectWrapper mo84159f() {
                return IObjectWrapper.Stub.asInterface(mbz.m86560i(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 6));
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: g */
            public final float mo84160g() {
                return mbz.m86554c(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 7);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: h */
            public final float mo84161h() {
                return mbz.m86554c(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 8);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: i */
            public final float mo84162i() {
                return mbz.m86554c(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 9);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: j */
            public final int mo84163j() {
                return mbz.m86552b(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 10);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: k */
            public final boolean mo84164k() {
                return mbz.m86549a(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 11);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: l */
            public final boolean mo84165l() {
                return mbz.m86549a(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 12);
            }

            @Override // com.huawei.hms.maps.mcc
            /* renamed from: m */
            public final void mo84166m() {
                mbz.m86559h(this.f58665a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 13);
            }
        }

        /* renamed from: a */
        public static mcc m86629a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.IGroundOverlayDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mcc)) ? new C70274maa(iBinder) : (mcc) queryLocalInterface;
        }
    }

    /* renamed from: a */
    float mo84142a();

    /* renamed from: a */
    void mo84143a(float f);

    /* renamed from: a */
    void mo84144a(float f, float f2);

    /* renamed from: a */
    void mo84145a(IObjectWrapper iObjectWrapper);

    /* renamed from: a */
    void mo84146a(LatLng latLng);

    /* renamed from: a */
    void mo84147a(LatLngBounds latLngBounds);

    /* renamed from: a */
    void mo84148a(boolean z);

    /* renamed from: a */
    boolean mo84149a(mcc mcc);

    /* renamed from: b */
    LatLngBounds mo84150b();

    /* renamed from: b */
    void mo84151b(float f);

    /* renamed from: b */
    void mo84152b(IObjectWrapper iObjectWrapper);

    /* renamed from: b */
    void mo84153b(boolean z);

    /* renamed from: c */
    float mo84154c();

    /* renamed from: c */
    void mo84155c(float f);

    /* renamed from: d */
    String mo84156d();

    /* renamed from: d */
    void mo84157d(float f);

    /* renamed from: e */
    LatLng mo84158e();

    /* renamed from: f */
    IObjectWrapper mo84159f();

    /* renamed from: g */
    float mo84160g();

    /* renamed from: h */
    float mo84161h();

    /* renamed from: i */
    float mo84162i();

    /* renamed from: j */
    int mo84163j();

    /* renamed from: k */
    boolean mo84164k();

    /* renamed from: l */
    boolean mo84165l();

    /* renamed from: m */
    void mo84166m();
}
