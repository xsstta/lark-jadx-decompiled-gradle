package com.ss.android.lark.calendar.impl.features.calendarview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarViewMainFragment;
import com.ss.android.lark.calendar.impl.features.calendarview.main.fragments.CalendarShellViewFragment;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarMainLauncher;", "", "()V", "APP_LINK_VIEW_DATE", "", "APP_LINK_VIEW_TYPE", "APP_LINK_VIEW_TYPE_DAY", "APP_LINK_VIEW_TYPE_LIST", "APP_LINK_VIEW_TYPE_MEETING", "APP_LINK_VIEW_TYPE_MONTH", "APP_LINK_VIEW_TYPE_THREE_DAY", "CAL_TAB_PAGE_FROM", "FROM_APP_LINK", "FROM_EVENT_SEARCH", "getFromAppLinkBundle", "Landroid/os/Bundle;", ShareHitPoint.f121869d, "date", "getFromSearchBundle", "newInstance", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "context", "Landroid/content/Context;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.c */
public final class CalendarMainLauncher {

    /* renamed from: a */
    public static final CalendarMainLauncher f76830a = new CalendarMainLauncher();

    private CalendarMainLauncher() {
    }

    /* renamed from: a */
    public final Bundle mo110724a() {
        Bundle bundle = new Bundle();
        bundle.putString("cal_tab_page_from", "from_event_search");
        return bundle;
    }

    static {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(RunnableC306661.f76831a);
    }

    /* renamed from: a */
    public final BaseFragment mo110726a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (C30022a.f74883b.mo112690D()) {
            return new CalendarShellViewFragment();
        }
        CalendarViewMainFragment a = CalendarViewMainFragment.f77884d.mo111961a(context);
        Activity activityFromContext = UIUtils.getActivityFromContext(context);
        if (activityFromContext != null) {
            a.mo111957b(activityFromContext);
        }
        return a;
    }

    /* renamed from: a */
    public final Bundle mo110725a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str2, "date");
        Bundle bundle = new Bundle();
        bundle.putString("cal_tab_page_from", "from_app_link");
        bundle.putString("view_type", str);
        bundle.putString("view_date", str2);
        return bundle;
    }
}
