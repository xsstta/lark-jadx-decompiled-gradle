package com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner;

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
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.InviteMemberAskOwnerPresenter;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.InviteMemberViewModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010!\u001a\u00020\u0014H\u0016J\u001a\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerPresenter$Dependency;", "()V", "module", "", "ownerInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "presenter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerPresenter;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", ShareHitPoint.f121868c, "back", "", "finish", "initMVP", "rootView", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.c */
public final class InviteMemberAskOwnerFragment extends C7667e implements InviteMemberAskOwnerPresenter.Dependency {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f26142a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(InviteMemberAskOwnerFragment.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;"))};

    /* renamed from: b */
    public static final Companion f26143b = new Companion(null);

    /* renamed from: c */
    private DocPermSetInfo f26144c = new DocPermSetInfo(null, 0, null, false, null, null, null, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);

    /* renamed from: d */
    private UserInfo f26145d = new UserInfo();

    /* renamed from: e */
    private String f26146e;

    /* renamed from: f */
    private String f26147f;

    /* renamed from: g */
    private final Lazy f26148g = LazyKt.lazy(C9694b.INSTANCE);

    /* renamed from: h */
    private InviteMemberAskOwnerPresenter f26149h;

    /* renamed from: i */
    private HashMap f26150i;

    /* renamed from: d */
    private final C10917c m40139d() {
        Lazy lazy = this.f26148g;
        KProperty kProperty = f26142a[0];
        return (C10917c) lazy.getValue();
    }

    /* renamed from: c */
    public void mo37026c() {
        HashMap hashMap = this.f26150i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo37026c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerFragment$Companion;", "", "()V", "EXTRA_OWNER_INFO", "", "EXTRA_PERM_SET_INFO", "EXTRA_SOURCE", "TAG", "newInstance", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "ownerInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "module", ShareHitPoint.f121868c, "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo37027a(Context context, DocPermSetInfo docPermSetInfo, UserInfo userInfo, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
            Intrinsics.checkParameterIsNotNull(str, "module");
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121868c);
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_perm_set_info", docPermSetInfo);
            bundle.putParcelable("extra_owner_info", userInfo);
            bundle.putString("permission_module", str);
            bundle.putString("extra_source", str2);
            Fragment instantiate = Fragment.instantiate(context, InviteMemberAskOwnerFragment.class.getName(), bundle);
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "Fragment.instantiate(con…t::class.java.name, this)");
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "Bundle().run {\n         …ava.name, this)\n        }");
            return instantiate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.c$b */
    static final class C9694b extends Lambda implements Function0<C10917c> {
        public static final C9694b INSTANCE = new C9694b();

        C9694b() {
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
        C13479a.m54764b("InviteMemberAskOwnerFragment", "onDestroy()...");
        InviteMemberAskOwnerPresenter eVar = this.f26149h;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        eVar.destroy();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.InviteMemberAskOwnerPresenter.Dependency
    /* renamed from: a */
    public void mo37024a() {
        C13479a.m54764b("InviteMemberAskOwnerFragment", "back()...");
        if (getParentFragment() != null && (getParentFragment() instanceof ISearchUserActDependency)) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((ISearchUserActDependency) parentFragment).mo37443j();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency");
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.InviteMemberAskOwnerPresenter.Dependency
    /* renamed from: b */
    public void mo37025b() {
        C13479a.m54764b("InviteMemberAskOwnerFragment", "finish()...");
        if (getParentFragment() != null && (getParentFragment() instanceof ISearchUserActDependency)) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((ISearchUserActDependency) parentFragment).mo37444k();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency");
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        DocPermSetInfo docPermSetInfo;
        UserInfo userInfo;
        String str;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (docPermSetInfo = (DocPermSetInfo) arguments.getParcelable("extra_perm_set_info")) == null) {
            docPermSetInfo = new DocPermSetInfo(null, 0, null, false, null, null, null, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
        }
        this.f26144c = docPermSetInfo;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (userInfo = (UserInfo) arguments2.getParcelable("extra_owner_info")) == null) {
            userInfo = new UserInfo();
        }
        this.f26145d = userInfo;
        Bundle arguments3 = getArguments();
        String str2 = "";
        if (arguments3 == null || (str = arguments3.getString("extra_source")) == null) {
            str = str2;
        }
        this.f26147f = str;
        Bundle arguments4 = getArguments();
        if (!(arguments4 == null || (string = arguments4.getString("permission_module")) == null)) {
            str2 = string;
        }
        this.f26146e = str2;
    }

    /* renamed from: a */
    private final void m40138a(View view) {
        C13479a.m54764b("InviteMemberAskOwnerFragment", "initMVP()...");
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
        InviteMemberAskOwnerView fVar = new InviteMemberAskOwnerView(context, m40139d(), view, this.f26144c, this.f26145d);
        InviteMemberAskOwnerModel dVar = new InviteMemberAskOwnerModel(bVar, this.f26144c);
        Context context2 = getContext();
        if (context2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context2, "context!!");
        C10917c d = m40139d();
        InviteMemberAskOwnerFragment cVar = this;
        String str = this.f26146e;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("module");
        }
        String str2 = this.f26147f;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ShareHitPoint.f121868c);
        }
        InviteMemberAskOwnerPresenter eVar = new InviteMemberAskOwnerPresenter(fVar, dVar, context2, d, cVar, str, str2, this.f26144c, this.f26145d);
        this.f26149h = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        eVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m40138a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_invite_member_ask_owner_layout, viewGroup, false);
    }
}
