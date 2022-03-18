package com.bytedance.ee.larkwebview.p677e;

import java.util.regex.Pattern;

/* renamed from: com.bytedance.ee.larkwebview.e.b */
public class C13438b {
    /* renamed from: a */
    public static boolean m54611a(String str) {
        return Pattern.compile("^[-\\+]?[\\d]*$").matcher(str).matches();
    }
}
