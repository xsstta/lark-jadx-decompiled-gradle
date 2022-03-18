package com.ss.android.lark.invite_new_tenant.invite.all.qrcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.invite_new_tenant.C40531a;
import com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40564a;
import com.ss.android.lark.invite_new_tenant.p2064b.C40534a;
import com.ss.android.lark.invite_new_tenant.statistics.StatisticsManager;
import com.ss.android.lark.ui.RotateLoadingView;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class InviteAllByQrView implements C40564a.AbstractC40566b {

    /* renamed from: a */
    public C40564a.AbstractC40566b.AbstractC40567a f102977a;

    /* renamed from: b */
    public Context f102978b;

    /* renamed from: c */
    private AbstractC40563a f102979c;
    @BindView(4729)
    ImageView mAvatarIv;
    @BindView(4732)
    View mInviteRootView;
    @BindView(4733)
    RotateLoadingView mLoadingView;
    @BindView(4730)
    TextView mNameTv;
    @BindView(4731)
    ImageView mQrIv;
    @BindView(4735)
    Button mSaveImgBtn;

    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.qrcode.InviteAllByQrView$a */
    public interface AbstractC40563a {
        /* renamed from: a */
        void mo146686a(InviteAllByQrView inviteAllByQrView);

        /* renamed from: a */
        void mo146687a(String str);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40564a.AbstractC40566b
    /* renamed from: a */
    public void mo146678a() {
        LKUIToast.show(this.f102978b, (int) R.drawable.saving_pictures, (int) R.string.Lark_Legacy_SaveSuccess);
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40564a.AbstractC40566b
    /* renamed from: b */
    public void mo146683b() {
        this.mLoadingView.setVisibility(0);
        this.mQrIv.setVisibility(8);
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40564a.AbstractC40566b
    /* renamed from: c */
    public void mo146685c() {
        this.mLoadingView.setVisibility(8);
        this.mQrIv.setVisibility(0);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f102979c.mo146686a(this);
        this.mSaveImgBtn.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.qrcode.InviteAllByQrView.C405621 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                View inflate = LayoutInflater.from(InviteAllByQrView.this.f102978b).inflate(R.layout.item_qr_screenshot, (ViewGroup) null);
                ((ImageView) inflate.findViewById(R.id.qrcode_contact_avatar)).setImageDrawable(InviteAllByQrView.this.mAvatarIv.getDrawable());
                ((TextView) inflate.findViewById(R.id.qrcode_contact_name)).setText(InviteAllByQrView.this.mNameTv.getText());
                ((ImageView) inflate.findViewById(R.id.qrcode_img)).setImageDrawable(InviteAllByQrView.this.mQrIv.getDrawable());
                InviteAllByQrView.this.f102977a.mo146691a(C57820d.m224432a(inflate));
                StatisticsManager.m160654a("invite_tenant_via_qrcode_save");
            }
        });
        this.mSaveImgBtn.setEnabled(false);
    }

    /* renamed from: a */
    public void setViewDelegate(C40564a.AbstractC40566b.AbstractC40567a aVar) {
        this.f102977a = aVar;
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40564a.AbstractC40566b
    /* renamed from: a */
    public void mo146682a(String str) {
        LKUIToast.show(this.f102978b, str);
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40564a.AbstractC40566b
    /* renamed from: b */
    public void mo146684b(String str) {
        this.f102979c.mo146687a(str);
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40564a.AbstractC40566b
    /* renamed from: a */
    public void mo146679a(Bitmap bitmap) {
        this.mQrIv.setImageBitmap(bitmap);
        this.mSaveImgBtn.setEnabled(true);
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40564a.AbstractC40566b
    /* renamed from: a */
    public void mo146680a(C40534a aVar) {
        this.mNameTv.setText(aVar.mo146644c());
        C40531a.m160431a().mo143862e().mo143864a(this.f102978b, aVar.mo146643b(), aVar.mo146642a(), this.mAvatarIv, UIHelper.dp2px(48.0f), UIHelper.dp2px(48.0f));
    }

    public InviteAllByQrView(Context context, AbstractC40563a aVar) {
        this.f102978b = context;
        this.f102979c = aVar;
    }
}
