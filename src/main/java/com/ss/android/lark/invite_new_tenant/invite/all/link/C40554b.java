package com.ss.android.lark.invite_new_tenant.invite.all.link;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.invite_new_tenant.invite.AbstractC40542a;
import com.ss.android.lark.invite_new_tenant.invite.all.link.InviteAllByLinkView;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.link.b */
public class C40554b extends AbstractC40542a {

    /* renamed from: b */
    private InviteAllByLinkView.AbstractC40549a f102970b = new InviteAllByLinkView.AbstractC40549a() {
        /* class com.ss.android.lark.invite_new_tenant.invite.all.link.C40554b.C405551 */

        @Override // com.ss.android.lark.invite_new_tenant.invite.all.link.InviteAllByLinkView.AbstractC40549a
        /* renamed from: a */
        public void mo146670a(InviteAllByLinkView inviteAllByLinkView) {
            ButterKnife.bind(inviteAllByLinkView, C40554b.this.getView());
        }

        @Override // com.ss.android.lark.invite_new_tenant.invite.all.link.InviteAllByLinkView.AbstractC40549a
        /* renamed from: a */
        public void mo146671a(String str) {
            if (!C40554b.this.isActive()) {
                Log.m165382e("Copy failed: the fragment is un active");
                return;
            }
            FragmentActivity activity = C40554b.this.getActivity();
            if (activity == null) {
                Log.m165382e("Copy failed: the context is null");
                return;
            }
            ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setText(str);
            } else {
                Log.m165382e("Copy failed: the ClipboardManager is null");
            }
        }
    };

    @Override // com.ss.android.lark.invite_new_tenant.invite.AbstractC40542a
    /* renamed from: a */
    public BasePresenter mo146657a() {
        return new C40557d(new C40556c(), new InviteAllByLinkView(getActivity(), this.f102970b));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_invite_all_by_link, viewGroup, false);
    }
}
