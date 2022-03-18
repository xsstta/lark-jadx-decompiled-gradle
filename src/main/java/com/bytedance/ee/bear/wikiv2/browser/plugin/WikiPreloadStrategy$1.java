package com.bytedance.ee.bear.wikiv2.browser.plugin;

import com.bytedance.ee.bear.contract.BinderIPreloadCallback;
import com.bytedance.ee.bear.contract.doc.C5130a;
import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

/* access modifiers changed from: package-private */
public class WikiPreloadStrategy$1 extends BinderIPreloadCallback.Stub {
    final /* synthetic */ C12212e this$0;
    final /* synthetic */ BinderIPreloadCallback val$callback;
    final /* synthetic */ WikiInfo val$wikiInfo;

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5096b
    public void onPreloadFail(String str) {
        BinderIPreloadCallback binderIPreloadCallback = this.val$callback;
        if (binderIPreloadCallback != null) {
            binderIPreloadCallback.onPreloadFail(str);
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5096b
    public void onPreloadStart(String str) {
        BinderIPreloadCallback binderIPreloadCallback = this.val$callback;
        if (binderIPreloadCallback != null) {
            binderIPreloadCallback.onPreloadStart(str);
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5096b
    public void onPreloadSuccess(String str) {
        BinderIPreloadCallback binderIPreloadCallback = this.val$callback;
        if (binderIPreloadCallback != null) {
            binderIPreloadCallback.onPreloadSuccess(str);
        }
        String str2 = this.this$0.f16764a;
        C13479a.m54772d(str2, "onPreloadSuccess:" + str);
        if (!C5130a.m20997b(this.val$wikiInfo.getWikiToken())) {
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31513b(this.val$wikiInfo.getWikiToken());
        }
    }

    WikiPreloadStrategy$1(C12212e eVar, BinderIPreloadCallback binderIPreloadCallback, WikiInfo wikiInfo) {
        this.this$0 = eVar;
        this.val$callback = binderIPreloadCallback;
        this.val$wikiInfo = wikiInfo;
    }
}
