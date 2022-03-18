package com.ss.android.lark.mail.impl.p2171h.p2172a;

import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mail.impl.utils.C43767j;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.a.e */
public class C42199e extends AbstractC42192a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2172a.AbstractC42192a
    /* renamed from: a */
    public JSONObject mo152303a(JSONObject jSONObject) {
        return C43767j.m173489a().mo155932a("event", Event.mail_draft_create_draft).mo155934a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2172a.AbstractC42192a
    /* renamed from: c */
    public JSONObject mo152305c(JSONObject jSONObject) {
        return C43767j.m173489a().mo155932a("category", new ConcurrentHashMap<String, Object>(jSONObject) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2172a.C42199e.C422001 */
            final /* synthetic */ JSONObject val$params;

            {
                this.val$params = r3;
                put("mail_status", r3.optString("mail_status", "timeout"));
                put("debug_message", r3.optString("debug_message", ""));
                put("scene_type", r3.optString("scene_type", "compose"));
            }
        }).mo155934a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2172a.AbstractC42192a
    /* renamed from: b */
    public JSONObject mo152304b(JSONObject jSONObject) {
        return C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailDraft).mo155933a("page", "draft").mo155934a();
    }
}
