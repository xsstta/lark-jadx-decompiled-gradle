package com.ss.android.lark.mail.impl.message.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.lark.pb.email.client.v1.Draft;
import com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest;
import com.bytedance.lark.pb.email.client.v1.MailCreateShareMessageDraftResponse;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.bytedance.lark.pb.email.client.v1.UserInfo;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.action.ComposeMailAction;
import com.ss.android.lark.mail.impl.action.ForwardMailAction;
import com.ss.android.lark.mail.impl.action.ReplyAllMailAction;
import com.ss.android.lark.mail.impl.action.ReplyMailAction;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.entity.CreateDraft;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.home.C42434b;
import com.ss.android.lark.mail.impl.message.framework.MessageListActivity;
import com.ss.android.lark.mail.impl.message.framework.MulProMessageListActivity;
import com.ss.android.lark.mail.impl.message.framework.tabcontainer.C42933c;
import com.ss.android.lark.mail.impl.message.framework.tabcontainer.MessageListTabActivity;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.plugin.C42963e;
import com.ss.android.lark.mail.impl.message.view.p2210a.C43177b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42226b;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42306q;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43331r;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43332s;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u;
import com.ss.android.lark.mail.impl.share.C43645c;
import com.ss.android.lark.mail.impl.share.C43691h;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.List;

public class MailMessageListView extends BaseMailMessageListView implements C42963e.AbstractC42967a, AbstractC43331r, AbstractC43332s, AbstractC43334u, C43645c.AbstractC43652a {
    private final String ad = "MailMessageListActivity";
    protected C42963e ae;
    public int af;
    public View ag;
    protected View ah;

    /* renamed from: ai  reason: collision with root package name */
    private boolean f175450ai;

