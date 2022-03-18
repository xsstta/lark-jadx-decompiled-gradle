package com.bytedance.ee.bear.basesdk.services.p254a;

import android.text.TextUtils;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.route.AbstractC10736a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.services.a.a */
public class C4492a extends AbstractC10736a {

    /* renamed from: a */
    private AbstractC5586d f13164a = ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class));

    public C4492a(C10917c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public void mo17283a(String str) {
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/doc/common_web").mo17314a("web_url", str).mo17317a();
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        boolean e = C6313i.m25327a().mo25396e(bearUrl.f17450e);
        C13479a.m54764b("DefaultUrlRouter", "navigate to default route, isInBlackList = " + e);
        if (!e) {
            return "/doc/default/route";
        }
        return "/doc/simple_web";
    }

    /* renamed from: b */
    public boolean mo17285b(BearUrl bearUrl, RouteBean routeBean) {
        C13479a.m54764b("DefaultUrlRouter", "onInterceptBySpaceKit()...");
        if (((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)) == null) {
            C13479a.m54758a("DefaultUrlRouter", "mRouteService is null!");
            return false;
        }
        mo17286c(bearUrl, routeBean);
        return true;
    }

    /* renamed from: c */
    public void mo17286c(BearUrl bearUrl, RouteBean routeBean) {
        if (TextUtils.isEmpty(bearUrl.f17450e)) {
            mo40641d(bearUrl, routeBean).mo17314a("web_url", "https://docs.bytedance.net/app/upgrade/").mo17317a();
        } else {
            mo40641d(bearUrl, routeBean).mo17314a("web_url", bearUrl.f17450e).mo17317a();
        }
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        C13479a.m54764b("DefaultUrlRouter", "onIntercept()...url = " + C13598b.m55197d(bearUrl.f17450e));
        if (((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)) == null) {
            C13479a.m54758a("DefaultUrlRouter", "mRouteService is null!");
            return false;
        }
        this.f13164a.mo22261b(bearUrl.f17450e);
        return true;
    }
}
