package com.ss.android.lark.calendar.impl.framework.calendarmvp;

import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender.IViewData;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0017J\b\u0010\u0007\u001a\u00020\u0006H\u0017¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BaseModelCalendar;", "ViewData", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "()V", "create", "", "destroy", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.b.a */
public abstract class BaseModelCalendar<ViewData extends IViewCalender.IViewData> implements IModelCalendar<ViewData> {
    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }
}
