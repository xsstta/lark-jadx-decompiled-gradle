package com.ss.android.lark.mm.module.participant.add;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.base.BaseFragment;
import com.ss.android.lark.mm.base.IFragmentManager;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.mm.module.participant.add.MmParticipantAddAdapter;
import com.ss.android.lark.mm.module.participant.add.MmSelectedParticipantsAdapter;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.module.participant.model.ParticipantModel;
import com.ss.android.lark.mm.module.share.invite.BaseAction;
import com.ss.android.lark.mm.module.share.invite.MmInviteTitleBar;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.MmHitPointContextProvider;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.MmLoadingDialog;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.utils.SoftKeyboardUtil;
import com.ss.android.lark.mm.utils.ktextensions.C47108b;
import com.ss.android.lark.mm.utils.ktextensions.C47109c;
import com.ss.android.lark.mm.widget.MmLoadingView;
import com.ss.android.lark.searchcommon.view.SearchInputView;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001cH\u0002J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u001cH\u0002J\b\u0010'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020\u001cH\u0002J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020\u001cH\u0016J\u0010\u00102\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u000203H\u0016J\u0010\u00105\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u000203H\u0002J\u0010\u00106\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u000203H\u0016J\u001a\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u0013H\u0014J\b\u0010;\u001a\u00020\u001cH\u0002J\b\u0010<\u001a\u00020\u001cH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019¨\u0006="}, d2 = {"Lcom/ss/android/lark/mm/module/participant/add/MmParticipantAddFragment;", "Lcom/ss/android/lark/mm/base/BaseFragment;", "Lcom/ss/android/lark/mm/module/participant/add/MmParticipantAddAdapter$IMmParticipantAddAdapterListener;", "Lcom/ss/android/lark/mm/module/participant/add/MmSelectedParticipantsAdapter$IMmSelectedParticipantsAdapterListener;", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContextProvider;", "repoId", "", "manager", "Lcom/ss/android/lark/mm/base/IFragmentManager;", "(Ljava/lang/String;Lcom/ss/android/lark/mm/base/IFragmentManager;)V", "action", "Lcom/ss/android/lark/mm/module/share/invite/BaseAction;", "adapter", "Lcom/ss/android/lark/mm/module/participant/add/MmParticipantAddAdapter;", "getAdapter", "()Lcom/ss/android/lark/mm/module/participant/add/MmParticipantAddAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "isInited", "", "isLoadMore", "isRefreshing", "selectedAdapter", "Lcom/ss/android/lark/mm/module/participant/add/MmSelectedParticipantsAdapter;", "getSelectedAdapter", "()Lcom/ss/android/lark/mm/module/participant/add/MmSelectedParticipantsAdapter;", "selectedAdapter$delegate", "bindData", "", "ds", "Lcom/ss/android/lark/mm/module/participant/ParticipantRepo$DataSource;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "getMmHitPointContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "initBottomAction", "initData", "initParticipantRecyclerView", "initSearchBar", "initSelectedUserView", "initViews", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onSelected", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "onUnSelectMember", "onUnSelectUser", "onUnSelected", "onViewCreated", "view", "onVisibilityChanged", "visible", "preloadNextPage", "refresh", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.participant.add.b */
public final class MmParticipantAddFragment extends BaseFragment implements MmParticipantAddAdapter.IMmParticipantAddAdapterListener, MmSelectedParticipantsAdapter.IMmSelectedParticipantsAdapterListener, MmHitPointContextProvider {

    /* renamed from: a */
    public boolean f117204a;

    /* renamed from: b */
    public final String f117205b;

    /* renamed from: c */
    public final IFragmentManager f117206c;

    /* renamed from: d */
    private BaseAction f117207d;

    /* renamed from: e */
    private boolean f117208e;

    /* renamed from: f */
    private boolean f117209f;

    /* renamed from: g */
    private final Lazy f117210g = LazyKt.lazy(new C46568a(this));

    /* renamed from: h */
    private final Lazy f117211h = LazyKt.lazy(new C46583k(this));

    /* renamed from: i */
    private HashMap f117212i;

