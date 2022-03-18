package com.ss.android.lark.threaddetail.p2750b;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.im.v1.PushMessageReactions;
import com.bytedance.lark.pb.im.v1.PushMessageReadStates;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.AndroidThrottle;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.AbstractC29628t;
import com.ss.android.lark.biz.im.api.C29598aa;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.biz.im.api.preview.IPreviewCache;
import com.ss.android.lark.chat.api.service.impl.PreviewCache;
import com.ss.android.lark.chat.api.service.impl.PreviewPush;
import com.ss.android.lark.chat.chatwindow.chat.model.p1637c.C33404b;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.PreviewUpdater;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatAnnouncement;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chat.entity.translate.TranslateLanguageSetting;
import com.ss.android.lark.chat.service.AbstractC34127i;
import com.ss.android.lark.chat.service.impl.C34166ad;
import com.ss.android.lark.chat.service.impl.C34172ae;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.chat.utils.C34354t;
import com.ss.android.lark.chatwindow.p1723b.C35237c;
import com.ss.android.lark.dependency.IChatSettingDependency;
import com.ss.android.lark.dto.translate.C36874a;
import com.ss.android.lark.listener.IReadStateCallback;
import com.ss.android.lark.listener.PushChatRelationListener;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2392o.AbstractC48697c;
import com.ss.android.lark.p2993y.p2995b.p2996a.C59359a;
import com.ss.android.lark.statistics.chat.C54948d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.lark.threaddetail.b.e */
public class C55783e {

    /* renamed from: a */
    public final C55777a f137615a;

    /* renamed from: b */
    public final String f137616b;

    /* renamed from: c */
    public final AbstractC55793a f137617c;

    /* renamed from: d */
    private final Executor f137618d;

    /* renamed from: e */
    private final String f137619e;

    /* renamed from: f */
    private String f137620f;

    /* renamed from: g */
    private final IChatSettingDependency f137621g;

    /* renamed from: h */
    private final AndroidThrottle<AbstractC34006a> f137622h;

    /* renamed from: i */
    private final C34166ad.AbstractC34171c f137623i = new C34166ad.AbstractC34171c() {
        /* class com.ss.android.lark.threaddetail.p2750b.C55783e.C557841 */

        @Override // com.ss.android.lark.chat.service.impl.C34166ad.AbstractC34171c
        /* renamed from: a */
        public void mo126712a(JSONObject jSONObject) {
            C55783e.this.mo190308a(jSONObject);
        }
    };

    /* renamed from: j */
    private final AbstractC34127i f137624j = new AbstractC34127i() {
        /* class com.ss.android.lark.threaddetail.p2750b.C55783e.C557852 */

        @Override // com.ss.android.lark.chat.service.AbstractC34127i
        /* renamed from: a */
        public void mo126577a(TopicGroup topicGroup) {
            C55783e.this.mo190313a(topicGroup);
        }
    };

    /* renamed from: k */
    private final PushChatRelationListener f137625k = new PushChatRelationListener() {
        /* class com.ss.android.lark.threaddetail.p2750b.C55783e.C557863 */

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo169913a(ThreadTopic threadTopic) {
            C55783e.this.mo190309a(threadTopic);
        }

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo123091a(PushMessageReadStates pushMessageReadStates) {
            C34350p.m133214a(C55783e.this.f137616b, pushMessageReadStates, new IReadStateCallback() {
                /* class com.ss.android.lark.threaddetail.p2750b.C55783e.C557863.C557871 */

                @Override // com.ss.android.lark.listener.IReadStateCallback
                /* renamed from: a */
                public MessageInfo mo123095a(String str) {
                    return (MessageInfo) C55783e.this.f137615a.mo127099a(str);
                }

                @Override // com.ss.android.lark.listener.IReadStateCallback
                /* renamed from: a */
                public void mo123096a(MessageInfo messageInfo) {
                    C55783e.this.mo190312a(messageInfo, (ThreadTopic) null);
                }
            });
        }

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo123092a(C29598aa aaVar) {
            C55783e.this.mo190312a(aaVar.mo106644a(), aaVar.mo106646c());
        }

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo123093a(Chat chat) {
            C55783e.this.mo190310a(chat);
        }

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo123090a(PushMessageReactions pushMessageReactions) {
            if (C34350p.m133218a(C55783e.this.f137616b, pushMessageReactions.chat_id)) {
                for (Map.Entry<String, PushMessageReactions.Reactions> entry : pushMessageReactions.msg_id2reactions.entrySet()) {
                    MessageInfo messageInfo = (MessageInfo) C55783e.this.f137615a.mo127099a(entry.getKey());
                    if (messageInfo != null) {
                        MessageInfo messageInfo2 = new MessageInfo(messageInfo);
                        Log.m165389i("ThreadDetailPushHandler", "onPushReactionMessage success, msg id: " + entry.getKey());
                        messageInfo2.setReactionInfoList(C35237c.m137595a(pushMessageReactions.chat_id, entry.getValue(), pushMessageReactions.entity));
                        C55783e.this.mo190312a(messageInfo2, (ThreadTopic) null);
                    }
                }
            }
        }

        @Override // com.ss.android.lark.listener.PushChatRelationListener
        /* renamed from: a */
        public void mo123094a(Chat chat, Map<String, ? extends Chatter> map) {
            C55783e.this.mo190311a(chat, (Map<String, Chatter>) map);
        }
    };

