package com.ss.android.lark.calendar.impl.rustadapter.doentity;

public class RedDotUiItem {

    /* renamed from: a */
    int f83577a;

    /* renamed from: b */
    ItemName f83578b;

    public enum ItemName {
        UI_ITEM_SETTING("cal_setting"),
        UI_ITEM_LOCAL_CAL("cal_local_item"),
        UI_ITEM_CAL_IMPORT("cal_import"),
        UI_ITEM_CAL_VIEW("cal_view"),
        UI_ITEM_MONTH_VIEW("cal_month_view"),
        UI_ITEM_CAL_MENU("cal_menu");
        
        String value;

        public final String getValue() {
            return this.value;
        }

        public static ItemName forValue(String str) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -2048210824:
                    if (str.equals("cal_local_item")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1273854241:
                    if (str.equals("cal_setting")) {
                        c = 1;
                        break;
                    }
                    break;
                case -735761098:
                    if (str.equals("cal_import")) {
                        c = 2;
                        break;
                    }
                    break;
                case -685118955:
                    if (str.equals("cal_month_view")) {
                        c = 3;
                        break;
                    }
                    break;
                case -183894224:
                    if (str.equals("cal_menu")) {
                        c = 4;
                        break;
                    }
                    break;
                case -183622538:
                    if (str.equals("cal_view")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return UI_ITEM_LOCAL_CAL;
                case 1:
                    return UI_ITEM_SETTING;
                case 2:
                    return UI_ITEM_CAL_IMPORT;
                case 3:
                    return UI_ITEM_MONTH_VIEW;
                case 4:
                    return UI_ITEM_CAL_MENU;
                case 5:
                    return UI_ITEM_CAL_VIEW;
                default:
                    return null;
            }
        }

        private ItemName(String str) {
            this.value = str;
        }
    }

    /* renamed from: a */
    public int mo119953a() {
        return this.f83577a;
    }

    /* renamed from: b */
    public ItemName mo119956b() {
        return this.f83578b;
    }

    /* renamed from: a */
    public void mo119954a(int i) {
        this.f83577a = i;
    }

    /* renamed from: a */
    public void mo119955a(ItemName itemName) {
        this.f83578b = itemName;
    }
}
