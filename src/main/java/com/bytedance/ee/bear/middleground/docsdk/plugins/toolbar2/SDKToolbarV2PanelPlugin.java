package com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.browser.plugin.C4957m;
import com.bytedance.ee.bear.document.model.toolbar.DocToolbarV2;
import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7644k;
import com.bytedance.ee.bear.edit.component.toolbar2.C7645l;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.middleground.docsdk.v2.core.C9344a;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class SDKToolbarV2PanelPlugin extends BasePlugin<C9344a> {
    private AbstractC1178x<Boolean> activeObserver = new AbstractC1178x() {
        /* class com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar2.$$Lambda$SDKToolbarV2PanelPlugin$D5COsWNOFmGmfDgs5D4pwJOkWI */

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            SDKToolbarV2PanelPlugin.this.lambda$new$0$SDKToolbarV2PanelPlugin((Boolean) obj);
        }
    };
    public AbstractC7947h callBackFunction;
    public C6215b editPanelsManager;
    public C9320a handler;
    private int toolbarHideAnimation;
    private int toolbarShowAnimation;
    protected AbstractC7616f<DocToolbarV2> toolbarViewModel;

    public SDKToolbarV2PanelPlugin() {
        setToolbarAnimation(R.anim.doc_sdk_toolbar_fade_in, R.anim.doc_sdk_toolbar_fade_out);
    }

    private void ensureToolbarFragment() {
        AbstractC4958n uIContainer = getUIContainer();
        if (uIContainer.mo19586a((AbstractC4941c) this) == null) {
            Bundle bundle = new Bundle();
            Fragment instantiateFragment = instantiateFragment(C9322b.class, bundle);
            instantiateFragment.setArguments(bundle);
            C4957m mVar = null;
            int i = this.toolbarShowAnimation;
            if (!(i == 0 && this.toolbarHideAnimation == 0)) {
                mVar = C4957m.m20520a(i, this.toolbarHideAnimation);
            }
            uIContainer.mo19590a(this, instantiateFragment, mVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar2.SDKToolbarV2PanelPlugin$a */
    public class C9320a implements AbstractC7644k<DocToolbarV2> {
        @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7644k
        public int getType() {
            return 0;
        }

        private C9320a() {
        }

        /* renamed from: a */
        public void handle(DocToolbarV2 docToolbarV2, AbstractC7947h hVar) {
            C13479a.m54772d("SDKToolbarV2PanelPlugin", "Js update toolbar:" + docToolbarV2);
            if (docToolbarV2 != null) {
                docToolbarV2.initFromJsBridge(ToolbarPrimaryItemId.values());
            }
            SDKToolbarV2PanelPlugin.this.callBackFunction = hVar;
            if (SDKToolbarV2PanelPlugin.this.toolbarViewModel != null) {
                AbstractC7616f<DocToolbarV2> fVar = SDKToolbarV2PanelPlugin.this.toolbarViewModel;
                if (docToolbarV2 == null || docToolbarV2.getItems() == null || docToolbarV2.getItems().length == 0) {
                    docToolbarV2 = null;
                }
                fVar.updateToolbar(docToolbarV2);
            }
        }

        /* renamed from: a */
        public <V> void mo35567a(ItemIdV2 itemIdV2, V v, int i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", (Object) itemIdV2);
            jSONObject.put("value", (Object) v);
            jSONObject.put("level", (Object) Integer.valueOf(i));
            C13479a.m54764b("SDKToolbarV2PanelPlugin", jSONObject.toString());
            if (SDKToolbarV2PanelPlugin.this.callBackFunction != null) {
                SDKToolbarV2PanelPlugin.this.callBackFunction.mo17188a(jSONObject);
            }
        }
    }

    public void onDetachFromHost(C9344a aVar) {
        super.onDetachFromHost((C4943e) aVar);
        this.toolbarViewModel.onDetachFromHost();
    }

    public /* synthetic */ void lambda$new$0$SDKToolbarV2PanelPlugin(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            C13479a.m54764b("SDKToolbarV2PanelPlugin", "ensureToolbarFragment");
            ensureToolbarFragment();
            return;
        }
        C13479a.m54764b("SDKToolbarV2PanelPlugin", "removeToolbarFragment");
        getUIContainer().mo19597c(this);
    }

    public void onAttachToHost(C9344a aVar) {
        super.onAttachToHost((C4943e) aVar);
        this.handler = new C9320a();
        ((C9344a) getHost()).mo19448b().mo19431a("biz.navigation.setDocToolbarV2", (AbstractC7945d) this.handler);
        this.toolbarViewModel = (AbstractC7616f) C4950k.m20478a(aVar, C7645l.class);
        this.editPanelsManager = aVar.mo19354a();
    }

    public void setToolbarAnimation(int i, int i2) {
        this.toolbarShowAnimation = i;
        this.toolbarHideAnimation = i2;
    }

    public void onDetachFromUIContainer(C9344a aVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4943e) aVar, nVar);
        AbstractC10550f.AbstractC10551a.m43717b(aVar.mo19564f()).mo39928b(this.toolbarViewModel);
        this.toolbarViewModel.onDetachFromUI();
    }

    public void onAttachToUIContainer(C9344a aVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) aVar, nVar);
        this.toolbarViewModel.setDelegate(new AbstractC7616f.AbstractC7617a() {
            /* class com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar2.SDKToolbarV2PanelPlugin.C93191 */

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f.AbstractC7617a
            /* renamed from: a */
            public void mo22152a() {
                SDKToolbarV2PanelPlugin.this.editPanelsManager.requestUpdateWebContentHeight();
            }

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f.AbstractC7617a
            /* renamed from: a */
            public void mo22153a(LifecycleOwner lifecycleOwner, AbstractC1178x xVar) {
                SDKToolbarV2PanelPlugin.this.editPanelsManager.getActiveEditPanel().mo5923a(lifecycleOwner, xVar);
            }

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f.AbstractC7617a
            /* renamed from: a */
            public <V> void mo22154a(ItemIdV2 itemIdV2, V v, int i) {
                SDKToolbarV2PanelPlugin.this.handler.mo35567a(itemIdV2, v, i);
            }
        });
        AbstractC10550f b = AbstractC10550f.AbstractC10551a.m43717b(aVar.mo19564f());
        b.mo39924a(this.toolbarViewModel);
        this.toolbarViewModel.onKeyboardHeightChanged(b, b.mo39934h(), getResources().getConfiguration().orientation);
        this.toolbarViewModel.getActive().mo5923a(getLifecycleOwner(), this.activeObserver);
        this.editPanelsManager.registerEditPanel(getLifecycleOwner(), this.toolbarViewModel);
        this.toolbarViewModel.onAttachToUI(getActivity(), aVar.mo19448b().mo19440c());
    }
}