    /* renamed from: l */
    private final AbstractC48697c f137626l = new AbstractC48697c() {
        /* class com.ss.android.lark.threaddetail.p2750b.C55783e.C557884 */

        @Override // com.ss.android.lark.p2392o.AbstractC48697c
        /* renamed from: a */
        public void mo123105a(ChatAnnouncement chatAnnouncement) {
            if (Objects.equals(C55783e.this.f137616b, chatAnnouncement.getChatId())) {
                C55783e.this.f137617c.mo190326d(chatAnnouncement.getContent());
            }
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48697c
        /* renamed from: b */
        public void mo123107b(String str, boolean z) {
            if (Objects.equals(C55783e.this.f137616b, str)) {
                C55783e.this.f137617c.mo190328e(z);
            }
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48697c
        /* renamed from: a */
        public void mo123106a(String str, boolean z) {
            if (Objects.equals(C55783e.this.f137616b, str)) {
                C55783e.this.f137617c.mo190327d(z);
            }
        }
    };

    /* renamed from: m */
    private final AbstractC29628t f137627m = new AbstractC29628t() {
        /* class com.ss.android.lark.threaddetail.p2750b.C55783e.C557895 */

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: a */
        public void mo106752a(int i) {
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: a */
        public void mo106753a(TranslateLanguageSetting translateLanguageSetting) {
            C55783e.this.mo190315a(translateLanguageSetting.getTargetLanguageKey(), null, null, null, null);
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: b */
        public void mo106757b(Map<String, Integer> map) {
            C55783e.this.mo190315a(null, null, null, null, map);
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: a */
        public void mo106754a(List<String> list) {
            C55783e.this.mo190315a(null, list, null, null, null);
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: b */
        public void mo106756b(TranslateLanguageSetting translateLanguageSetting) {
            C55783e.this.mo190315a(translateLanguageSetting.getTargetLanguageKey(), null, Integer.valueOf(translateLanguageSetting.getGlobalDisplayConfig()), translateLanguageSetting.getDisplayConfigMap(), null);
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29628t
        /* renamed from: a */
        public void mo106755a(Map<String, Integer> map) {
            C55783e.this.mo190315a(null, null, null, map, null);
        }
    };

    /* renamed from: n */
    private final C59359a.AbstractC59363c f137628n = new C59359a.AbstractC59363c() {
        /* class com.ss.android.lark.threaddetail.p2750b.C55783e.C557906 */

        @Override // com.ss.android.lark.p2993y.p2995b.p2996a.C59359a.AbstractC59363c
        /* renamed from: a */
        public void mo123115a(C36874a aVar) {
            C55783e.this.mo190314a(aVar);
        }
    };

    /* renamed from: o */
    private final IPreviewCache.PreviewCacheObserver f137629o = new IPreviewCache.PreviewCacheObserver() {
        /* class com.ss.android.lark.threaddetail.p2750b.C55783e.C557917 */

        @Override // com.ss.android.lark.biz.im.api.preview.IPreviewCache.PreviewCacheObserver
        public void onCacheChanged(final Map<String, ? extends ArrayList<String>> map) {
            PreviewCache.f84447c.mo121325a().mo121320a(map);
            CoreThreadPool.getBackgroundHandler().postDelayed(new Runnable() {
                /* class com.ss.android.lark.threaddetail.p2750b.C55783e.C557917.RunnableC557921 */

                public void run() {
                    Map<String, Map<String, UrlPreviewEntity>> a = PreviewCache.f84447c.mo121325a().mo121320a(map);
                    for (MessageInfo messageInfo : C55783e.this.f137615a.mo127118g()) {
                        if (a.containsKey(messageInfo.getId())) {
                            PreviewUpdater.m129594a(messageInfo.getMessage(), a.get(messageInfo.getId()));
                            messageInfo.setForceUpdate(true);
                            C55783e.this.f137615a.mo127119g(messageInfo);
                        }
                    }
                }
            }, 500);
        }
    };

    /* renamed from: com.ss.android.lark.threaddetail.b.e$a */
    public interface AbstractC55793a {
        /* renamed from: I */
        void mo190318I();

        /* renamed from: J */
        void mo190319J();

        /* renamed from: K */
        void mo190320K();

        /* renamed from: a */
        void mo190321a(Chat chat);

        /* renamed from: a */
        void mo190322a(Chat chat, Map<String, Chatter> map);

        /* renamed from: a */
        void mo190323a(TopicGroup topicGroup);

        /* renamed from: a */
        void mo190324a(C36874a aVar);

        /* renamed from: a */
        void mo190325a(String str, List<String> list, Integer num, Map<String, Integer> map, Map<String, Integer> map2);

        /* renamed from: d */
        void mo190326d(String str);

        /* renamed from: d */
        void mo190327d(boolean z);

        /* renamed from: e */
        void mo190328e(boolean z);
    }

    /* renamed from: a */
    public void mo190313a(TopicGroup topicGroup) {
        if (topicGroup != null && Objects.equals(topicGroup.getId(), this.f137620f)) {
            this.f137617c.mo190323a(topicGroup);
        }
    }

    /* renamed from: a */
    public void mo190314a(C36874a aVar) {
        if (aVar != null) {
            this.f137617c.mo190324a(aVar);
        }
    }

    /* renamed from: a */
    public void mo190315a(String str, List<String> list, Integer num, Map<String, Integer> map, Map<String, Integer> map2) {
        this.f137617c.mo190325a(str, list, num, map, map2);
    }

    /* renamed from: a */
    public void mo190307a() {
        C34166ad.m132655a().mo126706a(this.f137623i);
        if (C29990c.m110930b().mo134586n().mo134685a("group.role.obeserver")) {
            C34172ae.m132668a().mo126713a(this.f137624j);
        }
        C34354t.m133250a().mo126930a(String.valueOf(hashCode()), this.f137616b, this.f137625k);
        this.f137621g.mo134359a(this.f137626l);
        C59359a.m230421a().mo201713a(this.f137628n);
        C59359a.m230421a().mo201710a(this.f137627m);
        PreviewCache.f84447c.mo121325a().mo121322a(this.f137629o);
        PreviewPush.f84455b.mo121331a().mo121328a(this.f137629o);
    }

    /* renamed from: b */
    public void mo190316b() {
        C34354t.m133250a().mo126931b(String.valueOf(hashCode()), this.f137616b, this.f137625k);
        C34166ad.m132655a().mo126708b(this.f137623i);
        if (C29990c.m110930b().mo134586n().mo134685a("group.role.obeserver")) {
            C34172ae.m132668a().mo126714b(this.f137624j);
        }
        this.f137621g.mo134362b(this.f137626l);
        C59359a.m230421a().mo201717b(this.f137628n);
        C59359a.m230421a().mo201715b(this.f137627m);
        PreviewCache.f84447c.mo121325a().mo121324b(this.f137629o);
        PreviewPush.f84455b.mo121331a().mo121330b(this.f137629o);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m216306a(ThreadInfo threadInfo) {
        this.f137615a.mo190283b(threadInfo);
        mo190309a(threadInfo.mo126018b());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m216307b(ThreadTopic threadTopic) {
        Log.m165389i("ThreadDetailPushHandler", "offline thread push :" + threadTopic.toString());
        ThreadTopic n = this.f137615a.mo190288n();
        this.f137615a.mo190278a(threadTopic);
        this.f137622h.mo93303a(this.f137615a.mo190290p());
        this.f137617c.mo190319J();
        m216304a(n, threadTopic);
    }

    /* renamed from: a */
    public void mo190308a(JSONObject jSONObject) {
        try {
            ThreadInfo threadInfo = (ThreadInfo) jSONObject.get("thread_info");
            if (Objects.equals(this.f137619e, threadInfo.mo126018b().getId())) {
                Log.m165389i("ThreadDetailPushHandler", "onPushThreads:" + threadInfo);
                if (threadInfo.isNoTraceDelete()) {
                    this.f137617c.mo190318I();
                    Log.m165389i("ThreadDetailPushHandler", "get no trace delete push");
                    return;
                }
                this.f137618d.execute(new Runnable(threadInfo) {
                    /* class com.ss.android.lark.threaddetail.p2750b.$$Lambda$e$Bn6dSty5Mx0EitaVnwr9b4M6e_k */
                    public final /* synthetic */ ThreadInfo f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C55783e.lambda$Bn6dSty5Mx0EitaVnwr9b4M6e_k(C55783e.this, this.f$1);
                    }
                });
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo190309a(ThreadTopic threadTopic) {
        if (TextUtils.equals(this.f137619e, threadTopic.getId())) {
            this.f137618d.execute(new Runnable(threadTopic) {
                /* class com.ss.android.lark.threaddetail.p2750b.$$Lambda$e$_yhddfJJGDCBi5_n4w3UYHDmM4 */
                public final /* synthetic */ ThreadTopic f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C55783e.m270996lambda$_yhddfJJGDCBi5_n4w3UYHDmM4(C55783e.this, this.f$1);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo190310a(Chat chat) {
        if (Objects.equals(chat.getId(), this.f137616b)) {
            this.f137617c.mo190321a(chat);
        }
    }

    /* renamed from: a */
    public void mo190311a(Chat chat, Map<String, Chatter> map) {
        this.f137617c.mo190322a(chat, map);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m216305a(ThreadTopic threadTopic, MessageInfo messageInfo) {
        if (threadTopic != null) {
            mo190309a(threadTopic);
        }
        this.f137622h.mo93303a(messageInfo);
    }

    /* renamed from: a */
    private void m216304a(ThreadTopic threadTopic, ThreadTopic threadTopic2) {
        if (threadTopic != null && threadTopic2 != null && threadTopic.getReplyCount() != threadTopic2.getReplyCount()) {
            this.f137617c.mo190320K();
        }
    }

    /* renamed from: a */
    public void mo190312a(MessageInfo messageInfo, ThreadTopic threadTopic) {
        if (messageInfo != null && Objects.equals(messageInfo.getMessage().getThreadId(), this.f137619e)) {
            Log.m165389i("ThreadDetailPushHandler", "onPushMessage:" + messageInfo);
            if (!messageInfo.isPreMessage()) {
                C54948d.m213139b(messageInfo.getMessage());
            }
            if (Objects.equals(messageInfo.getMessage().getId(), this.f137619e)) {
                if (messageInfo.getMessage().isNoTraceDelete()) {
                    Log.m165389i("ThreadDetailPushHandler", "get no trace delete push");
                    this.f137617c.mo190318I();
                    return;
                }
                this.f137615a.mo190282b(messageInfo);
            }
            this.f137618d.execute(new Runnable(threadTopic, messageInfo) {
                /* class com.ss.android.lark.threaddetail.p2750b.$$Lambda$e$OjQKm9Th0fg_m0rjKUWwCi1XKIw */
                public final /* synthetic */ ThreadTopic f$1;
                public final /* synthetic */ MessageInfo f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C55783e.lambda$OjQKm9Th0fg_m0rjKUWwCi1XKIw(C55783e.this, this.f$1, this.f$2);
                }
            });
        }
    }

    public C55783e(AbstractC55793a aVar, String str, String str2, C55777a aVar2, Executor executor) {
        this.f137615a = aVar2;
        this.f137618d = executor;
        this.f137619e = str;
        this.f137616b = str2;
        this.f137617c = aVar;
        this.f137621g = C29990c.m110930b().mo134595w();
        AndroidThrottle.C26229a a = new AndroidThrottle.C26229a().mo93310a(CoreThreadPool.getNonblockingHandler()).mo93309a(100L).mo93311a(new C33404b());
        aVar2.getClass();
        this.f137622h = a.mo93312a(new AndroidThrottle.AbstractC26233e() {
            /* class com.ss.android.lark.threaddetail.p2750b.$$Lambda$i3BHHpzlzLKx8_HNKWPESvHV_8 */

            @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26233e
            public final void execute(Collection collection) {
                C55777a.this.mo127109b((Collection<AbstractC34006a>) collection);
            }
        }).mo93313a();
    }
}
