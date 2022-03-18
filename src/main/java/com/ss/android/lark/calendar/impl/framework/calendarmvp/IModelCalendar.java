package com.ss.android.lark.calendar.impl.framework.calendarmvp;

import com.larksuite.framework.mvp.ILifecycle;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender.IViewData;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\r\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "ViewData", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "Lcom/larksuite/framework/mvp/ILifecycle;", "getViewData", "()Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.b.d */
public interface IModelCalendar<ViewData extends IViewCalender.IViewData> extends ILifecycle {
    /* renamed from: f */
    ViewData mo109793f();
}
