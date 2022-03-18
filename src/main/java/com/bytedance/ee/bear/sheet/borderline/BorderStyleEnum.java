package com.bytedance.ee.bear.sheet.borderline;

import com.larksuite.suite.R;

public enum BorderStyleEnum {
    noborder(R.drawable.ud_icon_no_borders_outlined),
    fullborder(R.drawable.ud_icon_borders_outlined),
    outerborder(R.drawable.ud_icon_outer_borders_outlined),
    innerborder(R.drawable.ud_icon_inner_borders_outlined),
    leftborder(R.drawable.ud_icon_left_borders_outlined),
    rightborder(R.drawable.ud_icon_right_borders_outlined),
    topborder(R.drawable.ud_icon_up_borders_outlined),
    bottomborder(R.drawable.ud_icon_down_borders_outlined);
    
    int iconRes;

    private BorderStyleEnum(int i) {
        this.iconRes = i;
    }
}
