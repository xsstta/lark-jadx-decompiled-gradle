package com.bytedance.ee.bear.lark.route;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.route.AbstractC10736a;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.functions.Function;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.lark.route.b */
public class C8062b extends AbstractC10736a {

    /* renamed from: a */
    private AbstractC5197b f21589a;

    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return "";
    }

    public C8062b(C10917c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    private void m32227a(int i, String str) {
        AbstractC5233x b = C5234y.m21391b();
        HashMap hashMap = new HashMap();
        if (i == 0) {
            hashMap.put("module", "home");
        } else if (i == 2) {
            hashMap.put("module", "sharetome");
        } else if (i == 4) {
            hashMap.put("module", "favorites");
        } else if (i == 1) {
            hashMap.put("module", "personal");
        }
        hashMap.put("url", str);
        b.mo21079a("enter_explorer_module", hashMap);
    }

    /* renamed from: a */
    private boolean m32230a(String str, String str2) {
        if (this.f21589a == null) {
            this.f21589a = (AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class);
        }
        if (!this.f21589a.mo20801b().mo20778d().f14914a && TextUtils.equals(str, "star")) {
            return false;
        }
        if (TextUtils.equals(str, "share") || TextUtils.equals(str, "recent") || TextUtils.equals(str, "star") || TextUtils.equals(str, "share_root") || (TextUtils.equals(str, "folder") && TextUtils.isEmpty(str2))) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        if (!m32230a(bearUrl.f17446a, bearUrl.f17447b)) {
            return false;
        }
        mo31161b(bearUrl, routeBean);
        return true;
    }

    /* renamed from: b */
    public void mo31161b(BearUrl bearUrl, RouteBean routeBean) {
        C13479a.m54764b("SpaceTabInterceptor", "dispatchUrl()..." + bearUrl.f17446a);
        String str = bearUrl.f17451f;
        String str2 = bearUrl.f17447b;
        int i = 2;
        if (TextUtils.equals(bearUrl.f17446a, "folder") && TextUtils.isEmpty(bearUrl.f17447b)) {
            i = 1;
        } else if (!TextUtils.equals(bearUrl.f17446a, "share_root")) {
            if (!TextUtils.equals(bearUrl.f17446a, "recent")) {
                if (!TextUtils.equals(bearUrl.f17446a, "share")) {
                    if (TextUtils.equals(bearUrl.f17446a, "star")) {
                        i = 4;
                    }
                }
            }
            i = 0;
        }
        m32227a(i, bearUrl.f17450e);
        C13479a.m54772d("SpaceTabInterceptor", "openDocEditor: isWhiteList. sourceType = " + str + "，token = " + C13598b.m55197d(str2) + "，tab = " + i);
        this.f28725d.mo41508c(ak.class).mo238020d(new Function(i) {
            /* class com.bytedance.ee.bear.lark.route.$$Lambda$b$NKdoXN89vRtIZkBKIYL1eCMMSg */
            public final /* synthetic */ int f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((ak) obj).routeTabDocs(this.f$0);
            }
        }).mo238001b($$Lambda$b$pLvegbV3nne_Et8qYU_ALHr_I8I.INSTANCE, $$Lambda$b$aVSrMyAUdszTkzQ9IDJOM1ljiPc.INSTANCE);
    }
}
