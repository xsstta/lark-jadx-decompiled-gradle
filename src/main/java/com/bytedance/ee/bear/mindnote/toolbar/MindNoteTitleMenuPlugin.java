package com.bytedance.ee.bear.mindnote.toolbar;

import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.menu.C5874b;
import com.bytedance.ee.bear.document.menu.TitleMenuPlugin;
import com.larksuite.suite.R;

public class MindNoteTitleMenuPlugin extends TitleMenuPlugin {
    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        C5874b.m23628a("MINDMAP", (int) R.drawable.ud_icon_mindmap_outlined, (int) R.color.facade_selector_icon_n1);
        C5874b.m23628a("OUTLINE", (int) R.drawable.ud_icon_outline_outlined, (int) R.color.facade_selector_icon_n1);
    }
}
