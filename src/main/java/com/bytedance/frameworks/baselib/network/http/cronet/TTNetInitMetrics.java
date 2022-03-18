package com.bytedance.frameworks.baselib.network.http.cronet;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class TTNetInitMetrics {

    /* renamed from: H */
    public static volatile TTNetInitMetrics f36564H = null;

    /* renamed from: I */
    static final /* synthetic */ boolean f36565I = true;

    /* renamed from: a */
    public static final String f36566a = "TTNetInitMetrics";

    /* renamed from: A */
    public long f36567A = -1;

    /* renamed from: B */
    public long f36568B = -1;

    /* renamed from: C */
    public long f36569C = -1;

    /* renamed from: D */
    public long f36570D = -1;

    /* renamed from: E */
    public long f36571E = -1;

    /* renamed from: F */
    public long f36572F = -1;

    /* renamed from: G */
    public long f36573G = -1;

    /* renamed from: b */
    public CronetInitMode f36574b = CronetInitMode.NONE;

    /* renamed from: c */
    public boolean f36575c = f36565I;

    /* renamed from: d */
    public int f36576d;

    /* renamed from: e */
    public long f36577e;

    /* renamed from: f */
    public long f36578f;

    /* renamed from: g */
    public long f36579g;

    /* renamed from: h */
    public long f36580h;

    /* renamed from: i */
    public long f36581i;

    /* renamed from: j */
    public long f36582j;

    /* renamed from: k */
    public long f36583k;

    /* renamed from: l */
    public long f36584l;

    /* renamed from: m */
    public long f36585m;

    /* renamed from: n */
    public long f36586n;

    /* renamed from: o */
    public long f36587o;

    /* renamed from: p */
    public long f36588p;

    /* renamed from: q */
    public long f36589q;

    /* renamed from: r */
    public long f36590r;

    /* renamed from: s */
    public long f36591s;

    /* renamed from: t */
    public long f36592t = -1;

    /* renamed from: u */
    public long f36593u = -1;

    /* renamed from: v */
    public long f36594v = -1;

    /* renamed from: w */
    public long f36595w = -1;

    /* renamed from: x */
    public long f36596x = -1;

    /* renamed from: y */
    public long f36597y = -1;

    /* renamed from: z */
    public long f36598z = -1;

    /* renamed from: b */
    public static TTNetInitMetrics m56573b() {
        if (f36564H == null) {
            synchronized (TTNetInitMetrics.class) {
                if (f36564H == null) {
                    f36564H = new TTNetInitMetrics();
                }
            }
        }
        return f36564H;
    }

    /* renamed from: a */
    public boolean mo51511a() {
        if (this.f36574b == CronetInitMode.PRE_INIT || this.f36574b == CronetInitMode.FORCE_INIT) {
            return f36565I;
        }
        return false;
    }

    /* renamed from: c */
    public JSONObject mo51512c() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("mode", this.f36574b.initMode);
            jSONObject.put("is_main_process", this.f36575c);
            jSONObject.put("net_thread_priority", this.f36576d);
            jSONObject2.put("ttnet_start", this.f36577e);
            jSONObject2.put("ttnet_end", this.f36578f);
            jSONObject2.put("engine_start", this.f36582j);
            jSONObject2.put("engine_end", this.f36583k);
            jSONObject2.put("init_start", this.f36584l);
            jSONObject2.put("init_end", this.f36585m);
            jSONObject2.put("network_start", this.f36588p);
            jSONObject2.put("network_end", this.f36589q);
            jSONObject2.put("exec_wait_end", this.f36590r);
            jSONObject2.put("preconnect_start", this.f36591s);
            jSONObject3.put("builder_build", this.f36592t);
            jSONObject3.put("load_cronet", this.f36593u);
            jSONObject3.put("init_mssdk", this.f36581i);
            m56572a(jSONObject3, "init_ttnet", this.f36577e, this.f36578f);
            m56572a(jSONObject3, "init_metasec", this.f36579g, this.f36580h);
            m56572a(jSONObject3, "create_engine", this.f36582j, this.f36583k);
            m56572a(jSONObject3, "init_thread", this.f36584l, this.f36585m);
            m56572a(jSONObject3, "native_init_thread", this.f36586n, this.f36587o);
            m56572a(jSONObject3, "network_thread", this.f36588p, this.f36589q);
            m56572a(jSONObject3, "exec_tasks", this.f36589q, this.f36590r);
            m56572a(jSONObject3, "init_total", this.f36577e, this.f36589q);
            m56572a(jSONObject3, "init_preconnect", this.f36577e, this.f36591s);
            jSONObject3.put("nqe_init", this.f36594v);
            jSONObject3.put("prefs_init", this.f36595w);
            jSONObject3.put("channel_init", this.f36596x);
            jSONObject3.put("context_build", this.f36597y);
            jSONObject3.put("tnc_config", this.f36598z);
            jSONObject3.put("update_appinfo", this.f36567A);
            jSONObject3.put("netlog_init", this.f36568B);
            jSONObject3.put("nqe_detect", this.f36569C);
            jSONObject3.put("preconnect", this.f36570D);
            jSONObject3.put("ssl_session", this.f36571E);
            jSONObject3.put("ttnet_config", this.f36572F);
            jSONObject3.put("install_cert", this.f36573G);
            jSONObject.put("ttnet_timestamp", jSONObject2);
            jSONObject.put("ttnet_duration", jSONObject3);
        } catch (JSONException unused) {
        }
        String str = f36566a;
        Logger.m15167d(str, "cronet init metrics json: " + jSONObject.toString());
        return jSONObject;
    }

    /* renamed from: a */
    public void mo51509a(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        m56574b(context, null);
        this.f36581i = System.currentTimeMillis() - currentTimeMillis;
    }

    /* renamed from: b */
    private boolean m56574b(Context context, List<Long> list) {
        Class<?> cls;
        HashMap hashMap = null;
        try {
            cls = Class.forName("com.bytedance.mobsec.metasec.ml.MSB");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            try {
                cls = Class.forName("com.bytedance.mobsec.metasec.ov.MSB");
            } catch (ClassNotFoundException unused2) {
            }
        }
        if (cls == null) {
            return false;
        }
        if (list != null) {
            try {
                if (list.size() == 2) {
                    hashMap = new HashMap();
                    hashMap.put("http_callback", String.valueOf(list.get(0)));
                    hashMap.put("ws_callback", String.valueOf(list.get(1)));
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
        cls.getMethod(AbstractC60044a.f149675a, Context.class, Integer.TYPE, Map.class).invoke(cls, context, 1, hashMap);
        return f36565I;
    }

    /* renamed from: a */
    public void mo51510a(Context context, List<Long> list) {
        if (!f36565I && list.size() != 2) {
            throw new AssertionError();
        } else if (list != null && list.size() == 2) {
            String str = f36566a;
            Logger.m15167d(str, "http address: " + list.get(0) + " ws address: " + list.get(1));
            this.f36579g = System.currentTimeMillis();
            if (!m56574b(context, list)) {
                Logger.m15167d(str, "init mssdk failed.");
            }
            this.f36580h = System.currentTimeMillis();
        }
    }

    public enum CronetInitMode {
        NONE(0),
        LAZY_INIT(1),
        PRE_INIT(2),
        FORCE_INIT(3);
        
        final int initMode;

        private CronetInitMode(int i) {
            this.initMode = i;
        }
    }

    /* renamed from: a */
    private void m56572a(JSONObject jSONObject, String str, long j, long j2) {
        if (j > j2) {
            try {
                jSONObject.put(str, -1);
            } catch (JSONException unused) {
            }
        } else {
            jSONObject.put(str, j2 - j);
        }
    }
}
