package com.ss.android.lark.chat.chatwindow.chat.model;

import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ITextLayoutPreCalculateLifeCycle;
import com.ss.android.lark.chat.core.model.AbstractExecutorC33962g;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.c */
public class C33400c extends AbstractC34417b<MessageInfo, ChatPageData> {

    /* renamed from: a */
    public final Map<String, Boolean> f86021a = new ConcurrentHashMap();

    /* renamed from: i */
    private final Map<String, HashSet<String>> f86022i = new HashMap();

    /* renamed from: j */
    private AbstractC33402a f86023j;

    /* renamed from: k */
    private final ITextLayoutPreCalculateLifeCycle f86024k;

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.c$a */
    public interface AbstractC33402a {
        /* renamed from: a */
        int mo122956a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.AbstractC34417b
    /* renamed from: c */
    public String mo122942c() {
        return "ChatWindowDataStore";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo122944c(MessageInfo messageInfo) {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.AbstractC34417b
    /* renamed from: a */
    public void mo122933a() {
        this.f88887g = new AbstractC34417b.AbstractC34420b<MessageInfo, ChatPageData>() {
            /* class com.ss.android.lark.chat.chatwindow.chat.model.C33400c.C334011 */

            /* renamed from: a */
            public void mo122953a(MessageInfo messageInfo) {
                C33400c.this.mo122941b(messageInfo);
            }

            /* renamed from: a */
            public void mo122955a(List<MessageInfo> list, ChatPageData bVar) {
                C33400c.this.mo122938a(list);
                if (bVar != null) {
                    C33400c.this.f86021a.putAll(bVar.mo122927a());
                }
            }
        };
    }

    /* renamed from: b */
    public Map<String, Boolean> mo122940b() {
        return new HashMap(this.f86021a);
    }

    /* renamed from: a */
    public void mo122935a(AbstractC33402a aVar) {
        this.f86023j = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo122939b(MessageInfo messageInfo) {
        return messageInfo.getMessage().getPosition();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo122932a(MessageInfo messageInfo) {
        return messageInfo.getMessage().getBadgeCount();
    }

    /* renamed from: a */
    public void mo122936a(ChatPageData bVar) {
        super.mo122936a((C33952a) bVar);
        this.f86021a.putAll(bVar.mo122927a());
    }

    /* renamed from: b */
    private boolean m129391b(int i) {
        int a;
        AbstractC33402a aVar = this.f86023j;
        if (aVar == null || (a = aVar.mo122956a()) < 0) {
            return false;
        }
        String c = mo122942c();
        Log.m165389i(c, "newItemPosition is:" + i + ", lastItemPosition is:" + a);
        if (i - a > 100) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo122946d(MessageInfo messageInfo) {
        if (messageInfo.isPreMessage()) {
            return true;
        }
        int d = mo122939b(messageInfo);
        if (this.f88883c == Integer.MAX_VALUE && this.f88884d == Integer.MIN_VALUE) {
            if (this.f88885e.get() < d) {
                return true;
            }
            return false;
        } else if (d >= this.f88883c && d <= this.f88884d + 1 && !m129391b(d)) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122949f(MessageInfo messageInfo) {
        super.mo122949f((AbstractC34006a) messageInfo);
        this.f86024k.mo122456a(messageInfo);
    }

    /* renamed from: b */
    public void mo122941b(MessageInfo messageInfo) {
        HashSet<String> hashSet;
        MessageInfo messageInfo2;
        MessageInfo parentMessageInfo;
        if ((messageInfo.getMessage().getReplyCount() > 0 || messageInfo.getParentMessageInfo() != null) && (hashSet = this.f86022i.get(messageInfo.getMessage().getId())) != null && !hashSet.isEmpty()) {
            Iterator<String> it = hashSet.iterator();
            while (it.hasNext()) {
                int itemPosByKey = this.f88882b.getItemPosByKey(it.next());
                if (itemPosByKey > -1 && (parentMessageInfo = (messageInfo2 = (MessageInfo) this.f88882b.get(itemPosByKey)).getParentMessageInfo()) != null && mo127106a(parentMessageInfo, messageInfo)) {
                    messageInfo2.setParentMessageInfo(messageInfo);
                    this.f88882b.set(itemPosByKey, messageInfo2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo122948e(MessageInfo messageInfo) {
        int d = mo122939b(messageInfo);
        if (messageInfo.isPreMessage() || this.f88882b.size() == 0 || d > mo127117f()) {
            super.mo122948e((AbstractC34006a) messageInfo);
            return;
        }
        for (int i = 0; i < this.f88882b.size(); i++) {
            int d2 = mo122939b((MessageInfo) this.f88882b.get(i));
            if (d2 > d) {
                Log.m165389i("ChatWindowDataStore", "appendNewItem into position:" + i + ", newItemPosition is" + d + ", nextPosition is:" + d2);
                this.f88882b.add(i, messageInfo);
                return;
            }
        }
        Log.m165397w("ChatWindowDataStore", "appendNewItem, can't find insert position, append to last position");
        super.mo122948e((AbstractC34006a) messageInfo);
    }

    /* renamed from: a */
    public void mo122938a(List<MessageInfo> list) {
        for (MessageInfo messageInfo : list) {
            MessageInfo parentMessageInfo = messageInfo.getParentMessageInfo();
            if (parentMessageInfo != null) {
                String id = parentMessageInfo.getMessage().getId();
                String id2 = messageInfo.getMessage().getId();
                HashSet<String> hashSet = this.f86022i.get(id);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    this.f86022i.put(id, hashSet);
                }
                hashSet.add(id2);
            }
        }
    }

    public C33400c(AbstractExecutorC33962g gVar, AbstractC34417b.AbstractC34423e eVar, ITextLayoutPreCalculateLifeCycle cVar) {
        super(gVar, eVar);
        this.f86024k = cVar;
    }
}
