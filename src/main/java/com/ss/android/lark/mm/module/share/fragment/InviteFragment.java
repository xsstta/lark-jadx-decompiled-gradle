package com.ss.android.lark.mm.module.share.fragment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.base.IFragmentManager;
import com.ss.android.lark.mm.module.share.adapter.UserListAdapter;
import com.ss.android.lark.mm.module.share.invite.BaseAction;
import com.ss.android.lark.mm.module.share.invite.InviteAction;
import com.ss.android.lark.mm.module.share.invite.MmInviteTitleBar;
import com.ss.android.lark.mm.module.share.model.SharePermission;
import com.ss.android.lark.mm.module.share.model.User;
import com.ss.android.lark.mm.module.share.repo.ShareRepo;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.ClickButtonEvent;
import com.ss.android.lark.mm.statistics.hitpoint.RecordingPageClickEvent;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u0018\u0010\u0014\u001a\u00020\u00112\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/mm/module/share/fragment/InviteFragment;", "Lcom/ss/android/lark/mm/module/share/fragment/ShareBaseFragment;", "repoId", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/mm/module/share/fragment/FragmentType;", "allowExternalShare", "", "canTransfer", "selfPermission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "manager", "Lcom/ss/android/lark/mm/base/IFragmentManager;", "fromSource", "", "(Ljava/lang/String;Lcom/ss/android/lark/mm/module/share/fragment/FragmentType;ZZLcom/ss/android/lark/mm/module/share/model/SharePermission;Lcom/ss/android/lark/mm/base/IFragmentManager;I)V", "init", "", "initData", "initView", "refreshData", "inviteUsers", "", "Lcom/ss/android/lark/mm/module/share/model/User;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.share.fragment.a */
public final class InviteFragment extends ShareBaseFragment {

    /* renamed from: a */
    private HashMap f118290a;

    @Override // com.ss.android.lark.mm.base.BaseFragment, com.ss.android.lark.mm.module.share.MmShareBaseFragment, com.ss.android.lark.mm.module.share.fragment.ShareBaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f118290a == null) {
            this.f118290a = new HashMap();
        }
        View view = (View) this.f118290a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118290a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment, com.ss.android.lark.mm.module.share.MmShareBaseFragment, com.ss.android.lark.mm.module.share.fragment.ShareBaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f118290a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment, com.ss.android.lark.mm.module.share.MmShareBaseFragment, com.ss.android.lark.mm.module.share.fragment.ShareBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo161170c();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/share/fragment/InviteFragment$initData$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.a$a */
    public static final class C46985a extends Lambda implements Function0<Unit> {
        final /* synthetic */ ShareRepo $this_apply;
        final /* synthetic */ InviteFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46985a(ShareRepo shareRepo, InviteFragment aVar) {
            super(0);
            this.$this_apply = shareRepo;
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo164981a(this.$this_apply.mo165191a(false));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.a$b */
    public static final class C46986b extends Lambda implements Function0<Unit> {
        final /* synthetic */ InviteFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46986b(InviteFragment aVar) {
            super(0);
            this.this$0 = aVar;
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
        m186043g();
        m186044l();
    }

    /* renamed from: l */
    private final void m186044l() {
        ShareRepo b = ShareRepo.f118326e.mo165209b(mo164952i());
        if (b != null) {
            mo161167a().mo237937a(b.mo165190a(ShareRepo.DataSource.Candidate, new C46985a(b, this)));
            mo164981a(b.mo165191a(true));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.a$d */
    public static final class C46988d extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ InviteFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46988d(InviteFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/share/fragment/InviteFragment$initView$3$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.share.fragment.a$d$a */
        public static final class C46989a extends Lambda implements Function0<Unit> {
            final /* synthetic */ ShareRepo $this_apply;
            final /* synthetic */ C46988d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46989a(ShareRepo shareRepo, C46988d dVar) {
                super(0);
                this.$this_apply = shareRepo;
                this.this$0 = dVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                if (this.this$0.this$0.mo164954k() == 17) {
                    new RecordingPageClickEvent("header_impower", null, null, null, 14, null).mo165436a(this.$this_apply).mo165437a();
                } else {
                    new ClickButtonEvent("header_impower", null, null, null, null, null, null, SmActions.ACTION_RINGING_EXIT, null).mo165436a(this.$this_apply).mo165437a();
                }
                C47083e.m186423a(this.this$0.this$0.getContext(), "vc_minutes_share_click", C47086i.m186432a().mo165422d("header_impower").mo165423e("none").mo165421c());
                this.this$0.this$0.mo164953j().mo161184a(FragmentType.Permission);
                C45858j.m181680b(ResString.f118656a.mo165504a(R.string.MMWeb_G_InviteSuccess));
            }
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
            C45855f.m181664c("InviteFragment", "invite, fromSource: " + this.this$0.mo164954k());
            ShareRepo b = ShareRepo.f118326e.mo165209b(this.this$0.mo164952i());
            if (b != null) {
                b.mo165200b(new C46989a(b, this));
            }
        }
    }

    /* renamed from: g */
    private final void m186043g() {
        MmInviteTitleBar.m186074a((MmInviteTitleBar) mo161166a(R.id.titleBar), (int) R.drawable.ud_icon_left_outlined, 0, new C46986b(this), 2, (Object) null);
        ((MmInviteTitleBar) mo161166a(R.id.titleBar)).setTitle(ResString.f118656a.mo165504a(R.string.MMWeb_G_InviteCollaborators));
        MmInviteTitleBar.m186075a((MmInviteTitleBar) mo161166a(R.id.titleBar), 0, 0, C46987c.INSTANCE, 2, (Object) null);
        RecyclerView recyclerView = (RecyclerView) mo161166a(R.id.rvUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvUserList");
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = UIUtils.dp2px(getContext(), 12.0f);
            Context requireContext = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            mo164950a(new InviteAction(requireContext));
            BaseAction h = mo164951h();
            if (h != null) {
                C47110e.m186573a(h, new C46988d(this));
            }
            ((FrameLayout) mo161166a(R.id.containerAction)).addView(mo164951h());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.a$c */
    public static final class C46987c extends Lambda implements Function1<View, Unit> {
        public static final C46987c INSTANCE = new C46987c();

        C46987c() {
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

    /* renamed from: a */
    public final void mo164981a(List<User> list) {
        boolean z;
        UserListAdapter.m186015a(mo164991f(), list, null, 2, null);
        BaseAction h = mo164951h();
        if (h != null) {
            List<User> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            h.setActionEnabled(!z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteFragment(String str, FragmentType fragmentType, boolean z, boolean z2, SharePermission sharePermission, IFragmentManager bVar, int i) {
        super(str, fragmentType, z, z2, sharePermission, bVar, i);
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(fragmentType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(sharePermission, "selfPermission");
        Intrinsics.checkParameterIsNotNull(bVar, "manager");
    }
}
