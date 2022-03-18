package com.ss.android.lark.platform.statistics.perf;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57782ag;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.statistics.perf.c */
public class C51997c {

    /* renamed from: a */
    private static final Map<String, C51999a> f129121a = new ConcurrentHashMap();

    /* renamed from: a */
    public static void m201743a(String str, ChatBundle.SourceType sourceType) {
        if (str != null && sourceType != null) {
            C51999a aVar = new C51999a(sourceType);
            aVar.f129125C = str;
            f129121a.put(str, aVar);
            aVar.mo178235b();
            Log.m165379d("PerfEnterChatMonitor", "start: " + str + "/" + sourceType);
            ChatEnterPerf.f129118a.mo178214a();
            ChatEnterPerf.f129118a.mo178218e();
        }
    }

    /* renamed from: a */
    private static boolean m201746a(C51999a aVar) {
        if (aVar.f129124B.longValue() <= 0 || aVar.f129124B.longValue() > 60000 || aVar.f129133c.longValue() > aVar.f129134d.longValue() || aVar.f129135e.longValue() > aVar.f129136f.longValue() || aVar.f129137g.longValue() > aVar.f129138h.longValue() || aVar.f129155y > aVar.f129156z || aVar.f129144n) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m201744a(String str, String str2) {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            aVar.f129146p = str;
            aVar.f129145o = str2;
            aVar.f129137g = Long.valueOf(System.currentTimeMillis());
            Log.m165379d("PerfEnterChatMonitor", "beginLoadNetData: " + str2);
            ChatEnterPerf.f129118a.mo178220g();
        }
    }

