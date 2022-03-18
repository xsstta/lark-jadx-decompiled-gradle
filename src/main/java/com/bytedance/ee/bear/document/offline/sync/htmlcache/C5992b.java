package com.bytedance.ee.bear.document.offline.sync.htmlcache;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.htmlcache.b */
public class C5992b {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SimpleRequestResult m24260a(String str) throws NetService.ParseException {
        SimpleRequestResult simpleRequestResult = new SimpleRequestResult();
        simpleRequestResult.data = str;
        simpleRequestResult.code = JSONObject.parseObject(str).getIntValue("code");
        return simpleRequestResult;
    }

    /* renamed from: a */
    public void mo24248a(OfflineDoc offlineDoc) {
        NetService.AbstractC5075d a = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a($$Lambda$b$bQq_VaM7G0XBQoQD4t1uJACmv6I.INSTANCE);
        NetService.C5077f fVar = new NetService.C5077f("/ssr-mobile-app/docx/" + offlineDoc.getObj_token());
        fVar.mo20148a(false);
        fVar.mo20144a(C6313i.f17509a);
        fVar.mo20143a(2);
        fVar.mo20145a(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, C4511g.m18594d().mo17364n());
        a.mo20141a(fVar).mo237999a(new Consumer() {
            /* class com.bytedance.ee.bear.document.offline.sync.htmlcache.$$Lambda$b$NE8yzGK5x7TUAQbfv00Gp7ur6s */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5992b.m24261a(OfflineDoc.this, (SimpleRequestResult) obj);
            }
        }, $$Lambda$b$MkYKpLcDJ52_3ZMOUJ3nBq72waY.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m24261a(OfflineDoc offlineDoc, SimpleRequestResult simpleRequestResult) throws Exception {
        if (simpleRequestResult.code != 0) {
            C13479a.m54758a("HtmlCacheWebProcessor", "result == " + simpleRequestResult.code);
            return;
        }
        C5955d.m24025b().mo24081a(((an) KoinJavaComponent.m268610a(an.class)).mo16408f(), offlineDoc.getObj_token(), simpleRequestResult.data.toString());
        C13479a.m54764b("HtmlCacheWebProcessor", "fetch ssr success");
    }
}
