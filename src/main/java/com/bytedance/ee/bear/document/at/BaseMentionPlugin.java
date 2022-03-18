package com.bytedance.ee.bear.document.at;

import android.os.Bundle;
import android.view.ViewTreeObserver;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.atfinder.AbstractC4270e;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.edit.component.document.at.AtFinderHandler;
import com.bytedance.ee.bear.edit.component.document.at.C7596a;
import com.bytedance.ee.bear.edit.component.document.at.C7599b;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.util.p718t.C13749l;
import java.util.Map;

public abstract class BaseMentionPlugin extends DocumentPluginV2 {
    private final AtFinderHandler atFinderHandler;
    private C7599b atViewModel;
    private C6215b editPanelsManager;
    private ViewTreeObserver.OnGlobalLayoutListener listener = new ViewTreeObserver.OnGlobalLayoutListener() {
        /* class com.bytedance.ee.bear.document.at.BaseMentionPlugin.ViewTreeObserver$OnGlobalLayoutListenerC56602 */

        public void onGlobalLayout() {
            TitleBar titleBar;
            if (C13749l.m55763g(BaseMentionPlugin.this.getContext()) && (titleBar = BaseMentionPlugin.this.getTitleBar()) != null) {
                BaseMentionPlugin.this.setTitleBarLocation(titleBar);
            }
        }
    };
    private AbstractC1178x<Boolean> mActiveObserver;
    private AbstractC5233x mAnalyticService;

    /* access modifiers changed from: protected */
    public abstract AbstractC4270e onCreateMentionDelegate();

    public AbstractC5233x getAnalyticService() {
        if (this.mAnalyticService == null) {
            this.mAnalyticService = C5234y.m21391b();
        }
        return this.mAnalyticService;
    }

    public BaseMentionPlugin() {
        AtFinderHandler atFinderHandler2 = new AtFinderHandler();
        this.atFinderHandler = atFinderHandler2;
        atFinderHandler2.mo29872a(new AtFinderHandler.AbstractC7595a() {
            /* class com.bytedance.ee.bear.document.at.BaseMentionPlugin.C56591 */

            @Override // com.bytedance.ee.bear.edit.component.document.at.AtFinderHandler.AbstractC7595a
            /* renamed from: a */
            public void mo22655a(String str) {
                BaseMentionPlugin.this.getAnalyticService().mo21077a(str);
            }

            @Override // com.bytedance.ee.bear.edit.component.document.at.AtFinderHandler.AbstractC7595a
            /* renamed from: a */
            public void mo22656a(String str, String str2, String str3) {
                BaseMentionPlugin.this.getAnalyticService().mo21078a(str, str2, str3);
            }
        });
    }

    private void ensureAtFragment() {
        AbstractC4958n uIContainer = getUIContainer();
        if (uIContainer.mo19586a((AbstractC4941c) this) == null) {
            uIContainer.mo19589a(this, instantiateFragment(C7596a.class, new Bundle()));
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.atfinder", this.atFinderHandler);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromHost(C4943e eVar) {
        super.onDetachFromHost(eVar);
        getAnalyticService().mo21087d("bizCommonParams");
    }

    public /* synthetic */ void lambda$onAttachToUIContainer$0$BaseMentionPlugin(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            ensureAtFragment();
            return;
        }
        AbstractC4941c findPlugin = findPlugin(getClass());
        if (findPlugin != null) {
            getUIContainer().mo19597c(findPlugin);
        }
    }

    public void setTitleBarLocation(TitleBar titleBar) {
        int[] iArr = new int[2];
        titleBar.mo19508a().getLocationInWindow(iArr);
        this.atViewModel.setTitleBarLocation(iArr[1]);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        C7599b bVar = (C7599b) viewModel(C7599b.class);
        this.atViewModel = bVar;
        this.atFinderHandler.mo29873a(bVar);
        C6215b bVar2 = (C6215b) aj.m5366a(getActivity()).mo6005a(C6215b.class);
        this.editPanelsManager = bVar2;
        this.atViewModel.setEditPanelsManager(bVar2);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(eVar, nVar);
        AbstractC10550f.AbstractC10551a.m43717b(eVar.mo19564f()).mo39928b(this.atViewModel);
        this.atViewModel.onDetachFromUI();
        this.atViewModel.setActive(false);
        if (getTitleBar() != null) {
            getTitleBar().mo19508a().getViewTreeObserver().removeOnGlobalLayoutListener(this.listener);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
        if (this.mActiveObserver == null) {
            this.mActiveObserver = new AbstractC1178x() {
                /* class com.bytedance.ee.bear.document.at.$$Lambda$BaseMentionPlugin$uXzPNBIb1URwIkwJmemDW1zfw */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    BaseMentionPlugin.this.lambda$onAttachToUIContainer$0$BaseMentionPlugin((Boolean) obj);
                }
            };
            this.atViewModel.getActive().mo5923a(getLifecycleOwner(), this.mActiveObserver);
        }
        this.editPanelsManager.registerEditPanel(getLifecycleOwner(), this.atViewModel);
        if (this.atViewModel.getMentionDelegate() == null) {
            this.atViewModel.setMentionDelegate(onCreateMentionDelegate());
        }
        AbstractC10550f.AbstractC10551a.m43717b(eVar.mo19564f()).mo39924a(this.atViewModel);
        TitleBar titleBar = getTitleBar();
        if (titleBar != null) {
            titleBar.mo19508a().getViewTreeObserver().addOnGlobalLayoutListener(this.listener);
            setTitleBarLocation(titleBar);
        }
    }
}
