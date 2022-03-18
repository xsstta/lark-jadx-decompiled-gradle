package com.bytedance.ee.bear.document.route;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.route.AbstractC10736a;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.route.c */
public class C6093c extends AbstractC10736a {
    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return "/doc/simple_web";
    }

    public C6093c(C10917c cVar) {
        super(cVar);
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        if (!TextUtils.equals(bearUrl.f17446a, "help")) {
            return false;
        }
        mo24592b(bearUrl, routeBean);
        return true;
    }

    /* renamed from: b */
    public void mo24592b(BearUrl bearUrl, RouteBean routeBean) {
        String str;
        C13479a.m54764b("HelpInterceptor", "dispatchUrl()..." + bearUrl.f17446a);
        if (TextUtils.isEmpty(bearUrl.f17450e)) {
            str = "https://docs.bytedance.net/app/upgrade/";
        } else {
            str = bearUrl.f17450e;
        }
        al d = C4511g.m18594d();
        Uri parse = Uri.parse(str);
        if (parse != null && !TextUtils.isEmpty(parse.getHost()) && !TextUtils.isEmpty(parse.getPath()) && !TextUtils.equals(parse.getHost(), d.mo17363m())) {
            str = str.replace(parse.getHost(), d.mo17363m());
        }
        mo40641d(bearUrl, routeBean).mo17314a("web_url", str).mo17317a();
    }
}
