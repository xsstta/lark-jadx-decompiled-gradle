package com.ss.android.lark.threadwindow;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lark.pb.im.v1.ToggleTextOnAudioResponse;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.C26134a;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26308n;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.biz.im.api.p1409b.C29609a;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.chatwindow.chat.model.C33411g;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33386b;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33395d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.C33958d;
import com.ss.android.lark.chat.core.model.C33963h;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.core.model.PageLoader;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.response.PushMyThreadReplyPromptResponse;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chat.service.AbstractC34124e;
import com.ss.android.lark.chat.service.AbstractC34296k;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.chat.service.impl.AbstractC34230k;
import com.ss.android.lark.chat.service.impl.C34218i;
import com.ss.android.lark.chat.service.impl.C34273t;
import com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.chat.service.p1678a.p1679a.C34118b;
import com.ss.android.lark.chat.utils.C34332b;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.dependency.AbstractC36504r;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.draft.Draft;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.dto.translate.C36874a;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.member_manage.export.p2253a.C44897b;
import com.ss.android.lark.p2392o.AbstractC48707q;
import com.ss.android.lark.statistics.chat.C54948d;
import com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor;
import com.ss.android.lark.threadtab.p2758b.AbstractC55978a;
import com.ss.android.lark.threadwindow.AbstractC56050c;
import com.ss.android.lark.threadwindow.p2760a.C56007a;
import com.ss.android.lark.threadwindow.p2760a.C56018b;
import com.ss.android.lark.threadwindow.p2760a.C56028c;
import com.ss.android.lark.threadwindow.p2760a.C56030d;
import com.ss.android.lark.threadwindow.p2760a.C56037e;
import com.ss.android.lark.threadwindow.p2760a.p2761a.AbstractC56008a;
import com.ss.android.lark.threadwindow.p2760a.p2761a.AbstractC56014g;
import com.ss.android.lark.threadwindow.p2760a.p2761a.C56015h;
import com.ss.android.lark.threadwindow.p2760a.p2762b.AbstractC56019a;
import com.ss.android.lark.threadwindow.p2760a.p2762b.C56020b;
import com.ss.android.lark.threadwindow.p2760a.p2762b.C56027e;
import com.ss.android.lark.threadwindow.p2760a.p2764d.C56032a;
import com.ss.android.lark.threadwindow.p2760a.p2764d.C56034c;
import com.ss.android.lark.threadwindow.p2760a.p2764d.C56035f;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.threadwindow.i */
public class C56101i extends AbstractC55978a implements AbstractC48707q, C56037e.AbstractC56048a, AbstractC56050c.AbstractC56051a {

    /* renamed from: A */
    private C56037e f138718A;

    /* renamed from: B */
    private C26134a<List<String>> f138719B;

    /* renamed from: C */
    private final AbstractC34124e f138720C;

    /* renamed from: D */
    private final AbstractC36504r f138721D;

    /* renamed from: E */
    private final AbstractC36503q f138722E;

    /* renamed from: F */
    private final AbstractC36502p f138723F;

    /* renamed from: G */
    private boolean f138724G;

    /* renamed from: H */
    private boolean f138725H;

    /* renamed from: I */
    private int f138726I;

    /* renamed from: J */
    private boolean f138727J;

    /* renamed from: K */
    private final C56015h.AbstractC56017a f138728K;

    /* renamed from: L */
    private final AbstractC36474h.C36492r f138729L;

    /* renamed from: M */
    private C56027e f138730M;

    /* renamed from: N */
    private C56030d f138731N;

    /* renamed from: O */
    private HashSet<String> f138732O;

    /* renamed from: P */
    private boolean f138733P;

    /* renamed from: Q */
    private final MonitorMessageSendCallback f138734Q;

    /* renamed from: g */
    public final C33958d f138735g;

    /* renamed from: h */
    public AbstractC56050c.AbstractC56051a.AbstractC56052a f138736h;

    /* renamed from: i */
    public Chat f138737i;

    /* renamed from: j */
    public final ChatChatter f138738j;

    /* renamed from: k */
    public final IInnerMessageService f138739k = C32848e.m126401b();

    /* renamed from: l */
    public final AbstractC34296k f138740l = C32821b.m126120a();

    /* renamed from: m */
    public final AbstractC36474h f138741m;

    /* renamed from: n */
    public final AbstractC36450aa f138742n;

    /* renamed from: o */
    public TopicGroup f138743o;

    /* renamed from: p */
    public boolean f138744p;

    /* renamed from: q */
    public C56015h f138745q;

    /* renamed from: r */
    public C56020b f138746r;

    /* renamed from: s */
    public boolean f138747s;

    /* renamed from: t */
    private final C33958d f138748t;

    /* renamed from: u */
    private final C56094g f138749u;

    /* renamed from: v */
    private final Context f138750v;

    /* renamed from: w */
    private final AbstractC33134w<AbstractC34006a> f138751w;

    /* renamed from: x */
    private boolean f138752x;

    /* renamed from: y */
    private String f138753y;

