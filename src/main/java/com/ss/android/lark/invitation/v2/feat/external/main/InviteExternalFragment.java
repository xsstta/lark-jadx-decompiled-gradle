package com.ss.android.lark.invitation.v2.feat.external.main;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\u001a\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/main/InviteExternalFragment;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragment;", "()V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "isMyQrcode", "", "()Z", "setMyQrcode", "(Z)V", "mPresenter", "Lcom/ss/android/lark/invitation/v2/feat/external/main/InviteExternalPresenter;", "initMVP", "", "container", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.b */
public final class InviteExternalFragment extends C40098a {

    /* renamed from: b */
    public static final Companion f102334b = new Companion(null);

    /* renamed from: a */
    public String f102335a;

    /* renamed from: c */
    private boolean f102336c;

    /* renamed from: d */
    private C40278e f102337d;

    /* renamed from: e */
    private HashMap f102338e;

    /* renamed from: a */
    public void mo146081a() {
        HashMap hashMap = this.f102338e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo146081a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/main/InviteExternalFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/invitation/v2/feat/external/main/InviteExternalFragment;", "args", "Landroid/os/Bundle;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InviteExternalFragment mo146082a(Bundle bundle) {
            InviteExternalFragment bVar = new InviteExternalFragment();
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.inv.export.ui.C40098a
    public void onDestroy() {
        super.onDestroy();
        C40278e eVar = this.f102337d;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        eVar.destroy();
        InviteExternalGuideFragment.f102297b.mo146016b();
    }

    /* renamed from: a */
    private final void m159614a(View view) {
        String str;
        boolean z;
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("from_scenes")) == null) {
            str = "unknown";
        }
        this.f102335a = str;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("IS_MY_QR")) == null) {
            z = false;
        } else {
            z = Boolean.parseBoolean(string);
        }
        this.f102336c = z;
        C40276d dVar = new C40276d();
        InviteExternalViewDependency eVar = new InviteExternalViewDependency(view, this);
        String str2 = this.f102335a;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        C40278e eVar2 = new C40278e(dVar, new C40281f(eVar, str2, this.f102336c));
        this.f102337d = eVar2;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        String str3 = this.f102335a;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        eVar2.mo146084a(str3);
        C40278e eVar3 = this.f102337d;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        eVar3.mo146085a(this.f102336c);
        C40278e eVar4 = this.f102337d;
        if (eVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        eVar4.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m159614a(view);
        InviteExternalGuideFragment.f102297b.mo146015a(getActivity());
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return LayoutInflater.from(getContext()).inflate(R.layout.inv_invite_external_view, viewGroup, false);
    }
}
