package com.bytedance.ee.bear.document.selection;

import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.view.DecorateWebViewV2;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.C26326z;
import org.json.JSONObject;

public class SelectionPluginNew extends SelectionPlugin {
    public AbstractView$OnTouchListenerC6130e newWebSelection;

    @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
    public void clearSelection() {
        this.newWebSelection.mo24730h();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
    public void closeActionMode() {
        this.newWebSelection.closeActionMode();
    }

    private void setEnableTextIntentItems() {
        this.newWebSelection.mo24721a(shouldEnableTextIntentItems());
    }

    @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
    public boolean isShowingActionMode() {
        if (this.newWebSelection.f17045c != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
    public void setSelectionScrollEndRate(float f) {
        this.newWebSelection.mo24716a(f);
    }

    public boolean parseSelectionChangeData(String str) {
        if (str == null) {
            return false;
        }
        try {
            return new JSONObject(str).optBoolean("hasRange", false);
        } catch (Throwable th) {
            C13479a.m54759a("SelectionPluginNew", "parseSelectionChangeData", th);
            return false;
        }
    }

    @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(sVar, nVar);
        AbstractC10550f.AbstractC10551a.m43717b(sVar.mo19564f()).mo39928b(this.newWebSelection);
        this.newWebSelection.mo24722b();
        AbstractC4931i b = sVar.mo19448b();
        b.mo19436b(this.newWebSelection);
        ((DocBridgeWebViewV2) b.mo19435b()).mo19619b((DecorateWebViewV2.AbstractC4961a) this.newWebSelection);
    }

    @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        AbstractView$OnTouchListenerC6130e eVar;
        super.onAttachToUIContainer(sVar, nVar);
        AbstractC4931i b = sVar.mo19448b();
        DocBridgeWebViewV2 docBridgeWebViewV2 = (DocBridgeWebViewV2) b.mo19435b();
        if (C26326z.m95340d()) {
            eVar = new C6136f(C5234y.m21391b());
        } else {
            eVar = new C6140g(sVar, C5234y.m21391b());
        }
        this.newWebSelection = eVar;
        eVar.mo24723b(getActionModeDelegate());
        AbstractC10550f.AbstractC10551a.m43717b(sVar.mo19564f()).mo39924a(this.newWebSelection);
        this.newWebSelection.mo24719a(docBridgeWebViewV2);
        b.mo19422a(this.newWebSelection);
        setEnableTextIntentItems();
        docBridgeWebViewV2.mo19617a((DecorateWebViewV2.AbstractC4961a) this.newWebSelection);
        bindBridgeHandler("biz.selection.onSelectionChangedV2", new AbstractC7945d<String>() {
            /* class com.bytedance.ee.bear.document.selection.SelectionPluginNew.C61141 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                SelectionPluginNew.this.newWebSelection.onSelectionChanged(SelectionPluginNew.this.parseSelectionChangeData(str));
            }
        });
        bindBridgeHandler("biz.navigation.showCustomContextMenu", new AbstractC7945d<String>() {
            /* class com.bytedance.ee.bear.document.selection.SelectionPluginNew.C61152 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                SelectionPluginNew.this.newWebSelection.showActionMode(str);
            }
        });
        bindBridgeHandler("biz.navigation.closeCustomContextMenu", new AbstractC7945d<String>() {
            /* class com.bytedance.ee.bear.document.selection.SelectionPluginNew.C61163 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                SelectionPluginNew.this.newWebSelection.closeActionMode();
            }
        });
        bindJSHandler("biz.selection.hideSelectionHandler", new AbstractC7945d<String>() {
            /* class com.bytedance.ee.bear.document.selection.SelectionPluginNew.C61174 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                SelectionPluginNew.this.newWebSelection.mo24732j();
            }
        });
    }
}
