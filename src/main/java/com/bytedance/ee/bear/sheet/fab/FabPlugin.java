package com.bytedance.ee.bear.sheet.fab;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.sheet.fab.C11143b;
import com.bytedance.ee.bear.sheet.fab.FabItem;
import com.bytedance.ee.bear.sheet.fab.FabPlugin;
import com.bytedance.ee.log.C13479a;
import java.util.Map;

public class FabPlugin extends DocumentPlugin {
    public C11143b mFabViewModel;

    public void hideFloatActionBottom() {
        removeFragment();
    }

    public void ensureFabFragment() {
        if (getUIContainer().mo19586a((AbstractC4941c) this) == null) {
            addOrReplaceFragment(C11140a.class);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.sheet.fab.FabPlugin$a */
    public class C11139a implements AbstractC7945d<FabItem> {
        private C11139a() {
        }

        /* renamed from: a */
        public void handle(FabItem fabItem, AbstractC7947h hVar) {
            C13479a.m54772d("FabPlugin", "handle: fab = " + fabItem);
            if (fabItem == null || fabItem.getData() == null || fabItem.getData().length == 0) {
                FabPlugin.this.hideFloatActionBottom();
                return;
            }
            FabPlugin.this.ensureFabFragment();
            FabPlugin.this.mFabViewModel.updateItems(fabItem.getData());
            FabPlugin.this.mFabViewModel.setDelegate(new C11143b.AbstractC11144a() {
                /* class com.bytedance.ee.bear.sheet.fab.$$Lambda$FabPlugin$a$QqdY0boqd1fyMzXAcxn2pPr8Pfc */

                @Override // com.bytedance.ee.bear.sheet.fab.C11143b.AbstractC11144a
                public final void onToolbarItemClick(String str, String str2) {
                    FabPlugin.C11139a.m46364a(AbstractC7947h.this, str, str2);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m46364a(AbstractC7947h hVar, String str, String str2) {
            if (hVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", (Object) str);
                jSONObject.put("value", (Object) str2);
                hVar.mo17188a(jSONObject);
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.sheet.setFabButtons", new C11139a());
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        this.mFabViewModel = (C11143b) viewModel(C11143b.class);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        this.mFabViewModel.updateItems(new FabItem.FabSheetItem[0]);
    }
}
