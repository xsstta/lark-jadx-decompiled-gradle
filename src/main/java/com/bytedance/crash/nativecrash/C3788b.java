package com.bytedance.crash.nativecrash;

import android.text.TextUtils;
import com.bytedance.crash.util.C3962t;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.nativecrash.b */
public class C3788b {

    /* renamed from: a */
    private Map<String, String> f11664a;

    /* renamed from: c */
    public Map<String, String> mo15310c() {
        return this.f11664a;
    }

    /* renamed from: b */
    public String mo15309b() {
        return this.f11664a.get("signal_line");
    }

    /* renamed from: a */
    public boolean mo15308a() {
        Map<String, String> map = this.f11664a;
        if (map == null || map.isEmpty() || TextUtils.isEmpty(this.f11664a.get("process_name")) || TextUtils.isEmpty(this.f11664a.get("crash_thread_name")) || TextUtils.isEmpty(this.f11664a.get("pid")) || TextUtils.isEmpty(this.f11664a.get("tid")) || TextUtils.isEmpty(this.f11664a.get("start_time")) || TextUtils.isEmpty(this.f11664a.get("crash_time"))) {
            return false;
        }
        return !TextUtils.isEmpty(this.f11664a.get("signal_line"));
    }

    public C3788b(File file) {
        String a;
        File d = C3962t.m16496d(file);
        if (!(!d.exists() || d.length() == 0 || (a = NativeImpl.m15681a(d.getAbsolutePath())) == null)) {
            String[] split = a.split("\n");
            this.f11664a = new HashMap();
            for (String str : split) {
                String[] split2 = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (split2.length == 2) {
                    this.f11664a.put(split2[0], split2[1]);
                }
            }
        }
    }
}
