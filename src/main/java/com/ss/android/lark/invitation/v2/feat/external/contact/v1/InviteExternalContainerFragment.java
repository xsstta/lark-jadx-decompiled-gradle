package com.ss.android.lark.invitation.v2.feat.external.contact.v1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.api.ContactMobileApi;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.ui.C40098a;
import com.ss.android.lark.inv.export.util.C40124o;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.external.common.InviteExternalViewDependency;
import com.ss.android.lark.sdk.C53241h;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u001a\u0010\u000b\u001a\u00020\u00072\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016J\u001a\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v1/InviteExternalContainerFragment;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragment;", "Lcom/ss/android/lark/contact/entity/api/ContactMobileApi$ContactMobileCallback;", "()V", "mPresenter", "Lcom/ss/android/lark/invitation/v2/feat/external/contact/v1/InviteExternalContactPresenter;", "createContentFragment", "", "initMVP", "container", "Landroid/view/View;", "onBack", "selectedList", "", "Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLoadFinished", "timer", "", "onSelected", "onViewCreated", "view", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v1.e */
public final class InviteExternalContainerFragment extends C40098a implements ContactMobileApi.AbstractC35403b {

    /* renamed from: a */
    public static final Companion f102209a = new Companion(null);

    /* renamed from: b */
    private C40225c f102210b;

    /* renamed from: c */
    private HashMap f102211c;

    /* renamed from: a */
    public void mo145941a() {
        HashMap hashMap = this.f102211c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo145941a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v1/InviteExternalContainerFragment$Companion;", "", "()V", "MTAG", "", "newInstance", "Lcom/ss/android/lark/invitation/v2/feat/external/contact/v1/InviteExternalContainerFragment;", "args", "Landroid/os/Bundle;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v1.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InviteExternalContainerFragment mo145942a(Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(bundle, "args");
            InviteExternalContainerFragment eVar = new InviteExternalContainerFragment();
            eVar.setArguments(bundle);
            return eVar;
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.inv.export.ui.C40098a
    public void onDestroy() {
        super.onDestroy();
        C40225c cVar = this.f102210b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        cVar.destroy();
    }

    /* renamed from: b */
    private final void m159451b() {
        boolean z;
        ContactMobileApi.ContactType contactType;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_email", false);
        } else {
            z = false;
        }
        IInvitationModuleDependency a = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a, "dependency");
        IInvitationModuleDependency.AbstractC40086b contactDependency = a.getContactDependency();
        if (z) {
            contactType = ContactMobileApi.ContactType.EMAIL;
        } else {
            contactType = ContactMobileApi.ContactType.PHONE;
        }
        C40124o.m159089a(getChildFragmentManager(), (int) R.id.iecFragmentContanier, contactDependency.mo145576a(contactType, ContactMobileApi.C35402a.m138368a(), "invite_external"), false, false);
    }

    @Override // com.ss.android.lark.contact.entity.api.ContactMobileApi.AbstractC35403b
    /* renamed from: a */
    public void mo130580a(long j) {
        C53241h.m205898b("InvitationModule", String.valueOf(j) + "");
    }

    @Override // com.ss.android.lark.contact.entity.api.ContactMobileApi.AbstractC35403b
    /* renamed from: b */
    public void mo130582b(List<? extends ContactMobileBean> list) {
        Intrinsics.checkParameterIsNotNull(list, "selectedList");
        C40225c cVar = this.f102210b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        cVar.mo145932a((ContactMobileBean) list.get(0));
    }

    @Override // com.ss.android.lark.contact.entity.api.ContactMobileApi.AbstractC35403b
    /* renamed from: a */
    public void mo130581a(List<? extends ContactMobileBean> list) {
        if (C40147z.m159165e()) {
            C36512a.m144041a().mo134758a(this);
        }
    }

    /* renamed from: a */
    private final void m159450a(View view) {
        String str;
        C40225c cVar = new C40225c(new C40224b(), new C40230d(new InviteExternalViewDependency(view, this)));
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("invite_msg");
        } else {
            str = null;
        }
        cVar.mo145935b(str);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("unique_id");
        }
        cVar.mo145936c(str2);
        cVar.create();
        this.f102210b = cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m159451b();
        m159450a(view);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.inv_invite_external_contact_view, viewGroup, false);
    }
}
