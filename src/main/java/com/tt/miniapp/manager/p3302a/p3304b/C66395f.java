package com.tt.miniapp.manager.p3302a.p3304b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12795a;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12824b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapp.event.C66016a;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.net.p3308a.C66498a;
import com.tt.miniapp.settings.v2.handler.C66790o;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.miniapphost.util.TimeMeter;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import okhttp3.Response;

/* renamed from: com.tt.miniapp.manager.a.b.f */
public class C66395f extends AbstractC66390a {

    /* renamed from: e */
    private static int f167623e;

    /* renamed from: d */
    public final CountDownLatch f167624d = new CountDownLatch(1);

    /* renamed from: f */
    private IAppContext f167625f;

    /* renamed from: a */
    private boolean m259600a(boolean z, boolean z2) {
        return z && !z2;
    }

    /* renamed from: a */
    private boolean m259598a(String str) {
        return !TextUtils.isEmpty(str);
    }

    public C66395f(IAppContext iAppContext) {
        this.f167625f = iAppContext;
    }

    @Override // com.tt.miniapp.manager.p3302a.p3304b.AbstractC66390a
    /* renamed from: a */
    public C66391b mo231908a(Context context, C66391b bVar) {
        if (bVar.f167618f) {
            AppBrandLogger.m52830i("DownloadBaseBundleHandler", "download jssdk, ignore task");
            return bVar;
        }
        String b = C66399c.m259608a().mo231922b(context, this.f167625f);
        String a = C66790o.m260656a(context).mo232700a("sdk_update_version");
        long convertVersionStrToCode = AppbrandUtil.convertVersionStrToCode(b);
        long convertVersionStrToCode2 = AppbrandUtil.convertVersionStrToCode(a);
        String convertFourToThreeVersion = AppbrandUtil.convertFourToThreeVersion(b);
        String convertFourToThreeVersion2 = AppbrandUtil.convertFourToThreeVersion(a);
        String a2 = C66399c.m259608a().mo231913a(context);
        String a3 = C66790o.m260656a(context).mo232700a("greyHash");
        bVar.f167615c = a3;
        String a4 = C66790o.m260656a(context).mo232700a("latest_sdk_url");
        C66016a.C66018a aVar = bVar.f167613a;
        long millisAfterStart = bVar.f167616d.getMillisAfterStart();
        boolean a5 = m259598a(a3);
        m259596a(aVar, b, a, millisAfterStart, bVar.f167615c);
        if (m259600a(!TextUtils.isEmpty(C66399c.m259608a().mo231913a(context)), a5)) {
            bVar.f167619g = true;
            aVar.mo231087e("online force update:" + b);
        } else {
            if (convertFourToThreeVersion.equals(convertFourToThreeVersion2) && m259599a(a5, a3, a2, context, this.f167625f)) {
                bVar.f167619g = true;
                aVar.mo231087e("grey hash:" + a2 + " update to:" + a3);
            }
            if (convertVersionStrToCode >= convertVersionStrToCode2 && !bVar.f167619g) {
                C66036d.m262458a("mp_lib_validation_result", b, a, "", "no_update", "", -1);
                aVar.mo231087e("no need update remote basebundle version,start checkUpdateBaseBundle");
                bVar.f167618f = true;
                return bVar;
            }
        }
        C66036d.m262458a("mp_lib_validation_result", b, a, bVar.f167615c, "need_update", "", -1);
        aVar.mo231087e("remote basebundle version validate,start download remote basebundle");
        bVar.f167616d = TimeMeter.newAndStart();
        m259597a(a4, aVar, bVar, b, a, bVar.f167621i);
        try {
            this.f167624d.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (bVar.f167617e) {
            return bVar;
        }
        while (f167623e <= 3 && !bVar.f167617e) {
            f167623e++;
            m259597a(a4, aVar, bVar, b, a, bVar.f167621i);
            try {
                this.f167624d.await();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        return bVar;
    }

    /* renamed from: a */
    private void m259596a(C66016a.C66018a aVar, String str, String str2, long j, String str3) {
        C66036d.m262458a("mp_lib_request_result", str, str2, str3, "success", "", j);
        aVar.mo231087e("request remote basebundle success");
    }

    /* renamed from: a */
    private boolean m259599a(boolean z, String str, String str2, Context context, IAppContext iAppContext) {
        if (!new File(AppbrandUtil.getAppServiceDir(context), C66399c.m259608a().mo231923c(context, iAppContext)).exists()) {
            return true;
        }
        if (str.equals(str2) || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m259597a(String str, final C66016a.C66018a aVar, final C66391b bVar, final String str2, final String str3, IAppContext iAppContext) {
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        File a = C12791h.m52861a(AppbrandContext.getInst().getApplicationContext());
        boolean featureGating = LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.catch_download_error.enabled");
        if (a != null || !featureGating) {
            final C12824b bVar2 = new C12824b(str, false);
            bVar2.mo48417a(a.getPath());
            bVar2.mo48418b(System.currentTimeMillis() + ".ooo");
            C66498a.m259872a(bVar2.mo48450m(), bVar2.mo48449l(), (String) null, (String) null, bVar2.mo48419c(), bVar2.mo48420d(), new AbstractC12795a() {
                /* class com.tt.miniapp.manager.p3302a.p3304b.C66395f.C663961 */

                @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12795a, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
                /* renamed from: a */
                public void mo48351a(int i, long j, long j2) {
                }

                @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12795a, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
                /* renamed from: a */
                public void mo48353a(Response response) {
                    super.mo48353a(response);
                    File file = new File(bVar2.mo48419c(), bVar2.mo48420d());
                    if (file.exists()) {
                        aVar.mo231087e("remote basebundle download success");
                        long millisAfterStart = newAndStart.getMillisAfterStart();
                        bVar.f167617e = true;
                        bVar.f167620h = file;
                        C66036d.m262458a("mp_lib_download_result", str2, str3, bVar.f167615c, "success", "", millisAfterStart);
                    } else {
                        aVar.mo231087e("remote basebundle download success");
                        bVar.f167617e = false;
                    }
                    C66395f.this.f167624d.countDown();
                }

                @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12795a, com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
                /* renamed from: a */
                public void mo48352a(String str, Throwable th) {
                    aVar.mo231087e("remote basebundle download failed");
                    AppBrandLogger.m52829e("DownloadBaseBundleHandler", str, th);
                    C66036d.m262458a("mp_lib_download_result", str2, str3, bVar.f167615c, "fail", "jssdk tmp file download fail", newAndStart.getMillisAfterStart());
                    aVar.mo231087e("remote base bundle download failed");
                    bVar.f167617e = false;
                    C66395f.this.f167624d.countDown();
                    C67500a aVar = new C67500a(C67501b.f170246n, C66395f.this.f167611b.f167621i);
                    OPMonitor errorMessage = aVar.setErrorMessage("jssdk download failed, msg: " + str);
                    if (th != null) {
                        errorMessage.setError(th);
                    }
                    errorMessage.flush();
                }
            }, iAppContext);
            return;
        }
        aVar.mo231087e("remote basebundle download failed");
        AppBrandLogger.m52829e("DownloadBaseBundleHandler", "jssdk tmp file download fail : externalCacheDir is null");
        C66036d.m262458a("mp_lib_download_result", str2, str3, bVar.f167615c, "fail", "jssdk tmp file download fail, msg: externalCacheDir is null", newAndStart.getMillisAfterStart());
        this.f167624d.countDown();
        bVar.f167617e = false;
        new C67500a(C67501b.f170246n, this.f167611b.f167621i).setErrorMessage("jssdk tmp file download fail, msg: externalCacheDir is null").flush();
    }
}
