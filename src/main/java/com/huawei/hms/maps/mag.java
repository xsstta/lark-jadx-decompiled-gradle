package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.mah;
import com.huawei.hms.maps.mal;
import com.huawei.hms.maps.mam;
import com.huawei.hms.maps.man;
import com.huawei.hms.maps.mbr;
import com.huawei.hms.maps.mbs;

public interface mag extends IInterface {

    public static abstract class maa extends Binder implements mag {

        /* renamed from: com.huawei.hms.maps.mag$maa$maa  reason: collision with other inner class name */
        static class C70261maa implements mag {

            /* renamed from: a */
            private IBinder f58639a;

            C70261maa(IBinder iBinder) {
                this.f58639a = iBinder;
            }

            @Override // com.huawei.hms.maps.mag
            /* renamed from: a */
            public final mam mo83888a(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions) {
                return mam.maa.m86366a(mbz.m86537a(this.f58639a, "com.huawei.hms.maps.internal.ICreator", 2, iObjectWrapper != null ? iObjectWrapper.asBinder() : null, huaweiMapOptions));
            }

            @Override // com.huawei.hms.maps.mag
            /* renamed from: a */
            public final mbs mo83889a(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions) {
                return mbs.maa.m86456a(mbz.m86537a(this.f58639a, "com.huawei.hms.maps.internal.ICreator", 7, iObjectWrapper != null ? iObjectWrapper.asBinder() : null, streetViewPanoramaOptions));
            }

            @Override // com.huawei.hms.maps.mag
            /* renamed from: a */
            public final void mo83890a(IObjectWrapper iObjectWrapper) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.maps.internal.ICreator");
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    obtain.writeInt(1000);
                    this.f58639a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f58639a;
            }

            @Override // com.huawei.hms.maps.mag
            /* renamed from: b */
            public final mal mo83891b(IObjectWrapper iObjectWrapper) {
                return mal.maa.m86351a(mbz.m86536a(this.f58639a, "com.huawei.hms.maps.internal.ICreator", 5, iObjectWrapper != null ? iObjectWrapper.asBinder() : null));
            }

            @Override // com.huawei.hms.maps.mag
            /* renamed from: b */
            public final man mo83892b(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions) {
                return man.maa.m86391a(mbz.m86537a(this.f58639a, "com.huawei.hms.maps.internal.ICreator", 3, iObjectWrapper != null ? iObjectWrapper.asBinder() : null, huaweiMapOptions));
            }

            @Override // com.huawei.hms.maps.mag
            /* renamed from: b */
            public final mbr mo83893b(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions) {
                return mbr.maa.m86433a(mbz.m86537a(this.f58639a, "com.huawei.hms.maps.internal.ICreator", 10, iObjectWrapper != null ? iObjectWrapper.asBinder() : null, streetViewPanoramaOptions));
            }

            @Override // com.huawei.hms.maps.mag
            /* renamed from: c */
            public final mah mo83894c(IObjectWrapper iObjectWrapper) {
                return mah.maa.m86214a(mbz.m86536a(this.f58639a, "com.huawei.hms.maps.internal.ICreator", 6, iObjectWrapper != null ? iObjectWrapper.asBinder() : null));
            }

            @Override // com.huawei.hms.maps.mag
            /* renamed from: c */
            public final mam mo83895c(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions) {
                return mam.maa.m86366a(mbz.m86537a(this.f58639a, "com.huawei.hms.maps.internal.ICreator", 11, iObjectWrapper != null ? iObjectWrapper.asBinder() : null, huaweiMapOptions));
            }

            @Override // com.huawei.hms.maps.mag
            /* renamed from: d */
            public final man mo83896d(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions) {
                return man.maa.m86391a(mbz.m86537a(this.f58639a, "com.huawei.hms.maps.internal.ICreator", 12, iObjectWrapper != null ? iObjectWrapper.asBinder() : null, huaweiMapOptions));
            }
        }

        /* renamed from: a */
        public static mag m86203a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.ICreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mag)) ? new C70261maa(iBinder) : (mag) queryLocalInterface;
        }
    }

    /* renamed from: a */
    mam mo83888a(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions);

    /* renamed from: a */
    mbs mo83889a(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions);

    /* renamed from: a */
    void mo83890a(IObjectWrapper iObjectWrapper);

    /* renamed from: b */
    mal mo83891b(IObjectWrapper iObjectWrapper);

    /* renamed from: b */
    man mo83892b(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions);

    /* renamed from: b */
    mbr mo83893b(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions);

    /* renamed from: c */
    mah mo83894c(IObjectWrapper iObjectWrapper);

    /* renamed from: c */
    mam mo83895c(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions);

    /* renamed from: d */
    man mo83896d(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions);
}
