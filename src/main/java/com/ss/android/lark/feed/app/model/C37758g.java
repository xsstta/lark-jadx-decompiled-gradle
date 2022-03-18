package com.ss.android.lark.feed.app.model;

import android.text.TextUtils;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.doc.entity.DocFeed;
import com.ss.android.lark.feed.app.C37623j;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.app.model.common.LoadState;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.app.model.p1863c.C37713d;
import com.ss.android.lark.feed.common.FeedFgUtils;
import com.ss.android.lark.feed.dto.StrongGuideInfo;
import com.ss.android.lark.feed.interfaces.AbstractC38086aa;
import com.ss.android.lark.feed.interfaces.AbstractC38087ab;
import com.ss.android.lark.feed.interfaces.AbstractC38088ac;
import com.ss.android.lark.feed.interfaces.AbstractC38090ae;
import com.ss.android.lark.feed.interfaces.AbstractC38092c;
import com.ss.android.lark.feed.interfaces.AbstractC38095f;
import com.ss.android.lark.feed.interfaces.AbstractC38097h;
import com.ss.android.lark.feed.interfaces.AbstractC38114x;
import com.ss.android.lark.feed.interfaces.ITimeFormatSettingObserver;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.service.impl.C38123a;
import com.ss.android.lark.feed.service.impl.C38146f;
import com.ss.android.lark.feed.service.p1884a.AbstractC38118b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.utils.DevicePerfUtils;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.model.g */
public class C37758g implements C37623j.AbstractC37624a {

    /* renamed from: a */
    C37623j.AbstractC37624a.AbstractC37625a f96807a;

    /* renamed from: b */
    AbstractC37773h f96808b;

    /* renamed from: c */
    CallbackManager f96809c = new CallbackManager();

    /* renamed from: d */
    AbstractC38118b f96810d;

    /* renamed from: e */
    AbstractC38095f f96811e;

    /* renamed from: f */
    AbstractC38037a.AbstractC38051k f96812f;

    /* renamed from: g */
    AbstractC38037a.AbstractC38066z f96813g;

    /* renamed from: h */
    AbstractC38037a.AbstractC38062v f96814h;

    /* renamed from: i */
    AbstractC38037a.AbstractC38047g f96815i;

    /* renamed from: j */
    AbstractC38037a.AbstractC38048h f96816j;

    /* renamed from: k */
    AbstractC38037a.AbstractC38038a f96817k;

    /* renamed from: l */
    AbstractC38037a.AbstractC38064x f96818l;

    /* renamed from: m */
    AbstractC38114x f96819m;

    /* renamed from: n */
    AbstractC38097h f96820n = new AbstractC38097h() {
        /* class com.ss.android.lark.feed.app.model.C37758g.C377591 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38097h
        /* renamed from: a */
        public void mo138471a(int i) {
            if (C37758g.this.f96807a != null) {
                C37758g.this.f96807a.mo137926a(i);
            }
        }
    };

    /* renamed from: o */
    AbstractC38090ae f96821o = new AbstractC38090ae() {
        /* class com.ss.android.lark.feed.app.model.C37758g.C377708 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38090ae
        /* renamed from: b */
        public void mo138484b(boolean z) {
        }

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38090ae
        /* renamed from: a */
        public void mo138483a(boolean z) {
            if (C37758g.this.f96807a == null) {
                return;
            }
            if (z) {
                C37758g.this.f96807a.mo137925a();
            } else {
                C37758g.this.f96807a.mo137933b();
            }
        }
    };

