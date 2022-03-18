package com.bytedance.ee.bear.middleground.docsdk.v2;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.atfinder.AbstractC4270e;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.edit.component.document.at.AtFinderHandler;
import com.bytedance.ee.bear.edit.component.document.at.C7596a;
import com.bytedance.ee.bear.edit.component.document.at.C7599b;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.middleground.docsdk.v2.core.AbsEditorSdkPlugin;
import com.bytedance.ee.bear.middleground.docsdk.v2.core.C9344a;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import java.util.Map;

public abstract class BaseSDKMentionPlugin extends AbsEditorSdkPlugin {
    private AtFinderHandler atFinderHandler = new AtFinderHandler();
    private C7599b atViewModel;
    private AbstractC1178x<Boolean> mActiveObserver;

    /* access modifiers changed from: protected */
    public String getUrl() {
        return "";
    }

    /* access modifiers changed from: protected */
    public abstract AbstractC4270e onCreateMentionDelegate();

    private void ensureAtFragment() {
        AbstractC4958n uIContainer = getUIContainer();
        if (uIContainer.mo19586a((AbstractC4941c) this) == null) {
            Bundle bundle = new Bundle();
            bundle.putString("url", getUrl());
            uIContainer.mo19589a(this, instantiateFragment(C7596a.class, bundle));
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.atfinder", this.atFinderHandler);
    }

    public void onAttachToHost(C9344a aVar) {
        super.onAttachToHost((C4943e) aVar);
        C7599b bVar = (C7599b) viewModel(C7599b.class);
        this.atViewModel = bVar;
        this.atFinderHandler.mo29873a(bVar);
        this.atViewModel.setEditPanelsManager(aVar.mo19354a());
    }

    public /* synthetic */ void lambda$onAttachToUIContainer$0$BaseSDKMentionPlugin(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            ensureAtFragment();
            return;
        }
        AbstractC4941c findPlugin = findPlugin(getClass());
        if (findPlugin != null && getUIContainer() != null) {
            getUIContainer().mo19597c(findPlugin);
        }
    }

    public void onDetachFromUIContainer(C9344a aVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) aVar, nVar);
        AbstractC10550f.AbstractC10551a.m43717b(aVar.mo19564f()).mo39928b(this.atViewModel);
        this.atViewModel.onDetachFromUI();
        this.atViewModel.setActive(false);
    }

    public void onAttachToUIContainer(C9344a aVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) aVar, nVar);
        if (this.mActiveObserver == null) {
            this.mActiveObserver = new AbstractC1178x() {
                /* class com.bytedance.ee.bear.middleground.docsdk.v2.$$Lambda$BaseSDKMentionPlugin$tw6NSfx_JKENEVzv5TPWHjYvdho */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    BaseSDKMentionPlugin.this.lambda$onAttachToUIContainer$0$BaseSDKMentionPlugin((Boolean) obj);
                }
            };
            this.atViewModel.getActive().mo5923a(getLifecycleOwner(), this.mActiveObserver);
        }
        aVar.mo19354a().registerEditPanel(getLifecycleOwner(), this.atViewModel);
        if (this.atViewModel.getMentionDelegate() == null) {
            this.atViewModel.setMentionDelegate(onCreateMentionDelegate());
        }
        AbstractC10550f.AbstractC10551a.m43717b(aVar.mo19564f()).mo39924a(this.atViewModel);
    }
}
