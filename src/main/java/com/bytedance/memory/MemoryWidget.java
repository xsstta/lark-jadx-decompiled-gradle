package com.bytedance.memory;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.apm.AbstractC2913d;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.p129b.C2787b;
import com.bytedance.apm.util.C3122i;
import com.bytedance.memory.model.MemoryWidgetConfig;
import com.bytedance.memory.p845a.C20055a;
import com.bytedance.memory.p846b.C20063c;
import com.bytedance.memory.p847c.C20071a;
import com.bytedance.memory.p847c.C20073b;
import com.bytedance.memory.p848d.C20076a;
import com.bytedance.memory.p849e.C20078b;
import com.bytedance.memory.p850f.C20083a;
import com.bytedance.memory.p851g.AbstractC20089b;
import com.bytedance.memory.p851g.C20087a;
import com.bytedance.services.apm.api.C20703h;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public class MemoryWidget extends AbstractC2913d {
    private Context mAppContext;
    private volatile boolean mCheckedFolder;
    private boolean mClientAnalyze;
    private boolean mEnable;
    private volatile boolean mInitEd;
    private boolean mIsDebug;
    private MemoryWidgetConfig mMemoryWidgetConfig;
    private volatile boolean mNeedStop;
    private AbstractC20089b mResultListener;
    private JSONObject memory;

    @Override // com.bytedance.services.apm.api.AbstractC20702g, com.bytedance.apm.AbstractC2913d
    public boolean isOnlyMainProcess() {
        return false;
    }

    @Override // com.bytedance.services.apm.api.AbstractC20702g, com.bytedance.apm.AbstractC2913d
    public void start() {
        super.start();
    }

    private boolean ableToInit() {
        if (this.mEnable || this.mIsDebug) {
            return true;
        }
        return false;
    }

    private boolean inited() {
        if (!this.mInitEd || !ableToInit()) {
            return false;
        }
        return true;
    }

    public MemoryWidget(MemoryWidgetConfig memoryWidgetConfig) {
        this.mMemoryWidgetConfig = memoryWidgetConfig;
    }

    private void parseConfig(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("memory");
            this.memory = optJSONObject2;
            if (optJSONObject2 != null) {
                boolean z = false;
                if (optJSONObject2.optInt("enable_widget_memory", 0) == 1) {
                    z = true;
                }
                this.mEnable = z;
            }
        }
    }

    @Override // com.bytedance.apm.AbstractC2913d, com.bytedance.services.apm.api.AbstractC20698c
    public void onBackground(Activity activity) {
        super.onBackground(activity);
        if (inited() && this.mMemoryWidgetConfig.getRunStrategy() == 2) {
            C20087a.m73278a().mo68067c();
        }
    }

    @Override // com.bytedance.services.apm.api.AbstractC20702g, com.bytedance.apm.AbstractC2913d
    public void init(Context context) {
        String str;
        super.init(context);
        this.mAppContext = context;
        registerConfigService();
        C20055a.m73200c().mo68021a(this.mAppContext);
        C20055a c = C20055a.m73200c();
        MemoryWidgetConfig memoryWidgetConfig = this.mMemoryWidgetConfig;
        if (memoryWidgetConfig != null) {
            str = memoryWidgetConfig.getFilePath();
        } else {
            str = "";
        }
        c.mo68023a(str);
        try {
            C20073b.m73242i();
        } catch (Exception unused) {
            this.mNeedStop = true;
        }
    }

    @Override // com.bytedance.services.apm.api.AbstractC20702g
    public void notifyParams(C20703h hVar) {
        List<String> a;
        if (hVar != null && (a = hVar.mo69905a()) != null && a.size() > 0) {
            List<String> convertHost = convertHost(a, "/monitor/collect/c/memory_upload_check?aid=%d&os=android");
            if (convertHost != null && convertHost.size() > 0) {
                C20083a.f49036a = convertHost;
            }
            List<String> convertHost2 = convertHost(a, "/monitor/collect/c/mom_dump_collect");
            if (convertHost2 != null && convertHost2.size() > 0) {
                C20083a.f49037b = convertHost2;
            }
            List<String> convertHost3 = convertHost(a, "/monitor/collect/c/exception");
            if (convertHost3 != null && convertHost3.size() > 0) {
                C20083a.f49038c = convertHost3;
            }
        }
    }

    @Override // com.bytedance.apm.AbstractC2913d, com.bytedance.services.apm.api.AbstractC20698c
    public void onFront(Activity activity) {
        super.onFront(activity);
        if (inited() && this.mMemoryWidgetConfig.getRunStrategy() == 2) {
            C20063c.m73220a("onFront", new Object[0]);
            C20055a.m73200c().mo68025d();
        }
    }

    public MemoryWidget(MemoryWidgetConfig memoryWidgetConfig, AbstractC20089b bVar) {
        this.mMemoryWidgetConfig = memoryWidgetConfig;
        this.mResultListener = bVar;
    }

    private List<String> convertHost(List<String> list, String str) {
        try {
            if (!C3122i.m13009a(list)) {
                ArrayList arrayList = new ArrayList(2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String host = new URL(list.get(i)).getHost();
                    if (!TextUtils.isEmpty(host) && host.indexOf(46) > 0) {
                        arrayList.add("https://" + host + str);
                    }
                }
                return arrayList;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override // com.bytedance.services.slardar.config.AbstractC20704a, com.bytedance.apm.AbstractC2913d
    public void onRefresh(JSONObject jSONObject, boolean z) {
        long j;
        boolean z2;
        super.onRefresh(jSONObject, z);
        if (!this.mNeedStop) {
            this.mIsDebug = this.mMemoryWidgetConfig.isDebug();
            parseConfig(jSONObject);
            if (ableToInit()) {
                if (!this.mInitEd) {
                    registerAppLifeCycle();
                    int memoryRate = this.mMemoryWidgetConfig.getMemoryRate();
                    JSONObject jSONObject2 = this.memory;
                    if (jSONObject2 != null) {
                        this.mMemoryWidgetConfig.setRunStrategy(jSONObject2.optInt("memory_strategy", this.mMemoryWidgetConfig.getRunStrategy()));
                        memoryRate = this.memory.optInt("rate_memory_occupied", this.mMemoryWidgetConfig.getMemoryRate());
                        if (this.memory.optInt("client_analyze", 0) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.mClientAnalyze = z2;
                        this.mMemoryWidgetConfig.setClientAnalyse(z2);
                    }
                    if (this.mMemoryWidgetConfig.getRunStrategy() == 2) {
                        C20063c.m73220a("reach top mode", new Object[0]);
                        this.mMemoryWidgetConfig.setMemoryRate(memoryRate);
                        MemoryWidgetConfig memoryWidgetConfig = this.mMemoryWidgetConfig;
                        memoryWidgetConfig.setNumAnalyse(getConfigInt("max_capacity_analyse", memoryWidgetConfig.getNumAnalyse()));
                    }
                    C20055a.m73200c().mo68022a(this.mAppContext, this.mMemoryWidgetConfig, this.mResultListener);
                    C20063c.m73220a("memorywidget is inited", new Object[0]);
                    C20063c.m73220a(this.mMemoryWidgetConfig.toString(), new Object[0]);
                    if (C2785b.m11769j()) {
                        C2787b.m11791a().mo12090a("MEMORY_OOM_DEPLOY", (String) null);
                    }
                    this.mInitEd = true;
                }
                Handler handler = new Handler(Looper.getMainLooper());
                RunnableC200531 r1 = new Runnable() {
                    /* class com.bytedance.memory.MemoryWidget.RunnableC200531 */

                    public void run() {
                        C20055a.m73200c().mo68025d();
                    }
                };
                if (C20055a.m73200c().mo68024b()) {
                    j = 0;
                } else {
                    j = 20000;
                }
                handler.postDelayed(r1, j);
            }
            C20063c.m73220a("onRefresh run", new Object[0]);
            if (!C20076a.m73268d("npth_hprof_close")) {
                C20078b.m73270a().mo68055b();
            }
            if (!this.mCheckedFolder) {
                this.mCheckedFolder = true;
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    /* class com.bytedance.memory.MemoryWidget.RunnableC200542 */

                    public void run() {
                        C20071a.m73238a().mo68040b();
                    }
                }, 10000);
            }
        }
    }
}
