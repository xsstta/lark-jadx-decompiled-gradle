package com.huawei.hms.maps;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.feature.dynamic.IObjectWrapper;

public interface man extends IInterface {

    public static abstract class maa extends Binder implements man {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.man$maa$maa  reason: collision with other inner class name */
        public static class C70266maa implements man {

            /* renamed from: a */
            private IBinder f58644a;

            C70266maa(IBinder iBinder) {
                this.f58644a = iBinder;
            }

            @Override // com.huawei.hms.maps.man
            /* renamed from: a */
            public final IObjectWrapper mo83989a() {
                return IObjectWrapper.Stub.asInterface(mbz.m86560i(this.f58644a, "com.huawei.hms.maps.internal.IMapViewDelegate", 2));
            }

            @Override // com.huawei.hms.maps.man
            /* renamed from: a */
            public final void mo83990a(Bundle bundle) {
                mbz.m86543a(this.f58644a, "com.huawei.hms.maps.internal.IMapViewDelegate", 3, bundle);
            }

            @Override // com.huawei.hms.maps.man
            /* renamed from: a */
            public final void mo83991a(IObjectWrapper iObjectWrapper) {
                mbz.m86542a(this.f58644a, "com.huawei.hms.maps.internal.IMapViewDelegate", 15, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.man
            /* renamed from: a */
            public final void mo83992a(mbc mbc) {
                IBinder asBinder = mbc.asBinder();
                mbz.m86542a(this.f58644a, "com.huawei.hms.maps.internal.IMapViewDelegate", 13, asBinder);
            }

            public final IBinder asBinder() {
                return this.f58644a;
            }

            @Override // com.huawei.hms.maps.man
            /* renamed from: b */
            public final void mo83993b() {
                mbz.m86559h(this.f58644a, "com.huawei.hms.maps.internal.IMapViewDelegate", 4);
            }

            @Override // com.huawei.hms.maps.man
            /* renamed from: b */
            public final void mo83994b(Bundle bundle) {
                mbz.m86543a(this.f58644a, "com.huawei.hms.maps.internal.IMapViewDelegate", 10, bundle);
            }

            @Override // com.huawei.hms.maps.man
            /* renamed from: c */
            public final void mo83995c() {
                mbz.m86559h(this.f58644a, "com.huawei.hms.maps.internal.IMapViewDelegate", 7);
            }

            @Override // com.huawei.hms.maps.man
            /* renamed from: d */
            public final void mo83996d() {
                mbz.m86559h(this.f58644a, "com.huawei.hms.maps.internal.IMapViewDelegate", 8);
            }

            @Override // com.huawei.hms.maps.man
            /* renamed from: e */
            public final void mo83997e() {
                mbz.m86559h(this.f58644a, "com.huawei.hms.maps.internal.IMapViewDelegate", 9);
            }

            @Override // com.huawei.hms.maps.man
            /* renamed from: f */
            public final void mo83998f() {
                mbz.m86559h(this.f58644a, "com.huawei.hms.maps.internal.IMapViewDelegate", 11);
            }

            @Override // com.huawei.hms.maps.man
            /* renamed from: g */
            public final void mo83999g() {
                mbz.m86559h(this.f58644a, "com.huawei.hms.maps.internal.IMapViewDelegate", 12);
            }
        }

        /* renamed from: a */
        public static man m86391a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IMapViewDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof man)) ? new C70266maa(iBinder) : (man) queryLocalInterface;
        }
    }

    /* renamed from: a */
    IObjectWrapper mo83989a();

    /* renamed from: a */
    void mo83990a(Bundle bundle);

    /* renamed from: a */
    void mo83991a(IObjectWrapper iObjectWrapper);

    /* renamed from: a */
    void mo83992a(mbc mbc);

    /* renamed from: b */
    void mo83993b();

    /* renamed from: b */
    void mo83994b(Bundle bundle);

    /* renamed from: c */
    void mo83995c();

    /* renamed from: d */
    void mo83996d();

    /* renamed from: e */
    void mo83997e();

    /* renamed from: f */
    void mo83998f();

    /* renamed from: g */
    void mo83999g();
}
