package com.bytedance.crash.p219c;

import com.bytedance.crash.C3774m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.IUploadCallback;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.runtime.C3859j;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.p227a.C3835e;
import com.bytedance.crash.upload.C3903f;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.c.a */
public class C3723a {
    /* renamed from: a */
    public static void m15355a(String str) {
        m15356a(str, null, null, null);
    }

    /* renamed from: a */
    public static void m15356a(final String str, final Map<? extends String, ? extends String> map, final Map<String, String> map2, final IUploadCallback iUploadCallback) {
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            C3866n.m16016b().mo15508a(new Runnable() {
                /* class com.bytedance.crash.p219c.C3723a.RunnableC37241 */

                public void run() {
                    boolean z;
                    try {
                        C3742b a = C3742b.m15425a(currentTimeMillis, C3774m.m15609j(), str);
                        C3742b a2 = C3835e.m15853a().mo15428a(CrashType.DART, a);
                        if (map != null) {
                            JSONObject optJSONObject = a2.mo15252e().optJSONObject("custom");
                            if (optJSONObject == null) {
                                optJSONObject = new JSONObject();
                            }
                            C3742b.m15434a(optJSONObject, map);
                            Map map = map2;
                            if (map != null) {
                                C3742b.m15434a(optJSONObject, map);
                            }
                            a.mo15241a("custom", optJSONObject);
                        }
                        a2.mo15241a("logcat", (Object) C3859j.m15989a(C3774m.m15607h()));
                        z = C3903f.m16169a().mo15550a(currentTimeMillis, a2.mo15252e());
                    } catch (Throwable unused) {
                        z = false;
                    }
                    IUploadCallback iUploadCallback = iUploadCallback;
                    if (iUploadCallback != null) {
                        try {
                            iUploadCallback.afterUpload(z);
                        } catch (Throwable unused2) {
                        }
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
