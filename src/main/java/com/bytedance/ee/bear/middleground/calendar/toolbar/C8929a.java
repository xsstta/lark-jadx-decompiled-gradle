package com.bytedance.ee.bear.middleground.calendar.toolbar;

import com.bytedance.ee.bear.middleground.calendar.toolbar.ToolbarModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.middleground.calendar.toolbar.a */
public class C8929a extends BaseQuickAdapter<ToolbarModel.ToolbarItem, C20923c> {
    public C8929a() {
        super((int) R.layout.calendar_toolbar_item);
    }

    /* renamed from: a */
    private static int m37382a(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1178781136:
                if (str.equals("italic")) {
                    c = 0;
                    break;
                }
                break;
            case -1026963764:
                if (str.equals("underline")) {
                    c = 1;
                    break;
                }
                break;
            case -972521773:
                if (str.equals("strikethrough")) {
                    c = 2;
                    break;
                }
                break;
            case -819190158:
                if (str.equals("unorderedList")) {
                    c = 3;
                    break;
                }
                break;
            case 3029637:
                if (str.equals("bold")) {
                    c = 4;
                    break;
                }
                break;
            case 1023228925:
                if (str.equals("horizontal-line")) {
                    c = 5;
                    break;
                }
                break;
            case 2129993387:
                if (str.equals("orderedList")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return R.drawable.icon_tool_italic;
            case 1:
                return R.drawable.icon_tool_underline;
            case 2:
                return R.drawable.con_tool_horizontalline;
            case 3:
                return R.drawable.icon_tool_disordelist;
            case 4:
                return R.drawable.icon_tool_bold;
            case 5:
                return R.drawable.icon_tool_divider;
            case 6:
                return R.drawable.icon_tool_ordelist;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(C20923c cVar, ToolbarModel.ToolbarItem toolbarItem) {
        cVar.mo70733a(R.id.tool_icon, m37382a(toolbarItem.getId()));
        cVar.itemView.setEnabled(toolbarItem.isEnable());
        cVar.itemView.setSelected(toolbarItem.isSelected());
    }
}
