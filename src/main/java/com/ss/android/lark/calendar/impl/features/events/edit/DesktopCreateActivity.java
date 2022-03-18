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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/DesktopCreateActivity;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditActivity;", "()V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DesktopCreateActivity extends EditActivity {

    /* renamed from: c */
    private HashMap f79823c;

    /* renamed from: a */
    public Context mo114262a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo114263a() {
        return super.getResources();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity, com.ss.android.lark.calendar.impl.features.events.edit.EditActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f79823c == null) {
            this.f79823c = new HashMap();
        }
        View view = (View) this.f79823c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79823c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo114264a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m118475a(this, context);
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
        return m118473a(this, configuration);
    }

    public AssetManager getAssets() {
        return m118477c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m118474a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.calendar.impl.features.events.edit.EditActivity
    public void onStop() {
        m118476b(this);
    }

    /* renamed from: a */
    public static Resources m118474a(DesktopCreateActivity desktopCreateActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(desktopCreateActivity);
        }
        return desktopCreateActivity.mo114263a();
    }

    /* renamed from: c */
    public static AssetManager m118477c(DesktopCreateActivity desktopCreateActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(desktopCreateActivity);
        }
        return desktopCreateActivity.mo114266c();
    }

    /* renamed from: b */
    public static void m118476b(DesktopCreateActivity desktopCreateActivity) {
        desktopCreateActivity.mo114265b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DesktopCreateActivity desktopCreateActivity2 = desktopCreateActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    desktopCreateActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m118475a(DesktopCreateActivity desktopCreateActivity, Context context) {
        desktopCreateActivity.mo114264a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(desktopCreateActivity);
        }
    }

    /* renamed from: a */
    public static Context m118473a(DesktopCreateActivity desktopCreateActivity, Configuration configuration) {
        Context a = desktopCreateActivity.mo114262a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
