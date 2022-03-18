package com.ss.android.lark.mine.impl.custom_status;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.C1259g;
import androidx.navigation.C1269k;
import androidx.navigation.fragment.NavHostFragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/UserCustomStatusActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UserCustomStatusActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f115049a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m180533a(Context context) {
        f115049a.mo160383b(context);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m180534a(Context context, int i) {
        f115049a.mo160382a(context, i);
    }

    /* renamed from: a */
    public Context mo160374a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo160375a() {
        return super.getResources();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m180535a(this, context);
    }

    /* renamed from: b */
    public void mo160376b() {
        super.onStop();
    }

    /* renamed from: b */
    public void mo160377b(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public AssetManager mo160378c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m180531a(this, configuration);
    }

    public AssetManager getAssets() {
        return m180537c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m180532a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m180536b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/UserCustomStatusActivity$Companion;", "", "()V", "DESTINATION_HOME", "", "DESTINATION_SETTING", "DESTINATION_UNDEFINED", "KEY_DESTINATION", "", "TAG", "startHomePage", "", "context", "Landroid/content/Context;", "startHomePageForResult", "requestCode", "startPage", "destination", "startSettingPage", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.UserCustomStatusActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo160381a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            m180543b(context, 0);
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo160383b(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            m180543b(context, 1);
        }

        /* renamed from: b */
        private final void m180543b(Context context, int i) {
            Intent intent = new Intent(context, UserCustomStatusActivity.class);
            intent.putExtra("destination", i);
            context.startActivity(intent);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo160382a(Context context, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intent intent = new Intent(context, UserCustomStatusActivity.class);
            intent.putExtra("destination", 0);
            ((Activity) context).startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public static Resources m180532a(UserCustomStatusActivity userCustomStatusActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(userCustomStatusActivity);
        }
        return userCustomStatusActivity.mo160375a();
    }

    /* renamed from: c */
    public static AssetManager m180537c(UserCustomStatusActivity userCustomStatusActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(userCustomStatusActivity);
        }
        return userCustomStatusActivity.mo160378c();
    }

    /* renamed from: b */
    public static void m180536b(UserCustomStatusActivity userCustomStatusActivity) {
        userCustomStatusActivity.mo160376b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            UserCustomStatusActivity userCustomStatusActivity2 = userCustomStatusActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    userCustomStatusActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.activity_user_custom_status);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.custom_status_nav_host);
        if (findFragmentById != null) {
            C1259g a = ((NavHostFragment) findFragmentById).mo6307a();
            Intrinsics.checkExpressionValueIsNotNull(a, "navHostFragment.navController");
            C1269k a2 = a.mo6339c().mo6381a(R.navigation.custom_status_home_page_nav_graph);
            Intrinsics.checkExpressionValueIsNotNull(a2, "navController.navInflate…atus_home_page_nav_graph)");
            int intExtra = getIntent().getIntExtra("destination", -1);
            if (intExtra == 0) {
                i = R.id.customStatusFragment;
            } else if (intExtra != 1) {
                Log.m165383e("CustomStatusActivity", "get unexpected destination");
                return;
            } else {
                i = R.id.customStatusSettingFragment;
            }
            a2.mo6373d(i);
            a.mo6330a(a2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
    }

    /* renamed from: a */
    public static Context m180531a(UserCustomStatusActivity userCustomStatusActivity, Configuration configuration) {
        Context a = userCustomStatusActivity.mo160374a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m180535a(UserCustomStatusActivity userCustomStatusActivity, Context context) {
        userCustomStatusActivity.mo160377b(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(userCustomStatusActivity);
        }
    }
}
