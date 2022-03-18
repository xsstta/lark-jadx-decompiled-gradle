package com.bytedance.ee.bear.route;

import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.service.C10917c;
import java.io.Serializable;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.route.a */
public abstract class AbstractC10736a implements AbstractC10738c {

    /* renamed from: d */
    protected C10917c f28725d;

    /* renamed from: a */
    public abstract String mo17282a(BearUrl bearUrl);

    public AbstractC10736a(C10917c cVar) {
        this.f28725d = cVar;
    }

    /* renamed from: d */
    public PostCard mo40641d(BearUrl bearUrl, RouteBean routeBean) {
        PostCard b = ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b(mo17282a(bearUrl));
        if (routeBean != null) {
            b.mo17312a("extra_data_map", (Serializable) routeBean.mo40633s());
        }
        return b;
    }
}
