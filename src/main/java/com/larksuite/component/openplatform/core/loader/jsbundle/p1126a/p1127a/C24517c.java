package com.larksuite.component.openplatform.core.loader.jsbundle.p1126a.p1127a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24543b;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24537c;
import com.larksuite.component.openplatform.core.loader.jsbundle.p1126a.C24520b;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapphost.util.ProcessUtil;
import java.io.File;
import java.io.FileFilter;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.a.a.c */
public class C24517c extends AbstractC24537c {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24537c
    /* renamed from: f */
    public String mo87388f() {
        return "__dev__.zip";
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24537c
    /* renamed from: g */
    public String mo87389g() {
        return "72";
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24537c
    /* renamed from: h */
    public String mo87390h() {
        return "latest_version_name";
    }

    public C24517c(IAppContext iAppContext) {
        super(iAppContext);
        mo87434a(new C24520b(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24537c
    /* renamed from: e */
    public void mo87387e(Context context) {
        try {
            AppBrandLogger.m52830i("gadget_js_bundle_manager_js_sdk", "clearNoUseJSSDK start.....");
            for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
                if (iAppSandboxEnvProcessor != null && iAppSandboxEnvProcessor.hasSandboxExist(context)) {
                    AppBrandLogger.m52830i("gadget_js_bundle_manager_js_sdk", "clearNoUseJSSDK,but has sandBox exist....");
                    return;
                }
            }
            long c = mo87437c();
            File b = mo87435b();
            if (c > 0) {
                if (b.exists()) {
                    File[] listFiles = b.listFiles(new FileFilter() {
                        /* class com.larksuite.component.openplatform.core.loader.jsbundle.p1126a.p1127a.C24517c.C245181 */

                        public boolean accept(File file) {
                            return file.isDirectory();
                        }
                    });
                    for (File file : listFiles) {
                        if (file != null) {
                            if (!TextUtils.isEmpty(file.getName())) {
                                if (C24543b.m89514a(file.getName()) != c) {
                                    IOUtils.delete(file);
                                    AppBrandLogger.m52830i("gadget_js_bundle_manager_js_sdk", "clearNoUseJSSDK success!->version:", file.getName());
                                }
                            }
                        }
                    }
                    return;
                }
            }
            AppBrandLogger.m52830i("gadget_js_bundle_manager_js_sdk", "clearNoUseJSSDK,but version code <=0 or js sdk dir not exist!,versionCode", Long.valueOf(c));
        } catch (Exception e) {
            AppBrandLogger.m52829e("gadget_js_bundle_manager_js_sdk", "clearNoUseJSSDK error:", e.getMessage(), e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24537c
    /* renamed from: a */
    public String mo87384a(Context context, String str) {
        return Storage.getStorageByName(context, "tma_jssdk_info").getString(str, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24537c
    /* renamed from: b */
    public void mo87386b(Context context, long j) {
        if (ProcessUtil.isMainProcess(context) && j > 0) {
            String a = C24543b.m89516a(j);
            this.f60499b.mo87464a(C24543b.m89518b(a));
            this.f60499b.mo87466b(a);
            AppBrandLogger.m52830i("gadget_js_bundle_manager_js_sdk", "updateMemoryJSSDKVersion:", Long.valueOf(j));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24537c
    /* renamed from: a */
    public void mo87385a(Context context, JSONObject jSONObject) {
        try {
            SharedPreferences.Editor edit = Storage.getStorageByName(context, "tma_jssdk_info").edit();
            if (jSONObject.has("sdkVersion")) {
                String optString = jSONObject.optString("sdkVersion");
                AppBrandLogger.m52830i("gadget_js_bundle_manager_js_sdk", "setting sdk version:", optString);
                edit.putString("sdk_version", optString);
            }
            if (jSONObject.has("sdkUpdateVersion")) {
                edit.putString("sdk_update_version", jSONObject.optString("sdkUpdateVersion"));
            }
            if (jSONObject.has("latestSDKUrl")) {
                edit.putString("latest_sdk_url", jSONObject.optString("latestSDKUrl"));
            }
            edit.apply();
        } catch (Exception e) {
            AppBrandLogger.m52829e("gadget_js_bundle_manager_js_sdk", "saveJSSDKSetting error!", e.getMessage(), e);
        }
    }
}
