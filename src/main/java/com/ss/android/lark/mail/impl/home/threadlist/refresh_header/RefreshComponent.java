package com.ss.android.lark.mail.impl.home.threadlist.refresh_header;

import com.bytedance.lark.pb.email.client.v1.MailGetThreadListResponse;
import com.bytedance.lark.pb.email.client.v1.MailRefreshThreadListResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27084f;
import com.scwang.smart.refresh.layout.p1230b.AbstractC27091g;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C42038d;
import com.ss.android.lark.mail.impl.home.C42496e;
import com.ss.android.lark.mail.impl.home.threadlist.C42593a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42322x;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/refresh_header/RefreshComponent;", "", "()V", "isRefreshing", "", "()Z", "mMailContentFragment", "Lcom/ss/android/lark/mail/impl/home/MailContentFragment;", "mMailRefreshHeader", "Lcom/ss/android/lark/mail/impl/home/threadlist/refresh_header/MailRefreshHeader;", "mSmartRefreshLayout", "Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;", "init", "", "smartRefreshLayout", "mailContentFragment", "mailHomeAdapter", "Lcom/ss/android/lark/mail/impl/home/threadlist/MailHomeAdapter;", "onDestroy", "setHasNewMail", "value", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.b.c */
public final class RefreshComponent {

    /* renamed from: a */
    public MailRefreshHeader f108495a;

    /* renamed from: b */
    public SmartRefreshLayout f108496b;

    /* renamed from: c */
    public C42496e f108497c;

    /* renamed from: a */
    public final void mo153196a() {
    }

    /* renamed from: b */
    public final boolean mo153199b() {
        SmartRefreshLayout smartRefreshLayout = this.f108496b;
        if (smartRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSmartRefreshLayout");
        }
        return smartRefreshLayout.mo96251e();
    }

    /* renamed from: a */
    public static final /* synthetic */ C42496e m170019a(RefreshComponent cVar) {
        C42496e eVar = cVar.f108497c;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMailContentFragment");
        }
        return eVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ MailRefreshHeader m170020b(RefreshComponent cVar) {
        MailRefreshHeader aVar = cVar.f108495a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMailRefreshHeader");
        }
        return aVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ SmartRefreshLayout m170021c(RefreshComponent cVar) {
        SmartRefreshLayout smartRefreshLayout = cVar.f108496b;
        if (smartRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSmartRefreshLayout");
        }
        return smartRefreshLayout;
    }