    /* renamed from: p */
    AbstractC38088ac f96822p = new AbstractC38088ac() {
        /* class com.ss.android.lark.feed.app.model.C37758g.C377719 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38088ac
        /* renamed from: a */
        public void mo138485a(final boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.model.C37758g.C377719.RunnableC377721 */

                public void run() {
                    C37758g.this.mo138469b(z);
                }
            });
        }
    };

    /* renamed from: q */
    public FeedPreview f96823q;

    /* renamed from: r */
    C37731d.AbstractC37734b f96824r = new C37731d.AbstractC37734b() {
        /* class com.ss.android.lark.feed.app.model.C37758g.AnonymousClass10 */

        @Override // com.ss.android.lark.feed.app.model.C37731d.AbstractC37734b
        /* renamed from: b */
        public void mo138109b(UpdateRecord updateRecord) {
            if (C37758g.this.f96807a != null && C37758g.this.mo138470e(FeedCard.FeedType.DONE)) {
                C37758g.this.f96807a.mo137935b(updateRecord);
            }
        }

        @Override // com.ss.android.lark.feed.app.model.C37731d.AbstractC37734b
        /* renamed from: c */
        public void mo138432c(UpdateRecord updateRecord) {
            if (C37758g.this.f96807a != null && C37758g.this.mo138470e(FeedCard.FeedType.INBOX)) {
                C37758g.this.f96807a.mo137938c(updateRecord);
                Log.m165379d("FeedModule_FeedListModel", "onFeedV2HeaderDataChanged");
            }
        }

        @Override // com.ss.android.lark.feed.app.model.C37731d.AbstractC37734b
        /* renamed from: d */
        public void mo138433d(UpdateRecord updateRecord) {
            if (C37758g.this.f96807a != null && C37758g.this.mo138470e(FeedCard.FeedType.INBOX)) {
                C37758g.this.f96807a.mo137939d(updateRecord);
                Log.m165379d("FeedModule_FeedListModel", "onFeedFilterDataChanged");
            }
        }

        @Override // com.ss.android.lark.feed.app.model.C37731d.AbstractC37734b
        /* renamed from: a */
        public void mo138108a(UpdateRecord updateRecord) {
            if (C37758g.this.f96807a != null && C37758g.this.mo138470e(FeedCard.FeedType.INBOX)) {
                C37758g.this.f96807a.mo137929a(updateRecord);
            }
        }

        @Override // com.ss.android.lark.feed.app.model.C37731d.AbstractC37734b
        /* renamed from: a */
        public void mo137402a(Map<Integer, Integer> map) {
            if (C37758g.this.f96807a != null) {
                C37758g.this.f96807a.mo137931a(map);
            }
        }

        @Override // com.ss.android.lark.feed.app.model.C37731d.AbstractC37734b
        /* renamed from: a */
        public void mo138431a(boolean z) {
            if (!z && TextUtils.equals(C37758g.this.f96808b.mo138412c(), C37758g.this.f96817k.mo139208a())) {
                C38123a.m149931a().mo139461d();
                Log.m165389i("FeedModule_FeedListModel", "record invite banner dismiss");
            }
        }

        @Override // com.ss.android.lark.feed.app.model.C37731d.AbstractC37734b
        /* renamed from: a */
        public void mo138429a(FeedCard.FeedType feedType, LoadState.LoadType loadType) {
            if (C37758g.this.f96807a != null) {
                C37758g.this.f96807a.mo137927a(feedType, loadType);
            }
        }

        @Override // com.ss.android.lark.feed.app.model.C37731d.AbstractC37734b
        /* renamed from: a */
        public void mo138430a(LoadState loadState, FeedCard.FeedType feedType) {
            if (C37758g.this.f96807a != null) {
                C37758g.this.f96807a.mo137928a(loadState, feedType);
            }
        }
    };

    /* renamed from: s */
    private final AbstractC38092c f96825s;

    /* renamed from: t */
    private volatile int f96826t = 8;

    /* renamed from: u */
    private final C37749e f96827u = new C37749e();

    /* renamed from: v */
    private final C37755f f96828v = new C37755f();

    /* renamed from: w */
    private AbstractC38037a.AbstractC38050j f96829w;

    /* renamed from: x */
    private final AbstractC38087ab f96830x = new AbstractC38087ab() {
        /* class com.ss.android.lark.feed.app.model.C37758g.AnonymousClass11 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38087ab
        /* renamed from: a */
        public void mo137282a() {
            if (C37758g.this.f96807a != null) {
                C37758g.this.f96807a.mo137937c();
            }
        }

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38087ab
        /* renamed from: a */
        public void mo137283a(boolean z) {
            if (C37758g.this.f96807a != null) {
                C37758g.this.f96807a.mo137936b(z);
            }
        }
    };

    /* renamed from: y */
    private final ITimeFormatSettingObserver f96831y = new ITimeFormatSettingObserver() {
        /* class com.ss.android.lark.feed.app.model.C37758g.AnonymousClass12 */

        @Override // com.ss.android.lark.feed.interfaces.ITimeFormatSettingObserver
        /* renamed from: a */
        public void mo137403a(int i) {
            if (C37758g.this.f96807a != null) {
                C37758g.this.f96807a.mo137934b(i);
            }
        }
    };

    /* renamed from: z */
    private final AbstractC38086aa f96832z = new AbstractC38086aa() {
        /* class com.ss.android.lark.feed.app.model.C37758g.AnonymousClass13 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38086aa
        /* renamed from: a */
        public void mo137219a(List<TenantInfo> list, List<TenantInfo.PendingUser> list2) {
            if (C37758g.this.f96807a != null) {
                C37758g.this.f96807a.mo137930a(list, list2);
            }
        }
    };

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: a */
    public void mo138021a(String str) {
        this.f96810d.mo139432a(new Channel(Channel.Type.CHAT, str));
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: a */
    public void mo138022a(List<UIFeedCard> list) {
        if (C37713d.f96673c) {
            this.f96827u.mo138452a(list);
            return;
        }
        DevicePerfUtils.DevicePerfLevel b = DevicePerfUtils.m224113b();
        Log.m165389i("FeedModule_FeedListModel", "preloadFeedItemsData: devicePerfLevel=" + b);
        int i = C377697.f96858a[b.ordinal()];
        if (i == 1 || i == 2) {
            if (C37713d.f96674d) {
                this.f96828v.mo138464a(list);
            }
        } else if (C37713d.f96675e) {
            this.f96828v.mo138464a(list);
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: a */
    public void mo138023a(boolean z) {
        AbstractC37773h hVar = this.f96808b;
        if (hVar != null) {
            hVar.mo138404a(z);
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: a */
    public void mo138024a(boolean z, FeedPreview feedPreview, IGetDataCallback<Object> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(feedPreview.getId());
        if (z) {
            this.f96811e.mo139420a(arrayList, this.f96809c.wrapAndAddGetDataCallback(iGetDataCallback));
        } else {
            this.f96811e.mo139421a(arrayList, feedPreview.isRemind(), this.f96809c.wrapAndAddGetDataCallback(iGetDataCallback));
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: a */
    public void mo138013a() {
        this.f96808b.mo138415f();
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: b */
    public void mo138025b() {
        this.f96808b.mo138426q();
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: c */
    public boolean mo138032c() {
        return this.f96808b.mo138413d();
    }

    /* renamed from: com.ss.android.lark.feed.app.model.g$7 */
    static /* synthetic */ class C377697 {

        /* renamed from: a */
        static final /* synthetic */ int[] f96858a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.utils.DevicePerfUtils$DevicePerfLevel[] r0 = com.ss.android.lark.utils.DevicePerfUtils.DevicePerfLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.feed.app.model.C37758g.C377697.f96858a = r0
                com.ss.android.lark.utils.DevicePerfUtils$DevicePerfLevel r1 = com.ss.android.lark.utils.DevicePerfUtils.DevicePerfLevel.ULTRALOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.feed.app.model.C37758g.C377697.f96858a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.utils.DevicePerfUtils$DevicePerfLevel r1 = com.ss.android.lark.utils.DevicePerfUtils.DevicePerfLevel.LOW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.feed.app.model.C37758g.C377697.f96858a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.utils.DevicePerfUtils$DevicePerfLevel r1 = com.ss.android.lark.utils.DevicePerfUtils.DevicePerfLevel.MIDDLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.feed.app.model.C37758g.C377697.f96858a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.utils.DevicePerfUtils$DevicePerfLevel r1 = com.ss.android.lark.utils.DevicePerfUtils.DevicePerfLevel.HIGH     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.feed.app.model.C37758g.C377697.f96858a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.utils.DevicePerfUtils$DevicePerfLevel r1 = com.ss.android.lark.utils.DevicePerfUtils.DevicePerfLevel.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.model.C37758g.C377697.<clinit>():void");
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f96809c.cancelCallbacks();
        this.f96818l.mo139321b(this.f96832z);
        C37268c.m146767c().mo139343b(this.f96830x);
        C37268c.m146767c().mo139341b(this.f96831y);
        C37268c.m146767c().mo139344b(this.f96822p);
        C37268c.m146767c().mo139347b(this.f96825s);
        C37268c.m146767c().mo139349b(this.f96820n);
        this.f96808b.mo138408b(this.f96824r);
        C37268c.m146767c().mo139346b(this.f96821o);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C37268c.m146767c().mo139334a(this.f96825s);
        this.f96812f = C37268c.m146766b().mo139207z();
        this.f96819m = C37268c.m146763a().mo136982f();
        this.f96813g = C37268c.m146766b().mo139199r();
        this.f96810d = C38146f.m149976a();
        this.f96811e = C37268c.m146763a().mo136980d();
        this.f96829w = C37268c.m146766b().mo139204w();
        this.f96815i = C37268c.m146766b().mo139154A();
        this.f96816j = C37268c.m146766b().mo139156C();
        this.f96817k = C37268c.m146766b().mo139155B();
        this.f96818l = C37268c.m146766b().mo139200s();
        this.f96807a.mo137929a(this.f96808b.mo138417h());
        if (FeedFgUtils.m146773b()) {
            this.f96807a.mo137938c(this.f96808b.mo138419j());
        }
        this.f96808b.mo138402a(this.f96824r);
        this.f96807a.mo137926a(this.f96829w.mo139249c());
        this.f96814h = C37268c.m146766b().mo139203v();
        C37268c.m146767c().mo139336a(this.f96820n);
        C37268c.m146767c().mo139330a(this.f96830x);
        C37268c.m146767c().mo139328a(this.f96831y);
        if (this.f96813g.mo139327a()) {
            this.f96807a.mo137925a();
        } else {
            this.f96807a.mo137933b();
        }
        C37268c.m146767c().mo139331a(this.f96822p);
        mo138469b(this.f96814h.mo139303f());
        m148617c(this.f96814h.mo139300c());
        C37268c.m146767c().mo139333a(this.f96821o);
        this.f96818l.mo139316a(this.f96832z);
        this.f96807a.mo137930a(this.f96818l.mo139314a(), this.f96818l.mo139320b());
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: a */
    public void mo138020a(C37623j.AbstractC37624a.AbstractC37625a aVar) {
        this.f96807a = aVar;
    }

    /* renamed from: c */
    private void m148617c(boolean z) {
        C37623j.AbstractC37624a.AbstractC37625a aVar = this.f96807a;
        if (aVar != null) {
            aVar.mo137936b(z);
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: a */
    public void mo138014a(IGetDataCallback<Map<Integer, Integer>> iGetDataCallback) {
        this.f96809c.wrapAndAddGetDataCallback(iGetDataCallback).onSuccess(this.f96808b.mo138425p());
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: b */
    public void mo138028b(String str) {
        this.f96812f.mo139254a(str, (IGetDataCallback<DocFeed>) null);
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: c */
    public void mo138030c(IGetDataCallback<StrongGuideInfo> iGetDataCallback) {
        this.f96810d.mo139447c(this.f96809c.wrapAndAddGetDataCallback(iGetDataCallback));
    }

    /* renamed from: f */
    private void m148618f(final FeedCard.FeedType feedType) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.feed.app.model.C37758g.RunnableC377664 */

            public void run() {
                if (C37758g.this.f96808b != null) {
                    Log.m165379d("FeedModule_FeedListModel", "refreshBoxData: " + feedType);
                    if (feedType == FeedCard.FeedType.DONE) {
                        UpdateRecord i = C37758g.this.f96808b.mo138418i();
                        if (C37758g.this.f96807a != null) {
                            C37758g.this.f96807a.mo137935b(i);
                            return;
                        }
                        return;
                    }
                    UpdateRecord h = C37758g.this.f96808b.mo138417h();
                    if (C37758g.this.f96807a != null) {
                        C37758g.this.f96807a.mo137929a(h);
                        if (FeedFgUtils.m146773b()) {
                            C37758g.this.f96807a.mo137938c(C37758g.this.f96808b.mo138419j());
                            C37758g.this.f96807a.mo137939d(C37758g.this.f96808b.mo138420k());
                            C37758g.this.f96807a.mo137929a(C37758g.this.f96808b.mo138421l());
                        }
                    }
                }
            }
        });
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: a */
    public LoadState mo138012a(FeedCard.FeedType feedType) {
        if (this.f96808b == null) {
            return new LoadState();
        }
        if (feedType == FeedCard.FeedType.INBOX) {
            return this.f96808b.mo138423n();
        }
        return this.f96808b.mo138424o();
    }

    /* renamed from: b */
    public void mo138469b(boolean z) {
        C37623j.AbstractC37624a.AbstractC37625a aVar = this.f96807a;
        if (aVar != null) {
            aVar.mo137932a(z);
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: c */
    public void mo138031c(FeedCard.FeedType feedType) {
        FeedCard.FeedType feedType2;
        synchronized (this) {
            if (feedType == FeedCard.FeedType.INBOX) {
                this.f96826t &= -5;
            } else if (feedType == FeedCard.FeedType.DONE) {
                this.f96826t &= -9;
            } else {
                this.f96826t &= -3;
            }
            if ((this.f96826t & 4) != 0) {
                feedType2 = FeedCard.FeedType.DONE;
            } else {
                feedType2 = FeedCard.FeedType.INBOX;
            }
        }
        m148618f(feedType2);
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: d */
    public synchronized void mo138033d(FeedCard.FeedType feedType) {
        if (feedType == FeedCard.FeedType.INBOX) {
            this.f96826t |= 4;
        } else if (feedType == FeedCard.FeedType.DONE) {
            this.f96826t |= 8;
        } else {
            this.f96826t |= 2;
        }
    }

    /* renamed from: e */
    public synchronized boolean mo138470e(FeedCard.FeedType feedType) {
        boolean z = true;
        if (feedType == FeedCard.FeedType.INBOX) {
            if (!((this.f96826t & 4) == 0 && (this.f96826t & 2) == 0)) {
                z = false;
            }
            return z;
        }
        if (!((this.f96826t & 8) == 0 && (this.f96826t & 2) == 0)) {
            z = false;
        }
        return z;
    }

    public C37758g(AbstractC37773h hVar) {
        this.f96808b = hVar;
        this.f96825s = new AbstractC38092c() {
            /* class com.ss.android.lark.feed.app.model.C37758g.AnonymousClass14 */

            @Override // com.ss.android.lark.feed.interfaces.AbstractC38092c
            /* renamed from: a */
            public void mo138472a(final Class cls) {
                CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                    /* class com.ss.android.lark.feed.app.model.C37758g.AnonymousClass14.RunnableC377601 */

                    public void run() {
                        C37758g.this.mo138468a(cls);
                    }
                });
            }
        };
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: a */
    public void mo138016a(final FeedFilter feedFilter) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.feed.app.model.C37758g.RunnableC377675 */

            public void run() {
                if (C37758g.this.f96808b != null) {
                    C37758g.this.f96823q = null;
                    C37758g.this.f96808b.mo138407b(feedFilter);
                }
            }
        });
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: b */
    public void mo138026b(final IGetDataCallback<Integer> iGetDataCallback) {
        if (!this.f96814h.mo139304g()) {
            this.f96814h.mo139294a(this.f96809c.wrapAndAddGetDataCallback(new IGetDataCallback<Integer>() {
                /* class com.ss.android.lark.feed.app.model.C37758g.C377612 */

                /* renamed from: a */
                public void onSuccess(Integer num) {
                    iGetDataCallback.onSuccess(num);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e(errorResult.toString());
                    C57865c.m224574a(new C57865c.AbstractC57873d<Integer>() {
                        /* class com.ss.android.lark.feed.app.model.C37758g.C377612.C377621 */

                        /* renamed from: a */
                        public Integer produce() {
                            return Integer.valueOf(C37758g.this.f96814h.mo139302e());
                        }
                    }, new C57865c.AbstractC57871b<Integer>() {
                        /* class com.ss.android.lark.feed.app.model.C37758g.C377612.C377632 */

                        /* renamed from: a */
                        public void consume(Integer num) {
                            iGetDataCallback.onSuccess(num);
                        }
                    });
                }
            }));
        } else {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.model.C37758g.RunnableC377643 */

                public void run() {
                    final int e = C37758g.this.f96814h.mo139302e();
                    CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                        /* class com.ss.android.lark.feed.app.model.C37758g.RunnableC377643.RunnableC377651 */

                        public void run() {
                            if (iGetDataCallback != null) {
                                iGetDataCallback.onSuccess(Integer.valueOf(e));
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: a */
    public void mo138018a(UIFeedCard uIFeedCard) {
        AbstractC37773h hVar = this.f96808b;
        if (hVar != null && uIFeedCard != null && (uIFeedCard instanceof FeedPreview)) {
            hVar.mo138400a((FeedPreview) uIFeedCard);
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: b */
    public boolean mo138029b(FeedCard.FeedType feedType) {
        return this.f96808b.mo138411b(feedType);
    }

    /* renamed from: a */
    public void mo138468a(Class cls) {
        if (C37713d.f96671a) {
            mo138023a(true);
        }
    }

    /* renamed from: b */
    private void m148616b(UIFeedCard uIFeedCard, FeedCard.FeedType feedType, final IGetDataCallback<List<FeedCard>> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        FeedCard feedCard = new FeedCard();
        feedCard.setId(uIFeedCard.getId());
        feedCard.setType(uIFeedCard.getType());
        feedCard.setFeedType(uIFeedCard.getFeedType());
        arrayList.add(feedCard);
        this.f96810d.mo139444a(arrayList, feedType, this.f96809c.wrapAndAddGetDataCallback(new IGetDataCallback<List<FeedCard>>() {
            /* class com.ss.android.lark.feed.app.model.C37758g.C377686 */

            /* renamed from: a */
            public void onSuccess(List<FeedCard> list) {
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

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: a */
    public void mo138015a(FeedCard.FeedType feedType, int i, FeedPreview feedPreview) {
        if (this.f96823q == null) {
            this.f96823q = feedPreview;
        } else {
            feedPreview = null;
        }
        this.f96808b.mo138396a(feedType, i, feedPreview);
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: a */
    public void mo138017a(FeedPreview feedPreview, final boolean z, final IGetDataCallback<FeedPreviewInfo> iGetDataCallback) {
        this.f96810d.mo139445a(z, feedPreview.getId(), this.f96809c.wrapAndAddGetDataCallback(new IGetDataCallback<FeedPreviewInfo>() {
            /* class com.ss.android.lark.feed.app.model.C37758g.AnonymousClass15 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("FeedModule_FeedListModel", "set Feed Delayed error : " + errorResult);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(FeedPreviewInfo feedPreviewInfo) {
                if (feedPreviewInfo == null) {
                    Log.m165389i("FeedModule_FeedListModel", "set Feed Delayed to " + z + ", response = null");
                    return;
                }
                Log.m165389i("FeedModule_FeedListModel", "set Feed Delayed to " + z + ", response = " + feedPreviewInfo.toString());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(feedPreviewInfo);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: b */
    public void mo138027b(FeedPreview feedPreview, boolean z, IGetDataCallback<Shortcut> iGetDataCallback) {
        Shortcut shortcut = new Shortcut(Channel.Type.fromFeedType(feedPreview.getType().getNumber()), feedPreview.getId());
        if (z) {
            this.f96819m.mo139427a(shortcut, iGetDataCallback);
        } else {
            this.f96819m.mo139429b(shortcut, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a
    /* renamed from: a */
    public void mo138019a(UIFeedCard uIFeedCard, FeedCard.FeedType feedType, IGetDataCallback<List<FeedCard>> iGetDataCallback) {
        AbstractC37773h hVar = this.f96808b;
        if (hVar != null) {
            hVar.mo138401a(uIFeedCard, feedType);
        }
        m148616b(uIFeedCard, feedType, iGetDataCallback);
    }
}
