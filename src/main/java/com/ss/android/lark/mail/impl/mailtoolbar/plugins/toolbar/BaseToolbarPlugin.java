package com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.BaseWebPlugin;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4957m;
import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.Toolbar;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;

public abstract class BaseToolbarPlugin<T extends Toolbar> extends BaseWebPlugin<C4933k> {
    private final AbstractC1178x<Boolean> activeObserver = new AbstractC1178x() {
        /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.$$Lambda$BaseToolbarPlugin$X9fvY6bpMLcuBGl5m3TuPHzudqE */

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            BaseToolbarPlugin.this.lambda$new$0$BaseToolbarPlugin((Boolean) obj);
        }
    };
    private int toolbarHideAnimation;
    private AbstractC42808a<T> toolbarJSHandler;
    private int toolbarShowAnimation;
    protected AbstractC6212e<T> toolbarViewModel;

    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.BaseToolbarPlugin$a */
    public interface AbstractC42808a<T> extends AbstractC7945d<T> {
        /* renamed from: a */
        void mo153690a(ItemId itemId, String str);
    }

    /* access modifiers changed from: protected */
    public abstract String getToolbarJSBinderName();

    /* access modifiers changed from: protected */
    public abstract AbstractC6212e<T> getToolbarViewModel(FragmentActivity fragmentActivity);

    /* access modifiers changed from: protected */
    public abstract Fragment onCreateToolbarFragment(Context context, String str);

    /* access modifiers changed from: protected */
    public abstract AbstractC42808a<T> onCreateToolbarJSHandler();

    /* access modifiers changed from: protected */
    public final void updateToolbar(T t) {
        this.toolbarViewModel.configToolbar(t);
    }

    public void onAttachToHost(C4933k kVar) {
        super.onAttachToHost((C4943e) kVar);
        this.toolbarViewModel = getToolbarViewModel(getActivity());
    }

    public /* synthetic */ void lambda$new$0$BaseToolbarPlugin(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            ensureToolbarFragment(false);
            return;
        }
        C13479a.m54764b("BaseToolbarPlugin", "removeFragment");
        getUIContainer().mo19597c(this);
    }

    /* access modifiers changed from: protected */
    public void ensureToolbarFragment(boolean z) {
        AbstractC4958n uIContainer = getUIContainer();
        Fragment a = getUIContainer().mo19586a((AbstractC4941c) this);
        C13479a.m54764b("BaseToolbarPlugin", "ensureToolbarFragment force:" + z + ",current:" + a);
        if (a == null || z) {
            C4957m mVar = null;
            Fragment onCreateToolbarFragment = onCreateToolbarFragment(getContext(), null);
            Bundle arguments = onCreateToolbarFragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            onCreateToolbarFragment.setArguments(arguments);
            int i = this.toolbarShowAnimation;
            if (!(i == 0 && this.toolbarHideAnimation == 0)) {
                mVar = C4957m.m20520a(i, this.toolbarHideAnimation);
            }
            uIContainer.mo19590a(this, onCreateToolbarFragment, mVar);
        }
    }

    public /* synthetic */ void lambda$onAttachToUIContainer$1$BaseToolbarPlugin(ItemId itemId, String str) {
        this.toolbarJSHandler.mo153690a(itemId, str);
    }

    public void setToolbarAnimation(int i, int i2) {
        this.toolbarShowAnimation = i;
        this.toolbarHideAnimation = i2;
    }

    @Override // com.bytedance.ee.bear.browser.BaseWebPlugin
    public void onDetachFromUIContainer(C4933k kVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(kVar, nVar);
        AbstractC10550f.AbstractC10551a.m43717b(kVar.mo19564f()).mo39928b(this.toolbarViewModel);
        this.toolbarViewModel.onDetachFromUI();
    }

    public void onAttachToUIContainer(C4933k kVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) kVar, nVar);
        this.toolbarJSHandler = onCreateToolbarJSHandler();
        bindBridgeHandlerAutoUnbind(getToolbarJSBinderName(), this.toolbarJSHandler);
        this.toolbarViewModel.setDelegate(new AbstractC6212e.AbstractC6213a() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.$$Lambda$BaseToolbarPlugin$0BmqrfupsNt6fAZG9ZQQtzmhLw0 */

            @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6212e.AbstractC6213a
            public final void onToolbarItemClick(ItemId itemId, String str) {
                BaseToolbarPlugin.this.lambda$onAttachToUIContainer$1$BaseToolbarPlugin(itemId, str);
            }
        });
        this.toolbarViewModel.getActive().mo5923a(getLifecycleOwner(), this.activeObserver);
        this.toolbarViewModel.onAttachToUI(getActivity(), getWeb());
        AbstractC10550f.AbstractC10551a.m43717b(kVar.mo19564f()).mo39924a(this.toolbarViewModel);
    }
}
