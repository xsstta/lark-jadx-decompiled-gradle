package com.ss.android.lark.chat.service.impl;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.basic.v1.QuasiMessage;
import com.bytedance.lark.pb.im.v1.PushMessageReactions;
import com.bytedance.lark.pb.im.v1.PushMessageReadStates;
import com.bytedance.lark.pb.im.v1.PushMessageResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.thread.ThreadFactoryC26153m;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.AbstractC29626r;
import com.ss.android.lark.biz.im.api.C29598aa;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.api.service.p1600b.C32881i;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2851u.p2852a.C57304a;
import com.ss.android.lark.p2851u.p2852a.C57306b;
import com.ss.android.lark.p2851u.p2852a.C57310e;
import com.ss.android.lark.p2851u.p2852a.C57322k;
import com.ss.android.lark.p2851u.p2852a.C57327p;
import com.ss.android.lark.p2851u.p2852a.C57332v;
import com.ss.android.lark.p2851u.p2852a.C57336y;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.ss.android.lark.chat.service.impl.r */
public class C34253r {

    /* renamed from: b */
    private static final Executor f88544b = Executors.newSingleThreadExecutor(new ThreadFactoryC26153m("thread-pool-message-push"));

    /* renamed from: a */
    public final List<AbstractC29626r> f88545a;

    /* renamed from: c */
    private final List<AbstractC34257b> f88546c;

    /* renamed from: d */
    private final List<Object> f88547d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.r$a */
    public static class C34256a {

        /* renamed from: a */
        public static final C34253r f88556a = new C34253r();
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.r$b */
    public interface AbstractC34257b {
        /* renamed from: a */
        void mo123097a(MessageInfo messageInfo);
    }

    /* renamed from: a */
    public static C34253r m132890a() {
        return C34256a.f88556a;
    }

    /* renamed from: a */
    public void mo126802a(AbstractC29626r rVar) {
        this.f88545a.add(rVar);
        m132896a((Object) rVar);
    }

    /* renamed from: a */
    public void mo126804a(AbstractC34257b bVar) {
        this.f88546c.add(bVar);
        m132896a((Object) bVar);
    }

    /* renamed from: a */
    public void mo126803a(MessageInfo messageInfo) {
        m132902b(messageInfo);
    }

