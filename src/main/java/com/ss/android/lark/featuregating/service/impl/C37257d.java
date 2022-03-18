package com.ss.android.lark.featuregating.service.impl;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.featuregating.p1846c.AbstractC37250a;
import com.ss.android.lark.featuregating.p1846c.AbstractC37251b;
import com.ss.android.lark.featuregating.service.IFeatureGatingProxy;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.C57765ac;
import ee.android.framework.manis.C68183b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.featuregating.service.impl.d */
public class C37257d implements AbstractC37250a {

    /* renamed from: a */
    public final HashSet<String> f95651a = new HashSet<>();

    /* renamed from: b */
    public volatile boolean f95652b = false;

    /* renamed from: c */
    public volatile boolean f95653c = false;

    /* renamed from: d */
    public final Object f95654d = new Object();

    /* renamed from: e */
    private volatile boolean f95655e;

    /* renamed from: f */
    private boolean f95656f;

    /* renamed from: g */
    private String f95657g;

    /* renamed from: h */
    private volatile boolean f95658h = false;

    /* renamed from: i */
    private volatile String f95659i = "";

    /* renamed from: j */
    private final boolean f95660j;

    /* renamed from: k */
    private final HashSet<String> f95661k = new HashSet<>();

    @Override // com.ss.android.lark.featuregating.p1846c.AbstractC37250a
    /* renamed from: b */
    public void mo136953b() {
        C37239a.m146644a().mo136946b();
    }

    /* renamed from: g */
    private String m146703g() {
        return UserSP.getInstance().getString("key_feature_gating_runtime_cache_sign");
    }

