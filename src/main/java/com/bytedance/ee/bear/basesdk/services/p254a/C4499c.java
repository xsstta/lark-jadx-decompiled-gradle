package com.bytedance.ee.bear.basesdk.services.p254a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.services.a.c */
public class C4499c {

    /* renamed from: a */
    private C10917c f13182a;

    /* renamed from: b */
    private final List<AbstractC10738c> f13183b;

    /* renamed from: c */
    private C4492a f13184c;

    /* renamed from: d */
    private final List<AbstractC4500a> f13185d = new CopyOnWriteArrayList();

    /* renamed from: com.bytedance.ee.bear.basesdk.services.a.c$a */
    public interface AbstractC4500a {
        /* renamed from: a */
        void mo17319a(BearUrl bearUrl, RouteBean routeBean);
    }

    public C4499c(List<AbstractC10738c> list) {
        this.f13183b = list;
    }

    /* renamed from: a */
    public void mo17321a(AbstractC4500a aVar) {
        if (aVar != null && !this.f13185d.contains(aVar)) {
            this.f13185d.add(aVar);
        }
    }

    /* renamed from: a */
    private String m18551a(String str) {
        if (!TextUtils.isEmpty(Uri.parse(str).getScheme())) {
            return str;
        }
        return "https://" + str;
    }

    /* renamed from: c */
    private void m18554c(String str) {
        AbstractC5233x b = C5234y.m21391b();
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        b.mo21079a("parse_url_failed", hashMap);
    }

    /* renamed from: b */
    public void mo17326b(AbstractC10738c cVar) {
        C13479a.m54764b("RouterManager", "removeHighestInterceptor()...iRouteInterceptor = " + cVar);
        if (cVar == null) {
            C13479a.m54764b("RouterManager", "removeHighestInterceptor()...null");
            return;
        }
        boolean remove = this.f13183b.remove(cVar);
        C13479a.m54764b("RouterManager", "removeHighestInterceptor()...result = " + remove);
    }

    /* renamed from: b */
    private void m18553b(String str) {
        C13479a.m54764b("RouterManager", "correctBitableAppUrl()...");
        Uri parse = Uri.parse(str);
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(parse.buildUpon().authority("feishu.cn").path("/" + C8275a.f22373f.mo32556c() + parse.getPath()).build().toString());
    }

    /* renamed from: a */
    public void mo17323a(AbstractC10738c cVar) {
        C13479a.m54764b("RouterManager", "addHighestInterceptor()...iRouteInterceptor = " + cVar);
        if (cVar == null || this.f13183b.contains(cVar)) {
            C13479a.m54764b("RouterManager", "addHighestInterceptor()...iRouteInterceptor is exist or null");
        } else {
            this.f13183b.add(0, cVar);
        }
    }

    /* renamed from: a */
    public void mo17324a(C10917c cVar) {
        this.f13182a = cVar;
        this.f13184c = new C4492a(cVar);
    }

    /* renamed from: a */
    public void mo17322a(BearUrl bearUrl, RouteBean routeBean) {
        if (bearUrl == null) {
            C13479a.m54764b("RouterManager", "open()...bearUrl is null");
            return;
        }
        for (AbstractC4500a aVar : this.f13185d) {
            aVar.mo17319a(bearUrl, routeBean);
        }
        al d = C4511g.m18594d();
        if (d.mo17342C() && routeBean != null) {
            String u = routeBean.mo40635u();
            if (!TextUtils.isEmpty(u)) {
                String host = Uri.parse(u).getHost();
                int b = C8275a.m34051b(bearUrl.f17446a);
                String f = C6313i.m25327a().mo25397f();
                if (!TextUtils.isEmpty(f) && !host.endsWith(f) && Arrays.binarySearch(C8275a.f22381n, b) >= 0) {
                    C13479a.m54764b("RouterManager", "originHost = " + host);
                    this.f13184c.mo17283a(u);
                    return;
                }
            }
        }
        if (d.mo17342C() || !C6313i.m25327a().mo25394d(bearUrl.f17450e)) {
            for (AbstractC10738c cVar : this.f13183b) {
                try {
                    if (cVar.mo17284a(bearUrl, routeBean)) {
                        C13479a.m54764b("RouterManager", "Interceptor is :" + cVar.toString());
                        return;
                    }
                } catch (Exception e) {
                    C13479a.m54759a("RouterManager", "Interceptor exception!", e);
                }
            }
            m18552a(bearUrl, routeBean, C6313i.m25327a().mo25392c(bearUrl.f17450e));
            return;
        }
        C13479a.m54764b("RouterManager", "correct bitable app url and open");
        m18553b(bearUrl.f17450e);
    }

    /* renamed from: a */
    public void mo17325a(String str, RouteBean routeBean) {
        C13479a.m54764b("RouterManager", "open()...");
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("RouterManager", "open()...url is empty");
        } else if (this.f13182a == null) {
            C13479a.m54758a("RouterManager", "serviceContext is null !");
        } else {
            BearUrl g = C6313i.m25327a().mo25399g(m18551a(str));
            if (!TextUtils.isEmpty(g.f17447b) && !TextUtils.equals(g.f17446a, C8275a.f22369b.mo32553a())) {
                g.f17450e = C6313i.m25327a().mo25398f(str);
            }
            mo17322a(g, routeBean);
        }
    }

    /* renamed from: a */
    private void m18552a(BearUrl bearUrl, RouteBean routeBean, boolean z) {
        if (this.f13184c != null) {
            try {
                C13479a.m54764b("RouterManager", "default Interceptor");
                if (z) {
                    this.f13184c.mo17285b(bearUrl, routeBean);
                } else {
                    this.f13184c.mo17284a(bearUrl, routeBean);
                }
            } catch (Exception e) {
                C13479a.m54759a("RouterManager", "default Interceptor exception!", e);
            }
        }
        m18554c(bearUrl.f17450e);
    }
}
