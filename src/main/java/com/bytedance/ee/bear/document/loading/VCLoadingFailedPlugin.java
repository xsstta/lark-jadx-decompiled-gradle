package com.bytedance.ee.bear.document.loading;

import com.bytedance.ee.bear.doc.follow.event.LoadStateChangedEvent;
import com.bytedance.ee.bear.document.follow.FollowPlugin;
import com.bytedance.ee.log.C13479a;

public class VCLoadingFailedPlugin extends LoadingFailedPlugin {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.loading.LoadingFailedPlugin
    public void replaceDocumentFragment() {
        FollowPlugin followPlugin = (FollowPlugin) findPlugin(FollowPlugin.class);
        if (followPlugin != null) {
            C13479a.m54764b("VCLoadingFailedPlugin", "load fail and then inform VC of recreating new fragment");
            followPlugin.processEvent(new LoadStateChangedEvent(LoadStateChangedEvent.LoadState.LoadFailAndReplaceDocFragment));
        }
    }
}
