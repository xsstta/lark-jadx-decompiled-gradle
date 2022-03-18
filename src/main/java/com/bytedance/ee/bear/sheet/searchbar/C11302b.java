package com.bytedance.ee.bear.sheet.searchbar;

import com.bytedance.ee.bear.document.comment.C5711a;
import com.bytedance.ee.bear.document.search.C6106b;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.sheet.fab.C11143b;
import com.bytedance.ee.bear.sheet.inputbar.C11219d;
import com.bytedance.ee.bear.sheet.panel.oppanel.C11271b;

/* renamed from: com.bytedance.ee.bear.sheet.searchbar.b */
public class C11302b extends C6106b {
    private boolean shouldExitSearch(AbstractC6214a aVar) {
        if ((aVar instanceof C11143b) || (aVar instanceof C11271b) || (aVar instanceof C11219d) || (aVar instanceof C5711a)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a, com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void onBecomeInactive(C6215b bVar, AbstractC6214a aVar) {
        if (shouldExitSearch(aVar)) {
            setActive(false);
        }
    }
}
