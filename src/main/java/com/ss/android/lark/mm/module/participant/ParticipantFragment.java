package com.ss.android.lark.mm.module.participant;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.lcodecore.tkrefreshlayout.AbstractC26401f;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.ss.android.lark.mm.base.IFragmentManager;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.list.base.ErrorFactory;
import com.ss.android.lark.mm.module.list.widget.MinutesListFooterView;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.module.share.MmShareBaseFragment;
import com.ss.android.lark.mm.module.share.fragment.FragmentType;
import com.ss.android.lark.mm.module.share.invite.MmInviteTitleBar;
import com.ss.android.lark.mm.p2290c.C45865a;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.widget.EmptyState;
import com.ss.android.lark.mm.widget.MmLoadingView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0014J\b\u0010\u0016\u001a\u00020\u0010H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\nH\u0014J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/mm/module/participant/ParticipantFragment;", "Lcom/ss/android/lark/mm/module/share/MmShareBaseFragment;", "repoId", "", "manager", "Lcom/ss/android/lark/mm/base/IFragmentManager;", "fromSource", "", "(Ljava/lang/String;Lcom/ss/android/lark/mm/base/IFragmentManager;I)V", "isInited", "", "isLoadMore", "isRefreshing", "userAdapter", "Lcom/ss/android/lark/mm/module/participant/ParticipantListAdapter;", "bindData", "", "ds", "Lcom/ss/android/lark/mm/module/participant/ParticipantRepo$DataSource;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "getLayoutRes", "init", "initData", "initView", "onVisibilityChanged", "visible", "preloadNextPage", "refresh", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.participant.a */
public final class ParticipantFragment extends MmShareBaseFragment {

    /* renamed from: a */
    private ParticipantListAdapter f117184a;

    /* renamed from: b */
    private boolean f117185b;

    /* renamed from: c */
    private boolean f117186c;

    /* renamed from: d */
    private boolean f117187d;

    /* renamed from: e */
    private HashMap f117188e;

