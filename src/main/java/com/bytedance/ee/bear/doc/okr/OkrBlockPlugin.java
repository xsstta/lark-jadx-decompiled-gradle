package com.bytedance.ee.bear.doc.okr;

import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.bear.document.toolbar2.DocToolbarV2JsHandlerPlugin;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7644k;
import com.bytedance.ee.bear.edit.component.toolbar2.ToolBarV2Type;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;

public class OkrBlockPlugin extends DocumentPlugin implements AbstractC7644k<OkrToolbar> {
    public <V> void onToolbarItemClick(ItemIdV2 itemIdV2, V v, int i) {
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7644k
    public int getType() {
        return ToolBarV2Type.OKR.getValue();
    }

    public C5445a getOkrViewModel() {
        return (C5445a) viewModel(C5445a.class);
    }

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        AbstractC10550f.AbstractC10551a.m43717b(sVar.mo19564f()).mo39928b(getOkrViewModel());
        ((DocToolbarV2JsHandlerPlugin) findPlugin(DocToolbarV2JsHandlerPlugin.class)).unRegisterHandler(this);
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        C5445a okrViewModel = getOkrViewModel();
        sVar.mo24599n().registerEditPanel(sVar.mo19566h(), okrViewModel);
        AbstractC10550f.AbstractC10551a.m43717b(sVar.mo19564f()).mo39924a(okrViewModel);
        ((DocToolbarV2JsHandlerPlugin) findPlugin(DocToolbarV2JsHandlerPlugin.class)).registerHandler(this);
    }

    public void handle(OkrToolbar okrToolbar, AbstractC7947h hVar) {
        boolean z;
        C13479a.m54764b("OkrBlockPlugin", "OkrBlockPlugin data " + okrToolbar);
        C5445a okrViewModel = getOkrViewModel();
        if (okrToolbar != null) {
            z = true;
        } else {
            z = false;
        }
        okrViewModel.setActive(z);
    }
}
