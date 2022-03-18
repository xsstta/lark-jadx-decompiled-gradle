package com.bytedance.ee.bear.document.menu;

import android.view.View;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.document.DocumentMetadata;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.document.EditorAbility;
import com.bytedance.ee.bear.document.selection.SelectionPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.log.C13479a;
import java.util.List;
import java.util.Map;

public class TitleMenuPlugin extends DocumentPluginV2 {
    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.navigation.setMenu", new C5871a(getHost(), getDocumentMetadata()));
    }

    /* renamed from: com.bytedance.ee.bear.document.menu.TitleMenuPlugin$a */
    private class C5871a extends AbstractC5872a<MenuData> {
        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.document.menu.AbstractC5872a
        /* renamed from: b */
        public void mo22213b(List<MenuItem> list) {
            super.mo22213b(list);
            DocumentMetadata q = ((EditorAbility) TitleMenuPlugin.this.getHostAbility(EditorAbility.class)).mo24602q();
            if (!q.allowCustomTitleMenu() || q.isAnnounceTemplatePreview()) {
                C13479a.m54764b("TitleMenuPlugin", "Custom title menu disabled");
                return;
            }
            TitleBar titleBar = TitleMenuPlugin.this.getTitleBar();
            if (titleBar != null) {
                titleBar.mo19514a(list, TitleBar.MenuType.Right);
            }
        }

        @Override // com.bytedance.ee.bear.document.menu.AbstractC5872a
        /* renamed from: a */
        public void mo23584a(MenuItem menuItem, View view) {
            super.mo23584a(menuItem, view);
            if ("SHARE".equals(menuItem.getId()) || "MORE_OPERATE".equals(menuItem.getId()) || "MESSAGE".equals(menuItem.getId())) {
                SelectionPlugin selectionPlugin = (SelectionPlugin) TitleMenuPlugin.this.findPlugin(SelectionPlugin.class);
                if (selectionPlugin == null) {
                    C13479a.m54775e("TitleMenuPlugin", "finish action mode failed, selectionPlugin == null");
                    return;
                }
                C13479a.m54772d("TitleMenuPlugin", "clear selection by click title bar");
                selectionPlugin.clearSelection();
            }
        }

        C5871a(C4943e eVar, DocumentMetadata qVar) {
            super(eVar.mo19562e(), qVar);
        }
    }
}