    /* access modifiers changed from: protected */
    public void getDataFinish() {
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u
    /* renamed from: a */
    public void mo150850a(String str, String str2) {
        Log.m165389i("MailMessageListActivity", "onUnShareThread");
        if (str.equals(this.f109699g)) {
            C43849u.m173826a(new Runnable(str2) {
                /* class com.ss.android.lark.mail.impl.message.view.$$Lambda$MailMessageListView$SyGLzHRI4YrweKe3utGSDTg7m_4 */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    MailMessageListView.this.m171569o(this.f$1);
                }
            });
        }
    }

    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView, com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: I */
    public void mo154298I() {
        super.mo154298I();
        Watchers.m167209b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView, com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: g */
    public void mo154356g() {
        super.mo154356g();
        Watchers.m167206a(this);
    }

    private void ah() {
        C43849u.m173827a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.MailMessageListView.RunnableC431554 */

            public void run() {
                MailMessageListView.this.mo154302M();
            }
        }, 500);
    }

    private void ai() {
        View view = this.ag;
        if (view != null) {
            view.setVisibility(8);
            this.ag.setOnClickListener(null);
        }
    }

    private void aj() {
        C43691h.m173278a(this.f109706n, new C43691h.AbstractC43693a() {
            /* class com.ss.android.lark.mail.impl.message.view.MailMessageListView.C431596 */

            @Override // com.ss.android.lark.mail.impl.share.C43691h.AbstractC43693a
            public void onOKButtonClick() {
                Log.m165389i("MailMessageListActivity", "showUnShareThreadDialog onOKButtonClick");
                MailMessageListView.this.ag();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: e */
    public void mo154352e() {
        if (this.f109674D == null) {
            this.f109674D = new IGetDataCallback<C42099l>() {
                /* class com.ss.android.lark.mail.impl.message.view.MailMessageListView.C431491 */

                /* renamed from: a */
                public void onSuccess(C42099l lVar) {
                    Log.m165389i("MailMessageListActivity", "get data from rust success");
                    MailMessageListView.this.f109694b.mo152011a(MailMessageListView.this.af);
                    MailMessageListView.this.getDataFinish();
                    MailMessageListView mailMessageListView = MailMessageListView.this;
                    mailMessageListView.ae = new C42963e(mailMessageListView.f109706n, MailMessageListView.this.f109699g, MailMessageListView.this.f109694b.mo152021c());
                    MailMessageListView.this.mo154354f();
                    if (MailMessageListView.this.ae.mo154086a(new C42963e.AbstractC42968b() {
                        /* class com.ss.android.lark.mail.impl.message.view.MailMessageListView.C431491.C431501 */

                        @Override // com.ss.android.lark.mail.impl.message.plugin.C42963e.AbstractC42968b
                        /* renamed from: a */
                        public void mo154092a(UserInfo userInfo) {
                            Log.m165389i("MailMessageListActivity", "getData from rust onFetchOwnerInfo");
                            MailMessageListView.this.f109694b.mo152013a(userInfo);
                            MailMessageListView.this.mo154379v();
                            C43849u.m173826a(new Runnable() {
                                /* class com.ss.android.lark.mail.impl.message.view.MailMessageListView.C431491.C431501.RunnableC431511 */

                                public void run() {
                                    MailMessageListView.this.mo154356g();
                                }
                            });
                        }
                    })) {
                        Log.m165389i("MailMessageListActivity", "getData from rust fetch share owner info");
                        return;
                    }
                    MailMessageListView.this.mo154379v();
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.message.view.MailMessageListView.C431491.RunnableC431522 */

                        public void run() {
                            MailMessageListView.this.mo154356g();
                        }
                    });
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i("MailMessageListActivity", "get data from rust error");
                    MailMessageListView.this.mo154380w();
                    if (errorResult != null) {
                        ((C42306q) C42344d.m169092a(C42306q.class, MailMessageListView.this.getContext(), MailMessageListView.this.f109699g)).mo152369a(errorResult.getErrorCode(), errorResult.getDebugMsg());
                    }
                    ((C42306q) C42344d.m169092a(C42306q.class, MailMessageListView.this.getContext(), MailMessageListView.this.f109699g)).mo152372a("rust_fail", 0);
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView, com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public int getTemplateLayout() {
        if (C42871i.m170779b()) {
            return R.layout.mail_message_list_tab_item_frame;
        }
        return R.layout.mail_message_list_tab_item;
    }

    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView, com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: h */
    public void mo154366h() {
        if (this.f175450ai) {
            this.f175450ai = false;
            mo154302M();
            return;
        }
        super.mo154366h();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: u */
    public void mo154378u() {
        this.f109689S = false;
        ai();
        mo154373r();
        getData();
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: w */
    public void mo154380w() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.MailMessageListView.RunnableC431565 */

            public void run() {
                if (MailMessageListView.this.f109677G == null) {
                    MailMessageListView mailMessageListView = MailMessageListView.this;
                    mailMessageListView.f109677G = (OperationTitleBar) mailMessageListView.f109706n.findViewById(R.id.message_list_operation_title_bar);
                    if (MailMessageListView.this.f109677G != null) {
                        MailMessageListView.this.f109677G.setListener(new OperationTitleBar.AbstractC43958a() {
                            /* class com.ss.android.lark.mail.impl.message.view.MailMessageListView.RunnableC431565.C431571 */

                            @Override // com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.AbstractC43958a
                            /* renamed from: a */
                            public void mo150696a() {
                                MailMessageListView.this.mo154302M();
                            }
                        });
                    }
                }
                MailMessageListView.this.ag.setVisibility(0);
                ((ImageView) MailMessageListView.this.findViewById(R.id.mail_error_tips_img)).setImageResource(R.drawable.icon_common_loading_failed);
                MailMessageListView.this.ag.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.message.view.MailMessageListView.RunnableC431565.View$OnClickListenerC431582 */

                    public void onClick(View view) {
                        MailMessageListView.this.mo154378u();
                    }
                });
                MailMessageListView.this.f109710r = true;
                if (MailMessageListView.this.f109709q != null) {
                    MailMessageListView.this.f109709q.mo153995a(MailMessageListView.this.f109705m.mo153787d());
                }
                MailMessageListView.this.mo154374s();
            }
        });
        C42187a.m168573v();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: x */
    public void mo154381x() {
        super.mo154381x();
        View view = this.ah;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154310a() {
        super.mo154310a();
        View view = this.ah;
        if (view != null) {
            view.setVisibility(0);
        }
        ai();
        this.f175450ai = false;
    }

    public void ag() {
        Log.m165389i("MailMessageListActivity", "tryFinish");
        if (C43785p.m173546b(this.f109706n)) {
            Log.m165389i("MailMessageListActivity", "tryFinish do finish");
            mo154302M();
        }
    }

    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView, com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView, com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: q */
    public void mo150632q() {
        Log.m165389i("MailMessageListActivity", "onFirstContentfulPaint");
        super.mo150632q();
        C42963e eVar = this.ae;
        if (eVar != null) {
            eVar.mo154085a(this);
            this.ae.mo154083a(this.f109706n, this.f109718z.mo154568b());
        }
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: L */
    public void mo154301L() {
        Log.m165389i("MailMessageListActivity", "navigateToShare");
        if (!C42434b.m169442a(getContext())) {
            C42699a.m170238a(this.f109706n, this.f109694b.mo152010a(), this.f109698f.mo153736a(this.f109693a), this.f109698f.mo153741b(this.f109693a));
            C42187a.m168549k(C42187a.C42191c.f107436M);
            C42187a.m168482a("email_thread_share", C43177b.m171626a());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView
    /* renamed from: V */
    public void mo154437V() {
        Log.m165389i("MailMessageListActivity", "gotoLabelSelect");
        if (this.f109694b == null) {
            Log.m165389i("MailMessageListActivity", "gotoLabelSelect empty data");
            return;
        }
        PermissionCode c = this.f109694b.mo152021c();
        if (c == null || c == PermissionCode.NONE || c == PermissionCode.OWNER) {
            super.mo154437V();
        } else {
            Log.m165389i("MailMessageListActivity", "gotoLabelSelect share member abort");
        }
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: d */
    public void mo154350d() {
        super.mo154350d();
        Log.m165389i("MailMessageListActivity", "testAsynRender 22222" + this);
        this.ag = findViewById(R.id.mail_messagelist_tips_container);
        this.ah = findViewById(R.id.mail_messagelist_reset_fortab);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.message.view.MailMessageListView$3 */
    public static /* synthetic */ class C431543 {

        /* renamed from: a */
        static final /* synthetic */ int[] f109878a;

        /* renamed from: b */
        static final /* synthetic */ int[] f109879b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.bytedance.lark.pb.email.client.v1.PermissionCode[] r0 = com.bytedance.lark.pb.email.client.v1.PermissionCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.message.view.MailMessageListView.C431543.f109879b = r0
                r1 = 1
                com.bytedance.lark.pb.email.client.v1.PermissionCode r2 = com.bytedance.lark.pb.email.client.v1.PermissionCode.OWNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.android.lark.mail.impl.message.view.MailMessageListView.C431543.f109879b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.email.client.v1.PermissionCode r3 = com.bytedance.lark.pb.email.client.v1.PermissionCode.EDIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = com.ss.android.lark.mail.impl.message.view.MailMessageListView.C431543.f109879b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.email.client.v1.PermissionCode r4 = com.bytedance.lark.pb.email.client.v1.PermissionCode.VIEW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest$CreateDraftAction[] r3 = com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest.CreateDraftAction.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.ss.android.lark.mail.impl.message.view.MailMessageListView.C431543.f109878a = r3
                com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest$CreateDraftAction r4 = com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest.CreateDraftAction.REPLY     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = com.ss.android.lark.mail.impl.message.view.MailMessageListView.C431543.f109878a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest$CreateDraftAction r3 = com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest.CreateDraftAction.REPLY_ALL     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = com.ss.android.lark.mail.impl.message.view.MailMessageListView.C431543.f109878a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest$CreateDraftAction r1 = com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest.CreateDraftAction.FORWARD     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.message.view.MailMessageListView.C431543.<clinit>():void");
        }
    }

    public MailMessageListView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView
    /* renamed from: b */
    public String mo154457b(MailDraft mailDraft) {
        if (this.f109694b == null) {
            Log.m165389i("MailMessageListActivity", "getReplyMailID empty thread");
            return super.mo154457b(mailDraft);
        } else if (C43691h.m173281a(this.f109694b)) {
            return super.mo154457b(mailDraft);
        } else {
            String C = mailDraft.mo151318C();
            if (TextUtils.isEmpty(C)) {
                return super.mo154457b(mailDraft);
            }
            return C;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m171569o(String str) {
        int i = C431543.f109879b[this.ae.mo154082a().ordinal()];
        if (i == 1) {
            Log.m165389i("MailMessageListActivity", "onUnShareThread OWNER");
            ag();
        } else if (i == 2 || i == 3) {
            Log.m165389i("MailMessageListActivity", "onUnShareThread collaborator");
            if (TextUtils.equals(str, C41816b.m166115a().mo150139f())) {
                if (this.ae.mo154088c()) {
                    Log.m165389i("MailMessageListActivity", "onUnShareThread collaborator quiting, ignore change log");
                    return;
                }
                ag();
                MailToast.m173698a((int) R.string.Mail_Share_ToastQuitShareSuccess, MailToast.Type.SUCCESS);
            } else if (hasWindowFocus()) {
                aj();
            } else {
                ag();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: b */
    public void mo154337b(C42099l lVar) {
        List<MailDraft> b = lVar.mo151979b();
        if (b == null || b.isEmpty()) {
            Log.m165389i("MailMessageListActivity", "MailMessageListActivity empty data");
            if (C42871i.m170779b()) {
                if (this.f109680J == null) {
                    mo154302M();
                } else if (!(this.f109680J instanceof C42933c)) {
                } else {
                    if (this.f109705m == null || this.f109705m.mo153787d() != ((C42933c) this.f109680J).mo154033g()) {
                        mo154380w();
                        ((C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g)).mo152372a(ApiHandler.API_CALLBACK_EXCEPTION, 0);
                        this.f175450ai = true;
                        return;
                    }
                    ah();
                }
            } else if ((this.f109706n instanceof MessageListActivity) || (this.f109706n instanceof MulProMessageListActivity)) {
                mo154302M();
            } else if (!(this.f109706n instanceof MessageListTabActivity)) {
            } else {
                if (this.f109705m == null || this.f109705m.mo153787d() != ((MessageListTabActivity) this.f109706n).mo154015d()) {
                    mo154380w();
                    ((C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g)).mo152372a(ApiHandler.API_CALLBACK_EXCEPTION, 0);
                    this.f175450ai = true;
                    return;
                }
                ah();
            }
        } else {
            C42226b.m168638a().mo152308a(C42226b.C42229b.f107485a);
            C42699a.m170223a(this.f109706n, b.get(0), lVar.mo151988e(), (String) null, "inbox_draft");
            mo154302M();
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u
    /* renamed from: a */
    public void mo150846a(String str) {
        Log.m165389i("MailMessageListActivity", "onShareThread");
        if (!TextUtils.isEmpty(str) && str.equals(this.f109699g)) {
            this.ae.mo154084a(PermissionCode.OWNER);
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.view.$$Lambda$OQ46LJ5wc7TTLnP3GrLYh0oVHqk */

                public final void run() {
                    MailMessageListView.this.mo154435T();
                }
            });
            ab();
        }
    }

    @Override // com.ss.android.lark.mail.impl.message.plugin.C42963e.AbstractC42967a
    /* renamed from: b */
    public void mo154091b(String str, String str2) {
        Log.m165389i("MailMessageListActivity", "onUpdateShareTips");
    }

    public MailMessageListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43331r
    /* renamed from: b */
    public void mo150857b(String str, final Draft draft) {
        Log.m165389i("MailMessageListActivity", "onShareDraftDelete");
        if (draft == null) {
            Log.m165383e("MailMessageListActivity", "onShareDraftDelete invalid draft");
        } else {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.view.MailMessageListView.RunnableC431629 */

                public void run() {
                    MailMessageListView.this.mo154472l(draft.id);
                    MailMessageListView.this.ac();
                }
            });
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43331r
    /* renamed from: d */
    public void mo150861d(String str, Draft draft) {
        Log.m165389i("MailMessageListActivity", "onShareDraftUpdate");
        if (draft == null) {
            Log.m165383e("MailMessageListActivity", "onShareDraftUpdate empty draft");
            return;
        }
        final MailDraft a = C42130j.m168150a().mo152078a(draft);
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.MailMessageListView.AnonymousClass11 */

            public void run() {
                MailMessageListView.this.mo154445a(a);
                MailMessageListView.this.ac();
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43331r
    /* renamed from: c */
    public void mo150859c(String str, final Draft draft) {
        Log.m165389i("MailMessageListActivity", "onShareDraftSend");
        if (draft == null || TextUtils.isEmpty(draft.id)) {
            Log.m165383e("MailMessageListActivity", "onShareDraftSend invalid draft");
        } else {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.view.MailMessageListView.AnonymousClass10 */

                public void run() {
                    MailMessageListView.this.mo154472l(draft.id);
                    MailMessageListView.this.ac();
                }
            });
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43331r
    /* renamed from: a */
    public void mo150848a(String str, Draft draft) {
        Log.m165389i("MailMessageListActivity", "onShareDraftAdd");
        if (draft == null) {
            Log.m165383e("MailMessageListActivity", "onShareDraftAdd empty draft");
            return;
        }
        final MailDraft a = C42130j.m168150a().mo152078a(draft);
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.MailMessageListView.RunnableC431618 */

            public void run() {
                MailMessageListView.this.mo154445a(a);
                MailMessageListView.this.ac();
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43332s
    /* renamed from: a */
    public void mo150849a(String str, PermissionCode permissionCode) {
        C42963e eVar;
        Log.m165389i("MailMessageListActivity", "onSharePermissionChange");
        if (TextUtils.equals(str, this.f109699g) && (eVar = this.ae) != null) {
            eVar.mo154084a(permissionCode);
            this.f109694b.mo152012a(permissionCode);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154316a(MailDraft mailDraft, String str, String str2) {
        Log.m165389i("MailMessageListActivity", "navigateToDraftView");
        C42226b.m168638a().mo152308a(C42226b.C42229b.f107485a);
        C42699a.m170224a(this.f109706n, mailDraft, PermissionCode.fromValue(mailDraft.mo151317B()), this.ae.mo154087b(), str, str2);
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: c */
    public void mo154345c(MailMessage mailMessage, String str, String str2) {
        Log.m165389i("MailMessageListActivity", "navigateToForward");
        PermissionCode c = this.f109694b.mo152021c();
        if (c == null || c == PermissionCode.NONE) {
            C42699a.m170275c(this.f109706n, mailMessage, str, this.ae.mo154087b(), str2);
        } else {
            m171568a(mailMessage, MailCreateDraftRequest.CreateDraftAction.FORWARD, str2);
        }
    }

    /* renamed from: a */
    private void m171568a(final MailMessage mailMessage, final MailCreateDraftRequest.CreateDraftAction createDraftAction, final String str) {
        if (mailMessage == null || createDraftAction == null) {
            Log.m165383e("MailMessageListActivity", "navigateToShareDraft invalid parameters");
        } else {
            C42176e.m168344a().mo152232b(new CreateDraft.C42054a().mo151085a(mailMessage.mo151627z()).mo151087b(mailMessage.mo151581b()).mo151084a(mailMessage.mo151615o()).mo151083a(createDraftAction.getValue()).mo151086a(), new IGetDataCallback<MailCreateShareMessageDraftResponse>() {
                /* class com.ss.android.lark.mail.impl.message.view.MailMessageListView.C431607 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("MailMessageListActivity", "navigateToShareDraft onError");
                }

                /* renamed from: a */
                public void onSuccess(MailCreateShareMessageDraftResponse mailCreateShareMessageDraftResponse) {
                    String str;
                    ComposeMailAction composeMailAction;
                    Log.m165389i("MailMessageListActivity", "navigateToShareDraft onSuccess");
                    if (mailCreateShareMessageDraftResponse == null) {
                        Log.m165383e("MailMessageListActivity", "navigateToShareDraft onSuccess empty response");
                    } else if (!mailCreateShareMessageDraftResponse.can_reply.booleanValue()) {
                        Log.m165389i("MailMessageListActivity", "navigateToShareDraft can not reply");
                        MailToast.m173697a((int) R.string.Mail_Share_Notrcptoast);
                        C42209j.m168612a("read_forward_not_recipient_fail", "toast");
                    } else if (mailCreateShareMessageDraftResponse.draft == null) {
                        Log.m165383e("MailMessageListActivity", "navigateToShareDraft onSuccess empty draft");
                    } else {
                        int i = C431543.f109878a[createDraftAction.ordinal()];
                        if (i == 1) {
                            composeMailAction = new ReplyMailAction(mailCreateShareMessageDraftResponse.draft.id, str);
                            str = "reply";
                        } else if (i == 2) {
                            composeMailAction = new ReplyAllMailAction(mailCreateShareMessageDraftResponse.draft.id, str);
                            str = "reply_all";
                        } else if (i != 3) {
                            Log.m165383e("MailMessageListActivity", "fetchDraft wrong action");
                            return;
                        } else {
                            composeMailAction = new ForwardMailAction(mailCreateShareMessageDraftResponse.draft.id, str);
                            str = "forward";
                        }
                        C42699a.m170227a(MailMessageListView.this.f109706n, mailMessage, C42130j.m168150a().mo152078a(mailCreateShareMessageDraftResponse.draft), composeMailAction, mailCreateShareMessageDraftResponse.draft.permission_code, "", str);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: b */
    public void mo154335b(MailMessage mailMessage, String str, String str2) {
        Log.m165389i("MailMessageListActivity", "navigateToReplyAll");
        PermissionCode c = this.f109694b.mo152021c();
        if (c == null || c == PermissionCode.NONE) {
            C42699a.m170263b(this.f109706n, mailMessage, str, this.ae.mo154087b(), str2);
        } else {
            m171568a(mailMessage, MailCreateDraftRequest.CreateDraftAction.REPLY_ALL, str2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView
    /* renamed from: a */
    public void mo154443a(int i, String str, final MailMessage mailMessage) {
        C42187a.m168483a(mailMessage.mo151581b(), mailMessage.mo151627z(), i);
        final String I = mailMessage.mo151556I();
        C42176e.m168344a().mo152195a(new CreateDraft.C42054a().mo151085a(mailMessage.mo151627z()).mo151087b(mailMessage.mo151581b()).mo151088c(str).mo151084a(mailMessage.mo151615o()).mo151083a(MailCreateDraftRequest.CreateDraftAction.REPLY_ALL.getValue()).mo151089d(I).mo151086a(), new IGetDataCallback<MailDraft>() {
            /* class com.ss.android.lark.mail.impl.message.view.MailMessageListView.C431532 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("MailMessageListActivity", "nativeToSmartReplyAll create smart reply draft err " + errorResult.getDebugMsg());
            }

            /* renamed from: a */
            public void onSuccess(MailDraft mailDraft) {
                mailDraft.mo151353h(I);
                C42699a.m170227a(MailMessageListView.this.f109706n, mailMessage, mailDraft, new ReplyAllMailAction(mailDraft.mo151321a(), "smart_reply_suggestion"), PermissionCode.NONE, "", "smart_reply");
            }
        });
        C42330c.m169048a(C42330c.C42333b.f107637A);
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154318a(MailMessage mailMessage, String str, String str2) {
        Log.m165389i("MailMessageListActivity", "navigateToReply");
        PermissionCode c = this.f109694b.mo152021c();
        if (c == null || c == PermissionCode.NONE) {
            C42699a.m170229a(this.f109706n, mailMessage, str, this.ae.mo154087b(), str2);
        } else {
            m171568a(mailMessage, MailCreateDraftRequest.CreateDraftAction.REPLY, str2);
        }
    }
}
