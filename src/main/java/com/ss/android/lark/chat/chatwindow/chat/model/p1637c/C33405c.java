package com.ss.android.lark.chat.chatwindow.chat.model.p1637c;

import com.larksuite.framework.utils.AndroidThrottle;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.sdk.C53241h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.c.c */
public class C33405c implements AndroidThrottle.AbstractC26232d<MessageInfo> {

    /* renamed from: a */
    final Map<String, MessageInfo> f86028a = new LinkedHashMap();

    @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
    /* renamed from: b */
    public synchronized void mo93317b() {
    }

    @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
    /* renamed from: c */
    public int mo93318c() {
        return this.f86028a.size();
    }

    /* renamed from: a */
    public List<MessageInfo> mo93319d() {
        ArrayList arrayList = new ArrayList(this.f86028a.values());
        Collections.sort(arrayList);
        this.f86028a.clear();
        return arrayList;
    }

    /* renamed from: a */
    public void mo93316a(MessageInfo messageInfo) {
        if (messageInfo != null && messageInfo.getMessage() != null) {
            Message message = messageInfo.getMessage();
            String id = message.getId();
            MessageInfo messageInfo2 = this.f86028a.get(id);
            if (messageInfo2 == null) {
                this.f86028a.put(message.getId(), messageInfo);
            } else if (messageInfo2.getMessage().getUpdateTime() <= message.getUpdateTime()) {
                this.f86028a.put(message.getId(), messageInfo);
                C53241h.m205898b("chatwindow", "update message in buffer: " + id);
            } else {
                C53241h.m205898b("chatwindow", "filter update message in buffer: " + id);
            }
        }
    }
}
