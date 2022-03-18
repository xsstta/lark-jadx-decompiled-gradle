package com.bytedance.ee.bear.document.route;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10736a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.PostCard;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.route.d */
public class C6094d extends AbstractC10736a {

    /* renamed from: a */
    private static final HashMap<String, Integer> f16977a;

    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return "/doc/like/activity";
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        f16977a = hashMap;
        hashMap.put(C8275a.f22371d.mo32553a(), 1);
        hashMap.put(C8275a.f22372e.mo32553a(), 2);
        hashMap.put(C8275a.f22376i.mo32553a(), 3);
        hashMap.put(C8275a.f22373f.mo32553a(), 4);
        hashMap.put(C8275a.f22378k.mo32553a(), 22);
        hashMap.put(C8275a.f22375h.mo32553a(), 6);
    }

    public C6094d(C10917c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    private int m24626a(String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap<String, Integer> hashMap = f16977a;
            if (hashMap.containsKey(str)) {
                return hashMap.get(str).intValue();
            }
        }
        return 1;
    }

    /* renamed from: c */
    private void m24630c(BearUrl bearUrl, RouteBean routeBean) {
        ((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21063a(bearUrl.f17447b).mo238001b(new Consumer(bearUrl, routeBean) {
            /* class com.bytedance.ee.bear.document.route.$$Lambda$d$WVrSgtNxlLo0fg11du6AyUQhxdc */
            public final /* synthetic */ BearUrl f$1;
            public final /* synthetic */ RouteBean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6094d.this.m24627a(this.f$1, this.f$2, (WikiInfo) obj);
            }
        }, $$Lambda$d$IK2xmy1KgSl5P6gI_Ts_DcXmvfE.INSTANCE);
    }

    /* renamed from: b */
    public void mo24593b(BearUrl bearUrl, RouteBean routeBean) {
        C13479a.m54764b("LikeInterceptor", "dispatchUrl()..." + bearUrl.f17446a);
        if (TextUtils.equals(C8275a.f22377j.mo32553a(), bearUrl.f17446a)) {
            m24630c(bearUrl, routeBean);
        } else {
            m24628a(bearUrl, routeBean, bearUrl.f17447b, m24626a(bearUrl.f17446a));
        }
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        Uri parse = Uri.parse(bearUrl.f17450e);
        if (!TextUtils.equals(parse.getQueryParameter("show_like_list"), "1") || !TextUtils.equals(parse.getQueryParameter("from"), "message_card")) {
            return false;
        }
        mo24593b(bearUrl, routeBean);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24627a(BearUrl bearUrl, RouteBean routeBean, WikiInfo wikiInfo) throws Exception {
        m24628a(bearUrl, routeBean, wikiInfo.getObjToken(), m24626a(wikiInfo.getObjTypeString()));
    }

    /* renamed from: a */
    private void m24628a(BearUrl bearUrl, RouteBean routeBean, String str, int i) {
        PostCard d = mo40641d(bearUrl, routeBean);
        d.mo17314a("doc_token", str).mo17308a("ref_type", i).mo17314a("from", "from_lark_info").mo17314a("url", bearUrl.f17450e);
        if (((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17294b() == null) {
            d.mo17305a(268435456);
        }
        d.mo17317a();
    }
}
