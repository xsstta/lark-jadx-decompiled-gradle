package com.bytedance.lynx.webview.internal;

import android.os.Process;
import android.os.Trace;
import com.bytedance.lynx.webview.sdkadapt.Version;
import com.bytedance.lynx.webview.util.C20026a;
import com.bytedance.lynx.webview.util.C20048g;
import com.bytedance.lynx.webview.util.C20051j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.lynx.webview.internal.g */
public class C19943g {

    /* renamed from: a */
    static int f48718a;

    /* renamed from: b */
    static JSONObject f48719b = new JSONObject();

    /* renamed from: c */
    public static AbstractC19939c f48720c = new C19949a();

    /* renamed from: d */
    private static Set<Integer> f48721d = new HashSet<Integer>() {
        /* class com.bytedance.lynx.webview.internal.C19943g.C199441 */

        {
            add(Integer.valueOf(EventType.LOAD_ENSURE_FACTORYPROVIDER_CREATED.getEventCode()));
            add(Integer.valueOf(EventType.LOAD_HOOK_BEFORE_SYSTEM.getEventCode()));
            add(Integer.valueOf(EventType.LOAD_TRACE_EVENT_INIT.getEventCode()));
            add(Integer.valueOf(EventType.LOAD_TRACE_EVENT_HOOK.getEventCode()));
            add(Integer.valueOf(EventType.LOAD_TRACE_EVENT_ENSURE.getEventCode()));
            add(Integer.valueOf(EventType.LOAD_TRACE_EVENT_START_IMPL.getEventCode()));
            add(Integer.valueOf(EventType.LOAD_TRACE_EVENT_SYNC_PROCESS.getEventCode()));
            add(Integer.valueOf(EventType.LOAD_TRACE_EVENT_CREATE_PROVIDER.getEventCode()));
            add(Integer.valueOf(EventType.LOAD_TRACE_EVENT_CALLBACK.getEventCode()));
        }
    };

    /* renamed from: e */
    private static Set<Integer> f48722e = new HashSet<Integer>() {
        /* class com.bytedance.lynx.webview.internal.C19943g.C199452 */

        {
            add(Integer.valueOf(EventType.WEBVIEW_TYPE.getEventCode()));
            add(Integer.valueOf(EventType.CRASH_TOO_MANNY.getEventCode()));
            add(Integer.valueOf(EventType.LOADED_SO_VERSION.getEventCode()));
            add(Integer.valueOf(EventType.LOADED_SO_VERSION_EX.getEventCode()));
            add(Integer.valueOf(EventType.SETTINGS_SO_VERSION_EX.getEventCode()));
            add(Integer.valueOf(EventType.LOADED_SDK_VERSION_AND_SO_VERSION.getEventCode()));
        }
    };

    /* renamed from: f */
    private static AbstractC19942f f48723f = new C19950b();

    /* renamed from: com.bytedance.lynx.webview.internal.g$a */
    private static class C19949a implements AbstractC19939c {
        @Override // com.bytedance.lynx.webview.internal.AbstractC19939c
        /* renamed from: a */
        public void mo67716a(String str, Map<String, Object> map, Map<String, Object> map2) {
        }

        private C19949a() {
        }
    }

    /* renamed from: com.bytedance.lynx.webview.internal.g$b */
    private static class C19950b implements AbstractC19942f {
        @Override // com.bytedance.lynx.webview.internal.AbstractC19942f
        /* renamed from: a */
        public void mo67728a(int i, JSONObject jSONObject, JSONObject jSONObject2) {
        }

        @Override // com.bytedance.lynx.webview.internal.AbstractC19942f
        /* renamed from: b */
        public void mo67729b(int i, JSONObject jSONObject, JSONObject jSONObject2) {
        }

        private C19950b() {
        }
    }

    /* renamed from: a */
    public static JSONObject m72719a() {
        return f48719b;
    }

    /* renamed from: a */
    private static void m72728a(Map<String, Object> map) {
        map.put("loadso", C20011y.m72976a().mo67900D());
        map.put("sdk_aar_version", Version.f48943d);
        map.put("pid", Integer.valueOf(Process.myPid()));
        map.put("processname", C20051j.m73197c(C20011y.m72976a().mo67938u()));
        map.put("webview_count", Integer.valueOf(C20011y.m72976a().mo67936s()));
        map.put("app_start_times", Integer.valueOf(C20011y.m72976a().mo67939v().mo67841j()));
        map.put("app_start_times_by_version", Integer.valueOf(C20011y.m72976a().mo67939v().mo67843k()));
        try {
            map.put("app_host_abi", C20011y.m72974M());
        } catch (Throwable unused) {
            map.put("app_host_abi", "empty");
        }
    }

    /* renamed from: a */
    public static void m72722a(final int i, final JSONObject jSONObject) {
        C20011y.m73001d(new Runnable() {
            /* class com.bytedance.lynx.webview.internal.C19943g.RunnableC199463 */

            public void run() {
                Trace.beginSection("sendCommonEvent");
                C19943g.m72729b(i, jSONObject);
                Trace.endSection();
            }
        });
    }

