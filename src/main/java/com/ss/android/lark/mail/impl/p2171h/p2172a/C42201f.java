package com.ss.android.lark.mail.impl.p2171h.p2172a;

import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mail.impl.utils.C43767j;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.a.f */
public class C42201f extends AbstractC42192a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2172a.AbstractC42192a
    /* renamed from: a */
    public JSONObject mo152303a(JSONObject jSONObject) {
        return C43767j.m173489a().mo155932a("event", Event.mail_draft_save_draft).mo155934a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2172a.AbstractC42192a
    /* renamed from: c */
    public JSONObject mo152305c(JSONObject jSONObject) {
        return C43767j.m173489a().mo155932a("category", new ConcurrentHashMap<String, Object>(jSONObject) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2172a.C42201f.C422021 */
            final /* synthetic */ JSONObject val$params;

            {
                this.val$params = r3;
                put("mail_body_length", Integer.valueOf(r3.optInt("mail_body_length", 0)));
                put("debug_message", r3.optString("debug_message", ""));
                put("mail_status", r3.optString("mail_status", "timeout"));
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
