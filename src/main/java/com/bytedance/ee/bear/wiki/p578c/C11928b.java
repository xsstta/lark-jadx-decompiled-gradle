package com.bytedance.ee.bear.wiki.p578c;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.p282f.C5171a;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.contract.route.parcelable.WikiRouteBean;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.route.AbstractC10737b;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.PostCard;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wiki.common.p580b.C11933b;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.c.b */
public class C11928b extends AbstractC10737b {
    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return "/doc/detail/activity";
    }

    public C11928b(C10917c cVar) {
        super(cVar, new AbstractC10738c[0]);
    }

    /* renamed from: b */
    private void m49457b(BearUrl bearUrl) {
        String str = "lark_search";
        if (!TextUtils.isEmpty(bearUrl.f17453h)) {
            String str2 = bearUrl.f17453h;
            str2.hashCode();
            char c = 65535;
            switch (str2.hashCode()) {
                case 106426308:
                    if (str2.equals("pages")) {
                        c = 0;
                        break;
                    }
                    break;
                case 248701330:
                    if (str2.equals("tab_search")) {
                        c = 1;
                        break;
                    }
                    break;
                case 430183203:
                    if (str2.equals("com.bytedance.ee.bear.lark.message")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1028708505:
                    if (str2.equals(str)) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = "pages";
                    break;
                case 1:
                    str = "wiki_search";
                    break;
                case 2:
                    str = "lark_message";
                    break;
            }
            C11933b.m49480a(str);
        }
        str = "file_link";
        C11933b.m49480a(str);
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        if (((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21070c() || !((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21068b()) {
            C13479a.m54775e("WikiRouteInterceptor", "wiki new version disable now, ignore route WikiRouteInterceptor#onIntercept");
            return false;
        } else if (!C5171a.m21156e(bearUrl)) {
            return false;
        } else {
            C13479a.m54764b("WikiRouteInterceptor", "dispatchUrl()..." + bearUrl.f17446a);
            if (mo40642c(bearUrl, routeBean)) {
                return true;
            }
            mo45835b(bearUrl, routeBean);
            return true;
        }
    }

    /* renamed from: b */
    public void mo45835b(BearUrl bearUrl, RouteBean routeBean) {
        String str;
        boolean z;
        PostCard d = mo40641d(bearUrl, routeBean);
        if (routeBean instanceof WikiRouteBean) {
            WikiRouteBean wikiRouteBean = (WikiRouteBean) routeBean;
            str = wikiRouteBean.mo21054a();
            z = wikiRouteBean.mo21056b();
        } else {
            str = "";
            z = true;
        }
        if (routeBean != null) {
            d.mo17307a(routeBean.mo40634t());
        }
        if (bearUrl.f17449d != null) {
            bearUrl.f17449d.get("docId");
        }
        d.mo17314a("url", bearUrl.f17450e).mo17314a("space_id", str).mo17316a("record_fragment_stack", z);
        if (((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17294b() == null) {
            d.mo17305a(268435456);
        }
        if (!TextUtils.isEmpty(routeBean.mo40629o())) {
            d.mo17314a("node_name", routeBean.mo40629o());
            d.mo17310a("remind_binder", routeBean.mo40628n());
        }
        d.mo17317a();
        m49457b(bearUrl);
    }
}
