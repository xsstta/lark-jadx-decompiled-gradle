package com.ss.android.lark.threaddetail;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lark.pb.im.v1.ToggleTextOnAudioResponse;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.C26134a;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26308n;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.C29596a;
import com.ss.android.lark.biz.im.api.C29601ad;
import com.ss.android.lark.biz.im.api.C29613e;
import com.ss.android.lark.biz.im.api.C29631w;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ThreadStateInfo;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.biz.im.api.p1409b.C29609a;
import com.ss.android.lark.chat.api.service.AbstractC32906j;
import com.ss.android.lark.chat.api.service.IChatService;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.api.service.p1600b.C32881i;
import com.ss.android.lark.chat.base.model.C32915a;
import com.ss.android.lark.chat.chatwindow.chat.data.reply.ChatReplyDigestCreator;
import com.ss.android.lark.chat.chatwindow.chat.data.reply.IReplyService;
import com.ss.android.lark.chat.chatwindow.chat.data.reply.ReplyService;
import com.ss.android.lark.chat.chatwindow.chat.model.C33410f;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33386b;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33394c;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33395d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.C33958d;
import com.ss.android.lark.chat.core.model.C33963h;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.core.model.PageLoader;
import com.ss.android.lark.chat.core.model.entity.C33960a;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.chat.entity.message.p1669a.C34007a;
import com.ss.android.lark.chat.entity.message.p1669a.C34009b;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chat.service.AbstractC34124e;
import com.ss.android.lark.chat.service.AbstractC34297l;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.chat.service.impl.AbstractC34230k;
import com.ss.android.lark.chat.service.impl.C34146aa;
import com.ss.android.lark.chat.service.impl.C34218i;
import com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.chat.service.p1678a.p1679a.C34118b;
import com.ss.android.lark.chat.utils.C34332b;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.chatwindow.C35249h;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35218a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d;
import com.ss.android.lark.chatwindow.p1723b.C35234b;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36498n;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.draft.Draft;
import com.ss.android.lark.dto.translate.C36874a;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41039c;
import com.ss.android.lark.keyboard.utils.KBRichTextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2392o.AbstractC48707q;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.statistics.chat.C54948d;
import com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPoint;
import com.ss.android.lark.threaddetail.AbstractC55766a;
import com.ss.android.lark.threaddetail.C55796d;
import com.ss.android.lark.threaddetail.p2750b.C55777a;
import com.ss.android.lark.threaddetail.p2750b.C55779b;
import com.ss.android.lark.threaddetail.p2750b.C55781c;
import com.ss.android.lark.threaddetail.p2750b.C55782d;
import com.ss.android.lark.threaddetail.p2750b.C55783e;
import com.ss.android.lark.threaddetail.p2750b.C55794f;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.ss.android.lark.threaddetail.d */
public class C55796d extends BaseModel implements AbstractC48707q, AbstractC55766a.AbstractC55767a, C55783e.AbstractC55793a {

    /* renamed from: A */
    private int f137658A;

    /* renamed from: B */
    private boolean f137659B;

    /* renamed from: C */
    private Boolean f137660C;

    /* renamed from: D */
    private final C33103ae f137661D;

    /* renamed from: E */
    private C26134a<List<MessageInfo>> f137662E;

    /* renamed from: F */
    private final Context f137663F;

    /* renamed from: G */
    private boolean f137664G;

    /* renamed from: H */
    private TopicGroup f137665H;

    /* renamed from: I */
    private int f137666I = -1;

    /* renamed from: J */
    private ChatChatter f137667J;

    /* renamed from: K */
    private int f137668K = 0;

    /* renamed from: L */
    private final boolean f137669L = C29990c.m110930b().mo134586n().mo134685a("feature.lark.thread.new.reader");

    /* renamed from: M */
    private final MonitorMessageSendCallback f137670M = new MonitorMessageSendCallback() {
        /* class com.ss.android.lark.threaddetail.C55796d.C557971 */

        @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
        /* renamed from: a */
        public void mo121288a(C34118b bVar) {
            super.mo121288a(bVar);
        }

        @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
        /* renamed from: a */
        public void mo123034a(MessageInfo messageInfo) {
            super.mo123034a(messageInfo);
            Log.m165389i("ThreadDetailModel", "onPreSend, message cid is:" + messageInfo.getMessage().getcId());
            C54948d.m213136a(messageInfo.getMessage());
            C55796d.this.f137679b.mo127119g(messageInfo);
            Log.m165379d("ThreadDetailModel", "onPreSend:preMessageInfo.sendstatus:" + messageInfo.getMessage().getSendStatus().toString());
        }

        @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
        /* renamed from: a */
        public void mo121287a(ErrorResult errorResult, Message message) {
            super.mo121287a(errorResult, message);
            Log.m165389i("ThreadDetailModel", "Failed to send msg， message id is：" + message.getcId() + "， err：" + errorResult);
            message.setSendStatus(SendStatus.FAIL);
            C55796d.this.f137679b.mo127102a(new C33410f(message), new C33394c(message));
            if (C55796d.this.f137683f != null && TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                if (errorResult.getErrorCode() == 5055) {
                    C55796d.this.f137683f.mo190133a(UIHelper.getString(R.string.Lark_Groups_CantAnonymousLimitReachedTip));
                } else if (errorResult.getErrorCode() == 5054) {
                    C55796d.this.f137683f.mo190133a(UIHelper.getString(R.string.Lark_Groups_AnonymousPostFailedOwnerNotAllow));
                }
            }
        }
    };

    /* renamed from: N */
    private boolean f137671N;

    /* renamed from: O */
    private AbstractC34297l f137672O;

    /* renamed from: P */
    private boolean f137673P;

    /* renamed from: Q */
    private boolean f137674Q = false;

    /* renamed from: R */
    private boolean f137675R;

    /* renamed from: S */
    private AbstractC36474h.C36492r f137676S;

    /* renamed from: T */
    private final AbstractC34417b.AbstractC34423e<MessageInfo> f137677T = new AbstractC34417b.AbstractC34423e<MessageInfo>() {
        /* class com.ss.android.lark.threaddetail.C55796d.C558078 */

        @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34423e
        /* renamed from: a */
        public void mo123490a() {
        }

        @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34423e
        /* renamed from: a */
        public void mo123491a(List<MessageInfo> list) {
            C55796d.this.f137683f.mo190135a(list);
        }
    };

    /* renamed from: a */
    public C33958d f137678a;

    /* renamed from: b */
    public C55777a f137679b;

    /* renamed from: c */
    public IInnerMessageService f137680c;

    /* renamed from: d */
    public IStickerDependency f137681d;

    /* renamed from: e */
    public AbstractC34124e f137682e;

    /* renamed from: f */
    public final AbstractC55766a.AbstractC55767a.AbstractC55768a f137683f;

    /* renamed from: g */
    public final AbstractC36474h f137684g;

    /* renamed from: h */
    AbstractC36450aa f137685h;

    /* renamed from: i */
    public String f137686i;

    /* renamed from: j */
    public Chat f137687j;

    /* renamed from: k */
    public String f137688k;

    /* renamed from: l */
    private C33958d f137689l;

    /* renamed from: m */
    private C55782d f137690m;

    /* renamed from: n */
    private C55779b f137691n;

    /* renamed from: o */
    private C55783e f137692o;

    /* renamed from: p */
    private AbstractC32906j f137693p;

    /* renamed from: q */
    private AbstractC34230k f137694q;

    /* renamed from: r */
    private IChatService f137695r;

    /* renamed from: s */
    private final AbstractC36498n f137696s;

    /* renamed from: t */
    private final AbstractC36503q f137697t;

    /* renamed from: u */
    private final AbstractC36502p f137698u = C29990c.m110930b().af();

    /* renamed from: v */
    private final boolean f137699v = C29990c.m110930b().mo134586n().mo134685a("messenger.message_inputbox_redesign");

    /* renamed from: w */
    private IReplyService f137700w;

    /* renamed from: x */
    private boolean f137701x;

    /* renamed from: y */
    private boolean f137702y;

