package com.bytedance.ee.bear.doc.toolbar;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;

public class DocumentToolbarPlugin extends BaseToolbarPlugin<DocToolbar> {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin
    public String getToolbarJSBinderName() {
        return "biz.navigation.setDocToolbar";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin
    public BaseToolbarPlugin.AbstractC6202a<DocToolbar> onCreateToolbarJSHandler() {
        return new C5540a();
    }

    /* renamed from: com.bytedance.ee.bear.doc.toolbar.DocumentToolbarPlugin$a */
    private class C5540a implements BaseToolbarPlugin.AbstractC6202a<DocToolbar> {

        /* renamed from: b */
        private AbstractC7947h f15765b;

        private C5540a() {
        }

        /* renamed from: a */
        public void handle(DocToolbar docToolbar, AbstractC7947h hVar) {
            C13479a.m54772d("DocToolbarPlugin", "Js update toolbar:" + docToolbar);
            if (docToolbar != null) {
                docToolbar.initFromJsBridge(DocItemId.values());
            }
            this.f15765b = hVar;
            DocumentToolbarPlugin documentToolbarPlugin = DocumentToolbarPlugin.this;
            if (docToolbar == null || docToolbar.getChildren().length == 0) {
                docToolbar = null;
            }
            documentToolbarPlugin.updateToolbar(docToolbar);
        }

        @Override // com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin.AbstractC6202a
        /* renamed from: a */
        public void mo22125a(ItemId itemId, String str) {
            if (this.f15765b != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", (Object) itemId.name());
                jSONObject.put("value", (Object) str);
                C13479a.m54772d("DocToolbarPlugin", jSONObject.toString());
                this.f15765b.mo17188a(jSONObject);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin
    public AbstractC6212e<DocToolbar> getToolbarViewModel(FragmentActivity fragmentActivity) {
        return (AbstractC6212e) aj.m5366a(fragmentActivity).mo6005a(C5546d.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin
    public Fragment onCreateToolbarFragment(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        return instantiateFragment(C5545c.class, bundle);
    }
}
