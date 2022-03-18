package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface mal extends IInterface {

    public static abstract class maa extends Binder implements mal {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mal$maa$maa  reason: collision with other inner class name */
        public static class C70264maa implements mal {

            /* renamed from: a */
            private IBinder f58642a;

            C70264maa(IBinder iBinder) {
                this.f58642a = iBinder;
            }

            @Override // com.huawei.hms.maps.mal
            /* renamed from: a */
            public final void mo83973a(mbx mbx) {
                mbz.m86543a(this.f58642a, "com.huawei.hms.maps.internal.IMapClientIdentity", 1, mbx);
            }

            public final IBinder asBinder() {
                return this.f58642a;
            }
        }

        /* renamed from: a */
        public static mal m86351a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IMapClientIdentity");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mal)) ? new C70264maa(iBinder) : (mal) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo83973a(mbx mbx);
}
