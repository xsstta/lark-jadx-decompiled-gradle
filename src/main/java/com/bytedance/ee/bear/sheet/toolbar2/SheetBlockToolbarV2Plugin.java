package com.bytedance.ee.bear.sheet.toolbar2;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.document.toolbar2.BaseToolbarV2Plugin;
import com.bytedance.ee.bear.document.toolbar2.DocToolbarV2JsHandlerPlugin;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7644k;
import com.bytedance.ee.bear.edit.component.toolbar2.ToolBarV2Type;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;

public class SheetBlockToolbarV2Plugin extends BaseToolbarV2Plugin<SheetBlockToolbarV2> implements AbstractC7644k<SheetBlockToolbarV2> {
    private AbstractC7947h callBackFunction;
    public C6215b editPanelsManager;

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7644k
    public int getType() {
        return ToolBarV2Type.Sheet.getValue();
    }

    @Override // com.bytedance.ee.bear.document.toolbar2.BaseToolbarV2Plugin
    public AbstractC7616f<SheetBlockToolbarV2> getToolbarViewModel() {
        return (AbstractC7616f) C4950k.m20476a(this, C11359k.class);
    }

    @Override // com.bytedance.ee.bear.document.toolbar2.BaseToolbarV2Plugin, com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromHost(C4943e eVar) {
        super.onDetachFromHost(eVar);
        ((DocToolbarV2JsHandlerPlugin) findPlugin(DocToolbarV2JsHandlerPlugin.class)).unRegisterHandler(this);
    }

    @Override // com.bytedance.ee.bear.document.toolbar2.BaseToolbarV2Plugin, com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        ((DocToolbarV2JsHandlerPlugin) findPlugin(DocToolbarV2JsHandlerPlugin.class)).registerHandler(this);
        this.toolbarViewModel.setDelegate(new AbstractC7616f.AbstractC7617a() {
            /* class com.bytedance.ee.bear.sheet.toolbar2.SheetBlockToolbarV2Plugin.C113271 */

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f.AbstractC7617a
            /* renamed from: a */
            public void mo22152a() {
                SheetBlockToolbarV2Plugin.this.editPanelsManager.requestUpdateWebContentHeight();
            }

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f.AbstractC7617a
            /* renamed from: a */
            public void mo22153a(LifecycleOwner lifecycleOwner, AbstractC1178x xVar) {
                SheetBlockToolbarV2Plugin.this.editPanelsManager.getActiveEditPanel().mo5923a(lifecycleOwner, xVar);
            }

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f.AbstractC7617a
            /* renamed from: a */
            public <V> void mo22154a(ItemIdV2 itemIdV2, V v, int i) {
                SheetBlockToolbarV2Plugin.this.onToolbarItemClick(itemIdV2, v, i);
            }
        });
    }

    @Override // com.bytedance.ee.bear.document.toolbar2.BaseToolbarV2Plugin, com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
        C6215b bVar = (C6215b) aj.m5366a(getActivity()).mo6005a(C6215b.class);
        this.editPanelsManager = bVar;
        bVar.registerEditPanel(getLifecycleOwner(), this.toolbarViewModel);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar2.BaseToolbarV2Plugin
    public Fragment onCreateToolbarFragment(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        return instantiateFragment(C11356j.class, bundle);
    }

    public void handle(SheetBlockToolbarV2 sheetBlockToolbarV2, AbstractC7947h hVar) {
        C13479a.m54772d("SheetBlockToolbarV2Plugin", "sheet Js update toolbar:" + sheetBlockToolbarV2);
        if (sheetBlockToolbarV2 != null) {
            sheetBlockToolbarV2.initFromJsBridge(SheetBlockPrimaryItemId.values());
            sheetBlockToolbarV2.setUrl(C6313i.m25327a().mo25399g(getEditorAbility().mo24602q().getUrl()));
            sheetBlockToolbarV2.parseSegments();
            if (sheetBlockToolbarV2.getInput() != null) {
                ((C11359k) getToolbarViewModel()).setSegment(sheetBlockToolbarV2.getInput().getSegments());
            }
        }
        this.callBackFunction = hVar;
        if (sheetBlockToolbarV2 == null || sheetBlockToolbarV2.getItems() == null || sheetBlockToolbarV2.getItems().length == 0) {
            sheetBlockToolbarV2 = null;
        }
        updateToolbar(sheetBlockToolbarV2);
    }

    public <V> void onToolbarItemClick(ItemIdV2 itemIdV2, V v, int i) {
        callBackFunction(this.callBackFunction, itemIdV2.name(), v, i);
    }
}
