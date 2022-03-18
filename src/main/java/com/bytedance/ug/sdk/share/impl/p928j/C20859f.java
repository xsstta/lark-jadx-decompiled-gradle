package com.bytedance.ug.sdk.share.impl.p928j;

import android.content.SharedPreferences;
import com.bytedance.ug.sdk.share.impl.p919c.C20826a;
import com.bytedance.ug.sdk.share.impl.p923g.C20840d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ug.sdk.share.impl.j.f */
public class C20859f {

    /* renamed from: b */
    private static Map<String, C20859f> f51036b = new HashMap();

    /* renamed from: a */
    private SharedPreferences f51037a;

    /* renamed from: a */
    public static C20859f m75922a() {
        return m75923a("share_sdk_config.prefs");
    }

    /* renamed from: b */
    public boolean mo70336b(String str) {
        SharedPreferences.Editor edit = this.f51037a.edit();
        edit.remove(str);
        return edit.commit();
    }

    private C20859f(String str) {
        SharedPreferences a = C20826a.m75837a().mo70286a(str);
        this.f51037a = a;
        if (a == null) {
            this.f51037a = C20840d.m75892a().mo70319b().getSharedPreferences(str, 0);
        }
    }

    /* renamed from: a */
    public static C20859f m75923a(String str) {
        C20859f fVar = f51036b.get(str);
        if (fVar == null) {
            synchronized (C20859f.class) {
                fVar = f51036b.get(str);
                if (fVar == null) {
                    fVar = new C20859f(str);
                    f51036b.put(str, fVar);
                }
            }
        }
        return fVar;
    }

    /* renamed from: a */
    public String mo70335a(String str, String str2) {
        return this.f51037a.getString(str, str2);
    }
}
