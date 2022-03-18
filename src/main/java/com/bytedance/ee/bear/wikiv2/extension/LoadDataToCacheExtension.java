package com.bytedance.ee.bear.wikiv2.extension;

import android.content.Intent;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.ak;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.document.record.C6078a;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.common.C13608f;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.Set;
import org.koin.java.KoinJavaComponent;

public class LoadDataToCacheExtension extends WikiActivityExtension implements LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
    }

    /* renamed from: c */
    private void m50966c() {
        C13479a.m54764b("LoadDataToCacheExtension", "doLoadDataToCache");
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.extension.$$Lambda$LoadDataToCacheExtension$QnjuowIhnqSjDB1lkRZAxMKct0o */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LoadDataToCacheExtension.this.m50965b((LoadDataToCacheExtension) ((String) obj));
            }
        }, $$Lambda$LoadDataToCacheExtension$p6rRvNrUIVXBBkTfKgZ3fwqDo.INSTANCE);
    }

    /* renamed from: b */
    private void m50963b() {
        ((AbstractC9493f) KoinJavaComponent.m268610a(AbstractC9493f.class)).mo35940b();
        AbstractC5233x b = C5234y.m21391b();
        b.mo21077a("start_open");
        b.mo21078a("start_open", "start_time", String.valueOf(System.currentTimeMillis()));
        DocBridgeWebViewV2.f15842j = System.currentTimeMillis();
        C5084ad.m20847d().mo20037a().mo5923a(this.f20780b, $$Lambda$LoadDataToCacheExtension$BKmHFTh68bOCPVJvXWINGOsuG2o.INSTANCE);
    }

    /* renamed from: d */
    private BearUrl m50967d() {
        String stringExtra = this.f20780b.getIntent().getStringExtra("url");
        BearUrl bearUrl = (BearUrl) this.f20780b.getIntent().getParcelableExtra("bear_url");
        if (bearUrl == null || bearUrl.f17450e == null) {
            return C6313i.m25327a().mo25399g(C6313i.m25327a().mo25398f(stringExtra));
        }
        return bearUrl;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C13479a.m54764b("LoadDataToCacheExtension", "onDestroy");
        C6078a.m24584a().mo24575b();
        DocBridgeWebViewV2 b = ak.m22924b();
        if (b != null) {
            b.mo30814o();
            b.mo22350g();
        }
        C5890a.m23715e();
        if (ar.m20936a() != null) {
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31519c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m50960a(ConnectionService.NetworkState networkState) {
        C13608f.m55249a(new Runnable() {
            /* class com.bytedance.ee.bear.wikiv2.extension.$$Lambda$LoadDataToCacheExtension$5niQAg8RPCRkGN2xS6ceqtxJrnQ */

            public final void run() {
                LoadDataToCacheExtension.m50964b(ConnectionService.NetworkState.this);
            }
        });
    }

    public LoadDataToCacheExtension(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        appCompatActivity.getLifecycle().addObserver(this);
        m50966c();
        m50963b();
    }

    /* renamed from: a */
    private boolean m50962a(String str) {
        if (C8275a.m34055d(str) != C8275a.f22375h) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.wikiv2.extension.WikiActivityExtension
    /* renamed from: a */
    public void mo46799a(Intent intent) {
        super.mo46799a(intent);
        m50966c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m50964b(ConnectionService.NetworkState networkState) {
        if (networkState != null) {
            C13479a.m54764b("LoadDataToCacheExtension", "onChanged: network state = " + networkState);
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31512b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50965b(String str) throws Exception {
        String str2;
        C5968f b;
        boolean z;
        String str3;
        Exception e;
        C5968f b2;
        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        BearUrl d = m50967d();
        if (!(f == null || d == null)) {
            C5955d.m24025b().mo24075a(f, d.f17447b);
            if (!TextUtils.isEmpty(d.f17447b)) {
                Set<String> d2 = C5890a.m23713d(d.f17446a);
                if (d2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    for (String str4 : d2) {
                        if (!(str4 == null || (b2 = C5955d.m24025b().mo24086b(str4, d.f17447b)) == null || b2.mo24137d() == null)) {
                            jSONObject.put(str4, (Object) b2.mo24137d());
                        }
                    }
                    if (jSONObject.size() > 0) {
                        C5890a.m23704a(d.f17447b, jSONObject);
                    }
                }
                String str5 = null;
                if (!TextUtils.equals(d.f17446a, C8275a.f22377j.mo32553a())) {
                    str5 = d.f17446a;
                    str2 = d.f17447b;
                } else {
                    C5968f b3 = C5955d.m24025b().mo24086b(f.f14592i + "_" + f.f14584a + "_WIKI_INFO", d.f17447b);
                    if (!(b3 == null || b3.mo24137d() == null)) {
                        try {
                            WikiInfo wikiInfo = (WikiInfo) JSONObject.parseObject(b3.mo24137d(), WikiInfo.class);
                            C13479a.m54764b("LoadDataToCacheExtension", "cachedWikiInfo " + wikiInfo);
                            if (wikiInfo != null) {
                                str3 = wikiInfo.getObjTypeString();
                                try {
                                    str2 = wikiInfo.getObjToken();
                                } catch (Exception e2) {
                                    e = e2;
                                }
                                str5 = str3;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str3 = null;
                            C13479a.m54758a("LoadDataToCacheExtension", "parse wikiInfo exception! str = ");
                            C13606d.m55245a("LoadDataToCacheExtension", e);
                            str2 = null;
                            str5 = str3;
                            b = C5955d.m24025b().mo24086b(f.f14592i + "_" + f.f14584a + C8275a.m34053c(str5), str2);
                            StringBuilder sb = new StringBuilder();
                            sb.append("cachedClientVar?=");
                            if (b != null) {
                            }
                            z = true;
                            sb.append(z);
                            C13479a.m54772d("LoadDataToCacheExtension", sb.toString());
                            C13479a.m54764b("LoadDataToCacheExtension", "loadDataToCache end");
                        }
                    }
                    str2 = null;
                }
                if (!(str5 == null || str2 == null || !m50962a(str5))) {
                    b = C5955d.m24025b().mo24086b(f.f14592i + "_" + f.f14584a + C8275a.m34053c(str5), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("cachedClientVar?=");
                    if (b != null || TextUtils.isEmpty(b.mo24137d())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb2.append(z);
                    C13479a.m54772d("LoadDataToCacheExtension", sb2.toString());
                }
            }
        }
        C13479a.m54764b("LoadDataToCacheExtension", "loadDataToCache end");
    }
}
