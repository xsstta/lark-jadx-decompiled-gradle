package com.bytedance.p234e;

import android.content.Context;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.e.g */
public class C4031g {

    /* renamed from: c */
    private static C4031g f12219c;

    /* renamed from: a */
    public C4023b f12220a = null;

    /* renamed from: b */
    public final HashMap<String, C4036h> f12221b;

    /* renamed from: d */
    private final ReentrantReadWriteLock f12222d = new ReentrantReadWriteLock();

    /* renamed from: e */
    private final ArrayList<AbstractC4030f> f12223e = new ArrayList<>();

    /* renamed from: f */
    private Context f12224f = null;

    /* renamed from: g */
    private boolean f12225g = true;

    /* renamed from: h */
    private long f12226h = 0;

    /* renamed from: i */
    private int f12227i = 600;

    /* renamed from: j */
    private long f12228j = 0;

    /* renamed from: k */
    private Timer f12229k = null;

    /* renamed from: l */
    private TimerTask f12230l = null;

    /* renamed from: m */
    private final long f12231m = 0;

    /* renamed from: a */
    public static Thread m16732a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: a */
    public void mo15780a(final int i) {
        m16732a(new Thread(new Runnable() {
            /* class com.bytedance.p234e.C4031g.RunnableC40321 */

            public void run() {
                if ((i & 8) > 0) {
                    C4031g.this.mo15788c("common");
                }
                if ((i & 2) > 0) {
                    C4031g.this.mo15788c("mdl");
                }
                if ((i & 1) > 0) {
                    C4031g.this.mo15788c("vod");
                }
                if ((i & 4) > 0) {
                    C4031g.this.mo15788c("upload");
                }
            }
        })).start();
    }

    /* renamed from: a */
    public void mo15784a(final String str, boolean z) {
        if (z) {
            m16732a(new Thread(new Runnable() {
                /* class com.bytedance.p234e.C4031g.RunnableC40332 */

                public void run() {
                    C4031g.this.mo15787b(str, true);
                }
            })).start();
        } else {
            mo15787b(str, true);
        }
    }

    /* renamed from: a */
    public void mo15782a(String str) {
        C4023b bVar = this.f12220a;
        if (bVar != null) {
            bVar.mo15765a(str, (String) null, true);
        }
    }

    /* renamed from: a */
    public JSONArray mo15779a(String str, String str2) {
        return this.f12221b.get(str).mo15793a(str2);
    }

