package com.bytedance.ttnet.p913d;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import java.util.Set;

/* renamed from: com.bytedance.ttnet.d.a */
public class C20765a {
    /* renamed from: a */
    public static boolean m75667a(String str, Set<String> set) {
        if (!StringUtils.isEmpty(str) && set != null) {
            for (String str2 : set) {
                if (!TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                    if (!Logger.debug()) {
                        return true;
                    }
                    Logger.m15167d("RequestDelayHelper", "app delay, matched, rule is " + str2 + " request path is " + str);
                    return true;
                }
            }
        }
        return false;
    }
}
