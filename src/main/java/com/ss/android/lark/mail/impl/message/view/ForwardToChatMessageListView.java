package com.ss.android.lark.mail.impl.message.view;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.ValueCallback;
import com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest;
import com.bytedance.lark.pb.email.client.v1.MailCreateForwardMessageDraftResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetMessageListResponse;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.bytedance.lark.pb.email.client.v1.ThreadSecurityLevel;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.action.ComposeMailAction;
import com.ss.android.lark.mail.impl.action.ForwardMailAction;
import com.ss.android.lark.mail.impl.action.ReplyAllMailAction;
import com.ss.android.lark.mail.impl.action.ReplyMailAction;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.entity.C42104p;
import com.ss.android.lark.mail.impl.entity.CreateDraft;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.message.framework.AbstractC42924a;
import com.ss.android.lark.mail.impl.message.p2203c.C42844a;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.ForwardToChatMessageListIntentInfo;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42306q;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.utils.C43752b;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.p2225a.C43909a;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.FoldingButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ReadMailSearchButton;
import com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar;
import java.util.ArrayList;
import org.json.JSONObject;

public class ForwardToChatMessageListView extends AbsMessageTemplateView {

    /* renamed from: V */
    protected String f109844V;

    /* renamed from: W */
    protected String f109845W;
    public FoldingButton aa;
    public boolean ab;
    public C43909a ac;
    private final String ad = "ForwardToChatMessageList";
    private final String ae = "javascript:foldallmessage";
    private final String af = "javascript:unfoldallmessage";

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: R */
    public void mo154307R() {
        this.f109702j = false;
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154311a(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: b */
    public final void mo154340b(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public int getThreadType() {
        return 3;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: g */
    public void mo154356g() {
        super.mo154356g();
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public final String getCurrentThreadId() {
        return this.f109699g;
    }

    /* renamed from: T */
    private void m171543T() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.AnonymousClass10 */

            public void run() {
                if (ForwardToChatMessageListView.this.ac == null) {
                    ForwardToChatMessageListView forwardToChatMessageListView = ForwardToChatMessageListView.this;
                    forwardToChatMessageListView.ac = new C43909a(forwardToChatMessageListView.getContext());
                }
                ForwardToChatMessageListView.this.ac.mo156327a(C43819s.m173684a((int) R.string.Mail_Normal_Loading));
            }
        });
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public final int getTemplateLayout() {
        if (C42871i.m170779b()) {
            return R.layout.mail_message_list_tab_item_frame;
        }
        return R.layout.mail_message_list_tab_item;
    }

    /* renamed from: t */
    public void mo152896t() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.AnonymousClass11 */

            public void run() {
                if (ForwardToChatMessageListView.this.ac != null) {
                    ForwardToChatMessageListView.this.ac.mo156326a();
                }
            }
        });
    }

