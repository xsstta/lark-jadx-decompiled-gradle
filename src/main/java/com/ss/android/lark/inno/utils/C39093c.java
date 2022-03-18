package com.ss.android.lark.inno.utils;

import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45851c;

/* renamed from: com.ss.android.lark.inno.utils.c */
public class C39093c {
    /* renamed from: a */
    public static String m154344a(int i) {
        if (i == 0) {
            return C45851c.m181647a(R.string.Common_G_Resolution_Origianal);
        }
        if (i == 1) {
            return C45851c.m181647a(R.string.Common_G_Resolution_Bluray);
        }
        if (i == 2) {
            return C45851c.m181647a(R.string.Common_G_Resolution_HD);
        }
        if (i == 3) {
            return C45851c.m181647a(R.string.Common_G_Resolution_Smooth);
        }
        if (i != 4) {
            return "";
        }
        return C45851c.m181647a(R.string.Common_G_Resolution_Standard);
    }

    /* renamed from: b */
    public static String m154345b(int i) {
        if (i == 0) {
            return C45851c.m181647a(R.string.Common_G_Resolution_Origianal);
        }
        if (i == 1) {
            return C45851c.m181647a(R.string.Common_G_Resolution_Bluray);
        }
        if (i == 2) {
            return C45851c.m181647a(R.string.Common_G_Resolution_HD);
        }
        if (i == 3) {
            return C45851c.m181647a(R.string.Common_G_Resolution_Smooth);
        }
        if (i != 4) {
            return "";
        }
        return C45851c.m181647a(R.string.Common_G_Resolution_Standard);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m154343a(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1008619738:
                if (str.equals("origin")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3324:
                if (str.equals("hd")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3448:
                if (str.equals("ld")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3665:
                if (str.equals("sd")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 115761:
                if (str.equals("uhd")) {
                    c = 4;
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
                return 0;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 1;
            default:
                return -1;
        }
    }
}
