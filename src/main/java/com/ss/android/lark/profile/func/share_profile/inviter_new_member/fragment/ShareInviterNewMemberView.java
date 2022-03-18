package com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment.AbstractC52464a;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView;
import com.ss.android.lark.ui.RotateLoadingView;
import com.ss.android.lark.utils.UIHelper;

public class ShareInviterNewMemberView extends BaseQRCodeView<AbstractC52464a.AbstractC52466b.AbstractC52467a> implements AbstractC52464a.AbstractC52466b {
    ImageView errorIcon;
    TextView errorMsg;
    RotateLoadingView fragmentLoading;
    View fragmentQrCodeError;

    /* renamed from: g */
    private AbstractC52464a.AbstractC52466b.AbstractC52467a f129932g;
    TextView mInviterNewMemberTips;
    RelativeLayout qrCodeLayout;

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b, com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView
    /* renamed from: a */
    public void mo179489a() {
        super.mo179489a();
        m203299e();
    }

    /* renamed from: e */
    private void m203299e() {
        this.fragmentQrCodeError.setVisibility(8);
        this.qrCodeLayout.setVisibility(0);
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m203297a(true);
        this.mInviterNewMemberTips.setVisibility(0);
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_UserGrowth_InviteMemberQRCodeDesc, "TENANT_NAME", C52239a.m202617d().mo133587q().mo133625d());
        this.mInviterNewMemberTips.setText(mustacheFormat);
        TextView textView = (TextView) this.f129965c.findViewById(R.id.qrcode_tips);
        textView.setVisibility(0);
        textView.setText(mustacheFormat);
    }

    public ShareInviterNewMemberView(BaseQRCodeView.AbstractC52500a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: public */
    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView
    /* renamed from: a */
    private /* synthetic */ void m203296a(View view) {
        m203297a(true);
        this.f129932g.mo179493a();
    }

    /* renamed from: c */
    private void m203298c(String str) {
        m203297a(false);
        this.errorMsg.setText(str);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC52464a.AbstractC52466b.AbstractC52467a aVar) {
        super.setViewDelegate((AbstractC52510c.AbstractC52512b.AbstractC52513a) aVar);
        this.f129932g = aVar;
    }

    /* renamed from: a */
    private void m203297a(boolean z) {
        int i;
        int i2;
        int i3 = 8;
        this.qrCodeLayout.setVisibility(8);
        this.fragmentQrCodeError.setVisibility(0);
        RotateLoadingView rotateLoadingView = this.fragmentLoading;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        rotateLoadingView.setVisibility(i);
        TextView textView = this.errorMsg;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        ImageView imageView = this.errorIcon;
        if (!z) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b, com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView
    /* renamed from: a */
    public boolean mo179492a(ErrorResult errorResult) {
        String str;
        if (errorResult.getErrorCode() == -1) {
            str = UIHelper.getString(R.string.Lark_UserGrowth_InviteMemberPermissionDeny);
        } else {
            str = errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_LoadFailedRetryTip));
        }
        m203298c(str);
        if (-1 == errorResult.getErrorCode() || this.f129932g == null) {
            this.fragmentQrCodeError.setOnClickListener(null);
            return true;
        }
        this.fragmentQrCodeError.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment.$$Lambda$ShareInviterNewMemberView$fdL8XMJCbapkgcUWfzH7UQqOz8 */

            public final void onClick(View view) {
                ShareInviterNewMemberView.m270911lambda$fdL8XMJCbapkgcUWfzH7UQqOz8(ShareInviterNewMemberView.this, view);
            }
        });
        return true;
    }
}
