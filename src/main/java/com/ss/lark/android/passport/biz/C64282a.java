package com.ss.lark.android.passport.biz;

import android.app.Activity;
import com.ss.android.bytedcert.callback.SDKCallBack;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.p1304b.C28320c;
import com.ss.android.lark.passport.infra.config.PassportConfigHelper;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import java.util.HashMap;

/* renamed from: com.ss.lark.android.passport.biz.a */
public class C64282a {

    /* renamed from: com.ss.lark.android.passport.biz.a$a */
    private static class C64283a {

        /* renamed from: a */
        public static final C64282a f162494a = new C64282a();
    }

    /* renamed from: a */
    public static C64282a m252790a() {
        return C64283a.f162494a;
    }

    /* renamed from: b */
    private void m252791b() {
        C28320c.m103910a("http://");
        C28320c.m103912b("rc-boe.snssdk.com");
    }

    /* renamed from: b */
    private void m252792b(String str, String str2) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("scene", PassportConfigHelper.m193022d());
        hashMap.put("ticket", str);
        hashMap.put("cert_app_id", PassportConfigHelper.m193023e());
        hashMap.put("mode", str2);
        BytedCertManager.getInstance().setCertInfo(hashMap);
    }

    /* renamed from: a */
    public void mo222764a(String str, String str2) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("scene", PassportConfigHelper.m193020b());
        hashMap.put("ticket", str);
        hashMap.put("cert_app_id", PassportConfigHelper.m193021c());
        hashMap.put("mode", str2);
        BytedCertManager.getInstance().setCertInfo(hashMap);
    }

    /* renamed from: a */
    public void mo222762a(Activity activity, String str, String str2, String str3, String str4, int i, PassportLog passportLog, SDKCallBack.FaceLiveCallback faceLiveCallback) {
        if (ServiceFinder.m193749d().isBoeConfig()) {
            m252791b();
        }
        if (i == 0) {
            passportLog.mo171465b("ByteCertSdkHelper", "setCertInfo");
            mo222764a(str, str4);
        } else {
            passportLog.mo171465b("ByteCertSdkHelper", "setPassiveInfo");
            m252792b(str, str4);
        }
        BytedCertManager.getInstance().doFaceLive(activity, str2, str3, faceLiveCallback);
    }

    /* renamed from: a */
    public void mo222763a(Activity activity, String str, String str2, String str3, String str4, boolean z, PassportLog passportLog, SDKCallBack.FaceLiveCallback faceLiveCallback) {
        if (ServiceFinder.m193749d().isBoeConfig()) {
            m252791b();
        }
        if (z) {
            passportLog.mo171465b("ByteCertSdkHelper", "setCertInfo");
            mo222764a(str, str4);
        } else {
            passportLog.mo171465b("ByteCertSdkHelper", "setPassiveInfo");
            m252792b(str, str4);
        }
        BytedCertManager.getInstance().doFaceLive(activity, str2, str3, faceLiveCallback);
    }
}
