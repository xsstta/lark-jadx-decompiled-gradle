package com.ss.android.lark.authorization;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.AbstractC49334a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class AuthorizationActivity extends AppCompatActivity {

    /* renamed from: a */
    public boolean f73508a;

    /* renamed from: b */
    public boolean f73509b;

    /* renamed from: a */
    public Context mo104152a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo104154a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo104155a(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m108147a(this, context);
    }

    /* renamed from: b */
    public void mo104156b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo104157c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m108144a(this, configuration);
    }

    public AssetManager getAssets() {
        return m108152c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m108145a(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m108150b(this);
    }

    /* renamed from: f */
    private void m108157f() {
        this.f73509b = true;
        m108158g();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        if (this.f73508a) {
            Process.killProcess(Process.myPid());
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: g */
    private void m108158g() {
        C29405b.m108175a(this, false);
        C29405b.m108174a(this);
        C26171w.m94676a(new Runnable() {
            /* class com.ss.android.lark.authorization.AuthorizationActivity.RunnableC294021 */

            public void run() {
                Bundle extras = AuthorizationActivity.this.getIntent().getExtras();
                Bundle bundle = new Bundle();
                if (extras != null) {
                    bundle.putAll(extras);
                }
                bundle.putBoolean("key_privacy_authorization", AuthorizationActivity.this.f73509b);
                C29403a.m108165a().mo104167a(AuthorizationActivity.this, "", bundle);
                AuthorizationActivity.this.finish();
                AuthorizationActivity.this.f73508a = true;
            }
        }, 300);
    }

    /* renamed from: e */
    private void m108156e() {
        C25639g l = new C25639g(this).mo89242c(C29403a.m108165a().mo104166a(this, R.string.Lark_PrivacyPolicy_AgreeToPrivacyPolicyToUse_PopupText, R.string.Lark_PrivacyPolicy_AgreeToPrivacyPolicyToUse_Variable, R.string.Lark_Guide_V3_serviceterms, new AbstractC49334a.AbstractC49335a() {
            /* class com.ss.android.lark.authorization.$$Lambda$AuthorizationActivity$urhMAMWXPDFoLvjiUOySFvWM2pk */

            @Override // com.ss.android.lark.passport.signinsdk_api.AbstractC49334a.AbstractC49335a
            public final boolean intercept(String str) {
                return AuthorizationActivity.lambda$urhMAMWXPDFoLvjiUOySFvWM2pk(AuthorizationActivity.this, str);
            }
        })).mo89246d(false).mo89253l(3);
        l.mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_PrivacyPolicy_AgreeToPrivacyPolicyToUse_AcceptButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.authorization.$$Lambda$AuthorizationActivity$8JKob4emWrd6qJsvjSe6IW6Z4mM */

            public final void onClick(DialogInterface dialogInterface, int i) {
                AuthorizationActivity.lambda$8JKob4emWrd6qJsvjSe6IW6Z4mM(AuthorizationActivity.this, dialogInterface, i);
            }
        }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_PrivacyPolicy_AgreeToPrivacyPolicyToUse_DeclineButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.authorization.$$Lambda$AuthorizationActivity$mLbgRsdbFkP1NxPZGe6l7VtLdX0 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                AuthorizationActivity.lambda$mLbgRsdbFkP1NxPZGe6l7VtLdX0(AuthorizationActivity.this, dialogInterface, i);
            }
        });
        TextView textView = (TextView) l.mo89239c().findViewById(R.id.ud_dialog_content_message_tv);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
        }
    }

    /* renamed from: d */
    private void m108154d() {
        CharSequence a = C29403a.m108165a().mo104166a(this, R.string.Lark_Login_ServiceTermPrivacyPolicy, R.string.Lark_Guide_V3_PrivacyPolicy, R.string.Lark_Guide_V3_serviceterms, new AbstractC49334a.AbstractC49335a() {
            /* class com.ss.android.lark.authorization.$$Lambda$AuthorizationActivity$urhMAMWXPDFoLvjiUOySFvWM2pk */

            @Override // com.ss.android.lark.passport.signinsdk_api.AbstractC49334a.AbstractC49335a
            public final boolean intercept(String str) {
                return AuthorizationActivity.lambda$urhMAMWXPDFoLvjiUOySFvWM2pk(AuthorizationActivity.this, str);
            }
        });
        if (TextUtils.isEmpty(a)) {
            C26171w.m94676a(new Runnable() {
                /* class com.ss.android.lark.authorization.$$Lambda$AuthorizationActivity$oxXnvQJbJ_Imjxwsgb4xriII58s */

                public final void run() {
                    AuthorizationActivity.lambda$oxXnvQJbJ_Imjxwsgb4xriII58s(AuthorizationActivity.this);
                }
            }, 200);
            return;
        }
        View inflate = LayoutInflater.from(this).inflate(R.layout.authorization_privacy_dialog_content, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.privacy_link_tv);
        if (textView != null) {
            textView.setText(a);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
        }
        C25639g r = new C25639g(this).mo89240c(0.8f).mo89248g(R.string.Lark_Login_V3_Lark_PrivacyNoticeTitle).mo89238b(true).mo89252k(17).mo89236b(inflate).mo89253l(3).mo89246d(false).mo89247e(false).mo89259r(R.layout.authorization_privacy_dialog_footer);
        r.mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Login_V3_Lark_PrivacyButtonagree, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.authorization.$$Lambda$AuthorizationActivity$_ChSwjxKlG_DXtskOHFIhW3MU */

            public final void onClick(DialogInterface dialogInterface, int i) {
                AuthorizationActivity.m270279lambda$_ChSwjxKlG_DXtskOHFIhW3MU(AuthorizationActivity.this, dialogInterface, i);
            }
        }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Login_V3_Lark_PrivacyButtondisagree, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.authorization.$$Lambda$AuthorizationActivity$7WVg_9kT6TIUOHrvq7JKdcelu28 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                AuthorizationActivity.lambda$7WVg_9kT6TIUOHrvq7JKdcelu28(AuthorizationActivity.this, dialogInterface, i);
            }
        });
        r.mo89233b().show();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private boolean m108151b(String str) {
        m108148a(mo104153a(str));
        return true;
    }

    /* renamed from: a */
    public static Resources m108145a(AuthorizationActivity authorizationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(authorizationActivity);
        }
        return authorizationActivity.mo104154a();
    }

    /* renamed from: c */
    public static AssetManager m108152c(AuthorizationActivity authorizationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(authorizationActivity);
        }
        return authorizationActivity.mo104157c();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.drawable.layer_splash_bg);
        setContentView(R.layout.activity_authorized);
        m108154d();
    }

    /* renamed from: b */
    public static void m108150b(AuthorizationActivity authorizationActivity) {
        authorizationActivity.mo104156b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AuthorizationActivity authorizationActivity2 = authorizationActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    authorizationActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m108148a(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            startActivity(intent);
            return true;
        } catch (Exception e) {
            Log.m165383e("AuthorizationActivity", e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public Intent mo104153a(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m108149b(DialogInterface dialogInterface, int i) {
        m108157f();
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m108153c(DialogInterface dialogInterface, int i) {
        m108156e();
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m108155d(DialogInterface dialogInterface, int i) {
        m108157f();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m108146a(DialogInterface dialogInterface, int i) {
        C29405b.m108175a(this, true);
    }

    /* renamed from: a */
    public static void m108147a(AuthorizationActivity authorizationActivity, Context context) {
        authorizationActivity.mo104155a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(authorizationActivity);
        }
    }

    /* renamed from: a */
    public static Context m108144a(AuthorizationActivity authorizationActivity, Configuration configuration) {
        Context a = authorizationActivity.mo104152a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
