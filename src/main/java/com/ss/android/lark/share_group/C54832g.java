package com.ss.android.lark.share_group;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.share_group.ShareGroupProfileView;

/* renamed from: com.ss.android.lark.share_group.g */
public class C54832g extends BaseFragment {

    /* renamed from: a */
    C54840j f135382a;

    /* renamed from: b */
    public View f135383b;

    /* renamed from: c */
    ShareGroupProfileView.AbstractC54802a f135384c = new ShareGroupProfileView.AbstractC54802a() {
        /* class com.ss.android.lark.share_group.C54832g.C548331 */

        @Override // com.ss.android.lark.share_group.ShareGroupProfileView.AbstractC54802a
        /* renamed from: a */
        public void mo187013a() {
            C54832g.this.finish();
        }

        @Override // com.ss.android.lark.share_group.ShareGroupProfileView.AbstractC54802a
        /* renamed from: a */
        public void mo187015a(ShareGroupProfileView shareGroupProfileView) {
            ButterKnife.bind(shareGroupProfileView, C54832g.this.f135383b);
        }

        @Override // com.ss.android.lark.share_group.ShareGroupProfileView.AbstractC54802a
        /* renamed from: a */
        public void mo187014a(Chatter chatter, Chat chat) {
            C29990c.m110930b().mo134538a(C54832g.this.getContext(), chatter, chat.getId(), chat.getName());
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f135382a.destroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            finish();
            return;
        }
        C54840j jVar = new C54840j(getActivity(), this.f135384c);
        this.f135382a = jVar;
        jVar.create();
        this.f135382a.mo187069a(arguments);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_share_group_profile, viewGroup, false);
        this.f135383b = inflate;
        return inflate;
    }
}
