package com.ss.android.lark.chat.chatwindow.chat.model.p1637c;

import com.larksuite.framework.utils.AndroidThrottle;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.sdk.C53241h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.c.b */
public class C33404b implements AndroidThrottle.AbstractC26232d<AbstractC34006a> {

    /* renamed from: a */
    final Map<String, AbstractC34006a> f86027a = new LinkedHashMap();

    @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
    /* renamed from: b */
    public void mo93317b() {
    }

    @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
    /* renamed from: c */
    public int mo93318c() {
        return this.f86027a.size();
    }

    @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
    /* renamed from: d */
    public Collection<AbstractC34006a> mo93319d() {
        ArrayList arrayList = new ArrayList(this.f86027a.values());
        Collections.sort(arrayList, $$Lambda$b$mEpGb9iAOI2mSS75HshExr4lPwE.INSTANCE);
        this.f86027a.clear();
        return arrayList;
    }

    /* renamed from: a */
    public void mo93316a(AbstractC34006a aVar) {
        if (aVar != null && aVar.getMessage() != null) {
            Message message = aVar.getMessage();
            String id = message.getId();
            AbstractC34006a aVar2 = this.f86027a.get(id);
            if (aVar2 == null) {
                this.f86027a.put(message.getId(), aVar);
            } else if (aVar2.getMessage().getUpdateTime() <= message.getUpdateTime()) {
                this.f86027a.put(message.getId(), aVar);
                C53241h.m205898b("ChatWindowLog", "update message in buffer: " + id);
            } else {
                C53241h.m205898b("ChatWindowLog", "filter update message in buffer: " + id);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m129422a(AbstractC34006a aVar, AbstractC34006a aVar2) {
        if (!(aVar instanceof Comparable) || !(aVar2 instanceof Comparable)) {
            return 0;
        }
        return ((Comparable) aVar).compareTo(aVar2);
    }
}
