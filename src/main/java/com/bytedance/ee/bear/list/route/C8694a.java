package com.bytedance.ee.bear.list.route;

import android.content.Context;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.route.RouteBean;

/* renamed from: com.bytedance.ee.bear.list.route.a */
public class C8694a implements AbstractC8705e {

    /* renamed from: a */
    private Context f23513a;

    public C8694a(Context context) {
        this.f23513a = context;
    }

    @Override // com.bytedance.ee.bear.list.route.AbstractC8705e
    /* renamed from: a */
    public RouteBean mo33720a(Document document) {
        RouteBean routeBean = new RouteBean();
        routeBean.mo40615d(C8292f.m34193g(this.f23513a, document));
        return routeBean;
    }
}
