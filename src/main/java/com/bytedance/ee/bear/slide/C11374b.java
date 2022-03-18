package com.bytedance.ee.bear.slide;

import android.text.TextUtils;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10737b;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

/* renamed from: com.bytedance.ee.bear.slide.b */
public class C11374b extends AbstractC10737b {
    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return "/slide/router";
    }

    public C11374b(C10917c cVar, AbstractC10738c... cVarArr) {
        super(cVar, cVarArr);
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        if (!TextUtils.equals(bearUrl.f17446a, C8275a.f22376i.mo32553a())) {
            return false;
        }
        if ((routeBean instanceof SlideRouteBean) && ((SlideRouteBean) routeBean).mo43509a()) {
            return false;
        }
        C13479a.m54764b("SlideRouteInterceptor", "fg is true");
        mo43523b(bearUrl, routeBean);
        return true;
    }

    /* renamed from: b */
    public void mo43523b(BearUrl bearUrl, RouteBean routeBean) {
        mo40641d(bearUrl, routeBean).mo17314a(ShareHitPoint.f121869d, bearUrl.f17446a).mo17314a("url", bearUrl.f17450e).mo17314a("obj_token", bearUrl.f17447b).mo17306a(0, 0).mo17317a();
    }
}
