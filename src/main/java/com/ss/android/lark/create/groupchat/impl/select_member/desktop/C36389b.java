package com.ss.android.lark.create.groupchat.impl.select_member.desktop;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h;
import com.ss.android.lark.create.groupchat.impl.select_member.C36378d;
import com.ss.android.lark.create.groupchat.impl.select_member.CreateGroupView;

/* renamed from: com.ss.android.lark.create.groupchat.impl.select_member.desktop.b */
public class C36389b extends BaseFragment {

    /* renamed from: a */
    private C36378d f93877a;

    /* renamed from: b */
    private CreateGroupView.AbstractC36374a f93878b = new CreateGroupView.AbstractC36374a() {
        /* class com.ss.android.lark.create.groupchat.impl.select_member.desktop.C36389b.C363901 */

        @Override // com.ss.android.lark.create.groupchat.impl.select_member.CreateGroupView.AbstractC36374a
        /* renamed from: a */
        public FragmentManager mo134167a() {
            return C36389b.this.getChildFragmentManager();
        }

        @Override // com.ss.android.lark.create.groupchat.impl.select_member.CreateGroupView.AbstractC36374a
        /* renamed from: b */
        public void mo134169b() {
            CreateGroupChatModule.getDependency().getMainDependency().mo133741a(C36389b.this.mContext, "conversation", null);
        }

        @Override // com.ss.android.lark.create.groupchat.impl.select_member.CreateGroupView.AbstractC36374a
        /* renamed from: a */
        public void mo134168a(AbstractC36395h.AbstractC36397b bVar) {
            ButterKnife.bind(bVar, C36389b.this.getView());
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C36378d dVar = this.f93877a;
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

    /* renamed from: b */
    private GroupCreateInfo m143437b() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (GroupCreateInfo) arguments.getSerializable("key_group_create_info");
        }
        return null;
    }

    /* renamed from: a */
    private void m143436a() {
        GroupCreateInfo b = m143437b();
        if (b != null) {
            C36378d dVar = new C36378d(new CreateGroupDesktopView(getContext(), this.f93878b, b.isCreateTopicGroup()), b);
            this.f93877a = dVar;
            dVar.create();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m143436a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a
    public boolean onNewArguments(Bundle bundle) {
        setArguments(bundle);
        m143436a();
        return super.onNewArguments(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f93877a.mo134180a(i, i2, intent);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_create_group_desktop, viewGroup, false);
    }
}
