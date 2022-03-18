package com.ss.android.lark.member_manage.impl.share_contact_card;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView;
import com.ss.android.lark.member_manage.impl.add_member.C44959f;
import com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract;
import com.ss.android.lark.member_manage.impl.statistics.SelectContactHitPoint;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.share_contact_card.a */
public class C45179a extends C36516a<FloatWindowParams> {

    /* renamed from: a */
    public View f114368a;

    /* renamed from: b */
    private Activity f114369b;

    /* renamed from: c */
    private C45183d f114370c;

    /* renamed from: d */
    private final AddGroupMemberView.AbstractC44927a f114371d = new AddGroupMemberView.AbstractC44927a() {
        /* class com.ss.android.lark.member_manage.impl.share_contact_card.C45179a.C451801 */

        @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.AbstractC44927a
        /* renamed from: b */
        public FragmentManager mo158993b() {
            return C45179a.this.getChildFragmentManager();
        }

        @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.AbstractC44927a
        /* renamed from: a */
        public void mo158988a() {
            SelectContactHitPoint.m179753a();
            C45179a.this.finish();
        }

        @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.AbstractC44927a
        /* renamed from: c */
        public void mo158994c() {
            KeyboardUtils.hideKeyboard(C45179a.this.getContext());
        }

        @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.AbstractC44927a
        /* renamed from: a */
        public void mo158991a(IAddGroupMemberContract.IView iView) {
            ButterKnife.bind(iView, C45179a.this.f114368a);
        }

        @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.AbstractC44927a
        /* renamed from: a */
        public void mo158992a(List<SearchBaseInfo> list) {
            GroupMemberManageModule.m177902a().getContactDependency().mo143740a(C45179a.this, C44959f.m178301a(list), 2184);
        }

        @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.AbstractC44927a
        /* renamed from: a */
        public void mo158989a(int i, Intent intent) {
            C45179a.this.setResult(i, intent);
        }

        @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.AbstractC44927a
        /* renamed from: a */
        public void mo158990a(Intent intent, int i) {
            C45179a.this.setResult(i, intent);
            mo158988a();
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C45183d dVar = this.f114370c;
        if (dVar != null) {
            dVar.destroy();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        KeyboardUtils.hideKeyboard(getContext());
    }

    /* renamed from: a */
    public static C45179a m179292a(Bundle bundle) {
        C45179a aVar = new C45179a();
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C45183d dVar = this.f114370c;
        if (dVar != null) {
            dVar.mo159069a(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m179293a(getArguments(), bundle);
    }

    /* renamed from: a */
    private void m179293a(Bundle bundle, Bundle bundle2) {
        C45183d dVar = new C45183d(this.f114369b, bundle, bundle2, this.f114371d);
        this.f114370c = dVar;
        dVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f114368a = layoutInflater.inflate(R.layout.group_member_manage_activity_select_contacts, viewGroup, false);
        this.f114369b = getActivity();
        return this.f114368a;
    }
}
