package com.bytedance.ee.bear.doc;

import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.doc.history.HistoryMoreItemV2;
import com.bytedance.ee.bear.doc.p290a.AbstractC5319a;
import com.bytedance.ee.bear.doc.structure.StructureMoreItemV2;
import com.bytedance.ee.bear.doc.structure.StructurePlugin;
import com.bytedance.ee.bear.doc.translate.TranslateMoreItemV2;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;

/* renamed from: com.bytedance.ee.bear.doc.b */
public class C5320b implements AbstractC5319a {
    @Override // com.bytedance.ee.bear.doc.p290a.AbstractC5319a
    /* renamed from: a */
    public BaseMoreItem mo21341a(C4943e eVar) {
        if (eVar instanceof C6095s) {
            return new HistoryMoreItemV2((C6095s) eVar);
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.doc.p290a.AbstractC5319a
    /* renamed from: b */
    public BaseMoreItem mo21343b(C4943e eVar) {
        if (eVar instanceof C6095s) {
            return new TranslateMoreItemV2((C6095s) eVar);
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.doc.p290a.AbstractC5319a
    /* renamed from: c */
    public BaseMoreItem mo21344c(C4943e eVar) {
        if (eVar instanceof C6095s) {
            return new StructureMoreItemV2((C6095s) eVar);
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.doc.p290a.AbstractC5319a
    /* renamed from: a */
    public void mo21342a(C4943e eVar, boolean z) {
        StructurePlugin structurePlugin;
        if ((eVar instanceof C6095s) && (structurePlugin = (StructurePlugin) eVar.mo19540a(StructurePlugin.class)) != null) {
            structurePlugin.getStructureViewModel().floatingStructureVisible().mo5929b(Boolean.valueOf(z));
        }
    }
}
