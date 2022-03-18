package com.bytedance.ee.bear.photopicker.photo;

import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;

/* renamed from: com.bytedance.ee.bear.photopicker.photo.b */
public final class C10524b {
    /* renamed from: b */
    public static boolean m43606b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                break;
            case -1662382439:
                if (str.equals("video/mpeg")) {
                    c = 1;
                    break;
                }
                break;
            case -1662095187:
                if (str.equals("video/webm")) {
                    c = 2;
                    break;
                }
                break;
            case -1079884372:
                if (str.equals("video/x-msvideo")) {
                    c = 3;
                    break;
                }
                break;
            case -107252314:
                if (str.equals("video/quicktime")) {
                    c = 4;
                    break;
                }
                break;
            case -48069494:
                if (str.equals("video/3gpp2")) {
                    c = 5;
                    break;
                }
                break;
            case 5703450:
                if (str.equals("video/mp2ts")) {
                    c = 6;
                    break;
                }
                break;
            case 1331792072:
                if (str.equals("video/3gp")) {
                    c = 7;
                    break;
                }
                break;
            case 1331836736:
                if (str.equals("video/avi")) {
                    c = '\b';
                    break;
                }
                break;
            case 1331848029:
                if (str.equals("video/mp4")) {
                    c = '\t';
                    break;
                }
                break;
            case 2039520277:
                if (str.equals("video/x-matroska")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static int m43604a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1930021710:
                if (str.equals("audio/x-ms-wma")) {
                    c = 0;
                    break;
                }
                break;
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 1;
                    break;
                }
                break;
            case -1662382439:
                if (str.equals("video/mpeg")) {
                    c = 2;
                    break;
                }
                break;
            case -1662095187:
                if (str.equals("video/webm")) {
                    c = 3;
                    break;
                }
                break;
            case -1079884372:
                if (str.equals("video/x-msvideo")) {
                    c = 4;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c = 5;
                    break;
                }
                break;
            case -107252314:
                if (str.equals("video/quicktime")) {
                    c = 6;
                    break;
                }
                break;
            case -48069494:
                if (str.equals("video/3gpp2")) {
                    c = 7;
                    break;
                }
                break;
            case 5703450:
                if (str.equals("video/mp2ts")) {
                    c = '\b';
                    break;
                }
                break;
            case 187078282:
                if (str.equals("audio/aac")) {
                    c = '\t';
                    break;
                }
                break;
            case 187078669:
                if (str.equals("audio/amr")) {
                    c = '\n';
                    break;
                }
                break;
            case 187090232:
                if (str.equals("audio/mp4")) {
                    c = 11;
                    break;
                }
                break;
            case 187099443:
                if (str.equals("audio/wav")) {
                    c = '\f';
                    break;
                }
                break;
            case 1331792072:
                if (str.equals("video/3gp")) {
                    c = '\r';
                    break;
                }
                break;
            case 1331836736:
                if (str.equals("video/avi")) {
                    c = 14;
                    break;
                }
                break;
            case 1331848029:
                if (str.equals("video/mp4")) {
                    c = 15;
                    break;
                }
                break;
            case 1338492737:
                if (str.equals("audio/quicktime")) {
                    c = 16;
                    break;
                }
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c = 17;
                    break;
                }
                break;
            case 1504787571:
                if (str.equals("audio/lamr")) {
                    c = 18;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 19;
                    break;
                }
                break;
            case 2039520277:
                if (str.equals("video/x-matroska")) {
                    c = 20;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
            case '\t':
            case '\n':
            case 11:
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
            case 16:
            case 17:
            case 18:
            case 19:
                return 3;
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case '\b':
            case '\r':
            case 14:
            case 15:
            case 20:
                return 2;
            default:
                return 1;
        }
    }

    /* renamed from: a */
    public static boolean m43605a(String str, String str2) {
        if (m43604a(str) == m43604a(str2)) {
            return true;
        }
        return false;
    }
}
