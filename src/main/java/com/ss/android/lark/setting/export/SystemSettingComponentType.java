package com.ss.android.lark.setting.export;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

public enum SystemSettingComponentType {
    ACCOUNT("ACCOUNT"),
    LANGUAGE("LANGUAGE"),
    NOTIFICATION("NOTIFICATION"),
    PRIVACY("PRIVACY"),
    CALENDAR("CALENDAR"),
    MAIL("MAIL"),
    VIDEO_CHAT("VIDEO_CHAT"),
    GENERAL("GENERAL"),
    TODO("TODO"),
    MOMENTS("MOMENTS"),
    DIVIDER("DIVIDER"),
    INTERNAL("INTERNAL"),
    ABOUT("ABOUT"),
    CLEAR_CACHE("CLEAR_CACHE"),
    NEW_LOGOUT("NEW_LOGOUT"),
    APP_VERSION("APP_VERSION"),
    UNKNOWN(GrsBaseInfo.CountryCodeSource.UNKNOWN);
    
    private String value;

    public String getValue() {
        return this.value;
    }

    public static SystemSettingComponentType forValue(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1902665991:
                if (str.equals("DIVIDER")) {
                    c = 0;
                    break;
                }
                break;
            case -1382453013:
                if (str.equals("NOTIFICATION")) {
                    c = 1;
                    break;
                }
                break;
            case -1103714116:
                if (str.equals("VIDEO_CHAT")) {
                    c = 2;
                    break;
                }
                break;
            case -830962856:
                if (str.equals("LANGUAGE")) {
                    c = 3;
                    break;
                }
                break;
            case -638342871:
                if (str.equals("NEW_LOGOUT")) {
                    c = 4;
                    break;
                }
                break;
            case -459336179:
                if (str.equals("ACCOUNT")) {
                    c = 5;
                    break;
                }
                break;
            case 2358711:
                if (str.equals("MAIL")) {
                    c = 6;
                    break;
                }
                break;
            case 2580550:
                if (str.equals("TODO")) {
                    c = 7;
                    break;
                }
                break;
            case 62073709:
                if (str.equals("ABOUT")) {
                    c = '\b';
                    break;
                }
                break;
            case 403484520:
                if (str.equals("PRIVACY")) {
                    c = '\t';
                    break;
                }
                break;
            case 604302142:
                if (str.equals("CALENDAR")) {
                    c = '\n';
                    break;
                }
                break;
            case 637834440:
                if (str.equals("GENERAL")) {
                    c = 11;
                    break;
                }
                break;
            case 1186446458:
                if (str.equals("APP_VERSION")) {
                    c = '\f';
                    break;
                }
                break;
            case 1353037501:
                if (str.equals("INTERNAL")) {
                    c = '\r';
                    break;
                }
                break;
            case 1810940624:
                if (str.equals("CLEAR_CACHE")) {
                    c = 14;
                    break;
                }
                break;
            case 1953253971:
                if (str.equals("MOMENTS")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return DIVIDER;
            case 1:
                return NOTIFICATION;
            case 2:
                return VIDEO_CHAT;
            case 3:
                return LANGUAGE;
            case 4:
                return NEW_LOGOUT;
            case 5:
                return ACCOUNT;
            case 6:
                return MAIL;
            case 7:
                return TODO;
            case '\b':
                return ABOUT;
            case '\t':
                return PRIVACY;
            case '\n':
                return CALENDAR;
            case 11:
                return GENERAL;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return APP_VERSION;
            case '\r':
                return INTERNAL;
            case 14:
                return CLEAR_CACHE;
            case 15:
                return MOMENTS;
            default:
                return UNKNOWN;
        }
    }

    private SystemSettingComponentType(String str) {
        this.value = str;
    }
}
