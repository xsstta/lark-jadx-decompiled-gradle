package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.animation.Animation;

public interface mcf extends IInterface {

    public static abstract class maa extends Binder implements mcf {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mcf$maa$maa  reason: collision with other inner class name */
        public static class C70277maa implements mcf {

            /* renamed from: a */
            private IBinder f58668a;

            C70277maa(IBinder iBinder) {
                this.f58668a = iBinder;
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: a */
            public final void mo84181a() {
                mbz.m86559h(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 1);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: a */
            public final void mo84182a(float f) {
                mbz.m86544a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 22, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: a */
            public final void mo84183a(float f, float f2) {
                mbz.m86544a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 19, Float.valueOf(f), Float.valueOf(f2));
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: a */
            public final void mo84184a(IObjectWrapper iObjectWrapper) {
                mbz.m86542a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 18, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: a */
            public final void mo84185a(mae mae) {
                mbz.m86541a(mae != null ? mae.asBinder() : null, this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 35);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: a */
            public final void mo84186a(LatLng latLng) {
                mbz.m86543a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 3, latLng);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: a */
            public final void mo84187a(Animation animation) {
                mbz.m86543a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 33, animation);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: a */
            public final void mo84188a(String str) {
                mbz.m86546a(str, this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 5);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: a */
            public final void mo84189a(boolean z) {
                mbz.m86548a(z, this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 9);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: a */
            public final boolean mo84190a(mcf mcf) {
                return mbz.m86551a(mcf, this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 16);
            }

            public final IBinder asBinder() {
                return this.f58668a;
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: b */
            public final String mo84191b() {
                return mbz.m86555d(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 2);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: b */
            public final void mo84192b(float f) {
                mbz.m86544a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 25, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: b */
            public final void mo84193b(float f, float f2) {
                mbz.m86544a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 24, Float.valueOf(f), Float.valueOf(f2));
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: b */
            public final void mo84194b(IObjectWrapper iObjectWrapper) {
                mbz.m86542a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 29, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: b */
            public final void mo84195b(String str) {
                mbz.m86546a(str, this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 7);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: b */
            public final void mo84196b(boolean z) {
                mbz.m86548a(z, this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 14);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: c */
            public final LatLng mo84197c() {
                return mbz.m86556e(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 4);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: c */
            public final void mo84198c(float f) {
                mbz.m86544a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 27, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: c */
            public final void mo84199c(float f, float f2) {
                mbz.m86544a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 32, Float.valueOf(f), Float.valueOf(f2));
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: c */
            public final void mo84200c(boolean z) {
                mbz.m86548a(z, this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 20);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: d */
            public final String mo84201d() {
                return mbz.m86555d(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 6);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: e */
            public final String mo84202e() {
                return mbz.m86555d(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 8);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: f */
            public final boolean mo84203f() {
                return mbz.m86549a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 10);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: g */
            public final void mo84204g() {
                mbz.m86559h(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 11);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: h */
            public final void mo84205h() {
                mbz.m86559h(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 12);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: i */
            public final boolean mo84206i() {
                return mbz.m86549a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 13);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: j */
            public final boolean mo84207j() {
                return mbz.m86549a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 15);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: k */
            public final int mo84208k() {
                return mbz.m86552b(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 17);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: l */
            public final boolean mo84209l() {
                return mbz.m86549a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 21);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: m */
            public final float mo84210m() {
                return mbz.m86554c(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 23);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: n */
            public final float mo84211n() {
                return mbz.m86554c(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 26);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: o */
            public final float mo84212o() {
                return mbz.m86554c(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 28);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: p */
            public final IObjectWrapper mo84213p() {
                return IObjectWrapper.Stub.asInterface(mbz.m86560i(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 30));
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: q */
            public final boolean mo84214q() {
                return mbz.m86549a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 31);
            }

            @Override // com.huawei.hms.maps.mcf
            /* renamed from: r */
            public final void mo84215r() {
                mbz.m86543a(this.f58668a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 34, new Parcelable[0]);
            }
        }

        /* renamed from: a */
        public static mcf m86714a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.IMarkerDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mcf)) ? new C70277maa(iBinder) : (mcf) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo84181a();

    /* renamed from: a */
    void mo84182a(float f);

    /* renamed from: a */
    void mo84183a(float f, float f2);

    /* renamed from: a */
    void mo84184a(IObjectWrapper iObjectWrapper);

    /* renamed from: a */
    void mo84185a(mae mae);

    /* renamed from: a */
    void mo84186a(LatLng latLng);

    /* renamed from: a */
    void mo84187a(Animation animation);

    /* renamed from: a */
    void mo84188a(String str);

    /* renamed from: a */
    void mo84189a(boolean z);

    /* renamed from: a */
    boolean mo84190a(mcf mcf);

    /* renamed from: b */
    String mo84191b();

    /* renamed from: b */
    void mo84192b(float f);

    /* renamed from: b */
    void mo84193b(float f, float f2);

    /* renamed from: b */
    void mo84194b(IObjectWrapper iObjectWrapper);

    /* renamed from: b */
    void mo84195b(String str);

    /* renamed from: b */
    void mo84196b(boolean z);

    /* renamed from: c */
    LatLng mo84197c();

    /* renamed from: c */
    void mo84198c(float f);

    /* renamed from: c */
    void mo84199c(float f, float f2);

    /* renamed from: c */
    void mo84200c(boolean z);

    /* renamed from: d */
    String mo84201d();

    /* renamed from: e */
    String mo84202e();

    /* renamed from: f */
    boolean mo84203f();

    /* renamed from: g */
    void mo84204g();

    /* renamed from: h */
    void mo84205h();

    /* renamed from: i */
    boolean mo84206i();

    /* renamed from: j */
    boolean mo84207j();

    /* renamed from: k */
    int mo84208k();

    /* renamed from: l */
    boolean mo84209l();

    /* renamed from: m */
    float mo84210m();

    /* renamed from: n */
    float mo84211n();

    /* renamed from: o */
    float mo84212o();

    /* renamed from: p */
    IObjectWrapper mo84213p();

    /* renamed from: q */
    boolean mo84214q();

    /* renamed from: r */
    void mo84215r();
}
