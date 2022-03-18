package com.bytedance.ee.bear.browser.plugin;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.log.C13479a;

public class BasePlugin<H extends C4943e> implements AbstractC4941c<H> {
    private H host;

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c
    public void onAttachToUIContainer(H h, AbstractC4958n nVar) {
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c
    public void onDetachFromHost(H h) {
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c
    public void onDetachFromUIContainer(H h, AbstractC4958n nVar) {
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c
    public void setUserVisibleHint(boolean z) {
    }

    public Context getContext() {
        return getActivity();
    }

    public void removeFragment() {
        getUIContainer().mo19597c(this);
    }

    public FragmentActivity getActivity() {
        return getHost().mo19564f();
    }

    public FragmentManager getFragmentManager() {
        return getUIContainer().mo19602g();
    }

    public LifecycleOwner getLifecycleOwner() {
        return getHost().mo19566h();
    }

    public Resources getResources() {
        return getContext().getResources();
    }

    /* access modifiers changed from: protected */
    public AbstractC4928g getServiceProvider() {
        return getHost().mo19567i();
    }

    public boolean isUIContainerAttached() {
        H h = this.host;
        if (h == null || h.mo19565g() == null) {
            return false;
        }
        return true;
    }

    public boolean isUIContainerDetached() {
        H h = this.host;
        if (h == null || h.mo19565g() == null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c
    public H getHost() {
        if (this.host == null) {
            C13479a.m54759a("BasePlugin", "", new IllegalStateException("getHost when plugin not attached or already detached !"));
        }
        return this.host;
    }

    public TitleBar getTitleBar() {
        if (isUIContainerAttached()) {
            return getUIContainer().mo19600e();
        }
        return null;
    }

    public AbstractC4958n getUIContainer() throws IllegalStateException {
        AbstractC4958n g = this.host.mo19565g();
        if (g == null) {
            C13479a.m54759a("BasePlugin", "", new IllegalStateException("GetUiContainer when plugin not attached to UI or already detached from UI! Call isUIContainerAttached first."));
        }
        return g;
    }

    /* access modifiers changed from: protected */
    public boolean isVisibleToUser() {
        FragmentActivity f;
        H h = this.host;
        if (h == null || (f = h.mo19564f()) == null || f.getLifecycle().getCurrentState() != Lifecycle.State.RESUMED) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c
    public void onAttachToHost(H h) {
        setHost(h);
    }

    public final void setHost(H h) {
        this.host = h;
    }

    /* access modifiers changed from: protected */
    public void addOrReplaceFragment(Class<? extends Fragment> cls) {
        addOrReplaceFragment(cls, null);
    }

    public <F extends Fragment> F instantiateFragment(Class<F> cls) {
        return (F) instantiateFragment(cls, null);
    }

    public <T extends AbstractC1142af> T viewModel(Class<T> cls) {
        return (T) C4950k.m20476a(this, cls);
    }

    public <P extends AbstractC4941c> P findPlugin(Class<P> cls) {
        return (P) getHost().mo19540a(cls);
    }

    public <T extends PluginHostAbility> T getHostAbility(Class<T> cls) {
        return (T) getHost().mo19551b(cls);
    }

    public <T extends PluginHostAbility> T getHostAbilityOrNull(Class<T> cls) {
        return (T) getHost().mo19556c(cls);
    }

    /* access modifiers changed from: protected */
    public <T> T getService(Class<T> cls) {
        return (T) getHost().mo19559d(cls);
    }

    public String getString(int i) {
        return getContext().getString(i);
    }

    /* access modifiers changed from: protected */
    public void addOrReplaceFragment(Class<? extends Fragment> cls, Bundle bundle) {
        addOrReplaceFragment(cls, bundle, null);
    }

    /* access modifiers changed from: protected */
    public <T extends AbstractC1142af> T viewModel(Class<T> cls, C1144ai.AbstractC1146b bVar) {
        return (T) C4950k.m20477a(this, cls, bVar);
    }

    public <F extends Fragment> F instantiateFragment(Class<F> cls, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        C4943e.m20404a(bundle, this);
        return (F) Fragment.instantiate(getContext(), cls.getName(), bundle);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Class<? extends androidx.fragment.app.Fragment> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    public void addOrReplaceFragment(Class<? extends Fragment> cls, Bundle bundle, C4957m mVar) {
        AbstractC4958n uIContainer = getUIContainer();
        if (uIContainer.mo19586a((AbstractC4941c) this) == null) {
            uIContainer.mo19590a(this, instantiateFragment(cls, bundle), mVar);
        }
    }
}
