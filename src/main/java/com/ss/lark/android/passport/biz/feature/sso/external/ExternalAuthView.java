package com.ss.lark.android.passport.biz.feature.sso.external;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.ComponentCallbacks2C2126g;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.load.resource.bitmap.C2452w;
import com.bumptech.glide.request.AbstractC2510a;
import com.bumptech.glide.request.C2537g;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.UDDialogUtils;
import com.ss.android.lark.passport.infra.widget.DialogC49246b;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.AuthInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.PermissionScope;
import com.ss.android.lark.utils.UIHelper;
import com.ss.lark.android.passport.biz.compat.tenant.C64471a;
import com.ss.lark.android.passport.biz.feature.sso.C65022a;
import com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExternalAuthView extends AbstractC49023c<AbstractC65033d.AbstractC65035b.AbstractC65036a> implements AbstractC65033d.AbstractC65035b {

    /* renamed from: d */
    private static final int f163780d = UIHelper.getDimens(R.dimen.signin_sdk_rect_avatar_radius);

    /* renamed from: c */
    public AbstractC65033d.AbstractC65035b.AbstractC65036a f163781c;

    /* renamed from: e */
    private DialogC49246b f163782e;

    /* renamed from: f */
    private final Activity f163783f;

    /* renamed from: g */
    private AbstractC65026a f163784g;

    /* renamed from: h */
    private UDDialogUtils.DialogWrapper f163785h;
    @BindView(7219)
    public TextView mAuthTitle;
    @BindView(6296)
    public TextView mConfirmBtn;
    @BindView(7248)
    public TextView mIdentityTitle;
    @BindView(6568)
    public ImageView mIvCancel;
    @BindView(6577)
    public ImageView mLarkAvatarUrl;
    @BindView(6686)
    public LinearLayout mPermissionLayout;
    @BindView(6585)
    public ImageView mTenantIcon;
    @BindView(7250)
    public TextView mTenantName;
    @BindView(7246)
    public TextView mTitle;
    @BindView(7238)
    public TextView mTvPermissionTitle;
    @BindView(6583)
    public ImageView mUerAvatarUrl;
    @BindView(7249)
    public TextView mUserName;

    /* renamed from: com.ss.lark.android.passport.biz.feature.sso.external.ExternalAuthView$a */
    public interface AbstractC65026a {
        /* renamed from: a */
        void mo224092a();

        /* renamed from: a */
        void mo224093a(ExternalAuthView externalAuthView);
    }

    /* renamed from: a */
    public void mo224080a(String str, int i, int i2, int i3, ImageView imageView) {
        if (!TextUtils.isEmpty(str) || i != 0) {
            ComponentCallbacks2C2126g a = ComponentCallbacks2C2115c.m9139a(this.f163783f);
            boolean isEmpty = TextUtils.isEmpty(str);
            Object obj = str;
            if (isEmpty) {
                obj = Integer.valueOf(i);
            }
            C2124f fVar = (C2124f) ((C2124f) ((C2124f) ((C2124f) ((C2124f) a.mo10414a(obj).mo11144c(UIHelper.dp2px(40.0f), UIHelper.dp2px(40.0f))).mo11150h()).mo11143c(i2)).mo11129a(AbstractC2354j.f7811a)).mo11157n();
            if (i3 > 0) {
                fVar.mo10391a((AbstractC2510a<?>) C2537g.m10789b((AbstractC2393i<Bitmap>) new C2452w(i3)));
            }
            fVar.mo10399a(imageView);
        }
    }

    /* renamed from: a */
    public void mo224079a(String str) {
        m255285k();
        UDDialogUtils.DialogWrapper a = UDDialogUtils.m193815a(this.f163783f, "", str, UIHelper.getString(R.string.Lark_Login_SSO_TimeoutButton), $$Lambda$ExternalAuthView$ubTrVJxUL2nRmOvscNwro4lG9Ys.INSTANCE);
        this.f163785h = a;
        a.mo171633a(false);
        this.f163785h.mo171632a();
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d.AbstractC65035b
    /* renamed from: a */
    public void mo224081a(boolean z) {
        Activity activity = this.f163783f;
        if (activity != null) {
            activity.moveTaskToBack(z);
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d.AbstractC65035b
    /* renamed from: e */
    public void mo224085e() {
        DialogC49246b bVar = this.f163782e;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d.AbstractC65035b
    /* renamed from: f */
    public void mo224086f() {
        Activity activity = this.f163783f;
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d.AbstractC65035b
    /* renamed from: h */
    public void mo224088h() {
        this.f163784g.mo224092a();
    }

    /* renamed from: i */
    private void m255283i() {
        this.f163782e = new DialogC49246b(this.f163783f, true);
        m255284j();
    }

    /* renamed from: k */
    private void m255285k() {
        UDDialogUtils.DialogWrapper aVar = this.f163785h;
        if (aVar != null) {
            aVar.mo171634b();
            this.f163785h = null;
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163784g = null;
        m255285k();
        mo224085e();
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d.AbstractC65035b
    /* renamed from: g */
    public boolean mo224087g() {
        Activity activity = this.f163783f;
        if (activity == null || activity.isFinishing()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d.AbstractC65035b
    /* renamed from: d */
    public void mo224084d() {
        if (this.f163782e == null) {
            this.f163782e = new DialogC49246b(this.f163783f, true);
        }
        this.f163782e.show();
    }

    /* renamed from: j */
    private void m255284j() {
        String str;
        String str2;
        String str3;
        User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
        C64471a aVar = C64471a.f162788a;
        if (foregroundUser != null) {
            str = foregroundUser.userId;
        } else {
            str = null;
        }
        TenantInfo a = aVar.mo223057a(str);
        String str4 = "";
        if (a == null) {
            str2 = str4;
        } else {
            str2 = a.getAvatarUrl();
        }
        mo224080a(str2, R.drawable.sign_sdk_cp_default, R.drawable.sign_sdk_cp_default, f163780d, this.mTenantIcon);
        TextView textView = this.mTenantName;
        if (a == null) {
            str3 = str4;
        } else {
            str3 = a.getTenantName();
        }
        textView.setText(str3);
        TextView textView2 = this.mUserName;
        if (a != null) {
            str4 = a.getUserName();
        }
        textView2.setText(str4);
        HashMap hashMap = new HashMap();
        hashMap.put("APP_DISPLAY_NAME", UIHelper.getString(R.string.Lark_App_Name));
        this.mTitle.setText(UIHelper.mustacheFormat((int) R.string.Lark_Login_SSO_AuthorizationTitle, hashMap));
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f163784g.mo224093a(this);
        m255283i();
    }

    /* renamed from: a */
    private void m255274a(ImageView imageView) {
        mo224080a("", R.drawable.pot_permission_item, R.drawable.pot_permission_item, 0, imageView);
    }

    /* renamed from: b */
    private void m255278b(ImageView imageView) {
        mo224080a("", R.drawable.login_bg_default_required_check, R.drawable.login_bg_default_required_check, 0, imageView);
    }

    /* renamed from: c */
    private void m255279c(final AuthInfo authInfo) {
        this.mConfirmBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.sso.external.ExternalAuthView.View$OnClickListenerC650231 */

            public void onClick(View view) {
                C65022a.m255255a("confirm_btn_click", "auth");
                if (ExternalAuthView.this.f163781c != null) {
                    ExternalAuthView.this.f163781c.mo224106a(ExternalAuthView.this.mo224082b(authInfo));
                }
            }
        });
        this.mIvCancel.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.sso.external.ExternalAuthView.View$OnClickListenerC650242 */

            public void onClick(View view) {
                C65022a.m255255a("close_btn_click", "auth");
                if (ExternalAuthView.this.f163781c != null) {
                    ExternalAuthView.this.f163781c.mo224105a();
                }
            }
        });
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d.AbstractC65035b
    /* renamed from: b */
    public void mo224083b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = UIHelper.getString(R.string.Lark_Login_SSO_AuthorizationFailed);
        }
        mo224079a(str);
    }

    /* renamed from: f */
    private void m255282f(AuthInfo authInfo) {
        if (authInfo != null) {
            String str = authInfo.appIcon;
            int i = f163780d;
            mo224080a(str, R.drawable.login_bg_auth_app_icon, R.drawable.login_bg_auth_app_icon, i, this.mUerAvatarUrl);
            mo224080a("", R.drawable.signin_sdk_lark_icon_avatar, R.drawable.signin_sdk_lark_icon_avatar, i, this.mLarkAvatarUrl);
        }
    }

    /* renamed from: b */
    public List<String> mo224082b(AuthInfo authInfo) {
        List<PermissionScope> list;
        ArrayList arrayList = new ArrayList();
        if (authInfo == null || (list = authInfo.permissionScopes) == null) {
            return arrayList;
        }
        for (int i = 0; i < list.size(); i++) {
            PermissionScope permissionScope = list.get(i);
            if (permissionScope == null || TextUtils.isEmpty(permissionScope.key)) {
                Log.m165389i("ExternalAuthView", "scope is null");
            } else if (list.get(i).isSelected) {
                arrayList.add(permissionScope.key);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private void m255280d(AuthInfo authInfo) {
        List<PermissionScope> list;
        if (!(authInfo == null || (list = authInfo.permissionScopes) == null)) {
            boolean a = m255277a(list);
            this.mPermissionLayout.removeAllViews();
            for (int i = 0; i < list.size(); i++) {
                PermissionScope permissionScope = list.get(i);
                if (permissionScope == null) {
                    Log.m165389i("ExternalAuthView", "initPermissionLayout -> scope is null");
                } else {
                    View inflate = LayoutInflater.from(this.f163783f).inflate(R.layout.item_auth_permission, (ViewGroup) null);
                    m255273a(inflate, permissionScope, a);
                    ((TextView) inflate.findViewById(R.id.tv_permission)).setText(permissionScope.text);
                    this.mPermissionLayout.addView(inflate);
                }
            }
        }
    }

    /* renamed from: e */
    private void m255281e(AuthInfo authInfo) {
        if (authInfo != null) {
            this.mAuthTitle.setText(authInfo.appName.concat(" ").concat(authInfo.subTitle));
            if (authInfo.buttonList != null && authInfo.buttonList.size() >= 1) {
                this.mConfirmBtn.setText(authInfo.buttonList.get(0).text);
            }
            this.mTvPermissionTitle.setText(authInfo.scopeTitle);
            if (!TextUtils.isEmpty(authInfo.identityTitle)) {
                this.mIdentityTitle.setText(authInfo.identityTitle);
            }
        }
    }

    /* renamed from: a */
    private boolean m255277a(List<PermissionScope> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                PermissionScope permissionScope = list.get(i);
                if (permissionScope == null || !permissionScope.required) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d.AbstractC65035b
    /* renamed from: a */
    public void mo224077a(AuthInfo authInfo) {
        if (authInfo == null) {
            Log.m165383e("ExternalAuthView", "initViewByAuthInfo -> AuthInfo is null");
            return;
        }
        m255282f(authInfo);
        m255281e(authInfo);
        m255280d(authInfo);
        m255279c(authInfo);
    }

    /* renamed from: a */
    public void mo171188a(AbstractC65033d.AbstractC65035b.AbstractC65036a aVar) {
        this.f163781c = aVar;
    }

    public ExternalAuthView(Activity activity, AbstractC65026a aVar) {
        this.f163783f = activity;
        this.f163784g = aVar;
    }

    /* renamed from: a */
    private void m255275a(ImageView imageView, int i) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        float f = (float) i;
        layoutParams.height = UIHelper.dp2px(f);
        layoutParams.width = UIHelper.dp2px(f);
        imageView.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private void m255273a(View view, PermissionScope permissionScope, boolean z) {
        if (permissionScope != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.view_bot);
            if (z) {
                m255275a(imageView, 4);
                m255274a(imageView);
                return;
            }
            m255275a(imageView, 20);
            if (permissionScope.required) {
                m255278b(imageView);
            } else {
                m255276a(imageView, view, permissionScope);
            }
        }
    }

    /* renamed from: a */
    private void m255276a(final ImageView imageView, View view, final PermissionScope permissionScope) {
        mo224080a("", R.drawable.signin_sdk_check_click, R.drawable.signin_sdk_check_click, 0, imageView);
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.sso.external.ExternalAuthView.View$OnClickListenerC650253 */

            public void onClick(View view) {
                if (permissionScope.isSelected) {
                    permissionScope.isSelected = false;
                    ExternalAuthView.this.mo224080a("", R.drawable.signin_sdk_check_unclick, R.drawable.signin_sdk_check_unclick, 0, imageView);
                    return;
                }
                permissionScope.isSelected = true;
                ExternalAuthView.this.mo224080a("", R.drawable.signin_sdk_check_click, R.drawable.signin_sdk_check_click, 0, imageView);
            }
        });
    }
}
