package com.bytedance.ee.bear.document.route;

import android.text.TextUtils;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10737b;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.route.a */
public class C6089a extends AbstractC10737b {
    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return "/doc/detail/activity";
    }

    public C6089a(C10917c cVar, AbstractC10738c... cVarArr) {
        super(cVar, cVarArr);
    }

    /* renamed from: b */
    public void mo24587b(BearUrl bearUrl, RouteBean routeBean) {
        C13479a.m54764b("DocInterceptor", "dispatchUrl()..." + bearUrl.f17446a);
        m24616e(bearUrl, routeBean).mo17317a();
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        if (!C8275a.f22368a.contains(bearUrl.f17446a)) {
            return false;
        }
        if (mo40642c(bearUrl, routeBean)) {
            return true;
        }
        if (TextUtils.equals(bearUrl.f17446a, C8275a.f22378k.mo32553a()) && !C4211a.m17514a().mo16538b("spacekit.mobile.docx_enable", false)) {
            return false;
        }
        mo24587b(bearUrl, routeBean);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.ee.bear.route.PostCard m24616e(com.bytedance.ee.bear.domain.BearUrl r7, com.bytedance.ee.bear.route.RouteBean r8) {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.route.C6089a.m24616e(com.bytedance.ee.bear.domain.BearUrl, com.bytedance.ee.bear.route.RouteBean):com.bytedance.ee.bear.route.PostCard");
    }
}
