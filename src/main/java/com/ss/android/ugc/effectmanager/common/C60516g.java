package com.ss.android.ugc.effectmanager.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.common.g */
public final class C60516g {
    /* renamed from: a */
    static int m235204a(String str, String str2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int i = -1;
        while (matcher.find()) {
            i = matcher.start();
        }
        return i;
    }
}
