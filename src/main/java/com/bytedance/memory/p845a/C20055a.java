package com.bytedance.memory.p845a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.crash.Npth;
import com.bytedance.memory.heap.C20092a;
import com.bytedance.memory.model.MemoryWidgetConfig;
import com.bytedance.memory.p846b.AbstractC20059a;
import com.bytedance.memory.p846b.C20060b;
import com.bytedance.memory.p846b.C20063c;
import com.bytedance.memory.p846b.C20066d;
import com.bytedance.memory.p846b.C20067e;
import com.bytedance.memory.p846b.C20069g;
import com.bytedance.memory.p847c.C20073b;
import com.bytedance.memory.p847c.C20074c;
import com.bytedance.memory.p848d.C20076a;
import com.bytedance.memory.p849e.C20077a;
import com.bytedance.memory.p850f.C20083a;
import com.bytedance.memory.p851g.AbstractC20089b;
import com.bytedance.memory.p851g.C20087a;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONObject;

/* renamed from: com.bytedance.memory.a.a */
public class C20055a {

    /* renamed from: g */
    private static volatile C20055a f48994g;

    /* renamed from: a */
    public MemoryWidgetConfig f48995a;

    /* renamed from: b */
    public long f48996b;

    /* renamed from: c */
    public volatile boolean f48997c;

