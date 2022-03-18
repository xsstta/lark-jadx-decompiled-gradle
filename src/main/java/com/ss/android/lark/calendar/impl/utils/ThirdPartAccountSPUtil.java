package com.ss.android.lark.calendar.impl.utils;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042(\u0010\u0005\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n0\u0006H\u0007J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\bJ*\u0010\r\u001a\u00020\u00042\"\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/ThirdPartAccountSPUtil;", "", "()V", "getGoogleCalendarVisibleMap", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "resetGoogleCalendarVisible", "account", "saveGoogleCalendarVisibleMap", "googleCalAccSetting", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.ak */
public final class ThirdPartAccountSPUtil {

    /* renamed from: a */
    public static final ThirdPartAccountSPUtil f83748a = new ThirdPartAccountSPUtil();

    private ThirdPartAccountSPUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m125202a(IGetDataCallback<HashMap<String, Boolean>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        CalendarSDKService.f83473a.mo118962d(iGetDataCallback);
    }

    /* renamed from: a */
    public final void mo120317a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "account");
        HashMap<String, Boolean> hashMap = new HashMap<>();
        hashMap.put(str, true);
        CalendarSDKService.f83473a.mo118945a(hashMap);
    }

    /* renamed from: a */
    public final void mo120318a(HashMap<String, Boolean> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "googleCalAccSetting");
        CalendarSDKService.f83473a.mo118945a(hashMap);
    }
}
