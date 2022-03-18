package com.bytedance.ee.bear.middleground.docsdk.v2;

import com.bytedance.ee.bear.at.AbstractC4242i;
import com.bytedance.ee.bear.at.C4227b;
import com.bytedance.ee.bear.at.C4234e;
import com.bytedance.ee.bear.at.C4237f;
import com.bytedance.ee.bear.atfinder.AbstractC4270e;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.middleground.docsdk.v2.core.C9344a;

class SDKV2MentionPlugin extends BaseSDKMentionPlugin {
    private AbstractC4270e mentionDelegate;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.docsdk.v2.BaseSDKMentionPlugin
    public AbstractC4270e onCreateMentionDelegate() {
        return this.mentionDelegate;
    }

    SDKV2MentionPlugin(AbstractC4270e eVar) {
        this.mentionDelegate = eVar;
    }

    public void onDetachFromHost(C9344a aVar) {
        C4227b.m17588a((AbstractC4242i) null);
        C4227b.m17587a((AbstractC4242i.AbstractC4244b) null);
        super.onDetachFromHost((C4943e) aVar);
    }

    @Override // com.bytedance.ee.bear.middleground.docsdk.v2.BaseSDKMentionPlugin
    public void onAttachToHost(C9344a aVar) {
        C4227b.m17588a(new C4237f());
        C4227b.m17587a(new C4234e());
        super.onAttachToHost(aVar);
    }
}
