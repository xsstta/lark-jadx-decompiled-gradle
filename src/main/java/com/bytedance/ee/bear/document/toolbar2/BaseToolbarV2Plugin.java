package com.bytedance.ee.bear.document.toolbar2;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarV2;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;

public abstract class BaseToolbarV2Plugin<T extends ToolbarV2> extends DocumentPluginV2 {
    private AbstractC1178x<Boolean> activeObserver = new AbstractC1178x() {
        /* class com.bytedance.ee.bear.document.toolbar2.$$Lambda$BaseToolbarV2Plugin$kYJ6Zk0KP7jwqwaZmdsxpEGeU */

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            BaseToolbarV2Plugin.this.lambda$new$0$BaseToolbarV2Plugin((Boolean) obj);
        }
    };
    public AbstractC7616f<T> toolbarViewModel;

    public abstract AbstractC7616f<T> getToolbarViewModel();

    /* access modifiers changed from: protected */
    public abstract Fragment onCreateToolbarFragment(Context context, String str);

    private void ensureToolbarFragment() {
        boolean z;
        AbstractC4958n uIContainer = getUIContainer();
        Fragment a = uIContainer.mo19586a((AbstractC4941c) this);
        if (a == null) {
            Fragment onCreateToolbarFragment = onCreateToolbarFragment(getContext(), getEditorAbility().mo24602q().getUrl());
            Bundle arguments = onCreateToolbarFragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            if (getEditorAbility().mo24602q().getOpenSource() != DocsOpenSource.vc) {
                z = true;
            } else {
                z = false;
            }
            arguments.putBoolean("EnableExternalSelect", z);
            onCreateToolbarFragment.setArguments(arguments);
            uIContainer.mo19589a(this, onCreateToolbarFragment);
            return;
        }
        uIContainer.mo19589a(this, a);
        C13479a.m54764b("ToolbarV2", " use old fragment");
    }

    /* access modifiers changed from: protected */
    public final void updateToolbar(T t) {
        this.toolbarViewModel.updateToolbar(t);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        this.toolbarViewModel = getToolbarViewModel();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromHost(C4943e eVar) {
        super.onDetachFromHost(eVar);
        this.toolbarViewModel.onDetachFromHost();
    }

    public /* synthetic */ void lambda$new$0$BaseToolbarV2Plugin(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            C13479a.m54764b("ToolbarV2", "ensureToolbarFragment");
            ensureToolbarFragment();
            return;
        }
        C13479a.m54764b("ToolbarV2", "removeToolbarFragment");
        getUIContainer().mo19597c(this);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(eVar, nVar);
        AbstractC10550f.AbstractC10551a.m43717b(eVar.mo19564f()).mo39928b(this.toolbarViewModel);
        this.toolbarViewModel.onDetachFromUI();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
        AbstractC10550f b = AbstractC10550f.AbstractC10551a.m43717b(eVar.mo19564f());
        b.mo39924a(this.toolbarViewModel);
        this.toolbarViewModel.onKeyboardHeightChanged(b, b.mo39934h(), getResources().getConfiguration().orientation);
        this.toolbarViewModel.getActive().mo5923a(getLifecycleOwner(), this.activeObserver);
        this.toolbarViewModel.onAttachToUI(getActivity(), getBridge());
    }

    /* access modifiers changed from: protected */
    public <V> void callBackFunction(AbstractC7947h hVar, String str, V v, int i) {
        if (hVar == null) {
            C13479a.m54775e("ToolbarV2", "callBackFunction == null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) str);
        jSONObject.put("value", (Object) v);
        jSONObject.put("level", (Object) Integer.valueOf(i));
        C13479a.m54764b("ToolbarV2", jSONObject.toString());
        hVar.mo17188a(jSONObject);
    }
}