    /* renamed from: e */
    private boolean m146701e() {
        if (TextUtils.equals(m146703g(), this.f95659i)) {
            return true;
        }
        synchronized (this.f95654d) {
            mo136956c();
            Log.m165389i("FeatureGatingService", this.f95657g + " checkSubprocessMemoryCacheValid failed.");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        if (r3.f95656f == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0011, code lost:
        com.ss.android.lark.log.Log.m165389i("FeatureGatingService", "main process launch, will delete runtime cache data.");
        com.ss.android.lark.util.share_preference.UserSP.getInstance().remove("key_feature_gating_runtime_cache");
        com.ss.android.lark.util.share_preference.UserSP.getInstance().remove("key_feature_gating_runtime_cache_sign");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r0 = new com.ss.android.lark.featuregating.service.impl.C37257d.C372581(r3);
        com.ss.android.lark.featuregating.C37239a.m146644a().mo136944a(new com.ss.android.lark.featuregating.service.impl.C37257d.C372592(r3), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        return;
     */
    @Override // com.ss.android.lark.featuregating.p1846c.AbstractC37250a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo136950a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f95654d
            monitor-enter(r0)
            boolean r1 = r3.f95655e     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x0009:
            r1 = 1
            r3.f95655e = r1     // Catch:{ all -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            boolean r0 = r3.f95656f
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "FeatureGatingService"
            java.lang.String r1 = "main process launch, will delete runtime cache data."
            com.ss.android.lark.log.Log.m165389i(r0, r1)
            com.ss.android.lark.util.share_preference.UserSP r0 = com.ss.android.lark.util.share_preference.UserSP.getInstance()
            java.lang.String r1 = "key_feature_gating_runtime_cache"
            r0.remove(r1)
            com.ss.android.lark.util.share_preference.UserSP r0 = com.ss.android.lark.util.share_preference.UserSP.getInstance()
            java.lang.String r1 = "key_feature_gating_runtime_cache_sign"
            r0.remove(r1)
        L_0x002a:
            com.ss.android.lark.featuregating.service.impl.d$1 r0 = new com.ss.android.lark.featuregating.service.impl.d$1
            r0.<init>()
            com.ss.android.lark.featuregating.service.impl.d$2 r1 = new com.ss.android.lark.featuregating.service.impl.d$2
            r1.<init>()
            com.ss.android.lark.featuregating.a.c r2 = com.ss.android.lark.featuregating.C37239a.m146644a()
            r2.mo136944a(r1, r0)
            return
        L_0x003c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.featuregating.service.impl.C37257d.mo136950a():void");
    }

    @Override // com.ss.android.lark.featuregating.p1846c.AbstractC37250a
    /* renamed from: c */
    public void mo136956c() {
        synchronized (this.f95654d) {
            this.f95651a.clear();
            this.f95658h = false;
            this.f95659i = "";
            if (this.f95656f) {
                this.f95652b = false;
                this.f95653c = false;
                UserSP.getInstance().remove("key_feature_gating_runtime_cache");
                UserSP.getInstance().remove("key_feature_gating_runtime_cache_sign");
            }
            this.f95661k.clear();
            Log.m165389i("FeatureGatingService", "clear fg mem cache data.");
        }
    }

    public C37257d() {
        C37239a.m146644a().mo136945a(new AbstractC37251b() {
            /* class com.ss.android.lark.featuregating.service.impl.$$Lambda$d$SOgMEXTagVSjOWf3pSm3ZYfPw */

            @Override // com.ss.android.lark.featuregating.p1846c.AbstractC37251b
            public final void onLoginStatusChanged(boolean z) {
                C37257d.this.m146698a((C37257d) z);
            }
        });
        this.f95656f = C26252ad.m94993b(C37239a.m146644a().mo136942a());
        this.f95657g = C26252ad.m94994c(C37239a.m146644a().mo136942a());
        this.f95660j = this.f95656f;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (android.text.TextUtils.equals(r2, "EMPTY_MEMORY_SIGN") == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r2 = java.lang.System.currentTimeMillis();
        com.ss.android.lark.log.Log.m165389i("FeatureGatingService", r8.f95657g + " subprocessMemoryCacheLoad success with empty data, cost " + (r2 - r0) + " ms.");
        r8.f95659i = m146703g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        r2 = java.lang.System.currentTimeMillis();
        com.ss.android.lark.log.Log.m165389i("FeatureGatingService", r8.f95657g + " subprocessMemoryCacheLoad failed, cache data is empty, cost " + (r2 - r0) + " ms.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
        r3 = r8.f95654d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2 = r2.split(",");
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        if (r5 >= r4) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        r8.f95651a.add(r2[r5]);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0094, code lost:
        r8.f95659i = m146703g();
        r2 = java.lang.System.currentTimeMillis();
        com.ss.android.lark.log.Log.m165389i("FeatureGatingService", r8.f95657g + " subprocessMemoryCacheLoad success, sync data size is " + r8.f95651a.size() + ", cost " + (r2 - r0) + " ms.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        r0 = java.lang.System.currentTimeMillis();
        r2 = com.ss.android.lark.util.share_preference.UserSP.getInstance().getString("key_feature_gating_runtime_cache", null);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m146704h() {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.featuregating.service.impl.C37257d.m146704h():void");
    }

    /* renamed from: d */
    public void mo136970d() {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f95654d) {
            if (CollectionUtils.isEmpty(this.f95651a)) {
                long currentTimeMillis2 = System.currentTimeMillis();
                Log.m165389i("FeatureGatingService", "generateMainProcessMemoryCache with default empty sign, cost " + (currentTimeMillis2 - currentTimeMillis) + " ms.");
                UserSP.getInstance().putString("key_feature_gating_runtime_cache", "EMPTY_MEMORY_SIGN");
                UserSP.getInstance().putString("key_feature_gating_runtime_cache_sign", String.valueOf(currentTimeMillis));
                return;
            }
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = this.f95651a.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            Log.m165389i("FeatureGatingService", "generateMainProcessMemoryCache success, total key size is " + this.f95651a.size() + ", cost " + (currentTimeMillis3 - currentTimeMillis) + " ms.");
            UserSP.getInstance().putString("key_feature_gating_runtime_cache", sb.toString());
            UserSP.getInstance().putString("key_feature_gating_runtime_cache_sign", String.valueOf(currentTimeMillis));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m146698a(boolean z) {
        mo136956c();
    }

    @Override // com.ss.android.lark.featuregating.p1846c.AbstractC37250a
    /* renamed from: a */
    public boolean mo136951a(String str) {
        return mo136952a(str, false);
    }

    @Override // com.ss.android.lark.featuregating.p1846c.AbstractC37250a
    /* renamed from: b */
    public boolean mo136954b(String str) {
        return mo136955b(str, false);
    }

    /* renamed from: b */
    private void m146700b(Map<String, Boolean> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                UserSP.getInstance().putBoolean(str, map.get(str).booleanValue());
            }
        }
    }

    /* renamed from: a */
    public void mo136968a(Map<String, Boolean> map) {
        synchronized (this.f95654d) {
            if (map != null) {
                this.f95661k.clear();
                for (String str : map.keySet()) {
                    if (map.get(str).booleanValue()) {
                        this.f95661k.add(str);
                    }
                }
            }
        }
        m146700b(map);
    }

    /* renamed from: a */
    public void mo136969a(Set<String> set) {
        if (m146699a(set, UserSP.getInstance().getString("key_feature_gating_config"))) {
            StringBuilder sb = new StringBuilder();
            for (String str : set) {
                sb.append(str);
                sb.append(",");
            }
            UserSP.getInstance().putString("key_feature_gating_config", sb.toString());
        }
    }

    /* renamed from: a */
    private List<String> m146697a(Set<String> set, Set<String> set2) {
        ArrayList arrayList = new ArrayList();
        for (String str : set2) {
            if (!set.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m146699a(Set<String> set, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        HashSet hashSet = new HashSet(Arrays.asList(str.split(",")));
        List<String> a = m146697a(set, hashSet);
        List<String> a2 = m146697a(hashSet, set);
        for (String str2 : a) {
            UserSP.getInstance().remove(str2);
        }
        if (!a.isEmpty() || !a2.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.featuregating.p1846c.AbstractC37250a
    /* renamed from: b */
    public boolean mo136955b(String str, boolean z) {
        boolean booleanValue = C37256c.m146696a(str).booleanValue();
        if (UserSP.getInstance().contains("key_feature_gating_config")) {
            booleanValue = false;
        }
        if (!this.f95660j) {
            return UserSP.getInstance().getBoolean(str, booleanValue);
        }
        if (this.f95656f && CollectionUtils.isEmpty(this.f95661k) && !UserSP.getInstance().contains("key_feature_gating_config")) {
            return booleanValue;
        }
        if (!this.f95656f && !UserSP.getInstance().contains("key_feature_gating_config")) {
            return booleanValue;
        }
        if (!this.f95656f || !this.f95653c || CollectionUtils.isEmpty(this.f95661k)) {
            return UserSP.getInstance().getBoolean(str, booleanValue);
        }
        return this.f95661k.contains(str);
    }

    @Override // com.ss.android.lark.featuregating.p1846c.AbstractC37250a
    /* renamed from: a */
    public boolean mo136952a(String str, boolean z) {
        boolean booleanValue = C37256c.m146696a(str).booleanValue();
        Context a = C37239a.m146644a().mo136942a();
        if (!this.f95656f || this.f95652b) {
            if (!this.f95656f && !m146701e()) {
                if (!C57765ac.m224197k(C37239a.m146644a().mo136942a())) {
                    return mo136955b(str, booleanValue);
                }
                long currentTimeMillis = System.currentTimeMillis();
                CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                    /* class com.ss.android.lark.featuregating.service.impl.$$Lambda$d$HMCFoopGlPdETwocRGyurP4vE */

                    public final void run() {
                        C37257d.this.m146704h();
                    }
                });
                try {
                    IFeatureGatingProxy iFeatureGatingProxy = (IFeatureGatingProxy) C68183b.m264839a().mo237086a(a, IFeatureGatingProxy.class);
                    if (iFeatureGatingProxy != null) {
                        boolean isEnable = iFeatureGatingProxy.isEnable(str, booleanValue);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        Log.m165389i("FeatureGatingService", this.f95657g + " checkSubprocessMemoryCacheValid failed key is " + str + ", fallback to ipc request, cost " + (currentTimeMillis2 - currentTimeMillis) + " ms.");
                        return isEnable;
                    }
                } catch (Exception e) {
                    Log.m165386e("FeatureGatingService", e);
                    return mo136955b(str, booleanValue);
                }
            }
            if (!CollectionUtils.isEmpty(this.f95651a)) {
                return this.f95651a.contains(str);
            }
            return booleanValue;
        }
        boolean b = mo136955b(str, booleanValue);
        Log.m165389i("FeatureGatingService", "main process invoke fg fetch too early feature key is " + str + ", value is " + b + ".");
        return b;
    }
}
