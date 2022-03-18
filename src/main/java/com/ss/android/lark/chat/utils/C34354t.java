package com.ss.android.lark.chat.utils;

import com.bytedance.lark.pb.im.v1.PushMessageReactions;
import com.bytedance.lark.pb.im.v1.PushMessageReadStates;
import com.ss.android.lark.biz.im.api.C29598aa;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.service.AbstractC34119b;
import com.ss.android.lark.chat.service.impl.C34203e;
import com.ss.android.lark.listener.DefaultChatRelationPushListener;
import com.ss.android.lark.listener.PushChatRelationListener;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.utils.t */
public class C34354t {

    /* renamed from: a */
    AbstractC34119b f88699a;

    /* renamed from: com.ss.android.lark.chat.utils.t$a */
    private static class C34356a {

        /* renamed from: a */
        public static final C34354t f88702a = new C34354t();
    }

    /* renamed from: a */
    public static final C34354t m133250a() {
        return C34356a.f88702a;
    }

    private C34354t() {
        this.f88699a = C34203e.m132761a();
    }

    /* renamed from: b */
    public void mo126931b(String str, String str2, PushChatRelationListener sVar) {
        this.f88699a.mo126544a(str, str2);
    }

    /* renamed from: a */
    public void mo126930a(String str, String str2, final PushChatRelationListener sVar) {
        this.f88699a.mo126545a(str, str2, new DefaultChatRelationPushListener() {
            /* class com.ss.android.lark.chat.utils.C34354t.C343551 */

            @Override // com.ss.android.lark.chat.service.IPushChatRelationListener, com.ss.android.lark.listener.DefaultChatRelationPushListener
            /* renamed from: a */
            public void mo126570a(PushMessageReactions pushMessageReactions) {
                PushChatRelationListener sVar = sVar;
                if (sVar != null) {
                    sVar.mo123090a(pushMessageReactions);
                }
            }

            @Override // com.ss.android.lark.chat.service.IPushChatRelationListener, com.ss.android.lark.listener.DefaultChatRelationPushListener
            /* renamed from: a */
            public void mo126571a(PushMessageReadStates pushMessageReadStates) {
                PushChatRelationListener sVar = sVar;
                if (sVar != null) {
                    sVar.mo123091a(pushMessageReadStates);
                }
            }

            @Override // com.ss.android.lark.chat.service.IPushChatRelationListener, com.ss.android.lark.listener.DefaultChatRelationPushListener
            /* renamed from: a */
            public void mo126572a(ThreadTopic threadTopic) {
                PushChatRelationListener sVar = sVar;
                if (sVar != null) {
                    sVar.mo169913a(threadTopic);
                }
            }

            @Override // com.ss.android.lark.chat.service.IPushChatRelationListener, com.ss.android.lark.listener.DefaultChatRelationPushListener
            /* renamed from: a */
            public void mo126573a(C29598aa aaVar) {
                PushChatRelationListener sVar = sVar;
                if (sVar != null) {
                    sVar.mo123092a(aaVar);
                }
            }

            @Override // com.ss.android.lark.chat.service.IPushChatRelationListener, com.ss.android.lark.listener.DefaultChatRelationPushListener
            /* renamed from: a */
            public void mo126574a(Chat chat) {
                PushChatRelationListener sVar = sVar;
                if (sVar != null) {
                    sVar.mo123093a(chat);
                }
            }

            @Override // com.ss.android.lark.chat.service.IPushChatRelationListener, com.ss.android.lark.listener.DefaultChatRelationPushListener
            /* renamed from: b */
            public void mo126576b(Chat chat, Map<String, ? extends Chatter> map) {
                PushChatRelationListener sVar = sVar;
                if (sVar != null) {
                    sVar.mo169914b(chat, map);
                }
            }

            @Override // com.ss.android.lark.chat.service.IPushChatRelationListener, com.ss.android.lark.listener.DefaultChatRelationPushListener
            /* renamed from: a */
            public void mo126575a(Chat chat, Map<String, ? extends Chatter> map) {
                PushChatRelationListener sVar = sVar;
                if (sVar != null) {
                    sVar.mo123094a(chat, map);
                }
            }
        });
    }
}
