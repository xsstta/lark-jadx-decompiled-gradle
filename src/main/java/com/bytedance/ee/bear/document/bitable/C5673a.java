package com.bytedance.ee.bear.document.bitable;

import android.text.TextUtils;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10737b;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.bitable.a */
public class C5673a extends AbstractC10737b {
    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return "/bitable/detail/activity";
    }

    public C5673a(C10917c cVar, AbstractC10738c... cVarArr) {
        super(cVar, cVarArr);
    }

    /* renamed from: b */
    public void mo22670b(BearUrl bearUrl, RouteBean routeBean) {
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/bitable/detail/activity").mo17317a();
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        if (!TextUtils.equals(bearUrl.f17446a, C8275a.f22373f.mo32553a())) {
            return false;
        }
        C13479a.m54764b("BitableInterceptor", "dispatchUrl()..." + bearUrl.f17446a);
        if (mo40642c(bearUrl, routeBean)) {
            return true;
        }
        mo22670b(bearUrl, routeBean);
        return true;
    }
}
