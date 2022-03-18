package com.ss.android.lark.member_manage.impl.add_member;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView;
import com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.add_member.a */
public class C44931a extends C36516a<FloatWindowParams> {

    /* renamed from: a */
    C44951d f113764a;

    /* renamed from: b */
    AddGroupMemberView.AbstractC44927a f113765b = new AddGroupMemberView.AbstractC44927a() {
        /* class com.ss.android.lark.member_manage.impl.add_member.C44931a.C449321 */

        @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.AbstractC44927a
        /* renamed from: b */
        public FragmentManager mo158993b() {
            return C44931a.this.getChildFragmentManager();
        }

        @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.AbstractC44927a
        /* renamed from: c */
        public void mo158994c() {
            KeyboardUtils.hideKeyboard(C44931a.this.getContext());
        }

        @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.AbstractC44927a
        /* renamed from: a */
        public void mo158988a() {
            C44931a.this.finish();
            Fragment parentFragment = C44931a.this.getParentFragment();
            if (parentFragment instanceof C36516a) {
                ((C36516a) parentFragment).finish();
            }
        }

        @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.AbstractC44927a
        /* renamed from: a */
        public void mo158991a(IAddGroupMemberContract.IView iView) {
            ButterKnife.bind(iView, C44931a.this.getView());
        }

        @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.AbstractC44927a
        /* renamed from: a */
        public void mo158992a(List<SearchBaseInfo> list) {
            GroupMemberManageModule.m177902a().getContactDependency().mo143740a(C44931a.this, C44959f.m178301a(list), HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        }

        @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.AbstractC44927a
        /* renamed from: a */
        public void mo158989a(int i, Intent intent) {
            C44931a.this.setResult(i, intent);
        }

        @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.AbstractC44927a
        /* renamed from: a */
        public void mo158990a(Intent intent, int i) {
            C44931a.this.setResult(i, intent);
            mo158988a();
        }
    };

    /* renamed from: a */
    public void mo159038a() {
        this.f113764a.mo159074f();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C44951d dVar = this.f113764a;
        if (dVar != null) {
            dVar.destroy();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        KeyboardUtils.hideKeyboard(getContext());
        super.onPause();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.f113764a.mo159069a(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C44951d dVar = new C44951d(getActivity(), getArguments(), bundle, this.f113765b);
        this.f113764a = dVar;
        dVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            this.f113764a.mo159068a(intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.group_member_manage_activity_select_contacts, viewGroup, false);
    }
}
