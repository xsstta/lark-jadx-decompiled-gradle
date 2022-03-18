package com.bytedance.ee.bear.drive.common;

import com.bytedance.ee.log.C13479a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.ee.bear.drive.common.k */
public class C6899k {
    /* renamed from: a */
    public static int m27276a(String str) {
        try {
            Matcher matcher = Pattern.compile("code = [0-9]+").matcher(str);
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(0).substring(7));
            }
            return -1;
        } catch (Exception e) {
            C13479a.m54761a("ServerErrorExceptionUtil", e);
            return -1;
        }
    }
}