    /* renamed from: a */
    public static void m201745a(boolean z) {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            if (z) {
                aVar.f129139i = Long.valueOf(SystemClock.elapsedRealtime());
                ChatEnterPerf.f129118a.mo178216c();
            } else {
                aVar.f129139i = Long.valueOf(SystemClock.elapsedRealtime() - aVar.f129139i.longValue());
                ChatEnterPerf.f129118a.mo178217d();
            }
            Log.m165379d("PerfEnterChatMonitor", "getLauncherInfo:" + z + "/" + aVar.f129139i);
        }
    }

    /* renamed from: com.ss.android.lark.platform.statistics.perf.c$a */
    public static class C51999a {

        /* renamed from: A */
        public Map<Integer, Long> f129123A;

        /* renamed from: B */
        public Long f129124B;

        /* renamed from: C */
        public String f129125C;

        /* renamed from: D */
        public int f129126D;

        /* renamed from: E */
        public boolean f129127E;

        /* renamed from: F */
        public ChatBundle.SourceType f129128F;

        /* renamed from: G */
        public ChatBundle.ChatType f129129G;

        /* renamed from: H */
        private String f129130H;

        /* renamed from: a */
        public Long f129131a;

        /* renamed from: b */
        public Long f129132b;

        /* renamed from: c */
        public Long f129133c;

        /* renamed from: d */
        public Long f129134d;

        /* renamed from: e */
        public Long f129135e;

        /* renamed from: f */
        public Long f129136f;

        /* renamed from: g */
        public Long f129137g;

        /* renamed from: h */
        public Long f129138h;

        /* renamed from: i */
        public Long f129139i;

        /* renamed from: j */
        public Long f129140j;

        /* renamed from: k */
        public Long f129141k;

        /* renamed from: l */
        public Long f129142l;

        /* renamed from: m */
        public boolean f129143m;

        /* renamed from: n */
        public boolean f129144n;

        /* renamed from: o */
        public String f129145o;

        /* renamed from: p */
        public String f129146p;

        /* renamed from: q */
        public int f129147q;

        /* renamed from: r */
        public long f129148r;

        /* renamed from: s */
        public List<Long> f129149s;

        /* renamed from: t */
        public long f129150t;

        /* renamed from: u */
        public long f129151u;

        /* renamed from: v */
        public long f129152v;

        /* renamed from: w */
        public long f129153w;

        /* renamed from: x */
        public boolean f129154x;

        /* renamed from: y */
        public long f129155y;

        /* renamed from: z */
        public long f129156z;

        /* renamed from: a */
        public String mo178233a() {
            return this.f129128F.getValue();
        }

        /* renamed from: b */
        public void mo178235b() {
            this.f129130H = AppreciableKit.m107394b().mo103510a(Biz.Messenger, Scene.Chat, Event.enter_chat, "chatWindow", false, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
        }

        /* renamed from: c */
        public void mo178236c() {
            AppreciableKit.m107394b().mo103523c(C57782ag.m224244b(this.f129130H), mo178237d(), mo178240g(), mo178239f(), mo178238e());
        }

        /* renamed from: g */
        public Map<String, Object> mo178240g() {
            HashMap hashMap = new HashMap();
            hashMap.put("context_id", C57782ag.m224244b(this.f129145o));
            return hashMap;
        }

        /* renamed from: d */
        public Map<String, Object> mo178237d() {
            HashMap hashMap = new HashMap();
            hashMap.put("sdk_cost", Long.valueOf(this.f129148r));
            hashMap.put("client_data_cost", Long.valueOf(this.f129150t));
            hashMap.put("client_render_cost", Long.valueOf(this.f129156z - this.f129155y));
            hashMap.put("first_render", Long.valueOf(this.f129151u));
            return hashMap;
        }

        /* renamed from: f */
        public Map<String, Object> mo178239f() {
            String str;
            HashMap hashMap = new HashMap();
            hashMap.put("chatter_count", Integer.valueOf(this.f129126D));
            hashMap.put("feed_id", C57782ag.m224244b(this.f129146p));
            List<Long> list = this.f129149s;
            if (list != null) {
                str = Arrays.toString(list.toArray());
            } else {
                str = "";
            }
            hashMap.put("net_costs", str);
            return hashMap;
        }

        /* renamed from: e */
        public Map<String, Object> mo178238e() {
            int i;
            int i2;
            HashMap hashMap = new HashMap();
            hashMap.put("source_type", Integer.valueOf(this.f129128F.index));
            hashMap.put("chat_type", Integer.valueOf(this.f129129G.index));
            int i3 = 0;
            if (this.f129129G == ChatBundle.ChatType.SECRET_SINGLE || this.f129129G == ChatBundle.ChatType.SECRET_GROUP) {
                i = 1;
            } else {
                i = 0;
            }
            hashMap.put("is_crypto", Integer.valueOf(i));
            hashMap.put("is_external", Integer.valueOf(this.f129127E ? 1 : 0));
            if (this.f129129G == ChatBundle.ChatType.MEETING) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            hashMap.put("is_meeting", Integer.valueOf(i2));
            if (this.f129129G == ChatBundle.ChatType.EDU_CHAT) {
                i3 = 1;
            }
            hashMap.put("is_edu", Integer.valueOf(i3));
            return hashMap;
        }

        public String toString() {
            return "PerfLoadChat{startTime=" + this.f129131a + ", endTime=" + this.f129132b + ", duration=" + this.f129124B + ", key='" + this.f129125C + '\'' + ", sourceType='" + this.f129128F.value + '\'' + ", chatType='" + this.f129129G.value + '\'' + ", loading='" + this.f129147q + '\'' + ", renderTime='" + this.f129154x + '\'' + this.f129155y + '\'' + this.f129156z + '\'' + '}';
        }

        /* renamed from: a */
        public void mo178234a(ErrorResult errorResult) {
            AppreciableKit.m107394b().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, Event.enter_chat, ErrorType.Network, ErrorLevel.Fatal, errorResult.getErrorCode(), null, "chatwindow", errorResult.getDisplayMsg(), true, mo178240g(), mo178239f(), mo178238e()));
        }

        C51999a(ChatBundle.SourceType sourceType) {
            this.f129131a = 0L;
            this.f129132b = 0L;
            this.f129133c = 0L;
            this.f129134d = 0L;
            this.f129135e = 0L;
            this.f129136f = 0L;
            this.f129137g = 0L;
            this.f129138h = 0L;
            this.f129139i = 0L;
            this.f129140j = 0L;
            this.f129141k = 0L;
            this.f129142l = 0L;
            this.f129143m = false;
            this.f129144n = false;
            this.f129147q = 0;
            this.f129148r = 0;
            this.f129149s = null;
            this.f129150t = 0;
            this.f129151u = 0;
            this.f129152v = 0;
            this.f129153w = 0;
            this.f129154x = false;
            this.f129155y = 0;
            this.f129156z = 0;
            this.f129123A = new HashMap();
            this.f129124B = 0L;
            this.f129125C = null;
            this.f129126D = 0;
            this.f129127E = false;
            this.f129128F = ChatBundle.SourceType.FEED;
            this.f129129G = ChatBundle.ChatType.GROUP;
            this.f129131a = Long.valueOf(System.currentTimeMillis());
            this.f129128F = sourceType;
        }
    }

    /* renamed from: a */
    public static void m201735a() {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            aVar.f129133c = Long.valueOf(System.currentTimeMillis());
            Log.m165379d("PerfEnterChatMonitor", "beginRender");
        }
    }

    /* renamed from: b */
    public static void m201748b() {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            aVar.f129134d = Long.valueOf(System.currentTimeMillis());
            Log.m165379d("PerfEnterChatMonitor", "endRender");
        }
    }

    /* renamed from: e */
    public static void m201757e() {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            Log.m165379d("PerfEnterChatMonitor", "activityStop");
            aVar.f129144n = true;
        }
    }

    /* renamed from: f */
    public static void m201758f() {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            aVar.f129156z = System.currentTimeMillis();
            Log.m165379d("PerfEnterChatMonitor", "endRenderMessage");
            ChatEnterPerf.f129118a.mo178227n();
        }
    }

    /* renamed from: g */
    public static void m201759g() {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            aVar.f129138h = Long.valueOf(System.currentTimeMillis());
            Log.m165379d("PerfEnterChatMonitor", "endLoadNetData");
            ChatEnterPerf.f129118a.mo178221h();
        }
    }

    /* renamed from: h */
    public static void m201760h() {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            aVar.f129136f = Long.valueOf(System.currentTimeMillis());
            Log.m165379d("PerfEnterChatMonitor", "endLoadData");
            ChatEnterPerf.f129118a.mo178223j();
        }
    }

    /* renamed from: c */
    public static void m201752c() {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            if (aVar.f129152v > 0) {
                aVar.f129152v = SystemClock.elapsedRealtime() - aVar.f129152v;
                Log.m165379d("PerfEnterChatMonitor", "messageDelayCost=" + aVar.f129152v);
                ChatEnterPerf.f129118a.mo178229p();
            }
            aVar.f129154x = true;
            Log.m165379d("PerfEnterChatMonitor", "markReadyRenderMessage");
        }
    }

    /* renamed from: d */
    public static void m201755d() {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            if (aVar.f129154x) {
                aVar.f129155y = System.currentTimeMillis();
                aVar.f129154x = false;
                aVar.f129153w = SystemClock.elapsedRealtime() - aVar.f129153w;
                Log.m165379d("PerfEnterChatMonitor", "messageWaitCost=" + aVar.f129153w);
            }
            Log.m165379d("PerfEnterChatMonitor", "beginRenderMessage");
            ChatEnterPerf.f129118a.mo178226m();
        }
    }

    /* renamed from: i */
    public static void m201761i() {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null && aVar.f129152v == 0) {
            aVar.f129151u = System.currentTimeMillis() - aVar.f129131a.longValue();
            aVar.f129152v = SystemClock.elapsedRealtime();
            Log.m165379d("PerfEnterChatMonitor", "showFirstWindow:" + aVar.f129151u);
            ChatEnterPerf.f129118a.mo178219f();
            ChatEnterPerf.f129118a.mo178228o();
        }
    }

    /* renamed from: c */
    private static boolean m201754c(String str) {
        return TextUtils.equals(str, "key_chatwindow");
    }

    /* renamed from: b */
    public static C51999a m201747b(String str) {
        Map<String, C51999a> map = f129121a;
        C51999a aVar = map.get(str);
        if (aVar == null) {
            return null;
        }
        map.remove(str);
        Log.m165389i("PerfEnterChatMonitor", "perfLoadChat = " + aVar);
        return aVar;
    }

    /* renamed from: b */
    public static void m201751b(boolean z) {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            if (z) {
                aVar.f129140j = Long.valueOf(SystemClock.elapsedRealtime());
                ChatEnterPerf.f129118a.mo178230q();
            } else {
                aVar.f129140j = Long.valueOf(SystemClock.elapsedRealtime() - aVar.f129140j.longValue());
                ChatEnterPerf.f129118a.mo178231r();
            }
            Log.m165379d("PerfEnterChatMonitor", "openChatActivity:" + z + "/" + aVar.f129140j);
        }
    }

    /* renamed from: c */
    public static void m201753c(boolean z) {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            if (z) {
                aVar.f129141k = Long.valueOf(SystemClock.elapsedRealtime());
                ChatEnterPerf.f129118a.mo178224k();
            } else {
                aVar.f129141k = Long.valueOf(SystemClock.elapsedRealtime() - aVar.f129141k.longValue());
                ChatEnterPerf.f129118a.mo178225l();
            }
            Log.m165379d("PerfEnterChatMonitor", "initView:" + z + "/" + aVar.f129141k);
        }
    }

    /* renamed from: d */
    public static void m201756d(boolean z) {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            if (z) {
                aVar.f129142l = Long.valueOf(SystemClock.elapsedRealtime());
            } else {
                aVar.f129142l = Long.valueOf(SystemClock.elapsedRealtime() - aVar.f129142l.longValue());
            }
            Log.m165379d("PerfEnterChatMonitor", "loadMessageFromNet:" + z + "/" + aVar.f129142l);
        }
    }

    /* renamed from: a */
    public static void m201741a(String str) {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            aVar.f129146p = str;
            aVar.f129135e = Long.valueOf(System.currentTimeMillis());
            Log.m165379d("PerfEnterChatMonitor", "beginLoadData");
            ChatEnterPerf.f129118a.mo178222i();
        }
    }

    /* renamed from: a */
    public static void m201736a(int i, String str) {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            aVar.f129123A.put(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: b */
    public static void m201749b(int i, String str) {
        Long l;
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null && (l = aVar.f129123A.get(Integer.valueOf(i))) != null && l.longValue() != 0) {
            aVar.f129123A.put(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l.longValue()));
        }
    }

    /* renamed from: a */
    private static void m201738a(Context context, final C51999a aVar) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.platform.statistics.perf.C51997c.RunnableC519981 */

            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("latency", Float.valueOf((float) aVar.f129124B.longValue()));
                    jSONObject.put("load_message", (double) ((float) (aVar.f129136f.longValue() - aVar.f129135e.longValue())));
                    jSONObject.put("load_net_message", (double) ((float) (aVar.f129138h.longValue() - aVar.f129137g.longValue())));
                    jSONObject.put("first_render", (double) ((float) (aVar.f129134d.longValue() - aVar.f129133c.longValue())));
                    jSONObject.put("loading", (double) ((float) aVar.f129147q));
                    jSONObject.put("sdk_cost", (double) ((float) aVar.f129148r));
                    jSONObject.put("client_data_cost", (double) ((float) aVar.f129150t));
                    jSONObject.put("client_render_cost", (double) ((float) (aVar.f129156z - aVar.f129155y)));
                    if (aVar.f129139i.longValue() > 0) {
                        jSONObject.put("client_getLauncherInfo_cost", aVar.f129139i);
                    }
                    if (aVar.f129140j.longValue() > 0) {
                        jSONObject.put("client_openChatActivity_cost", aVar.f129140j);
                    }
                    if (aVar.f129141k.longValue() > 0) {
                        jSONObject.put("client_initview_cost", aVar.f129141k);
                    }
                    if (aVar.f129151u > 0) {
                        jSONObject.put("first_window_cost", aVar.f129151u);
                    }
                    if (aVar.f129152v > 0) {
                        jSONObject.put("message_delay_cost", aVar.f129152v);
                    }
                    if (aVar.f129153w > 0) {
                        jSONObject.put("message_wait_cost", aVar.f129153w);
                    }
                    jSONObject.put("load_message_from_net_cost", aVar.f129142l);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("source_type", aVar.f129128F.value);
                    jSONObject2.put("chat_type", aVar.f129129G.value);
                    jSONObject2.put("is_first_start", aVar.f129143m);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("chat_id", aVar.f129146p);
                    jSONObject3.put("context_id", aVar.f129145o);
                    jSONObject3.put("section.latency", aVar.f129131a + "," + aVar.f129132b);
                    jSONObject3.put("section.load_message", aVar.f129135e + "," + aVar.f129136f);
                    jSONObject3.put("section.load_net_message", aVar.f129137g + "," + aVar.f129138h);
                    jSONObject3.put("context_id.load_net_message", aVar.f129145o);
                    jSONObject3.put("section.first_render", aVar.f129133c + "," + aVar.f129134d);
                    jSONObject3.put("section.client_render_cost", aVar.f129155y + "," + aVar.f129156z);
                    MonitorUtils.monitorEvent("chat_load_time", jSONObject2, jSONObject, jSONObject3);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* renamed from: b */
    private static void m201750b(Context context, C51999a aVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("latency", Float.valueOf((float) aVar.f129124B.longValue()));
            jSONObject.put("load_message", (double) ((float) (aVar.f129136f.longValue() - aVar.f129135e.longValue())));
            jSONObject.put("load_net_message", (double) ((float) (aVar.f129138h.longValue() - aVar.f129137g.longValue())));
            jSONObject.put("first_render", (double) ((float) (aVar.f129134d.longValue() - aVar.f129133c.longValue())));
            jSONObject.put("loading", (double) ((float) aVar.f129147q));
            jSONObject.put("sdk_cost", (double) ((float) aVar.f129148r));
            jSONObject.put("client_data_cost", (double) ((float) aVar.f129150t));
            jSONObject.put("client_render_cost", (double) ((float) (aVar.f129156z - aVar.f129155y)));
            if (aVar.f129139i.longValue() > 0) {
                jSONObject.put("client_getLauncherInfo_cost", aVar.f129139i);
            }
            if (aVar.f129140j.longValue() > 0) {
                jSONObject.put("client_openChatActivity_cost", aVar.f129140j);
            }
            if (aVar.f129141k.longValue() > 0) {
                jSONObject.put("client_initview_cost", aVar.f129141k);
            }
            if (aVar.f129151u > 0) {
                jSONObject.put("first_window_cost", aVar.f129151u);
            }
            if (aVar.f129152v > 0) {
                jSONObject.put("message_delay_cost", aVar.f129152v);
            }
            if (aVar.f129153w > 0) {
                jSONObject.put("message_wait_cost", aVar.f129153w);
            }
            jSONObject.put("load_message_from_net_cost", aVar.f129142l);
            String str2 = "";
            if (aVar.f129146p != null) {
                str = aVar.f129146p;
            } else {
                str = str2;
            }
            jSONObject.put("chat_id", str);
            if (aVar.f129145o != null) {
                str2 = aVar.f129145o;
            }
            jSONObject.put("context_id", str2);
            jSONObject.put("source_type", aVar.f129128F.value);
            jSONObject.put("chat_type", aVar.f129129G.value);
            jSONObject.put("is_first_start", aVar.f129143m);
            Statistics.sendEvent("perf_load_chat", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (aVar.f129123A != null && aVar.f129123A.size() != 0) {
            try {
                for (Map.Entry<Integer, Long> entry : aVar.f129123A.entrySet()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("message_type", entry.getKey());
                    jSONObject2.put("message_bind_cost", entry.getValue());
                    Statistics.sendEvent("android_chat_bind_time", jSONObject2);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m201739a(Context context, String str, ChatBundle.ChatType chatType) {
        m201740a(context, str, chatType, false, 0, false);
    }

    /* renamed from: a */
    public static void m201737a(long j, long j2, List<Long> list) {
        C51999a aVar = f129121a.get("key_chatwindow");
        if (aVar != null) {
            aVar.f129148r = j;
            aVar.f129150t = j2;
            aVar.f129149s = list;
            Log.m165379d("PerfEnterChatMonitor", "recordCost");
        }
    }

    /* renamed from: a */
    public static void m201742a(String str, ChatBundle.ChatType chatType, boolean z, ErrorResult errorResult) {
        Map<String, C51999a> map = f129121a;
        C51999a aVar = map.get(str);
        if (str != null && chatType != null && aVar != null) {
            map.remove(str);
            aVar.f129132b = Long.valueOf(System.currentTimeMillis());
            aVar.f129129G = chatType;
            aVar.f129127E = z;
            aVar.f129124B = Long.valueOf(aVar.f129132b.longValue() - aVar.f129131a.longValue());
            Log.m165389i("PerfEnterChatMonitor", "end: " + str + "/" + chatType);
            aVar.mo178234a(errorResult);
        }
    }

    /* renamed from: a */
    public static void m201740a(Context context, String str, ChatBundle.ChatType chatType, boolean z, int i, boolean z2) {
        Map<String, C51999a> map = f129121a;
        C51999a aVar = map.get(str);
        if (str != null && chatType != null && aVar != null) {
            map.remove(str);
            aVar.f129132b = Long.valueOf(System.currentTimeMillis());
            aVar.f129129G = chatType;
            aVar.f129127E = z;
            aVar.f129126D = i;
            aVar.f129143m = z2;
            aVar.f129124B = Long.valueOf(aVar.f129132b.longValue() - aVar.f129131a.longValue());
            if (C26284k.m95185a(context)) {
                Log.m165383e("PerfEnterChatMonitor", "not upload in debug mode");
            } else if (!m201746a(aVar)) {
                Log.m165383e("PerfEnterChatMonitor", "report data is invalid");
            } else {
                aVar.mo178236c();
                ChatEnterPerf.f129118a.mo178215b();
                Log.m165389i("PerfEnterChatMonitor", "end: " + str + "/" + chatType);
                m201750b(context, aVar);
                if (m201754c(str)) {
                    m201738a(context, aVar);
                    Log.m165389i("PerfEnterChatMonitor", "perfLoadChat = " + aVar);
                }
            }
        }
    }
}
