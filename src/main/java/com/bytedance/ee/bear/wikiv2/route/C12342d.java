package com.bytedance.ee.bear.wikiv2.route;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.route.AbstractC10737b;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.route.d */
public class C12342d extends AbstractC10737b {
    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return "/wikiv2/trash/activity";
    }

    public C12342d(C10917c cVar) {
        super(cVar, new AbstractC10738c[0]);
    }

    /* renamed from: b */
    private boolean m51393b(BearUrl bearUrl) {
        if (bearUrl == null || !TextUtils.equals(bearUrl.f17446a, "wiki_trash")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo47038b(BearUrl bearUrl, RouteBean routeBean) {
        C13479a.m54764b("WikiTrashRouteInterceptorV2", "route. ");
        mo40641d(bearUrl, routeBean).mo17314a("space_id", bearUrl.f17454i).mo17317a();
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        if (!((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21070c()) {
            C13479a.m54775e("WikiTrashRouteInterceptorV2", "onIntercept, feature disable, return. ");
            return false;
        } else if (!m51393b(bearUrl)) {
            return false;
        } else {
            if (mo40642c(bearUrl, routeBean)) {
                return true;
            }
            mo47038b(bearUrl, routeBean);
            return true;
        }
    }
}
