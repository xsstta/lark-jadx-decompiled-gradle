package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc;

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
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc.DocInviteMemberManagerPresenter;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc.isv.template.TemplateInviteMemberManagerModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc.isv.template.TemplateInviteMemberManagerView;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.InviteMemberViewModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.share.export.UserInfo;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010\u00192\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010$\u001a\u00020\u0015H\u0016J\u001a\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006("}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerPresenter$Dependency;", "()V", "fromSharePanel", "", "module", "", "ownerInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "presenter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerPresenter;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "back", "", "finish", "initDocMVP", "rootView", "Landroid/view/View;", "initMVP", "initTemplateMVP", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.a */
public final class DocInviteMemberManagerFragment extends C7667e implements DocInviteMemberManagerPresenter.Dependency {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f25982a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocInviteMemberManagerFragment.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;"))};

    /* renamed from: b */
    public static final Companion f25983b = new Companion(null);

    /* renamed from: c */
    private DocPermSetInfo f25984c = new DocPermSetInfo(null, 0, null, false, null, null, null, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);

    /* renamed from: d */
    private final Lazy f25985d = LazyKt.lazy(C9665b.INSTANCE);

    /* renamed from: e */
    private DocInviteMemberManagerPresenter f25986e;

    /* renamed from: f */
    private String f25987f;

    /* renamed from: g */
    private UserInfo f25988g;

    /* renamed from: h */
    private boolean f25989h;

    /* renamed from: i */
    private HashMap f25990i;

    /* renamed from: d */
    private final C10917c m40000d() {
        Lazy lazy = this.f25985d;
        KProperty kProperty = f25982a[0];
        return (C10917c) lazy.getValue();
    }

    /* renamed from: c */
    public void mo36930c() {
        HashMap hashMap = this.f25990i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerFragment$Companion;", "", "()V", "EXTRA_FROM_SHARE_PANEL", "", "EXTRA_MODULE", "EXTRA_OWNER_INFO", "EXTRA_PERM_SET_INFO", "TAG", "newInstance", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "module", "ownerInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "fromSharePanel", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo36931a(Context context, DocPermSetInfo docPermSetInfo, String str, UserInfo userInfo, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
            Intrinsics.checkParameterIsNotNull(str, "module");
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_perm_set_info", docPermSetInfo);
            bundle.putString("extra_module", str);
            bundle.putBoolean("from_share_panel", z);
            bundle.putParcelable("extra_owner_info", userInfo);
            Fragment instantiate = Fragment.instantiate(context, DocInviteMemberManagerFragment.class.getName(), bundle);
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "Fragment.instantiate(con…t::class.java.name, args)");
            return instantiate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.a$b */
    static final class C9665b extends Lambda implements Function0<C10917c> {
        public static final C9665b INSTANCE = new C9665b();

        C9665b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        DocInviteMemberManagerPresenter cVar = this.f25986e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        cVar.destroy();
        mo36930c();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc.DocInviteMemberManagerPresenter.Dependency
    /* renamed from: a */
    public void mo36928a() {
        if (getParentFragment() != null && (getParentFragment() instanceof ISearchUserActDependency)) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((ISearchUserActDependency) parentFragment).mo37443j();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency");
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc.DocInviteMemberManagerPresenter.Dependency
    /* renamed from: b */
    public void mo36929b() {
        if (getParentFragment() != null && (getParentFragment() instanceof ISearchUserActDependency)) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((ISearchUserActDependency) parentFragment).mo37444k();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency");
        }
    }

    /* renamed from: a */
    private final void m39997a(View view) {
        String str = this.f25987f;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("module");
        }
        if (Intrinsics.areEqual(str, "template")) {
            m39999c(view);
        } else {
            m39998b(view);
        }
    }

    /* renamed from: b */
    private final void m39998b(View view) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        AbstractC1142af a = aj.m5366a(activity).mo6005a(InviteMemberViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(ac…berViewModel::class.java)");
        DocInviteMemberManagerModel bVar = new DocInviteMemberManagerModel(m40000d(), (ISelectedUserModel) a, this.f25984c);
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        DocInviteMemberManagerView dVar = new DocInviteMemberManagerView(context, m40000d(), view, this.f25984c);
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity2, "activity!!");
        C10917c d = m40000d();
        DocInviteMemberManagerFragment aVar = this;
        DocPermSetInfo docPermSetInfo = this.f25984c;
        String str = this.f25987f;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("module");
        }
        DocInviteMemberManagerPresenter cVar = new DocInviteMemberManagerPresenter(activity2, d, bVar, dVar, aVar, docPermSetInfo, str, this.f25988g, this.f25989h);
        this.f25986e = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        cVar.create();
    }

    /* renamed from: c */
    private final void m39999c(View view) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        AbstractC1142af a = aj.m5366a(activity).mo6005a(InviteMemberViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(ac…berViewModel::class.java)");
        TemplateInviteMemberManagerModel bVar = new TemplateInviteMemberManagerModel(m40000d(), (ISelectedUserModel) a, this.f25984c);
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        TemplateInviteMemberManagerView cVar = new TemplateInviteMemberManagerView(context, m40000d(), view, this.f25984c);
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity2, "activity!!");
        C10917c d = m40000d();
        DocInviteMemberManagerFragment aVar = this;
        DocPermSetInfo docPermSetInfo = this.f25984c;
        String str = this.f25987f;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("module");
        }
        DocInviteMemberManagerPresenter cVar2 = new DocInviteMemberManagerPresenter(activity2, d, bVar, cVar, aVar, docPermSetInfo, str, this.f25988g, this.f25989h);
        this.f25986e = cVar2;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        cVar2.create();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        DocPermSetInfo docPermSetInfo;
        UserInfo userInfo;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (docPermSetInfo = (DocPermSetInfo) arguments.getParcelable("extra_perm_set_info")) == null) {
            docPermSetInfo = new DocPermSetInfo(null, 0, null, false, null, null, null, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
        }
        this.f25984c = docPermSetInfo;
        Bundle arguments2 = getArguments();
        String str = "";
        if (!(arguments2 == null || (string = arguments2.getString("extra_module", str)) == null)) {
            str = string;
        }
        this.f25987f = str;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            userInfo = (UserInfo) arguments3.getParcelable("extra_owner_info");
        } else {
            userInfo = null;
        }
        this.f25988g = userInfo;
        Bundle arguments4 = getArguments();
        boolean z = false;
        if (arguments4 != null) {
            z = arguments4.getBoolean("from_share_panel", false);
        }
        this.f25989h = z;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m39997a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_invite_member_manager_layout, viewGroup, false);
    }
}
