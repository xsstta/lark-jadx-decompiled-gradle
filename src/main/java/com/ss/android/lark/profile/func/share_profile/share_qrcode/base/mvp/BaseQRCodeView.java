package com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.dto.ProfileLoadParams;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b.AbstractC52513a;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.ShareProfileQRCodeView;
import com.ss.android.lark.ui.RotateLoadingView;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.UIHelper;

public abstract class BaseQRCodeView<D extends AbstractC52510c.AbstractC52512b.AbstractC52513a> implements AbstractC52510c.AbstractC52512b<D> {

    /* renamed from: a */
    protected static final int f129963a;

    /* renamed from: b */
    protected static final int f129964b;

    /* renamed from: c */
    public View f129965c;

    /* renamed from: d */
    public Context f129966d;

    /* renamed from: e */
    AbstractC52510c.AbstractC52512b.AbstractC52513a f129967e;

    /* renamed from: f */
    AbstractC52500a f129968f;

    /* renamed from: g */
    private IProfileModuleDependency.AbstractC52251f f129969g = C52239a.m202617d().mo133585o();
    @BindView(7717)
    LKUIRoundedImageView mContactAvatar;
    @BindView(7718)
    TextView mContactName;
    @BindView(7719)
    ImageView mContactProfileQRCodeIV;
    @BindView(7721)
    RotateLoadingView mContactProfileQRCodeLoading;
    @BindView(7725)
    TextView mSaveContactProfileQRCodeToAlbumBtn;

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView$a */
    public interface AbstractC52500a {
        /* renamed from: a */
        void mo179505a(BaseQRCodeView baseQRCodeView);

        /* renamed from: a */
        void mo179506a(String str);
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b
    /* renamed from: a */
    public void mo179489a() {
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b
    /* renamed from: a */
    public boolean mo179492a(ErrorResult errorResult) {
        return false;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    static {
        int dp2px = UIHelper.dp2px(48.0f);
        f129963a = dp2px;
        f129964b = dp2px;
    }

    /* renamed from: e */
    private void m203335e() {
        this.f129965c = LayoutInflater.from(this.f129966d).inflate(R.layout.profile_qrcode_screenshot, (ViewGroup) null);
        this.mSaveContactProfileQRCodeToAlbumBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.$$Lambda$BaseQRCodeView$nqhpOTaVODPw5R5JW5k8dFy6mQ */

            public final void onClick(View view) {
                BaseQRCodeView.this.m203332a((BaseQRCodeView) view);
            }
        });
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b
    /* renamed from: b */
    public void mo179511b() {
        LKUIToast.show(this.f129966d, (int) R.drawable.saving_pictures, (int) R.string.Lark_Legacy_SaveSuccess);
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b
    /* renamed from: c */
    public void mo179514c() {
        this.mContactProfileQRCodeLoading.setVisibility(0);
        this.mContactProfileQRCodeIV.setVisibility(8);
        m203333a(false);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f129968f.mo179505a(this);
        this.f129966d = this.mSaveContactProfileQRCodeToAlbumBtn.getContext();
        m203335e();
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b
    /* renamed from: d */
    public void mo179515d() {
        this.mContactProfileQRCodeLoading.setVisibility(8);
        this.mContactProfileQRCodeIV.setVisibility(0);
        m203333a(true);
    }

    /* renamed from: a */
    public void setViewDelegate(D d) {
        this.f129967e = d;
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b
    /* renamed from: b */
    public void mo179513b(String str) {
        this.f129968f.mo179506a(str);
    }

    public BaseQRCodeView(AbstractC52500a aVar) {
        this.f129968f = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m203332a(View view) {
        this.f129967e.mo179499a(C57820d.m224432a(this.f129965c));
    }

    /* renamed from: b */
    private void m203334b(Bitmap bitmap) {
        ((ImageView) this.f129965c.findViewById(R.id.qrcode_img)).setImageBitmap(bitmap);
    }

    /* renamed from: a */
    private void m203333a(boolean z) {
        Drawable drawable = this.mContactProfileQRCodeIV.getDrawable();
        if (!z || drawable == null) {
            this.mSaveContactProfileQRCodeToAlbumBtn.setEnabled(false);
        } else {
            this.mSaveContactProfileQRCodeToAlbumBtn.setEnabled(true);
        }
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b
    /* renamed from: a */
    public void mo179508a(Bitmap bitmap) {
        this.mContactProfileQRCodeIV.setImageBitmap(bitmap);
        m203334b(bitmap);
        m203333a(true);
    }

    /* renamed from: b */
    public void mo179512b(ShareProfileQRCodeView.C52515a aVar) {
        ImageView imageView = (ImageView) this.f129965c.findViewById(R.id.qrcode_contact_avatar);
        TextView textView = (TextView) this.f129965c.findViewById(R.id.qrcode_contact_name);
        if (aVar != null) {
            textView.setText(aVar.f129984a);
            this.f129969g.mo133596a(this.f129966d, imageView, aVar.f129986c, aVar.f129985b, new ProfileLoadParams().mo178894b(f129964b).mo178889a(f129963a));
        }
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b
    /* renamed from: a */
    public void mo179509a(ShareProfileQRCodeView.C52515a aVar) {
        this.mContactName.setText(aVar.f129984a);
        this.f129969g.mo133596a(this.f129966d, this.mContactAvatar, aVar.f129986c, aVar.f129985b, new ProfileLoadParams().mo178889a(f129963a).mo178894b(f129964b));
        mo179512b(aVar);
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b
    /* renamed from: a */
    public void mo179510a(String str) {
        LKUIToast.show(this.f129966d, str);
    }
}
