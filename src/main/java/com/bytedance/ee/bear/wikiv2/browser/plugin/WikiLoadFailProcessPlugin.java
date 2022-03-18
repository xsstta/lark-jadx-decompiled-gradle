package com.bytedance.ee.bear.wikiv2.browser.plugin;

import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.loading.LoadingFailedPlugin;

public class WikiLoadFailProcessPlugin extends LoadingFailedPlugin {
    private WikiViewModel wikiViewModel;

    @Override // com.bytedance.ee.bear.document.loading.LoadingFailedPlugin, com.bytedance.ee.bear.document.loading.LoadingLayout.AbstractC5864a
    public void onFailedRetry(int i) {
        if (i != 920004002) {
            super.onFailedRetry(i);
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        this.wikiViewModel = (WikiViewModel) C4950k.m20479a(sVar, WikiViewModel.class, WikiViewModel.newFactory(((C6095s) getHost()).mo24597l().getArguments()));
    }
}
