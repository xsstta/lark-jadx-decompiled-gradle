package com.ss.android.lark.calendar.impl.features.calendarview.base;

import com.larksuite.framework.callback.CallbackManager;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IModelCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IPresenterCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender.IViewAction;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender.IViewData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00060\u0005*\b\b\u0002\u0010\u0003*\u00020\u0007*\b\b\u0003\u0010\u0006*\u00020\b2\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00040\tB\r\u0012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0002\u0010\u000bJ\b\u0010\u0019\u001a\u00020\u001aH\u0017J\b\u0010\u001b\u001a\u00020\u001aH\u0017J\r\u0010\u001c\u001a\u00028\u0003H&¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00028\u0001¢\u0006\u0002\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u0004\u0018\u00018\u0001X\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/base/BaseDiagramPresenter;", "M", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "ViewData", "V", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "ViewAction", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IPresenterCalendar;", "model", "(Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;)V", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "getCallbackManager", "()Lcom/larksuite/framework/callback/CallbackManager;", "getModel", "()Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "view", "getView$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "setView$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;)V", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "create", "", "destroy", "getViewAction", "()Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "setView", "v", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.a.a */
public abstract class BaseDiagramPresenter<M extends IModelCalendar<ViewData>, V extends IViewCalender<ViewData, ViewAction>, ViewData extends IViewCalender.IViewData, ViewAction extends IViewCalender.IViewAction> implements IPresenterCalendar<M, V> {

    /* renamed from: a */
    private V f76818a;

    /* renamed from: b */
    private final M f76819b;

    /* renamed from: c */
    private final CallbackManager f76820c = new CallbackManager();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    /* renamed from: o */
    public abstract ViewAction mo110712o();

    /* renamed from: m */
    public final V mo110710m() {
        return this.f76818a;
    }

    /* renamed from: n */
    public final M mo110711n() {
        return this.f76819b;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f76820c.cancelCallbacks();
        V v = this.f76818a;
        if (v != null) {
            v.destroy();
        }
        this.f76819b.destroy();
    }

    public BaseDiagramPresenter(M m) {
        Intrinsics.checkParameterIsNotNull(m, "model");
        this.f76819b = m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: V extends com.ss.android.lark.calendar.impl.framework.b.f<ViewData, ViewAction> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo110709a(V v) {
        Intrinsics.checkParameterIsNotNull(v, "v");
        this.f76818a = v;
        if (v != 0) {
            v.mo109795a(this.f76819b.mo109793f(), mo110712o());
        }
    }
}
