package com.ss.android.lark.guidemgr.p1945e;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ss.android.lark.guidemgr.p1935b.p1938c.C38712b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.guidemgr.e.a */
public class C38725a {

    /* renamed from: a */
    private Gson f99614a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.guidemgr.e.a$a */
    public static class C38727a {

        /* renamed from: a */
        public static final C38725a f99615a = new C38725a();
    }

    /* renamed from: b */
    public static C38725a m152943b() {
        return C38727a.f99615a;
    }

    private C38725a() {
        this.f99614a = new GsonBuilder().create();
    }

    /* renamed from: a */
    public Map<String, C38712b> mo141900a() {
        String string = UserSP.getInstance().getString("lark.android.guide_mgr");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            C38728b bVar = (C38728b) this.f99614a.fromJson(string, C38728b.class);
            if (bVar != null) {
                return bVar.mo141902a();
            }
            return null;
        } catch (Exception e) {
            Log.m165384e("GuideCacheService", "load json fail", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo141901a(Map<String, C38712b> map) {
        String str;
        if (map != null) {
            try {
                C38728b bVar = new C38728b();
                bVar.mo141903a(new HashMap(map));
                str = this.f99614a.toJson(bVar);
            } catch (Exception e) {
                Log.m165384e("GuideCacheService", "save json fail", e);
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                UserSP.getInstance().putString("lark.android.guide_mgr", str);
            }
        }
    }
}