    private C34253r() {
        this.f88545a = new CopyOnWriteArrayList();
        this.f88546c = new CopyOnWriteArrayList();
        this.f88547d = new CopyOnWriteArrayList();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m132899b() {
        C53248k a = C53248k.m205912a();
        a.mo181696a(Command.PUSH_MESSAGES_V2);
        a.mo181696a(Command.PUSH_MESSAGE_REACTIONS);
        a.mo181696a(Command.PUSH_MESSAGE_READ_STATES);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m132905c() {
        C53248k a = C53248k.m205912a();
        a.mo181697a(Command.PUSH_MESSAGES_V2, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$r$NufqWuP_bKs_ngYr3MDXcy4iez8 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34253r.this.m132908c(bArr, str, z, z2);
            }
        });
        a.mo181697a(Command.PUSH_MESSAGE_REACTIONS, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$r$nmhCfn3r0vcxWLTSNPyxUamU5ac */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34253r.this.m132904b(bArr, str, z, z2);
            }
        });
        a.mo181697a(Command.PUSH_MESSAGE_READ_STATES, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$r$M6U1eFtTBr9i2der0YzRbM0hE8 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34253r.this.m132897a(bArr, str, z, z2);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.service.impl.r$2 */
    public static /* synthetic */ class C342552 {

        /* renamed from: a */
        static final /* synthetic */ int[] f88554a;

        /* renamed from: b */
        static final /* synthetic */ int[] f88555b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                com.bytedance.lark.pb.basic.v1.Command[] r0 = com.bytedance.lark.pb.basic.v1.Command.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.chat.service.impl.C34253r.C342552.f88555b = r0
                r1 = 1
                com.bytedance.lark.pb.basic.v1.Command r2 = com.bytedance.lark.pb.basic.v1.Command.PUSH_MESSAGES_V2     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.android.lark.chat.service.impl.C34253r.C342552.f88555b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.basic.v1.Command r3 = com.bytedance.lark.pb.basic.v1.Command.PUSH_MESSAGE_REACTIONS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = com.ss.android.lark.chat.service.impl.C34253r.C342552.f88555b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.basic.v1.Command r4 = com.bytedance.lark.pb.basic.v1.Command.PUSH_MESSAGE_READ_STATES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.bytedance.lark.pb.im.v1.PushMessageResponse$MessageItem$ItemType[] r3 = com.bytedance.lark.pb.im.v1.PushMessageResponse.MessageItem.ItemType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.ss.android.lark.chat.service.impl.C34253r.C342552.f88554a = r3
                com.bytedance.lark.pb.im.v1.PushMessageResponse$MessageItem$ItemType r4 = com.bytedance.lark.pb.im.v1.PushMessageResponse.MessageItem.ItemType.EPHEMERAL_MESSAGE     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = com.ss.android.lark.chat.service.impl.C34253r.C342552.f88554a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.lark.pb.im.v1.PushMessageResponse$MessageItem$ItemType r3 = com.bytedance.lark.pb.im.v1.PushMessageResponse.MessageItem.ItemType.NORMAL_MESSAGE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = com.ss.android.lark.chat.service.impl.C34253r.C342552.f88554a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.bytedance.lark.pb.im.v1.PushMessageResponse$MessageItem$ItemType r1 = com.bytedance.lark.pb.im.v1.PushMessageResponse.MessageItem.ItemType.QUASI_MESSAGE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = com.ss.android.lark.chat.service.impl.C34253r.C342552.f88554a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.bytedance.lark.pb.im.v1.PushMessageResponse$MessageItem$ItemType r1 = com.bytedance.lark.pb.im.v1.PushMessageResponse.MessageItem.ItemType.UNKNOWN_MESSAGE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.service.impl.C34253r.C342552.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m132903b(Object obj) {
        C53246j.m205911b(this.f88547d, obj, $$Lambda$r$scJlqo0HhLakyrnZxWms49V4tg.INSTANCE);
    }

    /* renamed from: b */
    private void m132902b(MessageInfo messageInfo) {
        if (messageInfo != null) {
            f88544b.execute(new Runnable(messageInfo) {
                /* class com.ss.android.lark.chat.service.impl.$$Lambda$r$u5NNBy9Pcyd1S_Ose_Dsf6vEIw */
                public final /* synthetic */ MessageInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C34253r.this.m132907c((C34253r) this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m132906c(PushMessageReactions pushMessageReactions) {
        for (AbstractC29626r rVar : this.f88545a) {
            rVar.mo106748a(pushMessageReactions);
        }
    }

    /* renamed from: b */
    private String m132898b(PushMessageReactions pushMessageReactions) {
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(pushMessageReactions.chat_id);
        if (!pushMessageReactions.msg_id2reactions.isEmpty()) {
            sb.append(", msg_id2reactions=");
            sb.append(pushMessageReactions.msg_id2reactions);
        }
        StringBuilder replace = sb.replace(0, 2, "PushMessageReactions{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: a */
    private void m132892a(PushMessageReactions pushMessageReactions) {
        if (pushMessageReactions == null || pushMessageReactions.msg_id2reactions == null) {
            Log.m165389i("MessagePushV2", "handleReactionPushMessage, reactions or msg_id2reactions is null");
            return;
        }
        Log.m165389i("MessagePushV2", "handleReactionPushMessage: " + m132898b(pushMessageReactions));
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(pushMessageReactions) {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$r$KmdVIAHoJnR4L2VExH6kcA0VGGs */
            public final /* synthetic */ PushMessageReactions f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C34253r.this.m132906c((C34253r) this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m132907c(MessageInfo messageInfo) {
        for (AbstractC34257b bVar : this.f88546c) {
            bVar.mo123097a(messageInfo);
        }
    }

    /* renamed from: a */
    private void m132893a(PushMessageReadStates pushMessageReadStates) {
        if (pushMessageReadStates == null) {
            Log.m165389i("MessagePushV2", "handleReadStatePushMessage, readStates is null");
            return;
        }
        Log.m165389i("MessagePushV2", "handleReadStatePushMessage: " + pushMessageReadStates.toString());
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(pushMessageReadStates) {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$r$H2ZirdsUNw6mZv3FcluwK98A9VA */
            public final /* synthetic */ PushMessageReadStates f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C34253r.this.m132901b((C34253r) this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m132901b(PushMessageReadStates pushMessageReadStates) {
        for (AbstractC29626r rVar : this.f88545a) {
            rVar.mo106749a(pushMessageReadStates);
        }
    }

    /* renamed from: a */
    private void m132894a(PushMessageResponse pushMessageResponse) {
        ThreadTopic threadTopic;
        Map<String, ThreadTopic> map;
        C33982a aVar;
        Map<String, Chat> map2;
        boolean z;
        ThreadTopic threadTopic2;
        if (pushMessageResponse == null || pushMessageResponse.entity == null) {
            Log.m165389i("MessagePushV2", "pushMessage, response or entity is null");
            return;
        }
        C14928Entity entity = pushMessageResponse.entity;
        List<PushMessageResponse.MessageItem> list = pushMessageResponse.message_items;
        Map<String, Message> b = C57322k.m222132b(entity);
        int i = 1;
        C33982a a = C57306b.m222058a(entity, true, "MessagePush::handlePushMessage");
        ThreadTopic threadTopic3 = null;
        Map<String, Chat> a2 = C57310e.m222090a(entity.chats, null, entity.mail_setting);
        Map<String, ThreadTopic> a3 = C57332v.m222231a(entity.threads);
        HashMap hashMap = new HashMap();
        for (PushMessageResponse.MessageItem messageItem : list) {
            String str = messageItem.item_id;
            int i2 = C342552.f88554a[messageItem.item_type.ordinal()];
            if (i2 == i || i2 == 2) {
                if (messageItem.item_type == PushMessageResponse.MessageItem.ItemType.EPHEMERAL_MESSAGE) {
                    z = true;
                } else {
                    z = false;
                }
                MessageInfo a4 = m132889a(entity, b, a, hashMap, str, z);
                if (a4 != null) {
                    String threadId = a4.getMessage().getThreadId();
                    if (TextUtils.isEmpty(threadId)) {
                        threadTopic2 = threadTopic3;
                    } else {
                        threadTopic2 = a3.get(threadId);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (threadTopic2 != null && CollectionUtils.isNotEmpty(threadTopic2.getLastReplyIds())) {
                        for (String str2 : threadTopic2.getLastReplyIds()) {
                            Message message = b.get(str2);
                            if (message == null) {
                                C53241h.m205894a("MessagePushV2", "message is null, replyId=" + str2);
                            } else {
                                ChatChatter a5 = a.mo124892a(message.getChatId(), message.getFromId());
                                if (a5 == null) {
                                    C53241h.m205894a("MessagePushV2", "message sender is null, replyId=" + str2);
                                } else {
                                    MessageInfo messageInfo = new MessageInfo(message, a5);
                                    messageInfo.setTranslateInfo(C57336y.m222236a(message, entity));
                                    arrayList.add(messageInfo);
                                }
                            }
                        }
                    }
                    List<MessageInfo> a6 = C32881i.m126558a(entity, threadTopic2, a, b);
                    map = a3;
                    map2 = a2;
                    threadTopic = null;
                    aVar = a;
                    m132895a(a4, a2.get(a4.getMessage().getChatId()), threadTopic2, arrayList, a6);
                    a2 = map2;
                    a = aVar;
                    a3 = map;
                    threadTopic3 = threadTopic;
                    i = 1;
                }
            } else if (i2 != 3) {
                Log.m165397w("MessagePushV2", "pushMessage, message type is unknown, item id is: " + str);
            } else {
                MessageInfo a7 = m132888a(entity, a, str);
                if (a7 != null) {
                    Log.m165388i("handlePushPreMessage, message:" + a7);
                    m132902b(a7);
                }
            }
            map = a3;
            map2 = a2;
            threadTopic = threadTopic3;
            aVar = a;
            a2 = map2;
            a = aVar;
            a3 = map;
            threadTopic3 = threadTopic;
            i = 1;
        }
    }

    /* renamed from: b */
    public void mo126805b(AbstractC29626r rVar) {
        this.f88545a.remove(rVar);
        m132903b((Object) rVar);
    }

    /* renamed from: a */
    private void m132896a(Object obj) {
        C53246j.m205910a(this.f88547d, obj, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$r$5VTGSdY1H8hg8jivuHEls4ktsHI */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C34253r.this.m132905c();
            }
        });
    }

    /* renamed from: b */
    public void mo126806b(AbstractC34257b bVar) {
        this.f88546c.remove(bVar);
        m132903b((Object) bVar);
    }

    /* renamed from: a */
    private void m132891a(Command command, byte[] bArr) {
        f88544b.execute(new Runnable(command, bArr) {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$r$Psmncynskl2vCYgx3v0pRcmdQ4 */
            public final /* synthetic */ Command f$1;
            public final /* synthetic */ byte[] f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C34253r.this.m132900b(this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m132900b(Command command, byte[] bArr) {
        try {
            int i = C342552.f88555b[command.ordinal()];
            if (i == 1) {
                m132894a(PushMessageResponse.ADAPTER.decode(bArr));
            } else if (i == 2) {
                m132892a(PushMessageReactions.ADAPTER.decode(bArr));
            } else if (i != 3) {
                Log.m165389i("MessagePushV2", "unKnow command: " + command);
            } else {
                m132893a(PushMessageReadStates.ADAPTER.decode(bArr));
            }
        } catch (IOException | IllegalStateException e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* renamed from: a */
    private MessageInfo m132888a(C14928Entity entity, C33982a aVar, String str) {
        QuasiMessage quasiMessage = entity.quasi_messages.get(str);
        if (quasiMessage == null) {
            Log.m165383e("MessagePushV2", "Fail to find pbMessage, item id is: " + str);
            return null;
        }
        Message a = C57322k.m222119a(entity, quasiMessage);
        Log.m165389i("MessagePushV2", "push premessage: " + a);
        return C57322k.m222121a(a, entity, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m132897a(byte[] bArr, String str, boolean z, boolean z2) {
        m132891a(Command.PUSH_MESSAGE_READ_STATES, bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m132908c(byte[] bArr, String str, boolean z, boolean z2) {
        m132891a(Command.PUSH_MESSAGES_V2, bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m132904b(byte[] bArr, String str, boolean z, boolean z2) {
        m132891a(Command.PUSH_MESSAGE_REACTIONS, bArr);
    }

    /* renamed from: a */
    private void m132895a(final MessageInfo messageInfo, final Chat chat, final ThreadTopic threadTopic, final List<MessageInfo> list, final List<MessageInfo> list2) {
        if (messageInfo != null) {
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.chat.service.impl.C34253r.RunnableC342541 */

                public void run() {
                    for (AbstractC29626r rVar : C34253r.this.f88545a) {
                        rVar.mo106750a(new C29598aa(messageInfo, chat, threadTopic, list, list2));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static MessageInfo m132889a(C14928Entity entity, Map<String, Message> map, C33982a aVar, HashMap<String, MessageInfo> hashMap, String str, boolean z) {
        com.bytedance.lark.pb.basic.v1.Message message;
        MessageInfo messageInfo;
        ChatChatter a;
        ChatChatter a2;
        Iterator<String> it;
        Message message2 = map.get(str);
        if (z) {
            message = entity.ephemeral_messages.get(str);
        } else {
            message = entity.messages.get(str);
        }
        if (message2 == null || message == null) {
            Log.m165383e("MessagePushV2", "Failed to find message or pbMessage, item id is: " + str);
            return null;
        }
        message2.setEphemeral(z);
        Log.m165389i("MessagePushV2", "push message:" + message2);
        ChatChatter a3 = aVar.mo124892a(message2.getChatId(), message2.getFromId());
        String id = message2.getId();
        String chatId = message2.getChatId();
        if (hashMap.containsKey(id)) {
            messageInfo = hashMap.get(id);
        } else {
            messageInfo = new MessageInfo(message2, a3);
        }
        messageInfo.setPin(C57304a.m222047a(message.pin, chatId, aVar));
        ArrayList arrayList = new ArrayList();
        Iterator<Message.Reaction> it2 = message.reactions.iterator();
        while (it2.hasNext()) {
            Reaction a4 = C57327p.m222180a(it2.next());
            List<String> chatterIds = a4.getChatterIds();
            HashMap hashMap2 = new HashMap();
            Iterator<String> it3 = chatterIds.iterator();
            while (it3.hasNext()) {
                String next = it3.next();
                ChatChatter a5 = aVar.mo124892a(chatId, next);
                if (a5 != null) {
                    hashMap2.put(a5.getId(), a5);
                    it = it3;
                } else {
                    StringBuilder sb = new StringBuilder();
                    it = it3;
                    sb.append("reactionChatter is null, chatid: ");
                    sb.append(chatId);
                    sb.append("  reactionChatterId: ");
                    sb.append(next);
                    Log.m165397w("MessagePushV2", sb.toString());
                }
                it2 = it2;
                it3 = it;
            }
            arrayList.add(new ReactionInfo(a4, hashMap2));
            it2 = it2;
        }
        messageInfo.setReactionInfoList(arrayList);
        C57304a.m222049a(message, messageInfo, aVar);
        String recallerId = message2.getRecallerId();
        if (!TextUtils.isEmpty(recallerId)) {
            messageInfo.setRecallUser(aVar.mo124892a(chatId, recallerId));
        }
        messageInfo.setTranslateInfo(C57336y.m222236a(message2, entity));
        C57304a.m222053b(message2, aVar);
        messageInfo.setOriginalSender(C57304a.m222054c(message2, aVar));
        C57304a.m222051a(message2, aVar);
        String rootId = message2.getRootId();
        if (!TextUtils.isEmpty(rootId)) {
            MessageInfo messageInfo2 = hashMap.get(rootId);
            com.ss.android.lark.chat.entity.message.Message message3 = map.get(rootId);
            if (!(messageInfo2 != null || message3 == null || (a2 = aVar.mo124892a(chatId, message3.getFromId())) == null)) {
                messageInfo2 = new MessageInfo(message3, a2);
                hashMap.put(rootId, messageInfo2);
            }
            messageInfo.setRootMessageInfo(messageInfo2);
        }
        String parentId = message2.getParentId();
        if (!TextUtils.isEmpty(parentId)) {
            MessageInfo messageInfo3 = hashMap.get(parentId);
            com.ss.android.lark.chat.entity.message.Message message4 = map.get(parentId);
            if (!(messageInfo3 != null || message4 == null || (a = aVar.mo124892a(chatId, message4.getFromId())) == null)) {
                messageInfo3 = new MessageInfo(message4, a);
                hashMap.put(parentId, messageInfo3);
            }
            messageInfo.setParentMessageInfo(messageInfo3);
        }
        hashMap.put(id, messageInfo);
        return messageInfo;
    }
}
