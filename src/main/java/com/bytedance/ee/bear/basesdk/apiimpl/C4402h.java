package com.bytedance.ee.bear.basesdk.apiimpl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ee.bear.basesdk.AbstractC4482e;
import com.bytedance.ee.bear.basesdk.DocRouteActivity;
import com.bytedance.ee.bear.basesdk.DocRouteMainProcActivity;
import com.bytedance.ee.bear.basesdk.IDocInit;
import com.bytedance.ee.bear.basesdk.api.AbstractC4382g;
import com.bytedance.ee.bear.basesdk.apisupport.C4438x;
import com.bytedance.ee.bear.basesdk.p253d.C4478g;
import com.bytedance.ee.bear.basesdk.route.SpaceRouteProxyImpl;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.doc.C5130a;
import com.bytedance.ee.bear.contract.drive.DriveOfflineDoc;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.route.lark.AbstractC5220a;
import com.bytedance.ee.bear.contract.route.lark.SpaceRouteBean;
import com.bytedance.ee.bear.document.ak;
import com.bytedance.ee.bear.document.web.CommonWebActivity;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.list.config.SpaceFeatureGatingV2;
import com.bytedance.ee.bear.list.create.C8228a;
import com.bytedance.ee.bear.list.create.C8237e;
import com.bytedance.ee.bear.list.create.C8241g;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.common.C13608f;
import com.bytedance.ee.util.p699b.C13595b;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13629i;
import com.bytedance.ee.util.p716r.C13721c;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13748k;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.h */
public class C4402h implements AbstractC4382g {

    /* renamed from: a */
    protected C10929e f13011a;

    /* renamed from: b */
    protected IDocInit f13012b;

    /* renamed from: c */
    private AbstractC5220a f13013c;

    /* renamed from: d */
    private final long f13014d = 800;

