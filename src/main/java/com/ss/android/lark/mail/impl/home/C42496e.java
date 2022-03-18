package com.ss.android.lark.mail.impl.home;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.trace.p155a.C3069b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.lark.pb.email.client.v1.FilterType;
import com.bytedance.lark.pb.email.client.v1.MailCancelScheduleSendResponse;
import com.bytedance.lark.pb.email.client.v1.MailMoveToFolderResponse;
import com.bytedance.lark.pb.email.client.v1.MailMultiThreadDeletePermanentlyResponse;
import com.bytedance.lark.pb.email.client.v1.SetMailsAllReadResponse;
import com.bytedance.lynx.webview.TTWebSdk;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.C42038d;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.action.ArchiveThreadListMailAction;
import com.ss.android.lark.mail.impl.action.C41814a;
import com.ss.android.lark.mail.impl.action.DiscardMultiDraftsAction;
import com.ss.android.lark.mail.impl.action.MoveToInboxThreadListMailAction;
import com.ss.android.lark.mail.impl.action.NotSpamListAction;
import com.ss.android.lark.mail.impl.action.OutboxMailAction;
import com.ss.android.lark.mail.impl.action.PushInvalidCacheAction;
import com.ss.android.lark.mail.impl.action.PushMultiThreadAction;
import com.ss.android.lark.mail.impl.action.PushRefreshCurrentThreadListAction;
import com.ss.android.lark.mail.impl.action.PushThreadChangeAction;
import com.ss.android.lark.mail.impl.action.ReadThreadListMailAction;
import com.ss.android.lark.mail.impl.action.TrashThreadListMailAction;
import com.ss.android.lark.mail.impl.badge.C41832a;
import com.ss.android.lark.mail.impl.client.C41878a;
import com.ss.android.lark.mail.impl.client.C41900f;
import com.ss.android.lark.mail.impl.compose.C41988g;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.entity.MigrationItem;
import com.ss.android.lark.mail.impl.entity.MigrationStage;
import com.ss.android.lark.mail.impl.home.C42444d;
import com.ss.android.lark.mail.impl.home.C42496e;
import com.ss.android.lark.mail.impl.home.menu.AbstractC42551b;
import com.ss.android.lark.mail.impl.home.menu.MailMenuComponent;
import com.ss.android.lark.mail.impl.home.menu.MailMenuViewModel;
import com.ss.android.lark.mail.impl.home.p2182b.AbstractC42436a;
import com.ss.android.lark.mail.impl.home.p2182b.C42437b;
import com.ss.android.lark.mail.impl.home.p2183c.C42441c;
import com.ss.android.lark.mail.impl.home.p2184d.C42460a;
import com.ss.android.lark.mail.impl.home.threadlist.C42593a;
import com.ss.android.lark.mail.impl.home.threadlist.MailFeedRecyclerView;
import com.ss.android.lark.mail.impl.home.threadlist.MailSmartRefreshLayout;
import com.ss.android.lark.mail.impl.home.threadlist.ThreadListComponent;
import com.ss.android.lark.mail.impl.home.threadlist.header.filter.FilterHeaderViewModel;
import com.ss.android.lark.mail.impl.home.threadlist.header.outbox.OutboxHeaderViewModel;
import com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.ISmartInboxCardCallback;
import com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxViewModel;
import com.ss.android.lark.mail.impl.home.threadlist.header.status.autoreply.AutoReplyTipsViewModel;
import com.ss.android.lark.mail.impl.home.threadlist.header.status.migration.MigrationTipsViewModel;
import com.ss.android.lark.mail.impl.home.threadlist.header.status.network.NetworkTipsViewModel;
import com.ss.android.lark.mail.impl.lark.C42723b;
import com.ss.android.lark.mail.impl.message.p2204d.AbstractC42870h;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.p2204d.C42879j;
import com.ss.android.lark.mail.impl.message.p2205e.C42886a;
import com.ss.android.lark.mail.impl.message.template.C43033b;
import com.ss.android.lark.mail.impl.network.NetworkChangeListener;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42207i;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42286k;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42322x;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42326y;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43307b;
import com.ss.android.lark.mail.impl.service.C43345c;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.service.C43383h;
import com.ss.android.lark.mail.impl.service.MailSplashService;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43317d;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43337y;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43338z;
import com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43339a;
import com.ss.android.lark.mail.impl.service.watchers.rustwatchers.SmartInboxCardChangeWatcher;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionManager;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43725f;
import com.ss.android.lark.mail.impl.utils.C43764g;
import com.ss.android.lark.mail.impl.utils.C43791r;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.p2225a.C43909a;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;
import com.ss.android.lark.mail.impl.view.titlebar.C43959a;
import com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar;
import com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener;
import com.ss.android.lark.mail.impl.view.undo.AbstractC43977b;
import com.ss.android.lark.mail.impl.view.undo.UndoBar;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.C44032c;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44549f;
import com.ss.android.lark.maincore.ITitleInfo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.home.e */
public class C42496e extends BaseFragment implements WeakHandler.IHandler, C42723b.AbstractC42731a, AbstractC43317d, SmartInboxCardChangeWatcher, AbstractC43337y, AbstractC43338z, AbstractC43339a {

    /* renamed from: A */
    private C41878a f108156A = null;

    /* renamed from: B */
    private C43909a f108157B = null;

    /* renamed from: C */
    private C42438c f108158C;

    /* renamed from: D */
    private C42723b.AbstractC42731a.AbstractC42732a f108159D;

    /* renamed from: E */
    private AbstractC42870h f108160E;

    /* renamed from: a */
    WeakHandler f108161a = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: b */
    FrameLayout f108162b;

    /* renamed from: c */
    public MailSmartRefreshLayout f108163c;

    /* renamed from: d */
    protected MailFeedRecyclerView f108164d;

    /* renamed from: e */
    C42593a f108165e;

    /* renamed from: f */
    View f108166f;

    /* renamed from: g */
    UDEmptyState f108167g;

    /* renamed from: h */
    LKUIStatus f108168h;

    /* renamed from: i */
    FrameLayout f108169i;

    /* renamed from: j */
    OperationTitleBar f108170j;

    /* renamed from: k */
    ThreadActionManager f108171k;

    /* renamed from: l */
    protected C42460a f108172l;

    /* renamed from: m */
    protected AbstractC44549f f108173m;

    /* renamed from: n */
    public MailMenuComponent f108174n;

    /* renamed from: o */
    public AbstractC44548e f108175o;

    /* renamed from: p */
    protected ImageView f108176p;

    /* renamed from: q */
    public C3069b f108177q;

    /* renamed from: r */
    public C42444d f108178r;

    /* renamed from: s */
    public ThreadListComponent f108179s;

    /* renamed from: t */
    NetworkChangeListener f108180t = new NetworkChangeListener() {
        /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$Qe03ztRj0AHw72KR1uczz4IFWI4 */

        @Override // com.ss.android.lark.mail.impl.network.NetworkChangeListener
        public final void onNetworkChanged(NetworkChangeListener.NetworkLevel networkLevel) {
            C42496e.this.m169620a((C42496e) networkLevel);
        }
    };

    /* renamed from: u */
    C42531g f108181u;

    /* renamed from: v */
    C43307b.AbstractC43311a f108182v = new C43307b.AbstractC43311a() {
        /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$vw4dcCHHjguCFXKt6IvKuOHA8tQ */

        @Override // com.ss.android.lark.mail.impl.service.C43307b.AbstractC43311a
        public final void onActionChange(AbsChangeMailAction absChangeMailAction) {
            C42496e.this.m169615a((C42496e) absChangeMailAction);
        }
    };

    /* renamed from: w */
    C43345c.AbstractC43349b f108183w;

    /* renamed from: x */
    private final String f108184x = "MailContentFragment";

    /* renamed from: y */
    private ViewStub f108185y;

    /* renamed from: z */
    private ViewStub f108186z;

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m169626e(boolean z) {
    }

    /* renamed from: G */
    public C42460a mo152856G() {
        return this.f108172l;
    }

