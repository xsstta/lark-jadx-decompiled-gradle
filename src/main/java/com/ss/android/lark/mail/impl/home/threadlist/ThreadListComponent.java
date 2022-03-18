package com.ss.android.lark.mail.impl.home.threadlist;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.lark.pb.email.client.v1.FilterType;
import com.bytedance.lark.pb.email.client.v1.MailSelectAllResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.C42434b;
import com.ss.android.lark.mail.impl.home.C42496e;
import com.ss.android.lark.mail.impl.home.C42531g;
import com.ss.android.lark.mail.impl.home.p2184d.C42460a;
import com.ss.android.lark.mail.impl.home.threadlist.header.MailHeaderViewComponent;
import com.ss.android.lark.mail.impl.home.threadlist.loadmore_footer.LoadMoreComponent;
import com.ss.android.lark.mail.impl.home.threadlist.refresh_header.RefreshComponent;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41872d;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43329p;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.dialog.DialogC43910a;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020,J\u0018\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020,2\u0006\u00103\u001a\u000201H\u0016J\b\u00104\u001a\u00020,H\u0002J\u001a\u00105\u001a\u00020,2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u00106\u001a\u0004\u0018\u00010\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020(8BX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00068"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/ThreadListComponent;", "Lcom/ss/android/lark/mail/impl/callback/ITimeFormatChangeListener;", "Lcom/ss/android/lark/mail/impl/service/watchers/rustwatchers/SelectAllWatcher;", "contentFragment", "Lcom/ss/android/lark/mail/impl/home/MailContentFragment;", "homePresenter", "Lcom/ss/android/lark/mail/impl/home/MailHomePresenter;", "homeAdapter", "Lcom/ss/android/lark/mail/impl/home/threadlist/MailHomeAdapter;", "(Lcom/ss/android/lark/mail/impl/home/MailContentFragment;Lcom/ss/android/lark/mail/impl/home/MailHomePresenter;Lcom/ss/android/lark/mail/impl/home/threadlist/MailHomeAdapter;)V", "headerViewComponent", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/MailHeaderViewComponent;", "getHeaderViewComponent", "()Lcom/ss/android/lark/mail/impl/home/threadlist/header/MailHeaderViewComponent;", "setHeaderViewComponent", "(Lcom/ss/android/lark/mail/impl/home/threadlist/header/MailHeaderViewComponent;)V", "loadMoreComponent", "Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreComponent;", "getLoadMoreComponent", "()Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreComponent;", "setLoadMoreComponent", "(Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreComponent;)V", "mCleanAllSessionID", "", "mLoadingDialog", "Lcom/ss/android/lark/mail/impl/view/dialog/LoadingDialog;", "mMaxThreadCountOneScreen", "", "maxPaddingTop", "recyclerView", "Lcom/ss/android/lark/mail/impl/home/threadlist/MailFeedRecyclerView;", "refreshComponent", "Lcom/ss/android/lark/mail/impl/home/threadlist/refresh_header/RefreshComponent;", "getRefreshComponent", "()Lcom/ss/android/lark/mail/impl/home/threadlist/refresh_header/RefreshComponent;", "setRefreshComponent", "(Lcom/ss/android/lark/mail/impl/home/threadlist/refresh_header/RefreshComponent;)V", "refreshLayout", "Lcom/ss/android/lark/mail/impl/home/threadlist/MailSmartRefreshLayout;", "titleBarComponent", "Lcom/ss/android/lark/mail/impl/home/titlebar/TitleBarComponent;", "getTitleBarComponent", "()Lcom/ss/android/lark/mail/impl/home/titlebar/TitleBarComponent;", "cleanAll", "", "onDestroy", "onSelectAllDone", "sessionId", "isSuccess", "", "onTimeFormatChanged", "is24HourClock", "resetRecyclerViewTop", "setupRecyclerView", "threadListView", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.b */
public final class ThreadListComponent implements AbstractC41872d, AbstractC43329p {

    /* renamed from: f */
    public static final Companion f108468f = new Companion(null);

    /* renamed from: a */
    public MailFeedRecyclerView f108469a;

    /* renamed from: b */
    public String f108470b;

    /* renamed from: c */
    public DialogC43910a f108471c;

    /* renamed from: d */
    public final C42496e f108472d;

    /* renamed from: e */
    public final C42593a f108473e;

    /* renamed from: g */
    private MailSmartRefreshLayout f108474g;

    /* renamed from: h */
    private RefreshComponent f108475h = new RefreshComponent();

    /* renamed from: i */
    private MailHeaderViewComponent f108476i;

    /* renamed from: j */
    private LoadMoreComponent f108477j = new LoadMoreComponent();

    /* renamed from: k */
    private int f108478k;

    /* renamed from: l */
    private int f108479l;

    /* renamed from: m */
    private final C42531g f108480m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/ThreadListComponent$Companion;", "", "()V", "TAG", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final RefreshComponent mo153181a() {
        return this.f108475h;
    }

    /* renamed from: b */
    public final MailHeaderViewComponent mo153184b() {
        return this.f108476i;
    }

    /* renamed from: c */
    public final LoadMoreComponent mo153185c() {
        return this.f108477j;
    }

    /* renamed from: g */
    private final C42460a m169997g() {
        C42460a G = this.f108472d.mo152856G();
        Intrinsics.checkExpressionValueIsNotNull(G, "contentFragment.titleBar");
        return G;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.b$d */
    static final class RunnableC42628d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ThreadListComponent f108487a;

        /* renamed from: b */
        final /* synthetic */ boolean f108488b;

        RunnableC42628d(ThreadListComponent bVar, boolean z) {
            this.f108487a = bVar;
            this.f108488b = z;
        }

        public final void run() {
            Log.m165389i("ThreadListComponent", "onTimeFormatChanged is24HourClock:" + this.f108488b);
            C42593a aVar = this.f108487a.f108473e;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: d */
    public final void mo153186d() {
        AbstractC41849c a = C41816b.m166115a();
        Intrinsics.checkExpressionValueIsNotNull(a, "Host.get()");
        a.mo150116F().mo150191b(this);
        Watchers.m167209b(this);
        this.f108475h.mo153196a();
        this.f108477j.mo153150c();
        this.f108476i.mo153240e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.b$c */
    static final class RunnableC42627c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ThreadListComponent f108484a;

        /* renamed from: b */
        final /* synthetic */ String f108485b;

        /* renamed from: c */
        final /* synthetic */ boolean f108486c;

        RunnableC42627c(ThreadListComponent bVar, String str, boolean z) {
            this.f108484a = bVar;
            this.f108485b = str;
            this.f108486c = z;
        }

        public final void run() {
            DialogC43910a aVar = this.f108484a.f108471c;
            if (aVar != null) {
                aVar.dismiss();
                this.f108484a.f108471c = null;
            }
            if (TextUtils.isEmpty(this.f108484a.f108470b) || !Intrinsics.areEqual(this.f108485b, this.f108484a.f108470b)) {
                return;
            }
            if (this.f108486c) {
                MailToast.m173698a((int) R.string.Mail_ThreadList_Emptied, MailToast.Type.SUCCESS);
                return;
            }
            MailToast.m173698a((int) R.string.Mail_ThreadList_ActionFailed, MailToast.Type.FAIL);
            C42209j.m168612a("thread_empty_all_fail", "toast");
        }
    }

    /* renamed from: f */
    public final void mo153188f() {
        int i;
        if (this.f108472d.mo152890o() != null) {
            Context context = this.f108472d.getContext();
            DialogInterface$OnClickListenerC42624b bVar = new DialogInterface$OnClickListenerC42624b(this);
            MailLabelEntity o = this.f108472d.mo152890o();
            Intrinsics.checkExpressionValueIsNotNull(o, "contentFragment.currentAggregationEntity");
            if (Intrinsics.areEqual(o.mo151527k(), "SPAM")) {
                i = R.string.Mail_ThreadList_EmptySpamDialog;
            } else {
                i = R.string.Mail_ThreadList_EmptyTrashDialog;
            }
            C42434b.m169440a(context, bVar, i);
            C42187a.m168551l();
            C42209j.m168612a("thread_empty_all_fail", "toast");
        }
    }

    /* renamed from: e */
    public final void mo153187e() {
        int i;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        int i3;
        C42593a aVar = this.f108473e;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        if (aVar.mo153125g()) {
            i = UIHelper.getDimens(R.dimen.mail_home_multi_title_bar_height);
        } else {
            i = m169997g().mo152771h();
        }
        if (this.f108478k != i) {
            Log.m165389i("ThreadListComponent", "maxPaddingTop=" + i + ", normal titlebar height=" + m169997g().mo152771h() + ", multi titlebar height=" + UIHelper.getDimens(R.dimen.mail_home_multi_title_bar_height));
            this.f108478k = i;
            MailSmartRefreshLayout mailSmartRefreshLayout = this.f108474g;
            if (mailSmartRefreshLayout != null) {
                layoutParams = mailSmartRefreshLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                ((FrameLayout.LayoutParams) layoutParams).topMargin = this.f108478k;
                MailSmartRefreshLayout mailSmartRefreshLayout2 = this.f108474g;
                if (mailSmartRefreshLayout2 != null) {
                    mailSmartRefreshLayout2.requestLayout();
                }
                MailFeedRecyclerView mailFeedRecyclerView = this.f108469a;
                if (mailFeedRecyclerView != null) {
                    i2 = mailFeedRecyclerView.getHeight();
                } else {
                    i2 = 0 - this.f108478k;
                }
                if (this.f108473e.mo153131m() > 0) {
                    if (i2 % this.f108473e.mo153131m() == 0) {
                        i3 = i2 / this.f108473e.mo153131m();
                    } else {
                        i3 = (i2 / this.f108473e.mo153131m()) + 1;
                    }
                    this.f108479l = i3;
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41872d
    /* renamed from: a */
    public void mo150437a(boolean z) {
        C43849u.m173826a(new RunnableC42628d(this, z));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.b$e */
    public static final class C42629e<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ ThreadListComponent f108489a;

        C42629e(ThreadListComponent bVar) {
            this.f108489a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            int childLayoutPosition;
            this.f108489a.mo153187e();
            MailFeedRecyclerView mailFeedRecyclerView = this.f108489a.f108469a;
            if (mailFeedRecyclerView != null && (childLayoutPosition = mailFeedRecyclerView.getChildLayoutPosition(mailFeedRecyclerView.getChildAt(0))) == 0) {
                mailFeedRecyclerView.scrollToPosition(childLayoutPosition);
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43329p
    /* renamed from: a */
    public void mo153183a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "sessionId");
        Log.m165389i("ThreadListComponent", "cleanAll onSelectAllDone mCleanAllSessionID:" + this.f108470b + " sessionId:" + str + " isSuccess:" + z);
        C43849u.m173826a(new RunnableC42627c(this, str, z));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.b$b */
    public static final class DialogInterface$OnClickListenerC42624b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ThreadListComponent f108481a;

        DialogInterface$OnClickListenerC42624b(ThreadListComponent bVar) {
            this.f108481a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Long l;
            boolean z;
            dialogInterface.dismiss();
            this.f108481a.f108470b = "";
            C42176e a = C42176e.m168344a();
            MailLabelEntity o = this.f108481a.f108472d.mo152890o();
            Intrinsics.checkExpressionValueIsNotNull(o, "contentFragment.currentAggregationEntity");
            String k = o.mo151527k();
            C42593a aVar = this.f108481a.f108473e;
            if (aVar != null) {
                l = Long.valueOf(aVar.mo153129k());
            } else {
                l = null;
            }
            long longValue = l.longValue();
            C43374f f = C43374f.m172264f();
            Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
            if (f.mo155135w() == FilterType.UNREAD) {
                z = true;
            } else {
                z = false;
            }
            a.mo152200a(k, longValue, z, new IGetDataCallback<MailSelectAllResponse>(this) {
                /* class com.ss.android.lark.mail.impl.home.threadlist.ThreadListComponent.DialogInterface$OnClickListenerC42624b.C426251 */

                /* renamed from: a */
                final /* synthetic */ DialogInterface$OnClickListenerC42624b f108482a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f108482a = r1;
                }

                /* renamed from: a */
                public void onSuccess(MailSelectAllResponse mailSelectAllResponse) {
                    Intrinsics.checkParameterIsNotNull(mailSelectAllResponse, "mailSelectAllResponse");
                    Log.m165389i("ThreadListComponent", "cleanAll success mailSelectAllResponse.session_id:" + mailSelectAllResponse.session_id);
                    this.f108482a.f108481a.f108470b = mailSelectAllResponse.session_id;
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    Log.m165389i("ThreadListComponent", "cleanAll fail");
                    DialogC43910a aVar = this.f108482a.f108481a.f108471c;
                    if (aVar != null) {
                        aVar.dismiss();
                        this.f108482a.f108481a.f108471c = null;
                    }
                    MailToast.m173698a((int) R.string.Mail_ThreadList_ActionFailed, MailToast.Type.FAIL);
                    C42209j.m168612a("thread_empty_all_fail", "toast");
                }
            });
            if (this.f108481a.f108471c == null) {
                this.f108481a.f108471c = new DialogC43910a(this.f108481a.f108472d.getContext());
                DialogC43910a aVar2 = this.f108481a.f108471c;
                if (aVar2 != null) {
                    aVar2.setOnKeyListener(DialogInterface$OnKeyListenerC426262.f108483a);
                }
            }
            DialogC43910a aVar3 = this.f108481a.f108471c;
            if (aVar3 != null) {
                aVar3.mo156331a(C43819s.m173684a((int) R.string.Mail_ThreadList_Emptying));
            }
        }
    }

    /* renamed from: a */
    public final void mo153182a(MailSmartRefreshLayout mailSmartRefreshLayout, MailFeedRecyclerView mailFeedRecyclerView) {
        this.f108474g = mailSmartRefreshLayout;
        this.f108469a = mailFeedRecyclerView;
        if (mailFeedRecyclerView != null) {
            mailFeedRecyclerView.setItemAnimator(null);
        }
        MailFeedRecyclerView mailFeedRecyclerView2 = this.f108469a;
        if (mailFeedRecyclerView2 != null) {
            mailFeedRecyclerView2.setLayoutManager(new ThreadListComponent$setupRecyclerView$1(this, this.f108472d.getContext(), 1, false));
        }
        this.f108473e.mo153107a(this.f108475h);
        m169997g().mo152772i().mo5923a(this.f108472d, new C42629e(this));
        LoadMoreComponent aVar = this.f108477j;
        C42496e eVar = this.f108472d;
        if (eVar == null) {
            Intrinsics.throwNpe();
        }
        C42496e eVar2 = eVar;
        if (mailSmartRefreshLayout == null) {
            Intrinsics.throwNpe();
        }
        MailFeedRecyclerView mailFeedRecyclerView3 = this.f108469a;
        if (mailFeedRecyclerView3 == null) {
            Intrinsics.throwNpe();
        }
        C42531g gVar = this.f108480m;
        if (gVar == null) {
            Intrinsics.throwNpe();
        }
        C42593a aVar2 = this.f108473e;
        if (aVar2 == null) {
            Intrinsics.throwNpe();
        }
        aVar.mo153149a(eVar2, mailSmartRefreshLayout, mailFeedRecyclerView3, gVar, aVar2);
        RefreshComponent cVar = this.f108475h;
        MailSmartRefreshLayout mailSmartRefreshLayout2 = mailSmartRefreshLayout;
        C42496e eVar3 = this.f108472d;
        if (eVar3 == null) {
            Intrinsics.throwNpe();
        }
        C42593a aVar3 = this.f108473e;
        if (aVar3 == null) {
            Intrinsics.throwNpe();
        }
        cVar.mo153197a(mailSmartRefreshLayout2, eVar3, aVar3);
        MailHeaderViewComponent bVar = this.f108476i;
        MailFeedRecyclerView mailFeedRecyclerView4 = this.f108469a;
        if (mailFeedRecyclerView4 == null) {
            Intrinsics.throwNpe();
        }
        bVar.mo153236a(mailFeedRecyclerView4);
        this.f108476i.mo153238c().mo153211a(this.f108480m);
    }

    public ThreadListComponent(C42496e eVar, C42531g gVar, C42593a aVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "contentFragment");
        Intrinsics.checkParameterIsNotNull(gVar, "homePresenter");
        Intrinsics.checkParameterIsNotNull(aVar, "homeAdapter");
        this.f108472d = eVar;
        this.f108480m = gVar;
        this.f108473e = aVar;
        AbstractC41849c a = C41816b.m166115a();
        Intrinsics.checkExpressionValueIsNotNull(a, "Host.get()");
        a.mo150116F().mo150189a(this);
        Watchers.m167206a(this);
        this.f108476i = new MailHeaderViewComponent(eVar);
    }
}