    /* renamed from: z */
    private boolean f137703z;

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: C */
    public TopicGroup mo190048C() {
        return this.f137665H;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: g */
    public Chat mo190109g() {
        return this.f137687j;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: i */
    public ChatChatter mo190111i() {
        return this.f137667J;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: k */
    public String mo190113k() {
        return this.f137688k;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: m */
    public boolean mo190115m() {
        return this.f137702y;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: n */
    public boolean mo190116n() {
        return this.f137671N;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: p */
    public int mo190118p() {
        return this.f137658A;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: t */
    public String mo190122t() {
        return this.f137686i;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: v */
    public boolean mo190124v() {
        return this.f137673P;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190059a(IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback, int i) {
        Log.m165389i("ThreadDetailModel", "pageSize = " + i);
        IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback2 = (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback);
        if (this.f137671N) {
            m216360a(0, MessageFetchScene.SPECIFIED_POSITION, i, iGetDataCallback2);
        } else if (this.f137658A != -100) {
            m216360a(Math.max(0, this.f137658A), MessageFetchScene.SPECIFIED_POSITION, i, iGetDataCallback2);
        } else {
            m216366a(true, false);
            this.f137691n.mo127135a(i, iGetDataCallback2);
        }
    }

    /* renamed from: a */
    public boolean mo190334a(ThreadTopic threadTopic, List<MessageInfo> list, List<Integer> list2) {
        if (threadTopic == null) {
            return false;
        }
        if (threadTopic.getReplyCount() == 0) {
            return true;
        }
        if (mo190114l()) {
            return false;
        }
        for (MessageInfo messageInfo : list) {
            if (messageInfo.getMessage().getThreadPosition() == 0 && !messageInfo.getMessage().isPreMessage()) {
                return true;
            }
        }
        return CollectionUtils.isNotEmpty(list2) && list2.contains(0);
    }

    /* renamed from: a */
    public void mo190331a(C55781c cVar) {
        if (mo190334a(cVar.mo190303a() != null ? cVar.mo190303a().mo126018b() : null, cVar.mo124058b(), cVar.mo124060c())) {
            Log.m165389i("ThreadDetailModel", "addTopicMessageInfoIfNeed add topic messageinfo");
            this.f137679b.mo190289o();
            if (this.f137679b.mo190290p() != null && this.f137679b.mo190290p().getMessage() != null && this.f137679b.mo190290p().getMessage().isNoTraceDelete()) {
                this.f137683f.mo190134a(this.f137686i, this.f137666I);
            }
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190058a(final IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback) {
        this.f137690m.mo124049b(new C33963h(new PageLoader.AbstractC33950c() {
            /* class com.ss.android.lark.threaddetail.$$Lambda$d$1E28Hhcomqd8dq0Ou5H9DZSCMBc */

            @Override // com.ss.android.lark.chat.core.model.PageLoader.AbstractC33950c
            public final int getPosition() {
                return C55796d.lambda$1E28Hhcomqd8dq0Ou5H9DZSCMBc(C55796d.this);
            }
        }, 15), new C55794f(this.f137679b, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<C55781c>() {
            /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass28 */

            /* renamed from: a */
            public void onSuccess(C55781c cVar) {
                iGetDataCallback.onSuccess(C55796d.this.f137679b.mo127125l());
                if (C55796d.this.f137687j != null) {
                    PerfChatPerformanceMonitor.m213459a(C55796d.this.f137687j.getId(), C55796d.this.f137687j.getUserCount(), ChatBundle.ChatType.THREAD_DETAIL, null);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
                if (C55796d.this.f137687j != null) {
                    PerfChatPerformanceMonitor.m213459a(C55796d.this.f137687j.getId(), C55796d.this.f137687j.getUserCount(), ChatBundle.ChatType.THREAD_DETAIL, errorResult);
                }
            }
        })));
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190077a(String str, List<ReactionInfo> list, String str2) {
        if (C35249h.m137636a(list, str2, this.f137685h.mo134394a())) {
            mo190092b(str, str2);
        } else {
            mo190072a(str, str2);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190072a(String str, final String str2) {
        this.f137693p.mo121409a(str, str2, false, (IGetDataCallback) getCallbackManager().wrapCallback(new IGetDataCallback<Integer>() {
            /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass30 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165384e("ThreadDetailModel", "Reaction failed:", errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Integer num) {
                Log.m165379d("ThreadDetailModel", "Add reaction success， key is:" + str2);
            }
        }));
        C35234b.m137579e().mo121401a(str2);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: b */
    public void mo190092b(String str, final String str2) {
        this.f137693p.mo121409a(str, str2, true, (IGetDataCallback) getCallbackManager().wrapCallback(new IGetDataCallback<Integer>() {
            /* class com.ss.android.lark.threaddetail.C55796d.C557992 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165384e("ThreadDetailModel", "Reaction failed:", errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Integer num) {
                Log.m165379d("ThreadDetailModel", "delete reaction success,  key is:" + str2);
            }
        }));
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190064a(Sticker sticker, IGetDataCallback<Boolean> iGetDataCallback) {
        C29990c.m110930b().mo134502A().mo134385a(Collections.singletonList(sticker), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190079a(String str, boolean z, IGetDataCallback<String> iGetDataCallback) {
        C32848e.m126401b().mo121096a(str, z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new UIGetDataCallback(iGetDataCallback)));
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190075a(String str, String str2, RichText richText) {
        if (this.f137687j != null && !C59035h.m229210a(richText)) {
            int i = 0;
            this.f137680c.mo121267b(((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo106659a(richText).mo125332j(this.f137687j.getId())).mo125330h(this.f137686i)).mo125331i(this.f137686i)).mo125333k(this.f137686i)).mo125329c(this.f137668K == 1)).mo106660a(), this.f137670M);
            ThreadTopicHitPoint.Companion aVar = ThreadTopicHitPoint.f135906a;
            boolean isPublic = this.f137687j.isPublic();
            if (this.f137668K == 1) {
                i = 1;
            }
            aVar.mo187713a(isPublic ? 1 : 0, i);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: b */
    public void mo190093b(String str, String str2, RichText richText) {
        if (this.f137687j != null && !C59035h.m229210a(richText)) {
            if (KBRichTextUtils.m160782a(richText)) {
                mo190075a(str, str2, richText);
                return;
            }
            int i = 0;
            this.f137680c.mo121267b(((C29609a.C29610a) ((C29609a.C29610a) ((C29609a.C29610a) ((C29609a.C29610a) ((C29609a.C29610a) C29609a.m109497a().mo106693a(false).mo125332j(this.f137687j.getId())).mo125330h(this.f137686i)).mo125331i(this.f137686i)).mo106691a(richText).mo125333k(this.f137686i)).mo125329c(this.f137668K == 1)).mo106694a(), this.f137670M);
            ThreadTopicHitPoint.Companion aVar = ThreadTopicHitPoint.f135906a;
            boolean isPublic = this.f137687j.isPublic();
            if (this.f137668K == 1) {
                i = 1;
            }
            aVar.mo187713a(isPublic ? 1 : 0, i);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190084a(boolean z, IGetDataCallback<Void> iGetDataCallback) {
        this.f137694q.mo121353a(this.f137686i, z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public boolean mo190085a() {
        int f = this.f137679b.mo127117f();
        return f >= 0 && f < this.f137679b.mo190291q();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: b */
    public boolean mo190097b() {
        return this.f137679b.mo127115e() != Integer.MAX_VALUE && this.f137679b.mo127115e() > 0;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190060a(UIGetDataCallback uIGetDataCallback) {
        mo190056a(this.f137679b.mo190291q(), uIGetDataCallback);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190062a(MessageInfo messageInfo) {
        this.f137678a.execute(new Runnable(messageInfo) {
            /* class com.ss.android.lark.threaddetail.$$Lambda$d$gaMKuZqp6etir8KPSOfUCZFQ7C0 */
            public final /* synthetic */ MessageInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C55796d.lambda$gaMKuZqp6etir8KPSOfUCZFQ7C0(C55796d.this, this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190063a(MessageInfo messageInfo, IGetDataCallback<String> iGetDataCallback) {
        Message message = messageInfo.getMessage();
        message.setSendStatus(SendStatus.SENDING);
        mo190062a(messageInfo);
        this.f137680c.mo121087a(message, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190080a(List<MessageInfo> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("readMessage, list size is:");
        sb.append(list == null ? 0 : list.size());
        Log.m165389i("ThreadDetailModel", sb.toString());
        if (!CollectionUtils.isEmpty(list)) {
            if (this.f137669L) {
                Log.m165389i("ThreadDetailModel", "enableNewReader, readMessage immediately");
                mo190335c(new ArrayList(list));
                mo190337d(new ArrayList(list));
                return;
            }
            Log.m165389i("ThreadDetailModel", "put message into executor");
            this.f137662E.mo93035a(list);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public boolean mo190086a(int i) {
        return this.f137679b.mo127117f() >= i && this.f137679b.mo127115e() <= i;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190056a(int i, final IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback) {
        this.f137690m.mo124045a(new C33963h(i, 15, MessageFetchScene.SPECIFIED_POSITION, ChannelDataFetcherStrategy.SYNC_SERVER_DATA), new C55794f(this.f137679b, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<C55781c>() {
            /* class com.ss.android.lark.threaddetail.C55796d.C558014 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(C55781c cVar) {
                C55796d.this.mo190331a(cVar);
                iGetDataCallback.onSuccess(C55796d.this.f137679b.mo127125l());
            }
        })));
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190071a(String str, final RichText richText, final String str2, final RichText richText2, final boolean z) {
        String str3;
        final String b = this.f137679b.mo122940b();
        StringBuilder sb = new StringBuilder();
        sb.append("saveAllDraft: parentId = [");
        sb.append(str);
        sb.append("], chatId = [");
        sb.append(b);
        sb.append("], messageText = [");
        String str4 = "";
        if (richText == null) {
            str3 = str4;
        } else {
            str3 = richText.getInnerText();
        }
        sb.append(str3);
        sb.append("], postTitle = [");
        sb.append(str2);
        sb.append("], postContent = [");
        if (richText2 != null) {
            str4 = richText2.getInnerText();
        }
        sb.append(str4);
        sb.append("]");
        Log.m165379d("ThreadDetailModel", sb.toString());
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.threaddetail.C55796d.RunnableC558025 */

            public void run() {
                C55796d.this.f137682e.mo126555a(C55796d.this.f137686i, b, null, richText, str2, richText2, z);
            }
        });
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190081a(List<String> list, final IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback) {
        if (list != null && list.size() > 0) {
            C29990c.m110930b().mo134522U().mo134620a(list, "", (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<List<FavoriteMessageInfo>>() {
                /* class com.ss.android.lark.threaddetail.C55796d.C558036 */

                /* renamed from: a */
                public void onSuccess(List<FavoriteMessageInfo> list) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(list);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            }));
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190070a(String str, UIGetDataCallback<C35221d> uIGetDataCallback) {
        MessageInfo b = mo190087b(str);
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(uIGetDataCallback);
        if (!this.f137699v || this.f137687j.isSecret()) {
            this.f137700w.mo122510a(b, wrapAndAddGetDataCallback);
        } else {
            this.f137700w.mo122511b(b, wrapAndAddGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190078a(final String str, final boolean z) {
        final MessageInfo messageInfo = (MessageInfo) this.f137679b.mo127099a(str);
        if (messageInfo != null && messageInfo.getMessage().getType() == Message.Type.AUDIO) {
            if (messageInfo.getMessage().isSourceFileDelete()) {
                LKUIToast.show(C29990c.m110930b().mo134528a(), (int) R.string.Lark_Message_AudioMessageWithdrawMessageToast);
                return;
            }
            Log.m165379d("ThreadDetailModel", "toggleAudioText shown = " + z);
            this.f137680c.mo121268b(str, z, new IGetDataCallback<ToggleTextOnAudioResponse>() {
                /* class com.ss.android.lark.threaddetail.C55796d.C558047 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165379d("ThreadDetailModel", "hide audio text fail:" + str);
                }

                /* renamed from: a */
                public void onSuccess(ToggleTextOnAudioResponse toggleTextOnAudioResponse) {
                    String str;
                    Log.m165379d("ThreadDetailModel", "toggle audio text success");
                    AudioContent audioContent = (AudioContent) messageInfo.getMessage().getContent();
                    if (z && TextUtils.isEmpty(audioContent.getRecognizedText())) {
                        String locale = C55796d.this.f137684g.mo134587o().mo134745d().toString();
                        if (!TextUtils.isEmpty(locale)) {
                            str = locale.toLowerCase();
                        } else {
                            str = "zh_ch";
                        }
                        C55796d.this.f137680c.mo121260a(str, str, 16000, "opus", new IGetDataCallback<Boolean>() {
                            /* class com.ss.android.lark.threaddetail.C55796d.C558047.C558051 */

                            /* renamed from: a */
                            public void onSuccess(Boolean bool) {
                                Log.m165379d("ThreadDetailModel", "sendAudioMessage2Text success：" + bool);
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                String str;
                                Log.m165379d("ThreadDetailModel", "sendAudioMessage2Text error：" + errorResult.getErrorMsg());
                                if (C55796d.this.f137683f != null) {
                                    AbstractC55766a.AbstractC55767a.AbstractC55768a aVar = C55796d.this.f137683f;
                                    if (errorResult.getErrorCode() != 5029) {
                                        str = errorResult.getErrorMsg();
                                    } else {
                                        str = UIUtils.getString(C55796d.this.f137684g.mo134528a(), R.string.Lark_Chat_AudioConvertToTextError);
                                    }
                                    aVar.mo190133a(str);
                                }
                            }
                        });
                    }
                    Log.m165379d("ThreadDetailModel", "toggle audio text after");
                    C55796d.this.f137679b.mo127105a(str, new AbstractC34432b.AbstractC34435c<AbstractC34006a>() {
                        /* class com.ss.android.lark.threaddetail.C55796d.C558047.C558062 */

                        /* renamed from: a */
                        public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                            Log.m165379d("ThreadDetailModel", "update item, shown = " + z);
                            ((AudioContent) aVar.getMessage().getContent()).setNeedHideText(z ^ true);
                            return aVar;
                        }
                    });
                }
            });
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190073a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f137695r.mo120995a(str, AddChatChatterApply.Ways.VIA_SEARCH, Collections.singletonList(this.f137685h.mo134394a()), str2, (String) null, (String) null, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190065a(IStickerDependency.StickerFileInfo stickerFileInfo) {
        int i = 0;
        this.f137680c.mo121267b(((C34009b.C34010a) ((C34009b.C34010a) ((C34009b.C34010a) ((C34009b.C34010a) ((C34009b.C34010a) C34009b.m131850a().mo125324a(stickerFileInfo).mo125332j(this.f137687j.getId())).mo125330h(this.f137686i)).mo125331i(this.f137686i)).mo125333k(this.f137686i)).mo125329c(this.f137668K == 1)).mo125325a(), this.f137670M);
        ThreadTopicHitPoint.Companion aVar = ThreadTopicHitPoint.f135906a;
        boolean isPublic = this.f137687j.isPublic();
        if (this.f137668K == 1) {
            i = 1;
        }
        aVar.mo187713a(isPublic ? 1 : 0, i);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190061a(final Message message, final String str, String str2, final int i) {
        AudioContent audioContent = (AudioContent) message.getContent();
        AnonymousClass11 r1 = new MonitorMessageSendCallback() {
            /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass11 */

            @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
            /* renamed from: a */
            public void mo121288a(C34118b bVar) {
                super.mo121288a(bVar);
            }

            @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
            /* renamed from: a */
            public void mo123034a(MessageInfo messageInfo) {
                super.mo123034a(messageInfo);
                if (messageInfo != null) {
                    Log.m165389i("ThreadDetailModel", "onPreSend, message cid is:" + messageInfo.getMessage().getcId());
                    C55796d.this.f137678a.execute(new Runnable(messageInfo, i, str, message) {
                        /* class com.ss.android.lark.threaddetail.$$Lambda$d$11$FEW9hhtkbnLpbkbX3TCQbGUGr1o */
                        public final /* synthetic */ MessageInfo f$1;
                        public final /* synthetic */ int f$2;
                        public final /* synthetic */ String f$3;
                        public final /* synthetic */ Message f$4;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                            this.f$4 = r5;
                        }

                        public final void run() {
                            C55796d.AnonymousClass11.lambda$FEW9hhtkbnLpbkbX3TCQbGUGr1o(C55796d.AnonymousClass11.this, this.f$1, this.f$2, this.f$3, this.f$4);
                        }
                    });
                }
            }

            @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
            /* renamed from: a */
            public void mo121287a(ErrorResult errorResult, Message message) {
                super.mo121287a(errorResult, message);
                Log.m165389i("ThreadDetailModel", "Send msg failed， message id is：" + message.getcId() + "， err：" + errorResult);
                C55796d.this.f137679b.mo127102a(new C33410f(message), new AbstractC34417b.AbstractC34424f<AbstractC34006a>() {
                    /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass11.C557981 */

                    @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34424f
                    /* renamed from: a */
                    public AbstractC34006a mo122923a(AbstractC34006a aVar) {
                        aVar.getMessage().setSendStatus(SendStatus.FAIL);
                        return aVar;
                    }
                });
                if (!TextUtils.isEmpty(errorResult.getDisplayMsg()) && C55796d.this.f137683f != null) {
                    C55796d.this.f137683f.mo190133a(errorResult.getDisplayMsg());
                }
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m216483a(MessageInfo messageInfo, int i, String str, Message message) {
                AudioContent audioContent = (AudioContent) messageInfo.getMessage().getContent();
                audioContent.setDuration(i);
                audioContent.setFileState(AudioContent.AudioState.DONE);
                audioContent.setLocalFilePath(str);
                message.setId(messageInfo.getMessage().getId());
                message.setcId(messageInfo.getMessage().getcId());
                C55796d.this.f137679b.mo127119g(messageInfo);
                Log.m165379d("ThreadDetailModel", "onPreSend:preMessageInfo.sendstatus:" + messageInfo.getMessage().getSendStatus().toString());
            }
        };
        r1.mo126648a(this.f137687j);
        this.f137680c.mo121267b(((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) C34007a.m131841a().mo125332j(this.f137687j.getId())).mo125330h(message.getRootId())).mo125331i(message.getParentId())).mo125328c(this.f137687j.getLastMessagePosition() + 1)).mo106709g(str2)).mo125318a(AudioContent.AudioState.DOWNLOAD).mo125317a(i).mo125319a(str).mo125321b(audioContent.getUploadId()).mo125322c(audioContent.getAudioToken()).mo125320a(), r1);
        ThreadTopicHitPoint.f135906a.mo187713a(this.f137687j.isPublic() ? 1 : 0, 0);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public String mo190055a(String str, String str2, String str3) {
        return this.f137680c.mo121249a(str, str2, str3, C41039c.m162705a());
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public Message mo190054a(String str, String str2, String str3, String str4) {
        if (this.f137687j == null) {
            return null;
        }
        return ((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) C34007a.m131841a().mo125332j(this.f137687j.getId())).mo125330h(str)).mo125331i(str2)).mo125328c(this.f137687j.getLastMessagePosition() + 1)).mo106709g(str4)).mo125319a(str3).mo125318a(AudioContent.AudioState.RECORDING).mo125320a().mo106656a(str4, this.f137685h.mo134394a());
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190067a(final String str) {
        this.f137679b.mo127102a(new AbstractC34417b.AbstractC34421c<String>() {
            /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass13 */

            /* renamed from: a */
            public String mo122977d() {
                return str;
            }

            /* renamed from: b */
            public String mo122976c() {
                return str;
            }
        }, new C33395d());
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: b */
    public void mo190095b(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        C29990c.m110930b().mo134522U().mo134621a(list, this.f137679b.mo122940b(), "", (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190083a(List<String> list, boolean z, String str, String str2) {
        C32915a a = C32915a.m126762a(this.f137687j.getId(), list).mo121547a(z).mo121541a(this.f137687j.getLastMessagePosition()).mo121551b(str2).mo121546a(str).mo121545a(this.f137670M).mo121544a(new C32915a.AbstractC32918a() {
            /* class com.ss.android.lark.threaddetail.$$Lambda$d$3p3X_QfoDmO5HmdNv4r6MpBjUVM */

            @Override // com.ss.android.lark.chat.base.model.C32915a.AbstractC32918a
            public final void onExceedLimitSizeOrReadFail(File file) {
                C55796d.lambda$3p3X_QfoDmO5HmdNv4r6MpBjUVM(C55796d.this, file);
            }
        });
        boolean z2 = true;
        if (this.f137668K != 1) {
            z2 = false;
        }
        a.mo121552b(z2).mo121548a();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190082a(List<Photo> list, String str, String str2) {
        if (!CollectionUtils.isEmpty(list)) {
            Photo photo = list.get(0);
            this.f137680c.mo121267b(((C29631w.C29633a) ((C29631w.C29633a) ((C29631w.C29633a) ((C29631w.C29633a) C29631w.m109564a().mo125332j(this.f137679b.mo122940b())).mo125330h(str)).mo125331i(str2)).mo125328c(this.f137687j.getLastMessagePosition())).mo106767a(new File(photo.getPath())).mo106768a(photo.getMimeType()).mo106766a(photo.getSize()).mo106770b(photo.getDuration()).mo106771b(photo.getCompressPath()).mo106769a(), this.f137670M);
            ThreadTopicHitPoint.f135906a.mo187713a(this.f137687j.isPublic() ? 1 : 0, 0);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: b */
    public void mo190094b(List<File> list) {
        if (!CollectionUtils.isEmpty(list)) {
            for (File file : list) {
                m216363a(file);
            }
        }
    }

    @Override // com.ss.android.lark.p2392o.AbstractC48707q
    /* renamed from: a */
    public void mo123873a(boolean z) {
        this.f137683f.mo190136a(z);
    }

    @Override // com.ss.android.lark.threaddetail.p2750b.C55783e.AbstractC55793a
    /* renamed from: a */
    public void mo190321a(Chat chat) {
        Log.m165389i("ThreadDetailModel", "push chat: " + chat);
        Chat chat2 = this.f137687j;
        this.f137687j = chat;
        if (!(chat2 == null || chat == null || chat2.isAutoTranslate() == chat.isAutoTranslate())) {
            C33103ae aeVar = this.f137661D;
            if (aeVar != null) {
                aeVar.clearCache();
            }
            AbstractC55766a.AbstractC55767a.AbstractC55768a aVar = this.f137683f;
            if (aVar != null) {
                aVar.mo190138b();
            }
        }
        if (chat.isDissolved()) {
            this.f137683f.mo190140b(this.f137674Q);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190066a(C55795c cVar) {
        if (m216371c(cVar)) {
            this.f137683f.mo190141c();
            m216374e(cVar);
            return;
        }
        m216373d(cVar);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190069a(String str, IGetDataCallback<String> iGetDataCallback) {
        ConvertOfficeToSpaceService.f88310h.mo126548a().mo126547a(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190057a(final Context context, final String str) {
        MessageInfo messageInfo = (MessageInfo) this.f137679b.mo127099a(str);
        if (messageInfo != null && messageInfo.getMessage().getType() == Message.Type.FILE) {
            Message message = messageInfo.getMessage();
            FileContent fileContent = (FileContent) messageInfo.getMessage().getContent();
            mo190333a(str, FileState.DOWNLOADING, (String) null, 0);
            C29990c.m110930b().mo134591s().mo134677a(context, str, message.getSourceId(), mo190110h(), message.getSourceType().getNumber(), fileContent.getKey(), C26308n.m95252a(context, C57881t.m224652x(context), fileContent.getName()), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass16 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i("ThreadDetailModel", "onError:" + errorResult);
                    if (errorResult.getErrorCode() == 5601) {
                        C55796d.this.f137683f.mo190130a(context, false);
                    } else if (errorResult.getErrorCode() == 5602) {
                        C55796d.this.f137683f.mo190130a(context, true);
                    }
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    if (TextUtils.isEmpty(str)) {
                        Log.m165389i("ThreadDetailModel", "download success, filePath is empty");
                        C55796d.this.mo190333a(str, FileState.DOWNLOAD, (String) null, 0);
                    } else if (new File(str).exists()) {
                        Log.m165389i("ThreadDetailModel", "download success, filePath is:" + str);
                        C55796d.this.mo190333a(str, FileState.DONE, str, 100);
                    }
                }
            }), new AbstractC25974h() {
                /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass17 */

                @Override // com.larksuite.framework.callback.AbstractC25974h
                public void onUpdateProgress(long j, int i) {
                    if (j > 0) {
                        C55796d.this.mo190333a(str, (FileState) null, (String) null, (int) ((((long) i) * 100) / j));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo190333a(String str, final FileState fileState, final String str2, final int i) {
        this.f137679b.mo127105a(str, new AbstractC34432b.AbstractC34435c<AbstractC34006a>() {
            /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass18 */

            /* renamed from: a */
            public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                AbstractC34006a doCopy = aVar.doCopy();
                doCopy.setMessage(aVar.getMessage().clone());
                FileContent fileContent = new FileContent((FileContent) aVar.getMessage().getContent());
                FileState fileState = fileState;
                if (fileState != null) {
                    fileContent.setFileState(fileState);
                }
                String str = str2;
                if (str != null) {
                    fileContent.setFilePath(str);
                }
                fileContent.setProgress(i);
                doCopy.getMessage().setMessageContent(fileContent);
                return doCopy;
            }
        });
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190076a(String str, String str2, String str3, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback) {
        C29990c.m110930b().mo134503B().mo134614a(str, str2, str3, sourceType, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190074a(String str, String str2, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback) {
        C29990c.m110930b().mo134503B().mo134613a(str, str2, sourceType, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    public void mo190068a(String str, final int i) {
        this.f137679b.mo127105a(str, new AbstractC34432b.AbstractC34435c<AbstractC34006a>() {
            /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass21 */

            /* renamed from: a */
            public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                if (aVar.getMessage().getType() != Message.Type.FILE) {
                    return aVar;
                }
                AbstractC34006a doCopy = aVar.doCopy();
                doCopy.setMessage(aVar.getMessage().clone());
                FileContent fileContent = new FileContent((FileContent) aVar.getMessage().getContent());
                fileContent.setSaveToDrive(i);
                doCopy.getMessage().setMessageContent(fileContent);
                return doCopy;
            }
        });
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: b */
    public void mo190091b(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
        this.f137695r.mo121020a(str, (String) null, true, (IGetDataCallback<ChatChatterResponse>) getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback), 0);
    }

    /* renamed from: a */
    public void mo190332a(C55795c cVar, ThreadTopic threadTopic) {
        if (cVar.f137645d != null) {
            cVar.f137644c = cVar.f137645d.getName();
            m216370b(cVar, threadTopic);
            return;
        }
        C57865c.m224574a(new C57865c.AbstractC57873d(threadTopic) {
            /* class com.ss.android.lark.threaddetail.$$Lambda$d$WoEHdbPF90s8qMHlZO0oaxucSBk */
            public final /* synthetic */ ThreadTopic f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C55796d.lambda$WoEHdbPF90s8qMHlZO0oaxucSBk(C55796d.this, this.f$1);
            }
        }, new C57865c.AbstractC57871b(cVar, threadTopic) {
            /* class com.ss.android.lark.threaddetail.$$Lambda$d$Dll4OENBgZTmhOaxbcyUEUqN94 */
            public final /* synthetic */ C55795c f$1;
            public final /* synthetic */ ThreadTopic f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C55796d.m270997lambda$Dll4OENBgZTmhOaxbcyUEUqN94(C55796d.this, this.f$1, this.f$2, (Chat) obj);
            }
        });
    }

    @Override // com.ss.android.lark.threaddetail.p2750b.C55783e.AbstractC55793a
    /* renamed from: a */
    public void mo190322a(Chat chat, Map<String, Chatter> map) {
        if (chat != null && this.f137687j != null && Objects.equals(chat.getId(), this.f137687j.getId()) && !CollectionUtils.isEmpty(map) && map.containsKey(this.f137685h.mo134394a())) {
            mo190321a(chat);
            this.f137683f.mo190137a(this.f137675R, this.f137674Q, this.f137686i, this.f137666I);
        }
    }

    @Override // com.ss.android.lark.threaddetail.p2750b.C55783e.AbstractC55793a
    /* renamed from: a */
    public void mo190324a(C36874a aVar) {
        C33103ae aeVar = this.f137661D;
        if (aeVar != null) {
            aeVar.handlePushTranslateState(aVar, new AbstractC33134w.AbstractC33136b() {
                /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass23 */

                @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33136b
                /* renamed from: a */
                public void mo122326a(Map<String, TranslateState> map) {
                }

                @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33136b
                /* renamed from: a */
                public void mo122325a(TranslateState translateState) {
                    if (C55796d.this.f137683f != null) {
                        C55796d.this.f137683f.mo190132a(translateState);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.threaddetail.p2750b.C55783e.AbstractC55793a
    /* renamed from: a */
    public void mo190325a(String str, List<String> list, Integer num, Map<String, Integer> map, Map<String, Integer> map2) {
        AbstractC55766a.AbstractC55767a.AbstractC55768a aVar;
        C33103ae aeVar = this.f137661D;
        if (aeVar != null && aeVar.handlePushTranslateSettingV2(str, list, num, map, map2) && (aVar = this.f137683f) != null) {
            aVar.mo190138b();
        }
    }

    @Override // com.ss.android.lark.threaddetail.p2750b.C55783e.AbstractC55793a
    /* renamed from: a */
    public void mo190323a(TopicGroup topicGroup) {
        Log.m165389i("ThreadDetailModel", "onPushTopicGroup topicGroup =" + topicGroup);
        if (topicGroup != null) {
            this.f137665H = topicGroup;
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: Q */
    private /* synthetic */ int m216357Q() {
        return this.f137679b.mo127115e();
    }

    /* access modifiers changed from: public */
    /* renamed from: R */
    private /* synthetic */ int m216358R() {
        return this.f137679b.mo127117f();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: B */
    public boolean mo190047B() {
        return this.f137660C.booleanValue();
    }

    @Override // com.ss.android.lark.threaddetail.p2750b.C55783e.AbstractC55793a
    /* renamed from: J */
    public void mo190319J() {
        this.f137683f.mo190129a();
    }

    @Override // com.ss.android.lark.threaddetail.p2750b.C55783e.AbstractC55793a
    /* renamed from: K */
    public void mo190320K() {
        this.f137683f.mo190145f();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: c */
    public String mo190098c() {
        return this.f137679b.mo190292r();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: d */
    public boolean mo190105d() {
        return this.f137679b.mo190293s();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: e */
    public Chatter mo190106e() {
        return this.f137679b.mo190294t();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: h */
    public String mo190110h() {
        return this.f137679b.mo122940b();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: r */
    public Chatter mo190120r() {
        return this.f137672O.mo121186a();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: u */
    public String mo190123u() {
        return this.f137679b.mo190295u();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: x */
    public MessageInfo mo190126x() {
        return this.f137679b.mo190290p();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: z */
    public boolean mo190128z() {
        return this.f137679b.mo190296v();
    }

    /* access modifiers changed from: public */
    /* renamed from: P */
    private /* synthetic */ void m216356P() {
        if (this.f137679b.mo127115e() == 0) {
            this.f137679b.mo190289o();
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: A */
    public boolean mo190046A() {
        AbstractC36474h.C36492r rVar = this.f137676S;
        if (rVar == null || !rVar.f94028b) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public void mo190330H() {
        this.f137661D.setInitData(mo190110h(), new AbstractC33134w.AbstractC33135a() {
            /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass26 */

            @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33135a
            /* renamed from: b */
            public void mo122324b(Collection<AbstractC34006a> collection) {
                mo122323a(collection);
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33135a
            /* renamed from: a */
            public void mo122323a(Collection<AbstractC34006a> collection) {
                C55796d.this.f137679b.mo127110b(C33386b.m129361b(collection));
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33135a
            /* renamed from: a */
            public List<AbstractC34006a> mo122322a(Collection<String> collection, int i) {
                return new ArrayList(C55796d.this.f137679b.mo127100a(collection));
            }
        });
    }

    @Override // com.ss.android.lark.threaddetail.p2750b.C55783e.AbstractC55793a
    /* renamed from: I */
    public void mo190318I() {
        this.f137683f.mo190134a(this.f137686i, this.f137666I);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: l */
    public boolean mo190114l() {
        if (!this.f137701x || !this.f137671N) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: o */
    public ThreadTopic mo190117o() {
        C55777a aVar = this.f137679b;
        if (aVar != null) {
            return aVar.mo190288n();
        }
        return null;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: w */
    public int mo190125w() {
        return this.f137679b.mo190288n().getReplyCount();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: y */
    public String mo190127y() {
        Chat chat = this.f137687j;
        if (chat != null) {
            return chat.getOwnerId();
        }
        return "";
    }

    /* renamed from: N */
    private void m216354N() {
        C26134a<List<MessageInfo>> aVar = new C26134a<>(500, CoreThreadPool.getDefault().getScheduleThreadPool());
        this.f137662E = aVar;
        aVar.mo93034a(new C26134a.AbstractC26136a<List<MessageInfo>>() {
            /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass25 */

            @Override // com.larksuite.framework.thread.C26134a.AbstractC26136a
            public void onExecute(List<List<MessageInfo>> list) {
                HashSet hashSet = new HashSet();
                for (List<MessageInfo> list2 : list) {
                    hashSet.addAll(list2);
                }
                if (CollectionUtils.isNotEmpty(hashSet)) {
                    C55796d.this.mo190335c(new ArrayList(hashSet));
                }
                C55796d.this.mo190337d(new ArrayList(hashSet));
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: O */
    private /* synthetic */ ChatChatter m216355O() {
        return C32835d.m126323c().m126324c(mo190110h(), C29990c.m110930b().mo134515N().mo134394a());
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: D */
    public boolean mo190049D() {
        TopicGroup topicGroup = this.f137665H;
        if (topicGroup == null || topicGroup.getUserSetting() == null || this.f137665H.getUserSetting().getTopicGroupRole() != TopicGroup.TopicGroupRole.MEMBER) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: E */
    public boolean mo190050E() {
        TopicGroup topicGroup = this.f137665H;
        if (topicGroup == null || topicGroup.getUserSetting() == null || this.f137665H.getUserSetting().getTopicGroupRole() != TopicGroup.TopicGroupRole.PARTICIPANT) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: f */
    public void mo190108f() {
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable(mo190117o().getId()) {
            /* class com.ss.android.lark.threaddetail.$$Lambda$d$qjF2nvhX_Y1hUtfgTXBU1sWFSbo */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C55796d.lambda$qjF2nvhX_Y1hUtfgTXBU1sWFSbo(C55796d.this, this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: j */
    public void mo190112j() {
        this.f137695r.mo120994a(this.f137679b.mo122940b(), getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.threaddetail.C55796d.C558003 */

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                C55796d.this.f137687j = chat;
                C55796d dVar = C55796d.this;
                dVar.f137688k = dVar.f137687j.getName();
                C55796d.this.f137683f.mo190131a(C55796d.this.f137687j);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ThreadDetailModel", "load chat data failed,error:" + errorResult.toString());
            }
        }));
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: q */
    public void mo190119q() {
        Log.m165389i("ThreadDetailModel", "addTopicMessageInfo");
        this.f137678a.execute(new Runnable() {
            /* class com.ss.android.lark.threaddetail.$$Lambda$d$uT4o4JKQfYTIvSssF8hOpBbEu4 */

            public final void run() {
                C55796d.m271000lambda$uT4o4JKQfYTIvSssF8hOpBbEu4(C55796d.this);
            }
        });
    }

    /* renamed from: L */
    private void m216352L() {
        this.f137681d = C29990c.m110930b().mo134502A();
        this.f137682e = C34218i.m132791a();
        this.f137680c = C32848e.m126401b();
        this.f137694q = C32881i.m126556a();
        this.f137693p = C34146aa.m132620b();
        this.f137695r = C32821b.m126120a();
        this.f137672O = C32835d.m126323c();
    }

    /* renamed from: M */
    private void m216353M() {
        C55779b bVar = new C55779b(this.f137690m, this.f137679b, this.f137689l, this.f137678a, getCallbackManager(), this.f137679b.mo190288n());
        this.f137691n = bVar;
        bVar.mo190299a(new C55779b.AbstractC55780a() {
            /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass19 */

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m216498a() {
                C55796d.this.f137679b.mo190289o();
            }

            @Override // com.ss.android.lark.threaddetail.p2750b.C55779b.AbstractC55780a
            /* renamed from: a */
            public void mo190301a(C55781c cVar) {
                C55796d.this.mo190331a(cVar);
            }

            @Override // com.ss.android.lark.threaddetail.p2750b.C55779b.AbstractC55780a
            /* renamed from: a */
            public void mo190302a(List<MessageInfo> list, List<Integer> list2) {
                C55796d dVar = C55796d.this;
                if (dVar.mo190334a(dVar.f137679b.mo190288n(), list, list2)) {
                    Log.m165389i("ThreadDetailModel", "onMissingDataCompleted add topic messageinfo");
                    C55796d.this.f137678a.execute(new Runnable() {
                        /* class com.ss.android.lark.threaddetail.$$Lambda$d$19$bcozgFs5b0SO1qxzX0G6yDcxxLA */

                        public final void run() {
                            C55796d.AnonymousClass19.lambda$bcozgFs5b0SO1qxzX0G6yDcxxLA(C55796d.AnonymousClass19.this);
                        }
                    });
                }
            }
        });
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: F */
    public List<MessageInfo> mo190051F() {
        ArrayList arrayList = new ArrayList();
        List<String> latestAtMessageIds = mo190117o().getLatestAtMessageIds();
        Map<String, MessageInfo> d = this.f137680c.mo121110d(latestAtMessageIds);
        for (String str : latestAtMessageIds) {
            MessageInfo messageInfo = d.get(str);
            if (messageInfo != null) {
                arrayList.add(messageInfo);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: G */
    public void mo190052G() {
        Chat chat = this.f137687j;
        if (chat != null) {
            String textDraftId = chat.getTextDraftId();
            String id = this.f137687j.getId();
            if (!TextUtils.isEmpty(textDraftId)) {
                this.f137682e.mo126553a(id, 0);
                if (this.f137687j.getLastDraftId().equals(textDraftId)) {
                    this.f137682e.mo126554a(id, "");
                }
            }
        }
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C55783e eVar = this.f137692o;
        if (eVar != null) {
            eVar.mo190316b();
        }
        C33958d dVar = this.f137689l;
        if (dVar != null) {
            dVar.mo124077c();
        }
        C33958d dVar2 = this.f137678a;
        if (dVar2 != null) {
            dVar2.mo124077c();
        }
        C29990c.m110930b().mo134524W().mo134470b(this);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: s */
    public C35218a mo190121s() {
        RichText richText;
        String str;
        RichText richText2;
        Draft a = this.f137682e.mo126552a(this.f137686i);
        if (a == null) {
            richText = C59029c.m229155a();
        } else {
            richText = a.contentRichText;
        }
        Draft b = this.f137682e.mo126556b(this.f137686i);
        if (b == null) {
            str = "";
        } else {
            str = b.title;
        }
        if (b == null) {
            richText2 = C59029c.m229155a();
        } else {
            richText2 = b.postRichText;
        }
        return new C35218a(richText, str, richText2);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: b */
    public void mo190096b(boolean z) {
        this.f137701x = z;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: c */
    public void mo190099c(int i) {
        this.f137668K = i;
    }

    @Override // com.ss.android.lark.threaddetail.p2750b.C55783e.AbstractC55793a
    /* renamed from: d */
    public void mo190327d(boolean z) {
        this.f137674Q = z;
    }

    @Override // com.ss.android.lark.threaddetail.p2750b.C55783e.AbstractC55793a
    /* renamed from: e */
    public void mo190328e(boolean z) {
        this.f137675R = z;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ TopicGroup m216359a(ThreadTopic threadTopic) {
        return this.f137694q.mo106482a(threadTopic.getChannel().getId(), false);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ Chat m216367b(ThreadTopic threadTopic) {
        return this.f137695r.mo120985a(threadTopic.getChannel().getId());
    }

    /* renamed from: d */
    private void m216373d(C55795c cVar) {
        m216369b(cVar);
        m216364a(new Runnable() {
            /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass15 */

            public void run() {
                C55796d.this.f137683f.mo190144e();
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m216375e(String str) {
        ThreadTopic b = this.f137694q.mo106486b(str);
        if (b != null) {
            this.f137692o.mo190309a(b);
        }
    }

    /* renamed from: c */
    private boolean m216371c(C55795c cVar) {
        if (cVar.f137643b == null || cVar.f137645d == null || cVar.f137653l == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m216372d(int i) {
        this.f137694q.mo121345a(this.f137679b.mo122940b(), MessageFetchScene.SPECIFIED_POSITION, i, 15, 5, ChannelDataFetcherStrategy.SYNC_SERVER_DATA, 30, false);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: e */
    public void mo190107e(IGetDataCallback<Long> iGetDataCallback) {
        final UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        this.f137694q.mo106484a(new IGetDataCallback<C29596a>() {
            /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass24 */

            /* renamed from: a */
            public void onSuccess(C29596a aVar) {
                wrapAndAddGetDataCallback.onSuccess(Long.valueOf(aVar.mo106642a()));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                wrapAndAddGetDataCallback.onSuccess(0L);
                Log.m165383e("ThreadDetailModel", "getAnonymityLeftCount error : " + errorResult.getDisplayMsg());
            }
        });
    }

    /* renamed from: e */
    private void m216374e(final C55795c cVar) {
        ThreadTopic threadTopic = cVar.f137643b;
        if (threadTopic == null) {
            this.f137694q.mo106485a(cVar.f137642a, new IGetDataCallback<ThreadTopic>() {
                /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass22 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (errorResult.getErrorCode() == 4008) {
                        C55796d.this.f137683f.mo190142c(cVar.f137642a, cVar.f137655n);
                    } else {
                        C55796d.this.f137683f.mo190143d();
                    }
                }

                /* renamed from: a */
                public void onSuccess(ThreadTopic threadTopic) {
                    if (threadTopic == null) {
                        C55796d.this.f137683f.mo190143d();
                    } else if (threadTopic.isNoTraceDelete()) {
                        C55796d.this.f137683f.mo190139b(cVar.f137642a, cVar.f137655n);
                    } else {
                        cVar.f137643b = threadTopic;
                        C55796d.this.mo190332a(cVar, threadTopic);
                    }
                }
            });
        } else if (threadTopic.isNoTraceDelete()) {
            this.f137683f.mo190139b(cVar.f137642a, cVar.f137655n);
        } else {
            mo190332a(cVar, threadTopic);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: b */
    public MessageInfo mo190087b(String str) {
        return (MessageInfo) this.f137679b.mo127099a(str);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: c */
    public void mo190100c(IGetDataCallback<Chat> iGetDataCallback) {
        this.f137695r.mo121007a(this.f137687j.getId(), (Iterable<String>) Collections.singletonList(this.f137685h.mo134394a()), (IGetDataCallback<Chat>) getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: d */
    public void mo190104d(IGetDataCallback<Void> iGetDataCallback) {
        this.f137694q.mo106487b(this.f137686i, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m216363a(File file) {
        this.f137680c.mo121267b(((C29613e.C29615a) ((C29613e.C29615a) C29613e.m109504a().mo125332j(this.f137679b.mo122940b())).mo125328c(this.f137687j.getLastMessagePosition() + 1)).mo106704b(file.getName()).mo106702a(file.getPath()).mo106701a(FileState.UPLOADING).mo106699a(C26311p.m95281c(file)).mo106706d(C26311p.m95279b(file)).mo106703a(), this.f137670M);
        ThreadTopicHitPoint.f135906a.mo187713a(this.f137687j.isPublic() ? 1 : 0, 0);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m216368b(MessageInfo messageInfo) {
        if (messageInfo.getMessage().getType() == Message.Type.AUDIO) {
            AudioContent audioContent = (AudioContent) messageInfo.getMessage().getContent();
            if (TextUtils.isEmpty(audioContent.getLocalFilePath())) {
                Log.m165389i("ThreadDetailModel", "audioContent getLocalFilePath()==null,state=" + audioContent.getFileState().getValue());
                MessageInfo messageInfo2 = (MessageInfo) this.f137679b.mo127099a(messageInfo.getId());
                if (messageInfo2 != null && messageInfo2.getMessage().getType() == Message.Type.AUDIO) {
                    AudioContent audioContent2 = (AudioContent) messageInfo2.getMessage().getContent();
                    if (!TextUtils.isEmpty(audioContent2.getLocalFilePath())) {
                        audioContent.setLocalFilePath(audioContent2.getLocalFilePath());
                        audioContent.setFileState(AudioContent.AudioState.DONE);
                    }
                }
            }
        }
        this.f137679b.mo127119g(messageInfo);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: c */
    public void mo190101c(final String str) {
        MessageInfo messageInfo = (MessageInfo) this.f137679b.mo127099a(str);
        if (messageInfo != null && messageInfo.getMessage().getType() == Message.Type.FILE) {
            Message message = messageInfo.getMessage();
            C29990c.m110930b().mo134591s().mo134680a(str, ((FileContent) messageInfo.getMessage().getContent()).getKey(), message.getSourceId(), message.getSourceType().getNumber(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass20 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    C55796d.this.mo190333a(str, FileState.DOWNLOAD, (String) null, 0);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("ThreadDetailModel", "cancel download failed:" + errorResult);
                }
            }));
        }
    }

    @Override // com.ss.android.lark.threaddetail.p2750b.C55783e.AbstractC55793a
    /* renamed from: d */
    public void mo190326d(String str) {
        Log.m165389i("ThreadDetailModel", "onAnnouncementChanged:" + str);
    }

    /* renamed from: a */
    private void m216364a(Runnable runnable) {
        ChatChatter chatChatter = this.f137667J;
        if (chatChatter == null || !TextUtils.equals(chatChatter.getChatId(), mo190109g().getId())) {
            C57865c.m224574a(new C57865c.AbstractC57873d() {
                /* class com.ss.android.lark.threaddetail.$$Lambda$d$Dn1I7L563F2qVHGiWa7tnoptjFQ */

                @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                public final Object produce() {
                    return C55796d.lambda$Dn1I7L563F2qVHGiWa7tnoptjFQ(C55796d.this);
                }
            }, new C57865c.AbstractC57871b(runnable) {
                /* class com.ss.android.lark.threaddetail.$$Lambda$d$tD5FbScAV9RTPzWTKPWZbOaJ2I */
                public final /* synthetic */ Runnable f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
                public final void consume(Object obj) {
                    C55796d.m270999lambda$tD5FbScAV9RTPzWTKPWZbOaJ2I(C55796d.this, this.f$1, (ChatChatter) obj);
                }
            });
        } else {
            runnable.run();
        }
    }

    /* renamed from: b */
    private void m216369b(C55795c cVar) {
        boolean z;
        this.f137678a = C33958d.m131429a("lk-thread-detail");
        this.f137689l = C33958d.m131429a("lk-thread-detail-bg");
        this.f137690m = new C55782d(cVar.f137642a, this.f137678a);
        this.f137679b = new C55777a(this.f137678a, cVar.f137643b, this.f137677T, this.f137663F);
        this.f137686i = cVar.f137642a;
        this.f137687j = cVar.f137645d;
        this.f137658A = cVar.f137649h;
        this.f137659B = cVar.f137650i;
        this.f137688k = cVar.f137644c;
        this.f137701x = cVar.f137646e;
        this.f137702y = cVar.f137647f;
        this.f137671N = cVar.f137648g;
        this.f137673P = cVar.f137651j;
        this.f137660C = Boolean.valueOf(cVar.f137652k);
        this.f137703z = cVar.f137656o;
        this.f137665H = cVar.f137653l;
        this.f137692o = new C55783e(this, this.f137686i, this.f137679b.mo122940b(), this.f137679b, this.f137678a);
        this.f137676S = this.f137684g.mo134505D();
        if (cVar.f137653l == null || cVar.f137653l.getType() != TopicGroup.Type.DEFAULT) {
            z = false;
        } else {
            z = true;
        }
        this.f137664G = z;
        this.f137700w = new ReplyService(this.f137687j, new ChatReplyDigestCreator());
        this.f137666I = cVar.f137655n;
        m216354N();
        m216353M();
        mo190330H();
        C55783e eVar = this.f137692o;
        if (eVar != null) {
            eVar.mo190307a();
        }
        C29990c.m110930b().mo134524W().mo134468a(this);
        this.f137670M.mo126648a(this.f137687j);
        if (!TextUtils.isEmpty(this.f137686i)) {
            ChatParamUtils.m133141a(this.f137686i);
        }
    }

    /* renamed from: c */
    public void mo190335c(List<MessageInfo> list) {
        boolean z;
        int readPos = this.f137679b.mo190288n().getReadPos();
        if (mo190109g() == null || !mo190109g().isSuper()) {
            z = false;
        } else {
            z = true;
        }
        this.f137680c.mo121100a(list, readPos, this.f137686i, z, (IGetDataCallback<C33960a>) null);
    }

    /* renamed from: d */
    public void mo190337d(List<MessageInfo> list) {
        C33103ae aeVar;
        if (this.f137698u.mo134683a() && (aeVar = this.f137661D) != null) {
            aeVar.batchUpdateTranslateState(new ArrayList(list));
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: b */
    public void mo190089b(int i) {
        Log.m165389i("ThreadDetailModel", "preLoadMessage: position:" + i);
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(i) {
            /* class com.ss.android.lark.threaddetail.$$Lambda$d$VE08rgmkh5RDqpkzE1uLqTvGEGw */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C55796d.lambda$VE08rgmkh5RDqpkzE1uLqTvGEGw(C55796d.this, this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: c */
    public void mo190103c(boolean z) {
        ThreadStateInfo.ThreadState threadState;
        if (this.f137679b.mo190290p() != null) {
            AbstractC34230k kVar = this.f137694q;
            String id = this.f137679b.mo190290p().getMessage().getId();
            if (z) {
                threadState = ThreadStateInfo.ThreadState.CLOSED;
            } else {
                threadState = ThreadStateInfo.ThreadState.OPEN;
            }
            kVar.mo121352a(id, threadState, new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass10 */

                /* renamed from: a */
                public void onSuccess(Void r1) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }
            });
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: b */
    public void mo190090b(final IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback) {
        this.f137690m.mo124051c(new C33963h(new PageLoader.AbstractC33950c() {
            /* class com.ss.android.lark.threaddetail.$$Lambda$d$dBNO3Dv2Oa5Tjp0EBDzFNnW90Q */

            @Override // com.ss.android.lark.chat.core.model.PageLoader.AbstractC33950c
            public final int getPosition() {
                return C55796d.m270998lambda$dBNO3Dv2Oa5Tjp0EBDzFNnW90Q(C55796d.this);
            }
        }, 15), new C55794f(this.f137679b, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<C55781c>() {
            /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass29 */

            /* renamed from: a */
            public void onSuccess(C55781c cVar) {
                C55796d.this.mo190331a(cVar);
                iGetDataCallback.onSuccess(C55796d.this.f137679b.mo127125l());
                if (C55796d.this.f137687j != null) {
                    PerfChatPerformanceMonitor.m213459a(C55796d.this.f137687j.getId(), C55796d.this.f137687j.getUserCount(), ChatBundle.ChatType.THREAD_DETAIL, null);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
                if (C55796d.this.f137687j != null) {
                    PerfChatPerformanceMonitor.m213459a(C55796d.this.f137687j.getId(), C55796d.this.f137687j.getUserCount(), ChatBundle.ChatType.THREAD_DETAIL, errorResult);
                }
            }
        })));
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m216362a(C55795c cVar, TopicGroup topicGroup) {
        cVar.f137653l = topicGroup;
        m216373d(cVar);
    }

    /* renamed from: b */
    private void m216370b(C55795c cVar, ThreadTopic threadTopic) {
        if (cVar.f137645d.getChatMode() == Chat.ChatMode.THREAD_V2) {
            C57865c.m224574a(new C57865c.AbstractC57873d(threadTopic) {
                /* class com.ss.android.lark.threaddetail.$$Lambda$d$NqYG4Cd0qvOr10M8qZWj8e6HKcM */
                public final /* synthetic */ ThreadTopic f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                public final Object produce() {
                    return C55796d.lambda$NqYG4Cd0qvOr10M8qZWj8e6HKcM(C55796d.this, this.f$1);
                }
            }, new C57865c.AbstractC57871b(cVar) {
                /* class com.ss.android.lark.threaddetail.$$Lambda$d$RtHwH8FCGj8CHX11qU1TCvauBf8 */
                public final /* synthetic */ C55795c f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
                public final void consume(Object obj) {
                    C55796d.lambda$RtHwH8FCGj8CHX11qU1TCvauBf8(C55796d.this, this.f$1, (TopicGroup) obj);
                }
            });
        } else {
            m216373d(cVar);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: c */
    public void mo190102c(String str, final String str2) {
        MessageInfo messageInfo = (MessageInfo) this.f137679b.mo127099a(str2);
        if (messageInfo != null && messageInfo.getMessage() != null) {
            C34332b.m133110a(messageInfo.getMessage(), false, (IGetDataCallback<String>) new IGetDataCallback<String>() {
                /* class com.ss.android.lark.threaddetail.C55796d.C558089 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    C55796d.this.mo190336d(str2, str);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C55796d.this.mo190336d(str2, null);
                }
            });
        }
    }

    /* renamed from: d */
    public void mo190336d(String str, final String str2) {
        this.f137679b.mo127105a(str, new AbstractC34432b.AbstractC34435c<AbstractC34006a>() {
            /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass14 */

            /* renamed from: a */
            public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                AudioContent audioContent = (AudioContent) aVar.getMessage().getContent();
                if (TextUtils.isEmpty(str2)) {
                    audioContent.setFileState(AudioContent.AudioState.DOWNLOAD);
                    Log.m165383e("", " prepare audio error");
                } else {
                    audioContent.setProgress(100);
                    audioContent.setFileState(AudioContent.AudioState.DONE);
                    audioContent.setLocalFilePath(str2);
                }
                return aVar;
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m216365a(Runnable runnable, ChatChatter chatChatter) {
        this.f137667J = chatChatter;
        runnable.run();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: b */
    public List<ImageSet> mo190088b(String str, boolean z) {
        List g = this.f137679b.mo127118g();
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(g)) {
            return arrayList;
        }
        C34352r.m133227a(str, z, g, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private void m216366a(boolean z, boolean z2) {
        if (z2) {
            if (z) {
                C29990c.m110930b().mo134577e().mo120958a(this.f137679b.mo122940b(), C53234a.m205877a());
            } else {
                C29990c.m110930b().mo134577e().mo120970d();
            }
        } else if (z) {
            C29990c.m110930b().mo134577e().mo120964b(this.f137679b.mo122940b());
        } else {
            C29990c.m110930b().mo134577e().mo120967c();
        }
        C29990c.m110930b().mo134577e().mo120976g();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m216361a(C55795c cVar, ThreadTopic threadTopic, Chat chat) {
        if (chat == null) {
            this.f137683f.mo190143d();
            Log.m165382e("chat == null");
            return;
        }
        cVar.f137645d = chat;
        cVar.f137644c = cVar.f137645d.getName();
        m216370b(cVar, threadTopic);
    }

    public C55796d(C33103ae aeVar, AbstractC55766a.AbstractC55767a.AbstractC55768a aVar, Context context) {
        AbstractC36474h b = C29990c.m110930b();
        this.f137684g = b;
        this.f137685h = b.mo134515N();
        this.f137696s = b.mo134513L();
        this.f137697t = b.mo134586n();
        this.f137661D = aeVar;
        this.f137683f = aVar;
        this.f137663F = context;
        m216352L();
    }

    /* renamed from: a */
    private void m216360a(int i, MessageFetchScene messageFetchScene, int i2, final IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback) {
        C29990c.m110930b().mo134577e().mo120958a(this.f137679b.mo122940b(), C53234a.m205877a());
        this.f137690m.mo124045a(new C33963h(i, i2, messageFetchScene, ChannelDataFetcherStrategy.SYNC_SERVER_DATA), new C55794f(this.f137679b, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<C55781c>() {
            /* class com.ss.android.lark.threaddetail.C55796d.AnonymousClass27 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C29990c.m110930b().mo134577e().mo120970d();
                iGetDataCallback.onError(errorResult);
                C55796d.this.f137679b.mo190280a(true);
            }

            /* renamed from: a */
            public void onSuccess(C55781c cVar) {
                C29990c.m110930b().mo134577e().mo120970d();
                C55796d.this.mo190331a(cVar);
                iGetDataCallback.onSuccess(C55796d.this.f137679b.mo127125l());
                C55796d.this.f137679b.mo190280a(true);
            }
        })));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0033, code lost:
        r2 = (com.ss.android.lark.chat.entity.message.content.AudioContent) r13.getContent();
     */
    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.lark.chat.entity.message.Message mo190053a(final com.ss.android.lark.chat.entity.message.Message r13, int r14, java.nio.ByteBuffer r15, boolean r16, boolean r17, final com.larksuite.framework.callback.IGetDataCallback r18) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.threaddetail.C55796d.mo190053a(com.ss.android.lark.chat.entity.message.Message, int, java.nio.ByteBuffer, boolean, boolean, com.larksuite.framework.callback.IGetDataCallback):com.ss.android.lark.chat.entity.message.Message");
    }
}
