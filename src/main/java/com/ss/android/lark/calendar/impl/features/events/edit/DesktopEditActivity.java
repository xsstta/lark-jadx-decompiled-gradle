package com.ss.android.lark.calendar.impl.features.events.edit;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/DesktopEditActivity;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditActivity;", "()V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DesktopEditActivity extends EditActivity {

    /* renamed from: c */
    private HashMap f79824c;

    /* renamed from: a */
    public Context mo114269a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo114263a() {
        return super.getResources();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity, com.ss.android.lark.calendar.impl.features.events.edit.EditActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f79824c == null) {
            this.f79824c = new HashMap();
        }
        View view = (View) this.f79824c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79824c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo114270a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m118486a(this, context);
    }

    /* renamed from: b */
    public void mo114265b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo114266c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m118484a(this, configuration);
    }

    public AssetManager getAssets() {
        return m118488c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m118485a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.calendar.impl.features.events.edit.EditActivity
    public void onStop() {
        m118487b(this);
    }

    /* renamed from: a */
    public static Resources m118485a(DesktopEditActivity desktopEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(desktopEditActivity);
        }
        return desktopEditActivity.mo114263a();
    }

    /* renamed from: c */
    public static AssetManager m118488c(DesktopEditActivity desktopEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(desktopEditActivity);
        }
        return desktopEditActivity.mo114266c();
    }

    /* renamed from: b */
    public static void m118487b(DesktopEditActivity desktopEditActivity) {
        desktopEditActivity.mo114265b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DesktopEditActivity desktopEditActivity2 = desktopEditActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    desktopEditActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m118486a(DesktopEditActivity desktopEditActivity, Context context) {
        desktopEditActivity.mo114270a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(desktopEditActivity);
        }
    }

    /* renamed from: a */
    public static Context m118484a(DesktopEditActivity desktopEditActivity, Configuration configuration) {
        Context a = desktopEditActivity.mo114269a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
