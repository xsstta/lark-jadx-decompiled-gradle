package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface mce extends IInterface {

    public static abstract class maa extends Binder implements mce {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mce$maa$maa  reason: collision with other inner class name */
        public static class C70276maa implements mce {

            /* renamed from: a */
            private IBinder f58667a;

            C70276maa(IBinder iBinder) {
                this.f58667a = iBinder;
            }

            @Override // com.huawei.hms.maps.mce
            /* renamed from: a */
            public final void mo84175a() {
                mbz.m86559h(this.f58667a, "com.huawei.hms.maps.model.internal.IIndoorLevelDelegate", 1);
            }

            @Override // com.huawei.hms.maps.mce
            /* renamed from: a */
            public final boolean mo84176a(mce mce) {
                return mbz.m86551a(mce, this.f58667a, "com.huawei.hms.maps.model.internal.IIndoorLevelDelegate", 4);
            }

            public final IBinder asBinder() {
                return this.f58667a;
            }

            @Override // com.huawei.hms.maps.mce
            /* renamed from: b */
            public final String mo84177b() {
                return mbz.m86555d(this.f58667a, "com.huawei.hms.maps.model.internal.IIndoorLevelDelegate", 2);
            }

            @Override // com.huawei.hms.maps.mce
            /* renamed from: c */
            public final String mo84178c() {
                return mbz.m86555d(this.f58667a, "com.huawei.hms.maps.model.internal.IIndoorLevelDelegate", 3);
            }

            @Override // com.huawei.hms.maps.mce
            /* renamed from: d */
            public final int mo84179d() {
                return mbz.m86552b(this.f58667a, "com.huawei.hms.maps.model.internal.IIndoorLevelDelegate", 5);
            }
        }

        /* renamed from: a */
        public static mce m86673a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.IIndoorLevelDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mce)) ? new C70276maa(iBinder) : (mce) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo84175a();

    /* renamed from: a */
    boolean mo84176a(mce mce);

    /* renamed from: b */
    String mo84177b();

    /* renamed from: c */
    String mo84178c();

    /* renamed from: d */
    int mo84179d();
}
