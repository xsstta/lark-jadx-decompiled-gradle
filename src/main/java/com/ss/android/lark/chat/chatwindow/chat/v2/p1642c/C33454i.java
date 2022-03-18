package com.ss.android.lark.chat.chatwindow.chat.v2.p1642c;

import com.bytedance.lark.pb.im.v1.PushMessageReactions;
import com.bytedance.lark.pb.im.v1.PushMessageReadStates;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.AndroidThrottle;
import com.ss.android.lark.biz.im.api.C29598aa;
import com.ss.android.lark.chat.chatwindow.chat.model.p1637c.C33403a;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33454i;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.service.impl.C34253r;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.chat.utils.C34354t;
import com.ss.android.lark.chatwindow.p1723b.C35237c;
import com.ss.android.lark.listener.IReadStateCallback;
import com.ss.android.lark.listener.PushChatRelationListener;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.i */
public class C33454i implements C33466o.AbstractC33467a {

    /* renamed from: a */
    public final String f86237a;

    /* renamed from: b */
    public final AbstractC33459b f86238b;

    /* renamed from: c */
    public final AbstractC33458a f86239c;

    /* renamed from: d */
    private AndroidThrottle<Chat> f86240d;

    /* renamed from: e */
    private final PushChatRelationListener f86241e = new PushChatRelationListener() {
        /* class com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33454i.C334551 */

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m129645a(List list) {
            if (C33454i.this.f86238b != null) {
                C33454i.this.f86238b.onPushMessage(list, false);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m129647b(PushMessageReadStates pushMessageReadStates) {
            C34350p.m133214a(C33454i.this.f86237a, pushMessageReadStates, new IReadStateCallback() {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33454i.C334551.C334561 */

                @Override // com.ss.android.lark.listener.IReadStateCallback
                /* renamed from: a */
                public MessageInfo mo123095a(String str) {
                    return C33454i.this.f86239c.getMessageById(str);
                }

                @Override // com.ss.android.lark.listener.IReadStateCallback
                /* renamed from: a */
                public void mo123096a(MessageInfo messageInfo) {
                    if (C33454i.this.f86238b != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(messageInfo);
                        C33454i.this.f86238b.onPushMessage(arrayList, false);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo123090a(PushMessageReactions pushMessageReactions) {
            if (C34350p.m133218a(C33454i.this.f86237a, pushMessageReactions.chat_id)) {
                CoreThreadPool.getBackgroundHandler().post(new Runnable(pushMessageReactions) {
                    /* class com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.$$Lambda$i$1$DOPtDWKkmD8axrKkLaCUWrNIMIE */
                    public final /* synthetic */ PushMessageReactions f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C33454i.C334551.lambda$DOPtDWKkmD8axrKkLaCUWrNIMIE(C33454i.C334551.this, this.f$1);
                    }
                });
            }
        }

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo123091a(PushMessageReadStates pushMessageReadStates) {
            CoreThreadPool.getBackgroundHandler().postDelayed(new Runnable(pushMessageReadStates) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.$$Lambda$i$1$8BZRROy4Iu3hTc5nw0Jyr1mbKDM */
                public final /* synthetic */ PushMessageReadStates f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C33454i.C334551.lambda$8BZRROy4Iu3hTc5nw0Jyr1mbKDM(C33454i.C334551.this, this.f$1);
                }
            }, 300);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m129646b(PushMessageReactions pushMessageReactions) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, PushMessageReactions.Reactions> entry : pushMessageReactions.msg_id2reactions.entrySet()) {
                MessageInfo messageById = C33454i.this.f86239c.getMessageById(entry.getKey());
                if (messageById != null) {
                    Log.m165389i("chatwindow", "onPushReactionMessage success, msg id: " + entry.getKey());
                    messageById.setReactionInfoList(C35237c.m137595a(pushMessageReactions.chat_id, entry.getValue(), pushMessageReactions.entity));
                    arrayList.add(messageById);
                }
            }
            if (C33454i.this.f86238b != null) {
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(arrayList) {
                    /* class com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.$$Lambda$i$1$vonhTZ6mPJdl2cCzkL3AeG1kbk */
                    public final /* synthetic */ List f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C33454i.C334551.m270392lambda$vonhTZ6mPJdl2cCzkL3AeG1kbk(C33454i.C334551.this, this.f$1);
                    }
                });
            }
        }

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo123092a(C29598aa aaVar) {
            MessageInfo a = aaVar.mo106644a();
            if (C33454i.this.f86237a.equals(a.getMessage().getChatId()) && C33454i.this.f86238b != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(a);
                C33454i.this.f86238b.onPushMessage(arrayList, false);
            }
            C33454i.this.mo123089c().mo93303a(aaVar.mo106645b());
        }

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo123093a(Chat chat) {
            if (C33454i.this.f86237a.equals(chat.getId())) {
                C33454i.this.mo123089c().mo93303a(chat);
            }
        }

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo123094a(Chat chat, Map<String, ? extends Chatter> map) {
            if (C34350p.m133218a(C33454i.this.f86237a, chat.getId())) {
                C33454i.this.f86238b.onPushChatRemoveChatters(chat, map);
            }
        }
    };

    /* renamed from: f */
    private final C34253r.AbstractC34257b f86242f = new C34253r.AbstractC34257b() {
        /* class com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33454i.C334572 */

        @Override // com.ss.android.lark.chat.service.impl.C34253r.AbstractC34257b
        /* renamed from: a */
        public void mo123097a(MessageInfo messageInfo) {
            C33454i.this.mo123088a(messageInfo);
        }
    };

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.i$a */
    public interface AbstractC33458a {
        MessageInfo getMessageById(String str);
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.i$b */
    public interface AbstractC33459b {
        void onPushChat(Chat chat);

        void onPushChatRemoveChatters(Chat chat, Map<String, ? extends Chatter> map);

        void onPushMessage(List<MessageInfo> list, boolean z);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: b */
    public void mo123056b() {
        C34354t.m133250a().mo126931b(String.valueOf(hashCode()), this.f86237a, null);
        C34253r.m132890a().mo126806b(this.f86242f);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: a */
    public void mo123055a() {
        C34354t.m133250a().mo126930a(String.valueOf(hashCode()), this.f86237a, this.f86241e);
        C34253r.m132890a().mo126804a(this.f86242f);
    }

    /* renamed from: c */
    public synchronized AndroidThrottle<Chat> mo123089c() {
        if (this.f86240d == null) {
            this.f86240d = new AndroidThrottle.C26229a().mo93309a(300L).mo93310a(CoreThreadPool.getNonblockingHandler()).mo93311a(new C33403a()).mo93312a(new AndroidThrottle.AbstractC26233e() {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.$$Lambda$i$ssIl5WnGo2xpxHqFOu7NnZzE3g */

                @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26233e
                public final void execute(Collection collection) {
                    C33454i.m270391lambda$ssIl5WnGo2xpxHqFOu7NnZzE3g(C33454i.this, collection);
                }
            }).mo93313a();
        }
        return this.f86240d;
    }

    /* renamed from: a */
    private void m129639a(Chat chat) {
        AbstractC33459b bVar = this.f86238b;
        if (bVar != null) {
            bVar.onPushChat(chat);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m129640a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m129639a((Chat) it.next());
        }
    }

    /* renamed from: a */
    public void mo123088a(MessageInfo messageInfo) {
        if (Objects.equals(this.f86237a, messageInfo.getMessage().getChatId()) && this.f86238b != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(messageInfo);
            this.f86238b.onPushMessage(arrayList, true);
        }
    }

    public C33454i(String str, AbstractC33459b bVar, AbstractC33458a aVar) {
        this.f86237a = str;
        this.f86238b = bVar;
        this.f86239c = aVar;
    }
}
