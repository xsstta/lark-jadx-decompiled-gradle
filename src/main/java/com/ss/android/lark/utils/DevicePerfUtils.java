package com.ss.android.lark.utils;

import com.ss.android.lark.util.share_preference.C57744a;

public class DevicePerfUtils {
    /* renamed from: a */
    public static String m224112a() {
        return "device_perf_level";
    }

    public enum DevicePerfLevel {
        UNKNOWN("unknown"),
        HIGH("high"),
        MIDDLE("middle"),
        LOW("low"),
        ULTRALOW("ultralow");
        
        private final String value;

        public String getValue() {
            return this.value;
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        public static DevicePerfLevel fromValue(String str) {
            char c;
            switch (str.hashCode()) {
                case -1754211288:
                    if (str.equals("ultralow")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1074341483:
                    if (str.equals("middle")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -284840886:
                    if (str.equals("unknown")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 107348:
                    if (str.equals("low")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3202466:
                    if (str.equals("high")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                return HIGH;
            }
            if (c == 1) {
                return MIDDLE;
            }
            if (c == 2) {
                return LOW;
            }
            if (c != 3) {
                return UNKNOWN;
            }
            return ULTRALOW;
        }

        private DevicePerfLevel(String str) {
            this.value = str;
        }
    }

    /* renamed from: b */
    public static DevicePerfLevel m224113b() {
        return DevicePerfLevel.fromValue(C57744a.m224104a().getString("device_perf_level", "unknown"));
    }
}
