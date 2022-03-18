package com.bytedance.ee.bear.basesdk.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.AbstractC4463c;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import com.bytedance.ee.bear.contract.p280d.AbstractC5125a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.deviceinfo.DeviceInfoDetector;
import com.bytedance.ee.util.info.AppInfoUtils;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13629i;
import io.reactivex.AbstractC69011s;
import io.reactivex.AbstractC69013u;
import io.reactivex.Single;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.basesdk.services.g */
public class C4511g implements al {

    /* renamed from: b */
    protected static DocDynamicConfig f13198b;

    /* renamed from: c */
    private static long f13199c;

    /* renamed from: d */
    private static AbstractC4463c f13200d;

    /* renamed from: e */
    private static AbstractC5125a f13201e;

    /* renamed from: a */
    protected Context f13202a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.basesdk.services.g$a */
    public static class C4513a {

        /* renamed from: a */
        public static al f13204a = new C4511g();
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: E */
    public int mo17344E() {
        return 1;
    }

    /* renamed from: a */
    public static long m18587a() {
        return f13199c;
    }

    /* renamed from: c */
    public static AbstractC5125a m18593c() {
        return f13201e;
    }

    /* renamed from: d */
    public static al m18594d() {
        return C4513a.f13204a;
    }

    /* renamed from: j */
    public static DocDynamicConfig m18595j() {
        return f13198b;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: k */
    public DocDynamicConfig mo17361k() {
        return f13198b;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: G */
    public DeviceInfoDetector.DeviceInfo mo17346G() {
        return DeviceInfoDetector.m55377a(this.f13202a);
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: H */
    public String mo17347H() {
        return AppInfoUtils.m55451a();
    }

    /* renamed from: I */
    public String mo17348I() {
        return AppInfoUtils.m55457e(this.f13202a);
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: J */
    public String mo17349J() {
        return AppInfoUtils.m55454c();
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: K */
    public String mo17350K() {
        return mo17348I();
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: L */
    public String mo17351L() {
        return AppInfoUtils.m55452b();
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: M */
    public String mo17352M() {
        return AppInfoUtils.m55459g(this.f13202a);
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: f */
    public long mo17357f() {
        return m18592b();
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: n */
    public String mo17364n() {
        return AppInfoUtils.m55453b(this.f13202a);
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: o */
    public int mo17365o() {
        return AppInfoUtils.m55450a(this.f13202a);
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: p */
    public String mo17366p() {
        return AppInfoUtils.m55455c(this.f13202a);
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: q */
    public String mo17367q() {
        return AppInfoUtils.m55456d(this.f13202a);
    }

    private C4511g() {
        Application application = C13615c.f35773a;
        this.f13202a = application;
        DeviceInfoDetector.m55379b(application);
    }

    /* renamed from: b */
    public static long m18592b() {
        AbstractC4463c cVar = f13200d;
        if (cVar == null) {
            return -1;
        }
        return cVar.mo17231b();
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: g */
    public Activity mo17358g() {
        AbstractC4463c cVar = f13200d;
        if (cVar == null) {
            return null;
        }
        return cVar.mo17232c();
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: h */
    public Activity mo17359h() {
        AbstractC4463c cVar = f13200d;
        if (cVar == null) {
            return null;
        }
        return cVar.mo17233d();
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: i */
    public String mo17360i() {
        AbstractC4463c cVar = f13200d;
        if (cVar == null) {
            return "";
        }
        return cVar.mo17229a().toLowerCase();
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: u */
    public String[] mo17371u() {
        return new String[]{"driveCommonPushChannel", "UPLOAD_FILE_VERSION", "DELETE_FILE_VERSION", "groupChange"};
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: A */
    public String mo17340A() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig != null) {
            return docDynamicConfig.mo20226c().mo20263d();
        }
        C13479a.m54758a("InfoProvideServiceImp", "getFrontendHotFixDomain(): config is null");
        return null;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: B */
    public int mo17341B() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig != null) {
            return docDynamicConfig.mo20226c().mo20265e();
        }
        C13479a.m54758a("InfoProvideServiceImp", "getAppId((): config is null");
        return 0;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: C */
    public boolean mo17342C() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig != null) {
            return docDynamicConfig.mo20229e();
        }
        C13479a.m54758a("InfoProvideServiceImp", "isKABuildPackage(): config is null");
        return false;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: D */
    public boolean mo17343D() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig != null) {
            return docDynamicConfig.mo20230f();
        }
        C13479a.m54758a("InfoProvideServiceImp", "isUSPackage(): config is null");
        return false;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: F */
    public boolean mo17345F() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig != null) {
            return docDynamicConfig.mo20226c().f14834c;
        }
        C13479a.m54758a("InfoProvideServiceImp", "isOversea(): config is null");
        return false;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: O */
    public String mo17354O() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig != null && docDynamicConfig.mo20227d() != null) {
            return f13198b.mo20227d().mo20253g();
        }
        C13479a.m54758a("InfoProvideServiceImp", "getTenantId(): config is null");
        return "";
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: m */
    public String mo17363m() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig != null) {
            return docDynamicConfig.mo20226c().f14832a;
        }
        C13479a.m54758a("InfoProvideServiceImp", "getProductDomain(): config is null");
        return null;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: r */
    public Single<String> mo17368r() {
        return Single.create(new AbstractC69013u<String>() {
            /* class com.bytedance.ee.bear.basesdk.services.C4511g.C45121 */

            @Override // io.reactivex.AbstractC69013u
            public void subscribe(AbstractC69011s<String> sVar) throws Exception {
                String s = C4511g.this.mo17369s();
                if (TextUtils.isEmpty(s)) {
                    s = "";
                }
                sVar.onSuccess(s);
            }
        }).subscribeOn(C11678b.m48480d());
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: s */
    public String mo17369s() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig != null) {
            return docDynamicConfig.mo20225b();
        }
        C13479a.m54758a("InfoProvideServiceImp", "getDeviceId(): config is null");
        return null;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: t */
    public int mo17370t() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig != null) {
            return docDynamicConfig.mo20224a();
        }
        C13479a.m54758a("InfoProvideServiceImp", "getEnv(): config is null");
        return 1;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: x */
    public String mo17374x() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig != null) {
            return docDynamicConfig.mo20226c().mo20261b();
        }
        C13479a.m54758a("InfoProvideServiceImp", "getPersistentConnectionDomain(): config is null");
        return null;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: y */
    public List<String> mo17375y() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig != null) {
            return docDynamicConfig.mo20226c().mo20262c();
        }
        C13479a.m54758a("InfoProvideServiceImp", "getAllAvailablePersistentConnectionDomain(): configs is null");
        return null;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: z */
    public String mo17376z() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig != null) {
            return docDynamicConfig.mo20226c().mo20266f();
        }
        C13479a.m54758a("InfoProvideServiceImp", "getPersistentConnectionKey(): config is null");
        return null;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: e */
    public String mo17356e() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig == null) {
            C13479a.m54758a("InfoProvideServiceImp", "getUserId(): config is null");
            return "";
        } else if (docDynamicConfig.mo20227d() != null) {
            return f13198b.mo20227d().mo20246a();
        } else {
            C13479a.m54775e("InfoProvideServiceImp", "getUid: LoginInfo is null");
            return "";
        }
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: l */
    public String mo17362l() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig != null && docDynamicConfig.mo20226c() != null && f13198b.mo20226c().mo20260a() != null) {
            return f13198b.mo20226c().mo20260a().mo20238a();
        }
        C13479a.m54758a("InfoProvideServiceImp", "getDocsInterfaceDomain(): config is null");
        return null;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: v */
    public String mo17372v() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig == null) {
            C13479a.m54758a("InfoProvideServiceImp", "getAccessToken(): config is null");
        } else if (docDynamicConfig.mo20227d() != null) {
            return f13198b.mo20227d().mo20247b();
        } else {
            C13479a.m54775e("InfoProvideServiceImp", "getAppToken: loginInfo is null");
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: w */
    public String mo17373w() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig == null) {
            C13479a.m54758a("InfoProvideServiceImp", "getAccessToken(): config is null");
        } else if (docDynamicConfig.mo20227d() != null) {
            return f13198b.mo20227d().mo20248c();
        } else {
            C13479a.m54775e("InfoProvideServiceImp", "getAvatarUrl: LoginInfo is null");
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: N */
    public boolean mo17353N() {
        DocDynamicConfig docDynamicConfig = f13198b;
        if (docDynamicConfig == null || docDynamicConfig.mo20227d() == null) {
            return false;
        }
        C13479a.m54764b("InfoProvideServiceImp", "InfoProvideServiceImp isGuest " + f13198b.mo20227d().mo20249d() + " process name " + C13629i.m55303b(this.f13202a));
        return f13198b.mo20227d().mo20249d();
    }

    /* renamed from: a */
    public static void m18588a(long j) {
        f13199c = j;
    }

    /* renamed from: a */
    public static void m18589a(AbstractC4463c cVar) {
        f13200d = cVar;
    }

    /* renamed from: a */
    public static void m18591a(AbstractC5125a aVar) {
        f13201e = aVar;
    }

    /* renamed from: a */
    public static void m18590a(DocDynamicConfig docDynamicConfig) {
        C13479a.m54764b("InfoProvideServiceImp", "onDynamicConfigChanged(): " + docDynamicConfig + ",process = " + C13629i.m55303b((Context) null));
        f13198b = docDynamicConfig;
    }

    @Override // com.bytedance.ee.bear.contract.al
    /* renamed from: b */
    public void mo17355b(DocDynamicConfig docDynamicConfig) {
        C13479a.m54764b("InfoProvideServiceImp", "onDynamicConfigChanged(): " + docDynamicConfig + ",process = " + C13629i.m55303b((Context) null));
        f13198b = docDynamicConfig;
    }
}
