package com.bytedance.ee.larkbrand.p650e;

import android.app.Application;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12837a;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b;
import com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12797c;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12824b;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12825c;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.utils.DebugHelper;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.littleapp.EnvInfo;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.settings.v2.handler.C66786m;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.option.p3392m.AbstractC67655b;
import com.tt.option.p3392m.C67654a;
import java.io.File;
import java.net.URLDecoder;
import java.util.Locale;
import java.util.Map;
import okhttp3.Response;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.e.q */
public class C13021q extends C67654a {
    /* renamed from: d */
    private String m53498d() {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = LocaleList.getDefault().get(0);
        } else {
            locale = Locale.getDefault();
        }
        String replace = new Locale(locale.getLanguage(), locale.getCountry()).toLanguageTag().replace("-", "_");
        AppBrandLogger.m52830i("LarkOptionNetDependImpl", "origin locale = " + locale + " , after transform = " + replace);
        return replace;
    }

    @Override // com.tt.option.p3392m.C67654a, com.tt.option.p3392m.AbstractC67655b
    public C12827e convertMetaRequest(C12827e eVar) {
        String str;
        C12827e eVar2 = new C12827e(C13047a.C13049b.m53532a() + "/v2/getAppMeta", "POST");
        eVar2.mo48434a("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        if (a != null && !a.mo148730a() && a.mo148731b() == 1) {
            eVar2.mo48434a("domain_alias", "open");
        }
        Map<String, Object> f = eVar.mo48443f();
        if (f != null) {
            eVar2.mo48435a(f);
            String str2 = (String) f.get("ttcode");
            if (!TextUtils.isEmpty(str2)) {
                eVar2.mo48433a("ttcode", (Object) URLDecoder.decode(str2));
            }
            eVar2.mo48433a(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, (Object) m53497a((String) f.get(HiAnalyticsConstant.HaKey.BI_KEY_APPID), (String) f.get(HiAnalyticsConstant.HaKey.BI_KEY_VERSION)));
        }
        C66467o.C66470b bVar = null;
        CrossProcessDataEntity f2 = C67556a.m262949f();
        if (f2 != null) {
            bVar = new C66467o.C66470b(f2);
        }
        if (bVar == null || TextUtils.isEmpty(bVar.f167782h)) {
            Object[] objArr = new Object[1];
            if (bVar == null) {
                str = "userinfo is null";
            } else {
                str = "session id is empty";
            }
            objArr[0] = str;
            AppBrandLogger.m52829e("LarkOptionNetDependImpl", objArr);
            return eVar2;
        }
        eVar2.mo48433a("sessionid", (Object) bVar.f167782h);
        eVar2.mo48433a("language", (Object) m53498d());
        return eVar2;
    }

    @Override // com.tt.option.p3392m.C67654a, com.tt.option.p3392m.AbstractC67655b
    public C12830f doGet(C12827e eVar, IAppContext iAppContext) throws Exception {
        return C12837a.m53014a(eVar.mo48450m(), eVar.mo48449l(), eVar.mo48442e(), iAppContext);
    }

    @Override // com.tt.option.p3392m.C67654a, com.tt.option.p3392m.AbstractC67655b
    public C12830f doPostBody(C12827e eVar, IAppContext iAppContext) throws Exception {
        return C12837a.m53015a(eVar.mo48450m(), eVar.mo48449l(), new JSONObject(eVar.mo48444g()), eVar.mo48442e(), iAppContext);
    }

    /* renamed from: a */
    private String m53497a(String str, String str2) {
        if ("preview".equals(str2)) {
            return str2;
        }
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (!DebugHelper.m54233b(applicationContext) && C66786m.m260648a(applicationContext).mo232696a(str)) {
            return "test";
        }
        return "current";
    }

    @Override // com.tt.option.p3392m.C67654a, com.tt.option.p3392m.AbstractC67655b
    public C12825c downloadFile(C12824b bVar, final AbstractC67655b.AbstractC67656a aVar, IAppContext iAppContext) throws Exception {
        String c = bVar.mo48419c();
        String d = bVar.mo48420d();
        String m = bVar.mo48450m();
        Map<String, String> l = bVar.mo48449l();
        File file = new File(c);
        if (!file.exists()) {
            file.mkdirs();
        }
        final C12825c cVar = new C12825c(iAppContext);
        cVar.mo48422a(mo49016a(m, l, c, d, new AbstractC12796b() {
            /* class com.bytedance.ee.larkbrand.p650e.C13021q.C130221 */

            @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
            /* renamed from: a */
            public void mo48353a(Response response) {
                if (response != null) {
                    cVar.mo48459a(response.code());
                    cVar.mo48460a(response.message());
                }
                AbstractC67655b.AbstractC67656a aVar = aVar;
                if (aVar != null) {
                    aVar.mo49677a(100, -1, -1);
                }
            }

            @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
            /* renamed from: a */
            public void mo48352a(String str, Throwable th) {
                cVar.mo48460a(str);
                cVar.mo48461a(th);
            }

            @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
            /* renamed from: a */
            public void mo48351a(int i, long j, long j2) {
                AbstractC67655b.AbstractC67656a aVar = aVar;
                if (aVar != null) {
                    aVar.mo49677a(i, j, j2);
                }
            }
        }, null, iAppContext));
        return cVar;
    }

    /* renamed from: a */
    public synchronized File mo49016a(String str, Map<String, String> map, String str2, String str3, AbstractC12796b bVar, AbstractC12797c cVar, IAppContext iAppContext) {
        return C12843b.m53041a(str, map, str2, str3, bVar, cVar, iAppContext);
    }
}
