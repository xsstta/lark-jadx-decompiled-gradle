package com.ss.android.lark.create.groupchat.impl.type;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.type.C36410c;
import com.ss.android.lark.desktopmode.p1787a.C36516a;

/* renamed from: com.ss.android.lark.create.groupchat.impl.type.a */
public class C36400a extends BaseFragment {

    /* renamed from: a */
    private GroupCreateInfo f93894a;

    /* renamed from: b */
    private C36409b f93895b;

    /* renamed from: c */
    private C36410c.AbstractC36412a f93896c = new C36410c.AbstractC36412a() {
        /* class com.ss.android.lark.create.groupchat.impl.type.C36400a.C364011 */

        @Override // com.ss.android.lark.create.groupchat.impl.type.C36410c.AbstractC36412a
        /* renamed from: a */
        public FragmentManager mo134233a() {
            return C36400a.this.getChildFragmentManager();
        }

        @Override // com.ss.android.lark.create.groupchat.impl.type.C36410c.AbstractC36412a
        /* renamed from: a */
        public void mo134235a(C36410c cVar) {
            ButterKnife.bind(cVar, C36400a.this.getView());
        }

        @Override // com.ss.android.lark.create.groupchat.impl.type.C36410c.AbstractC36412a
        /* renamed from: a */
        public void mo134234a(GroupCreateInfo groupCreateInfo) {
            Intent intent = new Intent();
            intent.putExtra("key_group_create_info", groupCreateInfo);
            C36400a.this.setResult(-1, intent);
            C36400a.this.finish();
        }
    };

    /* renamed from: a */
    public boolean mo134232a() {
        C36409b bVar = this.f93895b;
        if (bVar != null) {
            return bVar.mo134263b();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C36409b bVar = this.f93895b;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    /* renamed from: b */
    private void m143502b() {
        C36409b bVar = new C36409b(getContext(), this.f93896c, this.f93894a);
        this.f93895b = bVar;
        bVar.create();
    }

    /* renamed from: c */
    private boolean m143503c() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        GroupCreateInfo groupCreateInfo = (GroupCreateInfo) arguments.getSerializable("key_group_create_info");
        this.f93894a = groupCreateInfo;
        if (groupCreateInfo != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!m143503c()) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof C36516a) {
                ((C36516a) parentFragment).finish();
            } else {
                getActivity().finish();
            }
        } else {
            m143502b();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_select_group_type, viewGroup, false);
    }
}
