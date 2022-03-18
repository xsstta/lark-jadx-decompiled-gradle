package com.bytedance.ee.bear.sheet.inputbar.toolbar;

import com.bytedance.ee.bear.sheet.inputbar.subpanel.C11234b;
import com.bytedance.ee.bear.sheet.inputbar.subpanel.C11238c;
import com.bytedance.ee.bear.sheet.inputbar.subpanel.C11242e;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Map;

public enum ToolbarItemEnum {
    text(R.drawable.icon_sheettoolbar_text_nor, true, null),
    number(R.drawable.icon_sheettoolbar_number_nor, true, C11238c.class.getName()),
    editRowInCard(R.drawable.ud_icon_sheet_cardmodel_outlined, false, null),
    date(R.drawable.ud_icon_calendar_outlined, true, C11234b.class.getName()),
    insertImage(R.drawable.ud_icon_image_outlined, true, C11242e.class.getName()),
    checkbox(R.drawable.ud_icon_todo_outlined, false, null),
    mention(R.drawable.ud_icon_at_outlined, false, null),
    addReminder(R.drawable.ud_icon_alarm_clock_outlined, false, null);
    
    private static Map<String, ToolbarItemEnum> sToolbarItemEnumMap = new HashMap();
    public boolean adminLimit;
    public String fragment;
    public int iconRes;
    public boolean selectable;

    static {
        ToolbarItemEnum[] values = values();
        for (ToolbarItemEnum toolbarItemEnum : values) {
            sToolbarItemEnumMap.put(toolbarItemEnum.name(), toolbarItemEnum);
        }
    }

    public static ToolbarItemEnum getToolbarItemEnumByName(String str) {
        ToolbarItemEnum toolbarItemEnum = sToolbarItemEnumMap.get(str);
        if (toolbarItemEnum == null) {
            return text;
        }
        return toolbarItemEnum;
    }

    private ToolbarItemEnum(int i, boolean z, String str) {
        this.iconRes = i;
        this.selectable = z;
        this.fragment = str;
    }
}
