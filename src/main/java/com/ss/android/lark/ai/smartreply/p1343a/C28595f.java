package com.ss.android.lark.ai.smartreply.p1343a;

import android.content.Intent;
import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyItem;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28619b;
import com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.ai.smartreply.a.f */
public class C28595f implements AbstractC28594e {

    /* renamed from: a */
    private AbstractC28534a f71955a;

    /* renamed from: b */
    private Map<SmartReplyItem.Type, AbstractC28589a> f71956b = new HashMap();

    /* renamed from: c */
    private AbstractC28594e f71957c;

    /* renamed from: c */
    public Set<SmartReplyItem.Type> mo101799c() {
        return this.f71956b.keySet();
    }

    /* renamed from: a */
    public C28595f mo101794a() {
        this.f71956b.put(SmartReplyItem.Type.APP_ACTION, new C28590b(this.f71955a));
        return this;
    }

    /* renamed from: b */
    public C28595f mo101797b() {
        this.f71956b.put(SmartReplyItem.Type.TODO, new C28597h(this.f71955a));
        return this;
    }

    public C28595f(AbstractC28534a aVar) {
        this.f71955a = aVar;
    }

    /* renamed from: a */
    public C28595f mo101796a(Chat chat) {
        this.f71956b.put(SmartReplyItem.Type.CALENDAR, new C28591c(this.f71955a, chat));
        return this;
    }

    /* renamed from: a */
    public C28595f mo101795a(AbstractC28619b bVar, Chat chat) {
        this.f71956b.put(SmartReplyItem.Type.DOCS, new C28593d(this.f71955a, bVar, chat));
        return this;
    }

    /* renamed from: b */
    public C28595f mo101798b(AbstractC28619b bVar, Chat chat) {
        this.f71956b.put(SmartReplyItem.Type.TEXT, new C28596g(this.f71955a, bVar, chat));
        return this;
    }

    @Override // com.ss.android.lark.ai.smartreply.p1343a.AbstractC28594e
    /* renamed from: a */
    public void mo101791a(ISmartReplyInterface iSmartReplyInterface, SmartReplyItem smartReplyItem, Message message) {
        AbstractC28589a aVar = this.f71956b.get(smartReplyItem.mo101843d());
        this.f71957c = aVar;
        if (aVar != null) {
            aVar.mo101791a(iSmartReplyInterface, smartReplyItem, message);
        }
    }

    @Override // com.ss.android.lark.ai.smartreply.p1343a.AbstractC28594e
    /* renamed from: a */
    public boolean mo101790a(int i, int i2, Intent intent) {
        AbstractC28594e eVar = this.f71957c;
        if (eVar != null) {
            return eVar.mo101790a(i, i2, intent);
        }
        return false;
    }
}
