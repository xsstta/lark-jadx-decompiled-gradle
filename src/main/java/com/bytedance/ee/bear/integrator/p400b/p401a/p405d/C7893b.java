package com.bytedance.ee.bear.integrator.p400b.p401a.p405d;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderIPreloadCallback;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.document.offline.sync.AbstractC5983c;
import com.bytedance.ee.bear.wiki.browser.plugin.C11925d;
import com.bytedance.ee.bear.wikiv2.browser.plugin.C12212e;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.integrator.b.a.d.b */
public class C7893b extends AbstractC5983c {

    /* renamed from: k */
    private final C11925d f21291k;

    /* renamed from: l */
    private final C12212e f21292l;

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public JSONObject mo24216a(String str) {
        return null;
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public void mo24218a(String str, String str2) {
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5983c, com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24217a(AccountService.Account account) {
        super.mo24217a(account);
        this.f21291k.mo24217a(account);
        this.f21292l.mo24217a(account);
    }

    public C7893b(Context context) {
        this.f21291k = new C11925d(context);
        this.f21292l = new C12212e(context);
        this.f16764a = "WikiPreloadStrategyWrapper";
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: c */
    public C5968f mo24219c(String str) {
        if (((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21070c()) {
            return this.f21292l.mo24219c(str);
        }
        return this.f21291k.mo24219c(str);
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24221a(OfflineDoc offlineDoc, BinderIPreloadCallback binderIPreloadCallback) {
        C13479a.m54764b(this.f16764a, "preload");
        if (((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21070c()) {
            this.f21292l.mo24221a(offlineDoc, binderIPreloadCallback);
        } else {
            this.f21291k.mo24221a(offlineDoc, binderIPreloadCallback);
        }
    }
}
