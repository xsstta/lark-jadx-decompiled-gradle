package com.ss.android.lark.calendar.impl.features.calendars;

import android.content.Context;
import android.content.Intent;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.calendar.impl.features.calendars.detail.CalendarDetailActivity;
import com.ss.android.lark.calendar.impl.features.calendars.detail.fragment.CalendarDetailFragment;
import com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.CalendarEditFragment;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0007J&\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0007J@\u0010\u0016\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\u0019\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/CalendarLauncher;", "", "()V", "ACTION_TYPE_CREATE", "", "ACTION_TYPE_DETAIL", "FIRST_FRAGMENT_OPEN_ANIM_HORIZONTAL", "FIRST_FRAGMENT_OPEN_ANIM_NONE", "FIRST_FRAGMENT_OPEN_ANIM_VERTICAL", "FROM_LINK", "FROM_QR_CODE", "KEY_CALENDAR_ACTION_TYPE", "buildCalendarDetailIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "calServerId", "from", "shareToken", "firstFragmentOpenAnim", "buildCreateCalendarIntent", "summary", "startCalendarDetail", "", ShareHitPoint.f121868c, "startCreateCalendar", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.a */
public final class CalendarLauncher {

    /* renamed from: a */
    public static final CalendarLauncher f75589a = new CalendarLauncher();

    @JvmStatic
    /* renamed from: b */
    public static final boolean m112282b(Context context, String str) {
        return m112284b(context, str, null, null, null, 28, null);
    }

    private CalendarLauncher() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m112281a(Context context, String str) {
        if (context == null) {
            return false;
        }
        Intent a = m112278a(context, str, (String) null, 4, (Object) null);
        if (UIUtils.getActivityFromContext(context) == null) {
            a.addFlags(268435456);
        }
        context.startActivity(a);
        return true;
    }

    @JvmStatic
    /* renamed from: a */
    public static final Intent m112277a(Context context, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str2, "firstFragmentOpenAnim");
        Intent putExtras = new Intent(context, CalendarDetailActivity.class).putExtra("KEY_CALENDAR_ACTION_TYPE", "ACTION_TYPE_CREATE").putExtras(CalendarEditFragment.f75779c.mo109351a(str, str2));
        Intrinsics.checkExpressionValueIsNotNull(putExtras, "Intent(\n            cont…, firstFragmentOpenAnim))");
        return putExtras;
    }

    /* renamed from: a */
    public static /* synthetic */ Intent m112278a(Context context, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = "FIRST_FRAGMENT_OPEN_ANIM_HORIZONTAL";
        }
        return m112277a(context, str, str2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Intent m112279a(Context context, String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "calServerId");
        Intrinsics.checkParameterIsNotNull(str4, "firstFragmentOpenAnim");
        Intent putExtras = new Intent(context, CalendarDetailActivity.class).putExtra("KEY_CALENDAR_ACTION_TYPE", "ACTION_TYPE_DETAIL").putExtras(CalendarDetailFragment.f75662b.mo109254a(str, str2, str3, str4));
        Intrinsics.checkExpressionValueIsNotNull(putExtras, "Intent(\n            cont…m\n            )\n        )");
        return putExtras;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r1 != false) goto L_0x004b;
     */
    @kotlin.jvm.JvmStatic
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m112283b(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r0 = 0
            if (r10 == 0) goto L_0x004b
            r1 = r11
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 1
            if (r1 == 0) goto L_0x0012
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            if (r1 == 0) goto L_0x0027
            r1 = r14
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 0
            goto L_0x0024
        L_0x0023:
            r1 = 1
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x004b
        L_0x0027:
            if (r11 == 0) goto L_0x002b
            r4 = r11
            goto L_0x002e
        L_0x002b:
            java.lang.String r0 = ""
            r4 = r0
        L_0x002e:
            r7 = 0
            r8 = 16
            r9 = 0
            r3 = r10
            r5 = r12
            r6 = r14
            android.content.Intent r12 = m112280a(r3, r4, r5, r6, r7, r8, r9)
            android.app.Activity r14 = com.larksuite.framework.utils.UIUtils.getActivityFromContext(r10)
            if (r14 != 0) goto L_0x0044
            r14 = 268435456(0x10000000, float:2.5243549E-29)
            r12.addFlags(r14)
        L_0x0044:
            r10.startActivity(r12)
            com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32502i.m124380b(r11, r13)
            return r2
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.CalendarLauncher.m112283b(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m112284b(Context context, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        return m112283b(context, str, str2, str3, str4);
    }

    /* renamed from: a */
    public static /* synthetic */ Intent m112280a(Context context, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = "FIRST_FRAGMENT_OPEN_ANIM_NONE";
        }
        return m112279a(context, str, str2, str3, str4);
    }
}
