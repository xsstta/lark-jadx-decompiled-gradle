package com.bytedance.ee.bear.wikiv2.browser.plugin;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderIPreloadCallback;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.document.offline.sync.AbstractC5983c;
import com.bytedance.ee.bear.document.offline.sync.AbstractC5997i;
import com.bytedance.ee.bear.document.offline.sync.C6005m;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.e */
public class C12212e extends AbstractC5983c {

    /* renamed from: k */
    private AccountService.Account f32850k;

    /* renamed from: l */
    private final Context f32851l;

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public JSONObject mo24216a(String str) {
        return null;
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public void mo24218a(String str, String str2) {
    }

    public C12212e(Context context) {
        this.f32851l = context;
        this.f16764a = "WikiPreloadStrategyV2";
    }

    /* renamed from: a */
    private AbstractC5997i m50849a(int i) {
        return C6005m.m24312a().mo24271a(i);
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: c */
    public C5968f mo24219c(String str) {
        try {
            WikiInfo a = C12213f.m50858a(this.f32851l, str);
            return m50849a(a.getObjType()).mo24219c(a.getObjToken());
        } catch (Exception unused) {
            C13479a.m54775e(this.f16764a, "No wiki info cache or read err");
            return null;
        }
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public /* synthetic */ void m50852a(Throwable th) throws Exception {
        C13479a.m54759a(this.f16764a, "preload ERR", th);
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5983c, com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24217a(AccountService.Account account) {
        super.mo24217a(account);
        this.f32850k = account;
    }

    /* renamed from: a */
    private OfflineDoc m50848a(WikiInfo wikiInfo, String str) {
        int objType = wikiInfo.getObjType();
        String objToken = wikiInfo.getObjToken();
        return new OfflineDoc(objToken, C6313i.m25327a().mo25382a(C8275a.m34050a(objType), objToken, str), objType, str);
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24221a(OfflineDoc offlineDoc, BinderIPreloadCallback binderIPreloadCallback) {
        C13479a.m54764b(this.f16764a, "preload");
        Disposable b = C12213f.m50862a(offlineDoc.getObj_token()).mo237985a(C11678b.m48477a()).mo238001b(new Consumer(offlineDoc, binderIPreloadCallback) {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$e$We0XgFjDxGGxvdqjjYfZTXtGpA */
            public final /* synthetic */ OfflineDoc f$1;
            public final /* synthetic */ BinderIPreloadCallback f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12212e.this.m50850a((C12212e) this.f$1, (OfflineDoc) this.f$2, (BinderIPreloadCallback) ((WikiInfo) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$e$bWqKhJ_JqukJrFoj3EvEjyFG_jY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12212e.this.m50852a((C12212e) ((Throwable) obj));
            }
        });
        String str = this.f16764a;
        C13479a.m54764b(str, "disposable = " + b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50850a(OfflineDoc offlineDoc, BinderIPreloadCallback binderIPreloadCallback, WikiInfo wikiInfo) throws Exception {
        m50851a(wikiInfo, offlineDoc.getFrom_source(), binderIPreloadCallback);
    }

    /* renamed from: a */
    private void m50851a(WikiInfo wikiInfo, String str, BinderIPreloadCallback binderIPreloadCallback) {
        OfflineDoc a = m50848a(wikiInfo, str);
        AbstractC5997i a2 = m50849a(a.getType());
        if (a2 != null) {
            a2.mo24221a(a, new WikiPreloadStrategy$1(this, binderIPreloadCallback, wikiInfo));
        }
    }
}
