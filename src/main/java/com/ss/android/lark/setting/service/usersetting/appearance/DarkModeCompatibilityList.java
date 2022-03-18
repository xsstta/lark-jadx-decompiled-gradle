package com.ss.android.lark.setting.service.usersetting.appearance;

import android.os.Build;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.log.Log;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/setting/service/usersetting/appearance/DarkModeCompatibilityList;", "", "()V", "TAG", "", "_isDeviceCompatibleWithDarkMode", "", "get_isDeviceCompatibleWithDarkMode", "()Z", "_isDeviceCompatibleWithDarkMode$delegate", "Lkotlin/Lazy;", "isBelowMiuiV12_5", "isDeviceCompatibleWithDarkMode", "SystemProperties", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.service.usersetting.appearance.b */
public final class DarkModeCompatibilityList {

    /* renamed from: a */
    public static final DarkModeCompatibilityList f135039a = new DarkModeCompatibilityList();

    /* renamed from: b */
    private static final Lazy f135040b = LazyKt.lazy(C54650b.INSTANCE);

    /* renamed from: c */
    private final boolean m212137c() {
        return ((Boolean) f135040b.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/setting/service/usersetting/appearance/DarkModeCompatibilityList$SystemProperties;", "", "()V", "get", "", "key", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.usersetting.appearance.b$a */
    public static final class SystemProperties {

        /* renamed from: a */
        public static final SystemProperties f135041a = new SystemProperties();

        private SystemProperties() {
        }

        /* renamed from: a */
        public final String mo186680a(String str) {
            try {
                Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
                if (invoke != null) {
                    return (String) invoke;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            } catch (Exception e) {
                Log.m165384e("DarkModeCompatibilityList", "get error() ", e);
                return "";
            }
        }
    }

    private DarkModeCompatibilityList() {
    }

    /* renamed from: a */
    public final boolean mo186678a() {
        return m212137c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.usersetting.appearance.b$b */
    static final class C54650b extends Lambda implements Function0<Boolean> {
        public static final C54650b INSTANCE = new C54650b();

        C54650b() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            if (Build.VERSION.SDK_INT != 30 || !RomUtils.m94944c() || !DarkModeCompatibilityList.f135039a.mo186679b()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo186679b() {
        String a = SystemProperties.f135041a.mo186680a("ro.miui.ui.version.name");
        Log.m165389i("DarkModeCompatibilityList", "miuiVersion = " + a);
        if ("V125".compareTo(a) > 0) {
            return true;
        }
        return false;
    }
}