    /* renamed from: a */
    public static void m72724a(EventType eventType, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(eventType.getEventName(), obj);
            m72722a(eventType.getEventCode(), jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private static JSONObject m72720a(Map map, JSONObject jSONObject) {
        if (map == null && jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(map);
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys != null && keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject2.has(next)) {
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                }
            }
            return jSONObject2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m72721a(int i, Map<String, Object> map) {
        try {
            if (i == EventType.LOAD_WEBVIEW_CREATEWEBVIEW_TIME.getEventCode()) {
                C20011y.m72976a().mo67907K();
                long currentTimeMillis = System.currentTimeMillis() - C20011y.m72976a().mo67909N();
                map.put("timedelta_of_first_webview", Long.valueOf(currentTimeMillis));
                C20048g.m73161a("First webview instance created until: " + currentTimeMillis);
            }
        } catch (Throwable th) {
            C20048g.m73164d("Error happened: " + th);
        }
    }

    /* renamed from: b */
    public static void m72729b(int i, JSONObject jSONObject) {
        if (f48721d.contains(Integer.valueOf(i))) {
            C20048g.m73161a("Event filtered: [" + i + "] = " + jSONObject.toString());
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            f48718a++;
            int myPid = Process.myPid();
            HashMap hashMap = new HashMap();
            m72728a(hashMap);
            m72721a(i, hashMap);
            jSONObject2 = m72720a(hashMap, m72719a());
            jSONObject2.put("logindex", myPid + "-" + f48718a);
        } catch (Exception e) {
            C19938b.m72701a("sendCommonEvent:" + e.toString());
        }
        if (f48722e.contains(Integer.valueOf(i))) {
            m72723a(i, jSONObject, jSONObject2);
            return;
        }
        C20048g.m73161a("sendCommonEvent [" + i + "] = " + jSONObject.toString() + jSONObject2.toString());
        f48723f.mo67728a(i, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public static void m72726a(final String str, final String str2) {
        C20011y.m73001d(new Runnable() {
            /* class com.bytedance.lynx.webview.internal.C19943g.RunnableC199474 */

            public void run() {
                try {
                    C19943g.f48719b.put(str, str2);
                } catch (JSONException e) {
                    C20048g.m73164d("addEventExtentionInfo error: " + e.toString());
                }
            }
        });
    }

    /* renamed from: a */
    public static void m72723a(int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C20048g.m73161a("sendImportEvent [" + i + "] " + jSONObject.toString() + jSONObject2.toString());
        f48723f.mo67729b(i, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public static void m72725a(final EventType eventType, final String str, final boolean z) {
        C20011y.m73001d(new Runnable() {
            /* class com.bytedance.lynx.webview.internal.C19943g.RunnableC199485 */

            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (eventType == EventType.SO_UPDATE_SUCCESS) {
                        C19943g.m72724a(EventType.SO_UPDATE_SUCCESS, str);
                        C20011y.m72976a().mo67939v().mo67815a(str, false);
                    } else if (eventType == EventType.SO_UPDATE_FAILED) {
                        jSONObject.put(EventType.SO_UPDATE_FAILED.getEventName(), str);
                        String b = C20026a.m73081b();
                        jSONObject.put(EventType.DOWNLOAD_RESULT.getEventName(), C20026a.m73076a(b));
                        jSONObject.put(EventType.DOWNLOAD_PROCESS.getEventName(), b);
                        jSONObject.put(EventType.DOWNLOAD_FINISH_STATUS.getEventName(), z);
                        C19943g.m72722a(EventType.SO_UPDATE_FAILED.getEventCode(), jSONObject);
                    } else if (eventType == EventType.LOAD_RESULT) {
                        String c = C20026a.m73083c();
                        C20026a.m73085d();
                        C20011y.m72976a().mo67939v().mo67838h(c);
                        jSONObject.put(EventType.LOAD_RESULT.getEventName(), C20026a.m73082b(c));
                        jSONObject.put(EventType.LOAD_PROCESS.getEventName(), c);
                        jSONObject.put(EventType.DOWNLOAD_FINISH_STATUS.getEventName(), z);
                        jSONObject.put("config_url", C20011y.m72976a().mo67939v().mo67847n());
                        C19943g.m72722a(EventType.LOAD_RESULT.getEventCode(), jSONObject);
                    } else if (eventType == EventType.SO_UPDATE_NEED) {
                        C20011y.m72976a().mo67939v().mo67815a(str, true);
                        jSONObject.put(EventType.SO_UPDATE_NEED.getEventName(), str);
                        String b2 = C20026a.m73081b();
                        jSONObject.put(EventType.DOWNLOAD_RESULT.getEventName(), C20026a.m73076a(b2));
                        jSONObject.put(EventType.DOWNLOAD_PROCESS.getEventName(), b2);
                        C19943g.m72722a(EventType.SO_UPDATE_NEED.getEventCode(), jSONObject);
                    } else if (eventType == EventType.DOWNLOAD_RESULT) {
                        String b3 = C20026a.m73081b();
                        jSONObject.put(EventType.DOWNLOAD_RESULT.getEventName(), C20026a.m73076a(b3));
                        jSONObject.put(EventType.DOWNLOAD_PROCESS.getEventName(), b3);
                        jSONObject.put(EventType.DOWNLOAD_FINISH_STATUS.getEventName(), z);
                        C19943g.m72722a(EventType.DOWNLOAD_RESULT.getEventCode(), jSONObject);
                    } else {
                        if (eventType != EventType.DOWNLOAD_STATUS_FAILED) {
                            if (eventType != EventType.DOWNLOAD_STATUS_END) {
                                if (eventType == EventType.DOWNLOAD_STATUS_START) {
                                    C19943g.m72724a(eventType, str);
                                    return;
                                }
                                return;
                            }
                        }
                        JSONObject f = C20026a.m73087f();
                        f.put("download_seg_list", C20026a.m73088g());
                        C19943g.m72722a(eventType.getEventCode(), f);
                    }
                } catch (JSONException e) {
                    C19938b.m72701a("sendCommonEvent:" + e.toString());
                }
            }
        });
    }

    /* renamed from: a */
    public static void m72727a(String str, Map<String, Object> map, Map<String, Object> map2) {
        m72728a(map);
        f48720c.mo67716a(str, map, map2);
    }
}
