package com.bytedance.geckox.settings;

import android.content.Context;
import com.bytedance.geckox.p761c.C14217b;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.settings.model.SettingsLocal;
import com.bytedance.geckox.utils.C14372n;
import com.google.gson.JsonSyntaxException;

/* renamed from: com.bytedance.geckox.settings.b */
public class C14326b {
    /* renamed from: a */
    public GlobalConfigSettings mo52405a(Context context) {
        String b = C14372n.m57851a().mo52490b(context, "gecko_settings", null);
        if (b == null) {
            return null;
        }
        try {
            return (GlobalConfigSettings) C14217b.m57431a().mo52132b().fromJson(b, GlobalConfigSettings.class);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public SettingsLocal mo52407b(Context context) {
        String b = C14372n.m57851a().mo52490b(context, "gecko_settings_local", null);
        if (b == null) {
            return null;
        }
        try {
            return (SettingsLocal) C14217b.m57431a().mo52132b().fromJson(b, SettingsLocal.class);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public void mo52408c(Context context) {
        C14276b.m57604a("gecko-debug-tag", "settings cache deleted");
        C14372n.m57851a().mo52489a(context, "gecko_settings", null);
    }

    /* renamed from: a */
    public void mo52406a(Context context, SettingsLocal settingsLocal) {
        C14276b.m57604a("gecko-debug-tag", "settings local cache stored", settingsLocal);
        if (settingsLocal != null) {
            C14372n.m57851a().mo52489a(context, "gecko_settings_local", C14217b.m57431a().mo52132b().toJson(settingsLocal));
        }
    }
}
