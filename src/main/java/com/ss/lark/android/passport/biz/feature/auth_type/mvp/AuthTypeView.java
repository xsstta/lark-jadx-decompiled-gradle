package com.ss.lark.android.passport.biz.feature.auth_type.mvp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.load.resource.bitmap.C2452w;
import com.bumptech.glide.request.AbstractC2510a;
import com.bumptech.glide.request.C2537g;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.util.ak;
import com.ss.android.lark.passport.signinsdk_api.contants.ButtonType;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import com.ss.android.lark.utils.UIHelper;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.entity.AuthTypeStepInfo;
import com.ss.lark.android.passport.biz.feature.auth_type.DisplayTypeEnum;
import com.ss.lark.android.passport.biz.feature.auth_type.mvp.C64634c;

public class AuthTypeView extends AbstractC49023c<C64634c.AbstractC64636b.AbstractC64637a> implements C64634c.AbstractC64636b {

    /* renamed from: c */
    public C64634c.AbstractC64636b.AbstractC64637a f163099c;

    /* renamed from: d */
    private final Activity f163100d;

    /* renamed from: e */
    private final AbstractC64628a f163101e;

    /* renamed from: f */
    private CommonUiContainer f163102f;
    @BindView(6694)
    LinearLayout mVerifyTypeLayout;

    /* renamed from: com.ss.lark.android.passport.biz.feature.auth_type.mvp.AuthTypeView$a */
    public interface AbstractC64628a {
        /* renamed from: a */
        void mo223429a(AuthTypeView authTypeView);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163099c = null;
    }

    /* renamed from: d */
    public void mo223435d() {
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f163101e.mo223429a(this);
        mo223435d();
    }

    @Override // com.ss.lark.android.passport.biz.feature.auth_type.mvp.C64634c.AbstractC64636b
    /* renamed from: e */
    public void mo223436e() {
        Activity activity = this.f163100d;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.auth_type.mvp.C64634c.AbstractC64636b
    /* renamed from: f */
    public void mo223437f() {
        Activity activity = this.f163100d;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    /* renamed from: a */
    public void mo171188a(C64634c.AbstractC64636b.AbstractC64637a aVar) {
        this.f163099c = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.feature.auth_type.mvp.C64634c.AbstractC64636b
    /* renamed from: a */
    public void mo223433a(AuthTypeStepInfo authTypeStepInfo) {
        if (authTypeStepInfo == null || authTypeStepInfo.authTypeList == null) {
            this.f123085b.mo171471d("AuthTypeView", "choose verify StepInfo == null");
            return;
        }
        this.f163102f.mo222883d().mo171755a(true, true);
        this.f163102f.mo222871a((CharSequence) authTypeStepInfo.title);
        this.f163102f.mo222879b(authTypeStepInfo.subTitle);
        this.mVerifyTypeLayout.removeAllViews();
        for (ButtonInfo buttonInfo : authTypeStepInfo.authTypeList) {
            this.mVerifyTypeLayout.addView(m253924a(buttonInfo, authTypeStepInfo.targetTenantIcon));
        }
        for (int i = 0; i < this.mVerifyTypeLayout.getChildCount(); i++) {
            View childAt = this.mVerifyTypeLayout.getChildAt(i);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            Activity activity = this.f163100d;
            layoutParams.bottomMargin = UIUtils.dp2px(activity, activity.getResources().getDimension(R.dimen.signin_sdk_dp_7));
            childAt.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private void m253925a(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            imageView.setImageResource(DisplayTypeEnum.IDP.getIconRes());
        } else {
            ((C2124f) ((C2124f) ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9139a(this.f163100d).mo10415a(str).mo11144c(UIHelper.dp2px(30.0f), UIHelper.dp2px(30.0f))).mo11150h()).mo11143c(R.drawable.sign_sdk_cp_default)).mo11129a(AbstractC2354j.f7811a)).mo11157n()).mo10391a((AbstractC2510a<?>) C2537g.m10789b((AbstractC2393i<Bitmap>) new C2452w(10))).mo10399a(imageView);
        }
    }

    /* renamed from: a */
    private View m253924a(final ButtonInfo buttonInfo, String str) {
        if (buttonInfo == null) {
            this.f123085b.mo171471d("AuthTypeView", "AuthTypeStepInfo.VerifyTypeData data == null");
            return null;
        }
        View inflate = LayoutInflater.from(this.f163100d).inflate(R.layout.signin_sdk_item_login_verify_type, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_type);
        ((TextView) inflate.findViewById(R.id.tv_type)).setText(buttonInfo.text);
        if (buttonInfo.actionType == ButtonType.VERIFY_PHONE.getValue()) {
            imageView.setImageResource(DisplayTypeEnum.PHONE.getIconRes());
        } else if (buttonInfo.actionType == ButtonType.VERIFY_EMAIL.getValue()) {
            imageView.setImageResource(DisplayTypeEnum.MAIL.getIconRes());
        } else if (buttonInfo.actionType == ButtonType.VERIFY_GOOGLE.getValue()) {
            imageView.setImageResource(DisplayTypeEnum.GOOGLE.getIconRes());
        } else if (buttonInfo.actionType == ButtonType.VERIFY_APPLE_ID.getValue()) {
            imageView.setImageResource(DisplayTypeEnum.APPLE.getIconRes());
        } else if (buttonInfo.actionType == ButtonType.VERIFY_B_IDP.getValue()) {
            m253925a(imageView, str);
        } else {
            imageView.setImageResource(DisplayTypeEnum.OTHERS.getIconRes());
        }
        ak.m193850a(inflate, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.auth_type.mvp.AuthTypeView.View$OnClickListenerC646271 */

            public void onClick(View view) {
                AuthTypeView.this.f163099c.mo223441a(buttonInfo.next, ButtonType.fromValue(buttonInfo.actionType));
            }
        });
        return inflate;
    }

    public AuthTypeView(AbstractC64628a aVar, FragmentActivity fragmentActivity, CommonUiContainer commonUiContainer) {
        this.f163100d = fragmentActivity;
        this.f163101e = aVar;
        this.f163102f = commonUiContainer;
    }
}
