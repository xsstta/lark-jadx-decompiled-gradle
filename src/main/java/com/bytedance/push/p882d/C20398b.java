package com.bytedance.push.p882d;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.push.C20386c;
import com.bytedance.push.interfaze.AbstractC20439b;
import com.bytedance.push.interfaze.AbstractC20449l;
import com.bytedance.push.p884f.C20425g;
import com.bytedance.push.p886g.C20433a;
import com.bytedance.push.p887h.AbstractC20434a;
import com.bytedance.push.p887h.C20435b;
import com.bytedance.push.settings.C20520j;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.utils.C20554e;
import com.ss.android.message.AppProvider;
import com.ss.android.message.p3002a.C59436a;
import com.ss.android.pushmanager.AbstractC59962b;
import com.ss.android.pushmanager.p3019a.C59959a;
import com.ss.android.ug.bus.C60442b;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.d.b */
public class C20398b {
    /* renamed from: a */
    public static void m74309a(final C20386c cVar, final C20433a aVar, final AbstractC59962b bVar) {
        C60442b.m234864a(C59959a.AbstractC59960a.class, new C59959a.AbstractC59960a() {
            /* class com.bytedance.push.p882d.C20398b.C203991 */

            @Override // com.ss.android.pushmanager.p3019a.C59959a.AbstractC59960a
            /* renamed from: a */
            public void mo68796a(Context context) {
                AppProvider.initApp(cVar.f49779a);
            }
        });
        C60442b.m234864a(C59959a.AbstractC59961b.class, new C59959a.AbstractC59961b() {
            /* class com.bytedance.push.p882d.C20398b.C204002 */

            @Override // com.ss.android.pushmanager.p3019a.C59959a.AbstractC59961b
            /* renamed from: a */
            public Map<String, String> mo68797a() {
                return aVar.mo68893a();
            }

            @Override // com.ss.android.pushmanager.p3019a.C59959a.AbstractC59961b
            /* renamed from: b */
            public boolean mo68800b() {
                Application application = cVar.f49779a;
                if (!C59436a.m230732b(application)) {
                    SharedPreferences sharedPreferences = application.getSharedPreferences("push_multi_process_config", 0);
                    if (sharedPreferences.getBoolean("remove_auto_boot_v2", false)) {
                        return true;
                    }
                    if (!sharedPreferences.getBoolean("need_control_miui_flares_v2", true) || !C20554e.m74857b()) {
                        return false;
                    }
                    return true;
                } else if (((PushOnlineSettings) C20520j.m74724a(cVar.f49779a, PushOnlineSettings.class)).mo69060k()) {
                    return true;
                } else {
                    if (!((PushOnlineSettings) C20520j.m74724a(cVar.f49779a, PushOnlineSettings.class)).mo69059j() || !C20554e.m74857b()) {
                        return false;
                    }
                    return true;
                }
            }

            @Override // com.ss.android.pushmanager.p3019a.C59959a.AbstractC59961b
            /* renamed from: a */
            public void mo68799a(String str, JSONObject jSONObject) {
                if (cVar.f49791m != null) {
                    cVar.f49791m.mo68914a(str, jSONObject);
                }
            }

            @Override // com.ss.android.pushmanager.p3019a.C59959a.AbstractC59961b
            /* renamed from: a */
            public void mo68798a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
                if (cVar.f49791m != null) {
                    cVar.f49791m.mo68913a(context, str, str2, str3, j, j2, jSONObject);
                }
            }
        });
        C60442b.m234864a(AbstractC20434a.class, new C20435b());
        C60442b.m234864a(AbstractC20439b.class, cVar.f49804z);
        C60442b.m234864a(AbstractC20449l.class, new C20425g());
    }
}
