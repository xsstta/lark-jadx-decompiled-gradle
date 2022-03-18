package com.bytedance.crash.p220d;

import android.text.TextUtils;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.p227a.C3835e;
import com.bytedance.crash.upload.C3903f;
import com.bytedance.crash.util.C3968x;

/* renamed from: com.bytedance.crash.d.a */
public class C3726a {
    /* renamed from: a */
    public static void m15358a(final String str, final String str2, final String str3) {
        if (!TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            C3866n.m16016b().mo15508a(new Runnable() {
                /* class com.bytedance.crash.p220d.C3726a.RunnableC37271 */

                public void run() {
                    try {
                        C3903f.m16169a().mo15548a(C3835e.m15853a().mo15428a(CrashType.GAME, C3742b.m15427a(C3774m.m15609j(), str, str2, str3)).mo15252e());
                    } catch (Throwable th) {
                        C3968x.m16534a(th);
                    }
                }
            });
        }
    }
}
