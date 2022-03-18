package com.bytedance.ee.bear.wiki.browser.plugin;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderIPreloadCallback;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.document.offline.sync.AbstractC5983c;
import com.bytedance.ee.bear.document.offline.sync.AbstractC5997i;
import com.bytedance.ee.bear.document.offline.sync.C6005m;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.wiki.browser.plugin.d */
public class C11925d extends AbstractC5983c {

    /* renamed from: k */
    private AccountService.Account f32252k;

    /* renamed from: l */
    private final Context f32253l;

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public JSONObject mo24216a(String str) {
        return null;
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public void mo24218a(String str, String str2) {
    }

    public C11925d(Context context) {
        this.f32253l = context;
        this.f16764a = "WikiPreloadStrategy";
    }

    /* renamed from: a */
    private AbstractC5997i m49444a(int i) {
        return C6005m.m24312a().mo24271a(i);
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: c */
    public C5968f mo24219c(String str) {
        try {
            WikiInfo a = C11922b.m49412a(this.f32253l, new C10917c(new C10929e()), this.f32252k, str);
            if (a == null) {
                return new C5968f();
            }
            return m49444a(a.getObjType()).mo24219c(a.getObjToken());
        } catch (Exception unused) {
            C13479a.m54775e(this.f16764a, "No wiki info cache or read err");
            return null;
        }
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public /* synthetic */ void m49447a(Throwable th) throws Exception {
        C13479a.m54773d(this.f16764a, "preload ERR", th);
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5983c, com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24217a(AccountService.Account account) {
        super.mo24217a(account);
        this.f32252k = account;
    }

    /* renamed from: a */
    private OfflineDoc m49443a(WikiInfo wikiInfo, String str) {
        int objType = wikiInfo.getObjType();
        String objToken = wikiInfo.getObjToken();
        return new OfflineDoc(objToken, C6313i.m25327a().mo25382a(C8275a.m34050a(objType), objToken, str), objType, str);
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24221a(OfflineDoc offlineDoc, BinderIPreloadCallback binderIPreloadCallback) {
        C13479a.m54764b(this.f16764a, "preload");
        Disposable b = C11922b.m49420a(this.f32253l, this.f16765b, offlineDoc.getObj_token(), false).mo238001b(new Consumer(offlineDoc, binderIPreloadCallback) {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$d$pRY__ae6dADvup2_tDYe0Wrw34 */
            public final /* synthetic */ OfflineDoc f$1;
            public final /* synthetic */ BinderIPreloadCallback f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11925d.this.m49445a((C11925d) this.f$1, (OfflineDoc) this.f$2, (BinderIPreloadCallback) ((WikiInfo) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$d$gZ7yU4axeo7_l06jrznEJj288Og */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11925d.this.m49447a((C11925d) ((Throwable) obj));
            }
        });
        String str = this.f16764a;
        C13479a.m54764b(str, "disposable = " + b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m49445a(OfflineDoc offlineDoc, BinderIPreloadCallback binderIPreloadCallback, WikiInfo wikiInfo) throws Exception {
        m49446a(wikiInfo, offlineDoc.getFrom_source(), binderIPreloadCallback);
    }

    /* renamed from: a */
    private void m49446a(WikiInfo wikiInfo, String str, BinderIPreloadCallback binderIPreloadCallback) {
        OfflineDoc a = m49443a(wikiInfo, str);
        m49444a(a.getType()).mo24221a(a, new WikiPreloadStrategy$1(this, binderIPreloadCallback, wikiInfo));
    }
}
