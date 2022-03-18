package com.bytedance.ee.bear.doc.equation;

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

public class EquationBlockPlugin extends DocumentPlugin implements AbstractC7644k<EquationToolbar> {
    public <V> void onToolbarItemClick(ItemIdV2 itemIdV2, V v, int i) {
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7644k
    public int getType() {
        return ToolBarV2Type.EQUATION.getValue();
    }

    public C5414a getEquationViewModel() {
        return (C5414a) viewModel(C5414a.class);
    }

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        AbstractC10550f.AbstractC10551a.m43717b(sVar.mo19564f()).mo39928b(getEquationViewModel());
        ((DocToolbarV2JsHandlerPlugin) findPlugin(DocToolbarV2JsHandlerPlugin.class)).unRegisterHandler(this);
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        C5414a equationViewModel = getEquationViewModel();
        sVar.mo24599n().registerEditPanel(sVar.mo19566h(), equationViewModel);
        AbstractC10550f.AbstractC10551a.m43717b(sVar.mo19564f()).mo39924a(equationViewModel);
        ((DocToolbarV2JsHandlerPlugin) findPlugin(DocToolbarV2JsHandlerPlugin.class)).registerHandler(this);
    }

    public void handle(EquationToolbar equationToolbar, AbstractC7947h hVar) {
        boolean z;
        C13479a.m54764b("EquationBlockPlugin", "EquationBlockPlugin data " + equationToolbar);
        C5414a equationViewModel = getEquationViewModel();
        if (equationToolbar != null) {
            z = true;
        } else {
            z = false;
        }
        equationViewModel.setActive(z);
    }
}