    /* renamed from: I */
    public C42593a mo152858I() {
        return this.f108165e;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    /* renamed from: a */
    public void mo152865a(AbstractC44549f fVar, AbstractC44548e eVar) {
        this.f108173m = fVar;
        this.f108175o = eVar;
        C42460a aVar = this.f108172l;
        if (aVar != null) {
            aVar.mo152760a(fVar, this.f108174n, eVar);
        }
    }

    /* renamed from: a */
    public void mo152860a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append("initView : context ");
        sb.append(context != null ? "not null" : "null");
        Log.m165389i("MailContentFragment", sb.toString());
        if (this.f108162b == null) {
            this.mContext = context;
            FrameLayout frameLayout = new FrameLayout(context);
            this.f108162b = frameLayout;
            frameLayout.setId(R.id.mail_tab_content);
            View inflate = LayoutInflater.from(context).inflate(R.layout.mail_home_fragment, (ViewGroup) null, false);
            this.f108163c = (MailSmartRefreshLayout) inflate.findViewById(R.id.mail_refreshLayout);
            this.f108164d = (MailFeedRecyclerView) inflate.findViewById(R.id.mailTabRecycleView);
            this.f108165e = null;
            ImageView imageView = (ImageView) inflate.findViewById(R.id.mail_compose_button);
            this.f108176p = imageView;
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass12 */

                public void onClick(View view) {
                    C42496e.this.mo152883h();
                    C42330c.m169063b();
                }
            });
            if (this.f108177q == null) {
                this.f108177q = new C3069b("MailContentFragment");
            }
            this.f108164d.setOnScrollListener(new RecyclerView.OnScrollListener() {
                /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass16 */

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                    boolean z = false;
                    if (i != 0) {
                        if (C42496e.this.f108177q != null) {
                            C42496e.this.f108177q.mo12923a();
                        }
                        if (C42496e.this.f108165e != null) {
                            C42496e.this.f108165e.mo153113a(false);
                        }
                    } else if (C42496e.this.f108177q != null) {
                        C42496e.this.f108177q.mo12926b();
                    }
                    if (i == 1) {
                        C42496e.this.f108164d.post(new Runnable() {
                            /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass16.RunnableC424981 */

                            public void run() {
                                C42496e.this.f108165e.mo153137s();
                            }
                        });
                    }
                    if (C42496e.this.f108176p != null) {
                        ImageView imageView = C42496e.this.f108176p;
                        if (i == 0) {
                            z = true;
                        }
                        imageView.setClickable(z);
                    }
                }
            });
            this.f108185y = (ViewStub) inflate.findViewById(R.id.mail_home_empty_hint_container);
            this.f108169i = (FrameLayout) inflate.findViewById(R.id.label_loading);
            this.f108186z = (ViewStub) inflate.findViewById(R.id.multiTitleBar);
            this.f108171k = new ThreadActionManager(new ThreadActionButtonListener() {
                /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass17 */

                @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
                public void onDeleteForeverClick() {
                    Log.m165389i("MailContentFragment", "multiSelectHandler onDeleteForeverClick");
                    C42434b.m169444c(C42496e.this.mContext, new DialogInterface.OnClickListener() {
                        /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$17$XoXjiJfcDB6gMEg_A5z5tjvABv0 */

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C42496e.AnonymousClass17.this.m169684a(dialogInterface, i);
                        }
                    });
                    C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107663p);
                }

                @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
                public void onCancelScheduleSendClick() {
                    Log.m165389i("MailContentFragment", "multiSelectHandler onCancelScheduleSendClick");
                    C42176e.m168344a().mo152224a(C42496e.this.f108165e.mo153123e(), "", new AbstractC41870b<MailCancelScheduleSendResponse>() {
                        /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass17.C425013 */

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public /* synthetic */ void m169690a() {
                            C42496e.this.mo152893q();
                        }

                        @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
                        /* renamed from: a */
                        public void mo150434a(ErrorResult errorResult) {
                            MailToast.m173697a((int) R.string.Mail_SendLater_CancelFailure);
                            C42209j.m168612a("schedule_send_cancel_fail", "toast");
                        }

                        /* renamed from: a */
                        public void mo150435a(MailCancelScheduleSendResponse mailCancelScheduleSendResponse) {
                            C43849u.m173826a(new Runnable() {
                                /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$17$3$7tadw_apgGEckNG0nTrxecFRf14 */

                                public final void run() {
                                    C42496e.AnonymousClass17.C425013.this.m169690a();
                                }
                            });
                            MailToast.m173697a((int) R.string.Mail_SendLater_Cancelsucceed);
                            C42330c.m169076e();
                        }
                    });
                    C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107640D);
                }

                @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
                public void onChangeLabelClick() {
                    Log.m165389i("MailContentFragment", "multiSelectHandler onChangeLabelClick");
                    C42496e.this.mo152893q();
                    C42699a.m170246a(C42496e.this.getContext(), C42496e.this.f108165e.mo153122d(), C42496e.this.mo152892p());
                    C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107656i);
                }

                @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
                public void onMoveToFolderClick() {
                    C42496e.this.mo152893q();
                    C42187a.m168576w(C42187a.C42191c.f107435L);
                    C42699a.m170281d(C42496e.this.mContext, C42496e.this.f108165e.mo153123e(), C42496e.this.mo152892p());
                    C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107645I);
                }

                @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
                public void onMoveToInboxClick() {
                    Log.m165389i("MailContentFragment", "multiSelectHandler onMoveToInboxClick");
                    C42496e.this.mo152893q();
                    C43307b.m172030a().mo154977a(new MoveToInboxThreadListMailAction(C42496e.this.f108165e.mo153123e(), C42496e.this.mo152892p(), new ArrayList()));
                    C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107662o);
                }

                @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
                public void onMoveToLabelClick() {
                    C42496e.this.mo152893q();
                    C42699a.m170245a(C42496e.this.mContext, C42496e.this.f108165e.mo153123e(), C42496e.this.mo152892p());
                    C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107661n);
                }

                @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
                public void onNotSpamClick() {
                    Log.m165389i("MailContentFragment", "multiSelectHandler onNotSpamClick");
                    C42496e.this.mo152893q();
                    C43307b.m172030a().mo154977a(new NotSpamListAction(C42496e.this.f108165e.mo153123e(), C42496e.this.mo152892p(), new ArrayList()));
                    C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107653f);
                }

                @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
                public void onArchiveClick() {
                    int i;
                    Log.m165389i("MailContentFragment", "multiSelectHandler onArchiveClick");
                    C42496e.this.mo152893q();
                    C43307b.m172030a().mo154977a(new ArchiveThreadListMailAction(C42496e.this.f108165e.mo153123e(), C42496e.this.mo152892p(), new ArrayList()));
                    if (C42496e.this.f108165e.mo153123e() == null) {
                        i = 0;
                    } else {
                        i = C42496e.this.f108165e.mo153123e().size();
                    }
                    C42187a.m168469a(i, true, C42187a.C42191c.f107434K);
                    C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107650c);
                }

                @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
                public void onDeleteClick() {
                    int i;
                    Log.m165389i("MailContentFragment", "multiSelectHandler onDeleteClick");
                    String p = C42496e.this.mo152892p();
                    if (p.equals("DRAFT")) {
                        C42434b.m169443b(C42496e.this.mContext, new DialogInterface.OnClickListener(p) {
                            /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$17$59znr0pVQ9fHQfQW1DBY2Cpzz1g */
                            public final /* synthetic */ String f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C42496e.AnonymousClass17.this.m169685a(this.f$1, dialogInterface, i);
                            }
                        });
                    } else {
                        C42496e.this.mo152893q();
                        C43307b.m172030a().mo154977a(new TrashThreadListMailAction(C42496e.this.f108165e.mo153123e(), p, new ArrayList()));
                        if (C42496e.this.f108165e.mo153123e() == null) {
                            i = 0;
                        } else {
                            i = C42496e.this.f108165e.mo153123e().size();
                        }
                        C42187a.m168499b(i, true, C42187a.C42191c.f107434K);
                    }
                    C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107651d);
                }

                @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
                public void onMoveToImportantClick() {
                    C42176e.m168344a().mo152225a(C42496e.this.f108165e.mo153123e(), "OTHER", "IMPORTANT", new IGetDataCallback<MailMoveToFolderResponse>() {
                        /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass17.C424991 */

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public /* synthetic */ void m169686a() {
                            C42496e.this.mo152893q();
                        }

                        /* renamed from: a */
                        public void onSuccess(MailMoveToFolderResponse mailMoveToFolderResponse) {
                            C43849u.m173826a(new Runnable() {
                                /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$17$1$yvspV5ymAcQbbAipTaMUSQLD6Q */

                                public final void run() {
                                    C42496e.AnonymousClass17.C424991.this.m169686a();
                                }
                            });
                            MailToast.m173697a((int) R.string.Mail_SmartInbox_MoveToImportant_Success);
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            MailToast.m173697a((int) R.string.Mail_CustomLabels_FailedToast);
                            C42209j.m168612a("label_create_custom_fail", "toast");
                        }
                    });
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i = 0; i < C42496e.this.f108165e.mo153123e().size(); i++) {
                        stringBuffer.append(C42496e.this.f108165e.mo153123e());
                        if (i < C42496e.this.f108165e.mo153123e().size() - 1) {
                            stringBuffer.append(",");
                        }
                    }
                    C42187a.m168506b(C42187a.C42191c.f107446W, C42187a.C42191c.aa, stringBuffer.toString(), C42187a.C42191c.ad);
                    C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107670w);
                }

                @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
                public void onMoveToOtherClick() {
                    C42176e.m168344a().mo152225a(C42496e.this.f108165e.mo153123e(), "IMPORTANT", "OTHER", new IGetDataCallback<MailMoveToFolderResponse>() {
                        /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass17.C425002 */

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public /* synthetic */ void m169688a() {
                            C42496e.this.mo152893q();
                        }

                        /* renamed from: a */
                        public void onSuccess(MailMoveToFolderResponse mailMoveToFolderResponse) {
                            C43849u.m173826a(new Runnable() {
                                /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$17$2$nELV1QWkeuFI1C4HmjxWIOsbgDE */

                                public final void run() {
                                    C42496e.AnonymousClass17.C425002.this.m169688a();
                                }
                            });
                            MailToast.m173697a((int) R.string.Mail_SmartInbox_MoveToOthers_Success);
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            MailToast.m173697a((int) R.string.Mail_CustomLabels_FailedToast);
                            C42209j.m168612a("label_create_custom_fail", "toast");
                        }
                    });
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i = 0; i < C42496e.this.f108165e.mo153123e().size(); i++) {
                        stringBuffer.append(C42496e.this.f108165e.mo153123e());
                        if (i < C42496e.this.f108165e.mo153123e().size() - 1) {
                            stringBuffer.append(",");
                        }
                    }
                    C42187a.m168506b(C42187a.C42191c.f107447X, C42187a.C42191c.aa, stringBuffer.toString(), C42187a.C42191c.ad);
                    C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107669v);
                }

                @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
                public void onReadClick() {
                    int i;
                    Log.m165389i("MailContentFragment", "multiSelectHandler onReadClick");
                    C42496e.this.mo152893q();
                    C43307b.m172030a().mo154977a(new ReadThreadListMailAction((List<String>) C42496e.this.f108165e.mo153123e(), C42496e.this.mo152892p(), true));
                    if (C42496e.this.f108165e.mo153123e() == null) {
                        i = 0;
                    } else {
                        i = C42496e.this.f108165e.mo153123e().size();
                    }
                    C42187a.m168492a(true, i, true, C42187a.C42191c.f107434K);
                    C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107654g);
                }

                @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
                public void onSpamClick() {
                    int i;
                    Log.m165389i("MailContentFragment", "multiSelectHandler onSpamClick");
                    C42496e.this.mo152893q();
                    C42886a.m170828a(C42496e.this.f108165e.mo153123e(), (String) null, C42496e.this.mo152892p());
                    if (C42496e.this.f108165e.mo153123e() == null) {
                        i = 0;
                    } else {
                        i = C42496e.this.f108165e.mo153123e().size();
                    }
                    C42187a.m168512c(i, true, C42187a.C42191c.f107434K);
                    C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107646J);
                }

                @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
                public void onUnreadClick() {
                    int i;
                    Log.m165389i("MailContentFragment", "multiSelectHandler onUnreadClick");
                    C42496e.this.mo152893q();
                    C43307b.m172030a().mo154977a(new ReadThreadListMailAction((List<String>) C42496e.this.f108165e.mo153123e(), C42496e.this.mo152892p(), false));
                    if (C42496e.this.f108165e.mo153123e() == null) {
                        i = 0;
                    } else {
                        i = C42496e.this.f108165e.mo153123e().size();
                    }
                    C42187a.m168492a(false, i, true, C42187a.C42191c.f107434K);
                    C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107655h);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m169684a(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    C42496e.this.mo152872a(true);
                    C42176e.m168344a().mo152244c(C42496e.this.mo152892p(), C42496e.this.f108165e.mo153123e(), new IGetDataCallback<MailMultiThreadDeletePermanentlyResponse>() {
                        /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass17.C425024 */

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public /* synthetic */ void m169694a() {
                            C42496e.this.mo152893q();
                        }

                        /* renamed from: a */
                        public void onSuccess(MailMultiThreadDeletePermanentlyResponse mailMultiThreadDeletePermanentlyResponse) {
                            Log.m165389i("MailContentFragment", "onDeleteForeverClick, delete forever success");
                            C43849u.m173826a(new Runnable() {
                                /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$17$4$GPdHdEoe9CP8HGR_RDE9PPH18hs */

                                public final void run() {
                                    C42496e.AnonymousClass17.C425024.this.m169694a();
                                }
                            });
                            C42496e.this.mo152872a(false);
                            MailToast.m173698a((int) R.string.Mail_Toast_DeleteThreadsSuccess, MailToast.Type.SUCCESS);
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165383e("MailContentFragment", "onDeleteForeverClick, delete forever fail,code :" + errorResult.getErrorCode());
                            C42496e.this.mo152872a(false);
                            MailToast.m173698a((int) R.string.Mail_Toast_OperationFailed, MailToast.Type.FAIL);
                            C42209j.m168613a("thread_delete_forever_fail", "toast", "threadlist");
                        }
                    });
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m169685a(String str, DialogInterface dialogInterface, int i) {
                    C42496e.this.mo152893q();
                    C43307b.m172030a().mo154977a(new DiscardMultiDraftsAction(C42496e.this.f108165e.mo153123e(), str));
                    C42187a.m168509b(true, C42187a.C42191c.f107427D);
                }
            });
            this.f108168h = new LKUIStatus.C25680a(this.f108169i).mo89855a(0.44d).mo89859a();
            this.f108162b.addView(inflate);
            C42723b.AbstractC42731a.AbstractC42732a aVar = this.f108159D;
            if (aVar != null) {
                mo152864a(aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo152872a(boolean z) {
        if (this.f108157B == null) {
            this.f108157B = new C43909a(this.mContext);
        }
        if (z) {
            this.f108157B.mo156327a(getString(R.string.Mail_ThreadAction_DeleteLoading));
        } else {
            this.f108157B.mo156326a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo152866a(String str, int i) {
        Log.m165389i("MailContentFragment", "MailContentFragment refreshData");
        C42531g gVar = this.f108181u;
        if (gVar != null) {
            if (gVar.mo152997f()) {
                mo152859a();
            }
            this.f108181u.mo152995d().mo152952a(str, i);
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.watchers.rustwatchers.SmartInboxCardChangeWatcher
    /* renamed from: a */
    public void mo152873a(boolean z, int i) {
        if (!z) {
            ((MailMenuViewModel) this.f108174n.getValue()).updateOtherLabelUI(false);
        } else if (i == 2) {
            ((MailMenuViewModel) this.f108174n.getValue()).updateOtherLabelUI(true);
        }
    }

    @Override // com.ss.android.lark.mail.impl.lark.C42723b.AbstractC42731a
    /* renamed from: a */
    public void mo152864a(final C42723b.AbstractC42731a.AbstractC42732a aVar) {
        if (this.f108162b == null) {
            this.f108159D = aVar;
            return;
        }
        Log.m165389i("MailContentFragment", "startMonitorContentDraw");
        this.f108159D = null;
        this.f108162b.getViewTreeObserver().addOnDrawListener(new ViewTreeObserver.OnDrawListener() {
            /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass18 */

            /* renamed from: a */
            boolean f108205a;

            /* renamed from: b */
            boolean f108206b;

            /* renamed from: a */
            private boolean m169696a() {
                if (C42496e.this.f108168h == null || C42496e.this.f108168h.mo89851h() || !C42496e.this.f108165e.mo153114a()) {
                    return false;
                }
                return true;
            }

            /* renamed from: b */
            private boolean m169697b() {
                return !((NetworkTipsViewModel) C42496e.this.f108179s.mo153184b().mo153237b().mo153273a().getValue()).isShowNetworkError();
            }

            public void onDraw() {
                if (!this.f108205a) {
                    this.f108205a = true;
                    aVar.mo153405a();
                }
                if (!this.f108206b && m169696a()) {
                    this.f108206b = true;
                    aVar.mo153406a(m169697b());
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass18.RunnableC425031 */

                        public void run() {
                            if (C42496e.this.f108162b != null) {
                                C42496e.this.f108162b.getViewTreeObserver().removeOnDrawListener(this);
                            }
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void mo152862a(MigrationItem mVar) {
        if (this.f108165e != null) {
            ((MigrationTipsViewModel) this.f108179s.mo153184b().mo153237b().mo153274b().getValue()).updateMigrationStatus(mVar);
            if (mVar != null && mVar.mo151996b() != MigrationStage.INVALID && "INBOX".equals(mo152892p()) && this.f108165e.getItemCount() < C42038d.C42039a.m167221a() && MigrationStage.DONE.ordinal() > mVar.mo151996b().ordinal()) {
                Log.m165389i("MailContentFragment", "onMigrationItemChange tryToPreLoadMore");
                this.f108179s.mo153185c().mo153151d().setNoMoreData(false);
                this.f108179s.mo153185c().mo153151d().autoLoadMore(this.f108181u.mo152995d(), this.f108165e.mo153128j(), true);
            }
        }
    }

    /* renamed from: a */
    public void mo152861a(MailLabelEntity mailLabelEntity, FilterType filterType, boolean z) {
        String str;
        if (mailLabelEntity != null) {
            this.f108163c.mo96237b();
            C43374f.m172264f().mo155112a(filterType != null ? filterType : FilterType.ALL_MAIL);
            if (this.f108165e.mo153125g()) {
                mo152893q();
            }
            String t = C43374f.m172264f().mo155132t();
            String q = C43374f.m172264f().mo155129q();
            C43374f.m172264f().mo155113a(mailLabelEntity);
            ((SmartInboxViewModel) this.f108179s.mo153184b().mo153239d().getValue()).updateSmartInboxVisibleTime(q, mailLabelEntity.mo151527k());
            String t2 = C43374f.m172264f().mo155132t();
            String str2 = "";
            if (mailLabelEntity.mo151494a() == 1) {
                str = mailLabelEntity.mo151529m() ? "Custom label" : "System label";
            } else {
                str = mailLabelEntity.mo151494a() == 2 ? "folder" : str2;
            }
            C42187a.m168521d(t, t2, str);
            if (z) {
                if (mailLabelEntity.mo151494a() == 1) {
                    ((C42322x) C42344d.m169091a(C42322x.class, this.mContext)).mo152380b("change_label");
                } else if (mailLabelEntity.mo151494a() == 2) {
                    ((C42322x) C42344d.m169091a(C42322x.class, this.mContext)).mo152380b("change_folder");
                }
            } else if (filterType == FilterType.ALL_MAIL) {
                ((C42322x) C42344d.m169091a(C42322x.class, this.mContext)).mo152380b("filter_all");
            } else if (filterType == FilterType.UNREAD) {
                ((C42322x) C42344d.m169091a(C42322x.class, this.mContext)).mo152380b("filter_unread");
            }
            String p = mo152892p();
            C42322x xVar = (C42322x) C42344d.m169091a(C42322x.class, this.mContext);
            if (p != null) {
                str2 = p;
            }
            xVar.mo152447j(str2);
        }
    }

    /* renamed from: a */
    public void mo152870a(List<MailThread> list, boolean z, boolean z2, boolean z3) {
        mo152871a(list, z, z2, z3, false);
    }

    /* renamed from: a */
    public void mo152871a(List<MailThread> list, boolean z, boolean z2, boolean z3, boolean z4) {
        MailFeedRecyclerView mailFeedRecyclerView;
        LinearLayoutManager linearLayoutManager;
        mo152899w();
        mo152893q();
        if (!z3 && !this.f108165e.mo153114a()) {
            ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152391h("key_set_adapter_data");
        }
        ((FilterHeaderViewModel) this.f108179s.mo153184b().mo153235a().getValue()).setFilterType(C43374f.m172264f().mo155135w());
        if (!z4) {
            this.f108179s.mo153185c().mo153151d().setNoMoreData(z);
        }
        if (list == null || list.isEmpty()) {
            Log.m165389i("MailContentFragment", "loadData setData data nothing:");
            C42593a aVar = this.f108165e;
            if (aVar != null) {
                aVar.mo153111a(new ArrayList(), C43374f.m172264f().mo155129q(), "", z, z4);
            }
            mo152879d(z3);
            return;
        }
        Log.m165389i("MailContentFragment", "loadData setData data:" + list.size());
        mo152886k();
        C42593a aVar2 = this.f108165e;
        if (aVar2 != null) {
            aVar2.mo153111a(list, C43374f.m172264f().mo155129q(), "", z, z4);
            if (!(!z2 || (mailFeedRecyclerView = this.f108164d) == null || (linearLayoutManager = (LinearLayoutManager) mailFeedRecyclerView.getLayoutManager()) == null)) {
                linearLayoutManager.scrollToPosition(0);
            }
            if (C42871i.m170779b()) {
                C43849u.m173827a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.home.C42496e.RunnableC425094 */

                    public void run() {
                        C42871i.m170775a().mo153854b(C42496e.this.getContext());
                    }
                }, 100);
            }
        }
    }

    /* renamed from: a */
    public void mo152869a(List<MailThread> list, boolean z) {
        mo152874b();
        this.f108179s.mo153185c().mo153151d().setNoMoreData(z);
        if (this.f108165e != null) {
            mo152886k();
            m169621a(list);
            this.f108165e.mo153112a(list, z);
            if (z) {
                this.f108179s.mo153185c().mo153151d().setNoMoreData(true);
                this.f108179s.mo153185c().mo153151d().finishLoadMore(true);
                return;
            }
            this.f108179s.mo153185c().mo153151d().finishLoadMore(true);
        }
    }

    /* renamed from: a */
    public void mo152863a(C42437b bVar) {
        ((OutboxHeaderViewModel) this.f108179s.mo153184b().mo153238c().getValue()).showOutbox(bVar);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43337y
    /* renamed from: a */
    public void mo152868a(List<String> list, String str) {
        String p = mo152892p();
        if (!TextUtils.isEmpty(p) && list.contains(p)) {
            C43307b.m172030a().mo154977a(new PushThreadChangeAction(str, p).mo150338a(list));
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43338z
    /* renamed from: a */
    public void mo152867a(String str, List<String> list, boolean z) {
        if (this.f108165e != null) {
            C43307b.m172030a().mo154977a(new PushMultiThreadAction(str, list, z, this.f108165e.mo153128j()));
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43317d
    /* renamed from: a */
    public void mo152676a(final MailLabelEntity mailLabelEntity, final boolean z) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass11 */

            public void run() {
                if (!(C42496e.this.f108165e == null || C42496e.this.f108165e.mo153117b() == null || z)) {
                    for (int i = 0; i < C42496e.this.f108165e.getItemCount(); i++) {
                        MailThread b = C42496e.this.f108165e.mo153116b(i);
                        if (b != null && b.mo151685a(mailLabelEntity, z)) {
                            C42496e.this.f108165e.notifyItemChanged(i);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: N */
    private int m169610N() {
        return this.f108172l.mo152771h();
    }

    /* renamed from: w */
    public void mo152899w() {
        C42460a aVar = this.f108172l;
        if (aVar != null) {
            aVar.mo152778o();
        }
    }

    /* renamed from: L */
    private void m169608L() {
        C43383h.m172311a().mo155145a("MailContentFragment", new C43383h.AbstractC43386b() {
            /* class com.ss.android.lark.mail.impl.home.C42496e.C425127 */

            @Override // com.ss.android.lark.mail.impl.service.C43383h.AbstractC43386b
            /* renamed from: a */
            public void mo152948a(AbstractC43977b bVar) {
                if (bVar != null && C42496e.this.getActivity() != null) {
                    bVar.mo156523a(new UndoBar.C43971a(C42496e.this.getActivity().getWindow(), C42496e.this.mContext).mo156501a(true));
                }
            }
        });
    }

    /* renamed from: A */
    public ITitleInfo mo152850A() {
        C42460a aVar = this.f108172l;
        if (aVar != null) {
            return aVar.mo152775l();
        }
        return null;
    }

    /* renamed from: C */
    public void mo152852C() {
        Log.m165389i("MailContentFragment", "clearSmartInboxUsageOnboarding");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass14 */

            public void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("all_email_smartinbox_intro");
                arrayList.add("all_email_previewcard");
                C41816b.m166115a().mo150118H().mo150195a(arrayList);
            }
        });
    }

    /* renamed from: F */
    public void mo152855F() {
        Log.m165389i("MailContentFragment", "showEnableSmartInboxOnboarding");
        this.f108178r.mo152744b();
    }

    /* renamed from: H */
    public AbstractC42870h mo152857H() {
        if (this.f108160E == null) {
            this.f108160E = new AbstractC42870h() {
                /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass15 */

                @Override // com.ss.android.lark.mail.impl.message.p2204d.AbstractC42870h
                /* renamed from: a */
                public ViewGroup mo152909a() {
                    ViewParent parent;
                    ViewParent parent2;
                    ViewParent parent3;
                    ViewParent parent4 = C42496e.this.f108162b.getParent();
                    if (parent4 != null && (parent3 = parent4.getParent()) != null && (parent3 instanceof CoordinatorLayout)) {
                        return (CoordinatorLayout) parent3;
                    }
                    if (!C41816b.m166115a().mo150143j() || (parent = C42496e.this.f108162b.getParent()) == null || !(parent instanceof FrameLayout) || (parent2 = ((FrameLayout) parent).getParent()) == null || !(parent2 instanceof RelativeLayout)) {
                        return null;
                    }
                    return (RelativeLayout) parent2;
                }
            };
        }
        return this.f108160E;
    }

    /* renamed from: b */
    public void mo152874b() {
        Log.m165389i("MailContentFragment", "dismissContentLoading");
        this.f108168h.mo89847d();
    }

    /* renamed from: d */
    public void mo152878d() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$c4seL7Sn6b0VkloE_MSy7odQ4g */

            public final void run() {
                C42496e.this.m169612P();
            }
        });
        MailSplashService.m171910d().mo154917a(this);
    }

    /* renamed from: f */
    public void mo152881f() {
        C41878a aVar = this.f108156A;
        if (aVar != null && this.f108172l != null) {
            aVar.mo150464e();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null) {
            return this.mContext;
        }
        return super.getContext();
    }

    /* renamed from: j */
    public void mo152885j() {
        this.f108179s.mo153185c().mo153151d().finishLoadMore(false);
    }

    /* renamed from: o */
    public MailLabelEntity mo152890o() {
        return C43374f.m172264f().mo155130r();
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43339a
    public void onActiveBlockPush() {
        Log.m165389i("MailContentFragment", "onActiveBlockPush");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.C42496e.RunnableC425149 */

            public void run() {
                C42496e.this.mo152866a("from_active_block_push", 2);
            }
        });
    }

    /* renamed from: p */
    public String mo152892p() {
        return C43374f.m172264f().mo155129q();
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43337y
    /* renamed from: t */
    public void mo152896t() {
        C43307b.m172030a().mo154977a(new PushInvalidCacheAction());
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43338z
    /* renamed from: y */
    public void mo152901y() {
        C43307b.m172030a().mo154977a(new PushRefreshCurrentThreadListAction());
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m169612P() {
        ThreadListComponent bVar = this.f108179s;
        if (bVar != null) {
            ((NetworkTipsViewModel) bVar.mo153184b().mo153237b().mo153273a().getValue()).resetStatus();
        }
    }

    /* renamed from: B */
    public void mo152851B() {
        Log.m165389i("MailContentFragment", "showSmartInboxUsageOnboarding");
        AnonymousClass13 r0 = new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass13 */

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ boolean m169682b() {
                return C42496e.this.mo152853D();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ boolean m169681a() {
                if (!C42496e.this.mo152853D() || C42496e.this.mo152854E() == null) {
                    return false;
                }
                return true;
            }

            public void run() {
                if (C42496e.this.mo152853D()) {
                    C42496e.this.f108178r.mo152742a(C42496e.this.f108172l.mo152773j(), new C42444d.AbstractC42458a() {
                        /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$13$qSHG3ZpbdBpTu3y1Kd5T_gZu2w */

                        @Override // com.ss.android.lark.mail.impl.home.C42444d.AbstractC42458a
                        public final boolean allowShow() {
                            return C42496e.AnonymousClass13.this.m169682b();
                        }
                    });
                    View E = C42496e.this.mo152854E();
                    if (E != null && E.getParent() != null) {
                        C42496e.this.f108178r.mo152743a(E, new C42444d.AbstractC42459b() {
                            /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$13$xU3Km8ofXv1IREVfFOGvNWCaDho */

                            @Override // com.ss.android.lark.mail.impl.home.C42444d.AbstractC42459b
                            public final boolean allowShow() {
                                return C42496e.AnonymousClass13.this.m169681a();
                            }
                        });
                    }
                }
            }
        };
        if (mo152853D()) {
            C43849u.m173826a(r0);
        } else {
            C43849u.m173827a(r0, 2000);
        }
    }

    /* renamed from: c */
    public void mo152876c() {
        C41878a aVar = this.f108156A;
        if (aVar != null) {
            aVar.mo150461b();
        }
        C42444d dVar = this.f108178r;
        if (dVar != null) {
            dVar.mo152741a();
        }
        C42460a aVar2 = this.f108172l;
        if (aVar2 != null) {
            aVar2.mo152779p();
        }
    }

    /* renamed from: e */
    public void mo152880e() {
        Log.m165389i("MailContentFragment", "reloadData");
        FrameLayout frameLayout = this.f108162b;
        if (frameLayout != null) {
            frameLayout.post(new Runnable() {
                /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$oeUs2WvB3OAIOxGFHHhcmDRHjZE */

                public final void run() {
                    C42496e.this.m169611O();
                }
            });
        }
    }

    /* renamed from: h */
    public void mo152883h() {
        Log.m165389i("MailContentFragment", "onCreateMailClick");
        if (!C43764g.m173481a("createNewMail")) {
            C42699a.m170247a(getContext(), true);
        }
    }

    /* renamed from: k */
    public void mo152886k() {
        View view = this.f108166f;
        if (view != null) {
            view.setVisibility(8);
        }
        MailSmartRefreshLayout mailSmartRefreshLayout = this.f108163c;
        if (mailSmartRefreshLayout != null) {
            mailSmartRefreshLayout.mo96243c(true);
            this.f108163c.setVisibility(0);
        }
    }

    /* renamed from: l */
    public void mo152887l() {
        ((NetworkTipsViewModel) this.f108179s.mo153184b().mo153237b().mo153273a().getValue()).updateNetworkStatus(true);
    }

    /* renamed from: m */
    public void mo152888m() {
        ((NetworkTipsViewModel) this.f108179s.mo153184b().mo153237b().mo153273a().getValue()).updateNetworkStatus(false);
    }

    /* renamed from: n */
    public void mo152889n() {
        ((OutboxHeaderViewModel) this.f108179s.mo153184b().mo153238c().getValue()).hideOutbox();
    }

    public C42496e() {
        C42723b.m170356a().mo153412b();
    }

    /* renamed from: J */
    private void m169606J() {
        MailMenuComponent cVar = new MailMenuComponent(this);
        this.f108174n = cVar;
        cVar.mo153028a(new AbstractC42551b() {
            /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass19 */

            @Override // com.ss.android.lark.mail.impl.home.menu.AbstractC42551b
            /* renamed from: a */
            public void mo152931a() {
                C43374f.m172264f().mo154944h();
            }

            @Override // com.ss.android.lark.mail.impl.home.menu.AbstractC42551b
            /* renamed from: b */
            public void mo152933b() {
                if (C42496e.this.f108172l != null) {
                    C42496e.this.f108172l.mo152767d(false);
                }
            }

            @Override // com.ss.android.lark.mail.impl.home.menu.AbstractC42551b
            /* renamed from: c */
            public void mo152934c() {
                if (C42496e.this.f108175o != null) {
                    C42496e.this.f108175o.mo99184a(C42496e.this.f108174n.mo153034g());
                }
            }

            @Override // com.ss.android.lark.mail.impl.home.menu.AbstractC42551b
            /* renamed from: a */
            public void mo152932a(MailLabelEntity mailLabelEntity) {
                C42496e.this.mo152861a(mailLabelEntity, FilterType.ALL_MAIL, true);
                C42879j.m170799a().mo153876c();
                C42330c.m169046a(mailLabelEntity);
            }
        });
        C42460a aVar = new C42460a(this);
        this.f108172l = aVar;
        aVar.mo152760a(this.f108173m, this.f108174n, this.f108175o);
        this.f108172l.mo152758a(new C42460a.AbstractC42473b() {
            /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass20 */

            @Override // com.ss.android.lark.mail.impl.home.p2184d.C42460a.AbstractC42473b
            /* renamed from: a */
            public void mo152796a() {
            }

            @Override // com.ss.android.lark.mail.impl.home.p2184d.C42460a.AbstractC42473b
            /* renamed from: e */
            public void mo152801e() {
                C42496e.this.f108179s.mo153188f();
            }

            @Override // com.ss.android.lark.mail.impl.home.p2184d.C42460a.AbstractC42473b
            /* renamed from: c */
            public void mo152799c() {
                if (C42496e.this.f108165e.mo153132n()) {
                    C42496e.this.mo152894r();
                    C42496e.this.mo152895s();
                    C42187a.m168568s(C42187a.C42191c.f107468s);
                }
            }

            @Override // com.ss.android.lark.mail.impl.home.p2184d.C42460a.AbstractC42473b
            /* renamed from: b */
            public void mo152798b() {
                Log.m165389i("MailContentFragment", "onSearchClick");
                C42187a.m168534g();
                C42699a.m170217a(C42496e.this.getContext(), C42496e.this.f108172l.mo152770g(), C42496e.this.f108172l.mo152771h());
            }

            @Override // com.ss.android.lark.mail.impl.home.p2184d.C42460a.AbstractC42473b
            /* renamed from: d */
            public void mo152800d() {
                Log.m165389i("MailContentFragment", "onMarkAllReadMailClick");
                final MailLabelEntity o = C42496e.this.mo152890o();
                if (o != null) {
                    C42434b.m169439a(C42496e.this.mContext, new DialogInterface.OnClickListener() {
                        /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass20.DialogInterface$OnClickListenerC425051 */

                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (C42496e.this.mContext != null) {
                                ((C42326y) C42344d.m169091a(C42326y.class, C42496e.this.mContext)).mo152380b((String) null);
                            }
                            if (C43374f.m172264f().mo155119d(o)) {
                                C42496e.this.f108165e.mo153133o();
                            }
                            dialogInterface.dismiss();
                            C42176e.m168344a().mo152250e(o.mo151527k(), new IGetDataCallback<SetMailsAllReadResponse>() {
                                /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass20.DialogInterface$OnClickListenerC425051.C425061 */

                                @Override // com.larksuite.framework.callback.IGetDataCallback
                                public void onError(ErrorResult errorResult) {
                                    MailToast.m173698a((int) R.string.Mail_ThreadList_MarkAllAsReadFailed, MailToast.Type.FAIL);
                                    Log.m165389i("MailContentFragment", "MarkAllAsReaded fail");
                                    C42209j.m168612a("thread_mark_all_read_fail", "toast");
                                }

                                /* renamed from: a */
                                public void onSuccess(SetMailsAllReadResponse setMailsAllReadResponse) {
                                    MailToast.m173698a((int) R.string.Mail_ThreadList_MarkAllAsReadSucceed, MailToast.Type.SUCCESS);
                                    Log.m165389i("MailContentFragment", "MarkAllAsReaded success");
                                    if (C42496e.this.mContext != null) {
                                        ((C42326y) C42344d.m169091a(C42326y.class, C42496e.this.mContext)).mo152372a("success", 0);
                                    }
                                }
                            });
                        }
                    });
                    C42496e.this.mo152902z();
                }
            }

            @Override // com.ss.android.lark.mail.impl.home.p2184d.C42460a.AbstractC42473b
            /* renamed from: a */
            public void mo152797a(FilterType filterType) {
                C42496e.this.mo152861a(C42496e.this.mo152890o(), filterType, false);
            }
        });
        m169607K();
        m169614a(this.f108162b);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m169611O() {
        m169614a(this.f108162b);
        this.f108181u.mo152985a();
        MailMenuComponent cVar = this.f108174n;
        if (cVar != null) {
            cVar.mo153033f();
        }
        C42593a aVar = this.f108165e;
        if (aVar != null) {
            aVar.mo153136r();
        }
        if (C43345c.m172076m().mo154997c() && !this.f108181u.mo152995d().mo152953a()) {
            mo152866a("from_account_change", 3);
        }
    }

    /* renamed from: D */
    public boolean mo152853D() {
        if (!C43345c.m172076m().mo154998d() || this.f108172l == null || !C43819s.m173684a((int) R.string.Mail_SmartInbox_Important).equals(this.f108172l.mo152774k())) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public View mo152854E() {
        MailFeedRecyclerView mailFeedRecyclerView = this.f108164d;
        if (mailFeedRecyclerView == null || this.f108165e == null || !(mailFeedRecyclerView.getLayoutManager() instanceof LinearLayoutManager) || !mo152853D()) {
            return null;
        }
        return this.f108179s.mo153184b().mo153239d().mo153313e();
    }

    /* renamed from: g */
    public boolean mo152882g() {
        if (C42871i.m170779b() && C42871i.m170775a().mo153853a(mo152857H(), getContext())) {
            return true;
        }
        OperationTitleBar operationTitleBar = this.f108170j;
        if (operationTitleBar == null || operationTitleBar.getVisibility() != 0) {
            return false;
        }
        mo152893q();
        return true;
    }

    /* renamed from: i */
    public void mo152884i() {
        Log.m165389i("MailContentFragment", "showContentLoading : start");
        C42176e.m168344a().mo152199a(C43374f.m172264f().mo155129q(), 0, (long) C42038d.C42039a.m167221a(), new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass21 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("MailContentFragment", "showContentLoading : error");
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool != null && !bool.booleanValue()) {
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass21.RunnableC425071 */

                        public void run() {
                            Log.m165389i("MailContentFragment", "showContentLoading : execute");
                            if (C42496e.this.f108181u.mo152997f()) {
                                C42496e.this.mo152859a();
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Log.m165389i("MailContentFragment", "onStop");
        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152384d();
        if (!C41816b.m166115a().mo150142i() && !TTWebSdk.isTTWebView()) {
            Log.m165389i("MailContentFragment", "no ttwebview clean compose webview");
            C41988g.m166974e();
        }
        this.f108165e.mo153137s();
    }

    /* renamed from: z */
    public void mo152902z() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121868c, "thread_list");
            C41816b.m166115a().mo150114D().mo150182b("email_thread_markallasread", jSONObject);
        } catch (Exception e) {
            Log.m165384e("MailContentFragment", "reportMarkAllAsRead", e);
        }
    }

    /* renamed from: M */
    private void m169609M() {
        C43350d.m172098a().mo155023a(false).mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
            /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$Oz_t_eKHYfz1lM1ZhGLLZoMaH0I */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C42496e.this.m169618a((C42496e) ((EmailAutoReply) obj));
            }
        });
        final C1177w<Boolean> u = C43350d.m172098a().mo155055u();
        if (u.mo5927b() == null) {
            u.mo5923a(getViewLifecycleOwner(), new AbstractC1178x<Boolean>() {
                /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass10 */

                /* renamed from: a */
                public void onChanged(Boolean bool) {
                    if (bool != null) {
                        u.mo5928b((AbstractC1178x) this);
                        if (!bool.booleanValue()) {
                            C41816b.m166115a().mo150118H().mo150196a("all_mail_settings_nonconversationmode");
                        }
                    }
                }
            });
        } else if (!u.mo5927b().booleanValue()) {
            C41816b.m166115a().mo150118H().mo150196a("all_mail_settings_nonconversationmode");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Log.m165389i("MailContentFragment", "onDestroy");
        super.onDestroy();
        this.f108165e.mo153127i();
        C43383h.m172311a().mo155144a("MailContentFragment");
        this.f108179s.mo153186d();
        Watchers.m167209b(this);
        C43307b.m172030a().mo154982b(this.f108182v);
        C43791r.m173560b(this.f108180t);
        this.f108181u.destroy();
        this.f108172l.mo152777n();
        if (this.f108183w != null) {
            C43345c.m172076m().mo154995b(this.f108183w);
            this.f108183w = null;
        }
        this.f108162b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Log.m165389i("MailContentFragment", "testHomeTime onResume");
        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152391h("key_page_start_on_resume");
        super.onResume();
        C42441c.m169464a().mo152740b();
        if (C43345c.m172076m().mo154997c()) {
            mo152866a("from_on_resume", 1);
        }
        C43033b.m171194a().mo154212b();
        C42438c cVar = this.f108158C;
        if (cVar != null) {
            cVar.mo152729a();
        }
        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152391h("key_page_finish_on_resume");
        C42543h.m169819a().mo153017a(getContext(), getActivity().getIntent());
    }

    /* renamed from: q */
    public void mo152893q() {
        OperationTitleBar operationTitleBar = this.f108170j;
        if (operationTitleBar != null && operationTitleBar.getVisibility() == 0) {
            this.f108170j.setVisibility(4);
            this.f108163c.mo96243c(true);
            this.f108165e.mo153124f();
            ((AutoReplyTipsViewModel) this.f108179s.mo153184b().mo153237b().mo153275d().getValue()).updateIsMultiSelect(false);
            mo152899w();
            int childLayoutPosition = this.f108164d.getChildLayoutPosition(this.f108164d.getChildAt(0));
            if (childLayoutPosition == 0) {
                this.f108164d.scrollToPosition(childLayoutPosition);
            }
        }
    }

    /* renamed from: r */
    public void mo152894r() {
        if (this.f108163c.mo96251e()) {
            Log.m165389i("MailContentFragment", "showMultiSelect return");
            return;
        }
        Log.m165389i("MailContentFragment", "showMultiSelect");
        this.f108163c.mo96243c(false);
        if (this.f108170j == null) {
            OperationTitleBar operationTitleBar = (OperationTitleBar) this.f108186z.inflate();
            this.f108170j = operationTitleBar;
            operationTitleBar.setListener(new OperationTitleBar.AbstractC43958a() {
                /* class com.ss.android.lark.mail.impl.home.C42496e.C425138 */

                @Override // com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.AbstractC43958a
                /* renamed from: a */
                public void mo150696a() {
                    Log.m165389i("MailContentFragment", "multiSelectTitleBar onBackButtonClick");
                    C42496e.this.mo152893q();
                }
            });
        }
        this.f108170j.setVisibility(0);
        this.f108172l.mo152763b(false);
        ((AutoReplyTipsViewModel) this.f108179s.mo153184b().mo153237b().mo153275d().getValue()).updateIsMultiSelect(true);
    }

    /* renamed from: s */
    public void mo152895s() {
        OperationTitleBar operationTitleBar = this.f108170j;
        if (operationTitleBar != null) {
            operationTitleBar.setInfoText(C43819s.m173692c(this.f108165e.mo153126h()));
            Pair<List<AbsButton>, List<AbsButton>> buttons = this.f108171k.getButtons(C43374f.m172264f().mo155129q(), this.f108165e.mo153122d());
            if (buttons != null) {
                this.f108170j.mo156419a((List) buttons.first, new C43959a(null, (List) buttons.second));
            } else {
                this.f108170j.mo156419a(null, null);
            }
        }
    }

    /* renamed from: u */
    public void mo152897u() {
        C42438c cVar = this.f108158C;
        if (cVar != null) {
            cVar.mo152730a(this.mContext);
        }
        C42593a aVar = this.f108165e;
        if ((aVar == null || !aVar.mo153114a()) && this.mContext != null) {
            ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152384d();
        }
        ((SmartInboxViewModel) this.f108179s.mo153184b().mo153239d().getValue()).updateSmartInboxVisibleTime(mo152892p(), "");
    }

    /* renamed from: K */
    private void m169607K() {
        Log.m165389i("MailContentFragment", "initRecycleView");
        C42593a aVar = new C42593a(getContext(), 1);
        this.f108165e = aVar;
        aVar.mo153103a(new C42593a.AbstractC42601a() {
            /* class com.ss.android.lark.mail.impl.home.C42496e.AnonymousClass22 */

            @Override // com.ss.android.lark.mail.impl.home.threadlist.C42593a.AbstractC42601a
            /* renamed from: a */
            public void mo152940a() {
                C42496e.this.mo152893q();
            }

            @Override // com.ss.android.lark.mail.impl.home.threadlist.C42593a.AbstractC42601a
            /* renamed from: b */
            public void mo152942b() {
                C42496e.this.f108164d.mo153087b();
            }

            @Override // com.ss.android.lark.mail.impl.home.threadlist.C42593a.AbstractC42601a
            /* renamed from: a */
            public void mo152941a(MailThread mailThread) {
                C42496e.this.mo152894r();
                C42187a.m168568s(C42187a.C42191c.f107464o);
            }
        });
        this.f108165e.mo153105a(this.f108181u);
        this.f108165e.mo153106a(new C42593a.AbstractC42604d() {
            /* class com.ss.android.lark.mail.impl.home.C42496e.C425042 */

            @Override // com.ss.android.lark.mail.impl.home.threadlist.C42593a.AbstractC42604d
            /* renamed from: a */
            public void mo152935a() {
                C42496e.this.f108161a.sendEmptyMessage(1);
            }
        });
        this.f108165e.mo153108a(this.f108164d.getmRecyclerViewSwipeManager());
        ThreadListComponent bVar = new ThreadListComponent(this, this.f108181u, this.f108165e);
        this.f108179s = bVar;
        bVar.mo153182a(this.f108163c, this.f108164d);
        ((SmartInboxViewModel) this.f108179s.mo153184b().mo153239d().getValue()).setSmartInboxCardCallback(new ISmartInboxCardCallback() {
            /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$3zLTU8Z6a2VPhhj01WCbhoa2viE */

            @Override // com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.ISmartInboxCardCallback
            public final void onSmartInboxCardOnClick(int i, MailLabelEntity mailLabelEntity) {
                C42496e.this.m169613a((C42496e) i, (int) mailLabelEntity);
            }
        });
        this.f108164d.setAdapter(this.f108165e);
        this.f108172l.mo152759a(this.f108165e);
        this.f108164d.getmRecyclerViewSwipeManager().mo156666a(new C44032c.AbstractC44035b() {
            /* class com.ss.android.lark.mail.impl.home.C42496e.C425083 */

            @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.C44032c.AbstractC44035b
            /* renamed from: a */
            public void mo152943a(int i) {
                if (C42496e.this.f108176p != null) {
                    C42496e.this.f108176p.setClickable(false);
                }
            }

            @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.C44032c.AbstractC44035b
            /* renamed from: a */
            public void mo152944a(int i, int i2, int i3) {
                if (C42496e.this.f108176p != null) {
                    C42496e.this.f108176p.setClickable(true);
                }
                if (C42496e.this.f108164d != null && C42496e.this.f108165e != null && !C42496e.this.f108165e.mo153121c(i)) {
                    C42496e.this.f108164d.mo153088c();
                }
            }
        });
        NetworkChangeListener.NetworkLevel b = C43791r.m173559b();
        if (b == NetworkChangeListener.NetworkLevel.NET_UNAVAILABLE || b == NetworkChangeListener.NetworkLevel.SERVICE_UNAVAILABLE) {
            mo152888m();
        } else {
            mo152887l();
        }
    }

    /* renamed from: v */
    public void mo152898v() {
        Log.m165389i("MailContentFragment", "handleFragmentSelected mAdapter:" + this.f108165e);
        C42438c cVar = this.f108158C;
        if (cVar != null) {
            cVar.mo152731b();
        }
        C42593a aVar = this.f108165e;
        if (aVar != null) {
            if (aVar.mo153114a()) {
                ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152380b("email_tab_hot");
                if (!this.f108181u.mo152997f()) {
                    ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152372a("success", (long) C42038d.C42039a.m167221a());
                }
            }
            ((SmartInboxViewModel) this.f108179s.mo153184b().mo153239d().getValue()).updateSmartInboxVisibleTime("", mo152892p());
        }
        C42460a aVar2 = this.f108172l;
        if (aVar2 != null) {
            aVar2.mo152769f().mo152810i();
            this.f108172l.mo152768e();
        }
        C41832a.m166157a().mo150417c();
        mo152866a("from_select_mail_tab", 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (r2 <= r3) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        r2 = 0;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo152900x() {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.home.C42496e.mo152900x():void");
    }

    /* renamed from: a */
    public void mo152859a() {
        Log.m165389i("MailContentFragment", "showLKUILoading");
        mo152886k();
        LKUIStatus lKUIStatus = this.f108168h;
        if (lKUIStatus != null && !lKUIStatus.mo89851h()) {
            this.f108168h.mo89837a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m169623b(View view) {
        C42593a aVar = this.f108165e;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private void m169617a(C41814a aVar) {
        if (aVar != null) {
            C42441c.m169464a().mo152736a(aVar);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        boolean z = true;
        if (message.what == 1) {
            if (message.arg1 != 1) {
                z = false;
            }
            mo152879d(z);
        }
    }

    /* renamed from: a */
    private void m169614a(View view) {
        C41878a aVar = this.f108156A;
        if (aVar == null) {
            this.f108156A = new C41878a(this.mContext, this, view, new C41878a.AbstractC41890a() {
                /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$rFvEZWnz6Tu2G4Xe2kpT7xVzoQM */

                @Override // com.ss.android.lark.mail.impl.client.C41878a.AbstractC41890a
                public final void onDrawerEnable(boolean z) {
                    C42496e.this.m169626e(z);
                }
            });
        } else {
            aVar.mo150458a();
        }
    }

    /* renamed from: b */
    public void mo152875b(boolean z) {
        if (z) {
            C41900f.m166382a(this.mContext, new View.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$DsfYuJr0YPggjqWG7oAi0MBI5hs */

                public final void onClick(View view) {
                    C42496e.this.m169623b((C42496e) view);
                }
            });
        } else {
            C41900f.m166381a();
        }
    }

    /* renamed from: a */
    private void m169616a(PushMultiThreadAction pushMultiThreadAction) {
        C42593a aVar = this.f108165e;
        if (aVar != null && aVar.mo153117b() != null) {
            this.f108162b.post(new Runnable(pushMultiThreadAction) {
                /* class com.ss.android.lark.mail.impl.home.$$Lambda$e$EzTYkLb1efdCxr7xODS4VQicVq0 */
                public final /* synthetic */ PushMultiThreadAction f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C42496e.this.m169624b((C42496e) this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m169615a(AbsChangeMailAction absChangeMailAction) {
        Log.m165389i("MailContentFragment", "ChangeAction: " + absChangeMailAction);
        if (absChangeMailAction != null) {
            absChangeMailAction.mo150248d();
            if (absChangeMailAction instanceof PushInvalidCacheAction) {
                mo152866a("from_invalid_cache", 3);
            } else if (absChangeMailAction instanceof PushRefreshCurrentThreadListAction) {
                this.f108181u.mo152994c();
            } else if (absChangeMailAction instanceof PushMultiThreadAction) {
                m169616a((PushMultiThreadAction) absChangeMailAction);
            } else {
                if (absChangeMailAction instanceof OutboxMailAction) {
                    this.f108181u.mo153000i();
                }
                if (this.f108165e != null) {
                    m169625b(m169622b(absChangeMailAction));
                }
            }
            if (this.f108165e.mo153125g()) {
                mo152895s();
            }
        }
    }

    /* renamed from: b */
    private C41814a m169622b(AbsChangeMailAction absChangeMailAction) {
        MailLabelEntity o = mo152890o();
        C41814a aVar = null;
        if (!TextUtils.isEmpty(absChangeMailAction.mo150245a()) && o != null) {
            C42593a aVar2 = this.f108165e;
            if (!(aVar2 == null || aVar2.mo153117b() == null)) {
                int i = 0;
                while (i < this.f108165e.getItemCount() && ((r3 = this.f108165e.mo153116b(i)) == null || (aVar = absChangeMailAction.mo150236a(r3, i, o.mo151527k())) == null)) {
                    i++;
                }
            }
            if (aVar == null) {
                aVar = absChangeMailAction.mo150237a(o.mo151527k());
            }
            m169617a(aVar);
        }
        return aVar;
    }

    /* renamed from: c */
    public void mo152877c(boolean z) {
        Log.m165389i("MailContentFragment", "initLabel");
        MailMenuComponent cVar = this.f108174n;
        if (cVar != null) {
            ((MailMenuViewModel) cVar.getValue()).setStatus(z);
            if (TextUtils.isEmpty(mo152892p())) {
                Log.m165389i("MailContentFragment", "initLabel error");
                ((MailMenuViewModel) this.f108174n.getValue()).setStatus(((NetworkTipsViewModel) this.f108179s.mo153184b().mo153237b().mo153273a().getValue()).isShowNetworkError());
                mo152879d(z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m169618a(EmailAutoReply emailAutoReply) {
        if (emailAutoReply != null) {
            Log.m165389i("MailContentFragment", "observeSetting");
            ((AutoReplyTipsViewModel) this.f108179s.mo153184b().mo153237b().mo153275d().getValue()).updateAutoReplyStatus(emailAutoReply);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m169624b(PushMultiThreadAction pushMultiThreadAction) {
        List<AbstractC42436a> b = this.f108165e.mo153117b();
        pushMultiThreadAction.mo150323a(b);
        int size = b.size() - 1;
        while (size >= 0) {
            AbstractC42436a aVar = b.get(size);
            if (aVar instanceof MailThread) {
                MailThread mailThread = (MailThread) aVar;
                int a = pushMultiThreadAction.mo150234a(mailThread);
                if (a == 1) {
                    b.remove(aVar);
                } else if (a == 2) {
                    size++;
                    b.add(size, pushMultiThreadAction.mo150325e());
                } else if (a == 3) {
                    AbstractC42436a e = pushMultiThreadAction.mo150325e();
                    b.remove(size);
                    b.add(size, e);
                    size++;
                }
                if (mailThread.mo151716k()) {
                    C42207i.m168607a(202105242, mailThread.mo151676a());
                }
            }
            size--;
        }
        List<MailThread> f = pushMultiThreadAction.mo150326f();
        int i = 0;
        while (true) {
            if (i >= b.size()) {
                i = -1;
                break;
            } else if (b.get(i) instanceof MailThread) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            if (b.size() >= 1) {
                i = b.size() - 1;
            } else if (b.size() == 0) {
                i = 0;
            }
        }
        View view = this.f108166f;
        if (view != null && view.getVisibility() == 0 && f.size() > 0) {
            mo152886k();
        }
        b.addAll(i, f);
        this.f108165e.mo153109a(b);
        if (pushMultiThreadAction.mo150327g()) {
            Log.m165389i("MailContentFragment", "handle PushMultiThreadAction tryToPreLoadMore");
            this.f108179s.mo153185c().mo153151d().setNoMoreData(false);
            this.f108179s.mo153185c().mo153151d().autoLoadMore(this.f108181u.mo152995d(), this.f108165e.mo153128j(), true);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Log.m165389i("MailContentFragment", "testHomeTime onCreate");
        super.onCreate(bundle);
        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152380b("email_tab_clod");
        ((C42322x) C42344d.m169091a(C42322x.class, getContext())).mo152380b("init");
        String p = mo152892p();
        C42322x xVar = (C42322x) C42344d.m169091a(C42322x.class, getContext());
        if (p == null) {
            p = "";
        }
        xVar.mo152447j(p);
        this.f108158C = new C42438c();
        C42531g gVar = new C42531g();
        this.f108181u = gVar;
        gVar.mo152990a(this);
        this.f108181u.create();
        C42593a aVar = this.f108165e;
        if (aVar != null) {
            aVar.mo153105a(this.f108181u);
        }
        this.f108178r = new C42444d(getContext());
        MailSplashService.m171910d().mo154917a(this);
        C43725f.m173364l();
        if (C43345c.m172076m().mo154997c()) {
            mo152866a("from_on_create", 1);
        }
        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152391h("key_page_finish_create");
    }

    /* renamed from: a */
    private void m169619a(MailThread mailThread) {
        if (!this.f108165e.mo153115a(mailThread)) {
            Log.m165389i("MailContentFragment", "insertItem fail, tryToPreLoadMore");
            this.f108179s.mo153185c().mo153151d().setNoMoreData(false);
            this.f108179s.mo153185c().mo153151d().autoLoadMore(this.f108181u.mo152995d(), this.f108165e.mo153128j(), true);
        }
    }

    /* renamed from: b */
    private void m169625b(C41814a aVar) {
        if (aVar == null) {
            return;
        }
        if (aVar.mo150375c() == AbsChangeMailAction.OP.DELETE) {
            this.f108165e.mo153119b(aVar.mo150374b());
        } else if (aVar.mo150375c() == AbsChangeMailAction.OP.INSERT) {
            this.f108179s.mo153181a().mo153198a(true);
            m169619a(aVar.mo150374b());
            Log.m165389i("MailContentFragment", "testAsynRender INSERT new thread getMessageSubject:" + aVar.mo150374b().mo151702e());
            C42879j.m170799a().mo153865a(aVar.mo150374b(), getContext());
        } else if (aVar.mo150375c() == AbsChangeMailAction.OP.DELETE_AND_INSERT) {
            this.f108165e.mo153119b(aVar.mo150374b());
            m169619a(aVar.mo150374b());
            Log.m165389i("MailContentFragment", "testAsynRender updateUIByResult DELETE_AND_INSERT result.getItem():" + aVar.mo150374b().mo151702e());
            C42879j.m170799a().mo153865a(aVar.mo150374b(), getContext());
        } else if (aVar.mo150372a() > 0) {
            this.f108165e.notifyItemChanged(aVar.mo150372a());
        }
    }

    /* renamed from: d */
    public void mo152879d(boolean z) {
        C42593a aVar;
        Log.m165389i("MailContentFragment", "showEmptyView");
        mo152874b();
        if (this.f108166f == null) {
            View inflate = this.f108185y.inflate();
            this.f108166f = inflate;
            this.f108167g = (UDEmptyState) inflate.findViewById(R.id.mail_home_empty_state);
        }
        this.f108166f.setVisibility(0);
        if (!z || ((NetworkTipsViewModel) this.f108179s.mo153184b().mo153237b().mo153273a().getValue()).isShowNetworkError()) {
            this.f108166f.setOnClickListener(null);
        } else {
            this.f108166f.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.home.C42496e.View$OnClickListenerC425105 */

                public void onClick(View view) {
                    C42496e.this.mo152866a("from_click_retry", 1);
                }
            });
        }
        if (z) {
            this.f108167g.setImageRes(Integer.valueOf((int) R.drawable.illustration_placeholder_common_load_failed));
            if (((NetworkTipsViewModel) this.f108179s.mo153184b().mo153237b().mo153273a().getValue()).isShowNetworkError()) {
                this.f108167g.setDesc(this.mContext.getResources().getText(R.string.Mail_ThreadList_NoNetwork));
            } else {
                this.f108167g.setDesc(this.mContext.getResources().getText(R.string.Mail_Common_NetworkError));
                C42209j.m168612a("threadlist_error_page", "error_page");
            }
        } else {
            this.f108167g.setImageRes(Integer.valueOf((int) R.drawable.illustration_placeholder_common_no_mail));
            if (mo152890o() != null) {
                String b = C42441c.m169464a().mo152739b(mo152890o());
                if (C43819s.m173689a(b)) {
                    String l = mo152890o().mo151528l();
                    if (!TextUtils.isEmpty(l)) {
                        b = C41816b.m166115a().mo150132b().getString(R.string.Mail_List_Empty).replace("{{filterType}}", l);
                    } else {
                        Log.m165383e("MailContentFragment", "showEmptyView switch to default");
                    }
                }
                this.f108167g.setDesc(b);
            } else {
                Log.m165383e("MailContentFragment", "showEmptyView no filter");
                this.f108167g.setDesc(this.mContext.getResources().getText(R.string.Mail_ThreadList_NoNetwork));
            }
        }
        this.f108167g.setPrimaryActionStyle(UDEmptyState.ButtonStyle.TEXT_LINK);
        if (z || C43374f.m172264f().mo155135w() != FilterType.UNREAD) {
            this.f108167g.setPrimaryText((String) null);
        } else {
            this.f108167g.setPrimaryText(this.mContext.getResources().getText(R.string.Mail_Label_ClearFilter));
            this.f108167g.setPrimaryClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.home.C42496e.View$OnClickListenerC425116 */

                public void onClick(View view) {
                    C42496e eVar = C42496e.this;
                    eVar.mo152861a(eVar.mo152890o(), FilterType.ALL_MAIL, true);
                }
            });
        }
        this.f108172l.mo152778o();
        if (this.f108181u.mo153002k()) {
            C42187a.m168567s();
        } else {
            C42187a.m168569t();
        }
        if (z && (aVar = this.f108165e) != null && !aVar.mo153114a()) {
            ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152369a(1000, "");
            ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152372a("rust_fail", (long) C42038d.C42039a.m167221a());
        }
        MailSmartRefreshLayout mailSmartRefreshLayout = this.f108163c;
        if (mailSmartRefreshLayout != null) {
            mailSmartRefreshLayout.mo96243c(false);
            this.f108179s.mo153185c().mo153151d().setNoMoreData(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m169620a(final NetworkChangeListener.NetworkLevel networkLevel) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.C42496e.RunnableC424971 */

            public void run() {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append("onNetworkStateChange : ");
                NetworkChangeListener.NetworkLevel networkLevel = networkLevel;
                if (networkLevel != null) {
                    str = networkLevel.toString();
                } else {
                    str = "null";
                }
                sb.append(str);
                Log.m165389i("MailContentFragment", sb.toString());
                if (networkLevel == NetworkChangeListener.NetworkLevel.NET_UNAVAILABLE || networkLevel == NetworkChangeListener.NetworkLevel.SERVICE_UNAVAILABLE) {
                    C42496e.this.mo152888m();
                    return;
                }
                C42496e.this.mo152887l();
                if (C42496e.this.f108166f != null && C42496e.this.f108166f.getVisibility() == 0 && C43345c.m172076m().mo154997c()) {
                    C42496e.this.mo152866a("from_network_change", 1);
                }
            }
        });
    }

    /* renamed from: a */
    private void m169621a(List<MailThread> list) {
        if (!CollectionUtils.isEmpty(list)) {
            List<AbstractC42436a> b = this.f108165e.mo153117b();
            int size = b.size() - 1;
            long n = list.get(0).mo151719n();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                MailThread mailThread = list.get(i);
                if (mailThread.mo151719n() != n) {
                    break;
                }
                for (int i2 = size; i2 >= 0; i2--) {
                    AbstractC42436a aVar = b.get(i2);
                    if (aVar instanceof MailThread) {
                        MailThread mailThread2 = (MailThread) aVar;
                        if (n != mailThread2.mo151719n()) {
                            break;
                        } else if (mailThread2.mo151676a().equals(mailThread.mo151676a())) {
                            arrayList.add(mailThread);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                list.removeAll(arrayList);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m169613a(int i, MailLabelEntity mailLabelEntity) {
        mo152861a(mailLabelEntity, (FilterType) null, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Log.m165389i("MailContentFragment", "onViewCreated1: ");
        C43791r.m173557a(this.f108180t);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        MailLabelEntity o;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            int i3 = 0;
            if (intent.getBooleanExtra("isNeedSaveAndBack", false) && (o = mo152890o()) != null && !o.mo151529m()) {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("unselList");
                String k = o.mo151527k();
                while (true) {
                    if (i3 >= stringArrayListExtra.size()) {
                        break;
                    } else if (k.equals(stringArrayListExtra.get(i3))) {
                        mo152893q();
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        if (C42871i.m170779b()) {
            C42871i.m170775a().mo153848a(i, i2, intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.m165389i("MailContentFragment", "onCreateView: ");
        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152391h("key_page_start_create_view");
        if (this.f108162b == null) {
            mo152860a(super.getContext());
        }
        m169606J();
        Watchers.m167206a(this);
        C43307b.m172030a().mo154979a(this.f108182v);
        m169608L();
        m169609M();
        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152391h("key_page_finish_create_view");
        return this.f108162b;
    }
}
