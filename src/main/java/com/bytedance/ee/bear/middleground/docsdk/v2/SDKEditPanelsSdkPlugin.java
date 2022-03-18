package com.bytedance.ee.bear.middleground.docsdk.v2;

import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.middleground.docsdk.v2.core.AbsEditorSdkPlugin;
import com.bytedance.ee.bear.middleground.docsdk.v2.core.C9344a;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;
import java.util.Map;

public class SDKEditPanelsSdkPlugin extends AbsEditorSdkPlugin {
    private C6215b panelsSdkViewModel;

    @Override // com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
    }

    public void onAttachToHost(C9344a aVar) {
        super.onAttachToHost((C4943e) aVar);
        C6215b a = aVar.mo19354a();
        this.panelsSdkViewModel = a;
        a.attachBridge(aVar.mo19448b().mo19440c());
    }

    public void onAttachToUIContainer(C9344a aVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) aVar, nVar);
        this.panelsSdkViewModel.setContentView(getWeb().mo19435b());
        AbstractC10550f.AbstractC10551a.m43717b(aVar.mo19564f()).mo39924a(this.panelsSdkViewModel);
        C13479a.m54772d("EditPanelsSdkPlugin", "onAttachToUIContainer " + this.panelsSdkViewModel.hashCode());
    }

    public void onDetachFromUIContainer(C9344a aVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) aVar, nVar);
        AbstractC10550f.AbstractC10551a.m43717b(aVar.mo19564f()).mo39928b(this.panelsSdkViewModel);
        this.panelsSdkViewModel.detachBridge(aVar.mo19448b().mo19440c());
        C13479a.m54772d("EditPanelsSdkPlugin", "onDetachFromUIContainer " + this.panelsSdkViewModel.hashCode());
    }
}