    /* renamed from: h */
    private final MmSelectedParticipantsAdapter m184175h() {
        return (MmSelectedParticipantsAdapter) this.f117211h.getValue();
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f117212i == null) {
            this.f117212i = new HashMap();
        }
        View view = (View) this.f117212i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f117212i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f117212i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: d */
    public final MmParticipantAddAdapter mo163529d() {
        return (MmParticipantAddAdapter) this.f117210g.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/module/participant/add/MmParticipantAddAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.add.b$a */
    static final class C46568a extends Lambda implements Function0<MmParticipantAddAdapter> {
        final /* synthetic */ MmParticipantAddFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46568a(MmParticipantAddFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmParticipantAddAdapter invoke() {
            return new MmParticipantAddAdapter(this.this$0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.add.b$i */
    public static final class C46581i extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmParticipantAddFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46581i(MmParticipantAddFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f117206c.bj_();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/module/participant/add/MmSelectedParticipantsAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.add.b$k */
    static final class C46583k extends Lambda implements Function0<MmSelectedParticipantsAdapter> {
        final /* synthetic */ MmParticipantAddFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46583k(MmParticipantAddFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmSelectedParticipantsAdapter invoke() {
            return new MmSelectedParticipantsAdapter(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mm/module/participant/add/MmParticipantAddFragment$initSearchBar$2", "Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnQueryClear;", "onQueryClear", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.add.b$g */
    public static final class C46576g implements SearchInputView.IOnQueryClear {

        /* renamed from: a */
        final /* synthetic */ MmParticipantAddFragment f117216a;

        @Override // com.ss.android.lark.searchcommon.view.SearchInputView.IOnQueryClear
        /* renamed from: a */
        public void mo162384a() {
            LinearLayout linearLayout = (LinearLayout) this.f117216a.mo161166a(R.id.addVirtualMemberLayout);
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            this.f117216a.mo163530f();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46576g(MmParticipantAddFragment bVar) {
            this.f117216a = bVar;
        }
    }

    /* renamed from: f */
    public final void mo163530f() {
        if (!this.f117204a) {
            this.f117204a = true;
            ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(this.f117205b);
            if (b != null) {
                b.mo163482b(ParticipantRepo.DataSource.ParticipantSuggestionFirstPage);
            }
        }
    }

    /* renamed from: g */
    public final void mo163531g() {
        if (!this.f117208e) {
            this.f117208e = true;
            ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(this.f117205b);
            if (b != null) {
                b.mo163485c(ParticipantRepo.DataSource.ParticipantSuggestionFirstPage);
            }
        }
    }

    /* renamed from: k */
    private final void m184178k() {
        Context context = getContext();
        if (context != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "it");
            ParticipantAddAction participantAddAction = new ParticipantAddAction(context);
            this.f117207d = participantAddAction;
            if (participantAddAction != null) {
                participantAddAction.setActionEnabled(false);
            }
            BaseAction baseAction = this.f117207d;
            if (baseAction != null) {
                baseAction.setOnClickListener(new C46569b(this));
            }
            ((FrameLayout) mo161166a(R.id.containerAction)).addView(this.f117207d, 0);
        }
    }

    /* renamed from: l */
    private final void m184179l() {
        RecyclerView recyclerView = (RecyclerView) mo161166a(R.id.rvThumbnail);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvThumbnail");
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = (RecyclerView) mo161166a(R.id.rvThumbnail);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rvThumbnail");
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView3 = (RecyclerView) mo161166a(R.id.rvThumbnail);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rvThumbnail");
        recyclerView3.setAdapter(m184175h());
    }

    /* renamed from: n */
    private final void m184181n() {
        ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(this.f117205b);
        if (b != null) {
            mo161167a().mo237937a(b.mo163474a(ParticipantRepo.DataSource.ParticipantSuggestionFirstPage, new C46571c(this)));
            mo161167a().mo237937a(b.mo163474a(ParticipantRepo.DataSource.ParticipantSuggestionNextPage, new C46572d(this)));
        }
    }

    @Override // com.ss.android.lark.mm.statistics.hitpoint.MmHitPointContextProvider
    /* renamed from: e */
    public C47084f mo161231e() {
        ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(this.f117205b);
        if (b != null) {
            return new C47084f(b.mo163486d().getMeetingId(), b.mo163486d().isOwner(), b.mo163486d().getObjectToken(), b.mo163486d().getObjectType(), b.mo163486d().isCanModify());
        }
        return null;
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ParticipantModel a;
        super.onDestroyView();
        ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(this.f117205b);
        if (!(b == null || (a = b.mo163473a()) == null)) {
            a.clear();
        }
        SoftKeyboardUtil.f118667a.mo165510a(getContext());
        mo161170c();
    }

    /* renamed from: i */
    private final void m184176i() {
        MmLoadingView mmLoadingView = (MmLoadingView) mo161166a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(mmLoadingView, "loadingView");
        String string = mmLoadingView.getContext().getString(R.string.MMWeb_G_Loading);
        Intrinsics.checkExpressionValueIsNotNull(string, "loadingView.context.getS…R.string.MMWeb_G_Loading)");
        ((MmLoadingView) mo161166a(R.id.loadingView)).mo165614a(string);
        MmInviteTitleBar.m186074a((MmInviteTitleBar) mo161166a(R.id.titleBar), (int) R.drawable.ud_icon_close_small_outlined, 0, new C46581i(this), 2, (Object) null);
        ((MmInviteTitleBar) mo161166a(R.id.titleBar)).setTitle(ResString.f118656a.mo165504a(R.string.MMWeb_G_AddParticipants));
        MmInviteTitleBar.m186075a((MmInviteTitleBar) mo161166a(R.id.titleBar), 0, 0, C46582j.INSTANCE, 2, (Object) null);
        m184178k();
        m184177j();
        m184180m();
        m184179l();
    }

    /* renamed from: j */
    private final void m184177j() {
        RecyclerView recyclerView = (RecyclerView) mo161166a(R.id.rvUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvUserList");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = (RecyclerView) mo161166a(R.id.rvUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rvUserList");
        recyclerView2.setItemAnimator(null);
        RecyclerView recyclerView3 = (RecyclerView) mo161166a(R.id.rvUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rvUserList");
        recyclerView3.setAdapter(mo163529d());
        ((RecyclerView) mo161166a(R.id.rvUserList)).addOnScrollListener(new C46573e(this));
    }

    /* renamed from: m */
    private final void m184180m() {
        ((SearchInputView) mo161166a(R.id.searchBar)).setOnSearch(new C46574f(this));
        ((SearchInputView) mo161166a(R.id.searchBar)).setOnQueryClear(new C46576g(this));
        LinearLayout linearLayout = (LinearLayout) mo161166a(R.id.addVirtualMemberLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "addVirtualMemberLayout");
        Disposable subscribe = C47109c.m186569a(linearLayout).debounce(300, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C46577h(this));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "addVirtualMemberLayout.c…         }\n\n            }");
        C47108b.m186567a(subscribe, this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mm/module/participant/add/MmParticipantAddFragment$initSearchBar$1", "Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnSearch;", "onSearch", "", SearchIntents.EXTRA_QUERY, "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.add.b$f */
    public static final class C46574f implements SearchInputView.IOnSearch {

        /* renamed from: a */
        final /* synthetic */ MmParticipantAddFragment f117215a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "invoke", "com/ss/android/lark/mm/module/participant/add/MmParticipantAddFragment$initSearchBar$1$onSearch$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.participant.add.b$f$a */
        static final class C46575a extends Lambda implements Function1<List<? extends MmParticipants.MmParticipantInfo>, Unit> {
            final /* synthetic */ String $query$inlined;
            final /* synthetic */ C46574f this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46575a(C46574f fVar, String str) {
                super(1);
                this.this$0 = fVar;
                this.$query$inlined = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends MmParticipants.MmParticipantInfo> list) {
                invoke(list);
                return Unit.INSTANCE;
            }

            public final void invoke(List<? extends MmParticipants.MmParticipantInfo> list) {
                Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (!C47098d.m186534a(this.this$0.f117215a)) {
                    return;
                }
                if (list.isEmpty()) {
                    TextView textView = (TextView) this.this$0.f117215a.mo161166a(R.id.emptyContainer);
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    RecyclerView recyclerView = (RecyclerView) this.this$0.f117215a.mo161166a(R.id.rvUserList);
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                        return;
                    }
                    return;
                }
                TextView textView2 = (TextView) this.this$0.f117215a.mo161166a(R.id.emptyContainer);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                RecyclerView recyclerView2 = (RecyclerView) this.this$0.f117215a.mo161166a(R.id.rvUserList);
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(0);
                }
                this.this$0.f117215a.mo163529d().mo163519a(list);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46574f(MmParticipantAddFragment bVar) {
            this.f117215a = bVar;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchInputView.IOnSearch
        /* renamed from: a */
        public void mo162383a(String str) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LinearLayout linearLayout = (LinearLayout) this.f117215a.mo161166a(R.id.addVirtualMemberLayout);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "addVirtualMemberLayout");
                linearLayout.setVisibility(8);
                this.f117215a.mo163530f();
                return;
            }
            LinearLayout linearLayout2 = (LinearLayout) this.f117215a.mo161166a(R.id.addVirtualMemberLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "addVirtualMemberLayout");
            linearLayout2.setVisibility(0);
            RecyclerView recyclerView = (RecyclerView) this.f117215a.mo161166a(R.id.rvThumbnail);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvThumbnail");
            if (recyclerView.getVisibility() == 0) {
                View a = this.f117215a.mo161166a(R.id.addVirtualMemberTopGap);
                Intrinsics.checkExpressionValueIsNotNull(a, "addVirtualMemberTopGap");
                a.setVisibility(8);
            } else {
                View a2 = this.f117215a.mo161166a(R.id.addVirtualMemberTopGap);
                Intrinsics.checkExpressionValueIsNotNull(a2, "addVirtualMemberTopGap");
                a2.setVisibility(0);
            }
            TextView textView = (TextView) this.f117215a.mo161166a(R.id.addVirtualMemberTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "addVirtualMemberTv");
            textView.setText(UIHelper.mustacheFormat((int) R.string.MMWeb_G_AddNameAsParticipant_Desc, "name", "\"" + str + "\""));
            ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(this.f117215a.f117205b);
            if (b != null) {
                b.mo163476a(str, new C46575a(this, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.add.b$h */
    public static final class C46577h<T> implements Consumer<Unit> {

        /* renamed from: a */
        final /* synthetic */ MmParticipantAddFragment f117217a;

        C46577h(MmParticipantAddFragment bVar) {
            this.f117217a = bVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "invoke", "com/ss/android/lark/mm/module/participant/add/MmParticipantAddFragment$initSearchBar$3$2$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.participant.add.b$h$a */
        public static final class C46578a extends Lambda implements Function1<MmParticipants.MmParticipantInfo, Unit> {
            final /* synthetic */ String $keyword$inlined;
            final /* synthetic */ MmLoadingDialog $loadingDialog$inlined;
            final /* synthetic */ C46577h this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46578a(C46577h hVar, String str, MmLoadingDialog mmLoadingDialog) {
                super(1);
                this.this$0 = hVar;
                this.$keyword$inlined = str;
                this.$loadingDialog$inlined = mmLoadingDialog;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MmParticipants.MmParticipantInfo mmParticipantInfo) {
                invoke(mmParticipantInfo);
                return Unit.INSTANCE;
            }

            public final void invoke(MmParticipants.MmParticipantInfo mmParticipantInfo) {
                Intrinsics.checkParameterIsNotNull(mmParticipantInfo, "it");
                if (C47098d.m186534a(this.this$0.f117217a)) {
                    this.$loadingDialog$inlined.mo5513b();
                    mmParticipantInfo.setIsSelected(true);
                    this.this$0.f117217a.mo163529d().mo163518a(mmParticipantInfo);
                    this.this$0.f117217a.mo163522a(mmParticipantInfo);
                    C45859k.m181686a(new Runnable(this) {
                        /* class com.ss.android.lark.mm.module.participant.add.MmParticipantAddFragment.C46577h.C46578a.RunnableC465791 */

                        /* renamed from: a */
                        final /* synthetic */ C46578a f117218a;

                        {
                            this.f117218a = r1;
                        }

                        public final void run() {
                            if (((RecyclerView) this.f117218a.this$0.f117217a.mo161166a(R.id.rvUserList)) != null) {
                                RecyclerView recyclerView = (RecyclerView) this.f117218a.this$0.f117217a.mo161166a(R.id.rvUserList);
                                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvUserList");
                                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                                if (layoutManager != null) {
                                    ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(0, 0);
                                    return;
                                }
                                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                            }
                        }
                    }, 100);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "invoke", "com/ss/android/lark/mm/module/participant/add/MmParticipantAddFragment$initSearchBar$3$2$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.participant.add.b$h$b */
        public static final class C46580b extends Lambda implements Function1<C47068a, Unit> {
            final /* synthetic */ String $keyword$inlined;
            final /* synthetic */ MmLoadingDialog $loadingDialog$inlined;
            final /* synthetic */ C46577h this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46580b(C46577h hVar, String str, MmLoadingDialog mmLoadingDialog) {
                super(1);
                this.this$0 = hVar;
                this.$keyword$inlined = str;
                this.$loadingDialog$inlined = mmLoadingDialog;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C47068a aVar) {
                invoke(aVar);
                return Unit.INSTANCE;
            }

            public final void invoke(C47068a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "it");
                this.$loadingDialog$inlined.mo5513b();
                if (aVar.mo165307b() == 11004) {
                    C47083e.m186425a(this.this$0.f117217a.mo161231e(), "vc_minutes_popup_view", C47086i.m186432a().mo165427i("violative_participant_name").mo165421c());
                }
            }
        }

        /* renamed from: a */
        public final void accept(Unit unit) {
            FragmentManager supportFragmentManager;
            C47083e.m186425a(this.f117217a.mo161231e(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("participant_edit").mo165416b().mo165413a("edit_type", "add_from_speaker").mo165421c());
            String query = ((SearchInputView) this.f117217a.mo161166a(R.id.searchBar)).getQuery();
            MmLoadingDialog a = new MmLoadingDialog.Builder(MmLoadingDialog.Builder.Mode.Small).mo165459a();
            FragmentActivity activity = this.f117217a.getActivity();
            if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null)) {
                a.mo5511a(supportFragmentManager, "");
            }
            ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(this.f117217a.f117205b);
            if (b != null) {
                b.mo163477a(query, new C46578a(this, query, a), new C46580b(this, query, a));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/mm/module/participant/add/MmParticipantAddFragment$initBottomAction$1$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.add.b$b */
    public static final class C46569b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MmParticipantAddFragment f117213a;

        C46569b(MmParticipantAddFragment bVar) {
            this.f117213a = bVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C45855f.m181664c("MmParticipantAddFragment", "participant_edit");
            C47083e.m186425a(this.f117213a.mo161231e(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("participant_edit").mo165416b().mo165413a("edit_type", "add_participant").mo165421c());
            ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(this.f117213a.f117205b);
            if (b != null) {
                b.mo163479a(new Function0<Unit>(this) {
                    /* class com.ss.android.lark.mm.module.participant.add.MmParticipantAddFragment.C46569b.C465701 */
                    final /* synthetic */ C46569b this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final void invoke() {
                        this.this$0.f117213a.f117206c.bj_();
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "invoke", "com/ss/android/lark/mm/module/participant/add/MmParticipantAddFragment$initData$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.add.b$c */
    public static final class C46571c extends Lambda implements Function1<MmParticipants, Unit> {
        final /* synthetic */ MmParticipantAddFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46571c(MmParticipantAddFragment bVar) {
            super(1);
            this.this$0 = bVar;
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
            this.this$0.f117204a = false;
            this.this$0.mo163527a(ParticipantRepo.DataSource.ParticipantSuggestionFirstPage, mmParticipants);
            MmLoadingView mmLoadingView = (MmLoadingView) this.this$0.mo161166a(R.id.loadingView);
            Intrinsics.checkExpressionValueIsNotNull(mmLoadingView, "loadingView");
            mmLoadingView.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "invoke", "com/ss/android/lark/mm/module/participant/add/MmParticipantAddFragment$initData$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.add.b$d */
    public static final class C46572d extends Lambda implements Function1<MmParticipants, Unit> {
        final /* synthetic */ MmParticipantAddFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46572d(MmParticipantAddFragment bVar) {
            super(1);
            this.this$0 = bVar;
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
            this.this$0.mo163527a(ParticipantRepo.DataSource.ParticipantSuggestionNextPage, mmParticipants);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/participant/add/MmParticipantAddFragment$initParticipantRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.add.b$e */
    public static final class C46573e extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ MmParticipantAddFragment f117214a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46573e(MmParticipantAddFragment bVar) {
            this.f117214a = bVar;
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
                    this.f117214a.mo163531g();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.add.b$j */
    public static final class C46582j extends Lambda implements Function1<View, Unit> {
        public static final C46582j INSTANCE = new C46582j();

        C46582j() {
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

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: a */
    public void mo161168a(boolean z) {
        if (z && !this.f117209f) {
            this.f117209f = true;
            mo163530f();
        }
    }

    @Override // com.ss.android.lark.mm.module.participant.add.MmParticipantAddAdapter.IMmParticipantAddAdapterListener
    /* renamed from: b */
    public void mo163523b(MmParticipants.MmParticipantInfo mmParticipantInfo) {
        Intrinsics.checkParameterIsNotNull(mmParticipantInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        m184175h().mo163544b(mmParticipantInfo);
        m184174d(mmParticipantInfo);
    }

    @Override // com.ss.android.lark.mm.module.participant.add.MmSelectedParticipantsAdapter.IMmSelectedParticipantsAdapterListener
    /* renamed from: c */
    public void mo163528c(MmParticipants.MmParticipantInfo mmParticipantInfo) {
        Intrinsics.checkParameterIsNotNull(mmParticipantInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        mo163529d().mo163520b(mmParticipantInfo);
        m184174d(mmParticipantInfo);
    }

    /* renamed from: d */
    private final void m184174d(MmParticipants.MmParticipantInfo mmParticipantInfo) {
        ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(this.f117205b);
        if (b != null) {
            b.mo163473a().getSelectedUsers().remove(mmParticipantInfo);
            if (m184175h().getItemCount() <= 0) {
                BaseAction baseAction = this.f117207d;
                if (baseAction != null) {
                    baseAction.setActionEnabled(false);
                }
                BaseAction baseAction2 = this.f117207d;
                if (baseAction2 != null) {
                    String mustacheFormat = UIHelper.mustacheFormat((int) R.string.MMWeb_G_Selected);
                    Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(R.string.MMWeb_G_Selected)");
                    baseAction2.setDesc(mustacheFormat);
                }
                LinearLayout linearLayout = (LinearLayout) mo161166a(R.id.selectedMembersLayout);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "selectedMembersLayout");
                linearLayout.setVisibility(8);
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.participant.add.MmParticipantAddAdapter.IMmParticipantAddAdapterListener
    /* renamed from: a */
    public void mo163522a(MmParticipants.MmParticipantInfo mmParticipantInfo) {
        T t;
        Intrinsics.checkParameterIsNotNull(mmParticipantInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        m184175h().mo163543a(mmParticipantInfo);
        ParticipantRepo b = ParticipantRepo.f117152e.mo163490b(this.f117205b);
        if (b != null) {
            if (!b.mo163473a().getSelectedUsers().isEmpty()) {
                Iterator<T> it = b.mo163473a().getSelectedUsers().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual(t.getUserId(), mmParticipantInfo.getUserId())) {
                        break;
                    }
                }
                if (t != null) {
                    return;
                }
            }
            b.mo163473a().getSelectedUsers().add(mmParticipantInfo);
            BaseAction baseAction = this.f117207d;
            if (baseAction != null) {
                baseAction.setActionEnabled(true);
            }
            BaseAction baseAction2 = this.f117207d;
            if (baseAction2 != null) {
                baseAction2.setDesc(UIHelper.mustacheFormat((int) R.string.MMWeb_G_Selected) + b.mo163473a().getSelectedUsers().size());
            }
            LinearLayout linearLayout = (LinearLayout) mo161166a(R.id.selectedMembersLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "selectedMembersLayout");
            linearLayout.setVisibility(0);
        }
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m184176i();
        m184181n();
    }

    public MmParticipantAddFragment(String str, IFragmentManager bVar) {
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(bVar, "manager");
        this.f117205b = str;
        this.f117206c = bVar;
    }

    /* renamed from: a */
    public final void mo163527a(ParticipantRepo.DataSource dataSource, MmParticipants mmParticipants) {
        boolean z;
        List<MmParticipants.MmParticipantInfo> list = mmParticipants.getList();
        List<MmParticipants.MmParticipantInfo> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RecyclerView recyclerView = (RecyclerView) mo161166a(R.id.rvUserList);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvUserList");
            recyclerView.setVisibility(8);
            TextView textView = (TextView) mo161166a(R.id.emptyContainer);
            Intrinsics.checkExpressionValueIsNotNull(textView, "emptyContainer");
            textView.setVisibility(0);
            return;
        }
        TextView textView2 = (TextView) mo161166a(R.id.emptyContainer);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "emptyContainer");
        textView2.setVisibility(8);
        RecyclerView recyclerView2 = (RecyclerView) mo161166a(R.id.rvUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rvUserList");
        recyclerView2.setVisibility(0);
        if (dataSource == ParticipantRepo.DataSource.ParticipantSuggestionFirstPage) {
            mo163529d().mo163519a(list);
        } else {
            mo163529d().mo163521b(list);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mm_pariticipant_add, viewGroup, false);
    }
}