    /* renamed from: S */
    private void m171542S() {
        Log.m165389i("ForwardToChatMessageList", "expandAllMessages");
        mo154323a("javascript:unfoldallmessage", (com.alibaba.fastjson.JSONObject) null, new ValueCallback<String>() {
            /* class com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.C431479 */

            /* renamed from: a */
            public void onReceiveValue(String str) {
                Log.m165389i("ForwardToChatMessageList", "expandAllMessages done");
                ForwardToChatMessageListView.this.f109706n.runOnUiThread(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.C431479.RunnableC431481 */

                    public void run() {
                        ForwardToChatMessageListView.this.ab = false;
                        ForwardToChatMessageListView.this.aa.update(FoldingButton.Type.Fold);
                        ForwardToChatMessageListView.this.aa.setEnable(true);
                    }
                });
            }
        });
    }

    /* renamed from: y */
    private void m171546y() {
        Log.m165389i("ForwardToChatMessageList", "foldAllMessages");
        mo154323a("javascript:foldallmessage", (com.alibaba.fastjson.JSONObject) null, new ValueCallback<String>() {
            /* class com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.C431458 */

            /* renamed from: a */
            public void onReceiveValue(String str) {
                Log.m165389i("ForwardToChatMessageList", "foldAllMessages done");
                ForwardToChatMessageListView.this.f109706n.runOnUiThread(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.C431458.RunnableC431461 */

                    public void run() {
                        ForwardToChatMessageListView.this.ab = true;
                        ForwardToChatMessageListView.this.aa.update(FoldingButton.Type.Expand);
                        ForwardToChatMessageListView.this.aa.setEnable(true);
                    }
                });
            }
        });
    }

    public void getMessageListFromNet() {
        Log.m165389i("ForwardToChatMessageList", "getMessageListFromNet");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.$$Lambda$AhzNMZGrQ0xnsoejFu1UzfT3ww */

            public final void run() {
                ForwardToChatMessageListView.this.mo154373r();
            }
        });
        C42176e.m168344a().mo152254f(this.f109844V, this.f109845W, new IGetDataCallback<MailGetMessageListResponse>() {
            /* class com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.C431414 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ForwardToChatMessageList", "initData onError");
                if (ForwardToChatMessageListView.this.f109674D != null) {
                    ForwardToChatMessageListView.this.f109674D.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(MailGetMessageListResponse mailGetMessageListResponse) {
                if (mailGetMessageListResponse == null || CollectionUtils.isEmpty(mailGetMessageListResponse.message_items)) {
                    Log.m165383e("ForwardToChatMessageList", "initData onSuccess invalid response");
                    if (ForwardToChatMessageListView.this.f109674D != null) {
                        ForwardToChatMessageListView.this.f109674D.onError(new ErrorResult("invalid data"));
                        return;
                    }
                    return;
                }
                C42099l a = ForwardToChatMessageListView.this.mo154506a(mailGetMessageListResponse);
                ForwardToChatMessageListView.this.mo154507d(a);
                if (ForwardToChatMessageListView.this.f109674D != null) {
                    ForwardToChatMessageListView.this.f109674D.onSuccess(a);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView$3 */
    public static /* synthetic */ class C431403 {

        /* renamed from: a */
        static final /* synthetic */ int[] f109858a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest$CreateDraftAction[] r0 = com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest.CreateDraftAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.C431403.f109858a = r0
                com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest$CreateDraftAction r1 = com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest.CreateDraftAction.REPLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.C431403.f109858a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest$CreateDraftAction r1 = com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest.CreateDraftAction.REPLY_ALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.C431403.f109858a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest$CreateDraftAction r1 = com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest.CreateDraftAction.FORWARD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.C431403.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public void getData() {
        Log.m165389i("ForwardToChatMessageList", "initData");
        C42306q qVar = (C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g);
        if (qVar != null) {
            qVar.mo152391h("key_get_rust_data_start");
        }
        C42176e.m168344a().mo152251e(this.f109844V, this.f109845W, new IGetDataCallback<MailGetMessageListResponse>() {
            /* class com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.C431371 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ForwardToChatMessageListView.this.getMessageListFromNet();
            }

            /* renamed from: a */
            public void onSuccess(MailGetMessageListResponse mailGetMessageListResponse) {
                if (mailGetMessageListResponse == null || CollectionUtils.isEmpty(mailGetMessageListResponse.message_items)) {
                    ForwardToChatMessageListView.this.getMessageListFromNet();
                    return;
                }
                C42099l a = ForwardToChatMessageListView.this.mo154506a(mailGetMessageListResponse);
                ForwardToChatMessageListView.this.mo154507d(a);
                if (ForwardToChatMessageListView.this.f109674D != null) {
                    ForwardToChatMessageListView.this.f109674D.onSuccess(a);
                }
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: d */
    public void mo154350d() {
        super.mo154350d();
        Log.m165389i("ForwardToChatMessageList", "testAsynRender init 11111" + this);
        this.f109677G = (OperationTitleBar) this.f109706n.findViewById(R.id.message_list_operation_title_bar);
        this.f109677G.setListener(new OperationTitleBar.AbstractC43958a() {
            /* class com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.C431425 */

            @Override // com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.AbstractC43958a
            /* renamed from: a */
            public void mo150696a() {
                ForwardToChatMessageListView.this.f109706n.finish();
            }
        });
        this.aa = new FoldingButton(new AbsButton.AbstractC43948a() {
            /* class com.ss.android.lark.mail.impl.message.view.$$Lambda$ForwardToChatMessageListView$p5XpUKM8HBR8d3S2Lps3gWkWg6A */

            @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
            public final void onButtonClick(View view) {
                ForwardToChatMessageListView.this.m171544a((ForwardToChatMessageListView) view);
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.aa);
        if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.readmail.contentsearch")) {
            arrayList.add(new ReadMailSearchButton(new AbsButton.AbstractC43948a() {
                /* class com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.C431436 */

                @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
                public void onButtonClick(View view) {
                    if (ForwardToChatMessageListView.this.f109710r) {
                        ForwardToChatMessageListView.this.f109711s.mo153968a(true);
                    }
                }
            }));
        }
        this.f109677G.mo156419a(arrayList, null);
    }

    public ForwardToChatMessageListView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154317a(MailMessage mailMessage) {
        Log.m165389i("ForwardToChatMessageList", "showTranslatingLanguageSelectionDialog");
        this.f109716x.mo154127b(this.f109844V, mailMessage, this.f109845W);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m171544a(View view) {
        Log.m165389i("ForwardToChatMessageList", "foldingButton onlick");
        this.aa.setEnable(false);
        if (this.ab) {
            m171542S();
            this.f109698f.mo153738a(this.f109844V, false);
            return;
        }
        m171546y();
        this.f109698f.mo153738a(this.f109844V, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo154507d(C42099l lVar) {
        this.f109705m.mo153780a(lVar);
        this.f109694b = new C42104p(this.f109699g, null, null, PermissionCode.NONE, false, ThreadSecurityLevel.UNKNOWN, false, lVar.mo151994k());
        this.f109694b.mo152020b(true);
        this.f109693a = lVar.mo151973a();
        mo154295F();
        this.f109701i = lVar.mo151992i();
        if (C42871i.m170779b()) {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.RunnableC431447 */

                public void run() {
                    ForwardToChatMessageListView.this.mo154368j();
                    ForwardToChatMessageListView.this.f109681K.mo154537a(ForwardToChatMessageListView.this.f109686P, false);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: e */
    public void mo154353e(String str) {
        Log.m165389i("ForwardToChatMessageList", "navigateToBigContentView");
        C42699a.m170231a(getContext(), new ForwardToChatMessageListIntentInfo(this.f109700h, this.f109699g, str, 2, this.f109844V, this.f109845W, this.f109705m.mo153785b().mo154059j()), 7);
    }

    /* renamed from: a */
    public C42099l mo154506a(MailGetMessageListResponse mailGetMessageListResponse) {
        C42099l lVar = new C42099l();
        lVar.mo151981b(C42130j.m168150a().mo152086b(mailGetMessageListResponse.drafts));
        lVar.mo151977a(C42130j.m168150a().mo152087c(mailGetMessageListResponse.message_items));
        lVar.mo151976a(this.f109699g);
        lVar.mo151974a(mailGetMessageListResponse.code);
        lVar.mo151978a(mailGetMessageListResponse.is_external.booleanValue());
        lVar.mo151975a(mailGetMessageListResponse.security_level);
        lVar.mo151987d(mailGetMessageListResponse.label_ids);
        lVar.mo151982b(mailGetMessageListResponse.is_flagged.booleanValue());
        lVar.mo151980b(mailGetMessageListResponse.subject);
        lVar.mo151985c(mailGetMessageListResponse.is_read.booleanValue());
        return lVar;
    }

    public ForwardToChatMessageListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: b */
    public void mo154339b(String str, MailMessage mailMessage) {
        Log.m165389i("ForwardToChatMessageList", "translateMessage");
        this.f109716x.mo154115a(this.f109844V, mailMessage, this.f109845W);
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154318a(MailMessage mailMessage, String str, String str2) {
        Log.m165389i("ForwardToChatMessageList", "navigateToReply");
        m171545a(mailMessage, str2, MailCreateDraftRequest.CreateDraftAction.REPLY);
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: b */
    public void mo154335b(MailMessage mailMessage, String str, String str2) {
        Log.m165389i("ForwardToChatMessageList", "navigateToReplyAll");
        m171545a(mailMessage, str2, MailCreateDraftRequest.CreateDraftAction.REPLY_ALL);
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: c */
    public void mo154345c(MailMessage mailMessage, String str, String str2) {
        Log.m165389i("ForwardToChatMessageList", "navigateToForward");
        m171545a(mailMessage, str2, MailCreateDraftRequest.CreateDraftAction.FORWARD);
    }

    /* renamed from: a */
    private void m171545a(final MailMessage mailMessage, final String str, final MailCreateDraftRequest.CreateDraftAction createDraftAction) {
        m171543T();
        final String I = mailMessage.mo151556I();
        C42176e.m168344a().mo152204a(this.f109845W, new CreateDraft.C42054a().mo151087b(mailMessage.mo151581b()).mo151083a(createDraftAction.getValue()).mo151084a(mailMessage.mo151615o()).mo151089d(I).mo151090e(this.f109844V).mo151086a(), new IGetDataCallback<MailCreateForwardMessageDraftResponse>() {
            /* class com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.C431382 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ForwardToChatMessageList", "fetchDraft onError");
                ForwardToChatMessageListView.this.mo152896t();
                MailToast.m173697a((int) R.string.Mail_Share_Notrcptoast);
                C42209j.m168612a("read_forward_not_recipient_fail", "toast");
            }

            /* renamed from: a */
            public void onSuccess(final MailCreateForwardMessageDraftResponse mailCreateForwardMessageDraftResponse) {
                final String str;
                final ComposeMailAction composeMailAction;
                Log.m165389i("ForwardToChatMessageList", "fetchDraft onSuccess");
                ForwardToChatMessageListView.this.mo152896t();
                if (mailCreateForwardMessageDraftResponse == null) {
                    Log.m165383e("ForwardToChatMessageList", "fetchDraft empty response");
                } else if (!mailCreateForwardMessageDraftResponse.can_reply.booleanValue() || mailCreateForwardMessageDraftResponse.draft == null || TextUtils.isEmpty(mailCreateForwardMessageDraftResponse.draft.id)) {
                    Log.m165397w("ForwardToChatMessageList", "fetchDraft blocked");
                    MailToast.m173697a((int) R.string.Mail_Share_Notrcptoast);
                    C42209j.m168612a("read_forward_not_recipient_fail", "toast");
                } else {
                    int i = C431403.f109858a[createDraftAction.ordinal()];
                    if (i == 1) {
                        composeMailAction = new ReplyMailAction(mailCreateForwardMessageDraftResponse.draft.id, str);
                        str = "reply";
                    } else if (i == 2) {
                        composeMailAction = new ReplyAllMailAction(mailCreateForwardMessageDraftResponse.draft.id, str);
                        str = "reply_all";
                    } else if (i != 3) {
                        Log.m165383e("ForwardToChatMessageList", "fetchDraft wrong action");
                        return;
                    } else {
                        composeMailAction = new ForwardMailAction(mailCreateForwardMessageDraftResponse.draft.id, str);
                        str = "forward";
                    }
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.message.view.ForwardToChatMessageListView.C431382.RunnableC431391 */

                        public void run() {
                            MailDraft a = C42130j.m168150a().mo152078a(mailCreateForwardMessageDraftResponse.draft);
                            a.mo151353h(I);
                            C42699a.m170227a(ForwardToChatMessageListView.this.f109706n, mailMessage, a, composeMailAction, mailCreateForwardMessageDraftResponse.draft.permission_code, "", str);
                        }
                    });
                    C43752b.m173435a(ForwardToChatMessageListView.this.f109706n);
                }
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154321a(C42844a aVar, boolean z, AbstractC42924a aVar2, int i) {
        ForwardToChatMessageListIntentInfo forwardToChatMessageListIntentInfo = (ForwardToChatMessageListIntentInfo) aVar.mo153785b();
        this.f109844V = forwardToChatMessageListIntentInfo.mo154041a();
        this.f109845W = forwardToChatMessageListIntentInfo.mo154042b();
        super.mo154321a(aVar, z, aVar2, i);
    }
}
