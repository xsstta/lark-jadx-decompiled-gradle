package com.bytedance.ttnet.config;

import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.C14073i;
import com.bytedance.retrofit2.C20642m;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.p913d.C20765a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.ttnet.config.g */
public class C20764g implements C20642m.AbstractC20646b {

    /* renamed from: a */
    private static volatile C20764g f50876a;

    /* renamed from: b */
    private boolean f50877b;

    /* renamed from: c */
    private int f50878c;

    /* renamed from: d */
    private boolean f50879d;

    /* renamed from: e */
    private final Set<String> f50880e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private final Map<String, Integer> f50881f = new ConcurrentHashMap();

    @Override // com.bytedance.retrofit2.C20642m.AbstractC20646b
    /* renamed from: a */
    public boolean mo69469a() {
        return this.f50877b;
    }

    @Override // com.bytedance.retrofit2.C20642m.AbstractC20646b
    /* renamed from: b */
    public boolean mo69470b() {
        return C14073i.m56967a().mo51756c();
    }

    private C20764g() {
        mo70043d();
    }

    /* renamed from: c */
    public static C20764g m75661c() {
        if (f50876a == null) {
            synchronized (C20764g.class) {
                if (f50876a == null) {
                    f50876a = new C20764g();
                }
            }
        }
        return f50876a;
    }

    /* renamed from: d */
    public void mo70043d() {
        boolean z;
        boolean z2 = true;
        if (TTNetInit.getTTNetDepend().mo69983a(TTNetInit.getTTNetDepend().mo69984a(), "app_delay_enable", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f50877b = z;
        if (TTNetInit.getTTNetDepend().mo69983a(TTNetInit.getTTNetDepend().mo69984a(), "app_delay_use_black_list", 0) <= 0) {
            z2 = false;
        }
        this.f50879d = z2;
        this.f50878c = TTNetInit.getTTNetDepend().mo69983a(TTNetInit.getTTNetDepend().mo69984a(), "app_delay_whitelist_delay_time", 0);
        C20759f.m75649a(this.f50880e, TTNetInit.getTTNetDepend().mo69985a(TTNetInit.getTTNetDepend().mo69984a(), "app_delay_white_list", ""));
        C20759f.m75648a(this.f50881f, TTNetInit.getTTNetDepend().mo69985a(TTNetInit.getTTNetDepend().mo69984a(), "app_delay_black_list", ""));
    }

    @Override // com.bytedance.retrofit2.C20642m.AbstractC20646b
    /* renamed from: a */
    public int mo69467a(String str) {
        Map<String, Integer> map;
        boolean z = this.f50879d;
        if (z && (map = this.f50881f) != null) {
            for (String str2 : map.keySet()) {
                if (!TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                    Integer num = this.f50881f.get(str2);
                    if (num == null) {
                        return 0;
                    }
                    return num.intValue();
                }
            }
            return 0;
        } else if (z || !C20765a.m75667a(str, this.f50880e)) {
            return 0;
        } else {
            return this.f50878c;
        }
    }

    @Override // com.bytedance.retrofit2.C20642m.AbstractC20646b
    /* renamed from: a */
    public int mo69468a(String str, String str2) {
        return C14073i.m56967a().mo51749a(str, str2);
    }
}
