package com.ss.android.lark.account_provider.debug;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.LarkContext;
import java.io.File;
import java.io.IOException;

public class PassportDebugActivity extends AppCompatActivity {

    /* renamed from: a */
    private static final File f71665a = new File(LarkContext.getApplication().getFilesDir(), "ttnet_boe.flag");

    /* renamed from: b */
    private TextView f71666b;

    /* renamed from: c */
    private Button f71667c;

    /* renamed from: a */
    public Context mo101480a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo101482a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m104498a(this, context);
    }

    /* renamed from: b */
    public Resources mo101484b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo101485c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m104496a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo101487d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m104501c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m104497a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m104499b(this);
    }

    /* renamed from: f */
    private boolean m104503f() {
        return f71665a.exists();
    }

    /* renamed from: e */
    private void m104502e() {
        String str;
        boolean f = m104503f();
        Button button = this.f71667c;
        StringBuilder sb = new StringBuilder();
        sb.append("ttnet_boe: ");
        if (f) {
            str = "on";
        } else {
            str = "off";
        }
        sb.append(str);
        button.setText(sb.toString());
    }

    /* renamed from: g */
    private void m104504g() {
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo698a(true);
            supportActionBar.mo697a("Passport Debug");
            supportActionBar.mo694a(25.0f);
        }
    }

    /* renamed from: a */
    public void mo101481a() {
        if (m104503f()) {
            f71665a.delete();
        } else {
            try {
                f71665a.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        m104502e();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m104500b(String str) {
        this.f71666b.setText(str);
    }

    /* renamed from: a */
    public static Resources m104497a(PassportDebugActivity passportDebugActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(passportDebugActivity);
        }
        return passportDebugActivity.mo101484b();
    }

    /* renamed from: c */
    public static AssetManager m104501c(PassportDebugActivity passportDebugActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(passportDebugActivity);
        }
        return passportDebugActivity.mo101487d();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* renamed from: b */
    public static void m104499b(PassportDebugActivity passportDebugActivity) {
        passportDebugActivity.mo101485c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PassportDebugActivity passportDebugActivity2 = passportDebugActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    passportDebugActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_passport_debug);
        m104504g();
        this.f71666b = (TextView) findViewById(R.id.display_area);
        Button button = (Button) findViewById(R.id.btn_ttnet_boe);
        this.f71667c = button;
        button.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.account_provider.debug.PassportDebugActivity.View$OnClickListenerC285121 */

            public void onClick(View view) {
                PassportDebugActivity.this.mo101481a();
                PassportDebugActivity.this.mo101483a("Take effect after restart app");
            }
        });
        m104502e();
    }

    /* renamed from: a */
    public void mo101483a(String str) {
        this.f71666b.post(new Runnable(str) {
            /* class com.ss.android.lark.account_provider.debug.$$Lambda$PassportDebugActivity$4_ttNtOFD4gmvWHScb3S2iSCDc */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                PassportDebugActivity.m270235lambda$4_ttNtOFD4gmvWHScb3S2iSCDc(PassportDebugActivity.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public static void m104498a(PassportDebugActivity passportDebugActivity, Context context) {
        passportDebugActivity.mo101482a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(passportDebugActivity);
        }
    }

    /* renamed from: a */
    public static Context m104496a(PassportDebugActivity passportDebugActivity, Configuration configuration) {
        Context a = passportDebugActivity.mo101480a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
