package com.ss.android.lark.member_manage.impl.pick_member;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.dto.SelectChatterDTO;
import com.ss.android.lark.member_manage.dto.SelectedData;
import com.ss.android.lark.member_manage.impl.base.mvp.C45081c;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45085e;
import com.ss.android.lark.member_manage.impl.pick_member.PickerWhiteListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016J\"\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/pick_member/PickWhiteListFragment;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/FloatWindowParams;", "()V", "mPresenter", "Lcom/ss/android/lark/member_manage/impl/pick_member/PickWhiteListPresenter;", "getMPresenter", "()Lcom/ss/android/lark/member_manage/impl/pick_member/PickWhiteListPresenter;", "setMPresenter", "(Lcom/ss/android/lark/member_manage/impl/pick_member/PickWhiteListPresenter;)V", "checkInitData", "", "bundle", "Landroid/os/Bundle;", "onActivityCreated", "", "savedInstanceState", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "ViewDependency", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.pick_member.c */
public final class PickWhiteListFragment extends C36516a<FloatWindowParams> {

    /* renamed from: a */
    private PickWhiteListPresenter f114304a;

    /* renamed from: b */
    private HashMap f114305b;

    /* renamed from: a */
    public void mo159665a() {
        HashMap hashMap = this.f114305b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo159665a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/pick_member/PickWhiteListFragment$ViewDependency;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseViewDependency;", "Lcom/ss/android/lark/member_manage/impl/pick_member/PickerWhiteListView$Dependency;", "(Lcom/ss/android/lark/member_manage/impl/pick_member/PickWhiteListFragment;)V", "closeForResult", "", "selectChatters", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/member_manage/dto/SelectChatterDTO;", "Lkotlin/collections/ArrayList;", "finishActivity", "injectView", "selectMemberView", "Lcom/ss/android/lark/member_manage/impl/base/mvp/IGroupMemberBaseContract$IBaseView;", "startSelected", "list", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.pick_member.c$a */
    public final class ViewDependency extends C45081c implements PickerWhiteListView.Dependency {
        @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
        /* renamed from: a */
        public void mo159423a() {
            PickWhiteListFragment.this.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDependency() {
            super(PickWhiteListFragment.this.getActivity());
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
        /* renamed from: a */
        public void mo159429a(IGroupMemberBaseContract.AbstractC45066b<?> bVar) {
            View view;
            if (bVar != null && (view = PickWhiteListFragment.this.getView()) != null) {
                ButterKnife.bind(bVar, view);
            }
        }

        @Override // com.ss.android.lark.member_manage.impl.pick_member.PickerWhiteListView.Dependency
        /* renamed from: a */
        public void mo159666a(ArrayList<SelectChatterDTO> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "selectChatters");
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("result_key_checked_chatters", arrayList);
            PickWhiteListFragment.this.setResult(-1, intent);
            PickWhiteListFragment.this.finish();
        }

        @Override // com.ss.android.lark.member_manage.impl.pick_member.PickerWhiteListView.Dependency
        /* renamed from: b */
        public void mo159667b(List<? extends C45084c> list) {
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
            IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
            a.getContactDependency().mo143740a(PickWhiteListFragment.this, arrayList, 5386);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        PickWhiteListPresenter fVar = this.f114304a;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    /* renamed from: a */
    private final boolean m179168a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return !TextUtils.isEmpty(bundle.getString("key_chat_id"));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        FragmentActivity activity = getActivity();
        if (activity == null || arguments == null || !m179168a(arguments)) {
            finish();
            return;
        }
        PickWhiteListPresenter fVar = new PickWhiteListPresenter(activity, arguments, new ViewDependency());
        fVar.create();
        this.f114304a = fVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_show_group_member, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        PickWhiteListPresenter fVar;
        super.onActivityResult(i, i2, intent);
        if (i == 5386 && i2 == -1 && intent != null && (fVar = this.f114304a) != null) {
            IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
            List<String> a2 = a.getContactDependency().mo143737a(intent);
            Intrinsics.checkExpressionValueIsNotNull(a2, "selectedIdList");
            fVar.mo159671a(a2);
        }
    }
}
