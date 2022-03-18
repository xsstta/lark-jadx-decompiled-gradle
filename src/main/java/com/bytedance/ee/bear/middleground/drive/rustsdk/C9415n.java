package com.bytedance.ee.bear.middleground.drive.rustsdk;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.n */
public class C9415n {
    /* renamed from: a */
    public static String m38907a(String str) {
        C13479a.m54764b("TaskKeyGenerator", "parseDownloadUniqueKey, taskId: " + C13598b.m55197d(str));
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("_");
        if (split.length < 2) {
            return str;
        }
        return split[0];
    }

    /* renamed from: b */
    public static String m38909b(String str) {
        C13479a.m54764b("TaskKeyGenerator", "parseDownloadCallbackKey, taskId: " + C13598b.m55197d(str));
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("_");
        if (split.length < 2) {
            return "";
        }
        return split[1];
    }

    /* renamed from: a */
    public static String m38908a(String str, String str2) {
        return str + "_" + str2;
    }
}
