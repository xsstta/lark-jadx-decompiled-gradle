package com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4957m;
import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.Toolbar;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.middleground.docsdk.v2.core.AbsEditorSdkPlugin;
import com.bytedance.ee.bear.middleground.docsdk.v2.core.C9344a;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;

public abstract class DocSDKBaseToolbarPlugin<T extends Toolbar> extends AbsEditorSdkPlugin {
    private AbstractC1178x<Boolean> activeObserver = new AbstractC1178x() {
        /* class com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar.$$Lambda$DocSDKBaseToolbarPlugin$57O1EPVv7qxnteSAi97kfD95fKo */

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            DocSDKBaseToolbarPlugin.this.lambda$new$0$DocSDKBaseToolbarPlugin((Boolean) obj);
        }
    };
    private int toolbarHideAnimation;
    private AbstractC9317a<T> toolbarJSHandler;
    private int toolbarShowAnimation;
    protected AbstractC6212e<T> toolbarViewModel;

    /* renamed from: com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar.DocSDKBaseToolbarPlugin$a */
    public interface AbstractC9317a<T> extends AbstractC7945d<T> {
        /* renamed from: a */
        void mo35557a(ItemId itemId, String str);
    }

    private String getUrl() {
        return "";
    }

    /* access modifiers changed from: protected */
    public abstract String getToolbarJSBinderName();

    /* access modifiers changed from: protected */
    public abstract AbstractC6212e<T> getToolbarViewModel(FragmentActivity fragmentActivity);

    /* access modifiers changed from: protected */
    public abstract Fragment onCreateToolbarFragment(Context context, String str);

    /* access modifiers changed from: protected */
    public abstract AbstractC9317a<T> onCreateToolbarJSHandler();

    public final void updateToolbar(T t) {
        this.toolbarViewModel.configToolbar(t);
    }

    public void onAttachToHost(C9344a aVar) {
        super.onAttachToHost((C4943e) aVar);
        this.toolbarViewModel = getToolbarViewModel(getActivity());
    }

    public /* synthetic */ void lambda$new$0$DocSDKBaseToolbarPlugin(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            ensureToolbarFragment(false);
            return;
        }
        C13479a.m54764b("BaseToolbarPlugin", "removeFragment");
        if (getUIContainer() != null) {
            getUIContainer().mo19597c(this);
        }
    }

    /* access modifiers changed from: protected */
    public void ensureToolbarFragment(boolean z) {
        AbstractC4958n uIContainer = getUIContainer();
        Fragment a = getUIContainer().mo19586a((AbstractC4941c) this);
        C13479a.m54764b("BaseToolbarPlugin", "ensureToolbarFragment force:" + z + ",current:" + a);
        if (a == null || z) {
            Fragment onCreateToolbarFragment = onCreateToolbarFragment(getContext(), getUrl());
            Bundle arguments = onCreateToolbarFragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putBoolean("EnableExternalSelect", true);
            onCreateToolbarFragment.setArguments(arguments);
            C4957m mVar = null;
            int i = this.toolbarShowAnimation;
            if (!(i == 0 && this.toolbarHideAnimation == 0)) {
                mVar = C4957m.m20520a(i, this.toolbarHideAnimation);
            }
            uIContainer.mo19590a(this, onCreateToolbarFragment, mVar);
        }
    }

    public /* synthetic */ void lambda$onAttachToUIContainer$1$DocSDKBaseToolbarPlugin(ItemId itemId, String str) {
        this.toolbarJSHandler.mo35557a(itemId, str);
    }

    public void setToolbarAnimation(int i, int i2) {
        this.toolbarShowAnimation = i;
        this.toolbarHideAnimation = i2;
    }

    public void onDetachFromUIContainer(C9344a aVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) aVar, nVar);
        AbstractC10550f.AbstractC10551a.m43717b(aVar.mo19564f()).mo39928b(this.toolbarViewModel);
        this.toolbarViewModel.onDetachFromUI();
    }

    public void onAttachToUIContainer(C9344a aVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) aVar, nVar);
        this.toolbarJSHandler = onCreateToolbarJSHandler();
        bindBridgeHandlerAutoUnbind(getToolbarJSBinderName(), this.toolbarJSHandler);
        this.toolbarViewModel.setDelegate(new AbstractC6212e.AbstractC6213a() {
            /* class com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar.$$Lambda$DocSDKBaseToolbarPlugin$ORU8w97t3XfFWpPtUl9_NjVUso */

            @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6212e.AbstractC6213a
            public final void onToolbarItemClick(ItemId itemId, String str) {
                DocSDKBaseToolbarPlugin.this.lambda$onAttachToUIContainer$1$DocSDKBaseToolbarPlugin(itemId, str);
            }
        });
        this.toolbarViewModel.getActive().mo5923a(getLifecycleOwner(), this.activeObserver);
        aVar.mo19354a().registerEditPanel(getLifecycleOwner(), this.toolbarViewModel);
        this.toolbarViewModel.onAttachToUI(getActivity(), getWeb());
        AbstractC10550f.AbstractC10551a.m43717b(aVar.mo19564f()).mo39924a(this.toolbarViewModel);
    }
}
