package com.ss.android.lark.calendar.impl.framework.calendarmvp;

import com.larksuite.framework.mvp.ILifecycle;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender.IViewAction;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender.IViewData;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005:\u0002\u000b\fJ\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0002\u0010\n¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "ViewData", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "ViewAction", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "Lcom/larksuite/framework/mvp/ILifecycle;", "setDependency", "", "vi", "vo", "(Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;)V", "IViewAction", "IViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.b.f */
public interface IViewCalender<ViewData extends IViewData, ViewAction extends IViewAction> extends ILifecycle {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.framework.b.f$a */
    public interface IViewAction {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.framework.b.f$b */
    public interface IViewData {
    }

    /* renamed from: a */
    void mo109795a(ViewData viewdata, ViewAction viewaction);
}
