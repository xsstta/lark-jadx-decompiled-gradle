package com.bytedance.ee.bear.bitable.card.model.enums;

import android.util.SparseArray;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.suite.R;

public enum EFieldType {
    NOT_SUPPORT(0, R.drawable.ud_icon_maybe_outlined, R.layout.bitable_cell_unknown_item),
    TEXT(1, R.drawable.ud_icon_style_outlined, R.layout.bitable_cell_text_item),
    NUMBER(2, R.drawable.ud_icon_number_outlined, R.layout.bitable_cell_number_item),
    SINGLE_SELECT(3, R.drawable.ud_icon_down_round_outlined, R.layout.bitable_cell_select_item),
    MULTI_SELECT(4, R.drawable.ud_icon_group_selection_outlined, R.layout.bitable_cell_select_item),
    DATE_TIME(5, R.drawable.ud_icon_calendar_line_outlined, R.layout.bitable_cell_date_item),
    CHECKBOX(7, R.drawable.ud_icon_todo_outlined, R.layout.bitable_cell_checkbox_item),
    USER(11, R.drawable.ud_icon_member_outlined, R.layout.bitable_cell_user_item),
    URL(15, R.drawable.ud_icon_link_copy_outlined, R.layout.bitable_cell_url_item),
    ATTACHMENT(17, R.drawable.ud_icon_attachment_outlined, R.layout.bitable_cell_attachment_item),
    SINGLE_LINK(18, R.drawable.ud_icon_sheet_onedatareference_outlined, R.layout.bitable_cell_link_item),
    LOOKUP(19, R.drawable.ud_icon_lookup_outlined, R.layout.bitable_cell_text_item),
    FORMULA(20, R.drawable.ud_icon_formula_outlined, R.layout.bitable_cell_text_item),
    DUPLEX_LINK(21, R.drawable.ud_icon_sheet_datareference_outlined, R.layout.bitable_cell_link_item),
    CREATE_TIME(CommonCode.StatusCode.API_CLIENT_EXPIRED, R.drawable.ud_icon_calendar_line_outlined, R.layout.bitable_cell_date_item),
    MODIFY_TIME(1002, R.drawable.ud_icon_calendar_line_outlined, R.layout.bitable_cell_date_item),
    CREATE_USER(1003, R.drawable.ud_icon_member_outlined, R.layout.bitable_cell_user_item),
    MODIFY_USER(1004, R.drawable.ud_icon_member_outlined, R.layout.bitable_cell_user_item);
    
    private static final SparseArray<EFieldType> MAP_VALUES = new SparseArray<>();
    public int iconRes;
    public int itemLayoutRes;
    public int value;

    public boolean isReferenceType() {
        if (this == LOOKUP || this == FORMULA) {
            return true;
        }
        return false;
    }

    static {
        EFieldType[] values = values();
        for (EFieldType eFieldType : values) {
            MAP_VALUES.put(eFieldType.value, eFieldType);
        }
    }

    public static EFieldType valueOf(int i) {
        return MAP_VALUES.get(i, NOT_SUPPORT);
    }

    private EFieldType(int i, int i2, int i3) {
        this.value = i;
        this.iconRes = i2;
        this.itemLayoutRes = i3;
    }
}
