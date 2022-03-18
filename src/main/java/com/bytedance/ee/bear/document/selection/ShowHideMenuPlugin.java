package com.bytedance.ee.bear.document.selection;

import android.webkit.WebView;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import java.util.Map;

public class ShowHideMenuPlugin extends DocumentPlugin {

    /* renamed from: com.bytedance.ee.bear.document.selection.ShowHideMenuPlugin$a */
    private class C6122a implements AbstractC7945d<Void> {
        private C6122a() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            WebView b = ShowHideMenuPlugin.this.getWeb().mo19435b();
            if (b instanceof DocBridgeWebViewV2) {
                ((DocBridgeWebViewV2) b).mo19616a();
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.selection.ShowHideMenuPlugin$b */
    private class C6123b implements AbstractC7945d<Void> {
        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
        }

        private C6123b() {
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.hideContextMenu", new C6122a());
        map.put("biz.util.showContextMenu", new C6123b());
    }
}
