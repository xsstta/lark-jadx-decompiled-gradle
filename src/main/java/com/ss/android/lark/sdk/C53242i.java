package com.ss.android.lark.sdk;

import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.sdk.C53248k;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.sdk.i */
public class C53242i {

    /* renamed from: b */
    private static int f131574b = 300;

    /* renamed from: c */
    private static long f131575c = 300000;

    /* renamed from: a */
    AbstractC53236c f131576a = C53254m.m205930f();

    /* renamed from: d */
    private Map<Command, C53244a> f131577d = new ConcurrentHashMap();

    /* renamed from: e */
    private int f131578e = 0;

    /* renamed from: f */
    private int f131579f = 0;

    /* renamed from: g */
    private int f131580g = 0;

    /* renamed from: h */
    private long f131581h = System.currentTimeMillis();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.sdk.i$b */
    public static class C53245b {

        /* renamed from: a */
        public static String f131593a = "lark_android_ui_receive_push_metrics";

        /* renamed from: b */
        public static String f131594b = "lark_android_ui_receive_push_metrics_by_command";

        /* renamed from: c */
        public static String f131595c = "command";

        /* renamed from: d */
        public static String f131596d = "total_push_num";

        /* renamed from: e */
        public static String f131597e = "unused_push_num";

        /* renamed from: f */
        public static String f131598f = "background_push_num";

        /* renamed from: g */
        public static String f131599g = "foreground_push_num";
    }

    /* renamed from: com.ss.android.lark.sdk.i$a */
    public class C53244a {

        /* renamed from: a */
        public String f131587a;

        /* renamed from: b */
        public int f131588b;

        /* renamed from: c */
        public int f131589c;

        /* renamed from: d */
        public int f131590d;

        /* renamed from: f */
        private Command f131592f;

        /* renamed from: a */
        public void mo181693a() {
            this.f131588b++;
        }

        /* renamed from: b */
        public void mo181694b() {
            this.f131589c++;
        }

        /* renamed from: c */
        public void mo181695c() {
            this.f131590d++;
        }

        public C53244a(Command command) {
            this.f131592f = command;
            this.f131587a = command.name().toLowerCase();
            if (command == Command.PUSH_LOAD_FEED_CARDS_STATUS) {
                this.f131587a = "push_load_feed_card_status";
            }
        }

        public C53244a(C53244a aVar) {
            this.f131592f = aVar.f131592f;
            this.f131587a = aVar.f131587a;
            this.f131590d = aVar.f131590d;
            this.f131589c = aVar.f131589c;
            this.f131588b = aVar.f131588b;
        }
    }

    /* renamed from: a */
    private void m205902a() {
        this.f131578e = 0;
        this.f131579f = 0;
        this.f131580g = 0;
        this.f131577d.clear();
    }

    /* renamed from: a */
    private Map<Command, C53244a> m205901a(Map<Command, C53244a> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Command, C53244a> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), new C53244a(entry.getValue()));
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m205903a(long j) {
        if (this.f131576a != null) {
            final int i = this.f131578e;
            final int i2 = this.f131579f;
            final int i3 = this.f131580g;
            final Map<Command, C53244a> a = m205901a(this.f131577d);
            CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable() {
                /* class com.ss.android.lark.sdk.C53242i.RunnableC532431 */

                public void run() {
                    C53242i.this.f131576a.mo103042a(C53245b.f131593a, C53242i.this.mo181689a(i, i2, i3, a));
                    for (C53244a aVar : a.values()) {
                        C53242i.this.f131576a.mo103042a(C53245b.f131594b, C53242i.this.mo181690a(aVar));
                    }
                }
            });
        }
        m205902a();
        this.f131581h = j;
    }

    /* renamed from: a */
    public JSONObject mo181690a(C53244a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C53245b.f131595c, aVar.f131587a);
            jSONObject.put(C53245b.f131596d, aVar.f131588b);
            jSONObject.put(C53245b.f131599g, aVar.f131590d);
            jSONObject.put(C53245b.f131598f, aVar.f131589c);
        } catch (Exception e) {
            C53241h.m205895a("PushCommandMetrics", "genPushCommandMetricsJson: error occurs: " + e.getMessage(), e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo181691a(Command command, C53248k.AbstractC53250a aVar, long j) {
        boolean z;
        AbstractC53236c cVar = this.f131576a;
        if (cVar != null) {
            z = cVar.mo103043a();
            if (!z) {
                this.f131578e++;
            }
        } else {
            z = true;
        }
        this.f131579f++;
        if (aVar == null) {
            this.f131580g++;
            return;
        }
        C53244a aVar2 = this.f131577d.get(command);
        if (aVar2 == null) {
            aVar2 = new C53244a(command);
            this.f131577d.put(command, aVar2);
        }
        aVar2.mo181693a();
        if (z) {
            aVar2.mo181695c();
        } else {
            aVar2.mo181694b();
        }
        int i = this.f131579f;
        if (i >= f131574b) {
            m205903a(j);
        } else if (i > 0 && j - this.f131581h > f131575c) {
            m205903a(j);
        }
    }

    /* renamed from: a */
    public JSONObject mo181689a(int i, int i2, int i3, Map<Command, C53244a> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C53245b.f131596d, i2);
            jSONObject.put(C53245b.f131598f, i);
            jSONObject.put(C53245b.f131597e, i3);
            for (C53244a aVar : map.values()) {
                if (aVar != null && aVar.f131588b > 0) {
                    jSONObject.put(aVar.f131587a, aVar.f131588b);
                }
            }
        } catch (Exception e) {
            C53241h.m205895a("PushCommandMetrics", "genPushCommandMetricsJson: error occurs: " + e.getMessage(), e);
        }
        return jSONObject;
    }
}
