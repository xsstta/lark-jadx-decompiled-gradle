package com.ss.android.lark.exception.crash.npth;

import android.text.TextUtils;
import com.bytedance.crash.AbstractC3725d;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.ICrashFilter;
import com.bytedance.crash.Npth;
import com.bytedance.crash.runtime.ConfigManager;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.exception.crash.npth.c */
public class C37024c {

    /* renamed from: a */
    private String f95137a;

    /* renamed from: b */
    private AbstractC3725d f95138b;

    /* renamed from: com.ss.android.lark.exception.crash.npth.c$a */
    public static class C37028a {

        /* renamed from: a */
        public static final C37024c f95145a = new C37024c();
    }

    private C37024c() {
    }

    /* renamed from: a */
    public static C37024c m146082a() {
        return C37028a.f95145a;
    }

    /* renamed from: b */
    public static void m146083b() {
        Npth.openANRMonitor();
    }

    /* renamed from: c */
    public static void m146086c() {
        Npth.stopAnr();
    }

    /* renamed from: c */
    private ICommonParams m146085c(final AbstractC37020a aVar) {
        return new ICommonParams() {
            /* class com.ss.android.lark.exception.crash.npth.C37024c.C370251 */

            @Override // com.bytedance.crash.ICommonParams
            public String getDeviceId() {
                return aVar.mo103185d().mo103195g();
            }

            @Override // com.bytedance.crash.ICommonParams
            public List<String> getPatchInfo() {
                return aVar.mo103185d().mo103199k();
            }

            @Override // com.bytedance.crash.ICommonParams
            public Map<String, Integer> getPluginInfo() {
                return aVar.mo103185d().mo103198j();
            }

            @Override // com.bytedance.crash.ICommonParams
            public String getSessionId() {
                return aVar.mo103185d().mo103197i();
            }

            @Override // com.bytedance.crash.ICommonParams
            public long getUserId() {
                return Long.parseLong(aVar.mo103185d().mo103196h());
            }

            @Override // com.bytedance.crash.ICommonParams
            public Map<String, Object> getCommonParams() {
                HashMap hashMap = new HashMap();
                hashMap.put("aid", Integer.valueOf(aVar.mo103185d().mo103189a()));
                hashMap.put("update_version_code", Integer.valueOf(aVar.mo103185d().mo103190b()));
                hashMap.put("version_code", Integer.valueOf(aVar.mo103185d().mo103191c()));
                hashMap.put("app_version", aVar.mo103185d().mo103192d());
                hashMap.put("channel", aVar.mo103185d().mo103193e());
                hashMap.put("release_build", String.valueOf(aVar.mo103185d().mo103194f()));
                return hashMap;
            }
        };
    }

    /* renamed from: d */
    private AttachUserData m146087d(final AbstractC37020a aVar) {
        return new AttachUserData() {
            /* class com.ss.android.lark.exception.crash.npth.C37024c.C370262 */

            @Override // com.bytedance.crash.AttachUserData
            public Map<String, String> getUserData(CrashType crashType) {
                return aVar.mo103186e();
            }
        };
    }

    /* renamed from: e */
    private ICrashFilter m146088e(final AbstractC37020a aVar) {
        return new ICrashFilter() {
            /* class com.ss.android.lark.exception.crash.npth.C37024c.C370273 */

            @Override // com.bytedance.crash.ICrashFilter
            public boolean onNativeCrashFilter(String str, String str2) {
                CrashLocalCollector.m146053a().mo136541a(aVar.mo103182a(), str, str2, aVar.mo103187f()).mo136545a();
                return true;
            }

            @Override // com.bytedance.crash.ICrashFilter
            public boolean onJavaCrashFilter(Throwable th, Thread thread) {
                CrashLocalCollector.m146053a().mo136542a(aVar.mo103182a(), th, thread.getName(), aVar.mo103188g()).mo136545a();
                return aVar.mo103184c().f95134b;
            }
        };
    }

    /* renamed from: a */
    public void mo136547a(AbstractC3725d dVar) {
        this.f95138b = dVar;
    }

    /* renamed from: a */
    public void mo136549a(String str) {
        this.f95137a = str;
    }

    /* renamed from: b */
    private void m146084b(AbstractC37020a aVar) {
        if (!TextUtils.isEmpty(this.f95137a)) {
            Npth.setCustomDomain("https://" + this.f95137a);
        }
    }

    /* renamed from: a */
    public void mo136548a(AbstractC37020a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC3725d dVar = this.f95138b;
        if (dVar != null) {
            Npth.setEncryptImpl(dVar);
        }
        m146084b(aVar);
        ConfigManager configManager = Npth.getConfigManager();
        configManager.setBlockMonitorEnable(false);
        configManager.setEnsureEnable(false);
        configManager.setDebugMode(aVar.mo103183b());
        Npth.init(aVar.mo103182a(), m146085c(aVar), aVar.mo103184c().f95133a, aVar.mo103184c().f95135c, aVar.mo103184c().f95136d);
        Npth.setAttachUserData(m146087d(aVar), CrashType.ALL);
        Npth.setCrashFilter(m146088e(aVar));
        Log.addErrorHook(new C37023b());
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.m165389i("NpthWrapper", "initCrashManager init end, spend time: " + (currentTimeMillis2 - currentTimeMillis));
    }
}
