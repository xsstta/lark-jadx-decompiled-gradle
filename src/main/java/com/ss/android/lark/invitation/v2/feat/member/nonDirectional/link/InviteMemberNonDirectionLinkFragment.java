package com.ss.android.lark.invitation.v2.feat.member.nonDirectional.link;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.ui.C40098a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/link/InviteMemberNonDirectionLinkFragment;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragment;", "()V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "presenter", "Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/link/InviteMemberNonDirectionLinkPresenter;", "getPresenter", "()Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/link/InviteMemberNonDirectionLinkPresenter;", "setPresenter", "(Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/link/InviteMemberNonDirectionLinkPresenter;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.link.a */
public final class InviteMemberNonDirectionLinkFragment extends C40098a {

    /* renamed from: c */
    public static final Companion f102649c = new Companion(null);

    /* renamed from: a */
    public String f102650a;

    /* renamed from: b */
    public InviteMemberNonDirectionLinkPresenter f102651b;

    /* renamed from: d */
    private HashMap f102652d;

    /* renamed from: a */
    public View mo146372a(int i) {
        if (this.f102652d == null) {
            this.f102652d = new HashMap();
        }
        View view = (View) this.f102652d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f102652d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public void mo146375c() {
        HashMap hashMap = this.f102652d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo146375c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/link/InviteMemberNonDirectionLinkFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/link/InviteMemberNonDirectionLinkFragment;", "args", "Landroid/os/Bundle;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.link.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InviteMemberNonDirectionLinkFragment mo146376a(Bundle bundle) {
            InviteMemberNonDirectionLinkFragment aVar = new InviteMemberNonDirectionLinkFragment();
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* renamed from: a */
    public final String mo146373a() {
        String str = this.f102650a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        return str;
    }

    /* renamed from: b */
    public final InviteMemberNonDirectionLinkPresenter mo146374b() {
        InviteMemberNonDirectionLinkPresenter bVar = this.f102651b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("from_scenes")) == null) {
            str = "";
        }
        this.f102650a = str;
        this.f102651b = new InviteMemberNonDirectionLinkPresenter();
        InviteMemberNonDirectionLinkView inviteMemberNonDirectionLinkView = new InviteMemberNonDirectionLinkView(this);
        InviteMemberNonDirectionLinkPresenter bVar = this.f102651b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        inviteMemberNonDirectionLinkView.mo145594a(bVar);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.inv_invite_member_non_directional_link_view, viewGroup, false);
    }
}
