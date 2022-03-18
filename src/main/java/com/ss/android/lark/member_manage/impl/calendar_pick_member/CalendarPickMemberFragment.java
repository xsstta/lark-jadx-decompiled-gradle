package com.ss.android.lark.member_manage.impl.calendar_pick_member;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.dto.SelectedData;
import com.ss.android.lark.member_manage.impl.base.mvp.C45081c;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45085e;
import com.ss.android.lark.member_manage.impl.calendar_pick_member.CalendarPickMemberView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u001a\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberFragment;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/FloatWindowParams;", "()V", "presenter", "Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberPresenter;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onViewCreated", "view", "ViewDependency", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.c */
public final class CalendarPickMemberFragment extends C36516a<FloatWindowParams> {

    /* renamed from: a */
    private CalendarPickMemberPresenter f114180a;

    /* renamed from: b */
    private HashMap f114181b;

    /* renamed from: a */
    public void mo159554a() {
        HashMap hashMap = this.f114181b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo159554a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        CalendarPickMemberPresenter fVar = this.f114180a;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        KeyboardUtils.hideKeyboard(getContext());
        super.onPause();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberFragment$ViewDependency;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseViewDependency;", "Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberView$Dependency;", "(Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberFragment;)V", "closeForResult", "", "selectChatterIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "finishActivity", "injectView", "selectMemberView", "Lcom/ss/android/lark/member_manage/impl/base/mvp/IGroupMemberBaseContract$IBaseView;", "startSelected", "list", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.c$a */
    public final class ViewDependency extends C45081c implements CalendarPickMemberView.Dependency {
        @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
        /* renamed from: a */
        public void mo159423a() {
            if (DesktopUtil.m144301a(CalendarPickMemberFragment.this.getContext())) {
                CalendarPickMemberFragment.this.finish();
            } else {
                super.mo159423a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDependency() {
            super(CalendarPickMemberFragment.this.getActivity());
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
        /* renamed from: a */
        public void mo159429a(IGroupMemberBaseContract.AbstractC45066b<?> bVar) {
            View view;
            if (!DesktopUtil.m144301a(CalendarPickMemberFragment.this.getContext())) {
                super.mo159429a(bVar);
            } else if (bVar != null && (view = CalendarPickMemberFragment.this.getView()) != null) {
                ButterKnife.bind(bVar, view);
            }
        }

        @Override // com.ss.android.lark.member_manage.impl.calendar_pick_member.CalendarPickMemberView.Dependency
        /* renamed from: a */
        public void mo159555a(ArrayList<String> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "selectChatterIds");
            Intent intent = new Intent();
            intent.putStringArrayListExtra("key_chatter_ids", arrayList);
            CalendarPickMemberFragment.this.setResult(-1, intent);
            CalendarPickMemberFragment.this.finish();
        }

        @Override // com.ss.android.lark.member_manage.impl.calendar_pick_member.CalendarPickMemberView.Dependency
        /* renamed from: b */
        public void mo159556b(List<? extends C45084c> list) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            ArrayList arrayList = new ArrayList(list.size());
            for (C45084c cVar : list) {
                SelectedData selectedData = new SelectedData();
                C45085e g = cVar.mo159512g();
                Intrinsics.checkExpressionValueIsNotNull(g, "selectBean.chatterInfo");
                selectedData.avatarKey = g.mo159526b();
                selectedData.dataType = SelectedData.DataType.CHATTER;
                C45085e g2 = cVar.mo159512g();
                Intrinsics.checkExpressionValueIsNotNull(g2, "selectBean.chatterInfo");
                selectedData.name = g2.mo159527c();
                selectedData.id = cVar.mo159513h();
                selectedData.isShowDescription = true;
                arrayList.add(selectedData);
            }
            if (DesktopUtil.m144301a(CalendarPickMemberFragment.this.getContext())) {
                IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
                Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
                a.getContactDependency().mo143740a(CalendarPickMemberFragment.this, arrayList, 8888);
                return;
            }
            IGroupMemberManageModuleDependency a2 = GroupMemberManageModule.m177902a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "GroupMemberManageModule.getDependency()");
            a2.getContactDependency().mo143738a(CalendarPickMemberFragment.this.getActivity(), arrayList, 8888);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bundle arguments;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && (arguments = getArguments()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
            Intrinsics.checkExpressionValueIsNotNull(arguments, "it");
            CalendarPickMemberPresenter fVar = new CalendarPickMemberPresenter(activity, arguments, new ViewDependency());
            this.f114180a = fVar;
            if (fVar != null) {
                fVar.create();
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_show_group_member, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 8888 && i2 == -1 && intent != null) {
            IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
            List<String> a2 = a.getContactDependency().mo143737a(intent);
            CalendarPickMemberPresenter fVar = this.f114180a;
            if (fVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(a2, "selectedIdList");
                fVar.mo159561a(a2);
            }
        }
    }
}
