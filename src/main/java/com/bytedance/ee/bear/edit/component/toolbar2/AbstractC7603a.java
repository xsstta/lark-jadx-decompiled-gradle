package com.bytedance.ee.bear.edit.component.toolbar2;

import android.text.TextUtils;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.model.toolbar.DocToolbarV2;
import com.bytedance.ee.bear.document.model.toolbar.ItemV2;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6267j;
import com.bytedance.ee.bear.edit.component.toolbar2.C7618g;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.a */
public abstract class AbstractC7603a extends AbstractC7610d<DocToolbarV2> {
    /* renamed from: a */
    public void mo22162a(String str) {
    }

    /* renamed from: b */
    public void mo22163b(String str) {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d
    /* renamed from: b */
    public AbstractC7605c mo29923b() {
        C7618g gVar = new C7618g(mo29941a((DocToolbarV2) mo22161a().getToolbar().mo5927b()));
        gVar.mo29985a(new C7618g.AbstractC7621b() {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$a$OMvuDM_LtxEXAsgVSUG9lPqR9y0 */

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.C7618g.AbstractC7621b
            public final void onHighlightItemClick(ItemV2 itemV2, boolean z) {
                AbstractC7603a.this.m30488a((AbstractC7603a) itemV2, (ItemV2) z);
            }
        });
        return gVar;
    }

    /* renamed from: c */
    private void m30489c(String str) {
        if (getContext() != null) {
            C6267j jVar = (C6267j) C4950k.m20474a(this, C6267j.class);
            if (TextUtils.equals(str, "#clear")) {
                str = "#ffffff";
            }
            jVar.updateSelectedColor(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29921a(ItemV2 itemV2) {
        String str;
        C6267j jVar = (C6267j) C4950k.m20474a(this, C6267j.class);
        String string = getString(R.string.Doc_Doc_ToolbarHighLight);
        if (TextUtils.equals(itemV2.getValue(), "#clear")) {
            str = "#ffffff";
        } else {
            str = itemV2.getValue();
        }
        C6267j.C6269b bVar = new C6267j.C6269b(string, str, itemV2.getList());
        mo22162a(itemV2.getValue());
        jVar.selectColorCompat(this, bVar, new C6267j.AbstractC6268a(itemV2) {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$a$CJZBO6N6nQZH5ctOf5GqOnX1yRc */
            public final /* synthetic */ ItemV2 f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6267j.AbstractC6268a
            public final void onColorSelected(String str) {
                AbstractC7603a.this.m30487a((AbstractC7603a) this.f$1, (ItemV2) str);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30487a(ItemV2 itemV2, String str) {
        if (TextUtils.equals("#ffffff", str)) {
            str = "#clear";
        }
        m30489c(str);
        super.mo29922a(itemV2, (Object) str);
        mo22163b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30488a(ItemV2 itemV2, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject(itemV2.getValue());
            jSONObject.put("openPanel", z);
            mo29922a(itemV2, (Object) jSONObject.toString());
        } catch (Exception e) {
            C13479a.m54761a("SDKSubToolbarFragment", e);
        }
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d
    /* renamed from: a */
    public <V> void mo29922a(ItemV2 itemV2, V v) {
        if (ToolbarPrimaryItemId.TextTransformSecondaryItemId.oldHighlight.equals(itemV2.id())) {
            mo29921a(itemV2);
        }
        super.mo29922a(itemV2, (Object) v);
    }
}
