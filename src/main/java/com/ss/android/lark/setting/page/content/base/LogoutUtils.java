package com.ss.android.lark.setting.page.content.base;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.logout.NewLogoutComponent;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/setting/page/content/base/LogoutUtils;", "", "()V", "logoutAllUsers", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/setting/page/content/logout/NewLogoutComponent$SettingLogoutEndContext;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.a.b */
public final class LogoutUtils {

    /* renamed from: a */
    public static final LogoutUtils f134021a = new LogoutUtils();

    private LogoutUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m210180a(IGetDataCallback<NewLogoutComponent.SettingLogoutEndContext> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C54115c.m210080a().mo178302n().mo178354a(iGetDataCallback);
    }
}
