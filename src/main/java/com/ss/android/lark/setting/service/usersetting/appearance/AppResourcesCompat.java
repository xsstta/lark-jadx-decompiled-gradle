package com.ss.android.lark.setting.service.usersetting.appearance;

import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002J\f\u0010\u0011\u001a\u00020\u000f*\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/setting/service/usersetting/appearance/AppResourcesCompat;", "", "()V", "IMPL", "Lcom/ss/android/lark/setting/service/usersetting/appearance/AppResourcesCompat$BaseAppResourcesCompatImpl;", "TAG", "", "replaceApplicationResources", "", "application", "Landroid/app/Application;", "updateConfiguration", "newConfig", "Landroid/content/res/Configuration;", "isDynamicResources", "", "Landroid/content/res/Resources;", "isMiraResourcesWrapper", "BaseAppResourcesCompatImpl", "HwResourcesCompatImpl", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.service.usersetting.appearance.a */
public final class AppResourcesCompat {

    /* renamed from: a */
    public static final AppResourcesCompat f135037a = new AppResourcesCompat();

    /* renamed from: b */
    private static final BaseAppResourcesCompatImpl f135038b = new BaseAppResourcesCompatImpl();

    private AppResourcesCompat() {
    }

    /* renamed from: a */
    public final void mo186674a(Application application) {
        Intrinsics.checkParameterIsNotNull(application, "application");
        f135038b.mo186676a(application);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/setting/service/usersetting/appearance/AppResourcesCompat$BaseAppResourcesCompatImpl;", "", "()V", "replaceApplicationResources", "", "application", "Landroid/app/Application;", "updateConfiguration", "newConfig", "Landroid/content/res/Configuration;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.usersetting.appearance.a$a */
    public static class BaseAppResourcesCompatImpl {
        /* renamed from: a */
        public void mo186676a(Application application) {
            Intrinsics.checkParameterIsNotNull(application, "application");
        }

        /* renamed from: a */
        public void mo186677a(Application application, Configuration configuration) {
            Intrinsics.checkParameterIsNotNull(application, "application");
            Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
            Resources resources = application.getResources();
            Resources resources2 = application.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources2, "application.resources");
            resources.updateConfiguration(configuration, resources2.getDisplayMetrics());
        }
    }

    /* renamed from: a */
    public final void mo186675a(Application application, Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(application, "application");
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        f135038b.mo186677a(application, configuration);
    }
}
