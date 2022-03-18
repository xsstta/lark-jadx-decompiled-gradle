package com.ss.android.lark.mm.module.share.fragment;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.base.IFragmentManager;
import com.ss.android.lark.mm.module.detail.MmDetailErrorFactory;
import com.ss.android.lark.mm.module.share.adapter.ThumbnailListAdapter;
import com.ss.android.lark.mm.module.share.invite.BaseAction;
import com.ss.android.lark.mm.module.share.invite.MmInviteTitleBar;
import com.ss.android.lark.mm.module.share.invite.NextAction;
import com.ss.android.lark.mm.module.share.model.SharePermission;
import com.ss.android.lark.mm.module.share.model.User;
import com.ss.android.lark.mm.module.share.repo.ShareRepo;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.searchcommon.view.SearchInputView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0018\u0010\u0017\u001a\u00020\u00132\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0014J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/mm/module/share/fragment/SearchFragment;", "Lcom/ss/android/lark/mm/module/share/fragment/ShareBaseFragment;", "repoId", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/mm/module/share/fragment/FragmentType;", "allowExternalShare", "", "canTransfer", "selfPermission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "manager", "Lcom/ss/android/lark/mm/base/IFragmentManager;", "fromSource", "", "(Ljava/lang/String;Lcom/ss/android/lark/mm/module/share/fragment/FragmentType;ZZLcom/ss/android/lark/mm/module/share/model/SharePermission;Lcom/ss/android/lark/mm/base/IFragmentManager;I)V", "thumbnailAdapter", "Lcom/ss/android/lark/mm/module/share/adapter/ThumbnailListAdapter;", "bindSelectedList", "", "inviteUsers", "", "Lcom/ss/android/lark/mm/module/share/model/User;", "bindUserList", "userList", "init", "initData", "initView", "onDestroyView", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.share.fragment.c */
public final class SearchFragment extends ShareBaseFragment {

    /* renamed from: a */
    public ThumbnailListAdapter f118292a;

    /* renamed from: c */
    private HashMap f118293c;

