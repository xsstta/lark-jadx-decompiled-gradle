package com.ss.android.lark.passport.infra.util;

import android.text.TextUtils;
import java.util.regex.Pattern;

public class aj {

    /* renamed from: a */
    private static final Pattern f123439a = Pattern.compile("^([hH][tT]{2}[pP]:/*|[hH][tT]{2}[pP][sS]:/*|[fF][iI][lL][eE]:/*)([\\w.]+\\/?)\\S*");

    /* renamed from: a */
    public static boolean m193849a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return f123439a.matcher(str).matches();
    }
}
