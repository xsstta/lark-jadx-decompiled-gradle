package com.huawei.hms.maps;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.feature.dynamic.IObjectWrapper;

public interface mbs extends IInterface {

    public static abstract class maa extends Binder implements mbs {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mbs$maa$maa  reason: collision with other inner class name */
        public static class C70270maa implements mbs {

            /* renamed from: a */
            private IBinder f58648a;

            C70270maa(IBinder iBinder) {
                this.f58648a = iBinder;
            }

            @Override // com.huawei.hms.maps.mbs
            /* renamed from: a */
            public final IObjectWrapper mo84076a() {
                return IObjectWrapper.Stub.asInterface(mbz.m86560i(this.f58648a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 3));
            }

            @Override // com.huawei.hms.maps.mbs
            /* renamed from: a */
            public final void mo84077a(Bundle bundle) {
                mbz.m86543a(this.f58648a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 4, bundle);
            }

            @Override // com.huawei.hms.maps.mbs
            /* renamed from: a */
            public final void mo84078a(mbn mbn) {
                IBinder asBinder = mbn.asBinder();
                mbz.m86542a(this.f58648a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 2, asBinder);
            }

            public final IBinder asBinder() {
                return this.f58648a;
            }

            @Override // com.huawei.hms.maps.mbs
            /* renamed from: b */
            public final void mo84079b() {
                mbz.m86559h(this.f58648a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 5);
            }

            @Override // com.huawei.hms.maps.mbs
            /* renamed from: b */
            public final void mo84080b(Bundle bundle) {
                mbz.m86543a(this.f58648a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 9, bundle);
            }

            @Override // com.huawei.hms.maps.mbs
            /* renamed from: c */
            public final void mo84081c() {
                mbz.m86559h(this.f58648a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 6);
            }

            @Override // com.huawei.hms.maps.mbs
            /* renamed from: d */
            public final void mo84082d() {
                mbz.m86559h(this.f58648a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 7);
            }

            @Override // com.huawei.hms.maps.mbs
            /* renamed from: e */
            public final void mo84083e() {
                mbz.m86559h(this.f58648a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 8);
            }

            @Override // com.huawei.hms.maps.mbs
            /* renamed from: f */
            public final void mo84084f() {
                mbz.m86559h(this.f58648a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 10);
            }

            @Override // com.huawei.hms.maps.mbs
            /* renamed from: g */
            public final void mo84085g() {
                mbz.m86559h(this.f58648a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 11);
            }
        }

        /* renamed from: a */
        public static mbs m86456a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mbs)) ? new C70270maa(iBinder) : (mbs) queryLocalInterface;
        }
    }

    /* renamed from: a */
    IObjectWrapper mo84076a();

    /* renamed from: a */
    void mo84077a(Bundle bundle);

    /* renamed from: a */
    void mo84078a(mbn mbn);

    /* renamed from: b */
    void mo84079b();

    /* renamed from: b */
    void mo84080b(Bundle bundle);

    /* renamed from: c */
    void mo84081c();

    /* renamed from: d */
    void mo84082d();

    /* renamed from: e */
    void mo84083e();

    /* renamed from: f */
    void mo84084f();

    /* renamed from: g */
    void mo84085g();
}
