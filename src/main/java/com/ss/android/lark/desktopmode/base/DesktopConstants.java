package com.ss.android.lark.desktopmode.base;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

public class DesktopConstants {

    public enum UIType {
        UNKNOWN(GrsBaseInfo.CountryCodeSource.UNKNOWN),
        FLOAT_MODAL_WIDE_M1("M1"),
        FLOAT_MODAL_THIN_M2("M2"),
        FLOAT_POPOVER_P1("P1"),
        DRAWER_NORMAL_C1("C1"),
        DRAWER_MAX_C2("C2"),
        WINDOW_NORMAL_D1("D1"),
        WINDOW_WIDE_D2("D2"),
        WINDOW_CENTER_D3("D3");
        
        private String value;

        public String getValue() {
            return this.value;
        }

        public static UIType forValue(String str) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case 2126:
                    if (str.equals("C1")) {
                        c = 0;
                        break;
                    }
                    break;
                case 2127:
                    if (str.equals("C2")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2157:
                    if (str.equals("D1")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2158:
                    if (str.equals("D2")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2159:
                    if (str.equals("D3")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2436:
                    if (str.equals("M1")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2437:
                    if (str.equals("M2")) {
                        c = 6;
                        break;
                    }
                    break;
                case 2529:
                    if (str.equals("P1")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return DRAWER_NORMAL_C1;
                case 1:
                    return DRAWER_MAX_C2;
                case 2:
                    return WINDOW_NORMAL_D1;
                case 3:
                    return WINDOW_WIDE_D2;
                case 4:
                    return WINDOW_CENTER_D3;
                case 5:
                    return FLOAT_MODAL_WIDE_M1;
                case 6:
                    return FLOAT_MODAL_THIN_M2;
                case 7:
                    return FLOAT_POPOVER_P1;
                default:
                    return UNKNOWN;
            }
        }

        private UIType(String str) {
            this.value = str;
        }
    }
}
