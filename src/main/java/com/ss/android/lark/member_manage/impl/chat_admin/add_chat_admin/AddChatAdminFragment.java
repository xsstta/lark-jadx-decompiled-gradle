package com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.member_manage.impl.base.mvp.C45081c;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.AddChatAdminView;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "presenter", "Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminPresenter;", "viewDependency", "Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminView$ViewDependency;", "getViewDependency", "()Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminView$ViewDependency;", "viewDependency$delegate", "Lkotlin/Lazy;", "initMVP", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "ViewDependency", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.b */
public final class AddChatAdminFragment extends BaseFragment {

    /* renamed from: a */
    private AddChatAdminPresenter f114236a;

    /* renamed from: b */
    private final Lazy f114237b = LazyKt.lazy(new C45121b(this));

    /* renamed from: c */
    private HashMap f114238c;

    /* renamed from: b */
    private final AddChatAdminView.ViewDependency m179059b() {
        return (AddChatAdminView.ViewDependency) this.f114237b.getValue();
    }

    /* renamed from: a */
    public void mo159613a() {
        HashMap hashMap = this.f114238c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo159613a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\t\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminFragment$ViewDependency;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseViewDependency;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminView$ViewDependency;", "activity", "Landroid/app/Activity;", "(Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminFragment;Landroid/app/Activity;)V", "finishActivity", "", "finishActivityForChangeChatAdmin", "injectView", "selectMemberView", "Lcom/ss/android/lark/member_manage/impl/base/mvp/IGroupMemberBaseContract$IBaseView;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.b$a */
    public final class ViewDependency extends C45081c implements AddChatAdminView.ViewDependency {
        @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
        /* renamed from: a */
        public void mo159423a() {
            AddChatAdminFragment.this.finish();
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
        /* renamed from: b */
        public void mo159432b() {
            AddChatAdminFragment.this.setResult(-1);
            AddChatAdminFragment.this.finish();
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
        /* renamed from: a */
        public void mo159429a(IGroupMemberBaseContract.AbstractC45066b<?> bVar) {
            View view;
            if (bVar != null && (view = AddChatAdminFragment.this.getView()) != null) {
                ButterKnife.bind(bVar, view);
            }
        }

        public ViewDependency(Activity activity) {
            super(activity);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminFragment$ViewDependency;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminFragment;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.b$b */
    static final class C45121b extends Lambda implements Function0<ViewDependency> {
        final /* synthetic */ AddChatAdminFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45121b(AddChatAdminFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewDependency invoke() {
            AddChatAdminFragment bVar = this.this$0;
            return new ViewDependency(bVar.getActivity());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        AddChatAdminPresenter eVar = this.f114236a;
        if (eVar != null) {
            eVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: c */
    private final void m179060c() {
        AddChatAdminModel dVar = new AddChatAdminModel();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        AddChatAdminModel dVar2 = dVar;
        AddChatAdminView fVar = new AddChatAdminView(requireActivity, m179059b());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
            Intrinsics.checkExpressionValueIsNotNull(arguments, "Bundle.EMPTY");
        }
        AddChatAdminPresenter eVar = new AddChatAdminPresenter(dVar2, fVar, arguments);
        this.f114236a = eVar;
        if (eVar != null) {
            eVar.create();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m179060c();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.activity_show_group_member, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…member, container, false)");
        return inflate;
    }
}
