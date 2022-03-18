package com.bytedance.ee.bear.middleground.docsdk.v2;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.doc.toolbar.C5546d;
import com.bytedance.ee.bear.doc.toolbar.DocItemId;
import com.bytedance.ee.bear.doc.toolbar.DocToolbar;
import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar.DocSDKBaseToolbarPlugin;
import com.bytedance.ee.bear.middleground.docsdk.v2.core.C9344a;
import com.bytedance.ee.bear.middleground.docsdk.v2.p451a.C9339a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.Map;

/* access modifiers changed from: package-private */
public class SDKV2ToolbarPlugin extends DocSDKBaseToolbarPlugin<DocToolbar> {
    @Override // com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar.DocSDKBaseToolbarPlugin
    public String getToolbarJSBinderName() {
        return "biz.navigation.setToolBar";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar.DocSDKBaseToolbarPlugin
    public DocSDKBaseToolbarPlugin.AbstractC9317a<DocToolbar> onCreateToolbarJSHandler() {
        return new C9337a();
    }

    public SDKV2ToolbarPlugin() {
        setToolbarAnimation(R.anim.doc_sdk_toolbar_fade_in, R.anim.doc_sdk_toolbar_fade_out);
    }

    /* renamed from: com.bytedance.ee.bear.middleground.docsdk.v2.SDKV2ToolbarPlugin$a */
    private class C9337a implements DocSDKBaseToolbarPlugin.AbstractC9317a<DocToolbar> {

        /* renamed from: b */
        private AbstractC7947h f25089b;

        private C9337a() {
        }

        /* renamed from: a */
        public void handle(DocToolbar docToolbar, AbstractC7947h hVar) {
            C13479a.m54772d("SDKV2ToolbarPlugin", "Js update toolbar:" + docToolbar);
            if (docToolbar != null) {
                docToolbar.initFromJsBridge(DocItemId.values());
            }
            this.f25089b = hVar;
            SDKV2ToolbarPlugin sDKV2ToolbarPlugin = SDKV2ToolbarPlugin.this;
            if (docToolbar == null || docToolbar.getChildren().length == 0) {
                docToolbar = null;
            }
            sDKV2ToolbarPlugin.updateToolbar(docToolbar);
        }

        @Override // com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar.DocSDKBaseToolbarPlugin.AbstractC9317a
        /* renamed from: a */
        public void mo35557a(ItemId itemId, String str) {
            if (this.f25089b != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", (Object) itemId.name());
                jSONObject.put("value", (Object) str);
                C13479a.m54772d("SDKV2ToolbarPlugin", jSONObject.toString());
                this.f25089b.mo17188a(jSONObject);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar.DocSDKBaseToolbarPlugin
    public void ensureToolbarFragment(boolean z) {
        if (getUIContainer().mo19595b(this)) {
            super.ensureToolbarFragment(true);
        } else {
            super.ensureToolbarFragment(z);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar.DocSDKBaseToolbarPlugin
    public AbstractC6212e<DocToolbar> getToolbarViewModel(FragmentActivity fragmentActivity) {
        AbstractC6212e<DocToolbar> eVar = (AbstractC6212e) C4950k.m20476a(this, C5546d.class);
        C13479a.m54764b("SDKV2ToolbarPlugin", "view model = " + eVar.hashCode());
        return eVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar.DocSDKBaseToolbarPlugin
    public Fragment onCreateToolbarFragment(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        return instantiateFragment(C9339a.class, bundle);
    }

    @Override // com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar.DocSDKBaseToolbarPlugin
    public void onDetachFromUIContainer(C9344a aVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(aVar, nVar);
        this.toolbarViewModel.setActive(false);
    }
}
