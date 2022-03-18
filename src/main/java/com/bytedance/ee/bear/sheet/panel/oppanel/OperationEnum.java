package com.bytedance.ee.bear.sheet.panel.oppanel;

import com.larksuite.suite.R;

public enum OperationEnum {
    deleteRow((int) R.drawable.ud_icon_delete_trash_outlined),
    deleteCol((int) R.drawable.ud_icon_delete_trash_outlined),
    merge((int) R.drawable.ud_icon_mergecells_outlined),
    insertComment((int) R.drawable.ud_icon_add_comment_outlined),
    filter(R.drawable.ud_icon_list_filter_outlined, true),
    freezeSheet(R.drawable.ud_icon_freeze_column_and_row_outlined, true),
    uploadImage((int) R.drawable.ud_icon_image_outlined),
    addReminder((int) R.drawable.ud_icon_alarm_clock_outlined),
    shareImage((int) R.drawable.ud_icon_long_figure_outlined),
    checkbox((int) R.drawable.ud_icon_todo_outlined),
    borderLine(true),
    foreColor(true),
    backColor(true),
    fontSize(false);
    
    boolean hasNext;
    int iconResId;

    private OperationEnum(int i) {
        this(i, false);
    }

    private OperationEnum(boolean z) {
        this(-1, z);
    }

    private OperationEnum(int i, boolean z) {
        this.iconResId = i;
        this.hasNext = z;
    }
}
