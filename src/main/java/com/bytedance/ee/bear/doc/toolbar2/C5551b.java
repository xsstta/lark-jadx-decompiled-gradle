package com.bytedance.ee.bear.doc.toolbar2;

import com.bytedance.ee.bear.browser.plugin.C4943e;

/* renamed from: com.bytedance.ee.bear.doc.toolbar2.b */
public class C5551b implements AbstractC5556d {
    @Override // com.bytedance.ee.bear.doc.toolbar2.AbstractC5556d
    /* renamed from: a */
    public void mo22164a(C4943e eVar) {
        DocToolbarV2Plugin docToolbarV2Plugin = (DocToolbarV2Plugin) eVar.mo19540a(DocToolbarV2Plugin.class);
        if (docToolbarV2Plugin != null) {
            docToolbarV2Plugin.close();
        }
    }
}
