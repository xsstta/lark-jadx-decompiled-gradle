package com.ss.android.lark.featuregating.service.impl;

import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.log.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.featuregating.service.impl.b */
public class C37253b extends AbstractBaseSettingHandler {

    /* renamed from: a */
    private Object f95648a;

    /* renamed from: c */
    private Future<HashSet<String>> f95649c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.featuregating.service.impl.b$a */
    public static class C37255a {

        /* renamed from: a */
        public static C37253b f95650a = new C37253b();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "lark_features";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "DefaultFeatureGatingHandler";
    }

    /* renamed from: e */
    public static C37253b m146689e() {
        return C37255a.f95650a;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ HashSet m146690f() throws Exception {
        return m146688d(mo148410h());
    }

    private C37253b() {
        this.f95648a = new Object();
        mo148402a(mo148411i().mo148420a($$Lambda$b$WLmFNBQ_SozdSOJgK04I5dzgDD0.INSTANCE));
    }

    /* renamed from: d */
    public void mo136183d() {
        synchronized (this.f95648a) {
            if (this.f95649c == null) {
                this.f95649c = CoreThreadPool.getDefault().getFixedThreadPool().submit(new Callable() {
                    /* class com.ss.android.lark.featuregating.service.impl.$$Lambda$b$Op2xweRWY3zkGhormlJ4EhPVc08 */

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C37253b.this.m146690f();
                    }
                });
            }
        }
    }

    /* renamed from: d */
    private HashSet<String> m146688d(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        HashSet<String> hashSet = new HashSet<>();
        try {
            if (TextUtils.isEmpty(str)) {
                long currentTimeMillis2 = System.currentTimeMillis();
                Log.m165389i("DefaultFeatureGatingHandler", "parseFeatureGatingConfig failed with empty config cost " + (currentTimeMillis2 - currentTimeMillis) + "ms.");
                return hashSet;
            }
            JSONObject parseObject = JSON.parseObject(str);
            JSONArray jSONArray = parseObject.getJSONArray("online");
            if (jSONArray == null) {
                long currentTimeMillis3 = System.currentTimeMillis();
                Log.m165389i("DefaultFeatureGatingHandler", "parseFeatureGatingConfig failed with empty boolean values cost " + (currentTimeMillis3 - currentTimeMillis) + "ms.");
                return hashSet;
            }
            Iterator<Object> it = jSONArray.iterator();
            while (it != null && it.hasNext()) {
                hashSet.add(it.next().toString());
            }
            JSONObject jSONObject = parseObject.getJSONObject("values");
            if (jSONObject == null) {
                long currentTimeMillis4 = System.currentTimeMillis();
                Log.m165389i("DefaultFeatureGatingHandler", "parseFeatureGatingConfig failed with empty string values cost " + (currentTimeMillis4 - currentTimeMillis) + "ms.");
                return hashSet;
            }
            Iterator<String> it2 = jSONObject.keySet().iterator();
            while (it2 != null && it2.hasNext()) {
                String obj = it2.next().toString();
                if (!TextUtils.isEmpty(jSONObject.getString(obj))) {
                    hashSet.add(obj);
                }
            }
            long currentTimeMillis5 = System.currentTimeMillis();
            Log.m165389i("DefaultFeatureGatingHandler", "parseFeatureGatingConfig success cost " + (currentTimeMillis5 - currentTimeMillis) + "ms.");
            return hashSet;
        } catch (Exception e) {
            long currentTimeMillis6 = System.currentTimeMillis();
            Log.m165385e("DefaultFeatureGatingHandler", "parseFeatureGatingConfig failed with error cost " + (currentTimeMillis6 - currentTimeMillis) + "ms.", e, true);
            return hashSet;
        }
    }

    /* renamed from: a */
    public boolean mo136967a(String str) {
        long j;
        Future<HashSet<String>> future;
        if (Looper.myLooper() != Looper.getMainLooper() || ((future = this.f95649c) != null && future.isDone())) {
            j = 0;
        } else {
            Log.m165389i("DefaultFeatureGatingHandler", "getDefaultFG to early " + str + ", will block ui thread to load, start count.");
            j = System.currentTimeMillis();
        }
        if (this.f95649c == null) {
            mo136183d();
        }
        try {
            boolean contains = this.f95649c.get().contains(str);
            if (j > 0) {
                Log.m165389i("DefaultFeatureGatingHandler", "getDefaultFG to early " + str + ", block ui thread cost " + (System.currentTimeMillis() - j) + "ms.");
            }
            return contains;
        } catch (ExecutionException e) {
            Log.m165385e("DefaultFeatureGatingHandler", "getDefaultFG failed with key " + str, e, true);
            return false;
        } catch (InterruptedException e2) {
            Log.m165385e("DefaultFeatureGatingHandler", "getDefaultFG failed with key " + str, e2, true);
            return false;
        }
    }
}
