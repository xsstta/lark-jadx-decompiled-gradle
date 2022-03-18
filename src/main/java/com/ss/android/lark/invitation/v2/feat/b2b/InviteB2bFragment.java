package com.ss.android.lark.invitation.v2.feat.b2b;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/b2b/InviteB2bFragment;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragment;", "()V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "presenter", "Lcom/ss/android/lark/invitation/v2/feat/b2b/InviteB2bPresenter;", "getPresenter", "()Lcom/ss/android/lark/invitation/v2/feat/b2b/InviteB2bPresenter;", "setPresenter", "(Lcom/ss/android/lark/invitation/v2/feat/b2b/InviteB2bPresenter;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.a */
public final class InviteB2bFragment extends C40098a {

    /* renamed from: c */
    public static final Companion f102039c = new Companion(null);

    /* renamed from: a */
    public String f102040a;

    /* renamed from: b */
    public InviteB2bPresenter f102041b;

    /* renamed from: d */
    private HashMap f102042d;

    /* renamed from: a */
    public View mo145754a(int i) {
        if (this.f102042d == null) {
            this.f102042d = new HashMap();
        }
        View view = (View) this.f102042d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f102042d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public void mo145756b() {
        HashMap hashMap = this.f102042d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo145756b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/b2b/InviteB2bFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/invitation/v2/feat/b2b/InviteB2bFragment;", "args", "Landroid/os/Bundle;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.b2b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InviteB2bFragment mo145757a(Bundle bundle) {
            InviteB2bFragment aVar = new InviteB2bFragment();
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* renamed from: a */
    public final String mo145755a() {
        String str = this.f102040a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        return str;
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
        this.f102040a = str;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        this.f102041b = new InviteB2bPresenter(str);
        InviteB2bView inviteB2bView = new InviteB2bView(this);
        InviteB2bPresenter bVar = this.f102041b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        inviteB2bView.mo145594a(bVar);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.inv_b2b_view, viewGroup, false);
    }
}
