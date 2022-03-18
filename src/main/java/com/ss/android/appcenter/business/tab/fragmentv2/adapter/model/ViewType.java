package com.ss.android.appcenter.business.tab.fragmentv2.adapter.model;

import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;

public enum ViewType {
    HEADER_COMMON(1, R.layout.workplace_fragment_adapter_group_header_view),
    HEADER_CATEGORY(2, R.layout.workplace_fragment_adapter_category_header_view),
    CHILD_WIDGET_LIST(101, R.layout.workplace_fragment_adapter_widget_item),
    CHILD_ICON_LIST(102, R.layout.workplace_fragment_adapter_app_item),
    CHILD_RECTANGLE_BUTTON(103, R.layout.workplace_fragment_adapter_button_item),
    CHILD_CATEGORY_ICON(104, R.layout.workplace_fragment_adapter_app_item),
    CHILD_CATEGORY_LOADING(LocationRequest.PRIORITY_NO_POWER, R.layout.workplace_fragment_adapter_category_loading),
    CHILD_CATEGORY_ERROR(106, R.layout.workplace_common_error_view),
    CHILD_CATEGORY_GUIDE(ActivityIdentificationData.WALKING, R.layout.workplace_common_guide_view),
    FOOTER_COMMON(201, R.layout.workplace_fragment_adapter_group_footer_view),
    FOOTER_CATEGORY(202, R.layout.workplace_fragment_adapter_category_footer_view),
    DEFAULT(0, R.layout.workplace_common_default_view);
    
    int layoutRes;
    int value;

    public int getLayoutRes() {
        return this.layoutRes;
    }

    public int getViewTypeValue() {
        return this.value;
    }

    public static ViewType fromValue(int i) {
        if (i == 1) {
            return HEADER_COMMON;
        }
        if (i == 2) {
            return HEADER_CATEGORY;
        }
        if (i == 201) {
            return FOOTER_COMMON;
        }
        if (i == 202) {
            return FOOTER_CATEGORY;
        }
        switch (i) {
            case 101:
                return CHILD_WIDGET_LIST;
            case 102:
                return CHILD_ICON_LIST;
            case 103:
                return CHILD_RECTANGLE_BUTTON;
            case 104:
                return CHILD_CATEGORY_ICON;
            case LocationRequest.PRIORITY_NO_POWER:
                return CHILD_CATEGORY_LOADING;
            case 106:
                return CHILD_CATEGORY_ERROR;
            case ActivityIdentificationData.WALKING:
                return CHILD_CATEGORY_GUIDE;
            default:
                return DEFAULT;
        }
    }

    private ViewType(int i, int i2) {
        this.value = i;
        this.layoutRes = i2;
    }
}
