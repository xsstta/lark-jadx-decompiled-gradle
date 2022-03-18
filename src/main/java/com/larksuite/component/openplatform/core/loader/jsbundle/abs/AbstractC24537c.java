package com.larksuite.component.openplatform.core.loader.jsbundle.abs;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24543b;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbsJSSDKInstaller;
import com.larksuite.component.openplatform.core.loader.jsbundle.bean.C24547c;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.refer.common.download.AbsDownloadListener;
import com.tt.refer.common.download.AbstractC67757b;
import com.tt.refer.common.download.C67752a;
import com.tt.refer.common.download.engine.model.DownloadRequest;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.abs.c */
public abstract class AbstractC24537c {

    /* renamed from: a */
    protected IAppContext f60498a;

    /* renamed from: b */
    protected C24547c f60499b = new C24547c();

    /* renamed from: c */
    public IMonitorCreator f60500c;

    /* renamed from: d */
    private AbsJSSDKInstaller f60501d;

    /* renamed from: e */
    private AbstractC67757b<DownloadRequest> f60502e = new C67752a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo87384a(Context context, String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo87385a(Context context, JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo87386b(Context context, long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo87439d() {
        return ".zip";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo87387e(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo87388f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo87389g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract String mo87390h();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public File mo87441e() {
        return ((AbstractC67722a) this.f60498a.findServiceByInterface(AbstractC67722a.class)).mo235090e();
    }

    /* renamed from: b */
    public File mo87435b() {
        File file = new File(((AbstractC67722a) this.f60498a.findServiceByInterface(AbstractC67722a.class)).mo235093f(), "base_bundle");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo87437c() {
        try {
            File file = new File(mo87435b(), "latest_basebundle_version");
            if (!file.exists()) {
                AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "js sdk version file is not exist!");
                return -1;
            }
            String readString = IOUtils.readString(file.getAbsolutePath(), "utf-8");
            if (TextUtils.isEmpty(readString)) {
                AppBrandLogger.m52829e("js_bundle_manager_js_sdk", "ready empty version from js sdk version file!!");
                return -1;
            }
            long parseLong = Long.parseLong(CharacterUtils.replaceBlank(readString));
            AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "getLatestJSSDK Version:", Long.valueOf(parseLong));
            return parseLong;
        } catch (Exception e) {
            AppBrandLogger.m52829e("js_bundle_manager_js_sdk", "getLatestJSSDK exception: " + e.getMessage(), e);
            AppBrandLogger.m52829e("js_bundle_manager_js_sdk", "getLatestAlreadyInstallJSSDKVersion ....");
            return -1;
        }
    }

    /* renamed from: a */
    public void mo87429a() {
        if (TextUtils.isEmpty(this.f60499b.mo87465b())) {
            long c = mo87437c();
            if (c > 0) {
                this.f60499b.mo87466b(C24543b.m89516a(c));
            }
        }
        if (TextUtils.isEmpty(this.f60499b.mo87463a()) && !TextUtils.isEmpty(this.f60499b.mo87465b())) {
            C24547c cVar = this.f60499b;
            cVar.mo87464a(C24543b.m89518b(cVar.mo87465b()));
        }
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "initJSSDKEntity:", this.f60499b);
    }

    /* renamed from: a */
    public void mo87433a(IMonitorCreator iMonitorCreator) {
        this.f60500c = iMonitorCreator;
    }

    public AbstractC24537c(IAppContext iAppContext) {
        this.f60498a = iAppContext;
    }

    /* renamed from: a */
    public void mo87434a(AbsJSSDKInstaller absJSSDKInstaller) {
        this.f60501d = absJSSDKInstaller;
    }

    /* renamed from: a */
    public String mo87428a(Context context) {
        mo87429a();
        if (!TextUtils.isEmpty(this.f60499b.mo87465b())) {
            AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "getJSSDKCurrentVersion->", this.f60499b.mo87465b());
            return this.f60499b.mo87465b();
        }
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "getJSSDKCurrentVersion->empty");
        return "";
    }

    /* renamed from: b */
    public File mo87436b(Context context) {
        File file = new File(mo87435b(), mo87428a(context));
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "jsSdkDir:", file.getAbsolutePath());
        if (!file.exists()) {
            AppBrandLogger.m52829e("js_bundle_manager_js_sdk", "jsSdkDir is not exist!");
        }
        return file;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo87440d(Context context) {
        String name = this.f60498a.getAppType().name();
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "isNeedUpdateLocalJSSDK appTypeName:", name);
        String g = mo87389g();
        String string = Storage.getStorageByName(context, mo87390h()).getString(name, "");
        if (!TextUtils.equals(g, string)) {
            AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "needUpdateLocalJSSDK:current version code:", g, "installedVersionCode", string);
            Storage.getStorageByName(context, mo87390h()).edit().putString(name, g).commit();
            return true;
        }
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "noNeedUpdateLocalJSSDK:current version code:", g, "installedVersionCode", string);
        return false;
    }

    /* renamed from: c */
    public void mo87438c(Context context) {
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "start install build in js sdk ....");
        String f = mo87388f();
        if (!TextUtils.isEmpty(f)) {
            AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "has buildInPath:", f);
            long c = mo87437c();
            if (c <= 0 || mo87440d(context)) {
                AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "need update js sdk ...latestVersion:", Long.valueOf(c));
                File file = new File(mo87435b().getParentFile(), mo87388f());
                try {
                    if (!IOUtils.copyAssets(context, f, file.getAbsolutePath()) || !file.exists()) {
                        AppBrandLogger.m52829e("js_bundle_manager_js_sdk", "installBuildInAndRemoveNoUseJSSDK copy assets failed!");
                    } else {
                        mo87431a(context, file, "buildin_jssdk");
                    }
                } catch (Exception e) {
                    AppBrandLogger.m52829e("js_bundle_manager_js_sdk", "installBuildInAndRemoveNoUseJSSDK error: " + e.getMessage(), e);
                }
            } else {
                AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "js sdk  no need to update..latestVersion:", Long.valueOf(c));
            }
        } else {
            AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "has no buildInPath.....");
        }
        mo87387e(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo87427a(Context context, File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    String readString = IOUtils.readString(new File(file, "__dev__/basebundlecheck").getAbsolutePath(), "utf-8");
                    AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "getJSSDKVersionBeforeInstall->", readString);
                    long parseLong = Long.parseLong(readString);
                    AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "getBundleVersion,bundleVersion:", Long.valueOf(parseLong));
                    return parseLong;
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("js_bundle_manager_js_sdk", "getBundleVersion error: " + e.getMessage(), e);
                return -1;
            }
        }
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "getBundleVersion unZipDestDir is null or not exist!");
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo87430a(Context context, long j) {
        try {
            String absolutePath = new File(mo87435b(), "latest_basebundle_version").getAbsolutePath();
            IOUtils.writeStringToFile(absolutePath, j + "", "UTF-8");
            AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "updateLatestAlreadyInstallJSSDKVersion success:", Long.valueOf(j));
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("js_bundle_manager_js_sdk", "updateLatestAlreadyInstallJSSDKVersion error: " + e.getMessage(), e);
        }
        mo87386b(context, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo87431a(final Context context, File file, final String str) {
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        if (this.f60501d != null) {
            LarkInnerEventHelper.mpJsSDKInstallStart(this.f60500c);
            this.f60501d.mo87394a(context, file, str, new AbsJSSDKInstaller.AbstractC24521a() {
                /* class com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24537c.C245392 */

                @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbsJSSDKInstaller.AbstractC24521a
                /* renamed from: a */
                public void mo87398a(long j, boolean z) {
                    AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "js sdk install success.version:", Long.valueOf(j), "fromLocal:", Boolean.valueOf(z));
                    IMonitorCreator iMonitorCreator = AbstractC24537c.this.f60500c;
                    String a = AbstractC24537c.this.mo87384a(context, "sdk_update_version");
                    String a2 = AbstractC24537c.this.mo87428a(context);
                    boolean equals = TextUtils.equals(str, "buildin_jssdk");
                    LarkInnerEventHelper.mpJsSDKInstallResult(iMonitorCreator, true, a, a2, null, null, equals ? 1 : 0, TimeMeter.stop(newAndStart));
                    if (!z) {
                        AbstractC24537c.this.mo87430a(context, j);
                    }
                }

                @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbsJSSDKInstaller.AbstractC24521a
                /* renamed from: a */
                public void mo87399a(String str, String str2) {
                    IMonitorCreator iMonitorCreator = AbstractC24537c.this.f60500c;
                    String a = AbstractC24537c.this.mo87384a(context, "sdk_update_version");
                    String a2 = AbstractC24537c.this.mo87428a(context);
                    boolean equals = TextUtils.equals(str, "buildin_jssdk");
                    LarkInnerEventHelper.mpJsSDKInstallResult(iMonitorCreator, false, a, a2, null, null, equals ? 1 : 0, TimeMeter.stop(newAndStart));
                    AppBrandLogger.m52829e("js_bundle_manager_js_sdk", "install js sdk failed: code:", str, "reason:", str2);
                }
            });
            return;
        }
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "installer is null!");
    }

    /* renamed from: a */
    public void mo87432a(final Context context, JSONObject jSONObject, TimeMeter timeMeter) {
        mo87385a(context, jSONObject);
        final String a = mo87428a(context);
        final String a2 = mo87384a(context, "sdk_update_version");
        String a3 = mo87384a(context, "latest_sdk_url");
        LarkInnerEventHelper.mpJsSDKRequestResult(this.f60500c, true, a2, a, null, null, TimeMeter.stop(timeMeter));
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "localVersion:", a, "settingVersion:", a2);
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        LarkInnerEventHelper.mpJsSDKDownloadStart(this.f60500c);
        if (C24543b.m89515a(a, a2) <= 0) {
            AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "no need update ,localVersion >= settingVersion");
            LarkInnerEventHelper.mpJsSDKDownloadResult(this.f60500c, true, a2, a, null, null, 1, TimeMeter.stop(newAndStart));
            return;
        }
        AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "start download js sdk,url is :", a3);
        String str = System.currentTimeMillis() + mo87439d();
        this.f60502e.mo235134a(new DownloadRequest.C67778a(a3).mo235239a(str).mo235242b(new File(mo87441e(), str).getAbsolutePath()).mo235241b(3).mo235240a(), new AbsDownloadListener<DownloadRequest>() {
            /* class com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24537c.C245381 */

            /* renamed from: a */
            public void onStart(DownloadRequest downloadRequest) {
                AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "startDownloadJSSDK->onStart->", downloadRequest);
            }

            /* renamed from: b */
            public void onComplete(DownloadRequest downloadRequest) {
                AppBrandLogger.m52830i("js_bundle_manager_js_sdk", "startDownloadJSSDK->onComplete->", downloadRequest);
                LarkInnerEventHelper.mpJsSDKDownloadResult(AbstractC24537c.this.f60500c, true, a2, a, null, null, 0, TimeMeter.stop(newAndStart));
                AbstractC24537c.this.mo87431a(context, new File(downloadRequest.getDownloadPath()), "download_jssdk");
            }

            /* renamed from: c */
            public void onError(DownloadRequest downloadRequest) {
                LarkInnerEventHelper.mpJsSDKDownloadResult(AbstractC24537c.this.f60500c, false, a2, a, downloadRequest.getDownloadError().f170701a, downloadRequest.getDownloadError().f170702b, 0, TimeMeter.stop(newAndStart));
                AppBrandLogger.m52829e("js_bundle_manager_js_sdk", "startDownloadJSSDK->onError: errorMsg:", downloadRequest.getDownloadError().f170702b);
            }
        });
    }
}
