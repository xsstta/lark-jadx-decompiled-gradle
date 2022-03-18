package com.bytedance.crash.runtime;

import android.text.TextUtils;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.C3775n;
import com.bytedance.crash.runtime.p228b.C3842a;
import com.bytedance.crash.upload.C3919m;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.C3968x;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.b */
public class C3840b {

    /* renamed from: a */
    private static final ConcurrentLinkedQueue<AbstractC3841a> f11797a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    private static boolean f11798b;

    /* renamed from: com.bytedance.crash.runtime.b$a */
    public interface AbstractC3841a {
        /* renamed from: a */
        void mo15168a();

        /* renamed from: b */
        void mo15169b();
    }

    /* renamed from: A */
    public static JSONArray m15861A() {
        return C3955q.m16446a(m15874a(), "custom_event_settings", "npth_simple_setting", "native_heap_params");
    }

    /* renamed from: B */
    public static boolean m15862B() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "enable_anr_dump_for_java_crash") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static boolean m15863C() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "disable_kill_history") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public static boolean m15864D() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "enable_all_worker") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m15865E() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "disable_kill_history_data") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public static boolean m15866F() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "enable_kill_history_data_sub") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m15867G() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "enable_kill_history_err") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m15868H() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "disable_kill_history_subprocess") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public static boolean m15869I() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "disable_kill_history_alog") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m15870J() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "enable_upload_fork_crash") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m15879b() {
        if (!C3775n.m15654e() || m15874a() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m15882c() {
        return C3842a.m15917f(C3774m.m15591a().mo15460e());
    }

    /* renamed from: e */
    public static String m15887e() {
        return C3955q.m16456b(m15874a(), "custom_event_settings", "npth_simple_setting", "crash_upload_domain");
    }

    /* renamed from: f */
    public static JSONArray m15888f() {
        return C3955q.m16446a(m15874a(), "custom_event_settings", "npth_simple_setting", "crash_upload_domain_list");
    }

    /* renamed from: g */
    public static JSONArray m15889g() {
        return C3955q.m16446a(m15874a(), "custom_event_settings", "npth_simple_setting", "max_utm_thread_ignore");
    }

    /* renamed from: h */
    public static boolean m15890h() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "disable_looper_monitor") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m15891i() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "enable_all_thread_stack_native") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m15892j() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "anr_with_traces_txt") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m15893k() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "upload_crash_crash") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m15894l() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "enable_background_killed_anr") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m15895m() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "enable_killed_anr") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m15896n() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "enable_anr_all_process_trace") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m15897o() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "disable_crash_with_custom_files") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m15898p() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "enable_gwp_asan") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static String m15899q() {
        return C3955q.m16456b(m15874a(), "custom_event_settings", "npth_simple_setting", "gwp_asan_monitor_path");
    }

    /* renamed from: r */
    public static JSONArray m15900r() {
        return C3955q.m16446a(m15874a(), "custom_event_settings", "npth_simple_setting", "enable_device_brand");
    }

    /* renamed from: s */
    public static JSONArray m15901s() {
        return C3955q.m16446a(m15874a(), "custom_event_settings", "npth_simple_setting", "enable_api_level");
    }

    /* renamed from: t */
    public static JSONArray m15902t() {
        return C3955q.m16446a(m15874a(), "custom_event_settings", "npth_simple_setting", "gwp_asan_set_init_param");
    }

    /* renamed from: u */
    public static boolean m15903u() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "enable_hprof_all_java_crash") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static boolean m15904v() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "disable_force_anr_block") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m15905w() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "enable_native_heap_track") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static boolean m15906x() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "enable_pthread_key_monitor") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m15907y() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "enable_env_monitor") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static boolean m15908z() {
        if (m15873a("custom_event_settings", "npth_simple_setting", "enable_debug") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m15885d() {
        C3823a.m15813a(m15887e(), m15888f());
        Iterator<AbstractC3841a> it = f11797a.iterator();
        while (it.hasNext()) {
            AbstractC3841a next = it.next();
            if (!f11798b) {
                next.mo15168a();
            }
            next.mo15169b();
        }
        f11798b = true;
    }

    /* renamed from: a */
    public static JSONObject m15874a() {
        return C3842a.m15916e(C3774m.m15591a().mo15460e());
    }

    /* renamed from: a */
    public static int m15871a(int i) {
        return m15872a(i, "custom_event_settings", "npth_simple_setting", "coredump_gwpasan_check_time");
    }

    /* renamed from: b */
    public static int m15878b(int i) {
        return m15872a(i, "custom_event_settings", "npth_simple_setting", "kill_history_limit");
    }

    /* renamed from: c */
    public static int m15881c(int i) {
        return m15872a(i, "custom_event_settings", "npth_simple_setting", "exit_reason_limit");
    }

    /* renamed from: d */
    public static int m15884d(int i) {
        return m15872a(i, "custom_event_settings", "npth_simple_setting", "crash_inner_limit");
    }

    /* renamed from: e */
    public static int m15886e(int i) {
        return m15872a(i, "custom_event_settings", "npth_simple_setting", "crash_file_size_limit");
    }

    /* renamed from: a */
    public static int m15873a(String... strArr) {
        return C3955q.m16455b(m15874a(), -1, strArr);
    }

    /* renamed from: a */
    public static void m15875a(AbstractC3841a aVar) {
        f11797a.add(aVar);
        if (f11798b) {
            aVar.mo15168a();
            aVar.mo15169b();
        }
    }

    /* renamed from: a */
    public static int m15872a(int i, String... strArr) {
        return C3955q.m16455b(m15874a(), i, strArr);
    }

    /* renamed from: b */
    public static boolean m15880b(Object obj, String str) {
        C3842a a = C3842a.m15911a(obj);
        if (a == null) {
            return false;
        }
        return a.mo15435b(str);
    }

    /* renamed from: c */
    public static boolean m15883c(Object obj, String str) {
        C3842a a = C3842a.m15911a(obj);
        if (a == null) {
            return false;
        }
        return a.mo15432a(str);
    }

    /* renamed from: a */
    public static void m15876a(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            C3968x.m16536b("apmconfig", "fromnet " + z + " : " + jSONArray);
            String e = C3774m.m15591a().mo15460e();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    String next = optJSONObject.keys().next();
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                    C3968x.m16530a((Object) ("update config " + next + " : " + optJSONObject2));
                    C3842a.m15912a(next, optJSONObject2);
                    if (TextUtils.equals(e, next)) {
                        m15885d();
                    }
                    C3919m.m16221a(next, z);
                } catch (Throwable unused) {
                }
            }
            if (z || C3919m.m16229f()) {
                C3919m.m16228e();
            }
        }
    }

    /* renamed from: a */
    public static boolean m15877a(Object obj, String str) {
        C3842a a = C3842a.m15911a(obj);
        if (a == null) {
            return false;
        }
        return a.mo15436c(str);
    }
}
