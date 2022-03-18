package com.bytedance.ee.bear.document.offline.sync.htmlcache;

import com.bytedance.ee.bear.contract.SimpleListDataChangeCallback;

/* access modifiers changed from: package-private */
public class PreloadHtmlCacheExecutor$1 extends SimpleListDataChangeCallback {
    final /* synthetic */ C5994d this$0;

    @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onFileOpen() {
        super.onFileOpen();
        this.this$0.f16788c = true;
    }

    @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onFileClose() {
        super.onFileClose();
        if (this.this$0.f16787b != null) {
            this.this$0.f16787b.countDown();
        }
        this.this$0.f16788c = false;
    }

    PreloadHtmlCacheExecutor$1(C5994d dVar) {
        this.this$0 = dVar;
    }
}
