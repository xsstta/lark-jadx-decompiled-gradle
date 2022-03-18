package com.bytedance.ee.bear.bitable.share;

import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10737b;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.PostCard;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/bitable/share/ShareBaseInterceptor;", "Lcom/bytedance/ee/bear/route/AbsRoutePriorityInterceptor;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "(Lcom/bytedance/ee/bear/service/ServiceContext;)V", "TAG", "", "getRouteUrl", "bearUrl", "Lcom/bytedance/ee/bear/domain/BearUrl;", "onIntercept", "", "routeBean", "Lcom/bytedance/ee/bear/route/RouteBean;", "route", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.a.a */
public final class ShareBaseInterceptor extends AbstractC10737b {

    /* renamed from: a */
    private final String f13259a = "ShareBaseInterceptor";

    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return "/doc/detail/activity";
    }

    public ShareBaseInterceptor(C10917c cVar) {
        super(cVar, new AbstractC10738c[0]);
    }

    /* renamed from: b */
    public void mo17423b(BearUrl bearUrl, RouteBean routeBean) {
        String str;
        PostCard d = mo40641d(bearUrl, routeBean);
        if (bearUrl != null) {
            str = bearUrl.f17450e;
        } else {
            str = null;
        }
        d.mo17314a("url", str);
        if (((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17294b() == null) {
            d.mo17305a(268435456);
        }
        d.mo17317a();
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        if (!(bearUrl == null || bearUrl.mo25329d() == null)) {
            String d = bearUrl.mo25329d();
            Intrinsics.checkExpressionValueIsNotNull(d, "it.getUrl()");
            if (StringsKt.contains$default((CharSequence) d, (CharSequence) "share/base", false, 2, (Object) null)) {
                if (bearUrl.f17446a != null) {
                    String str = bearUrl.f17446a;
                    C8275a aVar = C8275a.f22369b;
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.UNKNOWN");
                    if (!Intrinsics.areEqual(str, aVar.mo32553a())) {
                        if (!mo40642c(bearUrl, routeBean)) {
                            mo17423b(bearUrl, routeBean);
                            return true;
                        }
                    }
                }
                C13479a.m54758a(this.f13259a, "get no bitable config and return...");
            }
        }
        return false;
    }
}
