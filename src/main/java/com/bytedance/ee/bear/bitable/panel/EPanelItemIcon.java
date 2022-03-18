package com.bytedance.ee.bear.bitable.panel;

import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Map;

public enum EPanelItemIcon {
    SELECT("select", R.drawable.icon_panel_checkbox_selected, R.color.primary_pri_500, R.drawable.icon_panel_checkbox_noselected, 0),
    GRID("grid", R.drawable.ud_icon_bitablegrid_outlined, R.color.primary_pri_500, R.drawable.ud_icon_bitablegrid_outlined, R.color.icon_n1),
    KANBAN("kanban", R.drawable.ud_icon_bitablekanban_outlined, R.color.primary_pri_500, R.drawable.ud_icon_bitablekanban_outlined, R.color.icon_n1),
    GALLEERY("gallery", R.drawable.ud_icon_bitablegallery_outlined, R.color.primary_pri_500, R.drawable.ud_icon_bitablegallery_outlined, R.color.icon_n1),
    GANTT("gantt", R.drawable.ud_icon_bitablegantt_outlined, R.color.primary_pri_500, R.drawable.ud_icon_bitablegantt_outlined, R.color.icon_n1),
    FORM("form", R.drawable.ud_icon_bitableform_outlined, R.color.primary_pri_500, R.drawable.ud_icon_bitableform_outlined, R.color.icon_n1),
    COPY("copy", R.drawable.ud_icon_copy_outlined, R.color.icon_n1),
    RENAME("rename", R.drawable.ud_icon_rename_outlined, R.color.icon_n1),
    DELETE("delete", R.drawable.ud_icon_delete_trash_outlined, R.color.icon_n1),
    CREATE("create", R.drawable.ud_icon_add_outlined, R.color.icon_n1, R.drawable.ud_icon_add_outlined, R.color.icon_n1),
    BITABLE_TABLE("BITABLE_TABLE", R.drawable.ud_icon_sheet_bitable_outlined, R.color.icon_n1, R.drawable.ud_icon_sheet_bitable_outlined, R.color.icon_n1),
    DASHBOARD("DASHBOARD", R.drawable.ud_icon_burnlife_notime_outlined, R.color.icon_n1, R.drawable.ud_icon_burnlife_notime_outlined, R.color.icon_n1),
    UNKNOWN("unknown", R.drawable.ud_icon_bitableunknow_outlined, R.color.primary_pri_500, R.drawable.ud_icon_bitableunknow_outlined, R.color.icon_n1);
    
    private static Map<String, EPanelItemIcon> sPanelItemIconMap = new HashMap();
    public int activeImageRes;
    public int activeImageTintRes;
    public String id;
    public int inactiveImageRes;
    public int inactiveImageTintRes;

    static {
        EPanelItemIcon[] values = values();
        for (EPanelItemIcon ePanelItemIcon : values) {
            sPanelItemIconMap.put(ePanelItemIcon.id, ePanelItemIcon);
        }
    }

    public static EPanelItemIcon getEPanelItemIconById(String str) {
        EPanelItemIcon ePanelItemIcon = sPanelItemIconMap.get(str);
        if (ePanelItemIcon != null) {
            return ePanelItemIcon;
        }
        return UNKNOWN;
    }

    private EPanelItemIcon(String str, int i, int i2) {
        this(str, i, i2, i, i2);
    }

    private EPanelItemIcon(String str, int i, int i2, int i3, int i4) {
        this.id = str;
        this.activeImageRes = i;
        this.activeImageTintRes = i2;
        this.inactiveImageRes = i3;
        this.inactiveImageTintRes = i4;
    }
}
