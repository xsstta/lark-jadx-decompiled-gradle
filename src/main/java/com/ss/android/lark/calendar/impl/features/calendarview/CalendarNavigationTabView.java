package com.ss.android.lark.calendar.impl.features.calendarview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.tab.NavigationTabItemView;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarNavigationTabView;", "Lcom/ss/android/lark/widget/tab/NavigationTabItemView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getTabResId", "day", "initView", "", "setCalendarDay", "setCalendarDayByViewTimeZone", "currentDate", "Ljava/util/Date;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarNavigationTabView extends NavigationTabItemView {

    /* renamed from: a */
    public static final Companion f76776a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarNavigationTabView$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.CalendarNavigationTabView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m113949a() {
        setTabTitle(C32634ae.m125182b(R.string.Lark_Legacy_CalendarTab));
        int b = m113950b(C26279i.m95147a(new Date()));
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        setTabIcon(UDIconUtils.getIconDrawable(context, b, UDColorUtils.getColor(context2, R.color.ud_O500)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CalendarNavigationTabView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setCalendarDayByViewTimeZone(Date date) {
        Intrinsics.checkParameterIsNotNull(date, "currentDate");
        setCalendarDay(new CalendarDate(date, C30022a.f74884c.mo108456c().getSafeMobileNormalViewTimezone()).getMonthDay());
    }

    /* renamed from: b */
    private final int m113950b(int i) {
        String str = "ud_icon_calendar_" + i + "_filled";
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Resources resources = context.getResources();
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        return resources.getIdentifier(str, "drawable", context2.getPackageName());
    }

    public final void setCalendarDay(int i) {
        if (i <= 0 || i > 31) {
            Log.m165389i("CalendarNavigationTabView", C32673y.m125378d("[setCalendarDay]day:" + i + " Illegal day!"));
            return;
        }
        int b = m113950b(i);
        if (b == 0) {
            Log.m165389i("CalendarNavigationTabView", C32673y.m125378d("[setCalendarDay]day:" + i + " not found resource."));
            return;
        }
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        setTabIcon(UDIconUtils.getIconDrawable(context, b, UDColorUtils.getColor(context2, R.color.ud_O500)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CalendarNavigationTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarNavigationTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m113949a();
    }
}