    /* renamed from: a */
    public final void mo153198a(boolean z) {
        MailRefreshHeader aVar = this.f108495a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMailRefreshHeader");
        }
        aVar.mo153195a(z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "refreshlayout", "Lcom/scwang/smart/refresh/layout/api/RefreshLayout;", "onRefresh"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.b.c$a */
    public static final class C42632a implements AbstractC27091g {

        /* renamed from: a */
        final /* synthetic */ RefreshComponent f108498a;

        /* renamed from: b */
        final /* synthetic */ C42593a f108499b;

        C42632a(RefreshComponent cVar, C42593a aVar) {
            this.f108498a = cVar;
            this.f108499b = aVar;
        }

        @Override // com.scwang.smart.refresh.layout.p1230b.AbstractC27091g
        /* renamed from: b */
        public final void mo96323b(final AbstractC27084f fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "refreshlayout");
            Log.m165389i("mSmartRefreshLayout", "mSmartRefreshLayout onHeaderReleased:");
            C43374f f = C43374f.m172264f();
            Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
            final String q = f.mo155129q();
            long k = this.f108499b.mo153129k();
            ((C42322x) C42344d.m169091a(C42322x.class, RefreshComponent.m170019a(this.f108498a).getContext())).mo152380b("reload");
            ((C42322x) C42344d.m169091a(C42322x.class, RefreshComponent.m170019a(this.f108498a).getContext())).mo152447j(q);
            C42176e a = C42176e.m168344a();
            C43374f f2 = C43374f.m172264f();
            Intrinsics.checkExpressionValueIsNotNull(f2, "MailAggregationService.getInstance()");
            a.mo152233b(q, f2.mo155135w(), k, (long) C42038d.C42039a.m167221a(), new IGetDataCallback<MailRefreshThreadListResponse>(this) {
                /* class com.ss.android.lark.mail.impl.home.threadlist.refresh_header.RefreshComponent.C42632a.C426331 */

                /* renamed from: a */
                final /* synthetic */ C42632a f108500a;

                /* access modifiers changed from: package-private */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.b.c$a$1$a */
                public static final class RunnableC42634a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C426331 f108503a;

                    RunnableC42634a(C426331 r1) {
                        this.f108503a = r1;
                    }

                    public final void run() {
                        Log.m165389i("mSmartRefreshLayout", "mSmartRefreshLayout refreshThreadList onError:");
                        RefreshComponent.m170020b(this.f108503a.f108500a.f108498a).mo153195a(true);
                        fVar.mo96223a(50000, false, false);
                    }
                }

                /* access modifiers changed from: package-private */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.b.c$a$1$b */
                public static final class RunnableC42635b implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C426331 f108504a;

                    /* renamed from: b */
                    final /* synthetic */ Long f108505b;

                    /* renamed from: c */
                    final /* synthetic */ MailRefreshThreadListResponse f108506c;

                    RunnableC42635b(C426331 r1, Long l, MailRefreshThreadListResponse mailRefreshThreadListResponse) {
                        this.f108504a = r1;
                        this.f108505b = l;
                        this.f108506c = mailRefreshThreadListResponse;
                    }

                    public final void run() {
                        List<MailGetThreadListResponse.ThreadItem> list;
                        Log.m165389i("mSmartRefreshLayout", "mSmartRefreshLayout refreshThreadList onSuccess: newThreadCount " + this.f108505b);
                        if (this.f108505b.longValue() > 0) {
                            Log.m165389i("mSmartRefreshLayout", "mSmartRefreshLayout refreshThreadList onSuccess has new:");
                            RefreshComponent.m170020b(this.f108504a.f108500a.f108498a).mo153195a(true);
                            RefreshComponent.m170021c(this.f108504a.f108500a.f108498a).mo96223a(50000, true, (Boolean) false);
                        } else {
                            RefreshComponent.m170020b(this.f108504a.f108500a.f108498a).mo153195a(false);
                            RefreshComponent.m170021c(this.f108504a.f108500a.f108498a).mo96223a(50000, true, (Boolean) true);
                        }
                        String str = q;
                        C43374f f = C43374f.m172264f();
                        Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
                        if (Intrinsics.areEqual(str, f.mo155129q())) {
                            C42130j a = C42130j.m168150a();
                            MailGetThreadListResponse mailGetThreadListResponse = this.f108506c.response;
                            if (mailGetThreadListResponse != null) {
                                list = mailGetThreadListResponse.thread_items;
                            } else {
                                list = null;
                            }
                            RefreshComponent.m170019a(this.f108504a.f108500a.f108498a).mo152871a(a.mo152085a(list), false, false, false, true);
                        }
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    C43849u.m173826a(new RunnableC42634a(this));
                }

                /* renamed from: a */
                public void onSuccess(MailRefreshThreadListResponse mailRefreshThreadListResponse) {
                    boolean z;
                    Boolean bool;
                    Intrinsics.checkParameterIsNotNull(mailRefreshThreadListResponse, "mailRefreshThreadListResponse");
                    C42322x xVar = (C42322x) C42344d.m169091a(C42322x.class, RefreshComponent.m170019a(this.f108500a.f108498a).getContext());
                    MailGetThreadListResponse mailGetThreadListResponse = mailRefreshThreadListResponse.response;
                    if (mailGetThreadListResponse == null || (bool = mailGetThreadListResponse.is_from_db) == null) {
                        z = false;
                    } else {
                        z = bool.booleanValue();
                    }
                    xVar.mo152446a(z);
                    ((C42322x) C42344d.m169091a(C42322x.class, RefreshComponent.m170019a(this.f108500a.f108498a).getContext())).mo152391h("key_rust_load_success");
                    C43849u.m173826a(new RunnableC42635b(this, mailRefreshThreadListResponse.new_thread_count, mailRefreshThreadListResponse));
                }

                {
                    this.f108500a = r1;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo153197a(SmartRefreshLayout smartRefreshLayout, C42496e eVar, C42593a aVar) {
        Intrinsics.checkParameterIsNotNull(smartRefreshLayout, "smartRefreshLayout");
        Intrinsics.checkParameterIsNotNull(eVar, "mailContentFragment");
        Intrinsics.checkParameterIsNotNull(aVar, "mailHomeAdapter");
        this.f108496b = smartRefreshLayout;
        this.f108497c = eVar;
        if (smartRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSmartRefreshLayout");
        }
        smartRefreshLayout.mo96247d(false);
        this.f108495a = new MailRefreshHeader();
        SmartRefreshLayout smartRefreshLayout2 = this.f108496b;
        if (smartRefreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSmartRefreshLayout");
        }
        MailRefreshHeader aVar2 = this.f108495a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMailRefreshHeader");
        }
        smartRefreshLayout2.mo96228a(aVar2, -1, UIHelper.getDimens(R.dimen.mail_home_refresh_header_height));
        SmartRefreshLayout smartRefreshLayout3 = this.f108496b;
        if (smartRefreshLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSmartRefreshLayout");
        }
        smartRefreshLayout3.mo96243c(true);
        SmartRefreshLayout smartRefreshLayout4 = this.f108496b;
        if (smartRefreshLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSmartRefreshLayout");
        }
        smartRefreshLayout4.mo96230a(new C42632a(this, aVar));
    }
}
