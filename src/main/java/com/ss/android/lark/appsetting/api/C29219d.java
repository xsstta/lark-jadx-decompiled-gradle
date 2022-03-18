package com.ss.android.lark.appsetting.api;

import android.text.TextUtils;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.appsetting.api.d */
public class C29219d {

    /* renamed from: a */
    private volatile Map<String, String> f73166a;

    /* renamed from: b */
    private Reference<Map<String, Object>> f73167b;

    /* renamed from: c */
    private Reference<Map<String, AppConfig>> f73168c;

    /* renamed from: com.ss.android.lark.appsetting.api.d$a */
    private static class C29221a {

        /* renamed from: a */
        public static C29219d f73169a = new C29219d();
    }

    /* renamed from: a */
    public static C29219d m107477a() {
        return C29221a.f73169a;
    }

    /* renamed from: c */
    private Map<String, String> m107478c() {
        this.f73166a.clear();
        return new HashMap();
    }

    /* renamed from: b */
    public void mo103629b() {
        if (this.f73166a != null) {
            this.f73166a.clear();
        }
        Reference<Map<String, Object>> reference = this.f73167b;
        if (reference != null) {
            reference.clear();
        }
        Reference<Map<String, AppConfig>> reference2 = this.f73168c;
        if (reference2 != null) {
            reference2.clear();
        }
    }

    private C29219d() {
        this.f73166a = new HashMap();
        this.f73167b = new SoftReference(new HashMap());
        this.f73168c = new SoftReference(new HashMap());
    }

    /* renamed from: a */
    public <T> T mo103625a(String str) {
        Map<String, Object> map = this.f73167b.get();
        if (map == null) {
            return null;
        }
        return (T) map.get(str);
    }

    /* renamed from: a */
    public AppConfig mo103624a(Class cls) {
        Map<String, AppConfig> map = this.f73168c.get();
        if (map != null && map.containsKey(cls.getName())) {
            return map.get(cls.getName());
        }
        AppConfig appConfig = (AppConfig) cls.getAnnotation(AppConfig.class);
        if (map == null) {
            map = new HashMap<>();
            this.f73168c = new SoftReference(map);
        }
        map.put(cls.getName(), appConfig);
        return appConfig;
    }

    /* renamed from: a */
    public synchronized void mo103628a(Map<String, String> map) {
        if (map != null) {
            this.f73166a = m107478c();
            this.f73166a.putAll(map);
            for (String str : map.keySet()) {
                String str2 = map.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    UserSP.getInstance().putString(str, str2);
                }
            }
        }
    }

    /* renamed from: a */
    public String mo103626a(String str, boolean z) {
        if (!this.f73166a.containsKey(str)) {
            Log.m165379d("SettingCacheService", "key:" + str + " mem cache doesn't exist in memory.");
            String str2 = null;
            if (!z) {
                UserSP.getInstance().remove(str);
            } else {
                str2 = UserSP.getInstance().getString(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            String a = InternalLocalDefaultConfigStorage.f73150e.mo103616a().mo103611a(str);
            Log.m165389i("SettingCacheService", "getSettingConfig from local setting, key is " + str);
            return a;
        }
        String str3 = this.f73166a.get(str);
        if (z && !UserSP.getInstance().contains(str)) {
            UserSP.getInstance().putString(str, str3);
        }
        return str3;
    }

    /* renamed from: a */
    public void mo103627a(String str, Object obj) {
        Map<String, Object> map = this.f73167b.get();
        if (map == null) {
            map = new HashMap<>();
            this.f73167b = new SoftReference(map);
        }
        map.put(str, obj);
    }
}