    @Override // com.ss.android.lark.mm.base.BaseFragment, com.ss.android.lark.mm.module.share.MmShareBaseFragment, com.ss.android.lark.mm.module.share.fragment.ShareBaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f118293c == null) {
            this.f118293c = new HashMap();
        }
        View view = (View) this.f118293c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118293c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment, com.ss.android.lark.mm.module.share.MmShareBaseFragment, com.ss.android.lark.mm.module.share.fragment.ShareBaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f118293c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/share/fragment/SearchFragment$initData$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.c$d */
    public static final class C46996d extends Lambda implements Function0<Unit> {
        final /* synthetic */ ShareRepo $this_apply;
        final /* synthetic */ SearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46996d(ShareRepo shareRepo, SearchFragment cVar) {
            super(0);
            this.$this_apply = shareRepo;
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo164986a(this.$this_apply.mo165202d());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/share/fragment/SearchFragment$initData$1$5"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.c$e */
    public static final class C46997e extends Lambda implements Function0<Unit> {
        final /* synthetic */ ShareRepo $this_apply;
        final /* synthetic */ SearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46997e(ShareRepo shareRepo, SearchFragment cVar) {
            super(0);
            this.$this_apply = shareRepo;
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo164987b(this.$this_apply.mo165203f());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.c$g */
    public static final class C46999g extends Lambda implements Function0<Unit> {
        final /* synthetic */ SearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46999g(SearchFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo164953j().bj_();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.module.share.MmShareBaseFragment, com.ss.android.lark.mm.module.share.fragment.ShareBaseFragment
    /* renamed from: e */
    public void mo163508e() {
        super.mo163508e();
        m186056g();
        m186057l();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.c$a */
    public static final class C46993a extends Lambda implements Function0<Unit> {
        final /* synthetic */ SearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46993a(SearchFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            int itemCount = SearchFragment.m186055a(this.this$0).getItemCount() - 1;
            if (itemCount >= 0) {
                ((RecyclerView) this.this$0.mo161166a(R.id.rvThumbnail)).scrollToPosition(itemCount);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/share/fragment/SearchFragment$initData$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.c$c */
    public static final class C46995c extends Lambda implements Function0<Unit> {
        final /* synthetic */ ShareRepo $this_apply;
        final /* synthetic */ SearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46995c(ShareRepo shareRepo, SearchFragment cVar) {
            super(0);
            this.$this_apply = shareRepo;
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.$this_apply.mo165194a(((SearchInputView) this.this$0.mo161166a(R.id.searchBar)).getQuery(), true);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment, com.ss.android.lark.mm.module.share.MmShareBaseFragment, com.ss.android.lark.mm.module.share.fragment.ShareBaseFragment
    public void onDestroyView() {
        ShareRepo b = ShareRepo.f118326e.mo165209b(mo164952i());
        if (b != null) {
            b.mo165205h();
        }
        super.onDestroyView();
        mo161170c();
    }

    /* renamed from: l */
    private final void m186057l() {
        ShareRepo b = ShareRepo.f118326e.mo165209b(mo164952i());
        if (b != null) {
            mo161167a().mo237937a(b.mo165190a(ShareRepo.DataSource.ShareInfo, new C46995c(b, this)));
            mo161167a().mo237937a(b.mo165190a(ShareRepo.DataSource.Search, new C46996d(b, this)));
            mo161167a().mo237937a(b.mo165190a(ShareRepo.DataSource.Candidate, new C46997e(b, this)));
            ShareRepo.m186089a(b, null, false, 3, null);
        }
    }

    /* renamed from: g */
    private final void m186056g() {
        SearchInputView searchInputView = (SearchInputView) mo161166a(R.id.searchBar);
        Intrinsics.checkExpressionValueIsNotNull(searchInputView, "searchBar");
        searchInputView.setVisibility(0);
        ((SearchInputView) mo161166a(R.id.searchBar)).setOnSearch(new C46998f(this));
        MmInviteTitleBar.m186074a((MmInviteTitleBar) mo161166a(R.id.titleBar), (int) R.drawable.ud_icon_left_outlined, 0, new C46999g(this), 2, (Object) null);
        ((MmInviteTitleBar) mo161166a(R.id.titleBar)).setTitle(ResString.f118656a.mo165504a(R.string.MMWeb_G_InviteCollaborators));
        MmInviteTitleBar.m186075a((MmInviteTitleBar) mo161166a(R.id.titleBar), 0, 0, C47000h.INSTANCE, 2, (Object) null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        RecyclerView recyclerView = (RecyclerView) mo161166a(R.id.rvThumbnail);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvThumbnail");
        recyclerView.setLayoutManager(linearLayoutManager);
        this.f118292a = new ThumbnailListAdapter();
        RecyclerView recyclerView2 = (RecyclerView) mo161166a(R.id.rvThumbnail);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rvThumbnail");
        ThumbnailListAdapter aVar = this.f118292a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thumbnailAdapter");
        }
        recyclerView2.setAdapter(aVar);
        RecyclerView recyclerView3 = (RecyclerView) mo161166a(R.id.rvThumbnail);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rvThumbnail");
        recyclerView3.setVisibility(0);
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        mo164950a(new NextAction(requireContext));
        BaseAction h = mo164951h();
        if (h != null) {
            C47110e.m186573a(h, new C47001i(this));
        }
        ((FrameLayout) mo161166a(R.id.containerAction)).addView(mo164951h());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "user", "Lcom/ss/android/lark/mm/module/share/model/User;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.c$b */
    public static final class C46994b extends Lambda implements Function1<User, Unit> {
        final /* synthetic */ SearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46994b(SearchFragment cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            invoke(user);
            return Unit.INSTANCE;
        }

        public final void invoke(User user) {
            Intrinsics.checkParameterIsNotNull(user, "user");
            ShareRepo b = ShareRepo.f118326e.mo165209b(this.this$0.mo164952i());
            if (b != null) {
                b.mo165198a(user);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mm/module/share/fragment/SearchFragment$initView$1", "Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnSearch;", "onSearch", "", SearchIntents.EXTRA_QUERY, "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.c$f */
    public static final class C46998f implements SearchInputView.IOnSearch {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f118294a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46998f(SearchFragment cVar) {
            this.f118294a = cVar;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchInputView.IOnSearch
        /* renamed from: a */
        public void mo162383a(String str) {
            Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
            ShareRepo b = ShareRepo.f118326e.mo165209b(this.f118294a.mo164952i());
            if (b != null) {
                ShareRepo.m186089a(b, str, false, 2, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.c$h */
    public static final class C47000h extends Lambda implements Function1<View, Unit> {
        public static final C47000h INSTANCE = new C47000h();

        C47000h() {
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

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.c$i */
    public static final class C47001i extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ SearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47001i(SearchFragment cVar) {
            super(1);
            this.this$0 = cVar;
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
            C45855f.m181664c("SearchFragment", "click invite");
            this.this$0.mo164953j().mo161184a(FragmentType.Invite);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ThumbnailListAdapter m186055a(SearchFragment cVar) {
        ThumbnailListAdapter aVar = cVar.f118292a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thumbnailAdapter");
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo164986a(List<User> list) {
        boolean z;
        List<User> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            MmDetailErrorFactory cVar = MmDetailErrorFactory.f115916a;
            FrameLayout frameLayout = (FrameLayout) mo161166a(R.id.emptyContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "emptyContainer");
            cVar.mo161619a(frameLayout);
        } else {
            MmDetailErrorFactory cVar2 = MmDetailErrorFactory.f115916a;
            FrameLayout frameLayout2 = (FrameLayout) mo161166a(R.id.emptyContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "emptyContainer");
            cVar2.mo161623c(frameLayout2);
        }
        mo164991f().mo164961a(list, new C46994b(this));
    }

    /* renamed from: b */
    public final void mo164987b(List<User> list) {
        ThumbnailListAdapter aVar = this.f118292a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thumbnailAdapter");
        }
        aVar.mo164957a(list, new C46993a(this));
        BaseAction h = mo164951h();
        if (h != null) {
            h.setDesc(ResString.f118656a.mo165504a(R.string.MMWeb_G_Selected) + list.size());
        }
        BaseAction h2 = mo164951h();
        if (h2 != null) {
            h2.setActionEnabled(!list.isEmpty());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFragment(String str, FragmentType fragmentType, boolean z, boolean z2, SharePermission sharePermission, IFragmentManager bVar, int i) {
        super(str, fragmentType, z, z2, sharePermission, bVar, i);
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(fragmentType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(sharePermission, "selfPermission");
        Intrinsics.checkParameterIsNotNull(bVar, "manager");
    }
}
