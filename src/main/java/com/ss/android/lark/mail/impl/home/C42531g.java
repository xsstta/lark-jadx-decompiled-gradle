package com.ss.android.lark.mail.impl.home;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.email.client.v1.FilterType;
import com.bytedance.lark.pb.email.client.v1.Message;
import com.bytedance.lark.pb.email.v1.MailOAuthStatusPushResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.AbstractC26035c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.C42038d;
import com.ss.android.lark.mail.impl.action.OutboxMailAction;
import com.ss.android.lark.mail.impl.action.PushThreadChangeAction;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.C42094f;
import com.ss.android.lark.mail.impl.entity.C42096i;
import com.ss.android.lark.mail.impl.entity.C42100n;
import com.ss.android.lark.mail.impl.entity.EngagementSettings;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.entity.MigrationItem;
import com.ss.android.lark.mail.impl.home.C42515f;
import com.ss.android.lark.mail.impl.home.C42531g;
import com.ss.android.lark.mail.impl.home.p2178a.C42365c;
import com.ss.android.lark.mail.impl.home.p2182b.AbstractC42436a;
import com.ss.android.lark.mail.impl.home.p2182b.C42437b;
import com.ss.android.lark.mail.impl.home.threadlist.C42593a;
import com.ss.android.lark.mail.impl.home.threadlist.header.outbox.IOutboxClickListener;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.MessageListIntenInfo;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42226b;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43307b;
import com.ss.android.lark.mail.impl.service.C43345c;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.C43362e;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.service.MailSplashService;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43318e;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43322i;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43323j;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43325l;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43333t;
import com.ss.android.lark.mail.impl.utils.C43779n;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.home.g */
public class C42531g implements AbstractC26035c, C42593a.AbstractC42603c, IOutboxClickListener {

    /* renamed from: a */
    C42496e f108269a;

    /* renamed from: b */
    public volatile boolean f108270b = true;

    /* renamed from: c */
    public boolean f108271c = true;

    /* renamed from: d */
    public final C42437b f108272d = new C42437b(0);

    /* renamed from: e */
    public final C42515f f108273e = new C42515f(new C42515f.AbstractC42519a() {
        /* class com.ss.android.lark.mail.impl.home.C42531g.C425321 */

        /* access modifiers changed from: public */
        /* renamed from: d */
        private /* synthetic */ void m169801d() {
            C42531g.this.f108269a.mo152874b();
        }

        @Override // com.ss.android.lark.mail.impl.home.C42515f.AbstractC42519a
        /* renamed from: b */
        public boolean mo152959b() {
            return C42531g.this.f108270b;
        }

        @Override // com.ss.android.lark.mail.impl.home.C42515f.AbstractC42519a
        /* renamed from: a */
        public Context mo152956a() {
            if (C42531g.this.f108269a != null) {
                return C42531g.this.f108269a.getContext();
            }
            return null;
        }

        @Override // com.ss.android.lark.mail.impl.home.C42515f.AbstractC42519a
        /* renamed from: c */
        public boolean mo152960c() {
            if (C42531g.this.f108269a == null || C42531g.this.f108269a.f108165e == null) {
                return false;
            }
            return C42531g.this.f108269a.f108165e.mo153114a();
        }

        /* access modifiers changed from: public */
        /* renamed from: e */
        private /* synthetic */ void m169802e() {
            Log.m165389i("MailHomePresenter", "onStartLoadThreadList");
            if (C42531g.this.f108270b && C42531g.this.f108269a != null) {
                C42531g.this.f108269a.mo152884i();
            }
            if (C42531g.this.f108271c) {
                C42531g.this.mo153000i();
                C42531g.this.f108271c = false;
            }
            C42531g.this.mo153003l();
        }

        @Override // com.ss.android.lark.mail.impl.home.C42515f.AbstractC42519a
        /* renamed from: a */
        public void mo152958a(long j, boolean z) {
            if (j == 0 && (C42531g.this.f108270b || z)) {
                C42531g.this.f108270b = true;
            }
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$1$hD7FB6FJULcDHIfBmYCFTv0Rc */

                public final void run() {
                    C42531g.C425321.m270768lambda$hD7FB6FJULcDHIfBmYCFTv0Rc(C42531g.C425321.this);
                }
            });
        }

