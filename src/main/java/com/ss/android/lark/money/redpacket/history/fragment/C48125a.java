package com.ss.android.lark.money.redpacket.history.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.money.redpacket.history.fragment.mvp.C48152d;
import com.ss.android.lark.money.redpacket.history.fragment.mvp.RedPacketHistoryFragmentView;

/* renamed from: com.ss.android.lark.money.redpacket.history.fragment.a */
public class C48125a extends BaseFragment {

    /* renamed from: a */
    public View f121128a;

    /* renamed from: b */
    private C48152d f121129b;

    /* renamed from: c */
    private RedPacketHistoryFragmentView.AbstractC48143a f121130c = new RedPacketHistoryFragmentView.AbstractC48143a() {
        /* class com.ss.android.lark.money.redpacket.history.fragment.C48125a.C481261 */

        @Override // com.ss.android.lark.money.redpacket.history.fragment.mvp.RedPacketHistoryFragmentView.AbstractC48143a
        /* renamed from: a */
        public void mo168513a(RedPacketHistoryFragmentView redPacketHistoryFragmentView) {
            ButterKnife.bind(redPacketHistoryFragmentView, C48125a.this.f121128a);
        }
    };

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C48152d dVar = this.f121129b;
        if (dVar != null) {
            dVar.destroy();
        }
        super.onDestroyView();
    }

    /* renamed from: a */
    private void m190000a() {
        if (getArguments() != null) {
            C48152d dVar = new C48152d(getActivity(), getArguments().getInt(ShareHitPoint.f121869d, 0), this.f121130c);
            this.f121129b = dVar;
            dVar.create();
        }
    }

    /* renamed from: a */
    public static Fragment m189999a(int i) {
        C48125a aVar = new C48125a();
        Bundle bundle = new Bundle();
        bundle.putInt(ShareHitPoint.f121869d, i);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m190000a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_red_packet_history, viewGroup, false);
        this.f121128a = inflate;
        return inflate;
    }
}
