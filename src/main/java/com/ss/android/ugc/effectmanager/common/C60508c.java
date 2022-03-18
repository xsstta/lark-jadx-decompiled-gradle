package com.ss.android.ugc.effectmanager.common;

import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;

/* renamed from: com.ss.android.ugc.effectmanager.common.c */
public class C60508c {
    /* renamed from: a */
    public static String m235159a(int i) {
        if (i == 1) {
            return "Unknown error";
        }
        if (i == 10014) {
            return "Effect id is invalid";
        }
        if (i == 10016) {
            return "link-selector context is null";
        }
        if (i == 1100) {
            return "The current application is not a test application";
        }
        if (i == 1101) {
            return "access_key not existed";
        }
        switch (i) {
            case 1000:
                return "Arguments is illegal";
            case CommonCode.StatusCode.API_CLIENT_EXPIRED:
                return "access_key is illegal";
            case 1002:
                return "app_version is illegal";
            case 1003:
                return "sdk_version is illegal";
            case 1004:
                return "device_id is illegal";
            case 1005:
                return "device_platform is illegal";
            case 1006:
                return "device_type is illegal";
            case 1007:
                return "channel is illegal";
            case 1008:
                return "app_channel is illegal";
            default:
                switch (i) {
                    case 2001:
                        return "No content updating";
                    case 2002:
                        return "Effect is offline";
                    case 2003:
                        return "The current device is not supported";
                    case 2004:
                        return "Effect is not existed";
                    case 2005:
                        return "is not in the allow-list";
                    case 2006:
                        return "The app needs updating";
                    default:
                        switch (i) {
                            case UpdateDialogStatusCode.DISMISS:
                                return "Cancel download";
                            case UpdateDialogStatusCode.SHOW:
                                return "Download error";
                            case 10003:
                                return "Sticker is null";
                            case 10004:
                                return "Invalid effect list cache !!!";
                            case 10005:
                                return "SDK error";
                            case 10006:
                                return "No Downloaded Effects";
                            case 10007:
                                return "panel is null";
                            default:
                                switch (i) {
                                    case 10009:
                                        return "no local TAG cache";
                                    case 10010:
                                        return "MD5 error";
                                    case 10011:
                                        return "no network";
                                    case 10012:
                                        return "IO error";
                                    default:
                                        return "Unknown error";
                                }
                        }
                }
        }
    }
}
