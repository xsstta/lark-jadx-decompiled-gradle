package com.bytedance.ee.bear.sheet.fab;

import com.larksuite.suite.R;

public enum FabItemEnum {
    input(0, R.drawable.ud_icon_keyboard_outlined, R.color.bg_float, R.color.primary_pri_500),
    cardMode(0, R.drawable.ud_icon_sheet_cardmodel_outlined, R.color.bg_float, R.color.primary_pri_500),
    operation(2, R.drawable.ud_icon_style_outlined),
    search(0, R.drawable.ud_icon_find_and_replace_outlined, R.color.bg_float, R.color.primary_pri_500),
    bitableGrid(0, R.drawable.ud_icon_bitablegrid_outlined, R.color.bg_float, R.color.primary_pri_500),
    bitableKanban(0, R.drawable.ud_icon_bitablekanban_outlined, R.color.bg_float, R.color.primary_pri_500),
    kanbanZoomIn(0, R.drawable.ud_icon_zoom_in_outlined, R.color.bg_float, R.color.primary_pri_500),
    kanbanZoomOut(0, R.drawable.ud_icon_zoom_out_outlined, R.color.bg_float, R.color.primary_pri_500),
    createRecord(0, R.drawable.ud_icon_add_outlined, R.color.space_kit_b500, R.color.static_white),
    shareForm(1);
    
    public int colorRes;
    public int imageRes;
    public int imageTintColorRes;
    public int type;

    private FabItemEnum(int i) {
        this(i, 0);
    }

    private FabItemEnum(int i, int i2) {
        this(i, i2, 0);
    }

    private FabItemEnum(int i, int i2, int i3) {
        this(i, i2, i3, 0);
    }

    private FabItemEnum(int i, int i2, int i3, int i4) {
        this.type = i;
        this.imageRes = i2;
        this.colorRes = i3;
        this.imageTintColorRes = i4;
    }
}