    /* renamed from: d */
    public AbstractC20059a f48998d = new AbstractC20059a() {
        /* class com.bytedance.memory.p845a.C20055a.C200561 */

        @Override // com.bytedance.memory.p846b.AbstractC20059a
        /* renamed from: a */
        public void mo68029a() {
            C20074c.m73254a().mo68051a(System.currentTimeMillis());
        }

        @Override // com.bytedance.memory.p846b.AbstractC20059a
        /* renamed from: b */
        public boolean mo68030b() {
            return C20073b.m73242i().mo68046e();
        }

        @Override // com.bytedance.memory.p846b.AbstractC20059a
        /* renamed from: d */
        public boolean mo68032d() {
            return C20055a.m73200c().mo68024b();
        }

        @Override // com.bytedance.memory.p846b.AbstractC20059a
        /* renamed from: c */
        public boolean mo68031c() {
            if (C20055a.m73200c().mo68024b() || !C20092a.m73301a().mo68100j()) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: e */
    public volatile boolean f48999e;

    /* renamed from: f */
    private Context f49000f;

    /* renamed from: h */
    private volatile boolean f49001h;

    /* renamed from: i */
    private String f49002i;

    /* renamed from: a */
    public String mo68020a() {
        return this.f49002i;
    }

    private C20055a() {
    }

    /* renamed from: f */
    public Context mo68027f() {
        C20069g.m73232a(this.f49000f, "You must call init() first before using !!!");
        return this.f49000f;
    }

    /* renamed from: c */
    public static C20055a m73200c() {
        if (f48994g == null) {
            synchronized (C20055a.class) {
                if (f48994g == null) {
                    f48994g = new C20055a();
                }
            }
        }
        return f48994g;
    }

    /* renamed from: b */
    public boolean mo68024b() {
        try {
            MemoryWidgetConfig memoryWidgetConfig = this.f48995a;
            if (memoryWidgetConfig == null || !memoryWidgetConfig.isDebug() || !C20066d.m73229a(this.f49000f)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C20063c.m73220a(Log.getStackTraceString(e), new Object[0]);
            return false;
        }
    }

    /* renamed from: g */
    public MemoryWidgetConfig mo68028g() {
        MemoryWidgetConfig memoryWidgetConfig = this.f48995a;
        C20069g.m73232a(memoryWidgetConfig, MemoryWidgetConfig.class.getSimpleName() + " mustn't be null");
        return this.f48995a;
    }

    /* renamed from: d */
    public void mo68025d() {
        if (!this.f48999e) {
            C20063c.m73220a("MemoryApi start", new Object[0]);
            this.f48999e = true;
            C20069g.m73233a(this.f49001h, "You must call init() first before using !!!");
            C20060b.f49007b.mo68035a(new Runnable() {
                /* class com.bytedance.memory.p845a.C20055a.RunnableC200583 */

                public void run() {
                    if (C20055a.this.f48995a.getRunStrategy() == 2 && C20074c.m73254a().mo68053c()) {
                        C20087a.m73278a().mo68063a(C20055a.this.f48995a, C20055a.this.f48998d);
                    }
                    C20055a.this.mo68026e();
                    C20055a.this.f48999e = false;
                }
            }, "MemoryApi-start");
        }
    }

    /* renamed from: e */
    public void mo68026e() {
        if (!C20092a.m73301a().mo68092b()) {
            C20092a.m73301a().mo68105o();
            if (this.f48995a.clientAnalyse()) {
                C20063c.m73220a("client analyze mode", new Object[0]);
                if (!this.f48997c && C20073b.m73242i().mo68046e()) {
                    try {
                        C20066d.m73227a(this.f49000f, Class.forName("com.bytedance.apm.momory.analyzer.AnalyzerService"), true);
                        Intent intent = new Intent(this.f49000f, Class.forName("com.bytedance.apm.momory.analyzer.AnalyzerService"));
                        intent.putExtra("hprofFilePath", C20073b.m73242i().mo68048g().getAbsolutePath());
                        intent.putExtra("debug", this.f48995a.isDebug());
                        this.f49000f.startService(intent);
                        this.f48996b = System.currentTimeMillis();
                        C20063c.m73220a("start Service success", new Object[0]);
                        C20076a.m73263a("client_analyze_begin");
                        this.f48997c = true;
                    } catch (Throwable th) {
                        C20063c.m73220a("start Service failed", new Object[0]);
                        this.f48995a.setClientAnalyse(false);
                        th.printStackTrace();
                    }
                }
            } else {
                C20063c.m73220a("upload mode", new Object[0]);
                C20083a.m73277b();
            }
        }
    }

    /* renamed from: a */
    public void mo68021a(Context context) {
        this.f49000f = context;
    }

    /* renamed from: a */
    public void mo68023a(String str) {
        this.f49002i = str;
    }

    /* renamed from: a */
    private void m73199a(Context context, AbstractC20089b bVar) {
        m73198a(context.getApplicationContext(), new BroadcastReceiver() {
            /* class com.bytedance.memory.p845a.C20055a.C200572 */

            public void onReceive(Context context, Intent intent) {
                C20063c.m73220a("ResultReceiver onReceive", new Object[0]);
                C20055a.this.f48997c = false;
                if (intent.hasExtra("Key_Result_Client_Memory")) {
                    String stringExtra = intent.getStringExtra("Key_Result_Client_Memory");
                    try {
                        if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(new JSONObject(stringExtra).optString("memory_object"))) {
                            C20063c.m73220a("can upload", new Object[0]);
                            C20076a.m73263a("client_analyze_end");
                            C20076a.m73264a("client_analyze_time", System.currentTimeMillis() - C20055a.this.f48996b);
                            C20083a.m73276a(stringExtra);
                        }
                        C20063c.m73220a("deleteCache", new Object[0]);
                        C20092a.m73301a().mo68104n();
                    } catch (Exception e) {
                        C20063c.m73220a("deleteCache catch", new Object[0]);
                        e.printStackTrace();
                    }
                }
            }
        }, new IntentFilter("Action_Result_Memory_Client_Analyzer"));
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m73198a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public void mo68022a(Context context, MemoryWidgetConfig memoryWidgetConfig, AbstractC20089b bVar) {
        if (!this.f49001h) {
            C20069g.m73232a(context, Context.class.getSimpleName() + " mustn't be null");
            C20069g.m73232a(memoryWidgetConfig, MemoryWidgetConfig.class.getSimpleName() + " mustn't be null");
            this.f49000f = context;
            this.f48995a = memoryWidgetConfig;
            C20067e.f49011a = memoryWidgetConfig.isDebug();
            if (memoryWidgetConfig.clientAnalyse()) {
                m73199a(context, bVar);
            }
            Npth.registerOOMCallback(new C20077a());
            this.f49001h = true;
        }
    }
}
