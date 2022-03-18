package com.ss.android.lark.chat.api.service.track;

import android.text.TextUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.Pin;
import com.ss.android.lark.statistics.p2700n.C54967g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.chat.api.service.track.g */
public class C32911g implements AbstractC32909d {

    /* renamed from: a */
    private static final List<Message.Type> f84521a = Arrays.asList(Message.Type.TEXT, Message.Type.POST, Message.Type.FILE, Message.Type.IMAGE, Message.Type.AUDIO, Message.Type.STICKER, Message.Type.MEDIA, Message.Type.RED_PACKET);

    /* renamed from: b */
    private static final Map<String, C32911g> f84522b = new HashMap();

    /* renamed from: c */
    private final HashSet<String> f84523c = new HashSet<>();

    /* renamed from: d */
    private final HashSet<String> f84524d = new HashSet<>();

    /* renamed from: e */
    private IMessageSource f84525e;

    /* renamed from: f */
    private final String f84526f;

    /* renamed from: g */
    private boolean f84527g;

    /* renamed from: h */
    private String f84528h;

    /* renamed from: i */
    private String f84529i;

    /* renamed from: j */
    private volatile MessageInfo f84530j;

    @Override // com.ss.android.lark.chat.api.service.track.ICommonMsgIssueTracker
    /* renamed from: a */
    public void mo121415a() {
        Map<String, C32911g> map = f84522b;
        synchronized (map) {
            map.clear();
        }
    }

    @Override // com.ss.android.lark.chat.api.service.track.AbstractC32909d
    /* renamed from: c */
    public void mo121421c(String str) {
        this.f84529i = str;
    }

