package com.ss.android.lark.base.fragment;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.graphics.C0768a;
import com.larksuite.component.air.AirActivity;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.ZoomLevel;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.utils.C26254af;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.C29517a;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.watermark.IWatermarkable;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.slideback.SlideHelper;
import com.ss.android.lark.util.share_preference.C57744a;
import java.lang.reflect.Field;

public abstract class BaseFragmentActivity extends AirActivity implements IWatermarkable {
    public String TAG;
    private boolean enableColorNavigationBar = true;
    private boolean isShowBlackOnWhiteStatusBar = true;
    protected Bundle mBundle;
    protected CallbackManager mCallbackManager = new CallbackManager();
    private SlideHelper mSlideHelper;
    public boolean useDefaultAnimation = true;

    /* access modifiers changed from: protected */
    public void disableBlackStatusBarBeforeOnCreate() {
        this.isShowBlackOnWhiteStatusBar = false;
    }

    /* access modifiers changed from: protected */
    public void disableColorNavigationBarBeforeOnCreate() {
        this.enableColorNavigationBar = false;
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public boolean enableGlobalWatermark() {
        return true;
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public int getWatermarkMode() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean isNeedLoginStatus() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean isSlideEnable() {
        return false;
    }

    /* access modifiers changed from: protected */
    public CallbackManager getCallbackManager() {
        return this.mCallbackManager;
    }

    /* access modifiers changed from: protected */
    public boolean isDoAnimationWithDefault() {
        return this.useDefaultAnimation;
    }

    static {
        AppCompatDelegate.m728a(true);
    }

    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_IN);
    }

    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_OUT);
    }

    private void initStatusBarColor() {
        if (this.isShowBlackOnWhiteStatusBar) {
            setStatusBarColorResource(R.color.bg_body);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        this.mCallbackManager.cancelCallbacks();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onPause() {
        super.onPause();
        C29517a.AbstractC29518a a = C29517a.m108723a();
        if (a != null) {
            a.mo102790b(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        C29517a.AbstractC29518a a = C29517a.m108723a();
        if (a != null) {
            a.mo102786a((Activity) this);
        }
    }

    public void finish() {
        super.finish();
        if (isDoAnimationWithDefault()) {
            ActivityAnimationManager.doAnimationWithDefault(this, getExitAnimationConfig(), new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_LEFT_OUT));
        }
    }

    public Intent getIntent() {
        C29517a.AbstractC29518a a = C29517a.m108723a();
        Intent intent = super.getIntent();
        if (a != null) {
            intent = a.mo102785a(super.getIntent());
        }
        setIntent(intent);
        return intent;
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if (isActivityRunning(this)) {
            try {
                super.onBackPressed();
            } catch (IllegalStateException e) {
                e.printStackTrace();
                finishAfterTransition();
            }
        }
    }

    private void setupTransition() {
        getWindow().requestFeature(13);
        if (getIntent().getBooleanExtra("transition", false)) {
            this.useDefaultAnimation = false;
            ActivityAnimationManager.doAnimationWithDefault(this, new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD), null);
        }
    }

    private void initNavigationBarColor() {
        if (this.enableColorNavigationBar && Build.VERSION.SDK_INT >= 26) {
            int color = UIUtils.getColor(this, R.color.bg_body);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().clearFlags(134217728);
            getWindow().setNavigationBarColor(color);
            double b = C0768a.m3714b(-1, color);
            View decorView = getWindow().getDecorView();
            if (b <= 3.0d) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            } else {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -17);
            }
        }
    }

    private void initWindow() {
        if (Build.VERSION.SDK_INT > 23 && ((ViewGroup) getWindow().findViewById(16908290)) == null) {
            StringBuilder sb = new StringBuilder("start fix find contentParent by id npe\n");
            try {
                Window window = getWindow();
                Field a = C26254af.m95001a(Class.forName("com.android.internal.policy.PhoneWindow"), "mContentParent");
                a.setAccessible(true);
                ViewGroup viewGroup = (ViewGroup) a.get(window);
                if (viewGroup != null) {
                    viewGroup.setId(16908290);
                    sb.append("fix success!\n");
                } else {
                    sb.append("contentParent is null\n");
                }
                Log.m165387e("FixContentParentNpe", (Throwable) new Exception(sb.toString()), true);
            } catch (Throwable th) {
                sb.append("fix failed!\n");
                sb.append(th.getMessage());
                Log.m165387e("FixContentParentNpe", (Throwable) new Exception(sb.toString()), true);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    public void setStatusBarByParseColor(int i) {
        setStatusBarColor(i);
    }

    private void saveSystemFontGear(float f) {
        LKUIDisplayManager.m91872a(getSystemFontZoom(f));
    }

    public void setDarkTextStatusBar(int i) {
        C29517a.m108726b().mo102665a(this, i);
    }

    public void setLightTextStatusBar(int i) {
        C29517a.m108726b().mo102666b(this, i);
    }

    public void setStatusBarColorResource(int i) {
        setStatusBarColor(UIUtils.getColor(this, i));
    }

    private static boolean isDebugMode(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.flags & 2;
        applicationInfo.flags = i;
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        setSlideEnable(isSlideEnable());
    }

    private static boolean isActivityRunning(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17) {
            return !activity.isFinishing();
        }
        if (activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    private void setStatusBarColor(int i) {
        if (C0768a.m3714b(-1, i) <= 3.0d) {
            setDarkTextStatusBar(i);
        } else {
            setLightTextStatusBar(i);
        }
    }

    /* access modifiers changed from: protected */
    public Bundle parseArguments(Intent intent) {
        if (intent == null) {
            return Bundle.EMPTY;
        }
        if (intent.getExtras() == null) {
            return Bundle.EMPTY;
        }
        return intent.getExtras();
    }

    /* access modifiers changed from: protected */
    public void setSlideEnable(boolean z) {
        if (z && this.mSlideHelper == null) {
            this.mSlideHelper = new SlideHelper(this);
        }
        SlideHelper jVar = this.mSlideHelper;
        if (jVar != null) {
            jVar.mo187295a(z);
        }
    }

    public void unbindService(ServiceConnection serviceConnection) {
        try {
            super.unbindService(serviceConnection);
        } catch (Exception e) {
            String str = this.TAG;
            if (this.TAG == null) {
                str = "BaseFragmentActivity";
            }
            Log.m165383e(str, e.getMessage());
            e.printStackTrace();
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (Exception e) {
            String str = this.TAG;
            if (this.TAG == null) {
                str = "BaseFragmentActivity";
            }
            Log.m165383e(str, e.getMessage());
            e.printStackTrace();
        }
    }

    private ZoomLevel getSystemFontZoom(float f) {
        ZoomLevel zoomLevel = ZoomLevel.NORMAL;
        ZoomLevel[] values = ZoomLevel.values();
        float f2 = Float.MAX_VALUE;
        for (ZoomLevel zoomLevel2 : values) {
            float abs = Math.abs(f - zoomLevel2.getMultiplier());
            if (abs < f2) {
                zoomLevel = zoomLevel2;
                f2 = abs;
            }
        }
        Log.m165379d("BaseFragmentActivity", "defaultSystemFontZoom is :" + zoomLevel.getMultiplier());
        return zoomLevel;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        boolean z;
        C29517a.AbstractC29518a a = C29517a.m108723a();
        if (a != null) {
            context = a.mo102784a(context);
            z = a.mo102788a();
        } else {
            z = true;
        }
        Configuration configuration = context.getResources().getConfiguration();
        Log.m165379d("BaseFragmentActivity", "now, system font scale is " + configuration.fontScale);
        if (z) {
            C57744a.m224104a().putInt("isSaveSystemFontScaleFlag", 0);
        }
        if (C57744a.m224104a().getInt("isSaveSystemFontScaleFlag") == 0) {
            saveSystemFontGear(configuration.fontScale);
            C57744a.m224104a().putInt("isSaveSystemFontScaleFlag", 1);
        }
        if (Float.compare(configuration.fontScale, 1.0f) == 0 || z) {
            super.attachBaseContext(context);
            return;
        }
        configuration.fontScale = 1.0f;
        super.attachBaseContext(context.createConfigurationContext(configuration));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        if (isDebugMode(getApplicationContext())) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectLeakedSqlLiteObjects().detectLeakedRegistrationObjects().detectActivityLeaks().penaltyLog().build());
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
        }
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        setupTransition();
        super.onCreate(bundle);
        if (isDoAnimationWithDefault() && this.useDefaultAnimation) {
            ActivityAnimationManager.doAnimationWithDefault(this, getEnterAnimationConfig(), new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_IN));
        }
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        this.mBundle = bundle;
        if (bundle == null) {
            this.mBundle = new Bundle();
        }
        if (Build.VERSION.SDK_INT < 26) {
            disableColorNavigationBarBeforeOnCreate();
        }
        initStatusBarColor();
        initNavigationBarColor();
        C29517a.AbstractC29518a a = C29517a.m108723a();
        if (a != null) {
            a.mo102787a(this, isNeedLoginStatus());
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C29517a.AbstractC29518a a = C29517a.m108723a();
        if (a == null || a.mo102789a(this, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return super.onKeyUp(i, keyEvent);
    }
}
