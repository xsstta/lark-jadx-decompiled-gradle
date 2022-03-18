package com.ss.android.lark.calendar.impl.utils;

import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30034ad;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/CalendarApkUtil;", "", "()V", "getApkVersion", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.a */
public final class CalendarApkUtil {

    /* renamed from: a */
    public static final CalendarApkUtil f83718a = new CalendarApkUtil();

    private CalendarApkUtil() {
    }

    /* renamed from: a */
    public final int mo120293a() {
        AbstractC30034ad adVar = C30022a.f74882a.settingDependency();
        Intrinsics.checkExpressionValueIsNotNull(adVar, "CalendarDependencyHolder…dency.settingDependency()");
        String a = C26246a.m94977a(adVar.mo108177a());
        Intrinsics.checkExpressionValueIsNotNull(a, "apkVersion");
        List split$default = StringsKt.split$default((CharSequence) a, new String[]{"."}, false, 0, 6, (Object) null);
        try {
            return (Integer.parseInt((String) split$default.get(0)) * 100) + Integer.parseInt((String) split$default.get(1));
        } catch (Exception unused) {
            return -1;
        }
    }
}
