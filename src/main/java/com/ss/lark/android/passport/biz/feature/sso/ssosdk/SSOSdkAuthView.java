package com.ss.lark.android.passport.biz.feature.sso.ssosdk;

import android.app.Activity;
import android.content.DialogInterface;
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
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2069j.p2070a.C40651r;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.UDDialogUtils;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.infra.widget.DialogC49246b;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.AuthInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.PermissionScope;
import com.ss.android.lark.utils.UIHelper;
import com.ss.lark.android.passport.biz.compat.tenant.C64471a;
import com.ss.lark.android.passport.biz.feature.sso.C65022a;
import com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SSOSdkAuthView extends AbstractC49023c<AbstractC65052a.AbstractC65054b.AbstractC65055a> implements AbstractC65052a.AbstractC65054b {

    /* renamed from: e */
    private static final int f163832e = UIHelper.getDimens(R.dimen.signin_sdk_rect_avatar_radius);

    /* renamed from: c */
    public final Activity f163833c;

    /* renamed from: d */
    public AbstractC65052a.AbstractC65054b.AbstractC65055a f163834d;

    /* renamed from: f */
    private DialogC49246b f163835f;

    /* renamed from: g */
    private AbstractC65051a f163836g;
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

    /* renamed from: com.ss.lark.android.passport.biz.feature.sso.ssosdk.SSOSdkAuthView$a */
    public interface AbstractC65051a {
        /* renamed from: a */
        void mo224156a();

        /* renamed from: a */
        void mo224157a(SSOSdkAuthView sSOSdkAuthView);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163836g = null;
    }

    /* renamed from: a */
    public void mo224142a(String str, int i, int i2, int i3, ImageView imageView) {
        if (!TextUtils.isEmpty(str) || i != 0) {
            ComponentCallbacks2C2126g a = ComponentCallbacks2C2115c.m9139a(this.f163833c);
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

    @Override // com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a.AbstractC65054b
    /* renamed from: a */
    public void mo224143a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = UIHelper.getString(R.string.Lark_Passport_GetCaptchaError);
        }
        if (TextUtils.isEmpty(str)) {
            str2 = "0";
        }
        mo224145b(str, str2);
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a.AbstractC65054b
    /* renamed from: d */
    public void mo224146d() {
        Activity activity = this.f163833c;
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a.AbstractC65054b
    /* renamed from: f */
    public void mo224148f() {
        DialogC49246b bVar = this.f163835f;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a.AbstractC65054b
    /* renamed from: h */
    public void mo224150h() {
        this.f163836g.mo224156a();
    }

    /* renamed from: i */
    private void m255432i() {
        this.f163835f = new DialogC49246b(this.f163833c, true);
        m255433j();
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a.AbstractC65054b
    /* renamed from: g */
    public boolean mo224149g() {
        Activity activity = this.f163833c;
        if (activity == null || activity.isFinishing()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a.AbstractC65054b
    /* renamed from: e */
    public void mo224147e() {
        if (this.f163835f == null) {
            this.f163835f = new DialogC49246b(this.f163833c, true);
        }
        this.f163835f.show();
    }

    /* renamed from: j */
    private void m255433j() {
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
        mo224142a(str2, R.drawable.sign_sdk_cp_default, R.drawable.sign_sdk_cp_default, f163832e, this.mTenantIcon);
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
        this.f163836g.mo224157a(this);
        m255432i();
    }

    /* renamed from: a */
    public void mo171188a(AbstractC65052a.AbstractC65054b.AbstractC65055a aVar) {
        this.f163834d = aVar;
    }

    /* renamed from: a */
    private void m255423a(ImageView imageView) {
        mo224142a("", R.drawable.pot_permission_item, R.drawable.pot_permission_item, 0, imageView);
    }

    /* renamed from: b */
    private void m255427b(ImageView imageView) {
        mo224142a("", R.drawable.login_bg_default_required_check, R.drawable.login_bg_default_required_check, 0, imageView);
    }

    /* renamed from: c */
    private void m255428c(final AuthInfo authInfo) {
        this.mConfirmBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.sso.ssosdk.SSOSdkAuthView.View$OnClickListenerC650461 */

            public void onClick(View view) {
                C65022a.m255255a("confirm_btn_click", "sso_sdk_auth");
                if (SSOSdkAuthView.this.f163834d != null) {
                    SSOSdkAuthView.this.f163834d.mo224162a(SSOSdkAuthView.this.mo224144b(authInfo));
                }
            }
        });
        this.mIvCancel.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.sso.ssosdk.SSOSdkAuthView.View$OnClickListenerC650472 */

            public void onClick(View view) {
                C65022a.m255255a("close_btn_click", "sso_sdk_auth");
                SSOSdkAuthView.this.f123085b.mo171465b("n_action_ssosdk_auth_cancel", "click cancel");
                WatcherHelper.m193664a(SSOSdkAuthView.this.f123084a, C40651r.f103157s);
                if (SSOSdkAuthView.this.f163834d != null) {
                    SSOSdkAuthView.this.f163834d.mo224160a();
                }
            }
        });
    }

    /* renamed from: d */
    private void m255429d(AuthInfo authInfo) {
        if (authInfo != null) {
            if (!TextUtils.isEmpty(authInfo.appName) && !TextUtils.isEmpty(authInfo.subTitle)) {
                this.mAuthTitle.setText(authInfo.appName.concat(" ").concat(authInfo.subTitle));
            }
            this.mConfirmBtn.setText(authInfo.button);
            this.mTvPermissionTitle.setText(authInfo.scopeTitle);
            this.mIdentityTitle.setText(authInfo.identityTitle);
        }
    }

    /* renamed from: f */
    private void m255431f(AuthInfo authInfo) {
        if (authInfo != null) {
            String str = authInfo.appIcon;
            int i = f163832e;
            mo224142a(str, R.drawable.login_bg_auth_app_icon, R.drawable.login_bg_auth_app_icon, i, this.mUerAvatarUrl);
            mo224142a("", R.drawable.signin_sdk_lark_icon_avatar, R.drawable.signin_sdk_lark_icon_avatar, i, this.mLarkAvatarUrl);
        }
    }

    /* renamed from: b */
    public List<String> mo224144b(AuthInfo authInfo) {
        List<PermissionScope> list;
        ArrayList arrayList = new ArrayList();
        if (authInfo == null || (list = authInfo.permissionScopes) == null) {
            return arrayList;
        }
        for (int i = 0; i < list.size(); i++) {
            PermissionScope permissionScope = list.get(i);
            if (permissionScope == null || TextUtils.isEmpty(permissionScope.key)) {
                Log.m165389i("SSOSdkAuthView", "scope is null");
            } else if (list.get(i).isSelected) {
                arrayList.add(permissionScope.key);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    private void m255430e(AuthInfo authInfo) {
        List<PermissionScope> list;
        if (!(authInfo == null || (list = authInfo.permissionScopes) == null)) {
            boolean a = m255426a(list);
            this.mPermissionLayout.removeAllViews();
            for (int i = 0; i < list.size(); i++) {
                PermissionScope permissionScope = list.get(i);
                if (permissionScope == null) {
                    Log.m165389i("SSOSdkAuthView", "initPermissionLayout -> scope is null");
                } else {
                    View inflate = LayoutInflater.from(this.f163833c).inflate(R.layout.item_auth_permission, (ViewGroup) null);
                    m255422a(inflate, permissionScope, a);
                    ((TextView) inflate.findViewById(R.id.tv_permission)).setText(permissionScope.text);
                    this.mPermissionLayout.addView(inflate);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m255426a(List<PermissionScope> list) {
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

    @Override // com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a.AbstractC65054b
    /* renamed from: a */
    public void mo224139a(AuthInfo authInfo) {
        if (authInfo == null) {
            Log.m165383e("SSOSdkAuthView", "initViewByAuthInfo -> AuthInfo is null");
            return;
        }
        m255431f(authInfo);
        m255429d(authInfo);
        m255430e(authInfo);
        m255428c(authInfo);
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a.AbstractC65054b
    /* renamed from: a */
    public void mo224141a(String str) {
        AbstractC65052a.AbstractC65054b.AbstractC65055a aVar = this.f163834d;
        if (aVar != null) {
            aVar.mo224161a(str);
        }
    }

    public SSOSdkAuthView(Activity activity, AbstractC65051a aVar) {
        this.f163833c = activity;
        this.f163836g = aVar;
    }

    /* renamed from: a */
    private void m255424a(ImageView imageView, int i) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        float f = (float) i;
        layoutParams.height = UIHelper.dp2px(f);
        layoutParams.width = UIHelper.dp2px(f);
        imageView.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public void mo224145b(final String str, final String str2) {
        C26171w.m94675a(new Runnable() {
            /* class com.ss.lark.android.passport.biz.feature.sso.ssosdk.SSOSdkAuthView.RunnableC650494 */

            public void run() {
                UDDialogUtils.DialogWrapper a = UDDialogUtils.m193815a(SSOSdkAuthView.this.f163833c, UIHelper.getString(R.string.Lark_Legacy_LarkTip), str2, UIHelper.getString(R.string.Lark_Login_SSO_TimeoutButton), new DialogInterface.OnClickListener() {
                    /* class com.ss.lark.android.passport.biz.feature.sso.ssosdk.SSOSdkAuthView.RunnableC650494.DialogInterface$OnClickListenerC650501 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (SSOSdkAuthView.this.f163834d != null) {
                            SSOSdkAuthView.this.f163834d.mo224161a(str);
                        }
                    }
                });
                a.mo171633a(false);
                a.mo171632a();
            }
        });
    }

    /* renamed from: a */
    private void m255422a(View view, PermissionScope permissionScope, boolean z) {
        if (permissionScope != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.view_bot);
            if (z) {
                m255424a(imageView, 4);
                m255423a(imageView);
                return;
            }
            m255424a(imageView, 20);
            if (permissionScope.required) {
                m255427b(imageView);
            } else {
                m255425a(imageView, view, permissionScope);
            }
        }
    }

    /* renamed from: a */
    private void m255425a(final ImageView imageView, View view, final PermissionScope permissionScope) {
        mo224142a("", R.drawable.signin_sdk_check_click, R.drawable.signin_sdk_check_click, 0, imageView);
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.sso.ssosdk.SSOSdkAuthView.View$OnClickListenerC650483 */

            public void onClick(View view) {
                if (permissionScope.isSelected) {
                    permissionScope.isSelected = false;
                    SSOSdkAuthView.this.mo224142a("", R.drawable.signin_sdk_check_unclick, R.drawable.signin_sdk_check_unclick, 0, imageView);
                    return;
                }
                permissionScope.isSelected = true;
                SSOSdkAuthView.this.mo224142a("", R.drawable.signin_sdk_check_click, R.drawable.signin_sdk_check_click, 0, imageView);
            }
        });
    }
}
