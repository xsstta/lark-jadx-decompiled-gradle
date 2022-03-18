package com.ss.android.lark.photoeditor.impl.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import io.reactivex.functions.Consumer;

public class PhotoEditorActivity extends BaseFragmentActivity {

    /* renamed from: a */
    C51443b f127983a;

    /* renamed from: a */
    public Context mo177096a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo177098a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m199380a(this, context);
    }

    /* renamed from: b */
    public Resources mo177099b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo177100c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m199378a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo177102d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m199382c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m199379a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m199381b(this);
    }

    /* renamed from: e */
    private boolean m199383e() {
        if (TextUtils.isEmpty(getIntent().getStringExtra("key_image_url"))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(new int[]{0, 0});
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(new int[]{0, 0});
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (DesktopUtil.m144301a((Context) this)) {
            super.onBackPressed();
            return;
        }
        C51443b bVar = this.f127983a;
        if (bVar != null) {
            bVar.mo177119a();
        }
    }

    /* renamed from: a */
    public void mo177097a() {
        C51443b bVar = new C51443b();
        this.f127983a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f127983a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m199379a(PhotoEditorActivity photoEditorActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(photoEditorActivity);
        }
        return photoEditorActivity.mo177099b();
    }

    /* renamed from: c */
    public static AssetManager m199382c(PhotoEditorActivity photoEditorActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(photoEditorActivity);
        }
        return photoEditorActivity.mo177102d();
    }

    /* renamed from: b */
    public static void m199381b(PhotoEditorActivity photoEditorActivity) {
        photoEditorActivity.mo177100c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PhotoEditorActivity photoEditorActivity2 = photoEditorActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    photoEditorActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_photo_editor);
        if (!m199383e()) {
            finish();
            return;
        }
        C51331a aVar = new C51331a(this);
        if (aVar.mo176921a("android.permission.WRITE_EXTERNAL_STORAGE")) {
            mo177097a();
        } else {
            aVar.mo176924c("android.permission.WRITE_EXTERNAL_STORAGE").subscribe(new Consumer<Boolean>() {
                /* class com.ss.android.lark.photoeditor.impl.ui.PhotoEditorActivity.C514371 */

                /* renamed from: a */
                public void accept(Boolean bool) throws Exception {
                    if (bool.booleanValue()) {
                        PhotoEditorActivity.this.mo177097a();
                    } else {
                        PhotoEditorActivity.this.finish();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m199380a(PhotoEditorActivity photoEditorActivity, Context context) {
        photoEditorActivity.mo177098a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(photoEditorActivity);
        }
    }

    /* renamed from: a */
    public static Context m199378a(PhotoEditorActivity photoEditorActivity, Configuration configuration) {
        Context a = photoEditorActivity.mo177096a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C51443b bVar = this.f127983a;
        if (bVar != null) {
            bVar.onActivityResult(i, i2, intent);
        }
    }
}
