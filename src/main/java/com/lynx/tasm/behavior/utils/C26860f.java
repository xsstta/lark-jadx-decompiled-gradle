package com.lynx.tasm.behavior.utils;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;

/* renamed from: com.lynx.tasm.behavior.utils.f */
public class C26860f {
    /* renamed from: a */
    public static String m97634a(String str) {
        int i;
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            if (str.charAt(i2) != '\\' || (i = i2 + 1) >= length) {
                sb.append(str.charAt(i2));
            } else {
                StringBuilder sb2 = new StringBuilder();
                while (i < length && i < i2 + 5) {
                    char charAt = str.charAt(i);
                    if ((charAt >= '0' && charAt <= '9') || ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z'))) {
                        sb2.append(charAt);
                        i++;
                    }
                }
                try {
                    sb.append((char) Integer.parseInt(sb2.toString(), 16));
                    i2 += sb2.length();
                } catch (Exception unused) {
                    sb.append(str.charAt(i2));
                }
            }
            i2++;
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ac, code lost:
        r5 = -1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m97635b(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.utils.C26860f.m97635b(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c */
    private static int m97636c(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1339299958:
                if (str.equals("dagger")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1220935388:
                if (str.equals("hellip")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1093812015:
                if (str.equals("lsaquo")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -991722477:
                if (str.equals("permil")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -922037109:
                if (str.equals("rsaquo")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -874702154:
                if (str.equals("thinsp")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 107431:
                if (str.equals("lrm")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 113011:
                if (str.equals("rlm")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 121037:
                if (str.equals("zwj")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3035411:
                if (str.equals("bull")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 3117317:
                if (str.equals("emsp")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3118278:
                if (str.equals("ensp")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 3752377:
                if (str.equals("zwnj")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 77382239:
                if (str.equals("Prime")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 93596489:
                if (str.equals("bdquo")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 97692206:
                if (str.equals("frasl")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 102831699:
                if (str.equals("ldquo")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 103278564:
                if (str.equals("lsquo")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 104663296:
                if (str.equals("ndash")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 105832675:
                if (str.equals("oline")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 106934911:
                if (str.equals("prime")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 108372825:
                if (str.equals("rdquo")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 108819690:
                if (str.equals("rsquo")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 109236764:
                if (str.equals("sbquo")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 2039534506:
                if (str.equals("Dagger")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 8224;
            case 1:
                return 8230;
            case 2:
                return 8249;
            case 3:
                return 8240;
            case 4:
                return 8250;
            case 5:
                return 8201;
            case 6:
                return 8206;
            case 7:
                return 8207;
            case '\b':
                return 8205;
            case '\t':
                return 8226;
            case '\n':
                return 8195;
            case 11:
                return 8194;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return 160;
            case '\r':
                return 8204;
            case 14:
                return 8243;
            case 15:
                return 8222;
            case 16:
                return 8260;
            case 17:
                return 8220;
            case 18:
                return 8216;
            case 19:
                return 8211;
            case 20:
                return 8254;
            case 21:
                return 8242;
            case 22:
                return 8221;
            case 23:
                return 8217;
            case 24:
                return 8218;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                return 8225;
            default:
                return -1;
        }
    }
}