    /* renamed from: f */
    private void m126702f(String str) {
        C32848e.m126401b().mo121272e(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m126703g(String str) {
        try {
            m126699e(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public C32911g(String str) {
        this.f84526f = str;
    }

    @Override // com.ss.android.lark.chat.api.service.track.AbstractC32909d
    /* renamed from: b */
    public void mo121420b(String str) {
        if (this.f84527g) {
            C32910f a = this.f84525e.mo121414a(str, 0);
            if (a.mo121423a()) {
                this.f84530j = a.mo121424b();
            }
        }
    }

    /* renamed from: d */
    public static AbstractC32909d m126697d(String str) {
        C32911g gVar;
        if (TextUtils.isEmpty(str)) {
            return new C32911g("");
        }
        Map<String, C32911g> map = f84522b;
        synchronized (map) {
            gVar = map.get(str);
            if (gVar == null) {
                gVar = new C32911g(str);
                map.put(str, gVar);
            }
        }
        return gVar;
    }

    /* renamed from: e */
    private void m126699e(String str) {
        C32910f a = this.f84525e.mo121414a(str, 2);
        if (a.mo121423a()) {
            if (!this.f84523c.contains(str)) {
                this.f84523c.add(str);
                m126694a(a);
                m126695b(a);
                m126696c(a);
                m126698d(a);
                m126701f(a);
            }
            if (!this.f84524d.contains(str) && m126700e(a)) {
                this.f84524d.add(str);
            }
        }
    }

    /* renamed from: a */
    private void m126694a(C32910f fVar) {
        MessageInfo b = fVar.mo121424b();
        MessageInfo parentMessageInfo = b.getParentMessageInfo();
        Message message = b.getMessage();
        String fromId = message.getFromId();
        if (!message.isFromMe() && parentMessageInfo != null && parentMessageInfo.getMessage().isFromMe()) {
            String id = message.getId();
            Message message2 = parentMessageInfo.getMessage();
            String id2 = message2.getId();
            if (message2.getReadCount() <= 1) {
                C54967g.m213397a(id, id2, fromId);
            } else if (!fVar.mo121428f().contains(fromId) && fVar.mo121427e().contains(fromId)) {
                C54967g.m213402b(id, id2, fromId);
            }
        }
    }

    /* renamed from: b */
    private void m126695b(C32910f fVar) {
        Message message = fVar.mo121424b().getMessage();
        String id = message.getId();
        if (message.isFromMe()) {
            List<String> e = fVar.mo121427e();
            List<String> d = fVar.mo121426d();
            List<String> f = fVar.mo121428f();
            if (d.isEmpty()) {
                return;
            }
            if (message.getReadCount() <= 1) {
                C54967g.m213398a(id, new ArrayList(d));
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : d) {
                if (e.contains(str) && !f.contains(str)) {
                    arrayList.add(str);
                }
            }
            C54967g.m213403b(id, arrayList);
        }
    }

    /* renamed from: c */
    private void m126696c(C32910f fVar) {
        MessageInfo b = fVar.mo121424b();
        Pin pin = b.getPin();
        if (pin != null) {
            String id = b.getMessage().getId();
            String a = C29990c.m110930b().mo134515N().mo134394a();
            String operatorId = pin.getOperatorId();
            if (!operatorId.equals(a)) {
                List<String> e = fVar.mo121427e();
                List<String> f = fVar.mo121428f();
                if (b.getMessage().getReadCount() <= 1) {
                    C54967g.m213396a(id, operatorId);
                } else if (e.contains(operatorId) && !f.contains(operatorId)) {
                    C54967g.m213401b(id, operatorId);
                }
            }
        }
    }

    /* renamed from: d */
    private void m126698d(C32910f fVar) {
        MessageInfo b = fVar.mo121424b();
        String id = b.getMessage().getId();
        if (b.getMessage().isFromMe()) {
            ChatChatter recallUser = b.getRecallUser();
            String a = C29990c.m110930b().mo134515N().mo134394a();
            if (b.getMessage().getReadCount() <= 1 && recallUser != null && !recallUser.getId().equals(a)) {
                C54967g.m213404c(id, recallUser.getId());
            }
        }
    }

    /* renamed from: f */
    private void m126701f(C32910f fVar) {
        if (!TextUtils.isEmpty(this.f84529i) && !TextUtils.isEmpty(this.f84528h)) {
            MessageInfo b = fVar.mo121424b();
            if (!b.getMessage().getId().equals(this.f84529i)) {
                return;
            }
            if (b.getMessage().getReadCount() <= 1) {
                C54967g.m213406d(this.f84529i, this.f84528h);
                return;
            }
            List<String> b2 = C32910f.m126687b(b);
            List<String> a = C32910f.m126686a(b);
            if (b2.contains(this.f84528h) && !a.contains(this.f84528h)) {
                C54967g.m213408e(this.f84529i, this.f84528h);
            }
        }
    }

    @Override // com.ss.android.lark.chat.api.service.track.ICommonMsgIssueTracker
    /* renamed from: a */
    public void mo121416a(String str) {
        if (this.f84527g || !this.f84523c.contains(str) || !this.f84524d.contains(str)) {
            CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable(str) {
                /* class com.ss.android.lark.chat.api.service.track.$$Lambda$g$CHUHD8Yo8GmiCQ6UgZLfLwA7u7Q */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C32911g.this.m126703g(this.f$1);
                }
            }, 2000, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: e */
    private boolean m126700e(C32910f fVar) {
        List<MessageInfo> list;
        List<String> list2;
        ArrayList arrayList;
        List<MessageInfo> c = fVar.mo121425c();
        int size = c.size();
        if (size < 2) {
            return false;
        }
        MessageInfo messageInfo = c.get(0);
        Message message = messageInfo.getMessage();
        String id = message.getId();
        if (message.isFromMe()) {
            List<String> b = C32910f.m126687b(messageInfo);
            List<String> a = C32910f.m126686a(messageInfo);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            HashSet hashSet = new HashSet(2);
            long createTime = message.getCreateTime();
            long j = createTime;
            int i = 1;
            boolean z = true;
            while (i < size) {
                MessageInfo messageInfo2 = c.get(i);
                Message message2 = messageInfo2.getMessage();
                String fromId = message2.getFromId();
                if (message2.isFromMe() || messageInfo2.getMessageSender().getChatter().isBot() || hashSet.contains(fromId) || !TextUtils.isEmpty(message2.getParentSourceId())) {
                    list = c;
                } else {
                    list = c;
                    if (f84521a.contains(message2.getType())) {
                        hashSet.add(fromId);
                        if (message.getReadCount() <= 1) {
                            arrayList2.add(fromId);
                        } else if (b.contains(fromId) && !a.contains(fromId)) {
                            arrayList3.add(fromId);
                        }
                        if (z || !message2.isFromMe()) {
                            list2 = a;
                            arrayList = arrayList2;
                            j = j;
                        } else {
                            arrayList = arrayList2;
                            long min = Math.min(message2.getCreateTime(), createTime);
                            list2 = a;
                            long max = Math.max(message2.getCreateTime(), j);
                            if (max - min <= 120) {
                                if (i == size - 1 && message2.getReadCount() > message.getReadCount()) {
                                    C54967g.m213395a(id);
                                    m126702f(id);
                                }
                                j = max;
                                createTime = min;
                                i++;
                                arrayList2 = arrayList;
                                c = list;
                                a = list2;
                            } else {
                                j = max;
                                createTime = min;
                            }
                        }
                        z = false;
                        i++;
                        arrayList2 = arrayList;
                        c = list;
                        a = list2;
                    }
                }
                if (z) {
                }
                list2 = a;
                arrayList = arrayList2;
                j = j;
                z = false;
                i++;
                arrayList2 = arrayList;
                c = list;
                a = list2;
            }
            C54967g.m213405c(id, arrayList2);
            C54967g.m213407d(id, arrayList3);
            if (!arrayList3.isEmpty() || !arrayList2.isEmpty()) {
                m126702f(id);
            }
        }
        if (size >= 3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.api.service.track.AbstractC32909d
    /* renamed from: a */
    public void mo121417a(Chat chat, IMessageSource cVar) {
        boolean z;
        if (!TextUtils.isEmpty(this.f84526f) && chat != null && cVar != null && this.f84526f.equals(chat.getId())) {
            if (TextUtils.isEmpty(this.f84526f) || chat.getUserCount() >= 50) {
                z = false;
            } else {
                z = true;
            }
            this.f84527g = z;
            this.f84525e = cVar;
            this.f84528h = chat.getP2pChatterId();
        }
    }

    @Override // com.ss.android.lark.chat.api.service.track.AbstractC32909d
    /* renamed from: a */
    public boolean mo121419a(String str, int i) {
        MessageInfo messageInfo;
        if (this.f84527g && (messageInfo = this.f84530j) != null && messageInfo.getMessage().getId().equals(str) && messageInfo.getMessage().getReadCount() != i + 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r0 = r2.f84530j;
     */
    @Override // com.ss.android.lark.chat.api.service.track.AbstractC32909d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo121418a(java.lang.String r3, final int r4, final java.util.List<java.lang.String> r5) {
        /*
            r2 = this;
            boolean r0 = r2.f84527g
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.ss.android.lark.chat.entity.message.MessageInfo r0 = r2.f84530j
            if (r0 == 0) goto L_0x0028
            com.ss.android.lark.chat.entity.message.Message r1 = r0.getMessage()
            java.lang.String r1 = r1.getId()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0018
            goto L_0x0028
        L_0x0018:
            com.larksuite.framework.thread.CoreThreadPool r3 = com.larksuite.framework.thread.CoreThreadPool.getDefault()
            java.util.concurrent.ExecutorService r3 = r3.getFixedThreadPool()
            com.ss.android.lark.chat.api.service.track.g$1 r1 = new com.ss.android.lark.chat.api.service.track.g$1
            r1.<init>(r0, r4, r5)
            r3.submit(r1)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.api.service.track.C32911g.mo121418a(java.lang.String, int, java.util.List):void");
    }
}
