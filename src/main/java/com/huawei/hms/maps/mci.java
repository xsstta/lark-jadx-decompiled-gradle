package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface mci extends IInterface {

    public static abstract class maa extends Binder implements mci {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mci$maa$maa  reason: collision with other inner class name */
        public static class C70280maa implements mci {

            /* renamed from: a */
            private IBinder f58671a;

            C70280maa(IBinder iBinder) {
                this.f58671a = iBinder;
            }

            @Override // com.huawei.hms.maps.mci
            /* renamed from: a */
            public final void mo84253a() {
                mbz.m86559h(this.f58671a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 1);
            }

            @Override // com.huawei.hms.maps.mci
            /* renamed from: a */
            public final void mo84254a(float f) {
                mbz.m86544a(this.f58671a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 9, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mci
            /* renamed from: a */
            public final void mo84255a(boolean z) {
                mbz.m86548a(z, this.f58671a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 8);
            }

            @Override // com.huawei.hms.maps.mci
            /* renamed from: a */
            public final boolean mo84256a(mci mci) {
                return mbz.m86551a(mci, this.f58671a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 12);
            }

            public final IBinder asBinder() {
                return this.f58671a;
            }

            @Override // com.huawei.hms.maps.mci
            /* renamed from: b */
            public final void mo84257b(float f) {
                mbz.m86544a(this.f58671a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 11, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mci
            /* renamed from: b */
            public final void mo84258b(boolean z) {
                mbz.m86548a(z, this.f58671a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 10);
            }

            @Override // com.huawei.hms.maps.mci
            /* renamed from: b */
            public final boolean mo84259b() {
                return mbz.m86549a(this.f58671a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 2);
            }

            @Override // com.huawei.hms.maps.mci
            /* renamed from: c */
            public final String mo84260c() {
                return mbz.m86555d(this.f58671a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 3);
            }

            @Override // com.huawei.hms.maps.mci
            /* renamed from: d */
            public final float mo84261d() {
                return mbz.m86554c(this.f58671a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 4);
            }

            @Override // com.huawei.hms.maps.mci
            /* renamed from: e */
            public final float mo84262e() {
                return mbz.m86554c(this.f58671a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 5);
            }

            @Override // com.huawei.hms.maps.mci
            /* renamed from: f */
            public final boolean mo84263f() {
                return mbz.m86549a(this.f58671a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 6);
            }

            @Override // com.huawei.hms.maps.mci
            /* renamed from: g */
            public final void mo84264g() {
                mbz.m86559h(this.f58671a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 7);
            }

            @Override // com.huawei.hms.maps.mci
            /* renamed from: h */
            public final int mo84265h() {
                return mbz.m86552b(this.f58671a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 13);
            }
        }

        /* renamed from: a */
        public static mci m86855a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.ITileOverlayDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mci)) ? new C70280maa(iBinder) : (mci) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo84253a();

    /* renamed from: a */
    void mo84254a(float f);

    /* renamed from: a */
    void mo84255a(boolean z);

    /* renamed from: a */
    boolean mo84256a(mci mci);

    /* renamed from: b */
    void mo84257b(float f);

    /* renamed from: b */
    void mo84258b(boolean z);

    /* renamed from: b */
    boolean mo84259b();

    /* renamed from: c */
    String mo84260c();

    /* renamed from: d */
    float mo84261d();

    /* renamed from: e */
    float mo84262e();

    /* renamed from: f */
    boolean mo84263f();

    /* renamed from: g */
    void mo84264g();

    /* renamed from: h */
    int mo84265h();
}
