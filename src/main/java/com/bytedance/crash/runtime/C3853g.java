package com.bytedance.crash.runtime;

import android.content.Context;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.entity.C3746e;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3969y;
import com.tt.frontendapiinterface.ApiHandler;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.g */
public class C3853g {

    /* renamed from: h */
    private static C3853g f11825h;

    /* renamed from: i */
    private static boolean f11826i;

    /* renamed from: j */
    private static C3855a f11827j = new C3855a();

    /* renamed from: a */
    private final Context f11828a;

    /* renamed from: b */
    private HashMap<String, Long> f11829b;

    /* renamed from: c */
    private int f11830c = 50;

    /* renamed from: d */
    private int f11831d = 100;

    /* renamed from: e */
    private int f11832e = 100;

    /* renamed from: f */
    private int f11833f = 2;

    /* renamed from: g */
    private int f11834g = 5;

    /* renamed from: a */
    public static C3853g m15968a() {
        if (f11825h == null) {
            f11825h = new C3853g(C3774m.m15609j());
        }
        return f11825h;
    }

    /* renamed from: d */
    public boolean mo15469d() {
        if (C3746e.m15490c() || m15970a(mo15464a(ApiHandler.API_CALLBACK_EXCEPTION, 1, false, (long) this.f11832e))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private HashMap<String, Long> m15973e() {
        File n = C3962t.m16520n(this.f11828a);
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray b = C3949m.m16418b(n.getAbsolutePath());
            if (C3955q.m16451a(b)) {
                return hashMap;
            }
            Long decode = Long.decode(b.optString(0, null));
            if (System.currentTimeMillis() - decode.longValue() > 86400000) {
                m15972c(n);
                return hashMap;
            }
            hashMap.put("time", decode);
            for (int i = 1; i < b.length(); i++) {
                String[] split = b.optString(i, "").split(" ");
                if (split.length == 2) {
                    hashMap.put(split[0], Long.decode(split[1]));
                }
            }
            return hashMap;
        } catch (IOException unused) {
        } catch (Throwable unused2) {
            C3949m.m16412a(n);
        }
    }

    /* renamed from: b */
    public void mo15466b() {
        this.f11830c = C3840b.m15872a(this.f11830c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f11831d = C3840b.m15872a(this.f11831d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
        this.f11832e = C3840b.m15872a(this.f11832e, "custom_event_settings", "npth_simple_setting", "crash_limit_exception");
        this.f11834g = C3840b.m15872a(this.f11834g, "custom_event_settings", "npth_simple_setting", "crash_limit_exception_md5");
        this.f11833f = C3840b.m15872a(this.f11833f, "custom_event_settings", "npth_simple_setting", "crash_limit_exception_stack");
    }

    /* renamed from: c */
    public void mo15468c() {
        HashMap<String, Long> hashMap = this.f11829b;
        Long remove = hashMap.remove("time");
        if (remove == null) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", new RuntimeException("err times, no time"));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(remove);
        sb.append('\n');
        for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
            sb.append(entry.getKey());
            sb.append(' ');
            sb.append(entry.getValue());
            sb.append('\n');
        }
        try {
            C3949m.m16402a(C3962t.m16520n(this.f11828a), sb.toString(), false);
        } catch (IOException unused) {
        }
        hashMap.put("time", remove);
    }

    /* renamed from: com.bytedance.crash.runtime.g$a */
    public static class C3855a {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo15470a() {
        }

        /* renamed from: a */
        public void mo15471a(String str) {
            try {
                mo15470a();
            } catch (Throwable unused) {
            }
            C3864m.m16007a("crash_limit_exceed", C3955q.m16447a(new JSONObject(), "crash_type", str), null);
        }
    }

    private C3853g(Context context) {
        this.f11828a = context;
        this.f11829b = m15973e();
        mo15466b();
        C3840b.m15875a(new C3840b.AbstractC3841a() {
            /* class com.bytedance.crash.runtime.C3853g.C38541 */

            @Override // com.bytedance.crash.runtime.C3840b.AbstractC3841a
            /* renamed from: a */
            public void mo15168a() {
                C3853g.this.mo15466b();
            }

            @Override // com.bytedance.crash.runtime.C3840b.AbstractC3841a
            /* renamed from: b */
            public void mo15169b() {
                C3853g.this.mo15466b();
            }
        });
    }

    /* renamed from: a */
    public static boolean m15969a(File file) {
        if (file.getName().contains("deleted") || new File(file, "deleted").exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m15971b(File file) {
        try {
            if (!file.getName().contains("deleted")) {
                String parent = file.getParent();
                file.renameTo(new File(parent, file.getName() + "deleted"));
            }
            if (!new File(file, "deleted").exists()) {
                new File(file, "deleted").createNewFile();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private void m15972c(File file) {
        File m = C3962t.m16519m(this.f11828a);
        file.renameTo(new File(m, String.valueOf(System.currentTimeMillis())));
        String[] list = m.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            new File(m, list[0]).delete();
        }
    }

    /* renamed from: a */
    private static boolean m15970a(boolean z) {
        if (!z && !f11826i) {
            f11826i = true;
            f11827j.mo15471a(ApiHandler.API_CALLBACK_EXCEPTION);
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo15463a(String str) {
        if (!mo15464a(str, 1, true, (long) this.f11830c) || !mo15464a("all", 1, true, (long) this.f11830c)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo15467b(String str, String str2) {
        if (!C3746e.m15490c()) {
            if (!m15970a(mo15464a(str, 1, false, (long) this.f11833f))) {
                return false;
            }
            if ((str2 != null && !m15970a(mo15464a(str2, 1, false, (long) this.f11834g))) || !m15970a(mo15464a(ApiHandler.API_CALLBACK_EXCEPTION, 1, false, (long) this.f11832e))) {
                return false;
            }
        }
        m15970a(mo15464a(str, 1, true, (long) this.f11833f));
        if (str2 != null) {
            m15970a(mo15464a(str2, 1, true, (long) this.f11834g));
        }
        m15970a(mo15464a(ApiHandler.API_CALLBACK_EXCEPTION, 1, true, (long) this.f11832e));
        return true;
    }

    /* renamed from: a */
    public boolean mo15465a(String str, String str2) {
        if (C3746e.m15490c() || (m15970a(mo15464a(str, 1, false, (long) this.f11833f)) && (str2 == null || m15970a(mo15464a(str2, 1, false, (long) this.f11834g))))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public synchronized boolean mo15464a(String str, long j, boolean z, long j2) {
        boolean z2;
        if (str == null) {
            str = "default";
        }
        HashMap<String, Long> hashMap = this.f11829b;
        if (!z) {
            j = 0;
        }
        if (C3969y.m16539a(hashMap, str, Long.valueOf(j)).longValue() < j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }
}
