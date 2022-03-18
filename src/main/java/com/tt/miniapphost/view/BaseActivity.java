package com.tt.miniapphost.view;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.tt.miniapphost.p3370d.AbstractC67477a;
import com.tt.miniapphost.p3370d.C67478b;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.miniapphost.util.C67584b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;

public abstract class BaseActivity extends BaseFragmentActivity implements AbstractC67477a {
    private boolean hasSyncLocaleConfig;

    public AssetManager getAssets() {
        C67584b.m263043a(this, super.getAssets());
        return super.getAssets();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        C67584b.m263043a(this, super.getAssets());
        return super.getResources();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C67479c.m262467a().mo234229b(this);
    }

    public Context getApplicationContext() {
        C67584b.m263043a(super.getApplicationContext(), super.getApplicationContext().getAssets());
        return super.getApplicationContext();
    }

    @Override // com.tt.miniapphost.p3370d.AbstractC67477a
    public void onLanguageChange() {
        AppBrandLogger.m52828d("BaseActivity", "onLanguageChange");
        C67478b.m262465a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        super.onStart();
        if (!this.hasSyncLocaleConfig) {
            this.hasSyncLocaleConfig = true;
            C67479c.m262467a().mo234232e();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C67478b.m262465a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        C67592a.m263092a(this);
        super.onCreate(bundle);
        C67478b.m262465a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapphost.view.BaseActivity$a */
    public static class C67592a {
        /* renamed from: a */
        public static void m263092a(Activity activity) {
            if (Build.VERSION.SDK_INT >= 26 && activity.getApplicationInfo().targetSdkVersion > 26 && m263094c(activity)) {
                m263093b(activity);
            }
        }

        /* renamed from: b */
        private static void m263093b(Activity activity) {
            try {
                Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
                declaredField.setAccessible(true);
                ((ActivityInfo) declaredField.get(activity)).screenOrientation = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: c */
        private static boolean m263094c(Activity activity) {
            try {
                Field declaredField = Class.forName("com.android.internal.R$styleable").getDeclaredField("Window");
                declaredField.setAccessible(true);
                TypedArray obtainStyledAttributes = activity.obtainStyledAttributes((int[]) declaredField.get(null));
                Method declaredMethod = ActivityInfo.class.getDeclaredMethod("isTranslucentOrFloating", TypedArray.class);
                declaredMethod.setAccessible(true);
                return ((Boolean) declaredMethod.invoke(null, obtainStyledAttributes)).booleanValue();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            super.attachBaseContext(updateResourcesAfterN(context));
        } else {
            super.attachBaseContext(context);
        }
        C67584b.m263043a(this, super.getAssets());
        C67479c.m262467a().mo234226a((AbstractC67477a) this);
    }

    private Context updateResourcesAfterN(Context context) {
        Resources resources = context.getResources();
        Locale b = C67479c.m262467a().mo234228b();
        if (b == null) {
            return context;
        }
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(b);
        configuration.setLocales(new LocaleList(b));
        return context.createConfigurationContext(configuration);
    }
}
