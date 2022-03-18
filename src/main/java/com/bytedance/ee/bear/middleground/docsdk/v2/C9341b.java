package com.bytedance.ee.bear.middleground.docsdk.v2;

import com.bytedance.ee.bear.atfinder.AbstractC4270e;
import com.bytedance.ee.bear.browser.plugin.AbstractC4948i;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy;
import com.bytedance.ee.bear.edit.component.p378a.C7592a;
import com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar2.SDKToolbarV2PanelPlugin;
import com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar2.insertblock.SDKInsertNewBlockPlugin;
import com.bytedance.ee.util.p707j.C13684a;

/* renamed from: com.bytedance.ee.bear.middleground.docsdk.v2.b */
public class C9341b implements AbstractC4948i {

    /* renamed from: a */
    private AbstractC4270e f25091a;

    /* renamed from: com.bytedance.ee.bear.middleground.docsdk.v2.b$a */
    private enum EnumC9342a {
        Toolbar,
        ToolbarV2,
        At,
        InsertNewBlock
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4948i
    /* renamed from: a */
    public C4946h mo17011a(C4943e eVar) {
        C4946h.C4947a[] aVarArr = new C4946h.C4947a[7];
        boolean z = false;
        aVarArr[0] = C4946h.m20445a(new SDKToolbarV2PanelPlugin(), EnumC9342a.ToolbarV2);
        aVarArr[1] = C4946h.m20446a(new SDKInsertNewBlockPlugin(), EnumC9342a.InsertNewBlock, PluginMountStrategy.LoadFinish);
        aVarArr[2] = C4946h.m20445a(new SDKV2ToolbarPlugin(), EnumC9342a.Toolbar);
        aVarArr[3] = C4946h.m20455b(new SDKSelectColorV2Plugin());
        aVarArr[4] = C4946h.m20455b(new SDKV2SelectImgPlugin());
        aVarArr[5] = C4946h.m20455b(new SDKEditPanelsSdkPlugin());
        SDKV2MentionPlugin sDKV2MentionPlugin = new SDKV2MentionPlugin(this.f25091a);
        EnumC9342a aVar = EnumC9342a.At;
        if (this.f25091a != null) {
            z = true;
        }
        aVarArr[6] = C4946h.m20447a(sDKV2MentionPlugin, aVar, z);
        return C4946h.m20453a(aVarArr);
    }

    public C9341b(AbstractC4270e eVar, C13684a.AbstractC13685a aVar) {
        this.f25091a = eVar;
        if (aVar != null) {
            C7592a.m30457a(aVar);
        }
    }
}