    @Override // com.ss.android.lark.mm.base.BaseFragment, com.ss.android.lark.mm.module.share.MmShareBaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f117188e == null) {
            this.f117188e = new HashMap();
        }
        View view = (View) this.f117188e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f117188e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment, com.ss.android.lark.mm.module.share.MmShareBaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f117188e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.module.share.MmShareBaseFragment
    /* renamed from: d */
    public int mo163507d() {
        return R.layout.mm_fragment_participant;
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment, com.ss.android.lark.mm.module.share.MmShareBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo161170c();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.module.share.MmShareBaseFragment
    /* renamed from: e */
    public void mo163508e() {
        m184149l();
        m184150m();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.a$e */
    public static final class C46561e extends Lambda implements Function0<Unit> {
        final /* synthetic */ ParticipantFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46561e(ParticipantFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo164953j().bj_();
        }
    }

    /* renamed from: f */
    public final void mo163509f() {
        if (this.f117186c) {
            ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).mo93527f();
        } else if (!this.f117185b) {
            this.f117185b = true;
            ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(mo164952i());
            if (b != null) {
                b.mo163482b(ParticipantRepo.DataSource.ParticipantsFirstPage);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.a$a */
    public static final class RunnableC46557a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ParticipantFragment f117189a;

        RunnableC46557a(ParticipantFragment aVar) {
            this.f117189a = aVar;
        }

        public final void run() {
            ((FrameLayout) this.f117189a.mo161166a(R.id.emptyContainer)).removeAllViews();
            FrameLayout frameLayout = (FrameLayout) this.f117189a.mo161166a(R.id.emptyContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "emptyContainer");
            Context context = frameLayout.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "emptyContainer.context");
            EmptyState emptyState = new EmptyState(context);
            emptyState.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_content));
            emptyState.setImageBottomMargin(8.0f);
            emptyState.setDesc(ResString.f118656a.mo165504a(R.string.MMWeb_G_MyContentEmpty));
            emptyState.setId(View.generateViewId());
            emptyState.setContainer((FrameLayout) this.f117189a.mo161166a(R.id.emptyContainer));
            ErrorFactory aVar = ErrorFactory.f116755a;
            FrameLayout frameLayout2 = (FrameLayout) this.f117189a.mo161166a(R.id.emptyContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "emptyContainer");
            ErrorFactory.m183530a(aVar, frameLayout2, 0, 2, null);
        }
    }

    /* renamed from: m */
    private final void m184150m() {
        ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(mo164952i());
        if (b != null) {
            mo161167a().mo237937a(b.mo163474a(ParticipantRepo.DataSource.ParticipantsFirstPage, new C46558b(this)));
            mo161167a().mo237937a(b.mo163474a(ParticipantRepo.DataSource.ParticipantsNextPage, new C46559c(this)));
            mo161167a().mo237937a(b.mo163474a(ParticipantRepo.DataSource.ParticipantsRefresh, new C46560d(this)));
        }
    }

    /* renamed from: g */
    public final void mo163510g() {
        if (((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)) != null) {
            ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(mo164952i());
            if (b != null && !b.mo163480a(ParticipantRepo.DataSource.ParticipantsFirstPage)) {
                ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).mo93528g();
            } else if (this.f117185b) {
                ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).mo93528g();
            } else if (!this.f117186c) {
                this.f117186c = true;
                ParticipantRepo b2 = ParticipantRepo.f117152e.mo163490b(mo164952i());
                if (b2 != null) {
                    b2.mo163485c(ParticipantRepo.DataSource.ParticipantsFirstPage);
                }
            }
        }
    }

    /* renamed from: l */
    private final void m184149l() {
        String str;
        MmBaseInfo d;
        MmBaseInfo d2;
        MmBaseInfo d3;
        MmLoadingView mmLoadingView = (MmLoadingView) mo161166a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(mmLoadingView, "loadingView");
        String string = mmLoadingView.getContext().getString(R.string.MMWeb_G_Loading);
        Intrinsics.checkExpressionValueIsNotNull(string, "loadingView.context.getS…R.string.MMWeb_G_Loading)");
        ((MmLoadingView) mo161166a(R.id.loadingView)).mo165614a(string);
        MmInviteTitleBar.m186074a((MmInviteTitleBar) mo161166a(R.id.titleBar), (int) R.drawable.ud_icon_left_outlined, 0, new C46561e(this), 2, (Object) null);
        ((MmInviteTitleBar) mo161166a(R.id.titleBar)).setTitle(new ResString.Editor(R.string.MMWeb_G_AllParticipants).mo165506a("number", "0").mo165507a());
        ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(mo164952i());
        if (b == null || (d3 = b.mo163486d()) == null || !d3.isCanModify() || !C45865a.m181722e()) {
            MmInviteTitleBar.m186075a((MmInviteTitleBar) mo161166a(R.id.titleBar), 0, 0, C46563g.INSTANCE, 2, (Object) null);
        } else {
            MmInviteTitleBar.m186075a((MmInviteTitleBar) mo161166a(R.id.titleBar), (int) R.drawable.ud_icon_member_add_outlined, 0, new C46562f(this), 2, (Object) null);
        }
        ((MmInviteTitleBar) mo161166a(R.id.titleBar)).setTitleColor(UIUtils.getColor(getContext(), R.color.text_title));
        boolean z = false;
        ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).setEnableRefresh(false);
        ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).setBottomView(new MinutesListFooterView(getContext()));
        ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).setHeaderHeight(44.0f);
        ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).setOnRefreshListener(new C46564h(this));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        RecyclerView recyclerView = (RecyclerView) mo161166a(R.id.rvUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvUserList");
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) mo161166a(R.id.rvUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rvUserList");
        RecyclerView.ItemAnimator itemAnimator = recyclerView2.getItemAnimator();
        if (!(itemAnimator instanceof SimpleItemAnimator)) {
            itemAnimator = null;
        }
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) itemAnimator;
        if (simpleItemAnimator != null) {
            simpleItemAnimator.setSupportsChangeAnimations(false);
        }
        RecyclerView recyclerView3 = (RecyclerView) mo161166a(R.id.rvUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rvUserList");
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView4 = (RecyclerView) mo161166a(R.id.rvUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "rvUserList");
        recyclerView4.setItemAnimator(null);
        String i = mo164952i();
        ParticipantRepo b2 = ParticipantRepo.f117152e.mo163490b(mo164952i());
        if (b2 == null || (d2 = b2.mo163486d()) == null || (str = d2.getObjectToken()) == null) {
            str = "";
        }
        ParticipantRepo b3 = ParticipantRepo.f117152e.mo163490b(mo164952i());
        if (!(b3 == null || (d = b3.mo163486d()) == null)) {
            z = d.isCanModify();
        }
        this.f117184a = new ParticipantListAdapter(i, str, z);
        RecyclerView recyclerView5 = (RecyclerView) mo161166a(R.id.rvUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView5, "rvUserList");
        ParticipantListAdapter bVar = this.f117184a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userAdapter");
        }
        recyclerView5.setAdapter(bVar);
        ((RecyclerView) mo161166a(R.id.rvUserList)).addOnScrollListener(new C46565i(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "invoke", "com/ss/android/lark/mm/module/participant/ParticipantFragment$initData$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.a$b */
    public static final class C46558b extends Lambda implements Function1<MmParticipants, Unit> {
        final /* synthetic */ ParticipantFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46558b(ParticipantFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MmParticipants mmParticipants) {
            invoke(mmParticipants);
            return Unit.INSTANCE;
        }

        public final void invoke(MmParticipants mmParticipants) {
            Intrinsics.checkParameterIsNotNull(mmParticipants, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.this$0.mo163506a(ParticipantRepo.DataSource.ParticipantsFirstPage, mmParticipants);
            MmLoadingView mmLoadingView = (MmLoadingView) this.this$0.mo161166a(R.id.loadingView);
            Intrinsics.checkExpressionValueIsNotNull(mmLoadingView, "loadingView");
            mmLoadingView.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "invoke", "com/ss/android/lark/mm/module/participant/ParticipantFragment$initData$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.a$c */
    public static final class C46559c extends Lambda implements Function1<MmParticipants, Unit> {
        final /* synthetic */ ParticipantFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46559c(ParticipantFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MmParticipants mmParticipants) {
            invoke(mmParticipants);
            return Unit.INSTANCE;
        }

        public final void invoke(MmParticipants mmParticipants) {
            Intrinsics.checkParameterIsNotNull(mmParticipants, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.this$0.mo163506a(ParticipantRepo.DataSource.ParticipantsNextPage, mmParticipants);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.a$f */
    public static final class C46562f extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ ParticipantFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46562f(ParticipantFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            this.this$0.mo164953j().mo161184a(FragmentType.AddParticipant);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.a$g */
    public static final class C46563g extends Lambda implements Function1<View, Unit> {
        public static final C46563g INSTANCE = new C46563g();

        C46563g() {
            super(1);
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/mm/module/participant/ParticipantFragment$initView$4", "Lcom/lcodecore/tkrefreshlayout/RefreshListenerAdapter;", "onLoadMore", "", "refreshLayout", "Lcom/lcodecore/tkrefreshlayout/TwinklingRefreshLayout;", "onRefresh", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.a$h */
    public static final class C46564h extends AbstractC26401f {

        /* renamed from: a */
        final /* synthetic */ ParticipantFragment f117190a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46564h(ParticipantFragment aVar) {
            this.f117190a = aVar;
        }

        @Override // com.lcodecore.tkrefreshlayout.AbstractC26401f, com.lcodecore.tkrefreshlayout.AbstractC26400e
        /* renamed from: a */
        public void mo93516a(TwinklingRefreshLayout twinklingRefreshLayout) {
            Intrinsics.checkParameterIsNotNull(twinklingRefreshLayout, "refreshLayout");
            this.f117190a.mo163509f();
        }

        @Override // com.lcodecore.tkrefreshlayout.AbstractC26401f, com.lcodecore.tkrefreshlayout.AbstractC26400e
        /* renamed from: b */
        public void mo93519b(TwinklingRefreshLayout twinklingRefreshLayout) {
            Intrinsics.checkParameterIsNotNull(twinklingRefreshLayout, "refreshLayout");
            this.f117190a.mo163510g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/participant/ParticipantFragment$initView$5", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.a$i */
    public static final class C46565i extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ ParticipantFragment f117191a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46565i(ParticipantFragment aVar) {
            this.f117191a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                int itemCount = linearLayoutManager.getItemCount();
                if (i2 > 0 && itemCount - findLastCompletelyVisibleItemPosition < ParticipantRepo.f117152e.mo163487a()) {
                    this.f117191a.mo163510g();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "invoke", "com/ss/android/lark/mm/module/participant/ParticipantFragment$initData$1$5"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.a$d */
    public static final class C46560d extends Lambda implements Function1<Object, Unit> {
        final /* synthetic */ ParticipantFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46560d(ParticipantFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final void invoke(Object obj) {
            Intrinsics.checkParameterIsNotNull(obj, "<anonymous parameter 0>");
            this.this$0.mo163509f();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: a */
    public void mo161168a(boolean z) {
        if (z && !this.f117187d) {
            this.f117187d = true;
            mo163509f();
        }
    }

    /* renamed from: a */
    public final void mo163506a(ParticipantRepo.DataSource dataSource, MmParticipants mmParticipants) {
        boolean z;
        int total = mmParticipants.getTotal();
        List<MmParticipants.MmParticipantInfo> list = mmParticipants.getList();
        List<MmParticipants.MmParticipantInfo> list2 = list;
        boolean z2 = true;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ErrorFactory aVar = ErrorFactory.f116755a;
            FrameLayout frameLayout = (FrameLayout) mo161166a(R.id.emptyContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "emptyContainer");
            if (aVar.mo162924a(frameLayout, "emptyParticipantsList")) {
                C26171w.m94675a(new RunnableC46557a(this));
                return;
            }
            return;
        }
        ErrorFactory aVar2 = ErrorFactory.f116755a;
        FrameLayout frameLayout2 = (FrameLayout) mo161166a(R.id.emptyContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "emptyContainer");
        aVar2.mo162921a(frameLayout2);
        ((MmInviteTitleBar) mo161166a(R.id.titleBar)).setTitle(new ResString.Editor(R.string.MMWeb_G_AllParticipants).mo165506a("number", String.valueOf(total)).mo165507a());
        if (dataSource == ParticipantRepo.DataSource.ParticipantsFirstPage) {
            ParticipantListAdapter bVar = this.f117184a;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userAdapter");
            }
            bVar.mo163550a(list);
        } else {
            ParticipantListAdapter bVar2 = this.f117184a;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userAdapter");
            }
            bVar2.mo163552b(list);
        }
        if (this.f117185b) {
            ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).mo93527f();
            this.f117185b = false;
        }
        if (this.f117186c) {
            ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).mo93528g();
            this.f117186c = false;
        }
        TwinklingRefreshLayout twinklingRefreshLayout = (TwinklingRefreshLayout) mo161166a(R.id.ptrLayout);
        ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(mo164952i());
        if (b != null) {
            z2 = b.mo163480a(ParticipantRepo.DataSource.ParticipantsNextPage);
        }
        twinklingRefreshLayout.setEnableLoadmore(z2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParticipantFragment(String str, IFragmentManager bVar, int i) {
        super(str, bVar, i);
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(bVar, "manager");
    }
}
