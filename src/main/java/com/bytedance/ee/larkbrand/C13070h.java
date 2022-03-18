package com.bytedance.ee.larkbrand;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.abtest.C12956a;
import com.he.loader.SettingsProvider;
import com.he.loader.TTAppLoader;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.h */
public class C13070h implements SettingsProvider {

    /* renamed from: a */
    private JSONObject f34738a;

    /* renamed from: b */
    private boolean f34739b;

    /* renamed from: c */
    private int f34740c;

    /* renamed from: com.bytedance.ee.larkbrand.h$a */
    private static final class C13072a {

        /* renamed from: a */
        public static final C13070h f34741a = new C13070h();
    }

    @Override // com.he.loader.SettingsProvider
    public String getSetting(Context context, Enum<?> r2, String str) {
        return str;
    }

    /* renamed from: a */
    public static C13070h m53597a() {
        return C13072a.f34741a;
    }

    private C13070h() {
        this.f34740c = 32768;
        this.f34738a = C12956a.m53359a().mo48859b("code_cache");
        AppBrandLogger.m52830i("LarkSettingsProvider", "service provider config::" + this.f34738a);
        JSONObject jSONObject = this.f34738a;
        if (jSONObject != null) {
            this.f34739b = jSONObject.optBoolean("eager_open", false);
            this.f34740c = this.f34738a.optInt("size_limit", 32768);
        }
    }

    @Override // com.he.loader.SettingsProvider
    public int getSetting(Context context, Enum<?> r2, int i) {
        if (r2 == TTAppLoader.Settings.CODECACHE_MINSIZE) {
            return this.f34740c;
        }
        return i;
    }

    @Override // com.he.loader.SettingsProvider
    public boolean getSetting(Context context, Enum<?> r2, boolean z) {
        if (r2 == TTAppLoader.Settings.CODECACHE_BACKGROUND_CREATE) {
            return this.f34739b;
        }
        return z;
    }
}
