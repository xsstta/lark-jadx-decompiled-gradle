package com.ss.android.lark.thirdshare.base.export;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.utils.aj;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001c\u0010\u0010\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/thirdshare/base/export/TsActivity;", "Landroid/app/Activity;", "()V", "getApplicationContext", "Landroid/content/Context;", "getPackageManager", "Landroid/content/pm/PackageManager;", "getPackageName", "", "getResources", "Landroid/content/res/Resources;", "sendBroadcast", "", "intent", "Landroid/content/Intent;", "receiverPermission", "startActivity", "options", "Landroid/os/Bundle;", "Companion", "components_third-share_base_export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TsActivity extends Activity {

    /* renamed from: a */
    public static final Companion f137389a = new Companion(null);

    /* renamed from: a */
    public void mo189801a() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m215750a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/thirdshare/base/export/TsActivity$Companion;", "", "()V", "TAG", "", "getActivitiesByReflect", "", "Landroid/app/Activity;", "getActivityThread", "getActivityThreadInActivityThreadStaticField", "getActivityThreadInActivityThreadStaticMethod", "getTsActivity", "components_third-share_base_export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.thirdshare.base.export.TsActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Context getApplicationContext() {
        Application a = aj.m224263a();
        Intrinsics.checkExpressionValueIsNotNull(a, "Utils.getApp()");
        return a;
    }

    public PackageManager getPackageManager() {
        Application a = aj.m224263a();
        Intrinsics.checkExpressionValueIsNotNull(a, "Utils.getApp()");
        PackageManager packageManager = a.getPackageManager();
        Intrinsics.checkExpressionValueIsNotNull(packageManager, "Utils.getApp().packageManager");
        return packageManager;
    }

    public String getPackageName() {
        Application a = aj.m224263a();
        Intrinsics.checkExpressionValueIsNotNull(a, "Utils.getApp()");
        String packageName = a.getPackageName();
        Intrinsics.checkExpressionValueIsNotNull(packageName, "Utils.getApp().packageName");
        return packageName;
    }

    public Resources getResources() {
        Application a = aj.m224263a();
        Intrinsics.checkExpressionValueIsNotNull(a, "Utils.getApp()");
        Resources resources = a.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "Utils.getApp().resources");
        return resources;
    }

    public void sendBroadcast(Intent intent) {
        aj.m224263a().sendBroadcast(intent);
    }

    public void startActivity(Intent intent) {
        if (intent != null) {
            intent.addFlags(268435456);
        }
        aj.m224263a().startActivity(intent);
    }

    /* renamed from: a */
    public static void m215750a(TsActivity tsActivity) {
        tsActivity.mo189801a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TsActivity tsActivity2 = tsActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    tsActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void sendBroadcast(Intent intent, String str) {
        aj.m224263a().sendBroadcast(intent, str);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        if (intent != null) {
            intent.addFlags(268435456);
        }
        aj.m224263a().startActivity(intent, bundle);
    }
}
