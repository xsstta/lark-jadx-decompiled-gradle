package com.bytedance.ee.bear.doc.toolbar2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.model.toolbar.DocToolbarV2;
import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId;
import com.bytedance.ee.bear.document.toolbar.C6218f;
import com.bytedance.ee.bear.document.toolbar.NavBarBottomInsetCompatEntity;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.document.toolbar2.BaseToolbarV2Plugin;
import com.bytedance.ee.bear.document.toolbar2.DocToolbarV2JsHandlerPlugin;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7644k;
import com.bytedance.ee.bear.edit.component.toolbar2.C7645l;
import com.bytedance.ee.bear.edit.component.toolbar2.DocToolbarV2Compat;
import com.bytedance.ee.bear.edit.component.toolbar2.ToolBarV2Type;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;

public class DocToolbarV2Plugin extends BaseToolbarV2Plugin<DocToolbarV2> implements AbstractC7644k<DocToolbarV2> {
    private AbstractC7947h callBackFunction;
    public C6215b editPanelsManager;

    public void close() {
        updateToolbar(null);
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7644k
    public int getType() {
        return ToolBarV2Type.Doc.getValue();
    }

    @Override // com.bytedance.ee.bear.document.toolbar2.BaseToolbarV2Plugin
    public AbstractC7616f<DocToolbarV2> getToolbarViewModel() {
        return (AbstractC7616f) C4950k.m20478a(getHost(), C7645l.class);
    }

    @Override // com.bytedance.ee.bear.document.toolbar2.BaseToolbarV2Plugin, com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromHost(C4943e eVar) {
        super.onDetachFromHost(eVar);
        ((DocToolbarV2JsHandlerPlugin) findPlugin(DocToolbarV2JsHandlerPlugin.class)).unRegisterHandler(this);
    }

    @Override // com.bytedance.ee.bear.document.toolbar2.BaseToolbarV2Plugin, com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        C6218f.m25065a().mo25153a(getActivity(), (NavBarBottomInsetCompatEntity) C4211a.m17514a().mo16532a("doc_toolbar_android_compat", NavBarBottomInsetCompatEntity.class, new NavBarBottomInsetCompatEntity()));
        C6215b bVar = (C6215b) aj.m5366a(getActivity()).mo6005a(C6215b.class);
        this.editPanelsManager = bVar;
        bVar.registerEditPanel(getLifecycleOwner(), this.toolbarViewModel);
        ((DocToolbarV2JsHandlerPlugin) findPlugin(DocToolbarV2JsHandlerPlugin.class)).registerHandler(this);
        this.toolbarViewModel.setDelegate(new AbstractC7616f.AbstractC7617a() {
            /* class com.bytedance.ee.bear.doc.toolbar2.DocToolbarV2Plugin.C55481 */

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f.AbstractC7617a
            /* renamed from: a */
            public void mo22152a() {
                DocToolbarV2Plugin.this.editPanelsManager.requestUpdateWebContentHeight();
            }

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f.AbstractC7617a
            /* renamed from: a */
            public void mo22153a(LifecycleOwner lifecycleOwner, AbstractC1178x xVar) {
                DocToolbarV2Plugin.this.editPanelsManager.getActiveEditPanel().mo5923a(lifecycleOwner, xVar);
            }

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f.AbstractC7617a
            /* renamed from: a */
            public <V> void mo22154a(ItemIdV2 itemIdV2, V v, int i) {
                DocToolbarV2Plugin.this.onToolbarItemClick(itemIdV2, v, i);
            }
        });
    }

    @Override // com.bytedance.ee.bear.document.toolbar2.BaseToolbarV2Plugin, com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(eVar, nVar);
        DocToolbarV2Compat.of(getActivity()).detach(eVar);
    }

    @Override // com.bytedance.ee.bear.document.toolbar2.BaseToolbarV2Plugin, com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
        AbstractC7624i of = DocToolbarV2Compat.of(getActivity());
        of.attach(eVar, new AbstractC7624i.AbstractC7625a() {
            /* class com.bytedance.ee.bear.doc.toolbar2.DocToolbarV2Plugin.C55492 */

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i.AbstractC7625a
            /* renamed from: b */
            public void mo22157b() {
                DocToolbarV2Plugin.this.toolbarViewModel.hideToolbar();
            }

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i.AbstractC7625a
            /* renamed from: c */
            public void mo22159c() {
                DocToolbarV2Plugin.this.editPanelsManager.requestUpdateWebContentHeight();
            }

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i.AbstractC7625a
            /* renamed from: a */
            public boolean mo22155a() {
                return DocToolbarV2Plugin.this.toolbarViewModel.hasToolbarV2();
            }

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i.AbstractC7625a
            /* renamed from: d */
            public void mo22160d() {
                if (DocToolbarV2Plugin.this.toolbarViewModel.hasToolbarV2()) {
                    DocToolbarV2Plugin.this.editPanelsManager.forceCloseToolbarV2();
                }
            }

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i.AbstractC7625a
            /* renamed from: a */
            public boolean mo22156a(String str) {
                return DocToolbarV2Plugin.this.toolbarViewModel.isLastShowingId(str);
            }

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i.AbstractC7625a
            /* renamed from: b */
            public boolean mo22158b(String str) {
                if (str == null || !TextUtils.equals(DocToolbarV2Plugin.this.toolbarViewModel.getShowingItemId(), str)) {
                    return false;
                }
                return true;
            }
        });
        this.editPanelsManager.setDocToolbarV2Compat(of);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar2.BaseToolbarV2Plugin
    public Fragment onCreateToolbarFragment(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        return instantiateFragment(C5552c.class, bundle);
    }

    public void handle(DocToolbarV2 docToolbarV2, AbstractC7947h hVar) {
        C13479a.m54772d("ToolbarV2", "Js update toolbar:" + docToolbarV2);
        if (docToolbarV2 != null) {
            docToolbarV2.initFromJsBridge(ToolbarPrimaryItemId.values());
        }
        this.callBackFunction = hVar;
        if (docToolbarV2 == null || docToolbarV2.getItems() == null || docToolbarV2.getItems().length == 0) {
            docToolbarV2 = null;
        }
        updateToolbar(docToolbarV2);
    }

    public <V> void onToolbarItemClick(ItemIdV2 itemIdV2, V v, int i) {
        callBackFunction(this.callBackFunction, itemIdV2.name(), v, i);
    }
}
