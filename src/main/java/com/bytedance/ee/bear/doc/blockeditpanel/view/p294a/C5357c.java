package com.bytedance.ee.bear.doc.blockeditpanel.view.p294a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemButtonType;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a.c */
public class C5357c {

    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a.c$1 */
    static /* synthetic */ class C53581 {

        /* renamed from: a */
        static final /* synthetic */ int[] f15280a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 121
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.doc.blockeditpanel.view.p294a.C5357c.C53581.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static AbstractC5354a m21839a(Context context, ViewGroup viewGroup, EMenuItemButtonType eMenuItemButtonType) {
        switch (C53581.f15280a[eMenuItemButtonType.ordinal()]) {
            case 1:
                return new C5356b(LayoutInflater.from(context).inflate(R.layout.doc_block_edit_panel_divider_menu_item, viewGroup, false));
            case 2:
            case 3:
                return new C5359d(LayoutInflater.from(context).inflate(R.layout.doc_block_edit_panel_recyclerview_menu_item, viewGroup, false));
            case 4:
            case 5:
            case 6:
            case 7:
                return new C5361f(LayoutInflater.from(context).inflate(R.layout.doc_block_edit_panel_icon_text_menu_item, viewGroup, false));
            case 8:
            case 9:
                return new C5359d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doc_block_edit_panel_icon_menu_item, viewGroup, false));
            default:
                return new C5361f(LayoutInflater.from(context).inflate(R.layout.doc_block_edit_panel_icon_text_menu_item, viewGroup, false));
        }
    }
}
