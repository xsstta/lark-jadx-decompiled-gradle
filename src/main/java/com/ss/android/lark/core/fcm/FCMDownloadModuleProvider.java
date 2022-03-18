package com.ss.android.lark.core.fcm;

import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.dependency.AbstractC36119d;
import com.ss.android.lark.core.dependency.AbstractC36126l;
import com.ss.android.lark.core.dependency.AbstractC36128n;
import com.ss.android.lark.fcm_download.FCMDownloadModule;
import com.ss.android.lark.fcm_download.IFCMDownModuleDependency;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/core/fcm/FCMDownloadModuleProvider;", "", "()V", "getDependency", "Lcom/ss/android/lark/fcm_download/IFCMDownModuleDependency;", "getModule", "Lcom/ss/android/lark/fcm_download/FCMDownloadModule;", "SingletonHolder", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.core.g.a */
public final class FCMDownloadModuleProvider {

    /* renamed from: a */
    public static final FCMDownloadModuleProvider f93329a = new FCMDownloadModuleProvider();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/core/fcm/FCMDownloadModuleProvider$getDependency$1", "Lcom/ss/android/lark/fcm_download/IFCMDownModuleDependency;", "getLoginUserId", "", "getPassportDependency", "Lcom/ss/android/lark/fcm_download/IFCMDownModuleDependency$IPassportDependency;", "isFCMPluginEnabled", "", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.core.g.a$b */
    public static final class C36139b implements IFCMDownModuleDependency {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/core/fcm/FCMDownloadModuleProvider$getDependency$1$getPassportDependency$1", "Lcom/ss/android/lark/fcm_download/IFCMDownModuleDependency$IPassportDependency;", "getDeviceService", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IDeviceService;", "isLogin", "", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.core.g.a$b$a */
        public static final class C36140a implements IFCMDownModuleDependency.IPassportDependency {
            C36140a() {
            }

            @Override // com.ss.android.lark.fcm_download.IFCMDownModuleDependency.IPassportDependency
            /* renamed from: a */
            public boolean mo133164a() {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                AbstractC36128n passportDependency = a.getPassportDependency();
                Intrinsics.checkExpressionValueIsNotNull(passportDependency, "CoreModule.getDependency().passportDependency");
                return passportDependency.mo133082b();
            }

            @Override // com.ss.android.lark.fcm_download.IFCMDownModuleDependency.IPassportDependency
            /* renamed from: b */
            public IDeviceService mo133165b() {
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                AbstractC36128n passportDependency = a.getPassportDependency();
                Intrinsics.checkExpressionValueIsNotNull(passportDependency, "CoreModule.getDependency().passportDependency");
                IDeviceService p = passportDependency.mo133097p();
                Intrinsics.checkExpressionValueIsNotNull(p, "CoreModule.getDependency…tDependency.deviceService");
                return p;
            }
        }

        C36139b() {
        }

        @Override // com.ss.android.lark.fcm_download.IFCMDownModuleDependency
        /* renamed from: c */
        public IFCMDownModuleDependency.IPassportDependency mo133163c() {
            return new C36140a();
        }

        @Override // com.ss.android.lark.fcm_download.IFCMDownModuleDependency
        /* renamed from: a */
        public boolean mo133161a() {
            AbstractC36119d a = C36083a.m141486a();
            Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
            AbstractC36126l openFeatureDependency = a.getOpenFeatureDependency();
            Intrinsics.checkExpressionValueIsNotNull(openFeatureDependency, "CoreModule.getDependency().openFeatureDependency");
            return openFeatureDependency.mo133002b();
        }

        @Override // com.ss.android.lark.fcm_download.IFCMDownModuleDependency
        /* renamed from: b */
        public String mo133162b() {
            AbstractC36119d a = C36083a.m141486a();
            Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
            AbstractC36128n passportDependency = a.getPassportDependency();
            Intrinsics.checkExpressionValueIsNotNull(passportDependency, "CoreModule.getDependency().passportDependency");
            String d = passportDependency.mo133085d();
            if (d != null) {
                return d;
            }
            return "";
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/core/fcm/FCMDownloadModuleProvider$SingletonHolder;", "", "()V", "INSTANCE", "Lcom/ss/android/lark/fcm_download/IFCMDownModuleDependency;", "getINSTANCE", "()Lcom/ss/android/lark/fcm_download/IFCMDownModuleDependency;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.core.g.a$a */
    public static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f93330a = new SingletonHolder();

        /* renamed from: b */
        private static final IFCMDownModuleDependency f93331b = FCMDownloadModuleProvider.f93329a.mo133159b();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final IFCMDownModuleDependency mo133160a() {
            return f93331b;
        }
    }

    private FCMDownloadModuleProvider() {
    }

    /* renamed from: b */
    public final IFCMDownModuleDependency mo133159b() {
        return new C36139b();
    }

    @JvmStatic
    /* renamed from: a */
    public static final FCMDownloadModule m142093a() {
        return new FCMDownloadModule(SingletonHolder.f93330a.mo133160a());
    }
}