    /* renamed from: e */
    private long f13015e;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public boolean mo17048a(String str, String str2, String str3) {
        return m18175c(str, str2, str3);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public boolean mo17049a(String str, Map<String, String> map) {
        return mo17046a((Context) null, str, map);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public boolean mo17046a(Context context, String str, Map<String, String> map) {
        return mo17045a(context, str, -1, -1, map);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public boolean mo17045a(Context context, String str, int i, int i2, Map<String, String> map) {
        try {
            C13479a.m54764b("DocsImpl", "open url : " + C13598b.m55197d(str));
            if (!m18170b()) {
                C13479a.m54775e("DocsImpl", "unValidClick=======");
                return true;
            }
            m18161a(new Runnable(context, str, i, i2, map) {
                /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$h$NEM3IU1gTOyv5W3FsiCdVh31RTQ */
                public final /* synthetic */ Context f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ int f$3;
                public final /* synthetic */ int f$4;
                public final /* synthetic */ Map f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    C4402h.this.m18172c(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                }
            });
            m18163a(str, new Throwable());
            return true;
        } catch (Exception e) {
            C13479a.m54759a("DocsImpl", "open: error", e);
            return false;
        }
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public boolean mo17047a(SpaceRouteBean spaceRouteBean) {
        AbstractC5220a aVar = this.f13013c;
        if (aVar != null && spaceRouteBean != null) {
            return aVar.mo17264a(spaceRouteBean);
        }
        C13479a.m54775e("DocsImpl", "open with SpaceRouteBean, bean=" + spaceRouteBean + " ,proxy=" + this.f13013c);
        return false;
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public void mo17044a(List<String> list) {
        m18161a(new Runnable(list) {
            /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$h$5DEwaFNovGM0g1_nYv6WpfBGaA */
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C4402h.this.m18169b((C4402h) this.f$1);
            }
        });
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public void mo17041a() {
        C13479a.m54772d("DocsImpl", "  start doc preload service");
        if (C13629i.m55308c()) {
            new C10917c(this.f13011a).mo41508c(AbstractC5094ag.class).mo238020d($$Lambda$h$CxgYzEIqBW7PoeYdoT2bEaiHoU8.INSTANCE).mo238001b($$Lambda$h$ob5cEmWZebNOeXfcyii3aYkcWVY.INSTANCE, $$Lambda$h$Luze3jmAkXg2XRlysLiTzVq1Wmg.INSTANCE);
            C13748k.m55732a($$Lambda$h$nkdWkkjdoBYalvxRY8uegx6n94I.INSTANCE);
        }
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public void mo17042a(Activity activity) {
        C13479a.m54764b("DocsImpl", "createDoc()...");
        C8228a.m33791a(C5234y.m21391b(), C8275a.f22371d.mo32553a(), "");
        C10917c cVar = new C10917c(this.f13011a);
        SpaceFeatureGatingV2 aVar = SpaceFeatureGatingV2.f21741a;
        C8241g.m33834a(activity, new C8237e(cVar, "", "", "lark_docs", SpaceFeatureGatingV2.m32622a()));
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public void mo17043a(final AbstractC4382g.AbstractC4383a aVar) {
        C44031 r0 = new ak.AbstractC5642a() {
            /* class com.bytedance.ee.bear.basesdk.apiimpl.C4402h.C44031 */

            @Override // com.bytedance.ee.bear.document.ak.AbstractC5642a
            /* renamed from: a */
            public void mo17108a(WebView webView) {
                AbstractC4382g.AbstractC4383a aVar = aVar;
                if (aVar != null) {
                    aVar.mo17052a(webView);
                }
            }
        };
        ak.m22923a(r0);
        CommonWebActivity.m25190a(r0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m18171c() {
        ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20182a(false).mo238001b($$Lambda$h$upBha74MyPnxCsNC1gwBlHqOHQ.INSTANCE, $$Lambda$h$Udxjv_Pfa91JeqSdvvBYmuuEEds.INSTANCE);
    }

    /* renamed from: b */
    private boolean m18170b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f13015e < 800) {
            return false;
        }
        this.f13015e = uptimeMillis;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m18166b(Boolean bool) throws Exception {
        C13479a.m54764b("DocsImpl", " driveService: preloadDocs, ret:" + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m18160a(Boolean bool) throws Exception {
        C13479a.m54772d("DocsImpl", "***reportPreloadHtml*** preloadTemplate：Language result = " + bool);
    }

    /* renamed from: a */
    private void m18161a(final Runnable runnable) {
        boolean d = C4438x.m18352d();
        C13479a.m54764b("DocsImpl", "doWhileInited inited ?" + d);
        if (d) {
            runnable.run();
            return;
        }
        C44042 r0 = new AbstractC4482e() {
            /* class com.bytedance.ee.bear.basesdk.apiimpl.C4402h.C44042 */

            @Override // com.bytedance.ee.bear.basesdk.AbstractC4482e
            public void onInit() {
                C4438x.m18350b(this);
                runnable.run();
            }
        };
        C4438x.m18348a(r0);
        C13742g.m55706a(new Runnable(runnable, r0) {
            /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$h$C9c5HNuwdHbIhXxOQp2A3nAgGbs */
            public final /* synthetic */ Runnable f$0;
            public final /* synthetic */ AbstractC4482e f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                C4402h.m18162a(this.f$0, this.f$1);
            }
        }, 5000);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m18169b(List list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C13479a.m54764b("DocsImpl", "  ======preloadDocs=====  url: ");
                String f = C6313i.m25327a().mo25398f((String) it.next());
                BearUrl g = C6313i.m25327a().mo25399g(f);
                int b = C8275a.m34051b(g.f17446a);
                if (b == C8275a.f22375h.mo32555b()) {
                    arrayList2.add(new DriveOfflineDoc(g.f17447b, f, null).mo20395a("explorer"));
                } else if (C5130a.m20995a(b)) {
                    arrayList.add(new OfflineDoc(g.f17447b, f, C8275a.m34051b(g.f17446a), g.f17453h));
                }
            }
            C10917c cVar = new C10917c(this.f13011a);
            if (!arrayList.isEmpty()) {
                cVar.mo41508c(AbstractC5094ag.class).mo238020d(new Function(arrayList) {
                    /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$h$KW0uy9Ub3xkRxOeiqFW1KGPRg6I */
                    public final /* synthetic */ List f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return ((AbstractC5094ag) obj).preloadDocs(this.f$0);
                    }
                }).mo238001b($$Lambda$h$JYvG07NdTnS2F28AGnZShJLvUw.INSTANCE, $$Lambda$h$bRIn2X5IuBnWxzw3s2aWvDIfaU.INSTANCE);
            }
            if (!arrayList2.isEmpty()) {
                cVar.mo41508c(AbstractC7184l.class).mo238014c(new Function(arrayList2) {
                    /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$h$fhLv49q0Zk6hLihKgah0gFxmLpA */
                    public final /* synthetic */ ArrayList f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return ((AbstractC7184l) obj).preloadFile(0, this.f$0);
                    }
                }).mo238001b($$Lambda$h$PQTZ76foJtpD2OWppXqQULiIwKs.INSTANCE, $$Lambda$h$olTMpLfHcyMpRNl3HrLWMoXGLZI.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m18164a(Throwable th) throws Exception {
        C13479a.m54761a("DocsImpl", th);
        C13606d.m55245a("DocsImpl", th);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: b */
    public String mo17050b(String str) {
        BearUrl g = C6313i.m25327a().mo25399g(str);
        if (g.f17447b == null) {
            return "";
        }
        return g.f17447b;
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: a */
    public String mo17040a(String str) {
        BearUrl g = C6313i.m25327a().mo25399g(str);
        if (g.f17446a == null) {
            return "";
        }
        return g.f17446a;
    }

    public C4402h(C10929e eVar, IDocInit iDocInit) {
        this.f13011a = eVar;
        this.f13012b = iDocInit;
        this.f13013c = new SpaceRouteProxyImpl(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m18162a(Runnable runnable, AbstractC4482e eVar) {
        C13479a.m54775e("DocsImpl", "doWhileInited timeout " + runnable);
        C4438x.m18350b(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m18167b(String str, Throwable th) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            BearUrl g = C6313i.m25327a().mo25399g(str);
            String str3 = g.f17453h;
            if (TextUtils.isEmpty(str3)) {
                str3 = "tab_other";
            }
            Activity g2 = C4511g.m18594d().mo17358g();
            Activity h = C4511g.m18594d().mo17359h();
            String str4 = "";
            if (g2 == null) {
                str2 = str4;
            } else {
                str2 = g2.getClass().getName();
            }
            jSONObject.put("docs_last_top_activity", str2);
            if (h != null) {
                str4 = h.getClass().getName();
            }
            jSONObject.put("docs_top_activity", str4);
            jSONObject.put("doc_from", str3);
            jSONObject.put("file_type", g.f17446a);
            jSONObject.put("error_msg", C13721c.m55644a("com.ss.android.lark", th));
            C5234y.m21391b().mo21080a("docs_open_doc_stacktrace", jSONObject);
        } catch (JSONException e) {
            C13479a.m54759a("DocsImpl", "reportLaunchApp(): ", e);
        }
    }

    /* renamed from: a */
    private void m18163a(String str, Throwable th) {
        C13608f.m55249a(new Runnable(str, th) {
            /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$h$bHaTgCbEgjJRZteDKqZLgXCg960 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ Throwable f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                C4402h.m18167b(this.f$0, this.f$1);
            }
        });
    }

    /* renamed from: c */
    private boolean m18175c(String str, String str2, String str3) {
        boolean z = false;
        if (str3.startsWith("https://ee.bytedance.net/malaita/?")) {
            C13479a.m54764b("DocsImpl", "url is byteDance moments url");
            return false;
        } else if (TextUtils.isEmpty(str3)) {
            C13479a.m54764b("DocsImpl", "url is empty");
            return false;
        } else {
            if (!str3.startsWith("http://") && !str3.startsWith("https://")) {
                str3 = "https://" + str3;
            }
            try {
                C6313i.m25327a().mo25388b(str);
                C6313i.m25327a().mo25384a(str2);
                z = C6313i.m25327a().mo25392c(str3);
                C13479a.m54764b("DocsImpl", "isInWhiteList()...SpaceKitUrlHelper.isSuiteUrl() = " + z);
                return z;
            } catch (Exception e) {
                C13479a.m54761a("DocsImpl", e);
                return z;
            }
        }
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4382g
    /* renamed from: b */
    public void mo17051b(String str, String str2, String str3) {
        C13479a.m54764b("DocsImpl", "jumpSearch()...");
        try {
            if (!m18170b()) {
                C13479a.m54764b("DocsImpl", "unValidClick=======");
                return;
            }
            Context applicationContext = C13615c.f35773a.getApplicationContext();
            Intent intent = new Intent();
            String str4 = "/search/space_search/activity";
            if (TextUtils.equals(str2, "wiki")) {
                str4 = "/search/activity";
                intent.putExtra(ShareHitPoint.f121869d, str2);
            }
            intent.putExtra("extra_sdk_has_inited", C4438x.m18352d());
            intent.putExtra("doc_url", str4);
            intent.putExtra("search_keyword", str);
            intent.putExtra("search_page_name", str3);
            intent.putExtra("from", "EXTRA_FROM_LARK");
            intent.addFlags(268435456);
            if (C13595b.m55176a()) {
                intent.setClass(applicationContext, DocRouteMainProcActivity.class);
            } else {
                intent.setClass(applicationContext, DocRouteActivity.class);
            }
            applicationContext.startActivity(intent);
        } catch (Exception e) {
            C13479a.m54759a("DocsImpl", "open: error", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m18172c(Context context, String str, int i, int i2, Map<String, String> map) {
        Intent intent = new Intent();
        intent.putExtra("doc_url", str);
        Bundle bundle = new Bundle();
        intent.putExtra("extra_sdk_has_inited", C4438x.m18352d());
        bundle.putParcelable("remind_binder", C4478g.m18487a());
        intent.putExtra("remind_binder", bundle);
        if (i != -1) {
            intent.putExtra("enter_anim", i);
        }
        if (i2 != -1) {
            intent.putExtra("exit_anim", i2);
        }
        if (context == null) {
            context = C13615c.f35773a.getApplicationContext();
            intent.setFlags(335544320);
        } else if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (map != null) {
            if (map.containsKey("is_from_multi_task")) {
                intent.putExtra("is_from_multi_task", Boolean.valueOf(map.get("is_from_multi_task")));
            }
            intent.putExtra("extra_data_map", (Serializable) map);
        }
        if (C13595b.m55176a()) {
            intent.setClass(context, DocRouteMainProcActivity.class);
        } else {
            intent.setClass(context, DocRouteActivity.class);
        }
        context.startActivity(intent);
    }
}
