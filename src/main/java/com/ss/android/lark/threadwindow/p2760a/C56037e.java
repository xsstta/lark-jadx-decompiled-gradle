package com.ss.android.lark.threadwindow.p2760a;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.im.v1.PushMessageReactions;
import com.bytedance.lark.pb.im.v1.PushMessageReadStates;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.AbstractC29628t;
import com.ss.android.lark.biz.im.api.C29598aa;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.biz.im.api.preview.IPreviewCache;
import com.ss.android.lark.chat.api.service.impl.PreviewCache;
import com.ss.android.lark.chat.api.service.impl.PreviewPush;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.PreviewUpdater;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatAnnouncement;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.p1667g.AbstractC33992b;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.entity.response.PushMyThreadReplyPromptResponse;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chat.entity.translate.TranslateLanguageSetting;
import com.ss.android.lark.chat.service.AbstractC34127i;
import com.ss.android.lark.chat.service.impl.C34166ad;
import com.ss.android.lark.chat.service.impl.C34172ae;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.chat.utils.C34354t;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.chatwindow.p1723b.C35237c;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36504r;
import com.ss.android.lark.dependency.IChatSettingDependency;
import com.ss.android.lark.dto.translate.C36874a;
import com.ss.android.lark.listener.OnBadgeChangeListener;
import com.ss.android.lark.listener.PushChatRelationListener;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2392o.AbstractC48697c;
import com.ss.android.lark.p2993y.p2995b.p2996a.C59359a;
import com.ss.android.lark.statistics.chat.C54948d;
import com.ss.android.lark.threadwindow.model.patch.ReactionItemPatch2;
import com.ss.android.lark.threadwindow.model.patch.ReadStatePatch2;
import com.ss.android.lark.threadwindow.p2760a.p2761a.C56015h;
import com.ss.android.lark.threadwindow.p2760a.p2764d.C56033b;
import com.ss.android.lark.threadwindow.p2760a.p2764d.C56036g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.lark.threadwindow.a.e */
public class C56037e {

    /* renamed from: a */
    Executor f138559a;

    /* renamed from: b */
    C56015h f138560b;

    /* renamed from: c */
    Map<Integer, AbstractC34417b<ThreadInfo, C33952a<ThreadInfo>>> f138561c;

    /* renamed from: d */
    IChatSettingDependency f138562d;

    /* renamed from: e */
    public final String f138563e;

    /* renamed from: f */
    public final boolean f138564f;

    /* renamed from: g */
    public final AbstractC56048a f138565g;

    /* renamed from: h */
    private final String f138566h;

    /* renamed from: i */
    private final C34166ad.AbstractC34171c f138567i = new C34166ad.AbstractC34171c() {
        /* class com.ss.android.lark.threadwindow.p2760a.C56037e.C560381 */

        @Override // com.ss.android.lark.chat.service.impl.C34166ad.AbstractC34171c
        /* renamed from: a */
        public void mo126712a(JSONObject jSONObject) {
            C56037e.this.mo191080a(jSONObject);
        }
    };

    /* renamed from: j */
    private final C34166ad.AbstractC34170b f138568j = new C34166ad.AbstractC34170b() {
        /* class com.ss.android.lark.threadwindow.p2760a.C56037e.C560413 */

        @Override // com.ss.android.lark.chat.service.impl.C34166ad.AbstractC34170b
        /* renamed from: a */
        public void mo126711a(PushMyThreadReplyPromptResponse pushMyThreadReplyPromptResponse) {
            C56037e.this.mo191084a(pushMyThreadReplyPromptResponse);
        }
    };

    /* renamed from: k */
    private final AbstractC34127i f138569k = new AbstractC34127i() {
        /* class com.ss.android.lark.threadwindow.p2760a.C56037e.C560424 */

        @Override // com.ss.android.lark.chat.service.AbstractC34127i
        /* renamed from: a */
        public void mo126577a(TopicGroup topicGroup) {
            C56037e.this.mo191086a(topicGroup);
        }
    };

    /* renamed from: l */
    private final OnBadgeChangeListener f138570l = new OnBadgeChangeListener() {
        /* class com.ss.android.lark.threadwindow.p2760a.C56037e.C560435 */

        @Override // com.ss.android.lark.listener.OnBadgeChangeListener
        /* renamed from: a */
        public void mo123062a(int i) {
            C56037e.this.f138565g.mo191103f(i);
        }
    };