        @Override // com.ss.android.lark.mail.impl.home.C42515f.AbstractC42519a
        /* renamed from: a */
        public void mo152957a(long j, String str, String str2, FilterType filterType, List<MailThread> list, boolean z, boolean z2) {
            if (!z2) {
                C42531g.this.f108270b = false;
            } else if (j == 0) {
                C42531g.this.f108270b = true;
            }
            C43849u.m173826a(new Runnable(str, str2, filterType, z2, j, list, z) {
                /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$1$M54pM6gBhdwkAlIJy0Sw65H5s */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ FilterType f$3;
                public final /* synthetic */ boolean f$4;
                public final /* synthetic */ long f$5;
                public final /* synthetic */ List f$6;
                public final /* synthetic */ boolean f$7;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                    this.f$6 = r8;
                    this.f$7 = r9;
                }

                public final void run() {
                    C42531g.C425321.m270767lambda$M54pM6gBhdwkAlIJy0Sw65H5s(C42531g.C425321.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
                }
            });
        }

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m169800a(String str, String str2, FilterType filterType, boolean z, long j, List list, boolean z2) {
            Log.m165389i("MailHomePresenter", "onFinishLoadThreadList");
            if (C42531g.this.f108269a == null || !C42531g.this.f108269a.isVisible() || !TextUtils.equals(str, C43277a.m171921a().mo154950n()) || !TextUtils.equals(str2, C43374f.m172264f().mo155129q()) || filterType != C43374f.m172264f().mo155135w()) {
                Log.m165389i("MailHomePresenter", "onFinishLoadThreadList, ignore");
                return;
            }
            C42531g.this.f108269a.mo152877c(z);
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$1$9_vsEl6DADXHXvqZZO1XqjOrc */

                public final void run() {
                    C42531g.C425321.m270766lambda$9_vsEl6DADXHXvqZZO1XqjOrc(C42531g.C425321.this);
                }
            });
            boolean z3 = true;
            if (!z) {
                if (j > 0) {
                    C42531g.this.f108269a.mo152869a(list, z2);
                    return;
                }
                C42226b.m168638a().mo152312c("mail_dev_labels_change_cost_time");
                C42531g.this.f108269a.mo152870a(list, z2, true, false);
                if (filterType != FilterType.UNREAD) {
                    z3 = false;
                }
                C42330c.m169058a(z3);
            } else if (j == 0) {
                C42531g.this.f108269a.mo152870a(null, true, true, true);
            } else {
                C42531g.this.f108269a.mo152885j();
            }
        }
    });

    /* renamed from: f */
    private boolean f108274f;

    /* renamed from: g */
    private volatile boolean f108275g = true;

    /* renamed from: h */
    private final AbstractC43325l f108276h = new AbstractC43325l() {
        /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$0E2KqD0KMl85kXU5uRFQGYXmWY4 */

        @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43325l
        public final void onOutboxChange(C42100n nVar) {
            C42531g.lambda$0E2KqD0KMl85kXU5uRFQGYXmWY4(C42531g.this, nVar);
        }
    };

    /* renamed from: i */
    private final AbstractC43323j f108277i = new AbstractC43323j() {
        /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$onURTjVV0WXtDl2WMKEsot551CI */

        @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43323j
        public final void onOAuthChange(MailOAuthStatusPushResponse.Status status, String str, C42093e eVar) {
            C42531g.lambda$onURTjVV0WXtDl2WMKEsot551CI(C42531g.this, status, str, eVar);
        }
    };

    /* renamed from: j */
    private final AbstractC43322i f108278j = new AbstractC43322i() {
        /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$pAyAq3xHHcCbrKyHwgY5GHzcF4 */

        @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43322i
        public final void onMigrationItemChange(MigrationItem mVar) {
            C42531g.m270764lambda$pAyAq3xHHcCbrKyHwgY5GHzcF4(C42531g.this, mVar);
        }
    };

    /* renamed from: k */
    private final AbstractC43318e f108279k = new AbstractC43318e() {
        /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$gD0HtVF8FCFIgut_6_K_gy1d0 */

        @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43318e
        public final void onChange(C42094f fVar, boolean z) {
            C42531g.m270763lambda$gD0HtVF8FCFIgut_6_K_gy1d0(C42531g.this, fVar, z);
        }
    };

    /* renamed from: l */
    private final AbstractC43333t f108280l = new AbstractC43333t() {
        /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$oGB9mNoOqX1icDcKjRsWRKrDN34 */

        @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43333t
        public final void onSharedAccountChange(String str, C42093e eVar, boolean z) {
            C42531g.lambda$oGB9mNoOqX1icDcKjRsWRKrDN34(C42531g.this, str, eVar, z);
        }
    };

    /* renamed from: m */
    private IGetDataCallback<MigrationItem> f108281m;

    /* renamed from: n */
    private C43345c.AbstractC43349b f108282n;

    /* renamed from: o */
    private final SparseArray<Runnable> f108283o = new SparseArray<>();

    /* renamed from: p */
    private final MailSplashService.AbstractC43276b f108284p = new MailSplashService.AbstractC43276b() {
        /* class com.ss.android.lark.mail.impl.home.$$Lambda$yHq9OvFVCCAc8OPHb47vbL732s */

        @Override // com.ss.android.lark.mail.impl.service.MailSplashService.AbstractC43276b
        public final void onPageFirstLoad() {
            C42531g.this.mo152993b();
        }
    };

    /* renamed from: q */
    private int f108285q = 0;

    /* renamed from: d */
    public C42515f mo152995d() {
        return this.f108273e;
    }

    /* renamed from: f */
    public boolean mo152997f() {
        return this.f108270b;
    }

    /* renamed from: a */
    public void mo152992a(boolean z) {
        if (z) {
            int size = this.f108283o.size();
            while (true) {
                size--;
                if (size > -1) {
                    int keyAt = this.f108283o.keyAt(size);
                    Runnable runnable = this.f108283o.get(keyAt);
                    if (runnable != null) {
                        runnable.run();
                        this.f108283o.delete(keyAt);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.header.outbox.IOutboxClickListener
    /* renamed from: a */
    public void mo152991a(String str) {
        C42496e eVar = this.f108269a;
        if (eVar != null) {
            eVar.mo152861a(C43374f.m172264f().mo155117c(str), (FilterType) null, false);
        }
    }

    /* renamed from: a */
    public void mo152989a(final C42100n nVar) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.C42531g.AnonymousClass11 */

            public void run() {
                Log.m165389i("outbox", "outbox size" + nVar.mo152004d());
                if (C42531g.this.f108269a != null) {
                    if (nVar.mo152004d() == 0) {
                        C43374f.m172264f().mo155126n();
                        C42531g.this.f108272d.mo152723a(0);
                        C42531g.this.f108272d.mo152724a(0L);
                        C42531g.this.f108269a.mo152889n();
                        return;
                    }
                    C42531g.this.mo153001j();
                    C42531g.this.f108272d.mo152723a(nVar.mo152004d());
                    C42531g.this.f108272d.mo152724a(nVar.mo152001a());
                    C42531g.this.f108272d.mo152725a(nVar.mo152002b());
                    C43374f.m172264f().mo155127o();
                    C42531g.this.f108269a.mo152863a(C42531g.this.f108272d);
                }
            }
        });
    }

    /* renamed from: k */
    public boolean mo153002k() {
        if (this.f108285q == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private void m169776o() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.C42531g.RunnableC425387 */

            public void run() {
                if (C42531g.this.f108269a == null) {
                    Log.m165383e("MailHomePresenter", "observeSmartInboxSwitch abort");
                } else if (C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.hide_ai_point")) {
                    Log.m165383e("MailHomePresenter", "observeSmartInboxSwitch ai fg abort");
                } else {
                    C43350d.m172098a().mo155051q().mo5923a(C42531g.this.f108269a, new AbstractC1178x<Boolean>() {
                        /* class com.ss.android.lark.mail.impl.home.C42531g.RunnableC425387.C425391 */

                        /* renamed from: a */
                        public void onChanged(Boolean bool) {
                            if (C42531g.this.f108269a == null) {
                                Log.m165383e("MailHomePresenter", "observeSmartInboxSwitch onChanged abort");
                            } else if (bool.booleanValue()) {
                                Log.m165389i("MailHomePresenter", "showSmartInboxUsageOnboarding switch on");
                                C42531g.this.f108269a.mo152851B();
                            } else {
                                C42531g.this.f108269a.mo152852C();
                            }
                        }
                    });
                }
            }
        });
    }

    /* renamed from: e */
    public MailLabelEntity mo152996e() {
        C42496e eVar = this.f108269a;
        if (eVar != null) {
            return eVar.mo152890o();
        }
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.C42593a.AbstractC42603c
    /* renamed from: h */
    public void mo152999h() {
        C42496e eVar = this.f108269a;
        if (eVar != null) {
            eVar.mo152895s();
        }
    }

    /* renamed from: l */
    public void mo153003l() {
        try {
            this.f108285q++;
        } catch (Exception e) {
            Log.m165384e("MailHomePresenter", "countThreadListUpdate", e);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: n */
    private void m169775n() {
        if (this.f108269a != null) {
            C43362e.m172201a().mo155089d().mo5923a(this.f108269a, new AbstractC1178x() {
                /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$Ownyk3JmzmNtaKo4l1b1OYFjk8 */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C42531g.m270762lambda$Ownyk3JmzmNtaKo4l1b1OYFjk8(C42531g.this, (EngagementSettings) obj);
                }
            });
        }
    }

    /* renamed from: q */
    private void m169778q() {
        this.f108271c = true;
        this.f108274f = false;
        this.f108272d.mo152723a(0);
        this.f108272d.mo152725a("");
        this.f108272d.mo152724a(0L);
    }

    /* access modifiers changed from: public */
    /* renamed from: r */
    private /* synthetic */ void m169779r() {
        if (!this.f108273e.mo152953a()) {
            this.f108273e.mo152950a(0, true, null);
        }
    }

    /* renamed from: b */
    public void mo152993b() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$DLziNsOztFSgy39tmoiYDdJ5VOE */

            public final void run() {
                C42531g.lambda$DLziNsOztFSgy39tmoiYDdJ5VOE(C42531g.this);
            }
        });
        mo152987a(3, new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.C42531g.RunnableC425376 */

            public void run() {
                C42531g.this.mo153004m();
            }
        });
        m169776o();
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.header.outbox.IOutboxClickListener
    /* renamed from: g */
    public void mo152998g() {
        if (this.f108269a != null) {
            C42437b bVar = this.f108272d;
            bVar.mo152727b(bVar.mo152726b());
            m169777p();
            this.f108269a.mo152889n();
        }
    }

    /* renamed from: i */
    public void mo153000i() {
        C42176e.m168344a().mo152201a("OUTBOX", FilterType.ALL_MAIL, 0, (long) C42038d.C42039a.m167221a(), new IGetDataCallback<C42096i>() {
            /* class com.ss.android.lark.mail.impl.home.C42531g.AnonymousClass10 */

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m169808a() {
                if (C42531g.this.f108272d.mo152722a() == 0) {
                    C42531g.this.f108271c = true;
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$10$BkFfLiW_v_T61wUjisCL3chnRo */

                    public final void run() {
                        C42531g.AnonymousClass10.m270769lambda$BkFfLiW_v_T61wUjisCL3chnRo(C42531g.AnonymousClass10.this);
                    }
                });
            }

            /* renamed from: a */
            public void onSuccess(C42096i iVar) {
                C43849u.m173826a(new Runnable(iVar) {
                    /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$10$8q5eARqBvklV5I1EK3wFysPSHEw */
                    public final /* synthetic */ C42096i f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C42531g.AnonymousClass10.lambda$8q5eARqBvklV5I1EK3wFysPSHEw(C42531g.AnonymousClass10.this, this.f$1);
                    }
                });
            }

            /* access modifiers changed from: public */
            /* renamed from: b */
            private /* synthetic */ void m169809b(C42096i iVar) {
                MailThread mailThread;
                List<MailThread> a = iVar.mo151944a();
                C42100n nVar = new C42100n("", "", Message.DeliveryState.UNKNOWN_DELIVERY_STATE, 0, 0);
                if (!(a == null || a.isEmpty() || (mailThread = a.get(0)) == null)) {
                    nVar = new C42100n(mailThread.mo151676a(), "", Message.DeliveryState.UNKNOWN_DELIVERY_STATE, a.size(), mailThread.mo151717l());
                }
                C42531g.this.mo152989a(nVar);
            }
        });
    }

    /* renamed from: m */
    public void mo153004m() {
        Log.m165389i("MailHomePresenter", "processSmartInboxOnboarding");
        C1177w<Boolean> q = C43350d.m172098a().mo155051q();
        if (q != null && q.mo5927b() == Boolean.FALSE) {
            this.f108269a.mo152855F();
        }
    }

    /* renamed from: p */
    private void m169777p() {
        C43779n.m173507a().putLong("LarkMailSP_outbox_tip", this.f108272d.mo152726b());
        C43779n.m173507a().putInt("LarkMailSP_outbox_tip_count", this.f108272d.mo152722a());
        C43779n.m173507a().putLong("LarkMailSP_outbox_tip_dismiss", this.f108272d.mo152728c());
    }

    /* renamed from: c */
    public void mo152994c() {
        MailLabelEntity e;
        if (this.f108269a != null && (e = mo152996e()) != null) {
            int c = this.f108269a.f108165e.mo153120c();
            if (c == 0) {
                c = C42038d.C42039a.m167221a();
            }
            mo153003l();
            C42176e.m168344a().mo152201a(e.mo151527k(), C43374f.m172264f().mo155135w(), 0, (long) c, new IGetDataCallback<C42096i>() {
                /* class com.ss.android.lark.mail.impl.home.C42531g.C425419 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(final C42096i iVar) {
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.home.C42531g.C425419.RunnableC425421 */

                        public void run() {
                            if (C42531g.this.f108269a != null && C42531g.this.f108269a.isVisible()) {
                                C42531g.this.f108269a.mo152870a(iVar.mo151944a(), iVar.mo151948b(), false, false);
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f108283o.clear();
        C43345c.m172076m().mo154995b(this.f108282n);
        Watchers.m167209b(this.f108276h);
        Watchers.m167209b(this.f108279k);
        Watchers.m167209b(this.f108278j);
        Watchers.m167209b(this.f108277i);
        Watchers.m167209b(this.f108280l);
        MailSplashService.m171910d().mo154920b(this.f108284p);
        this.f108281m = null;
        this.f108269a = null;
    }

    /* renamed from: j */
    public void mo153001j() {
        if (!this.f108274f && this.f108269a != null) {
            long j = C43779n.m173507a().getLong("LarkMailSP_outbox_tip", 0);
            long j2 = C43779n.m173507a().getLong("LarkMailSP_outbox_tip_dismiss", 0);
            this.f108272d.mo152723a(C43779n.m173507a().getInt("LarkMailSP_outbox_tip_count", 0));
            this.f108272d.mo152724a(j);
            this.f108272d.mo152727b(j2);
            this.f108274f = true;
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        Watchers.m167206a(this.f108276h);
        Watchers.m167206a(this.f108277i);
        Watchers.m167206a(this.f108278j);
        Watchers.m167206a(this.f108279k);
        Watchers.m167206a(this.f108280l);
        MailSplashService.m171910d().mo154918a(this.f108284p);
        C43374f.m172264f().mo155131s().mo5923a(this.f108269a, new AbstractC1178x<MailLabelEntity>() {
            /* class com.ss.android.lark.mail.impl.home.C42531g.C425365 */

            /* renamed from: a */
            String f108299a = "";

            /* renamed from: a */
            public void onChanged(MailLabelEntity mailLabelEntity) {
                C43849u.m173826a(new Runnable(mailLabelEntity) {
                    /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$5$TODsYnJ1lNbMRX96BQaYO2bJ0wo */
                    public final /* synthetic */ MailLabelEntity f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C42531g.C425365.lambda$TODsYnJ1lNbMRX96BQaYO2bJ0wo(C42531g.C425365.this, this.f$1);
                    }
                });
            }

            /* access modifiers changed from: public */
            /* renamed from: b */
            private /* synthetic */ void m169813b(MailLabelEntity mailLabelEntity) {
                String str;
                if (mailLabelEntity != null) {
                    str = mailLabelEntity.mo151527k();
                } else {
                    str = "";
                }
                if (!TextUtils.equals(this.f108299a, str)) {
                    this.f108299a = str;
                    if (!C42531g.this.f108273e.mo152953a() && !TextUtils.isEmpty(str)) {
                        C42531g.this.f108273e.mo152950a(0, true, null);
                    }
                }
            }
        });
        C43374f.m172264f().mo155136x().mo5923a(this.f108269a, new AbstractC1178x() {
            /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$Bc6CwiVTzu5ib7qSIx4SPY6sw */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C42531g.m270761lambda$Bc6CwiVTzu5ib7qSIx4SPY6sw(C42531g.this, (FilterType) obj);
            }
        });
    }

    /* renamed from: a */
    public void mo152985a() {
        Log.m165389i("MailHomePresenter", "reset");
        this.f108283o.clear();
        m169778q();
        this.f108270b = true;
        C43374f.m172264f().mo155120g();
    }

    /* renamed from: a */
    public void mo152990a(C42496e eVar) {
        this.f108269a = eVar;
    }

    /* renamed from: a */
    public void mo152986a(int i) {
        this.f108283o.remove(i);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m169768a(FilterType filterType) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$yLT2kCJHNUEJ6RcPSy170zXdsQ */

            public final void run() {
                C42531g.m270765lambda$yLT2kCJHNUEJ6RcPSy170zXdsQ(C42531g.this);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m169771a(EngagementSettings gVar) {
        if (gVar != null && C43362e.m172201a().mo155093h()) {
            m169772a(C43362e.m172201a().mo155094i());
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m169774b(C42100n nVar) {
        mo152989a(nVar);
        if (nVar.mo152003c() == Message.DeliveryState.DELIVERED) {
            C43307b.m172030a().mo154977a(new OutboxMailAction(nVar.mo152002b(), false));
        } else if (nVar.mo152003c() == Message.DeliveryState.TO_SEND) {
            this.f108272d.mo152725a(nVar.mo152002b());
            C43307b.m172030a().mo154977a(new PushThreadChangeAction(nVar.mo152002b(), "OUTBOX"));
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m169772a(final MigrationItem mVar) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.C42531g.RunnableC425332 */

            public void run() {
                if (C42531g.this.f108269a != null) {
                    C42531g.this.f108269a.mo152862a(mVar);
                }
                if (C43362e.m172201a().mo155084a(mVar)) {
                    C42531g.this.mo152987a(2, new Runnable(mVar) {
                        /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$2$5xemL3XYRquojZeKcRRXadrd22E */
                        public final /* synthetic */ MigrationItem f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C42531g.RunnableC425332.lambda$5xemL3XYRquojZeKcRRXadrd22E(C42531g.RunnableC425332.this, this.f$1);
                        }
                    });
                } else {
                    C42531g.this.mo152986a(2);
                }
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m169812a(MigrationItem mVar) {
                if (C42531g.this.f108269a != null) {
                    C42531g.this.f108269a.mo152875b(C43362e.m172201a().mo155084a(mVar));
                }
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m169770a(C42094f fVar, boolean z) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.C42531g.RunnableC425343 */

            public void run() {
                if (C43350d.m172098a().mo155017I() || C43350d.m172098a().mo155016H()) {
                    C42531g.this.mo152986a(1);
                }
                if (C42531g.this.f108269a != null) {
                    C42531g.this.f108269a.mo152876c();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo152987a(int i, Runnable runnable) {
        if (runnable != null) {
            this.f108283o.put(i, runnable);
            if (this.f108282n == null) {
                this.f108282n = new C43345c.AbstractC43349b() {
                    /* class com.ss.android.lark.mail.impl.home.C42531g.C425408 */

                    @Override // com.ss.android.lark.mail.impl.service.C43345c.AbstractC43349b
                    /* renamed from: b */
                    public void mo152846b(boolean z) {
                    }

                    @Override // com.ss.android.lark.mail.impl.service.C43345c.AbstractC43349b
                    /* renamed from: a */
                    public void mo152845a(boolean z) {
                        C42531g.this.mo152992a(z);
                    }
                };
                C43345c.m172076m().mo154991a(this.f108282n);
            }
            mo152992a(C43345c.m172076m().mo154998d());
        }
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.C42593a.AbstractC42603c
    /* renamed from: a */
    public void mo152988a(MailThread mailThread, String str) {
        String str2;
        int i;
        int i2;
        if (this.f108275g) {
            if ("OUTBOX".equals(str)) {
                C42699a.m170230a(this.f108269a.getContext(), new MessageListIntenInfo(str, mailThread.mo151676a(), "", 2, mailThread.mo151702e()));
            } else {
                Log.m165389i("MailHomePresenter", "gotoComposeDraft mailThread :" + mailThread.mo151676a() + " isComposeDraft:" + mailThread.mo151730x());
                if (!C42871i.m170779b() || !mailThread.mo151730x()) {
                    MailLabelEntity e = mo152996e();
                    if (e != null) {
                        str2 = e.mo151527k();
                    } else {
                        str2 = null;
                    }
                    if ("SHARE".equals(str2) || "TRASH".equals(str2) || "SPAM".equals(str2) || "OUTBOX".equals(str2)) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < this.f108269a.f108165e.mo153117b().size(); i3++) {
                        AbstractC42436a aVar = this.f108269a.f108165e.mo153117b().get(i3);
                        if (aVar instanceof MailThread) {
                            MailThread mailThread2 = (MailThread) aVar;
                            MessageListIntenInfo messageListIntenInfo = new MessageListIntenInfo(str, mailThread2.mo151676a(), "", i, mailThread2.mo151702e());
                            messageListIntenInfo.mo154048a(false);
                            messageListIntenInfo.mo154051c(mailThread2.mo151730x());
                            arrayList.add(messageListIntenInfo);
                        }
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList.size()) {
                            i2 = 0;
                            break;
                        } else if (((MessageListIntenInfo) arrayList.get(i4)).mo154050c().equals(mailThread.mo151676a())) {
                            i2 = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    C42699a.m170243a(this.f108269a.getContext(), arrayList, i2, this.f108269a.mo152857H(), str, mailThread);
                } else {
                    C42699a.m170251a(mailThread, this.f108269a.getContext());
                }
            }
            C42187a.m168502b(mailThread.mo151676a());
            C42187a.m168564q(mailThread.mo151676a());
            C42330c.m169070c();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m169769a(final MailOAuthStatusPushResponse.Status status, String str, C42093e eVar) {
        C43849u.m173827a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.C42531g.AnonymousClass12 */

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m169811a() {
                if (C43350d.m172098a().mo155018J() && C42531g.this.f108269a != null) {
                    C42531g.this.f108269a.mo152881f();
                }
            }

            public void run() {
                Log.m165389i("MailMigration", "onOAuthChange status:" + status);
                if (MailOAuthStatusPushResponse.Status.SUCCESS == status) {
                    C42531g.this.mo152987a(1, new Runnable() {
                        /* class com.ss.android.lark.mail.impl.home.$$Lambda$g$12$nS3qTm1BxxwWMxXZm_GIGnCmlg */

                        public final void run() {
                            C42531g.AnonymousClass12.m270770lambda$nS3qTm1BxxwWMxXZm_GIGnCmlg(C42531g.AnonymousClass12.this);
                        }
                    });
                } else {
                    C42531g.this.mo152986a(1);
                }
            }
        }, 500);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m169773a(final String str, final C42093e eVar, final boolean z) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.C42531g.RunnableC425354 */

            public void run() {
                if (C42531g.this.f108269a != null) {
                    C42365c.m169155a().mo152525a(C42531g.this.f108269a.getContext(), str, eVar, z, 0, null);
                    C42093e l = C43277a.m171921a().mo154948l();
                    if (!z && l != null && TextUtils.equals(l.mo151848b(), eVar.mo151848b())) {
                        Log.m165388i("unbind current account , switch to primary account");
                        C43277a.m171921a().mo154931a(C43277a.m171921a().mo154946j(), (IGetDataCallback<C42088b>) null);
                    }
                }
            }
        });
    }
}
