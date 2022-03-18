package com.bytedance.ee.bear.doc.blockeditpanel.model;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

public enum EMenuItemButtonType {
    ICON_WITH_TEXT("iconWithText"),
    COLORED_ICON_WITH_TEXT("coloredIconWithText"),
    ICON_ALONE("iconAlone"),
    ICON_IN_GROUP("iconInGroup"),
    ICON_WITH_RIGHT_ARROW("iconWithRightArrow"),
    ICON_WITH_DOWN_ARROW("iconWithDownArrow"),
    GROUP("group"),
    SEPARATOR("separator"),
    SCROLLABLE_GROUP("scrollableGroup"),
    UNKNOWN("unknown"),
    HEADING_BUTTON_GROUP("headingButtonGroup"),
    COLOR_CLEAR_BACKGROUND("colorClearBackground");
    
    private static Map<String, EMenuItemButtonType> sButtonTypeMap = new HashMap();
    private static SparseArray<EMenuItemButtonType> sButtonTypeSparseArray = new SparseArray<>();
    public String name;

    static {
        EMenuItemButtonType[] values = values();
        for (EMenuItemButtonType eMenuItemButtonType : values) {
            sButtonTypeMap.put(eMenuItemButtonType.name, eMenuItemButtonType);
            sButtonTypeSparseArray.append(eMenuItemButtonType.ordinal(), eMenuItemButtonType);
        }
    }

    public static EMenuItemButtonType getEMenuItemButtonTypeByName(String str) {
        EMenuItemButtonType eMenuItemButtonType = sButtonTypeMap.get(str);
        if (eMenuItemButtonType == null) {
            return UNKNOWN;
        }
        return eMenuItemButtonType;
    }

    public static EMenuItemButtonType getEMenuItemButtonTypeByOrdinal(int i) {
        EMenuItemButtonType eMenuItemButtonType = sButtonTypeSparseArray.get(i);
        if (eMenuItemButtonType == null) {
            return UNKNOWN;
        }
        return eMenuItemButtonType;
    }

    private EMenuItemButtonType(String str) {
        this.name = str;
    }
}