    /* renamed from: a */
    public void mo15783a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject != null) {
            C4036h hVar = this.f12221b.get(str);
            JSONObject b = hVar.mo15801b();
            if (b == null || !b.toString().equals(jSONObject.toString())) {
                hVar.mo15797a(jSONObject, str2 != null);
                m16733a(str, 1000);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo15781a(long j) {
        TimerTask timerTask = this.f12230l;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.f12230l = new TimerTask() {
            /* class com.bytedance.p234e.C4031g.C40343 */

            public void run() {
                C4031g.this.mo15782a("all");
            }
        };
        Timer timer = this.f12229k;
        if (timer != null) {
            timer.purge();
        } else {
            this.f12229k = new Timer(true);
        }
        if (j * 1000 < 1000) {
            j = 86400;
        }
        C4027d.m16726a("Manager", "reset schedule");
        try {
            long j2 = j * 1000;
            this.f12229k.schedule(this.f12230l, j2, j2);
        } catch (Throwable th) {
            C4027d.m16728b("Manager", "reset schedule fail. " + th.toString());
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C4031g m16731a() {
        C4031g gVar;
        synchronized (C4031g.class) {
            if (f12219c == null) {
                f12219c = new C4031g();
            }
            gVar = f12219c;
        }
        return gVar;
    }

    private C4031g() {
        HashMap<String, C4036h> hashMap = new HashMap<>();
        this.f12221b = hashMap;
        hashMap.put("vod", new C4036h("vod", 3));
        hashMap.put("mdl", new C4036h("mdl", 3));
        hashMap.put("upload", new C4036h("upload", 3));
        hashMap.put("common", new C4036h("common", 2));
    }

    /* renamed from: a */
    public C4031g mo15776a(AbstractC4028e eVar) {
        this.f12220a.mo15761a(eVar);
        return this;
    }

    /* renamed from: b */
    public JSONArray mo15785b(String str) {
        return mo15779a("vod", str);
    }

    /* renamed from: c */
    public void mo15788c(String str) {
        C4036h hVar = this.f12221b.get(str);
        if (!hVar.mo15798a(this.f12224f.getApplicationContext())) {
            return;
        }
        if (this.f12225g) {
            m16733a(str, 1000);
        } else {
            hVar.mo15794a();
        }
    }

    /* renamed from: a */
    public C4031g mo15775a(Context context) {
        if (this.f12224f == null) {
            this.f12224f = context;
            this.f12220a = new C4023b(context.getApplicationContext(), new C4035a(this));
        }
        return this;
    }

    /* renamed from: a */
    public C4031g mo15777a(boolean z) {
        this.f12220a.mo15762a(z);
        C4027d.m16727a(z);
        return this;
    }

    /* renamed from: com.bytedance.e.g$a */
    private class C4035a implements AbstractC4026c {

        /* renamed from: b */
        private final WeakReference<C4031g> f12238b;

        C4035a(C4031g gVar) {
            this.f12238b = new WeakReference<>(gVar);
        }

        @Override // com.bytedance.p234e.AbstractC4026c
        /* renamed from: a */
        public void mo15768a(int i, String str, JSONObject jSONObject) {
            mo15769a(i, str, jSONObject, null, null);
        }

        @Override // com.bytedance.p234e.AbstractC4026c
        /* renamed from: a */
        public void mo15769a(int i, String str, JSONObject jSONObject, String str2, String str3) {
            C4031g gVar = this.f12238b.get();
            if (gVar != null) {
                C4027d.m16726a("Manager", "refresh settings: code " + i + ", message = " + str);
                if (i != 0) {
                    C4027d.m16728b("Manager", "refresh data fail. code = " + i);
                    return;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("general_settings");
                if (optJSONObject != null) {
                    long optLong = optJSONObject.optLong("config_version");
                    gVar.f12220a.mo15760a(optLong);
                    C4036h hVar = C4031g.this.f12221b.get("common");
                    hVar.mo15796a("config_version", optLong);
                    int optInt = optJSONObject.optInt("fetch_interval");
                    if (optInt > 0 && optInt != hVar.mo15799b("fetch_interval", -1)) {
                        hVar.mo15795a("fetch_interval", optInt);
                        gVar.f12220a.mo15759a(optInt);
                        C4031g.this.mo15781a((long) optInt);
                    }
                    long optLong2 = optJSONObject.optLong("local_cache_expire");
                    if (optLong2 > 0) {
                        hVar.mo15796a("local_cache_expire", System.currentTimeMillis() + (optLong2 * 1000));
                    }
                    boolean optBoolean = optJSONObject.optBoolean("use_local_cache");
                    hVar.mo15795a("use_local_cache", optBoolean ? 1 : 0);
                    if (!optBoolean) {
                        C4031g.this.f12221b.get("vod").mo15794a();
                        C4031g.this.f12221b.get("mdl").mo15794a();
                        C4031g.this.f12221b.get("upload").mo15794a();
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("custom_settings");
                if (optJSONObject2 == null) {
                    return;
                }
                if (str2 == null || str2.equals("all")) {
                    C4031g.this.mo15783a("vod", str3, optJSONObject2.optJSONObject("vod"));
                    C4031g.this.mo15783a("mdl", str3, optJSONObject2.optJSONObject("mdl"));
                    C4031g.this.mo15783a("upload", str3, optJSONObject2.optJSONObject("upload"));
                    return;
                }
                C4031g.this.mo15783a(str2, str3, optJSONObject2.optJSONObject(str2));
            }
        }
    }

    /* renamed from: b */
    public JSONObject mo15786b(String str, String str2) {
        return this.f12221b.get(str).mo15802b(str2);
    }

    /* renamed from: a */
    private void m16733a(String str, int i) {
        this.f12222d.readLock().lock();
        Iterator<AbstractC4030f> it = this.f12223e.iterator();
        while (it.hasNext()) {
            it.next().mo15772a(str, i);
        }
        this.f12222d.readLock().unlock();
    }

    /* renamed from: b */
    public synchronized void mo15787b(String str, boolean z) {
        if (this.f12226h < 1) {
            C4036h hVar = this.f12221b.get("common");
            hVar.mo15798a(this.f12224f.getApplicationContext());
            boolean z2 = false;
            try {
                this.f12227i = hVar.mo15799b("fetch_interval", 0);
                this.f12228j = hVar.mo15800b("config_version", 0L);
                this.f12226h = hVar.mo15800b("local_cache_expire", 0L);
                if (hVar.mo15799b("use_local_cache", 1) > 0) {
                    z2 = true;
                }
                this.f12225g = z2;
            } catch (Throwable th) {
                C4027d.m16728b("Manager", th.toString());
            }
            mo15788c("vod");
            mo15788c("mdl");
            mo15788c("upload");
        }
        C4023b bVar = this.f12220a;
        if (bVar != null) {
            bVar.mo15759a(this.f12227i);
            this.f12220a.mo15760a(this.f12228j);
        }
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            C4027d.m16726a("Manager", "use cache: " + this.f12225g + ", expire = " + this.f12226h + ", curTimeMs = " + currentTimeMillis);
            if (!this.f12225g || this.f12226h <= currentTimeMillis) {
                mo15782a(str);
            }
        }
        mo15781a((long) this.f12227i);
    }

    /* renamed from: a */
    public int mo15773a(String str, String str2, int i) {
        return this.f12221b.get(str).mo15799b(str2, i);
    }

    /* renamed from: a */
    public long mo15774a(String str, String str2, long j) {
        return this.f12221b.get(str).mo15800b(str2, j);
    }

    /* renamed from: a */
    public String mo15778a(String str, String str2, String str3) {
        return this.f12221b.get(str).mo15792a(str2, str3);
    }
}
