package com.bytedance.ee.bear.document.selection;

import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.view.AbstractC4964b;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;

/* access modifiers changed from: package-private */
public class SelectionPluginOld extends SelectionPlugin {
    private static final String[] IS_MINDNOTE_SPECIAL = {C8275a.f22374g.mo32553a()};
    private static final String[] SUPPORT_CUSTOM_SELECTION_TYPES = {C8275a.f22371d.mo32553a(), C8275a.f22372e.mo32553a(), C8275a.f22374g.mo32553a(), C8275a.f22377j.mo32553a()};
    private static final String[] SUPPORT_DOUBLE_TAP_TYPES = {C8275a.f22371d.mo32553a(), C8275a.f22372e.mo32553a(), C8275a.f22374g.mo32553a(), C8275a.f22377j.mo32553a()};
    private static final String[] SUPPORT_LONG_PRESS_TYPES = {C8275a.f22371d.mo32553a(), C8275a.f22372e.mo32553a(), C8275a.f22377j.mo32553a()};
    private static final String[] SUPPORT_SINGLE_TAP_TYPES = {C8275a.f22371d.mo32553a(), C8275a.f22372e.mo32553a(), C8275a.f22374g.mo32553a(), C8275a.f22377j.mo32553a()};
    private static final String[] SUPPORT_SLIDE_TYPES = {C8275a.f22371d.mo32553a(), C8275a.f22377j.mo32553a()};
    public C6142h webSelectionLayer;

    static /* synthetic */ void lambda$setupCustomSelection$0(String str, AbstractC7947h hVar) {
    }

    @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
    public void clearSelection() {
    }

    SelectionPluginOld() {
    }

    @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
    public void closeActionMode() {
        ensureWebSelectionLayer().mo24780e();
    }

    @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
    public boolean isShowingActionMode() {
        if (ensureWebSelectionLayer().f17117h != null) {
            return true;
        }
        return false;
    }

    private C6142h ensureWebSelectionLayer() {
        if (this.webSelectionLayer == null) {
            this.webSelectionLayer = new C6142h(C5234y.m21391b());
            ((DocBridgeWebViewV2) getWeb().mo19435b()).mo19618a((AbstractC4964b) this.webSelectionLayer);
            this.webSelectionLayer.mo24773b(getActionModeDelegate());
        }
        return this.webSelectionLayer;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
    public void setSelectionScrollEndRate(float f) {
        ensureWebSelectionLayer().mo24769a(f);
    }

    private void setEnableTextIntentItems(Boolean bool) {
        this.webSelectionLayer.mo24783g(bool.booleanValue());
    }

    private boolean shouldEnableCustomSelection(String str) {
        if (!containsType(SUPPORT_CUSTOM_SELECTION_TYPES, str)) {
            return false;
        }
        return C6142h.m24800c();
    }

    private void updateCustomSelectionConfig(String str) {
        this.webSelectionLayer.mo24768a(shouldEnableCustomSelection(str)).mo24772b(containsType(SUPPORT_SLIDE_TYPES, str)).mo24778d(containsType(SUPPORT_SINGLE_TAP_TYPES, str)).mo24779e(containsType(SUPPORT_DOUBLE_TAP_TYPES, str)).mo24775c(containsType(SUPPORT_LONG_PRESS_TYPES, str)).mo24781f(containsType(IS_MINDNOTE_SPECIAL, str));
    }

    private static boolean containsType(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(sVar, nVar);
        DocBridgeWebViewV2 docBridgeWebViewV2 = (DocBridgeWebViewV2) sVar.mo19448b().mo19435b();
        docBridgeWebViewV2.mo19620b((AbstractC4964b) this.webSelectionLayer);
        docBridgeWebViewV2.mo22339b((DocBridgeWebViewV2.AbstractC5605c) this.webSelectionLayer);
        this.webSelectionLayer = null;
    }

    private void setupCustomSelection(DocBridgeWebViewV2 docBridgeWebViewV2, String str) {
        docBridgeWebViewV2.mo22327a((DocBridgeWebViewV2.AbstractC5605c) this.webSelectionLayer);
        bindBridgeHandlerAutoUnbind("biz.selection.isEnableCustomSelection", $$Lambda$SelectionPluginOld$mqpI72pBPzC4HQs8yXi5TkhOfZo.INSTANCE);
        bindBridgeHandlerAutoUnbind("biz.selection.onSelectionChanged", new AbstractC7945d<String>() {
            /* class com.bytedance.ee.bear.document.selection.SelectionPluginOld.C61181 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                SelectionPluginOld.this.webSelectionLayer.mo24774b(str);
            }
        });
        bindBridgeHandlerAutoUnbind("biz.navigation.showCustomContextMenu", new AbstractC7945d<String>() {
            /* class com.bytedance.ee.bear.document.selection.SelectionPluginOld.C61192 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                SelectionPluginOld.this.webSelectionLayer.mo24770a(str);
            }
        });
        bindBridgeHandlerAutoUnbind("biz.navigation.closeCustomContextMenu", new AbstractC7945d<String>() {
            /* class com.bytedance.ee.bear.document.selection.SelectionPluginOld.C61203 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                SelectionPluginOld.this.webSelectionLayer.mo24780e();
            }
        });
    }

    @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(sVar, nVar);
        ensureWebSelectionLayer();
        String documentType = sVar.mo24598m().getDocumentType();
        setupCustomSelection((DocBridgeWebViewV2) sVar.mo19448b().mo19435b(), documentType);
        updateCustomSelectionConfig(documentType);
        setEnableTextIntentItems(Boolean.valueOf(shouldEnableTextIntentItems()));
    }
}