    /* renamed from: z */
    private RichText f138754z;

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: p */
    public void mo191154p() {
        this.f138727J = false;
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: q */
    public boolean mo191155q() {
        return true;
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: h */
    public Chat mo191146h() {
        return this.f138737i;
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: i */
    public String mo191147i() {
        return this.f138753y;
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: j */
    public RichText mo191148j() {
        return this.f138754z;
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: t */
    public boolean mo191158t() {
        return this.f138752x;
    }

    /* renamed from: a */
    public void mo191388a(AbstractC56050c.AbstractC56051a.AbstractC56052a aVar) {
        this.f138736h = aVar;
        m218584D();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public void mo191111a(final IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback, int i) {
        Log.m165389i("ThreadFirstScreenLoader", "loadFirstScreenData,pageSize = " + i);
        mo191394b(true);
        this.f138731N.mo127135a(i, new IGetDataCallback<AbstractC33964i<ThreadInfo>>() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass30 */

            /* renamed from: a */
            public void onSuccess(AbstractC33964i<ThreadInfo> iVar) {
                C56101i.this.mo191394b(false);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(iVar);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C56101i.this.mo191394b(false);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo191394b(boolean z) {
        if (z) {
            C29990c.m110930b().mo134577e().mo120964b(this.f138737i.getId());
        } else {
            C29990c.m110930b().mo134577e().mo120967c();
        }
        C29990c.m110930b().mo134577e().mo120976g();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public void mo191114a(String str, RichText richText, boolean z) {
        this.f138739k.mo121267b(((C29609a.C29610a) ((C29609a.C29610a) C29609a.m109497a().mo106692a(str).mo106691a(richText).mo125332j(this.f138737i.getId())).mo125329c(z)).mo106694a(), this.f138734Q);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: b */
    public void mo191128b(final String str, final boolean z) {
        ThreadInfo threadInfo = (ThreadInfo) this.f138745q.mo127099a(str);
        final Message c = threadInfo != null ? threadInfo.mo126021c() : null;
        if (c != null && c.getType() == Message.Type.AUDIO) {
            if (c.isSourceFileDelete()) {
                LKUIToast.show(C29990c.m110930b().mo134528a(), (int) R.string.Lark_Message_AudioMessageWithdrawMessageToast);
            } else {
                this.f138739k.mo121268b(str, z, new IGetDataCallback<ToggleTextOnAudioResponse>() {
                    /* class com.ss.android.lark.threadwindow.C56101i.C561052 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165379d("ThreadWindow2", "hide audio text fail:" + str);
                    }

                    /* renamed from: a */
                    public void onSuccess(ToggleTextOnAudioResponse toggleTextOnAudioResponse) {
                        String str;
                        AudioContent audioContent = (AudioContent) c.getContent();
                        if (z && TextUtils.isEmpty(audioContent.getRecognizedText())) {
                            String locale = C56101i.this.f138741m.mo134587o().mo134745d().toString();
                            if (!TextUtils.isEmpty(locale)) {
                                str = locale.toLowerCase();
                            } else {
                                str = "zh_ch";
                            }
                            C56101i.this.f138739k.mo121260a(str, str, 16000, "opus", new IGetDataCallback<Boolean>() {
                                /* class com.ss.android.lark.threadwindow.C56101i.C561052.C561061 */

                                /* renamed from: a */
                                public void onSuccess(Boolean bool) {
                                    Log.m165379d("ThreadWindow2", "sendAudioMessage2Text success：" + bool);
                                }

                                @Override // com.larksuite.framework.callback.IGetDataCallback
                                public void onError(ErrorResult errorResult) {
                                    String str;
                                    Log.m165379d("ThreadWindow2", "sendAudioMessage2Text error：" + errorResult.getErrorMsg());
                                    if (C56101i.this.f138736h != null) {
                                        AbstractC56050c.AbstractC56051a.AbstractC56052a aVar = C56101i.this.f138736h;
                                        if (errorResult.getErrorCode() != 5029) {
                                            str = errorResult.getErrorMsg();
                                        } else {
                                            str = UIUtils.getString(C56101i.this.f138741m.mo134528a(), R.string.Lark_Chat_AudioConvertToTextError);
                                        }
                                        aVar.mo191176b(str);
                                    }
                                }
                            });
                        }
                        C56101i.this.f138745q.mo127105a(str, new AbstractC34432b.AbstractC34435c<AbstractC34006a>() {
                            /* class com.ss.android.lark.threadwindow.C56101i.C561052.C561072 */

                            /* access modifiers changed from: protected */
                            /* renamed from: a */
                            public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                                ((AudioContent) aVar.getMessage().getContent()).setNeedHideText(!z);
                                return aVar;
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55981b
    /* renamed from: a */
    public void mo190810a(ThreadTopic threadTopic) {
        ThreadInfo threadInfo;
        if (threadTopic != null && (threadInfo = (ThreadInfo) this.f138745q.mo127099a(threadTopic.getId())) != null) {
            ThreadInfo threadInfo2 = new ThreadInfo(threadInfo);
            threadInfo2.mo126012a(threadTopic);
            this.f138745q.mo127119g(threadInfo2);
        }
    }

    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55981b
    /* renamed from: a */
    public void mo190811a(final String str, final boolean z, final int i) {
        this.f138334d.mo121353a(str, z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.threadwindow.C56101i.C561103 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C56101i.this.f138736h.mo191163a(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Void r4) {
                C56101i.this.mo190803a(str, new C56032a(z), i);
            }
        }));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55978a
    /* renamed from: a */
    public void mo190803a(String str, AbstractC34432b.AbstractC34434b<AbstractC34006a> bVar, int i) {
        if (i == 0) {
            this.f138745q.mo127105a(str, bVar);
            return;
        }
        AbstractC56008a c = this.f138746r.mo191055c(i);
        if (c != null) {
            c.mo127105a(str, bVar);
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public void mo191119a(List<String> list) {
        if (CollectionUtils.isEmpty(list)) {
            Log.m165383e("ThreadWindow2", "readThread, intervalIds is null");
        } else if (!this.f138747s) {
            Log.m165389i("ThreadWindow2", "missing msg not back, skip read");
            this.f138732O.addAll(list);
        } else if (this.f138733P) {
            HashSet<String> hashSet = new HashSet<>();
            hashSet.addAll(list);
            if (CollectionUtils.isNotEmpty(hashSet)) {
                Log.m165389i("ThreadWindow2", "threadIds not empty, try to read, chat:" + this.f138737i);
                mo191391a(hashSet);
            } else {
                Log.m165389i("ThreadWindow2", "threadIds is empty, skip read");
            }
            mo191396c(new ArrayList(hashSet), 0);
        } else {
            Log.m165389i("ThreadWindow2", "putThread to executor, currentChat:" + this.f138737i);
            this.f138719B.mo93035a(list);
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public boolean mo191121a(int i) {
        return this.f138745q.mo127117f() >= i && this.f138745q.mo127115e() <= i;
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public void mo191113a(String str, RichText richText) {
        this.f138753y = str;
        this.f138754z = richText;
        this.f138720C.mo126555a("", this.f138737i.getId(), this.f138737i, C59029c.m229155a(), str, richText, false);
    }

    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55981b
    /* renamed from: b */
    public void mo190813b(String str, final String str2, final int i) {
        ThreadInfo threadInfo;
        if (i == 0) {
            ThreadInfo threadInfo2 = (ThreadInfo) this.f138745q.mo127099a(str2);
            if (threadInfo2 != null && threadInfo2.mo126021c() != null) {
                C34332b.m133110a(threadInfo2.mo126021c(), false, (IGetDataCallback<String>) new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.threadwindow.C56101i.C561157 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        C56101i.this.mo191390a(str2, str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        C56101i.this.mo191390a(str2, (String) null);
                    }
                });
            }
        } else if (this.f138746r.mo191055c(i) != null && (threadInfo = (ThreadInfo) this.f138746r.mo191055c(i).mo127099a(str2)) != null && threadInfo.mo126021c() != null) {
            C34332b.m133110a(threadInfo.mo126021c(), false, (IGetDataCallback<String>) new IGetDataCallback<String>() {
                /* class com.ss.android.lark.threadwindow.C56101i.C561168 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    C56101i.this.mo191395c(str2, str, i);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C56101i.this.mo191395c(str2, null, i);
                }
            });
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: b */
    public void mo191127b(String str, final IGetDataCallback<Boolean> iGetDataCallback) {
        this.f138740l.mo121053d(str, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass11 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(bool);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public void mo191118a(String str, List<String> list, List<PickChatEntity> list2, final IGetDataCallback<Boolean> iGetDataCallback) {
        this.f138740l.mo121008a(str, list, list2, 2, new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass12 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(true);
                }
            }
        });
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public void mo191117a(String str, List<GroupRecallEntity> list, IGetDataCallback<List<GroupRecallEntity>> iGetDataCallback) {
        this.f138740l.mo121043b(list, str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55981b
    /* renamed from: b */
    public void mo190812b(String str) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(str) {
            /* class com.ss.android.lark.threadwindow.$$Lambda$i$CPfsau0vYHYCBAN6RqSnrkQ3e8 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C56101i.m271038lambda$CPfsau0vYHYCBAN6RqSnrkQ3e8(C56101i.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo191390a(String str, final String str2) {
        this.f138745q.mo127105a(str, new AbstractC34432b.AbstractC34435c<AbstractC34006a>() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass14 */

            /* access modifiers changed from: protected */
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

    /* renamed from: a */
    public void mo191391a(HashSet<String> hashSet) {
        List<ThreadInfo> a = this.f138745q.mo127100a((Collection<String>) new ArrayList(hashSet));
        if (CollectionUtils.isNotEmpty(a)) {
            Log.m165389i("ThreadWindow2", "readThreadInner, currentChat:" + this.f138737i);
            this.f138739k.mo121098a(a, this.f138737i.getReadThreadPosition(), this.f138737i.getReadThreadPositionBadgeCount(), false);
            return;
        }
        Log.m165389i("ThreadWindow2", "readThreadInner, threadInfoList is null, currentChat:" + this.f138737i);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: b */
    public boolean mo191129b(int i) {
        if (i == 0) {
            return false;
        }
        return ((AbstractC56019a) this.f138746r.mo191053b(i)).mo191049c();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: c */
    public boolean mo191135c(int i) {
        if (i == 0) {
            return false;
        }
        return ((AbstractC56019a) this.f138746r.mo191053b(i)).mo191050d();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public void mo191120a(final List<String> list, final int i) {
        Executor executor;
        if (!CollectionUtils.isEmpty(list)) {
            if (i == 0) {
                executor = this.f138748t;
            } else {
                executor = this.f138746r.mo191051a(i);
            }
            executor.execute(new Runnable() {
                /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass15 */

                public void run() {
                    C56101i.this.mo191396c(new ArrayList(list), i);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo191389a(String str, final FileState fileState, final String str2, final int i) {
        this.f138745q.mo127105a(str, new AbstractC34432b.AbstractC34435c<AbstractC34006a>() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass19 */

            /* access modifiers changed from: protected */
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

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public void mo191115a(String str, String str2, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback) {
        C29990c.m110930b().mo134503B().mo134613a(str, str2, sourceType, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public void mo191116a(String str, String str2, String str3, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback) {
        C29990c.m110930b().mo134503B().mo134614a(str, str2, str3, sourceType, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public void mo191112a(Sticker sticker, IGetDataCallback<Boolean> iGetDataCallback) {
        C29990c.m110930b().mo134502A().mo134385a(Collections.singletonList(sticker), iGetDataCallback);
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.C56037e.AbstractC56048a
    /* renamed from: a */
    public void mo191092a(Chat chat) {
        UICallbackExecutor.execute(new Runnable(chat) {
            /* class com.ss.android.lark.threadwindow.$$Lambda$i$_RJrVbgTcCm9ZwQcI7uU4Ppf_L8 */
            public final /* synthetic */ Chat f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C56101i.lambda$_RJrVbgTcCm9ZwQcI7uU4Ppf_L8(C56101i.this, this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.C56037e.AbstractC56048a
    /* renamed from: a */
    public void mo191093a(Chat chat, Map<String, Chatter> map) {
        if (chat != null && Objects.equals(chat.getId(), this.f138737i.getId()) && !CollectionUtils.isEmpty(map) && map.containsKey(this.f138742n.mo134394a())) {
            mo191092a(chat);
            if (this.f138725H || this.f138724G) {
                this.f138736h.mo191159a();
            } else {
                this.f138736h.mo191173b(R.string.Lark_Legacy_OutOfGroup);
            }
            this.f138721D.mo134688a(new Channel(Channel.Type.CHAT, this.f138737i.getId()));
            Log.m165389i("ThreadWindow2", "chat remove chatters QuitGroupBySelf: " + this.f138725H);
        }
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.C56037e.AbstractC56048a
    /* renamed from: c */
    public void mo191101c(boolean z) {
        this.f138724G = z;
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.C56037e.AbstractC56048a
    /* renamed from: a */
    public void mo191097a(C36874a aVar) {
        Log.m165389i("ThreadWindow2", "on push translate state");
        AbstractC33134w<AbstractC34006a> wVar = this.f138751w;
        if (wVar != null) {
            wVar.handlePushTranslateState(aVar, new AbstractC33134w.AbstractC33136b() {
                /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass23 */

                @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33136b
                /* renamed from: a */
                public void mo122326a(Map<String, TranslateState> map) {
                }

                @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33136b
                /* renamed from: a */
                public void mo122325a(TranslateState translateState) {
                    if (C56101i.this.f138736h != null) {
                        C56101i.this.f138736h.mo191169a(translateState);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.C56037e.AbstractC56048a
    /* renamed from: a */
    public void mo191098a(String str, List<String> list, Integer num, Map<String, Integer> map, Map<String, Integer> map2) {
        AbstractC56050c.AbstractC56051a.AbstractC56052a aVar;
        Log.m165389i("ThreadWindow2", "on push translate setting");
        AbstractC33134w<AbstractC34006a> wVar = this.f138751w;
        if (wVar != null && wVar.handlePushTranslateSettingV2(str, list, num, map, map2) && (aVar = this.f138736h) != null) {
            aVar.mo191183g();
        }
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.C56037e.AbstractC56048a
    /* renamed from: a */
    public void mo191096a(TopicGroup topicGroup) {
        Log.m165389i("ThreadWindow2", "push topicGroup: " + topicGroup);
        if (topicGroup != null) {
            this.f138743o = topicGroup;
            this.f138736h.mo191168a(topicGroup);
        }
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.C56037e.AbstractC56048a
    /* renamed from: a */
    public void mo191095a(PushMyThreadReplyPromptResponse pushMyThreadReplyPromptResponse) {
        this.f138736h.mo191185i();
    }

    @Override // com.ss.android.lark.p2392o.AbstractC48707q
    /* renamed from: a */
    public void mo123873a(boolean z) {
        this.f138736h.mo191171a(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ int m218586F() {
        return this.f138745q.mo127115e();
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ int m218587G() {
        return this.f138745q.mo127117f();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: c */
    public int mo191130c() {
        return this.f138749u.f138709b;
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: k */
    public boolean mo191149k() {
        return this.f138737i.isAllowPost();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: l */
    public boolean mo191150l() {
        return this.f138749u.f138713f;
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: r */
    public void mo191156r() {
        this.f138718A.mo191079a();
    }

    /* renamed from: A */
    private void m218581A() {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass28 */

            public void run() {
                if (C56101i.this.f138737i.isDissolved()) {
                    C56101i.this.f138736h.mo191178c(R.string.Lark_Legacy_HasBeenDissolved);
                    Log.m165389i("ThreadWindow2", "current chat is dissolved, chatId: " + C56101i.this.f138737i.getId());
                } else if (C56101i.this.f138737i.getRole().getNumber() != Chat.Role.MEMBER.getNumber()) {
                    if (C56101i.this.f138744p) {
                        if (C56101i.this.f138743o != null && C56101i.this.f138743o.getUserSetting() != null && C56101i.this.f138743o.getUserSetting().getTopicGroupRole() == TopicGroup.TopicGroupRole.UNAUTHORIZED_USER) {
                            C56101i.this.f138736h.mo191173b(R.string.Lark_Legacy_OutOfGroup);
                            Log.m165389i("ThreadWindow2", "No member or observer in chat, chatId: " + C56101i.this.f138737i.getId());
                        }
                    } else if (C56101i.this.f138737i.getRole().getNumber() != Chat.Role.MEMBER.getNumber()) {
                        C56101i.this.f138736h.mo191173b(R.string.Lark_Legacy_OutOfGroup);
                        Log.m165389i("ThreadWindow2", "you are no in chat, chatId: " + C56101i.this.f138737i.getId());
                    }
                }
            }
        });
    }

    /* renamed from: y */
    private void m218599y() {
        this.f138735g.execute(new Runnable() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass27 */

            public void run() {
                Chat chat = C56101i.this.f138740l.mo121046c(new ArrayList(Collections.singleton(C56101i.this.f138737i.getId()))).get(C56101i.this.f138737i.getId());
                if (chat != null) {
                    C56101i.this.f138737i = chat;
                    C56101i.this.f138736h.mo191175b(chat);
                }
            }
        });
    }

    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55978a, com.ss.android.lark.threadtab.p2758b.AbstractC55981b
    /* renamed from: a */
    public String mo190801a() {
        ChatChatter chatChatter = this.f138738j;
        if (chatChatter != null) {
            return chatChatter.getId();
        }
        return "";
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: e */
    public boolean mo191143e() {
        if (this.f138745q.mo127115e() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: f */
    public int mo191144f() {
        return this.f138745q.mo122940b();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: s */
    public boolean mo191157s() {
        AbstractC36474h.C36492r rVar = this.f138729L;
        if (rVar == null || !rVar.f94028b) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    private void m218582B() {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.threadwindow.$$Lambda$i$l0R19COrv2VNd5B0HPeo3THvqrE */

            public final void run() {
                C56101i.lambda$l0R19COrv2VNd5B0HPeo3THvqrE(C56101i.this);
            }
        });
    }

    /* renamed from: C */
    private void m218583C() {
        C26134a<List<String>> aVar = new C26134a<>(500, CoreThreadPool.getDefault().getScheduleThreadPool());
        this.f138719B = aVar;
        aVar.mo93034a(new C26134a.AbstractC26136a<List<String>>() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass29 */

            @Override // com.larksuite.framework.thread.C26134a.AbstractC26136a
            public void onExecute(List<List<String>> list) {
                HashSet<String> hashSet = new HashSet<>();
                for (List<String> list2 : list) {
                    hashSet.addAll(list2);
                }
                if (CollectionUtils.isNotEmpty(hashSet)) {
                    Log.m165389i("ThreadWindow2", "threadIds not empty, try to read, chat:" + C56101i.this.f138737i);
                    C56101i.this.mo191391a(hashSet);
                } else {
                    Log.m165389i("ThreadWindow2", "threadIds is empty, skip read");
                }
                C56101i.this.mo191396c(new ArrayList(hashSet), 0);
            }
        });
    }

    /* renamed from: E */
    private void m218585E() {
        if (!this.f138747s) {
            Log.m165389i("ThreadWindow2", "finish before missing msg back, read thread");
            mo191391a(this.f138732O);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m218589I() {
        mo191092a(C32821b.m126120a().mo121032b(this.f138737i.getId()));
    }

    /* renamed from: v */
    private void m218596v() {
        this.f138751w.setInitData(this.f138737i.getId(), new AbstractC33134w.AbstractC33135a() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass20 */

            @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33135a
            /* renamed from: b */
            public void mo122324b(Collection<AbstractC34006a> collection) {
                mo122323a(collection);
            }

            /* renamed from: a */
            private ThreadInfo m218711a(String str) {
                List<AbstractC34006a> a = mo122322a(Collections.singletonList(str), 0);
                if (!CollectionUtils.isEmpty(a)) {
                    return (ThreadInfo) a.get(0);
                }
                return null;
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33135a
            /* renamed from: a */
            public void mo122323a(Collection<AbstractC34006a> collection) {
                ThreadInfo a;
                List<MessageInfo> e;
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                for (AbstractC34006a aVar : collection) {
                    if (aVar instanceof ThreadInfo) {
                        hashMap2.put(aVar.getId(), aVar);
                    } else if (aVar instanceof MessageInfo) {
                        String parentId = aVar.getParentId();
                        Map map = (Map) hashMap.get(parentId);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(parentId, map);
                        }
                        map.put(aVar.getId(), aVar);
                    }
                }
                HashMap hashMap3 = new HashMap();
                if (!CollectionUtils.isEmpty(hashMap)) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (!(entry == null || (a = m218711a((String) entry.getKey())) == null || (e = a.mo126023e()) == null)) {
                            for (MessageInfo messageInfo : e) {
                                AbstractC34006a aVar2 = (AbstractC34006a) ((Map) entry.getValue()).get(messageInfo.getId());
                                if (aVar2 != null) {
                                    messageInfo.setMessage(aVar2.getMessage());
                                    messageInfo.setTranslateInfo(aVar2.getTranslateInfo());
                                    messageInfo.setIsTranslating(aVar2.isTranslating());
                                    messageInfo.setNeedToAutoTranslate(aVar2.isNeedToAutoTranslate());
                                }
                            }
                            hashMap3.put(a.getId(), a);
                        }
                    }
                }
                if (!CollectionUtils.isEmpty(hashMap2)) {
                    for (Map.Entry entry2 : hashMap2.entrySet()) {
                        AbstractC34006a aVar3 = (AbstractC34006a) hashMap3.get(entry2.getKey());
                        if (aVar3 == null) {
                            aVar3 = m218711a((String) entry2.getKey());
                        }
                        AbstractC34006a aVar4 = (AbstractC34006a) entry2.getValue();
                        if (!(aVar4 == null || aVar3 == null)) {
                            aVar3.setMessage(aVar4.getMessage());
                            aVar3.setTranslateInfo(aVar4.getTranslateInfo());
                            aVar3.setIsTranslating(aVar4.isTranslating());
                            aVar3.setNeedToAutoTranslate(aVar4.isNeedToAutoTranslate());
                            hashMap3.put(aVar3.getId(), aVar3);
                        }
                    }
                }
                if (!CollectionUtils.isEmpty(hashMap3)) {
                    List<AbstractC34417b.AbstractC34426h<String, AbstractC34006a>> b = C33386b.m129361b(hashMap3.values());
                    C56101i.this.f138745q.mo127110b(b);
                    if (C56101i.this.mo191155q()) {
                        for (AbstractC56008a aVar5 : C56101i.this.f138746r.mo191054b().values()) {
                            aVar5.mo127110b(b);
                        }
                    }
                }
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33135a
            /* renamed from: a */
            public List<AbstractC34006a> mo122322a(Collection<String> collection, int i) {
                List<ThreadInfo> list;
                if (i == 0) {
                    list = C56101i.this.mo191392b(new ArrayList(collection));
                } else {
                    list = C56101i.this.mo191393b(new ArrayList(collection), i);
                }
                return new ArrayList(list);
            }
        });
    }

    /* renamed from: w */
    private void m218597w() {
        if (mo191155q()) {
            C56020b bVar = new C56020b(this.f138737i, this.f138738j, this.f138728K, this.f138750v);
            this.f138746r = bVar;
            bVar.mo191052a();
        }
    }

    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55978a, com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m218581A();
        m218600z();
        m218583C();
        m218582B();
        m218599y();
    }

    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55978a, com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f138718A.mo191090b();
        C33958d dVar = this.f138748t;
        if (dVar != null) {
            dVar.mo124077c();
        }
        C33958d dVar2 = this.f138735g;
        if (dVar2 != null) {
            dVar2.mo124077c();
        }
        this.f138746r.mo191057d();
        m218585E();
        super.destroy();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: g */
    public boolean mo191145g() {
        if (!this.f138745q.mo127122i() || this.f138737i.getLastThreadPosition() <= this.f138745q.mo127117f()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: n */
    public boolean mo191152n() {
        if (!this.f138737i.isOnlyOwnerEditGroupInfo() || this.f138737i.getOwnerId().equals(this.f138742n.mo134394a())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m218588H() {
        String str;
        RichText richText;
        Draft c = this.f138720C.mo126557c(this.f138737i.getPostDraftId());
        if (c == null) {
            str = "";
        } else {
            str = c.title;
        }
        this.f138753y = str;
        if (c == null) {
            richText = C59029c.m229155a();
        } else {
            richText = c.postRichText;
        }
        this.f138754z = richText;
    }

    /* renamed from: u */
    private void m218595u() {
        String str;
        String id = this.f138737i.getId();
        TopicGroup topicGroup = this.f138743o;
        if (topicGroup != null) {
            str = topicGroup.getId();
        } else {
            str = this.f138737i.getId();
        }
        this.f138718A = new C56037e(id, str, this.f138745q, this.f138748t, this.f138746r.mo191056c(), this, mo191155q());
    }

    /* renamed from: x */
    private void m218598x() {
        this.f138745q = new C56015h(this.f138748t, new AbstractC34417b.AbstractC34423e() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass25 */

            @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34423e
            /* renamed from: a */
            public void mo123491a(List list) {
            }

            @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34423e
            /* renamed from: a */
            public void mo123490a() {
                C56101i.this.f138735g.execute(new Runnable() {
                    /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass25.RunnableC561081 */

                    public void run() {
                        Log.m165389i("ThreadWindow2", "push init datastore, load pre page");
                        C56101i.this.mo191125b(new UIGetDataCallback(new IGetDataCallback<AbstractC33964i<ThreadInfo>>() {
                            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass25.RunnableC561081.C561091 */

                            /* renamed from: a */
                            public void onSuccess(AbstractC33964i<ThreadInfo> iVar) {
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                            }
                        }));
                    }
                });
            }
        }, this.f138728K, this.f138750v);
        C56027e eVar = new C56027e(this.f138737i.getId(), this.f138748t);
        this.f138730M = eVar;
        C56030d dVar = new C56030d(eVar, this.f138745q, this.f138735g, this.f138748t, getCallbackManager(), this.f138737i);
        this.f138731N = dVar;
        dVar.mo191069a(new C56030d.AbstractC56031a() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass26 */

            @Override // com.ss.android.lark.threadwindow.p2760a.C56030d.AbstractC56031a
            /* renamed from: a */
            public void mo191070a() {
                Log.m165389i("ThreadWindow2", "onMissingDataReturned, recover read msg");
                C56101i.this.f138747s = true;
                C56101i.this.f138736h.mo191172b();
            }

            @Override // com.ss.android.lark.threadwindow.p2760a.C56030d.AbstractC56031a
            /* renamed from: a */
            public void mo191071a(boolean z) {
                if (z) {
                    Log.m165389i("ThreadWindow2", "hasMissing msg, skip read msg");
                    C56101i.this.f138747s = false;
                }
            }
        });
    }

    /* renamed from: z */
    private void m218600z() {
        if (mo191155q()) {
            for (Map.Entry<Integer, AbstractC56008a> entry : this.f138746r.mo191054b().entrySet()) {
                AbstractC56050c.AbstractC56051a.AbstractC56052a aVar = this.f138736h;
                if (aVar != null) {
                    aVar.mo191161a(entry.getKey().intValue(), entry.getValue().mo127125l());
                }
            }
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: m */
    public void mo191151m() {
        long j;
        AbstractC34230k kVar = this.f138334d;
        String id = this.f138737i.getId();
        if (this.f138737i.getChatAnnouncement() != null) {
            j = this.f138737i.getChatAnnouncement().getUpdateTime();
        } else {
            j = 0;
        }
        kVar.mo121351a(id, j);
    }

    /* renamed from: D */
    private void m218584D() {
        Log.m165389i("ThreadWindow2", "init newMessagePosition, current readPositionBadgeCount is:" + this.f138737i.getReadThreadPositionBadgeCount());
        this.f138745q.mo191034b(this.f138737i.getReadThreadPositionBadgeCount() + 1);
        this.f138745q.mo127101a(this.f138737i.getLastVisibleThreadPosition());
        this.f138745q.mo191035b(this.f138738j.getId());
        AbstractC56050c.AbstractC56051a.AbstractC56052a aVar = this.f138736h;
        if (aVar != null) {
            aVar.mo191164a(this.f138745q.mo127125l());
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: b */
    public void mo191122b() {
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable() {
            /* class com.ss.android.lark.threadwindow.$$Lambda$i$65llQmgjH86N0Y3YytWBpujH1NQ */

            public final void run() {
                C56101i.lambda$65llQmgjH86N0Y3YytWBpujH1NQ(C56101i.this);
            }
        });
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: o */
    public void mo191153o() {
        this.f138727J = true;
        this.f138726I = this.f138737i.getLastThreadPositionBadgeCount() - this.f138737i.getReadThreadPositionBadgeCount();
        Log.m165389i("ThreadWindow2", "startNewThreadMonitor:mUnreadCount=" + this.f138726I + ";lastThreadPositionBadgeCount=" + this.f138737i.getLastThreadPositionBadgeCount() + ";readThreadPositionBadgeCount=" + this.f138737i.getReadThreadPositionBadgeCount());
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: d */
    public boolean mo191140d() {
        int f = this.f138745q.mo127117f();
        if (f < 0 || f >= this.f138737i.getLastVisibleThreadPosition()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.C56037e.AbstractC56048a
    /* renamed from: d */
    public void mo191102d(boolean z) {
        this.f138725H = z;
    }

    /* renamed from: f */
    private IGetDataCallback<AbstractC33964i<ThreadInfo>> m218593f(final IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback) {
        return new IGetDataCallback<AbstractC33964i<ThreadInfo>>() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass24 */

            /* renamed from: a */
            public void onSuccess(AbstractC33964i<ThreadInfo> iVar) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(iVar);
                }
                if (C56101i.this.f138737i != null) {
                    PerfChatPerformanceMonitor.m213459a(C56101i.this.f138737i.getId(), C56101i.this.f138737i.getUserCount(), ChatBundle.ChatType.THREAD, null);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                if (C56101i.this.f138737i != null) {
                    PerfChatPerformanceMonitor.m213459a(C56101i.this.f138737i.getId(), C56101i.this.f138737i.getUserCount(), ChatBundle.ChatType.THREAD, errorResult);
                }
            }
        };
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.C56037e.AbstractC56048a
    /* renamed from: a */
    public void mo191094a(MessageInfo messageInfo) {
        this.f138736h.mo191166a(messageInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m218594g(int i) {
        AbstractC56008a c = this.f138746r.mo191055c(i);
        if (c instanceof AbstractC56014g) {
            c.mo191026n();
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: d */
    public void mo191138d(final IGetDataCallback<Boolean> iGetDataCallback) {
        C57865c.m224574a(new C57865c.AbstractC57873d<Boolean>() {
            /* class com.ss.android.lark.threadwindow.C56101i.C561135 */

            /* renamed from: a */
            public Boolean produce() {
                if (!C56101i.this.f138742n.mo134402e() && C56101i.this.f138737i.isCrossTenant()) {
                    return Boolean.valueOf(C56101i.this.f138737i.isHasWatermark());
                }
                return false;
            }
        }, new C57865c.AbstractC57871b<Boolean>() {
            /* class com.ss.android.lark.threadwindow.C56101i.C561146 */

            /* renamed from: a */
            public void consume(Boolean bool) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(bool);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m218592d(final String str) {
        this.f138739k.mo121111d(str);
        this.f138745q.mo127102a(new AbstractC34417b.AbstractC34421c<String>() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass13 */

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

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: c */
    public void mo191133c(IGetDataCallback<Boolean> iGetDataCallback) {
        this.f138740l.mo121063f(this.f138737i.getId(), false, (IGetDataCallback<Boolean>) getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: e */
    public void mo191141e(int i) {
        C56015h hVar;
        if (i != 0 || (hVar = this.f138745q) == null) {
            C56020b bVar = this.f138746r;
            if (bVar != null && bVar.mo191055c(i) != null) {
                this.f138746r.mo191055c(i).mo191019a(true);
                return;
            }
            return;
        }
        hVar.mo191033a(true);
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.C56037e.AbstractC56048a
    /* renamed from: f */
    public void mo191103f(int i) {
        this.f138736h.mo191160a(i);
    }

    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55981b
    /* renamed from: a */
    public ThreadInfo mo190809a(String str) {
        ThreadInfo threadInfo;
        ThreadInfo a = mo190800a(str, 0);
        if (a != null) {
            return a;
        }
        for (AbstractC56008a aVar : this.f138746r.mo191054b().values()) {
            if (!(aVar == null || (threadInfo = (ThreadInfo) aVar.mo127099a(str)) == null)) {
                return threadInfo;
            }
        }
        return null;
    }

    /* renamed from: b */
    public List<ThreadInfo> mo191392b(List<String> list) {
        List<ThreadInfo> b = mo191393b(list, 0);
        if (!CollectionUtils.isEmpty(b)) {
            return b;
        }
        for (AbstractC56008a aVar : this.f138746r.mo191054b().values()) {
            if (aVar != null) {
                List<ThreadInfo> a = aVar.mo127100a((Collection<String>) list);
                if (!CollectionUtils.isEmpty(a)) {
                    return a;
                }
            }
        }
        return new ArrayList();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: d */
    public void mo191136d(int i) {
        if (i != 0 && this.f138746r.mo191055c(i) != null) {
            this.f138746r.mo191051a(i).execute(new Runnable(i) {
                /* class com.ss.android.lark.threadwindow.$$Lambda$i$L7CrjblgeNsFzLUnOgWFKbXCtfc */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C56101i.lambda$L7CrjblgeNsFzLUnOgWFKbXCtfc(C56101i.this, this.f$1);
                }
            });
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: e */
    public void mo191142e(final IGetDataCallback<List<MessageInfo>> iGetDataCallback) {
        this.f138739k.mo121093a(this.f138737i.getId(), (String) null, true, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<List<MessageInfo>>() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass22 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(List<MessageInfo> list) {
                ArrayList arrayList = new ArrayList();
                for (MessageInfo messageInfo : list) {
                    if (messageInfo.getMessage() != null && messageInfo.getMessage().getPosition() > C56101i.this.f138737i.getReadThreadPosition()) {
                        arrayList.add(messageInfo);
                    }
                }
                iGetDataCallback.onSuccess(arrayList);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m218591c(Chat chat) {
        Log.m165389i("ThreadWindow2", "push chat: " + chat);
        if (chat != null) {
            Chat chat2 = this.f138737i;
            this.f138737i = chat;
            if (!(chat2 == null || chat == null || chat2.isAutoTranslate() == chat.isAutoTranslate())) {
                AbstractC33134w<AbstractC34006a> wVar = this.f138751w;
                if (wVar != null) {
                    wVar.clearCache();
                }
                AbstractC56050c.AbstractC56051a.AbstractC56052a aVar = this.f138736h;
                if (aVar != null) {
                    aVar.mo191183g();
                }
            }
            this.f138736h.mo191165a(chat);
            if (chat.isDissolved()) {
                if (!this.f138724G) {
                    this.f138736h.mo191170a(UIHelper.getString(R.string.Lark_Legacy_HasBeenDissolved));
                } else {
                    this.f138736h.mo191159a();
                }
                this.f138721D.mo134688a(new Channel(Channel.Type.CHAT, this.f138737i.getId()));
            }
            if (this.f138727J && mo191155q()) {
                int lastThreadPositionBadgeCount = this.f138737i.getLastThreadPositionBadgeCount() - this.f138737i.getReadThreadPositionBadgeCount();
                Log.m165389i("ThreadWindow2", "onPushChat:lastThreadPositionBadgeCount=" + this.f138737i.getLastThreadPositionBadgeCount() + ";readThreadPositionBadgeCount=" + this.f138737i.getReadThreadPositionBadgeCount());
                if (this.f138726I < lastThreadPositionBadgeCount) {
                    this.f138736h.mo191180d();
                    Log.m165389i("ThreadWindow2", "onNewUnreadThread:mUnreadCount=" + this.f138726I + ";currentUnReadCount=" + lastThreadPositionBadgeCount);
                    return;
                }
                this.f138736h.mo191181e();
                Log.m165389i("ThreadWindow2", "onUnreadThreadDisappear:mUnreadCount=" + this.f138726I + ";currentUnReadCount=" + lastThreadPositionBadgeCount);
            }
        }
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.C56037e.AbstractC56048a
    /* renamed from: c */
    public void mo191099c(String str) {
        Log.m165389i("ThreadWindow2", "onAnnouncementChanged:" + str);
        if (!TextUtils.isEmpty(str)) {
            mo191114a(UIHelper.getString(R.string.Lark_Legacy_Announcement), C59029c.m229161b(str), false);
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public void mo191110a(IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback) {
        this.f138730M.mo124049b(new C33963h(new PageLoader.AbstractC33950c() {
            /* class com.ss.android.lark.threadwindow.$$Lambda$i$v4wzXlhpuNWVvkqwvd2JW5pwdBE */

            @Override // com.ss.android.lark.chat.core.model.PageLoader.AbstractC33950c
            public final int getPosition() {
                return C56101i.lambda$v4wzXlhpuNWVvkqwvd2JW5pwdBE(C56101i.this);
            }
        }, 15), new C56018b(this.f138745q, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(m218593f(iGetDataCallback))));
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: b */
    public void mo191125b(IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback) {
        this.f138730M.mo124051c(new C33963h(new PageLoader.AbstractC33950c() {
            /* class com.ss.android.lark.threadwindow.$$Lambda$i$RdO2JmwIZxocK9FlNla4EebEXJk */

            @Override // com.ss.android.lark.chat.core.model.PageLoader.AbstractC33950c
            public final int getPosition() {
                return C56101i.lambda$RdO2JmwIZxocK9FlNla4EebEXJk(C56101i.this);
            }
        }, 15), new C56018b(this.f138745q, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(m218593f(iGetDataCallback))));
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: b */
    public void mo191126b(String str, final int i) {
        this.f138745q.mo127105a(str, new AbstractC34432b.AbstractC34435c<AbstractC34006a>() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass21 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                if (aVar.getMessage().getType() == Message.Type.FILE) {
                    ((FileContent) aVar.getMessage().getContent()).setSaveToDrive(i);
                }
                return aVar;
            }
        });
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.C56037e.AbstractC56048a
    /* renamed from: c */
    public void mo191100c(String str, int i) {
        mo191126b(str, i);
    }

    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55978a, com.ss.android.lark.threadtab.p2758b.AbstractC55981b
    /* renamed from: a */
    public ThreadInfo mo190800a(String str, int i) {
        if (i == 0) {
            return (ThreadInfo) this.f138745q.mo127099a(str);
        }
        AbstractC56008a c = this.f138746r.mo191055c(i);
        if (c != null) {
            return (ThreadInfo) c.mo127099a(str);
        }
        return null;
    }

    /* renamed from: b */
    public List<ThreadInfo> mo191393b(List<String> list, int i) {
        if (i == 0) {
            return this.f138745q.mo127100a((Collection<String>) list);
        }
        AbstractC56008a c = this.f138746r.mo191055c(i);
        if (c != null) {
            return c.mo127100a((Collection<String>) list);
        }
        return new ArrayList();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: c */
    public void mo191131c(int i, IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback) {
        if (i != 0) {
            this.f138746r.mo191053b(i).mo124049b(new C56028c(0, 15, MessageFetchScene.NEXT_PAGE, this.f138737i.getId(), Integer.toString(i)), new C56018b(this.f138746r.mo191055c(i), m218593f(iGetDataCallback)));
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public void mo191106a(int i, IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback) {
        this.f138730M.mo124045a(new C33963h(i, 15, MessageFetchScene.SPECIFIED_POSITION), new C33411g(this.f138745q, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback)));
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: c */
    public void mo191132c(Context context, final String str) {
        ThreadInfo threadInfo = (ThreadInfo) this.f138745q.mo127099a(str);
        if (threadInfo != null && threadInfo.getMessage().getType() == Message.Type.FILE) {
            Message message = threadInfo.getMessage();
            C29990c.m110930b().mo134591s().mo134680a(str, ((FileContent) threadInfo.getMessage().getContent()).getKey(), message.getSourceId(), message.getSourceType().getNumber(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass18 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    C56101i.this.mo191389a(str, FileState.DOWNLOAD, (String) null, 0);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("ThreadWindow2", "cancel download failed:" + errorResult);
                }
            }));
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: d */
    public void mo191137d(int i, IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback) {
        if (i != 0) {
            this.f138746r.mo191053b(i).mo124051c(new C56028c(0, 15, MessageFetchScene.PREVIOUS_PAGE, this.f138737i.getId(), Integer.toString(i)), new C56018b(this.f138746r.mo191055c(i), m218593f(iGetDataCallback)));
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public void mo191107a(Context context, AbstractC44896a aVar) {
        C29990c.m110930b().mo134521T().mo134715a(context, this.f138737i.getId(), Collections.singletonList(this.f138742n.mo134394a()), 4, (AbstractC44896a) getCallbackManager().wrapAndAddCallback(new C44897b(aVar)));
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: d */
    public void mo191139d(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
        this.f138740l.mo121020a(str, (String) null, true, (IGetDataCallback<ChatChatterResponse>) getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback), 0);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public void mo191108a(final Context context, final String str) {
        ThreadInfo threadInfo = (ThreadInfo) this.f138745q.mo127099a(str);
        if (threadInfo != null) {
            C34273t.m132944b(threadInfo.mo126021c(), getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.threadwindow.C56101i.C561114 */

                /* renamed from: a */
                public void onSuccess(String str) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(final ErrorResult errorResult) {
                    CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable() {
                        /* class com.ss.android.lark.threadwindow.C56101i.C561114.RunnableC561121 */

                        public void run() {
                            AuthorizateUtils.m217841a(context, errorResult);
                            C56101i.this.mo190803a(str, new C56035f(SendStatus.FAIL), 0);
                        }
                    }, 500, TimeUnit.MILLISECONDS);
                }
            }));
            mo190803a(str, new C56035f(SendStatus.SENDING), 0);
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: b */
    public void mo191123b(int i, IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback) {
        C56028c cVar = new C56028c(0, 15, MessageFetchScene.FIRST_SCREEN, this.f138737i.getId(), Integer.toString(i));
        if (iGetDataCallback != null) {
            this.f138746r.mo191053b(i).mo124045a(cVar, new C33411g(this.f138746r.mo191055c(i), iGetDataCallback));
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: c */
    public void mo191134c(String str, IGetDataCallback<String> iGetDataCallback) {
        ConvertOfficeToSpaceService.f88310h.mo126548a().mo126547a(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: b */
    public void mo191124b(final Context context, final String str) {
        ThreadInfo threadInfo = (ThreadInfo) this.f138745q.mo127099a(str);
        if (threadInfo != null && threadInfo.getMessage().getType() == Message.Type.FILE) {
            Message message = threadInfo.getMessage();
            FileContent fileContent = (FileContent) threadInfo.getMessage().getContent();
            mo191389a(str, FileState.DOWNLOADING, (String) null, 0);
            C29990c.m110930b().mo134591s().mo134677a(context, str, message.getSourceId(), this.f138737i.getId(), message.getSourceType().getNumber(), fileContent.getKey(), C26308n.m95252a(context, C57881t.m224652x(context), fileContent.getName()), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass16 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i("ThreadWindow2", "onError:" + errorResult);
                    if (errorResult.getErrorCode() == 5601) {
                        C56101i.this.f138736h.mo191162a(context, false);
                    } else if (errorResult.getErrorCode() == 5602) {
                        C56101i.this.f138736h.mo191162a(context, true);
                    }
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    if (TextUtils.isEmpty(str)) {
                        Log.m165389i("ThreadWindow2", "download success, filePath is empty");
                        C56101i.this.mo191389a(str, FileState.DOWNLOAD, (String) null, 0);
                    } else if (new File(str).exists()) {
                        Log.m165389i("ThreadWindow2", "download success, filePath is:" + str);
                        C56101i.this.mo191389a(str, FileState.DONE, str, 100);
                    }
                }
            }), new AbstractC25974h() {
                /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass17 */

                @Override // com.larksuite.framework.callback.AbstractC25974h
                public void onUpdateProgress(long j, int i) {
                    if (j > 0) {
                        C56101i.this.mo191389a(str, (FileState) null, (String) null, (int) ((((long) i) * 100) / j));
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public void mo191396c(List<String> list, int i) {
        AbstractC33134w<AbstractC34006a> wVar;
        if (this.f138723F.mo134683a()) {
            List<ThreadInfo> b = mo191393b(new ArrayList(list), i);
            if (!CollectionUtils.isEmpty(b) && (wVar = this.f138751w) != null) {
                wVar.batchUpdateTranslateState(new ArrayList(b));
            }
        }
    }

    public C56101i(C56094g gVar, AbstractC33134w<AbstractC34006a> wVar, Context context) {
        AbstractC36474h b = C29990c.m110930b();
        this.f138741m = b;
        this.f138742n = b.mo134515N();
        this.f138720C = C34218i.m132791a();
        this.f138721D = b.mo134512K();
        AbstractC36503q n = b.mo134586n();
        this.f138722E = n;
        this.f138723F = C29990c.m110930b().af();
        boolean z = false;
        this.f138724G = false;
        this.f138747s = true;
        this.f138732O = new HashSet<>();
        this.f138733P = C29990c.m110930b().mo134586n().mo134685a("feature.lark.thread.window.detector");
        C561021 r4 = new MonitorMessageSendCallback() {
            /* class com.ss.android.lark.threadwindow.C56101i.C561021 */

            /* renamed from: b */
            private boolean m218685b(MessageInfo messageInfo) {
                if (messageInfo.getMessageSender() == null) {
                    return false;
                }
                return messageInfo.getMessageSender().isAnonymous();
            }

            @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
            /* renamed from: a */
            public void mo121288a(C34118b bVar) {
                super.mo121288a(bVar);
                Log.m165389i("ThreadWindow2", "sendNewTopic success, message id is:" + bVar.f88301b);
            }

            @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
            /* renamed from: a */
            public void mo123034a(MessageInfo messageInfo) {
                super.mo123034a(messageInfo);
                Log.m165389i("ThreadWindow2", "onPreSend, cId is:" + messageInfo.getMessage().getcId());
                ThreadInfo a = m218684a(messageInfo, C56101i.this.mo191146h());
                C54948d.m213136a(a.getMessage());
                C56101i.this.f138745q.mo127119g(a);
                C56101i.this.f138736h.mo191167a(a);
            }

            @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
            /* renamed from: a */
            public void mo121287a(ErrorResult errorResult, Message message) {
                super.mo121287a(errorResult, message);
                Log.m165389i("ThreadWindow2", "sendNewTopic success, message id is:" + message.getId());
                C56101i.this.f138745q.mo127102a(new C56007a(message), new C56034c(message));
                if (errorResult.getErrorCode() == 4042 && C56101i.this.f138736h != null) {
                    C56101i.this.f138736h.mo191177c();
                } else if (errorResult.getErrorCode() == 321000) {
                    C56101i.this.f138736h.mo191179c(errorResult);
                } else {
                    C56101i.this.f138736h.mo191174b(errorResult);
                }
            }

            /* renamed from: a */
            private ThreadInfo m218684a(MessageInfo messageInfo, Chat chat) {
                ThreadInfo threadInfo;
                Message message = messageInfo.getMessage();
                ThreadTopic threadTopic = new ThreadTopic();
                threadTopic.setId(message.getcId());
                if (m218685b(messageInfo)) {
                    threadTopic.setOwnerId(messageInfo.getMessage().getFromId());
                } else {
                    threadTopic.setOwnerId(C56101i.this.f138738j.getId());
                }
                threadTopic.setPosition(C56101i.this.f138737i.getLastThreadPosition());
                if (messageInfo.getMessage().getType() == Message.Type.POST) {
                    threadTopic.setTopic(((PostContent) messageInfo.getMessage().getContent()).getTitleWithFilter(C29990c.m110930b().mo134528a()));
                }
                if (m218685b(messageInfo)) {
                    threadInfo = new ThreadInfo(messageInfo.getMessageSender(), threadTopic, messageInfo.getMessage());
                } else {
                    threadInfo = new ThreadInfo(C56101i.this.f138738j, threadTopic, messageInfo.getMessage());
                }
                threadInfo.mo126013a(chat);
                return threadInfo;
            }
        };
        this.f138734Q = r4;
        this.f138749u = gVar;
        this.f138750v = context;
        this.f138737i = gVar.f138711d;
        this.f138738j = gVar.f138712e;
        this.f138748t = C33958d.m131429a("lk-thread-window");
        this.f138735g = C33958d.m131429a("lk-thread-window-background");
        this.f138729L = b.mo134505D();
        if (gVar.f138714g != null && gVar.f138714g.getType() == TopicGroup.Type.DEFAULT) {
            z = true;
        }
        this.f138752x = z;
        this.f138743o = gVar.f138714g;
        this.f138751w = wVar;
        this.f138728K = new C56015h.AbstractC56017a() {
            /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass10 */

            @Override // com.ss.android.lark.threadwindow.p2760a.p2761a.C56015h.AbstractC56017a
            /* renamed from: a */
            public int mo191045a() {
                return C56101i.this.f138736h.mo191182f();
            }

            @Override // com.ss.android.lark.threadwindow.p2760a.p2761a.C56015h.AbstractC56017a
            /* renamed from: b */
            public void mo191046b() {
                C56101i.this.mo191110a(new IGetDataCallback<AbstractC33964i<ThreadInfo>>() {
                    /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass10.C561031 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(AbstractC33964i<ThreadInfo> iVar) {
                        if (CollectionUtils.isEmpty(iVar)) {
                            Log.m165389i("ThreadWindow2", "appendPageData is empty");
                            return;
                        }
                        Log.m165389i("ThreadWindow2", "appendPageData" + iVar);
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.p2760a.p2761a.C56015h.AbstractC56017a
            /* renamed from: c */
            public void mo191047c() {
                C56101i.this.mo191125b(new IGetDataCallback<AbstractC33964i<ThreadInfo>>() {
                    /* class com.ss.android.lark.threadwindow.C56101i.AnonymousClass10.C561042 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(AbstractC33964i<ThreadInfo> iVar) {
                        if (CollectionUtils.isEmpty(iVar)) {
                            Log.m165389i("ThreadWindow2", "load pre page data is empty");
                            return;
                        }
                        Log.m165389i("ThreadWindow2", "load pre page data=" + iVar);
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.p2760a.p2761a.C56015h.AbstractC56017a
            /* renamed from: d */
            public int mo191048d() {
                return C56101i.this.f138736h.mo191184h();
            }
        };
        this.f138744p = n.mo134685a("group.role.obeserver");
        m218598x();
        m218597w();
        m218595u();
        m218596v();
        r4.mo126648a(this.f138737i);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a
    /* renamed from: a */
    public void mo191109a(Context context, boolean z, AbstractC44896a aVar) {
        C29990c.m110930b().mo134521T().mo134716a(context, this.f138737i.getId(), Collections.singletonList(this.f138742n.mo134394a()), z, 4, (AbstractC44896a) getCallbackManager().wrapAndAddCallback(new C44897b(aVar)));
    }

    /* renamed from: c */
    public void mo191395c(final String str, final String str2, final int i) {
        this.f138746r.mo191051a(i).execute(new Runnable() {
            /* class com.ss.android.lark.threadwindow.C56101i.RunnableC561179 */

            public void run() {
                AbstractC56008a c = C56101i.this.f138746r.mo191055c(i);
                if (c != null) {
                    c.mo127105a(str, new AbstractC34432b.AbstractC34435c<AbstractC34006a>() {
                        /* class com.ss.android.lark.threadwindow.C56101i.RunnableC561179.C561181 */

                        /* access modifiers changed from: protected */
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
            }
        });
    }
}
