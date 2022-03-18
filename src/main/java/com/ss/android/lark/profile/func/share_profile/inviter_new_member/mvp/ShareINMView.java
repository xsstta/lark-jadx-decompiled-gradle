package com.ss.android.lark.profile.func.share_profile.inviter_new_member.mvp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import butterknife.BindView;
import com.larksuite.framework.mvp.IView;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.share_profile.inviter_new_member.mvp.AbstractC52478a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;

public class ShareINMView implements AbstractC52478a.AbstractC52480b {

    /* renamed from: a */
    private FragmentManager f129943a;

    /* renamed from: b */
    private AbstractC52477a f129944b;

    /* renamed from: c */
    private Fragment f129945c;
    @BindView(7716)
    CommonTitleBar mShareInviterNewMemberTitleBar;

    /* renamed from: com.ss.android.lark.profile.func.share_profile.inviter_new_member.mvp.ShareINMView$a */
    public interface AbstractC52477a {
        void injectView(ShareINMView shareINMView);
    }

    @Override // com.larksuite.framework.mvp.IView
    public void setViewDelegate(IView.IViewDelegate iViewDelegate) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f129945c = null;
        this.f129944b = null;
        this.f129943a = null;
    }

    /* renamed from: b */
    private void m203313b() {
        this.mShareInviterNewMemberTitleBar.setTitle(UIHelper.getString(R.string.Lark_UserGrowth_InviteMemberQRCodeTitle));
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f129944b.injectView(this);
        m203312a();
    }

    /* renamed from: a */
    private void m203312a() {
        m203313b();
        this.f129943a.beginTransaction().replace(R.id.share_inviter_new_member_fragment, this.f129945c).commit();
    }

    public ShareINMView(FragmentManager fragmentManager, AbstractC52477a aVar, Fragment fragment) {
        this.f129943a = fragmentManager;
        this.f129944b = aVar;
        this.f129945c = fragment;
    }
}
