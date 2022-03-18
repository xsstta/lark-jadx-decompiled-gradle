package com.bytedance.ee.bear.middleground.permission.collaborator.search.department;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.InviteMemberViewModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.department.DepartmentPresenter;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\u001a\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentPresenter$Dependency;", "()V", "depPresenter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentPresenter;", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "params", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "onBack", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.b */
public final class DepartmentFragment extends C7667e implements DepartmentPresenter.Dependency {

    /* renamed from: a */
    public static final Companion f26686a = new Companion(null);

    /* renamed from: b */
    private DepartmentPresenter f26687b;

    /* renamed from: c */
    private ArrayList<UserInfo> f26688c = new ArrayList<>();

    /* renamed from: d */
    private InviteMemberParams f26689d = new InviteMemberParams(null, 0, null, null, null, false, false, false, false, false, false, false, 4095, null);

    /* renamed from: e */
    private HashMap f26690e;

    /* renamed from: b */
    public void mo37582b() {
        HashMap hashMap = this.f26690e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentFragment$Companion;", "", "()V", "EXTRA_ORIGIN_USERS", "", "EXTRA_PARAMS", "TAG", "newInstance", "Landroidx/fragment/app/Fragment;", "userInfoList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "params", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo37583a(ArrayList<UserInfo> arrayList, InviteMemberParams inviteMemberParams) {
            Intrinsics.checkParameterIsNotNull(arrayList, "userInfoList");
            Intrinsics.checkParameterIsNotNull(inviteMemberParams, "params");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("extra_origin_users", arrayList);
            bundle.putParcelable("extra_params", inviteMemberParams);
            DepartmentFragment bVar = new DepartmentFragment();
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        DepartmentPresenter eVar = this.f26687b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("depPresenter");
        }
        eVar.destroy();
        mo37582b();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.DepartmentPresenter.Dependency
    /* renamed from: a */
    public void mo37581a() {
        if (getParentFragment() != null) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(parentFragment, "parentFragment!!");
            if (parentFragment.getParentFragment() != null) {
                Fragment parentFragment2 = getParentFragment();
                if (parentFragment2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(parentFragment2, "parentFragment!!");
                if (parentFragment2.getParentFragment() instanceof ISearchUserActDependency) {
                    Fragment parentFragment3 = getParentFragment();
                    if (parentFragment3 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(parentFragment3, "parentFragment!!");
                    Fragment parentFragment4 = parentFragment3.getParentFragment();
                    if (parentFragment4 != null) {
                        ((ISearchUserActDependency) parentFragment4).mo37443j();
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency");
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        ArrayList arrayList;
        InviteMemberParams inviteMemberParams;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arrayList = arguments.getParcelableArrayList("extra_origin_users");
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f26688c.clear();
            this.f26688c.addAll(arrayList);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (inviteMemberParams = (InviteMemberParams) arguments2.getParcelable("extra_params")) == null) {
            inviteMemberParams = new InviteMemberParams(null, 0, null, null, null, false, false, false, false, false, false, false, 4095, null);
        }
        this.f26689d = inviteMemberParams;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        C10917c cVar = new C10917c(new C10929e());
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        if (f == null || (str = f.f14584a) == null) {
            str = "";
        }
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
        DepartmentModel cVar2 = new DepartmentModel(context, cVar, bVar, this.f26688c, this.f26689d);
        Context context2 = getContext();
        if (context2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context2, "context!!");
        DepartmentView fVar = new DepartmentView(context2, view, str, this.f26689d.mo36845i());
        Context context3 = getContext();
        if (context3 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context3, "context!!");
        DepartmentPresenter eVar = new DepartmentPresenter(context3, cVar2, fVar, this, this.f26689d);
        this.f26687b = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("depPresenter");
        }
        eVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_department_layout, viewGroup, false);
    }
}
