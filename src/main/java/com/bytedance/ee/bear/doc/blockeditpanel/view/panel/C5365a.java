package com.bytedance.ee.bear.doc.blockeditpanel.view.panel;

import android.content.Context;
import com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId;
import com.bytedance.ee.bear.doc.blockeditpanel.view.panel.blockmenu.BlockMenuPanel;
import com.bytedance.ee.bear.doc.blockeditpanel.view.panel.highlight.HighlightPanel;
import com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.ToolbarMenuPanel;

/* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.panel.a */
public class C5365a {

    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.panel.a$1 */
    static /* synthetic */ class C53661 {

        /* renamed from: a */
        static final /* synthetic */ int[] f15300a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId[] r0 = com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.doc.blockeditpanel.view.panel.C5365a.C53661.f15300a = r0
                com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId r1 = com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId.blockMenuPanel     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.doc.blockeditpanel.view.panel.C5365a.C53661.f15300a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId r1 = com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId.alignMenuPanel     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.doc.blockeditpanel.view.panel.C5365a.C53661.f15300a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId r1 = com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId.visionMenuPanel     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.doc.blockeditpanel.view.panel.C5365a.C53661.f15300a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId r1 = com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId.toolBarMenuPanel     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.bear.doc.blockeditpanel.view.panel.C5365a.C53661.f15300a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId r1 = com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId.highlightPanel     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.bytedance.ee.bear.doc.blockeditpanel.view.panel.C5365a.C53661.f15300a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId r1 = com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId.reactionPanel     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.doc.blockeditpanel.view.panel.C5365a.C53661.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static BaseBlockEditPanel m21858a(EMenuPanelId eMenuPanelId, Context context) {
        int i = C53661.f15300a[eMenuPanelId.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new BlockMenuPanel(context);
        }
        if (i == 4) {
            return new ToolbarMenuPanel(context);
        }
        if (i != 5) {
            return null;
        }
        return new HighlightPanel(context);
    }
}
