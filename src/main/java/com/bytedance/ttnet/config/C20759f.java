package com.bytedance.ttnet.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.bytedance.frameworks.baselib.network.http.cronet.TTAppStateManager;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.C14073i;
import com.bytedance.frameworks.baselib.network.http.util.C14089g;
import com.bytedance.retrofit2.C20642m;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.p913d.C20765a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.config.f */
public class C20759f implements C20642m.AbstractC20646b {

    /* renamed from: a */
    private static String f50854a;

    /* renamed from: b */
    private static C20759f f50855b;

    /* renamed from: c */
    private final Context f50856c;

    /* renamed from: d */
    private final boolean f50857d;

    /* renamed from: e */
    private final Map<TTAppStateManager.AppStartState, C20761a> f50858e = new ConcurrentHashMap();

    /* renamed from: f */
    private String f50859f = "";

    /* renamed from: g */
    private boolean f50860g = false;

    /* renamed from: h */
    private boolean f50861h = false;

    /* renamed from: i */
    private int f50862i = 1000;

    /* renamed from: j */
    private int f50863j = 100;

    /* renamed from: k */
    private Set<String> f50864k = new CopyOnWriteArraySet();

    /* renamed from: l */
    private Map<String, Integer> f50865l = new ConcurrentHashMap();

    /* renamed from: m */
    private final Map<String, Integer> f50866m = new ConcurrentHashMap();

