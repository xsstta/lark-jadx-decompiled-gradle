package com.ss.android.lark.chatsetting.impl.group.share;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chatsetting.C34456a;
import com.ss.android.lark.chatsetting.impl.group.DesktopShareTimeFinishEvent;
import com.ss.android.lark.chatsetting.impl.group.share.GroupShareLinkView;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;

public class GroupShareLinkFragment extends BaseFragment {

    /* renamed from: a */
    public View f90271a;

    /* renamed from: b */
    private C34996e f90272b;

    /* renamed from: c */
    private final GroupShareLinkView.AbstractC34981a f90273c = new GroupShareLinkView.AbstractC34981a() {
        /* class com.ss.android.lark.chatsetting.impl.group.share.GroupShareLinkFragment.C349751 */

        @Override // com.ss.android.lark.chatsetting.impl.group.share.GroupShareLinkView.AbstractC34981a
        /* renamed from: a */
        public void mo128941a(GroupShareLinkView groupShareLinkView) {
            ButterKnife.bind(groupShareLinkView, GroupShareLinkFragment.this.f90271a);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.share.GroupShareLinkView.AbstractC34981a
        /* renamed from: a */
        public void mo128942a(String str) {
            C34456a.m133678a(GroupShareLinkFragment.this.getActivity(), GroupShareLinkFragment.this, str, "link");
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C34996e eVar = this.f90272b;
        if (eVar != null) {
            eVar.destroy();
            this.f90272b = null;
        }
        if (DesktopUtil.m144301a(getContext())) {
            EventBus.getDefault().unregister(this);
        }
        super.onDestroy();
    }

    /* renamed from: a */
    public static GroupShareLinkFragment m136208a(Bundle bundle) {
        GroupShareLinkFragment groupShareLinkFragment = new GroupShareLinkFragment();
        groupShareLinkFragment.setArguments(bundle);
        return groupShareLinkFragment;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDesktopEditShareTime(DesktopShareTimeFinishEvent aVar) {
        onActivityResult(aVar.mo127682a(), aVar.mo127683b(), aVar.mo127684c());
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (DesktopUtil.m144301a(getContext())) {
            EventBus.getDefault().register(this);
        }
    }

    /* renamed from: b */
    private void m136209b(Bundle bundle) {
        boolean z = true;
        if (bundle == null || bundle.getInt("extra_key_contact_mode", 1) != 1) {
            z = false;
        }
        C34996e eVar = new C34996e(new C34994d(bundle), new GroupShareLinkView(this.mContext, this.f90273c, z));
        this.f90272b = eVar;
        eVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        C34996e eVar;
        super.setUserVisibleHint(z);
        if (z && (eVar = this.f90272b) != null) {
            eVar.mo128981b();
            this.f90272b.mo128980a(false);
        }
        Log.m165379d("GroupShareLinkFragment", "setUserVisibleHint:" + z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m136209b(getArguments());
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_group_link_layout, viewGroup, false);
        this.f90271a = inflate;
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 2020) {
                if (this.f90272b != null) {
                    this.f90272b.mo128979a(intent.getIntExtra("key_params_group_share_time", 0));
                }
            } else if (i == 10010) {
                GroupHitPoint.f90519a.mo129216a(false, "lark");
            }
        }
    }
}
