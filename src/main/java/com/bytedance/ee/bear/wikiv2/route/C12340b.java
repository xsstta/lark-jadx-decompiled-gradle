package com.bytedance.ee.bear.wikiv2.route;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.p282f.C5171a;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.route.AbstractC10737b;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.PostCard;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wikiv2.p589c.C12237b;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.route.b */
public class C12340b extends AbstractC10737b {
    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return "/wikiv2/detail/activity";
    }

    /* renamed from: b */
    private void m51376b(BearUrl bearUrl) {
        String str;
        if (TextUtils.isEmpty(bearUrl.f17453h)) {
            str = "file_link";
        } else {
            str = m51375a(bearUrl.f17453h);
        }
        C12237b.m50897a(str);
    }

    /* renamed from: a */
    private String m51375a(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -906879462:
                if (str.equals("tab_wiki")) {
                    c = 0;
                    break;
                }
                break;
            case 248701330:
                if (str.equals("tab_search")) {
                    c = 1;
                    break;
                }
                break;
            case 430183203:
                if (str.equals("com.bytedance.ee.bear.lark.message")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "recents";
            case 1:
                return "wiki_search";
            case 2:
                return "lark_message";
            default:
                return str;
        }
    }

    public C12340b(C10917c cVar, AbstractC10738c... cVarArr) {
        super(cVar, cVarArr);
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        if (!((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21070c()) {
            C13479a.m54775e("WikiRouteInterceptorV2", "wiki new version disable now, ignore route WikiRouteInterceptor#onIntercept");
            return false;
        } else if (!C5171a.m21156e(bearUrl)) {
            return false;
        } else {
            C13479a.m54764b("WikiRouteInterceptorV2", "dispatchUrl()..." + bearUrl.f17446a);
            if (mo40642c(bearUrl, routeBean)) {
                return true;
            }
            mo47036b(bearUrl, routeBean);
            return true;
        }
    }

    /* renamed from: b */
    public void mo47036b(BearUrl bearUrl, RouteBean routeBean) {
        Bundle bundle;
        Bundle bundle2;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        PostCard d = mo40641d(bearUrl, routeBean);
        if (routeBean != null) {
            bundle2 = routeBean.mo40628n();
            bundle = routeBean.mo40634t();
        } else {
            bundle2 = null;
            bundle = null;
        }
        String str5 = "";
        if (routeBean instanceof WikiRouteBean) {
            WikiRouteBean wikiRouteBean = (WikiRouteBean) routeBean;
            str3 = wikiRouteBean.f33120d;
            str2 = wikiRouteBean.f33121e;
            str = wikiRouteBean.f33117a;
            i = wikiRouteBean.f33118b;
            String str6 = wikiRouteBean.f33119c;
        } else {
            i = -1;
            str = null;
            str3 = str5;
            str2 = str3;
        }
        if (bearUrl.f17449d != null) {
            str5 = bearUrl.f17449d.get("docId");
            str4 = bearUrl.f17449d.get("sourceType");
        } else {
            str4 = str5;
        }
        d.mo17314a("url", bearUrl.f17450e).mo17314a("space_id", str3).mo17314a("space_name", str2).mo17308a(ShareHitPoint.f121869d, i).mo17314a("obj_token", str).mo17314a("doc_feed_id", str5).mo17314a("source_type", str4).mo17310a("remind_binder", bundle2).mo17307a(bundle);
        if (((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17294b() == null) {
            d.mo17305a(268435456);
        }
        d.mo17317a();
        m51376b(bearUrl);
    }
}
