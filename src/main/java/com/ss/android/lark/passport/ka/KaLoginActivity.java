package com.ss.android.lark.passport.ka;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.C49018a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49194j;
import com.ss.android.lark.passport.ka.p2452a.C49292b;
import com.ss.android.lark.passport.ka.p2452a.C49296c;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.idp.IdPSettingResponse;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class KaLoginActivity extends BaseActivity implements View.OnLongClickListener {

    /* renamed from: h */
    protected boolean f123726h;

    /* renamed from: i */
    protected View f123727i;

    /* renamed from: a */
    public Context mo171881a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo170967a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m194177a(this, context);
    }

    /* renamed from: b */
    public void mo170969b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo170970c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m194173a(this, configuration);
    }

    public AssetManager getAssets() {
        return m194179c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m194174a(this);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: i */
    public boolean mo171137i() {
        return false;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m194178b(this);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: q */
    public C49018a.C49019a mo171145q() {
        return new C49018a.C49019a(C49018a.f123068d);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: r */
    public C49018a.C49019a mo171146r() {
        return new C49018a.C49019a(C49018a.f123069e);
    }

    /* renamed from: x */
    private void m194181x() {
        C49194j.m193951a(true, new AbstractC49392e() {
            /* class com.ss.android.lark.passport.ka.KaLoginActivity.C492865 */

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: b */
            public void mo171342b(String str) {
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: a */
            public void mo171341a(String str) {
                PassportLog passportLog = KaLoginActivity.this.f123052c;
                String str2 = KaLoginActivity.this.f123053d;
                passportLog.mo171465b(str2, "encrypt deviceId=" + str);
            }
        });
    }

    /* renamed from: w */
    private void m194180w() {
        mo171141m();
        this.f123727i.setVisibility(8);
        C49292b.m194222a().mo171903a(this.f123055f, C49296c.m194232a().mo171920e(), new AbstractC49352d<IdPSettingResponse>() {
            /* class com.ss.android.lark.passport.ka.KaLoginActivity.C492832 */

            /* renamed from: a */
            public void mo145179a(IdPSettingResponse idPSettingResponse) {
                KaLoginActivity.this.mo171882a(idPSettingResponse);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                KaLoginActivity.this.mo171143o();
                KaLoginActivity.this.f123727i.setVisibility(0);
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        if (!isFinishing() && this.f123726h && this.f123727i.getVisibility() == 8) {
            C24174b.m88296a(this.f123053d, "onResume Finish");
            finish();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m194176a(View view) {
        m194180w();
    }

    /* renamed from: a */
    public static Resources m194174a(KaLoginActivity kaLoginActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(kaLoginActivity);
        }
        return kaLoginActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m194179c(KaLoginActivity kaLoginActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(kaLoginActivity);
        }
        return kaLoginActivity.mo170970c();
    }

    public boolean onLongClick(View view) {
        final ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
        if (clipboardManager == null) {
            return false;
        }
        C49194j.m193951a(true, new AbstractC49392e() {
            /* class com.ss.android.lark.passport.ka.KaLoginActivity.C492876 */

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: b */
            public void mo171342b(String str) {
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: a */
            public void mo171341a(String str) {
                clipboardManager.setText(str);
            }
        });
        return false;
    }

    /* renamed from: b */
    public static void m194178b(KaLoginActivity kaLoginActivity) {
        kaLoginActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            KaLoginActivity kaLoginActivity2 = kaLoginActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    kaLoginActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.idp_ka_activity_ka_login);
        View findViewById = findViewById(R.id.error_page);
        this.f123727i = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.passport.ka.$$Lambda$KaLoginActivity$U0aPa8L_wObV0CNW72Ey9lbbWs */

            public final void onClick(View view) {
                KaLoginActivity.m270876lambda$U0aPa8L_wObV0CNW72Ey9lbbWs(KaLoginActivity.this, view);
            }
        });
        this.f123727i.setOnLongClickListener(this);
        View findViewById2 = findViewById(16908290);
        if (findViewById2 != null) {
            findViewById2.setOnLongClickListener(this);
        }
        m194180w();
        m194181x();
        mo171142n();
        if (this.f123051b != null) {
            this.f123051b.setOnKeyListener(new DialogInterface.OnKeyListener() {
                /* class com.ss.android.lark.passport.ka.KaLoginActivity.DialogInterface$OnKeyListenerC492821 */

                public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    KaLoginActivity.this.mo171143o();
                    KaLoginActivity.this.finish();
                    return false;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo171882a(final IdPSettingResponse idPSettingResponse) {
        if (idPSettingResponse == null) {
            mo171143o();
            this.f123727i.setVisibility(0);
        }
        if (C49288a.m194203a().mo171895d() != null) {
            C49288a.m194203a().mo171895d().mo171958a(this, idPSettingResponse, new AbstractC49352d() {
                /* class com.ss.android.lark.passport.ka.KaLoginActivity.C492843 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145179a(Object obj) {
                    KaLoginActivity.this.finish();
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    KaLoginActivity.this.mo171143o();
                    KaLoginActivity.this.f123727i.setVisibility(0);
                }
            });
        } else if (idPSettingResponse != null) {
            C49292b.m194222a().mo171904a(this.f123055f, idPSettingResponse.defaultIdpType, "", "", new AbstractC49352d<BaseStepData>() {
                /* class com.ss.android.lark.passport.ka.KaLoginActivity.C492854 */

                /* renamed from: a */
                public void mo145179a(BaseStepData baseStepData) {
                    KaLoginActivity.this.f123726h = true;
                    C49292b.m194222a().mo171902a(KaLoginActivity.this, idPSettingResponse.defaultIdpType, baseStepData);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    PassportLog passportLog = KaLoginActivity.this.f123052c;
                    String str = KaLoginActivity.this.f123053d;
                    passportLog.mo171465b(str, "getKaIdpSetting error:" + networkErrorResult.toString());
                    KaLoginActivity.this.mo171143o();
                    KaLoginActivity.this.f123727i.setVisibility(0);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m194177a(KaLoginActivity kaLoginActivity, Context context) {
        kaLoginActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(kaLoginActivity);
        }
    }

    /* renamed from: a */
    public static Context m194173a(KaLoginActivity kaLoginActivity, Configuration configuration) {
        Context a = kaLoginActivity.mo171881a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m194175a(Context context, boolean z) {
        Intent intent = new Intent(context, KaLoginActivity.class);
        if (z) {
            intent.addFlags(268468224);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
