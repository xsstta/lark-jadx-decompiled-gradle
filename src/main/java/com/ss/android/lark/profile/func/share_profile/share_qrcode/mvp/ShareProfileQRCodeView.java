package com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.BindView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.AbstractC52517a;

public class ShareProfileQRCodeView extends BaseQRCodeView<AbstractC52517a.AbstractC52520b.AbstractC52521a> implements AbstractC52517a.AbstractC52520b {

    /* renamed from: g */
    public AbstractC52517a.AbstractC52520b.AbstractC52521a f129982g;
    @BindView(7724)
    RelativeLayout mContactProfileQRCodeResetBtn;

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.ShareProfileQRCodeView$a */
    public static class C52515a {

        /* renamed from: a */
        public String f129984a;

        /* renamed from: b */
        public String f129985b;

        /* renamed from: c */
        public String f129986c;
    }

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.ShareProfileQRCodeView$b */
    public interface AbstractC52516b extends BaseQRCodeView.AbstractC52500a {
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f129982g = null;
    }

    /* renamed from: e */
    private void m203381e() {
        this.mContactProfileQRCodeResetBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.$$Lambda$ShareProfileQRCodeView$eVUSTnOBZDDD2oligbVHWJirk6w */

            public final void onClick(View view) {
                ShareProfileQRCodeView.this.m203380a((ShareProfileQRCodeView) view);
            }
        });
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m203381e();
        this.mContactProfileQRCodeResetBtn.setVisibility(0);
    }

    /* renamed from: f */
    private void m203382f() {
        new C25639g(this.f129966d).mo89248g(R.string.Lark_Legacy_PersoncardResetAlertTitle).mo89254m(R.string.Lark_Legacy_PersoncardResetAlert).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.ShareProfileQRCodeView.DialogInterface$OnClickListenerC525141 */

            public void onClick(DialogInterface dialogInterface, int i) {
                if (ShareProfileQRCodeView.this.f129982g != null) {
                    ShareProfileQRCodeView.this.f129982g.mo179531a();
                }
            }
        }).mo89238b(true).mo89239c();
    }

    public ShareProfileQRCodeView(AbstractC52516b bVar) {
        super(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m203380a(View view) {
        m203382f();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC52517a.AbstractC52520b.AbstractC52521a aVar) {
        super.setViewDelegate((AbstractC52510c.AbstractC52512b.AbstractC52513a) aVar);
        this.f129982g = aVar;
    }
}
