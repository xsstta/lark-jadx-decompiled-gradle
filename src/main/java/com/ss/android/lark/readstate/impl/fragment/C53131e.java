package com.ss.android.lark.readstate.impl.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.readstate.impl.detail.C53123f;
import com.ss.android.lark.readstate.impl.fragment.ReadStateFragmentView;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.lark.readstate.impl.fragment.e */
public class C53131e extends BaseFragment {

    /* renamed from: a */
    C53134g f131399a;

    /* renamed from: b */
    View f131400b;

    /* renamed from: c */
    ReadStateFragmentView.AbstractC53126a f131401c = new ReadStateFragmentView.AbstractC53126a() {
        /* class com.ss.android.lark.readstate.impl.fragment.C53131e.C531321 */

        @Override // com.ss.android.lark.readstate.impl.fragment.ReadStateFragmentView.AbstractC53126a
        /* renamed from: a */
        public void mo181453a(ReadStateFragmentView readStateFragmentView) {
            ButterKnife.bind(readStateFragmentView, C53131e.this.f131400b);
        }
    };

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C53134g gVar = this.f131399a;
        if (gVar != null) {
            gVar.destroy();
        }
        super.onDestroyView();
    }

    /* renamed from: a */
    public void mo181465a(List<C53123f> list) {
        C53134g gVar = this.f131399a;
        if (gVar != null) {
            gVar.mo181468a(list);
        }
    }

    /* renamed from: a */
    public void mo181466a(List<C53123f> list, String str) {
        C53134g gVar = this.f131399a;
        if (gVar != null) {
            gVar.mo181469a(list, str);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f131400b = layoutInflater.inflate(R.layout.fragment_read_state_detail, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("read_type") || !arguments.containsKey("msg_type")) {
            getActivity().finish();
            return this.f131400b;
        }
        C53134g gVar = new C53134g(new C53133f(arguments), new ReadStateFragmentView(getActivity(), this.f131401c, arguments.getString("chat_id")));
        this.f131399a = gVar;
        gVar.create();
        this.f131399a.mo181470b();
        return this.f131400b;
    }

    /* renamed from: a */
    public static C53131e m205666a(int i, HashSet<Integer> hashSet, String str, int i2, String str2, boolean z) {
        C53131e eVar = new C53131e();
        Bundle bundle = new Bundle();
        bundle.putInt("read_type", i);
        bundle.putSerializable("show_search_type", hashSet);
        bundle.putBoolean("is_urgent", z);
        bundle.putInt("msg_type", i2);
        bundle.putString("message_id", str);
        bundle.putString("chat_id", str2);
        eVar.setArguments(bundle);
        return eVar;
    }
}
