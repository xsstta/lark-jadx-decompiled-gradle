package com.ss.android.lark.exception.crash.p1828a.p1829a;

import android.content.Context;
import com.ss.android.lark.util.share_preference.C57744a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.exception.crash.a.a.a */
public class C37014a {
    public C37014a(Context context) {
    }

    /* renamed from: a */
    public void mo136539a(String str) {
        C57744a.m224104a().putString("crash_record_key_crash_time", str);
    }

    /* renamed from: b */
    public String mo136540b(String str) {
        return C57744a.m224104a().getString("crash_record_key_crash_time", str);
    }
}
