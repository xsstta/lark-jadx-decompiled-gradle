package com.ss.android.lark.create.groupchat.impl.p2p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.impl.p1779b.C36276b;
import com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b;
import com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.create.groupchat.impl.p2p.c */
public class C36353c extends BaseFragment {

    /* renamed from: a */
    public View f93806a;

    /* renamed from: b */
    C36356e f93807b;

    /* renamed from: c */
    AbstractC36248c.AbstractC36254f f93808c = CreateGroupChatModule.getDependency().getContactDependency();

    /* renamed from: d */
    GroupChatStructureBaseView.AbstractC36362a f93809d = new GroupChatStructureBaseView.AbstractC36362a() {
        /* class com.ss.android.lark.create.groupchat.impl.p2p.C36353c.C363541 */

        @Override // com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView.AbstractC36362a
        /* renamed from: a */
        public void mo134130a() {
            C36353c.this.finish();
        }

        @Override // com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView.AbstractC36362a
        /* renamed from: b */
        public FragmentManager mo134135b() {
            return C36353c.this.getChildFragmentManager();
        }

        @Override // com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView.AbstractC36362a
        /* renamed from: c */
        public void mo134136c() {
            KeyboardUtils.hideKeyboard(mo134137d());
        }

        @Override // com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView.AbstractC36362a
        /* renamed from: d */
        public Context mo134137d() {
            return C36353c.this.getContext();
        }

        @Override // com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView.AbstractC36362a
        /* renamed from: a */
        public void mo134131a(Intent intent) {
            C36353c.this.setResult(-1, intent);
            C36353c.this.finish();
        }

        @Override // com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView.AbstractC36362a
        /* renamed from: a */
        public void mo134132a(AbstractC36349b.AbstractC36351b bVar) {
            ButterKnife.bind(bVar, C36353c.this.f93806a);
        }

        @Override // com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView.AbstractC36362a
        /* renamed from: a */
        public void mo134133a(String str) {
            CreateGroupChatModule.getDependency().getChatDependency().mo133734b(mo134137d(), str);
        }

        @Override // com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView.AbstractC36362a
        /* renamed from: a */
        public void mo134134a(List<SearchBaseInfo> list) {
            C36353c.this.f93808c.mo133738a(C36353c.this.getActivity(), C36276b.m142827a(list), HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        }
    };

    /* renamed from: a */
    public void mo134129a() {
        C36356e eVar = this.f93807b;
        if (eVar != null) {
            eVar.mo134144g();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C36356e eVar = this.f93807b;
        if (eVar != null) {
            eVar.destroy();
            this.f93807b = null;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        KeyboardUtils.hideKeyboard(getContext());
        super.onPause();
    }

    /* renamed from: b */
    private void m143274b() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        Intent intent = new Intent();
        intent.putExtras(arguments);
        C36356e eVar = new C36356e(getActivity(), intent, this.f93809d);
        this.f93807b = eVar;
        eVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C36356e eVar = this.f93807b;
        if (eVar != null) {
            eVar.mo134139a(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m143274b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.create_group_activity_select_contacts, viewGroup, false);
        this.f93806a = inflate;
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        C36356e eVar;
        super.onActivityResult(i, i2, intent);
        if (i == 10000 && i2 == -1 && (eVar = this.f93807b) != null) {
            eVar.mo134138a(intent);
        }
    }
}
