package com.ss.android.lark.chat.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Thread;
import com.bytedance.lark.pb.im.v1.PushMyThreadsReplyPrompt;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.api.service.p1600b.C32881i;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.response.PushMyThreadReplyPromptResponse;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.chat.service.impl.ad */
public class C34166ad {

    /* renamed from: a */
    public final List<AbstractC34171c> f88422a;

    /* renamed from: b */
    public final List<AbstractC34170b> f88423b;

    /* renamed from: com.ss.android.lark.chat.service.impl.ad$a */
    private static class C34169a {

        /* renamed from: a */
        public static final C34166ad f88428a = new C34166ad();
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.ad$b */
    public interface AbstractC34170b {
        /* renamed from: a */
        void mo126711a(PushMyThreadReplyPromptResponse pushMyThreadReplyPromptResponse);
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.ad$c */
    public interface AbstractC34171c {
        /* renamed from: a */
        void mo126712a(JSONObject jSONObject);
    }

    /* renamed from: a */
    public static C34166ad m132655a() {
        return C34169a.f88428a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m132657b() {
        C53248k.m205912a().mo181696a(Command.PUSH_MY_THREADS_REPLY_PROMPT);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m132659c() {
        C53248k.m205912a().mo181697a(Command.PUSH_MY_THREADS_REPLY_PROMPT, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$ad$KehHijusDofERnYzjpywJO7fHs */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34166ad.this.m132658b(bArr, str, z, z2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m132660d() {
        C53248k.m205912a().mo181696a(Command.PUSH_THREADS);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m132661e() {
        C53248k.m205912a().mo181697a(Command.PUSH_THREADS, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$ad$KNuM_ThKtFJNRTMlNBgcs1JGG_U */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34166ad.this.m132656a(bArr, str, z, z2);
            }
        });
    }

    private C34166ad() {
        this.f88422a = new CopyOnWriteArrayList();
        this.f88423b = new CopyOnWriteArrayList();
    }

    /* renamed from: b */
    public void mo126707b(AbstractC34170b bVar) {
        C53246j.m205911b(this.f88423b, bVar, $$Lambda$ad$mOnI5KpDIkB3qza660lmN1LLFUI.INSTANCE);
    }

    /* renamed from: a */
    public void mo126705a(AbstractC34170b bVar) {
        C53246j.m205910a(this.f88423b, bVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$ad$23WVUFajYLXrafzzoeDGTwx8Ck */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C34166ad.this.m132659c();
            }
        });
    }

    /* renamed from: a */
    public void mo126706a(AbstractC34171c cVar) {
        C53246j.m205910a(this.f88422a, cVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$ad$vmDwxsASvdkNCJal5jq3TFZPIcU */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C34166ad.this.m132661e();
            }
        });
    }

    /* renamed from: b */
    public void mo126708b(AbstractC34171c cVar) {
        C53246j.m205911b(this.f88422a, cVar, $$Lambda$ad$_U1PAO8mnWRaxxIFczHdtjA0bm8.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m132658b(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushMyThreadsReplyPrompt decode = PushMyThreadsReplyPrompt.ADAPTER.decode(bArr);
            String str2 = decode.group_id;
            int intValue = decode.new_reply_count.intValue();
            int intValue2 = decode.new_at_reply_count.intValue();
            List<String> list = decode.new_at_reply_ids;
            C14928Entity entity = decode.entity;
            final PushMyThreadReplyPromptResponse pushMyThreadReplyPromptResponse = new PushMyThreadReplyPromptResponse(str2, intValue, intValue2, C32881i.m126559a(entity, C57306b.m222058a(entity, true, "ThreadService::syncPullThreadInfo"), C57322k.m222132b(entity), list));
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.chat.service.impl.C34166ad.RunnableC341682 */

                public void run() {
                    for (AbstractC34170b bVar : C34166ad.this.f88423b) {
                        bVar.mo126711a(pushMyThreadReplyPromptResponse);
                    }
                }
            });
        } catch (Exception e) {
            C53241h.m205895a("ThreadPush", e.getMessage(), e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m132656a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            C14928Entity decode = C14928Entity.ADAPTER.decode(bArr);
            Map<String, Message> b = C57322k.m222132b(decode);
            C33982a a = C57306b.m222058a(decode, true, "ThreadPush::onPushThread");
            Map<String, com.bytedance.lark.pb.basic.v1.Message> map = decode.messages;
            Map<String, Chat> map2 = decode.chats;
            for (Thread thread : decode.threads.values()) {
                ThreadTopic a2 = C57332v.m222229a(thread);
                if (a2 != null) {
                    C53241h.m205898b("ThreadPush", "onPushThread, threadId is:" + thread.id);
                    Message message = b.get(a2.getId());
                    if (message != null) {
                        ChatChatter a3 = a.mo124892a(message.getChatId(), a2.getOwnerId());
                        if (a3 != null) {
                            ThreadInfo threadInfo = new ThreadInfo(a3, a2, message);
                            threadInfo.mo126013a(C57310e.m222078a(map2.get(message.getChatId())));
                            threadInfo.mo126014a(C57304a.m222054c(message, a));
                            com.bytedance.lark.pb.basic.v1.Message message2 = map.get(a2.getId());
                            if (message2 != null) {
                                threadInfo.setReactionInfoList(C57304a.m222048a(a, message.getChatId(), C57327p.m222182a(message2.reactions)));
                                threadInfo.setPin(C57304a.m222047a(message2.pin, message.getChatId(), a));
                                threadInfo.setTranslateInfo(C57336y.m222236a(message, decode));
                            }
                            if (CollectionUtils.isNotEmpty(a2.getLastReplyIds())) {
                                ArrayList arrayList = new ArrayList();
                                for (String str2 : a2.getLastReplyIds()) {
                                    Message message3 = b.get(str2);
                                    if (message3 == null) {
                                        C53241h.m205894a("ThreadPush", "message is empty");
                                    } else {
                                        ChatChatter a4 = a.mo124892a(message3.getChatId(), message3.getFromId());
                                        if (a4 == null) {
                                            C53241h.m205894a("ThreadPush", "message sender is empty");
                                        } else {
                                            MessageInfo messageInfo = new MessageInfo(message3, a4);
                                            messageInfo.setTranslateInfo(C57336y.m222236a(message3, decode));
                                            messageInfo.setOriginalSender(C57304a.m222054c(message3, a));
                                            arrayList.add(messageInfo);
                                        }
                                    }
                                }
                                threadInfo.mo126016a(arrayList);
                            }
                            List<MessageInfo> a5 = C32881i.m126558a(decode, a2, a, b);
                            if (!CollectionUtils.isEmpty(a5)) {
                                threadInfo.mo126019b(a5);
                            }
                            final JSONObject jSONObject = new JSONObject();
                            jSONObject.put("thread_info", (Object) threadInfo);
                            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                                /* class com.ss.android.lark.chat.service.impl.C34166ad.RunnableC341671 */

                                public void run() {
                                    for (AbstractC34171c cVar : C34166ad.this.f88422a) {
                                        cVar.mo126712a(jSONObject);
                                    }
                                }
                            });
                        }
                    }
                }
            }
        } catch (Exception e) {
            C53241h.m205895a("ThreadPush", e.getMessage(), e);
        }
    }
}
