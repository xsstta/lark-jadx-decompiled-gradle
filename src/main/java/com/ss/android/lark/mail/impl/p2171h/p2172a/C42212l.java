package com.ss.android.lark.mail.impl.p2171h.p2172a;

import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mail.impl.utils.C43767j;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.a.l */
public class C42212l extends AbstractC42192a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2172a.AbstractC42192a
    /* renamed from: a */
    public JSONObject mo152303a(JSONObject jSONObject) {
        return C43767j.m173489a().mo155932a("event", Event.mail_label_manage_action).mo155934a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2172a.AbstractC42192a
    /* renamed from: c */
    public JSONObject mo152305c(JSONObject jSONObject) {
        return C43767j.m173489a().mo155932a("category", new ConcurrentHashMap<String, Object>(jSONObject) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2172a.C42212l.C422131 */
            final /* synthetic */ JSONObject val$params;

            {
                this.val$params = r3;
                put("mail_status", r3.optString("mail_status", "timeout"));
                put("action_type", r3.optString("action_type"));
                put("debug_message", r3.optString("debug_message", ""));
                put("mailbox_type", r3.optString("mailbox_type"));
            }
        }).mo155934a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2172a.AbstractC42192a
    /* renamed from: b */
    public JSONObject mo152304b(JSONObject jSONObject) {
        return C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailRead).mo155933a("page", "label").mo155934a();
    }
}
