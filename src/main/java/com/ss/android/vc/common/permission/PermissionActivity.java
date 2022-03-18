package com.ss.android.vc.common.permission;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.air.AirActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vcxp.C63801c;
import io.reactivex.functions.Consumer;

public class PermissionActivity extends AirActivity {

    /* renamed from: a */
    private static AbstractC60798c f152003a;

    /* renamed from: a */
    public Context mo208399a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo208400a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo208401a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m236273a(this, context);
    }

    /* renamed from: b */
    public void mo208402b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo208403c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m236269a(this, configuration);
    }

    public AssetManager getAssets() {
        return m236279c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m236270a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m236278b(this);
    }

    public void finish() {
        C60700b.m235851b("PermissionActivity@", "[finish]", "finish");
        f152003a = null;
        super.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m236274a(Boolean bool) throws Exception {
        m236276a(bool.booleanValue());
    }

    /* renamed from: a */
    public static Resources m236270a(PermissionActivity permissionActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(permissionActivity);
        }
        return permissionActivity.mo208400a();
    }

    /* renamed from: c */
    public static AssetManager m236279c(PermissionActivity permissionActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(permissionActivity);
        }
        return permissionActivity.mo208403c();
    }

    /* renamed from: b */
    public static void m236278b(PermissionActivity permissionActivity) {
        permissionActivity.mo208402b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PermissionActivity permissionActivity2 = permissionActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    permissionActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        if (!C63801c.m250499a(this, bundle)) {
            finish();
            return;
        }
        super.onCreate(bundle);
        supportRequestWindowFeature(1);
        setContentView(new View(this));
        String stringExtra = getIntent().getStringExtra("EXTRA_PERMISSION_NAME");
        if (TextUtils.isEmpty(stringExtra)) {
            m236276a(true);
        } else {
            m236275a(stringExtra, getIntent().getStringExtra("EXTRA_PERMISSION_TITLE"), getIntent().getStringExtra("EXTRA_PERMISSION_DES"));
        }
    }

    /* renamed from: a */
    private void m236276a(boolean z) {
        C60700b.m235851b("PermissionActivity@", "[gotoCheckResult]", "" + z);
        AbstractC60798c cVar = f152003a;
        if (cVar != null) {
            cVar.permissionGranted(z);
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m236277b(DialogInterface dialogInterface, int i) {
        m236276a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m236272a(DialogInterface dialogInterface, int i) {
        C60794a.m236285a(this, 19991);
        m236276a(false);
    }

    /* renamed from: a */
    public static Context m236269a(PermissionActivity permissionActivity, Configuration configuration) {
        Context a = permissionActivity.mo208399a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m236273a(PermissionActivity permissionActivity, Context context) {
        permissionActivity.mo208401a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(permissionActivity);
        }
    }

    /* renamed from: a */
    private void m236275a(String str, String str2, String str3) {
        C60700b.m235851b("PermissionActivity@", "[checkRxPermission]", str);
        C51331a aVar = new C51331a(this);
        if (aVar.mo176921a(str)) {
            m236276a(true);
        } else if (C60795b.m236297a((Object) this, str)) {
            VCDialogUtils.m236216b((Context) this, str2, 2, str3, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.common.permission.$$Lambda$PermissionActivity$eOL9H5EA0K_dxEim0zfLxxQa34 */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    PermissionActivity.this.m236277b(dialogInterface, i);
                }
            }, (int) R.string.View_G_Settings, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.common.permission.$$Lambda$PermissionActivity$qGvbSkMYBcvLqMl311S8n98aUQ */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    PermissionActivity.this.m236272a((PermissionActivity) dialogInterface, (DialogInterface) i);
                }
            }, false);
        } else {
            aVar.mo176924c(str).subscribe(new Consumer() {
                /* class com.ss.android.vc.common.permission.$$Lambda$PermissionActivity$PH2RYzhzYeVCaTu4GmJHgAbrojg */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PermissionActivity.this.m236274a((PermissionActivity) ((Boolean) obj));
                }
            });
        }
    }

    /* renamed from: a */
    public static void m236271a(Context context, String str, String str2, String str3, AbstractC60798c cVar) {
        Intent intent = new Intent(context, PermissionActivity.class);
        intent.putExtra("EXTRA_PERMISSION_NAME", str);
        intent.putExtra("EXTRA_PERMISSION_TITLE", str2);
        intent.putExtra("EXTRA_PERMISSION_DES", str3);
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        f152003a = cVar;
        context.startActivity(intent);
    }
}
