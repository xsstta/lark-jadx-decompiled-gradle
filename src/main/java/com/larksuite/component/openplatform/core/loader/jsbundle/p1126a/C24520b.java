package com.larksuite.component.openplatform.core.loader.jsbundle.p1126a;

import android.content.Context;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbsJSSDKInstaller;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24537c;
import com.tt.miniapphost.util.AppbrandUtil;
import java.io.File;

/* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.a.b */
public class C24520b extends AbsJSSDKInstaller {
    public C24520b(AbstractC24537c cVar) {
        super(cVar);
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbsJSSDKInstaller
    /* renamed from: a */
    public void mo87394a(Context context, File file, String str, AbsJSSDKInstaller.AbstractC24521a aVar) {
        if (file == null || !file.exists()) {
            aVar.mo87399a(AbsJSSDKInstaller.C24522b.f60460b.mo87401b(), AbsJSSDKInstaller.C24522b.f60460b.mo87400a());
            AppBrandLogger.m52829e("js_bundle_manager_js_sdk_installer_zip", "startInstallJSSDK ,needInstallFile is null or needInstallFile not exist!");
        }
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk_installer_zip", "startInstallJSSDK->", file.getAbsolutePath());
        m89418a(context, file, str, str.equals("buildin_jssdk"), aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo87393a(long j, File file, boolean z, AbsJSSDKInstaller.AbstractC24521a aVar) {
        long b = mo87397b();
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk_installer_zip", "tryInstallJSSDKLock->latestJSSDK Version:", Long.valueOf(b), "toInstallVersion:", Long.valueOf(j), "forceUpdate", Boolean.valueOf(z));
        if (b >= j && !z) {
            AppBrandLogger.m52830i("js_bundle_manager_js_sdk_installer_zip", "no need install...");
            aVar.mo87398a(b, true);
        }
        File file2 = new File(mo87396a(), AppbrandUtil.convertVersionCodeToStr(j));
        if (!file2.exists()) {
            file2.mkdirs();
        }
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk_installer_zip", "start install js sdk version:", Long.valueOf(j));
        int i = 0;
        boolean z2 = false;
        while (i < 3 && !z2) {
            IOUtils.clearDir(file2);
            z2 = IOUtils.copyFolder(new File(file, "__dev__"), file2);
            i++;
        }
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk_installer_zip", "install result isInstallSuccess:", Boolean.valueOf(z2), "retryTime:", Integer.valueOf(i), "toInstallVersion:", Long.valueOf(j), "fromFile:", file.getAbsolutePath());
        if (!z2) {
            AppBrandLogger.m52829e("js_bundle_manager_js_sdk_installer_zip", "install js sdk fail!");
            aVar.mo87399a(AbsJSSDKInstaller.C24522b.f60459a.mo87401b(), AbsJSSDKInstaller.C24522b.f60459a.mo87400a());
        }
        aVar.mo87398a(j, false);
    }

    /* renamed from: a */
    private void m89418a(Context context, File file, String str, boolean z, AbsJSSDKInstaller.AbstractC24521a aVar) {
        boolean z2;
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk_installer_zip", "startUnZipJSSDK:", file.getAbsolutePath());
        File file2 = new File(mo87396a().getParentFile(), str);
        try {
            IOUtils.unZipFolder(file.getAbsolutePath(), file2.getAbsolutePath());
            z2 = true;
        } catch (Exception e) {
            AppBrandLogger.m52829e("js_bundle_manager_js_sdk_installer_zip", "unZipFileJSSDK error:", e);
            z2 = false;
        }
        String str2 = "";
        if (!z2) {
            try {
                AppBrandLogger.m52830i("js_bundle_manager_js_sdk_installer_zip", "unZipFileJSSDK,retry unzip....");
                IOUtils.unZipFolder(file.getAbsolutePath(), file2.getAbsolutePath());
                z2 = true;
            } catch (Exception e2) {
                str2 = Log.getStackTraceString(e2);
                AppBrandLogger.m52829e("js_bundle_manager_js_sdk_installer_zip", "unZipFileJSSDK retry error:", e2);
                z2 = false;
            }
        }
        if (!z2) {
            AppBrandLogger.m52830i("js_bundle_manager_js_sdk_installer_zip", "retry error,so clear dir...");
            IOUtils.clearDir(file2);
            String b = AbsJSSDKInstaller.C24522b.f60461c.mo87401b();
            aVar.mo87399a(b, AbsJSSDKInstaller.C24522b.f60461c.mo87400a() + str2);
        }
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk_installer_zip", "unZipJSSDK success!!!");
        long a = mo87395a(context, file2);
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk_installer_zip", "unZipJSSDK version:", Long.valueOf(a));
        mo87393a(a, file2, z, aVar);
        file.delete();
        IOUtils.clearDir(file2);
    }
}
