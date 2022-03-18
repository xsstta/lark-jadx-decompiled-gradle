package com.ss.android.lark.invitation.v2.feat.external.main.feishu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.ui.C40098a;
import com.ss.android.lark.invitation.v2.feat.external.common.InviteExternalViewDependency;
import com.ss.android.lark.invitation.v2.feat.external.guide.InviteExternalGuideFragment;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/main/feishu/InviteExternalFeishuFragment;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragment;", "()V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "mFeishuPresenter", "Lcom/ss/android/lark/invitation/v2/feat/external/main/feishu/InviteExternalFeishuPresenter;", "initMVP", "", "container", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.feishu.b */
public final class InviteExternalFeishuFragment extends C40098a {

    /* renamed from: a */
    public static final Companion f102367a = new Companion(null);

    /* renamed from: b */
    private String f102368b;

    /* renamed from: c */
    private C40289d f102369c;

    /* renamed from: d */
    private HashMap f102370d;

    /* renamed from: a */
    public void mo146111a() {
        HashMap hashMap = this.f102370d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo146111a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/main/feishu/InviteExternalFeishuFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/invitation/v2/feat/external/main/feishu/InviteExternalFeishuFragment;", "args", "Landroid/os/Bundle;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.feishu.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InviteExternalFeishuFragment mo146112a(Bundle bundle) {
            InviteExternalFeishuFragment bVar = new InviteExternalFeishuFragment();
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.inv.export.ui.C40098a
    public void onDestroy() {
        super.onDestroy();
        C40289d dVar = this.f102369c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFeishuPresenter");
        }
        dVar.destroy();
        InviteExternalGuideFragment.f102297b.mo146016b();
    }

    /* renamed from: a */
    private final void m159681a(View view) {
        String str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("from_scenes");
        } else {
            str = null;
        }
        this.f102368b = str;
        C40289d dVar = new C40289d(new C40288c(), new C40292e(new InviteExternalViewDependency(view, this), this.f102368b));
        this.f102369c = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFeishuPresenter");
        }
        dVar.mo146114a(this.f102368b);
        C40289d dVar2 = this.f102369c;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFeishuPresenter");
        }
        dVar2.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m159681a(view);
        InviteExternalGuideFragment.f102297b.mo146015a(getActivity());
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return LayoutInflater.from(getContext()).inflate(R.layout.inv_invite_external_view_feishu, viewGroup, false);
    }
}
