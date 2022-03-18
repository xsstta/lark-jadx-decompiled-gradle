package com.ss.android.lark.create.groupchat.impl.select_member;

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
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h;
import com.ss.android.lark.create.groupchat.impl.select_member.CreateGroupView;
import com.ss.android.lark.create.groupchat.impl.util.FragmentStateHelper;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

/* renamed from: com.ss.android.lark.create.groupchat.impl.select_member.f */
public class C36392f extends BaseFragment {

    /* renamed from: a */
    private C36378d f93882a;

    /* renamed from: b */
    private FragmentStateHelper f93883b;

    /* renamed from: c */
    private final CreateGroupView.AbstractC36374a f93884c = new CreateGroupView.AbstractC36374a() {
        /* class com.ss.android.lark.create.groupchat.impl.select_member.C36392f.C363931 */

        @Override // com.ss.android.lark.create.groupchat.impl.select_member.CreateGroupView.AbstractC36374a
        /* renamed from: a */
        public FragmentManager mo134167a() {
            return C36392f.this.getChildFragmentManager();
        }

        @Override // com.ss.android.lark.create.groupchat.impl.select_member.CreateGroupView.AbstractC36374a
        /* renamed from: b */
        public void mo134169b() {
            C36392f.this.finish();
        }

        @Override // com.ss.android.lark.create.groupchat.impl.select_member.CreateGroupView.AbstractC36374a
        /* renamed from: a */
        public void mo134168a(AbstractC36395h.AbstractC36397b bVar) {
            ButterKnife.bind(bVar, C36392f.this.getView());
        }
    };

    /* renamed from: a */
    public void mo134192a() {
        this.f93882a.mo134179a();
    }

    /* renamed from: b */
    public void mo134194b() {
        this.f93882a.mo134182c();
    }

    /* renamed from: e */
    private String m143443e() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString(ShareHitPoint.f121868c, "");
        }
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C36378d dVar = this.f93882a;
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

    /* renamed from: d */
    private GroupCreateInfo m143442d() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (GroupCreateInfo) arguments.getSerializable("key_group_create_info");
        }
        return null;
    }

    /* renamed from: c */
    private void m143441c() {
        GroupCreateInfo d = m143442d();
        if (d == null) {
            finish();
            return;
        }
        CreateGroupView createGroupView = new CreateGroupView(getContext(), this.f93884c, d.isCreateTopicGroup());
        createGroupView.mo134161a(m143443e());
        FragmentStateHelper cVar = this.f93883b;
        if (cVar != null) {
            cVar.mo133835a(getChildFragmentManager());
            createGroupView.mo134159a(this.f93883b);
        }
        C36378d dVar = new C36378d(createGroupView, d);
        this.f93882a = dVar;
        dVar.create();
    }

    /* renamed from: a */
    public void mo134193a(FragmentStateHelper cVar) {
        this.f93883b = cVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m143441c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f93882a.mo134180a(i, i2, intent);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_create_group, viewGroup, false);
    }
}
