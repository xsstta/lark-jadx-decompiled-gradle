package com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.InviteMemberSendLinkPresenter;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.InviteMemberViewModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\u001a\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkPresenter$Dependency;", "()V", "module", "", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "presenter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkPresenter;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "askOwner", "", "back", "finish", "initMVP", "rootView", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.d */
public final class InviteMemberSendLinkFragment extends C7667e implements InviteMemberSendLinkPresenter.Dependency {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f26210a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(InviteMemberSendLinkFragment.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;"))};

    /* renamed from: b */
    public static final Companion f26211b = new Companion(null);

    /* renamed from: c */
    private DocPermSetInfo f26212c = new DocPermSetInfo(null, 0, null, false, null, null, null, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);

    /* renamed from: d */
    private String f26213d;

    /* renamed from: e */
    private final Lazy f26214e = LazyKt.lazy(C9718b.INSTANCE);

    /* renamed from: f */
    private InviteMemberSendLinkPresenter f26215f;

    /* renamed from: g */
    private HashMap f26216g;

    /* renamed from: e */
    private final C10917c m40217e() {
        Lazy lazy = this.f26214e;
        KProperty kProperty = f26210a[0];
        return (C10917c) lazy.getValue();
    }

    /* renamed from: d */
    public void mo37123d() {
        HashMap hashMap = this.f26216g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo37123d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkFragment$Companion;", "", "()V", "EXTRA_PERM_SET_INFO", "", "TAG", "newInstance", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "module", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo37124a(Context context, DocPermSetInfo docPermSetInfo, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
            Intrinsics.checkParameterIsNotNull(str, "module");
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_perm_set_info", docPermSetInfo);
            bundle.putString("permission_module", str);
            Fragment instantiate = Fragment.instantiate(context, InviteMemberSendLinkFragment.class.getName(), bundle);
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "Fragment.instantiate(con…t::class.java.name, this)");
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "Bundle().run {\n         …ava.name, this)\n        }");
            return instantiate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.d$b */
    static final class C9718b extends Lambda implements Function0<C10917c> {
        public static final C9718b INSTANCE = new C9718b();

        C9718b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C13479a.m54764b("InviteMemberSendLinkFragment", "onDestroy()...");
        InviteMemberSendLinkPresenter fVar = this.f26215f;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        fVar.destroy();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.InviteMemberSendLinkPresenter.Dependency
    /* renamed from: a */
    public void mo37120a() {
        C13479a.m54764b("InviteMemberSendLinkFragment", "back()...");
        if (getParentFragment() != null && (getParentFragment() instanceof ISearchUserActDependency)) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((ISearchUserActDependency) parentFragment).mo37443j();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency");
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.InviteMemberSendLinkPresenter.Dependency
    /* renamed from: b */
    public void mo37121b() {
        C13479a.m54764b("InviteMemberSendLinkFragment", "finish()...");
        if (getParentFragment() != null && (getParentFragment() instanceof ISearchUserActDependency)) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((ISearchUserActDependency) parentFragment).mo37444k();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency");
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.InviteMemberSendLinkPresenter.Dependency
    /* renamed from: c */
    public void mo37122c() {
        C13479a.m54764b("InviteMemberSendLinkFragment", "askOwner()...");
        if (getParentFragment() != null && (getParentFragment() instanceof ISearchUserActDependency)) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((ISearchUserActDependency) parentFragment).mo37490o();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency");
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        DocPermSetInfo docPermSetInfo;
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (docPermSetInfo = (DocPermSetInfo) arguments.getParcelable("extra_perm_set_info")) == null) {
            docPermSetInfo = new DocPermSetInfo(null, 0, null, false, null, null, null, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
        }
        this.f26212c = docPermSetInfo;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("permission_module")) == null) {
            str = "";
        }
        this.f26213d = str;
    }

    /* renamed from: a */
    private final void m40216a(View view) {
        C13479a.m54764b("InviteMemberSendLinkFragment", "initMVP()...");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        AbstractC1142af a = aj.m5366a(activity).mo6005a(InviteMemberViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(ac…berViewModel::class.java)");
        ISelectedUserModel bVar = (ISelectedUserModel) a;
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        InviteMemberSendLinkView gVar = new InviteMemberSendLinkView(context, m40217e(), view, this.f26212c.mo38825b());
        InviteMemberSendLinkModel eVar = new InviteMemberSendLinkModel(bVar, this.f26212c, m40217e());
        Context context2 = getContext();
        if (context2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context2, "context!!");
        InviteMemberSendLinkFragment dVar = this;
        DocPermSetInfo docPermSetInfo = this.f26212c;
        String str = this.f26213d;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("module");
        }
        InviteMemberSendLinkPresenter fVar = new InviteMemberSendLinkPresenter(gVar, eVar, context2, dVar, docPermSetInfo, str);
        this.f26215f = fVar;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        fVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m40216a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_invite_member_send_link_layout, viewGroup, false);
    }
}