    /* renamed from: m */
    private final AbstractC48697c f138571m = new AbstractC48697c() {
        /* class com.ss.android.lark.threadwindow.p2760a.C56037e.C560446 */

        @Override // com.ss.android.lark.p2392o.AbstractC48697c
        /* renamed from: a */
        public void mo123105a(ChatAnnouncement chatAnnouncement) {
            if (Objects.equals(C56037e.this.f138563e, chatAnnouncement.getChatId())) {
                C56037e.this.f138565g.mo191099c(chatAnnouncement.getContent());
            }
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48697c
        /* renamed from: b */
        public void mo123107b(String str, boolean z) {
            if (Objects.equals(C56037e.this.f138563e, str)) {
                C56037e.this.f138565g.mo191102d(z);
            }
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48697c
        /* renamed from: a */
        public void mo123106a(String str, boolean z) {
            if (Objects.equals(C56037e.this.f138563e, str)) {
                C56037e.this.f138565g.mo191101c(z);
            }
        }
    };

    /* renamed from: n */
    private final AbstractC33992b f138572n = new AbstractC33992b() {
        /* class com.ss.android.lark.threadwindow.p2760a.C56037e.C560457 */

        @Override // com.ss.android.lark.chat.entity.p1667g.AbstractC33992b
        /* renamed from: a */
        public void mo123079a(String str, int i) {
            C56037e.this.mo191088a(str, i);
        }
    };

    /* renamed from: o */
    private final PushChatRelationListener f138573o = new PushChatRelationListener() {
        /* class com.ss.android.lark.threadwindow.p2760a.C56037e.C560468 */

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo123093a(Chat chat) {
            C56037e.this.mo191081a(chat);
        }

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo123092a(C29598aa aaVar) {
            C56037e.this.mo191083a(aaVar.mo106644a(), aaVar.mo106645b(), aaVar.mo106646c(), aaVar.mo106647d(), aaVar.mo106648e());
        }

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo123090a(PushMessageReactions pushMessageReactions) {
            if (C34350p.m133218a(C56037e.this.f138563e, pushMessageReactions.chat_id)) {
                for (Map.Entry<String, PushMessageReactions.Reactions> entry : pushMessageReactions.msg_id2reactions.entrySet()) {
                    Log.m165389i("ThreadWindow", "onPushReactionMessage success, msg id: " + entry.getKey());
                    List<ReactionInfo> a = C35237c.m137595a(pushMessageReactions.chat_id, entry.getValue(), pushMessageReactions.entity);
                    C56037e.this.f138560b.mo127105a(entry.getKey(), new ReactionItemPatch2(a));
                    if (C56037e.this.f138564f) {
                        for (AbstractC34417b<ThreadInfo, C33952a<ThreadInfo>> bVar : C56037e.this.f138561c.values()) {
                            bVar.mo127105a(entry.getKey(), new ReactionItemPatch2(a));
                        }
                    }
                }
            }
        }

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo123091a(PushMessageReadStates pushMessageReadStates) {
            if (C34350p.m133218a(C56037e.this.f138563e, pushMessageReadStates.chat_id)) {
                Map<String, PushMessageReadStates.ReadStates> map = pushMessageReadStates.read_states;
                Map<String, PushMessageReadStates.ReadStatesExtra> map2 = pushMessageReadStates.read_states_extra;
                HashSet hashSet = new HashSet();
                if (CollectionUtils.isNotEmpty(map)) {
                    hashSet.addAll(map.keySet());
                }
                if (CollectionUtils.isNotEmpty(map2)) {
                    hashSet.addAll(map2.keySet());
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    ReadStatePatch2 eVar = new ReadStatePatch2();
                    if (!(map == null || map.get(str) == null)) {
                        eVar.mo191075a(map.get(str));
                        Log.m165389i("ThreadWindow", "onPushReadStateMessage: readStates " + str);
                    }
                    if (!(map2 == null || map2.get(str) == null)) {
                        eVar.mo191076a(map2.get(str));
                        Log.m165389i("ThreadWindow", "onPushReadStateMessage: meRead " + str);
                    }
                    C56037e.this.f138560b.mo127105a(str, eVar);
                    if (C56037e.this.f138564f) {
                        for (AbstractC34417b<ThreadInfo, C33952a<ThreadInfo>> bVar : C56037e.this.f138561c.values()) {
                            bVar.mo127105a(str, eVar);
                        }
                    }
                }
            }
        }

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo123094a(Chat chat, Map<String, ? extends Chatter> map) {
            C56037e.this.mo191082a(chat, (Map<String, Chatter>) map);
        }
    };

    /* renamed from: p */
    private final AbstractC29628t f138574p = new AbstractC29628t() {
        /* class com.ss.android.lark.threadwindow.p2760a.C56037e.C560479 */

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: a */
        public void mo106752a(int i) {
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: a */
        public void mo106753a(TranslateLanguageSetting translateLanguageSetting) {
            C56037e.this.mo191089a(translateLanguageSetting.getTargetLanguageKey(), (List<String>) null, (Integer) null, (Map<String, Integer>) null, (Map<String, Integer>) null);
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: b */
        public void mo106757b(Map<String, Integer> map) {
            C56037e.this.mo191089a((String) null, (List<String>) null, (Integer) null, (Map<String, Integer>) null, map);
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: a */
        public void mo106754a(List<String> list) {
            C56037e.this.mo191089a((String) null, list, (Integer) null, (Map<String, Integer>) null, (Map<String, Integer>) null);
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: b */
        public void mo106756b(TranslateLanguageSetting translateLanguageSetting) {
            C56037e.this.mo191089a((String) null, (List<String>) null, Integer.valueOf(translateLanguageSetting.getGlobalDisplayConfig()), translateLanguageSetting.getDisplayConfigMap(), (Map<String, Integer>) null);
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: a */
        public void mo106755a(Map<String, Integer> map) {
            C56037e.this.mo191089a((String) null, (List<String>) null, (Integer) null, map, (Map<String, Integer>) null);
        }
    };

    /* renamed from: q */
    private final IPreviewCache.PreviewCacheObserver f138575q = new IPreviewCache.PreviewCacheObserver() {
        /* class com.ss.android.lark.threadwindow.p2760a.C56037e.AnonymousClass10 */

        @Override // com.ss.android.lark.biz.im.api.preview.IPreviewCache.PreviewCacheObserver
        public void onCacheChanged(final Map<String, ? extends ArrayList<String>> map) {
            CoreThreadPool.getBackgroundHandler().postDelayed(new Runnable() {
                /* class com.ss.android.lark.threadwindow.p2760a.C56037e.AnonymousClass10.RunnableC560391 */

                public void run() {
                    Map<String, Map<String, UrlPreviewEntity>> a = PreviewCache.f84447c.mo121325a().mo121320a(map);
                    for (ThreadInfo threadInfo : C56037e.this.f138560b.mo127118g()) {
                        C56037e.this.mo191085a(threadInfo, a);
                    }
                    if (C56037e.this.f138564f) {
                        for (AbstractC34417b<ThreadInfo, C33952a<ThreadInfo>> bVar : C56037e.this.f138561c.values()) {
                            for (ThreadInfo threadInfo2 : bVar.mo127118g()) {
                                C56037e.this.mo191085a(threadInfo2, a);
                            }
                        }
                    }
                }
            }, 500);
        }
    };

    /* renamed from: r */
    private final C59359a.AbstractC59363c f138576r = new C59359a.AbstractC59363c() {
        /* class com.ss.android.lark.threadwindow.p2760a.C56037e.C560402 */

        @Override // com.ss.android.lark.p2993y.p2995b.p2996a.C59359a.AbstractC59363c
        /* renamed from: a */
        public void mo123115a(C36874a aVar) {
            C56037e.this.mo191087a(aVar);
        }
    };

    /* renamed from: com.ss.android.lark.threadwindow.a.e$a */
    public interface AbstractC56048a {
        /* renamed from: a */
        void mo191092a(Chat chat);

        /* renamed from: a */
        void mo191093a(Chat chat, Map<String, Chatter> map);

        /* renamed from: a */
        void mo191094a(MessageInfo messageInfo);

        /* renamed from: a */
        void mo191095a(PushMyThreadReplyPromptResponse pushMyThreadReplyPromptResponse);

        /* renamed from: a */
        void mo191096a(TopicGroup topicGroup);

        /* renamed from: a */
        void mo191097a(C36874a aVar);

        /* renamed from: a */
        void mo191098a(String str, List<String> list, Integer num, Map<String, Integer> map, Map<String, Integer> map2);

        /* renamed from: c */
        void mo191099c(String str);

        /* renamed from: c */
        void mo191100c(String str, int i);

        /* renamed from: c */
        void mo191101c(boolean z);

        /* renamed from: d */
        void mo191102d(boolean z);

        /* renamed from: f */
        void mo191103f(int i);
    }

    /* renamed from: a */
    public void mo191085a(ThreadInfo threadInfo, Map<String, Map<String, UrlPreviewEntity>> map) {
        boolean z;
        if (map.containsKey(threadInfo.getId())) {
            PreviewUpdater.m129594a(threadInfo.getMessage(), map.get(threadInfo.getId()));
            z = true;
        } else {
            z = false;
        }
        List<MessageInfo> e = threadInfo.mo126023e();
        if (e != null) {
            for (MessageInfo messageInfo : e) {
                if (map.containsKey(messageInfo.getId())) {
                    PreviewUpdater.m129594a(messageInfo.getMessage(), map.get(messageInfo.getId()));
                    z = true;
                }
            }
        }
        if (z) {
            this.f138560b.mo127102a(new C56007a(threadInfo.mo126021c()), new AbstractC34432b.C34433a(threadInfo));
        }
    }

    /* renamed from: a */
    public void mo191086a(TopicGroup topicGroup) {
        if (topicGroup != null && Objects.equals(topicGroup.getId(), this.f138566h)) {
            this.f138565g.mo191096a(topicGroup);
        }
    }

    /* renamed from: a */
    public void mo191084a(PushMyThreadReplyPromptResponse pushMyThreadReplyPromptResponse) {
        if (this.f138566h.equals(pushMyThreadReplyPromptResponse.groupId)) {
            this.f138560b.mo122938a(pushMyThreadReplyPromptResponse.lastAtMessages);
            this.f138560b.mo191038c(pushMyThreadReplyPromptResponse.newReplyCount);
            this.f138560b.mo191040d(pushMyThreadReplyPromptResponse.newAtReplyCount);
            this.f138565g.mo191095a(pushMyThreadReplyPromptResponse);
        }
    }

    /* renamed from: a */
    public void mo191088a(String str, int i) {
        this.f138565g.mo191100c(str, i);
    }

    /* renamed from: a */
    public void mo191089a(String str, List<String> list, Integer num, Map<String, Integer> map, Map<String, Integer> map2) {
        this.f138565g.mo191098a(str, list, num, map, map2);
    }

    /* renamed from: b */
    public void mo191090b() {
        AbstractC36504r K = C29990c.m110930b().mo134512K();
        AbstractC36474h.AbstractC36479e B = C29990c.m110930b().mo134503B();
        C34166ad.m132655a().mo126708b(this.f138567i);
        C34166ad.m132655a().mo126707b(this.f138568j);
        K.mo134693b(this.f138570l);
        if (C29990c.m110930b().mo134586n().mo134685a("group.role.obeserver")) {
            C34172ae.m132668a().mo126714b(this.f138569k);
        }
        this.f138562d.mo134362b(this.f138571m);
        B.mo134615b(this.f138572n);
        C34354t.m133250a().mo126931b(String.valueOf(hashCode()), this.f138563e, this.f138573o);
        C59359a.m230421a().mo201717b(this.f138576r);
        C59359a.m230421a().mo201715b(this.f138574p);
        PreviewCache.f84447c.mo121325a().mo121324b(this.f138575q);
        PreviewPush.f84455b.mo121331a().mo121330b(this.f138575q);
    }

    /* renamed from: a */
    public void mo191079a() {
        AbstractC36504r K = C29990c.m110930b().mo134512K();
        AbstractC36474h.AbstractC36479e B = C29990c.m110930b().mo134503B();
        C34166ad.m132655a().mo126706a(this.f138567i);
        C34166ad.m132655a().mo126705a(this.f138568j);
        if (C29990c.m110930b().mo134586n().mo134685a("group.role.obeserver")) {
            C34172ae.m132668a().mo126713a(this.f138569k);
        }
        K.mo134690a(this.f138570l);
        this.f138562d.mo134359a(this.f138571m);
        B.mo134612a(this.f138572n);
        C34354t.m133250a().mo126930a(String.valueOf(hashCode()), this.f138563e, this.f138573o);
        C59359a.m230421a().mo201713a(this.f138576r);
        C59359a.m230421a().mo201710a(this.f138574p);
        PreviewCache.f84447c.mo121325a().mo121322a(this.f138575q);
        PreviewPush.f84455b.mo121331a().mo121328a(this.f138575q);
    }

    /* renamed from: a */
    public void mo191087a(C36874a aVar) {
        if (aVar != null) {
            this.f138565g.mo191097a(aVar);
        }
    }

    /* renamed from: a */
    public void mo191080a(JSONObject jSONObject) {
        ThreadInfo threadInfo = (ThreadInfo) jSONObject.get("thread_info");
        if (threadInfo != null && Objects.equals(this.f138563e, threadInfo.mo126018b().getChannel().getId())) {
            Log.m165389i("ThreadWindow", "onPushThreads:" + threadInfo);
            this.f138560b.mo127102a(new C56007a(threadInfo.mo126021c()), new AbstractC34432b.C34433a(threadInfo));
            if (this.f138564f) {
                for (AbstractC34417b<ThreadInfo, C33952a<ThreadInfo>> bVar : this.f138561c.values()) {
                    bVar.mo127102a(new C56007a(threadInfo.mo126021c()), new AbstractC34432b.C34433a(threadInfo));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo191081a(Chat chat) {
        if (Objects.equals(chat.getId(), this.f138563e)) {
            this.f138565g.mo191092a(chat);
        }
    }

    /* renamed from: a */
    public void mo191082a(Chat chat, Map<String, Chatter> map) {
        this.f138565g.mo191093a(chat, map);
    }

    /* renamed from: a */
    private boolean m218005a(String str, MessageInfo messageInfo) {
        if (messageInfo == null) {
            return false;
        }
        return Objects.equals(messageInfo.getMessage().getChatId(), str);
    }

    /* renamed from: a */
    private void m218004a(ThreadTopic threadTopic, List<MessageInfo> list, List<MessageInfo> list2) {
        this.f138560b.mo127105a(threadTopic.getId(), new C56036g(threadTopic, list, list2));
        if (this.f138564f) {
            for (AbstractC34417b<ThreadInfo, C33952a<ThreadInfo>> bVar : this.f138561c.values()) {
                bVar.mo127105a(threadTopic.getId(), new C56036g(threadTopic, list, list2));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m218003a(ThreadTopic threadTopic, MessageInfo messageInfo, List list, List list2, Chat chat) {
        if (threadTopic == null) {
            this.f138560b.mo127105a(messageInfo.getMessage().getId(), new C56033b(messageInfo));
            if (this.f138564f) {
                for (AbstractC34417b<ThreadInfo, C33952a<ThreadInfo>> bVar : this.f138561c.values()) {
                    bVar.mo127105a(messageInfo.getMessage().getId(), new C56033b(messageInfo));
                }
            }
        } else if (Objects.equals(threadTopic.getId(), messageInfo.getMessage().getId())) {
            ThreadInfo threadInfo = new ThreadInfo(messageInfo.getMessageSender(), threadTopic, messageInfo.getMessage());
            threadInfo.setReactionInfoList(messageInfo.getReactionInfoList());
            threadInfo.setPin(messageInfo.getPin());
            threadInfo.setTranslateInfo(messageInfo.getTranslateInfo());
            threadInfo.mo126016a(list);
            threadInfo.mo126019b(list2);
            threadInfo.mo126013a(chat);
            this.f138560b.mo127102a(new C56007a(threadInfo.mo126021c(), true), new AbstractC34432b.C34433a(threadInfo));
            this.f138565g.mo191094a(messageInfo);
            if (this.f138564f) {
                for (AbstractC34417b<ThreadInfo, C33952a<ThreadInfo>> bVar2 : this.f138561c.values()) {
                    bVar2.mo127102a(new C56007a(threadInfo.mo126021c()), new AbstractC34432b.C34433a(threadInfo));
                }
            }
        } else {
            m218004a(threadTopic, list, list2);
        }
    }

    /* renamed from: a */
    public void mo191083a(MessageInfo messageInfo, Chat chat, ThreadTopic threadTopic, List<MessageInfo> list, List<MessageInfo> list2) {
        if (chat != null && Objects.equals(chat.getId(), this.f138563e)) {
            this.f138565g.mo191092a(chat);
        }
        if (m218005a(this.f138563e, messageInfo)) {
            if (!messageInfo.isPreMessage()) {
                C54948d.m213139b(messageInfo.getMessage());
            }
            Log.m165389i("ThreadWindow", "onPushMessage:" + messageInfo);
            this.f138559a.execute(new Runnable(threadTopic, messageInfo, list, list2, chat) {
                /* class com.ss.android.lark.threadwindow.p2760a.$$Lambda$e$gbIjp26EIoFsrhOir1bcrDOJekI */
                public final /* synthetic */ ThreadTopic f$1;
                public final /* synthetic */ MessageInfo f$2;
                public final /* synthetic */ List f$3;
                public final /* synthetic */ List f$4;
                public final /* synthetic */ Chat f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    C56037e.lambda$gbIjp26EIoFsrhOir1bcrDOJekI(C56037e.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                }
            });
        }
    }

    public C56037e(String str, String str2, C56015h hVar, Executor executor, Map<Integer, AbstractC34417b<ThreadInfo, C33952a<ThreadInfo>>> map, AbstractC56048a aVar, boolean z) {
        this.f138560b = hVar;
        this.f138559a = executor;
        this.f138565g = aVar;
        this.f138561c = map;
        this.f138562d = C29990c.m110930b().mo134595w();
        this.f138563e = str;
        this.f138566h = str2;
        this.f138564f = z;
    }
}
