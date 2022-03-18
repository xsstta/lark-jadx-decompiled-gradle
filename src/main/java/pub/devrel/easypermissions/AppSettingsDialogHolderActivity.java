package pub.devrel.easypermissions;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.DialogInterfaceC0257a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class AppSettingsDialogHolderActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private DialogInterfaceC0257a f175339a;

    /* renamed from: b */
    private int f175340b;

    /* renamed from: a */
    public Context mo247365a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo247366a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo247367a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m269019a(this, context);
    }

    /* renamed from: b */
    public void mo247368b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo247369c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m269017a(this, configuration);
    }

    public AssetManager getAssets() {
        return m269021c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m269018a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m269020b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        DialogInterfaceC0257a aVar = this.f175339a;
        if (aVar != null && aVar.isShowing()) {
            this.f175339a.dismiss();
        }
    }

    /* renamed from: a */
    public static Resources m269018a(AppSettingsDialogHolderActivity appSettingsDialogHolderActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appSettingsDialogHolderActivity);
        }
        return appSettingsDialogHolderActivity.mo247366a();
    }

    /* renamed from: c */
    public static AssetManager m269021c(AppSettingsDialogHolderActivity appSettingsDialogHolderActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appSettingsDialogHolderActivity);
        }
        return appSettingsDialogHolderActivity.mo247369c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppSettingsDialog a = AppSettingsDialog.m269010a(getIntent(), this);
        this.f175340b = a.mo247356a();
        this.f175339a = a.mo247357a(this, this);
    }

    /* renamed from: b */
    public static void m269020b(AppSettingsDialogHolderActivity appSettingsDialogHolderActivity) {
        appSettingsDialogHolderActivity.mo247368b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AppSettingsDialogHolderActivity appSettingsDialogHolderActivity2 = appSettingsDialogHolderActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    appSettingsDialogHolderActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m269019a(AppSettingsDialogHolderActivity appSettingsDialogHolderActivity, Context context) {
        appSettingsDialogHolderActivity.mo247367a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appSettingsDialogHolderActivity);
        }
    }

    /* renamed from: a */
    public static Context m269017a(AppSettingsDialogHolderActivity appSettingsDialogHolderActivity, Configuration configuration) {
        Context a = appSettingsDialogHolderActivity.mo247365a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null));
            data.addFlags(this.f175340b);
            startActivityForResult(data, 7534);
        } else if (i == -2) {
            setResult(0);
            finish();
        } else {
            throw new IllegalStateException("Unknown button type: " + i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }
}
