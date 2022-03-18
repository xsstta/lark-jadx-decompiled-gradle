package com.ss.android.lark.mail.impl.p2171h.p2172a;

import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mail.impl.utils.C43767j;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.a.h */
public class C42205h extends AbstractC42192a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2172a.AbstractC42192a
    /* renamed from: a */
    public JSONObject mo152303a(JSONObject jSONObject) {
        return C43767j.m173489a().mo155932a("event", Event.mail_fmp_load).mo155934a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2172a.AbstractC42192a
    /* renamed from: c */
    public JSONObject mo152305c(JSONObject jSONObject) {
        return C43767j.m173489a().mo155932a("category", new ConcurrentHashMap<String, Object>(jSONObject) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2172a.C42205h.C422061 */
            final /* synthetic */ JSONObject val$params;

            {
                this.val$params = r4;
                put("scene_type", r4.optString("scene_type", "email_tab"));
                put("mode", r4.optString("mode", "cold_start"));
                put("mail_status", r4.optString("mail_status", "timeout"));
                put("from_db", Integer.valueOf(r4.optInt("from_db", 0)));
                put("debug_message", r4.optString("debug_message", ""));
                put("has_preload_label_list", Boolean.valueOf(r4.optBoolean("has_preload_label_list", false)));
                put("has_preload_thread_list", Boolean.valueOf(r4.optBoolean("has_preload_thread_list", false)));
            }
        }).mo155934a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2172a.AbstractC42192a
    /* renamed from: b */
    public JSONObject mo152304b(JSONObject jSONObject) {
        return C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailFMP).mo155933a("page", "fmp").mo155934a();
    }
}