    /* renamed from: n */
    private final AtomicInteger f50867n = new AtomicInteger(0);

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ttnet.config.f$b */
    public static final class C20762b extends BroadcastReceiver {
        C20762b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "com.bytedance.ttnet.config.appconfig.SYNC_APP_DELAY_CONFIG_ACTION".equals(intent.getAction())) {
                new ThreadPlus("SyncAppDelayConfig") {
                    /* class com.bytedance.ttnet.config.C20759f.C20762b.C207631 */

                    @Override // com.bytedance.common.utility.concurrent.ThreadPlus
                    public void run() {
                        C20764g.m75661c().mo70043d();
                    }
                }.start();
            }
        }
    }

    @Override // com.bytedance.retrofit2.C20642m.AbstractC20646b
    /* renamed from: a */
    public boolean mo69469a() {
        return this.f50860g;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m75653f() {
        mo70039a(TTAppStateManager.AppStartState.Default);
    }

    @Override // com.bytedance.retrofit2.C20642m.AbstractC20646b
    /* renamed from: b */
    public boolean mo69470b() {
        return C14073i.m56967a().mo51756c();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ttnet.config.f$a */
    public static class C20761a {

        /* renamed from: a */
        boolean f50868a;

        /* renamed from: b */
        boolean f50869b;

        /* renamed from: c */
        Map<String, Integer> f50870c;

        /* renamed from: d */
        Set<String> f50871d;

        /* renamed from: e */
        int f50872e;

        /* renamed from: f */
        int f50873f;

        /* renamed from: g */
        int f50874g;

        private C20761a() {
            this.f50869b = true;
            this.f50870c = new ConcurrentHashMap();
            this.f50871d = new CopyOnWriteArraySet();
            this.f50872e = 1000;
            this.f50873f = 100;
            this.f50874g = 1000;
        }
    }

    /* renamed from: d */
    private void m75651d() {
        SharedPreferences.Editor edit = this.f50856c.getSharedPreferences("tt_state_config", 4).edit();
        edit.putString("tnc_delay_config", this.f50859f);
        SharedPrefsEditorCompat.apply(edit);
    }

    /* renamed from: c */
    public void mo70041c() {
        String string = this.f50856c.getSharedPreferences("tt_state_config", 4).getString("tnc_delay_config", "");
        this.f50859f = string;
        if (!TextUtils.isEmpty(string)) {
            try {
                m75650b(new JSONObject(this.f50859f));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (this.f50857d) {
            mo70039a(TTAppStateManager.m56571b());
        }
    }

    /* renamed from: e */
    private void m75652e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.f50860g) {
            linkedHashMap.put("app_delay_enable", 1);
        } else {
            linkedHashMap.put("app_delay_enable", 0);
        }
        if (this.f50861h) {
            linkedHashMap.put("app_delay_use_black_list", 1);
        } else {
            linkedHashMap.put("app_delay_use_black_list", 0);
        }
        linkedHashMap.put("app_delay_whitelist_delay_time", Integer.valueOf(this.f50863j));
        String[] strArr = (String[]) this.f50864k.toArray(new String[0]);
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(",");
        }
        if (strArr.length > 0) {
            linkedHashMap.put("app_delay_white_list", sb.substring(0, sb.length() - 1));
        } else {
            linkedHashMap.put("app_delay_white_list", "");
        }
        linkedHashMap.put("app_delay_black_list", new JSONObject(this.f50865l).toString());
        TTNetInit.getTTNetDepend().mo69987a(this.f50856c, linkedHashMap);
        Intent intent = new Intent("com.bytedance.ttnet.config.appconfig.SYNC_APP_DELAY_CONFIG_ACTION");
        if (!TextUtils.isEmpty(f50854a)) {
            intent.setPackage(f50854a);
        }
        this.f50856c.sendBroadcast(intent);
    }

    /* renamed from: a */
    public static C20759f m75646a(Context context) {
        C20759f fVar;
        synchronized (C20759f.class) {
            if (f50855b == null) {
                boolean b = C14089g.m57048b(context);
                f50855b = new C20759f(context, b);
                f50854a = context.getPackageName();
                if (b) {
                    C20642m.m75055a(f50855b);
                } else {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.bytedance.ttnet.config.appconfig.SYNC_APP_DELAY_CONFIG_ACTION");
                    try {
                        m75645a(context, new C20762b(), intentFilter, null, null);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    C20642m.m75055a(C20764g.m75661c());
                }
            }
            fVar = f50855b;
        }
        return fVar;
    }

    /* renamed from: a */
    private synchronized void m75647a(C20761a aVar) {
        this.f50861h = false;
        this.f50865l.clear();
        this.f50863j = 100;
        this.f50864k.clear();
        this.f50862i = 1000;
        this.f50866m.clear();
        if (aVar == null) {
            this.f50860g = false;
        } else if (!aVar.f50871d.isEmpty()) {
            this.f50860g = true;
            this.f50863j = aVar.f50873f;
            this.f50864k = aVar.f50871d;
            this.f50862i = aVar.f50874g;
        } else if (!aVar.f50870c.isEmpty()) {
            this.f50860g = true;
            this.f50861h = true;
            this.f50865l = aVar.f50870c;
            this.f50862i = aVar.f50872e;
        }
        m75652e();
    }

    /* renamed from: b */
    private void m75650b(JSONObject jSONObject) {
        TTAppStateManager.AppStartState appStartState;
        JSONArray optJSONArray = jSONObject.optJSONArray("tt_req_delay_config");
        if (optJSONArray == null) {
            this.f50858e.clear();
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            C20761a aVar = new C20761a();
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("state", -2);
                if (optInt == -1) {
                    appStartState = TTAppStateManager.AppStartState.NormalStart;
                } else if (optInt == 0) {
                    appStartState = TTAppStateManager.AppStartState.ColdStart;
                } else if (optInt == 1) {
                    appStartState = TTAppStateManager.AppStartState.HotStart;
                } else if (optInt == 2) {
                    appStartState = TTAppStateManager.AppStartState.WarmStart;
                } else if (optInt == 3) {
                    appStartState = TTAppStateManager.AppStartState.WeakNet;
                }
                if (!optJSONObject.isNull("bl_with_delay_ms")) {
                    aVar.f50868a = true;
                    aVar.f50869b = true;
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("bl_with_delay_ms");
                    Iterator<String> keys = optJSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        aVar.f50870c.put(next, Integer.valueOf(optJSONObject2.optInt(next)));
                    }
                    aVar.f50872e = optJSONObject.optInt("bl_disable_time_ms", 1000);
                } else if (!optJSONObject.isNull("wl")) {
                    aVar.f50868a = true;
                    aVar.f50869b = false;
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("wl");
                    if (optJSONArray2 != null) {
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            aVar.f50871d.add((String) optJSONArray2.opt(i2));
                        }
                    }
                    aVar.f50873f = optJSONObject.optInt("delay_time_ms", 100);
                    aVar.f50874g = optJSONObject.optInt("wl_disable_time_ms", 1000);
                }
                this.f50858e.put(appStartState, aVar);
            }
        }
    }

    @Override // com.bytedance.retrofit2.C20642m.AbstractC20646b
    /* renamed from: a */
    public int mo69467a(String str) {
        Map<String, Integer> map;
        boolean z = this.f50861h;
        int i = 0;
        if (z && (map = this.f50865l) != null) {
            Iterator<String> it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (!TextUtils.isEmpty(next) && str.startsWith(next)) {
                    Integer num = this.f50865l.get(next);
                    if (num != null) {
                        i = num.intValue();
                    }
                }
            }
        } else if (!z && C20765a.m75667a(str, this.f50864k)) {
            i = this.f50863j;
        }
        if (i > 0) {
            this.f50867n.incrementAndGet();
            this.f50866m.put(str, Integer.valueOf(i));
        }
        return i;
    }

    /* renamed from: a */
    public void mo70039a(TTAppStateManager.AppStartState appStartState) {
        m75647a(this.f50858e.get(appStartState));
        TTAppStateManager.m56570a(appStartState);
        if (appStartState == TTAppStateManager.AppStartState.ColdStart && this.f50860g) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                /* class com.bytedance.ttnet.config.$$Lambda$f$p3rRv0uIkUjubM0pAGbbwTEViiY */

                public final void run() {
                    C20759f.this.m75653f();
                }
            }, (long) this.f50862i);
        }
    }

    /* renamed from: a */
    public void mo70040a(JSONObject jSONObject) {
        this.f50859f = jSONObject.toString();
        m75651d();
        m75650b(jSONObject);
        m75646a(this.f50856c).mo70039a(TTAppStateManager.m56571b());
    }

    @Override // com.bytedance.retrofit2.C20642m.AbstractC20646b
    /* renamed from: a */
    public int mo69468a(String str, String str2) {
        return C14073i.m56967a().mo51749a(str, str2);
    }

    private C20759f(Context context, boolean z) {
        this.f50856c = context.getApplicationContext();
        this.f50857d = z;
    }

    /* renamed from: a */
    public static void m75648a(Map<String, Integer> map, String str) {
        if (map != null) {
            map.clear();
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = null;
                try {
                    jSONObject = new JSONObject(str);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    map.put(next, Integer.valueOf(jSONObject.optInt(next)));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m75649a(Set<String> set, String str) {
        if (set != null) {
            set.clear();
            if (!TextUtils.isEmpty(str)) {
                set.addAll(Arrays.asList(str.split(",")));
            }
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m75645a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, str, handler);
            }
            throw e;
        }
    }
}
