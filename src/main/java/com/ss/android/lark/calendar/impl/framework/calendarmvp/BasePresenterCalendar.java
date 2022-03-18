package com.ss.android.lark.calendar.impl.framework.calendarmvp;

import com.larksuite.framework.callback.CallbackManager;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IModelCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender.IViewAction;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender.IViewData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00060\u0005*\b\b\u0002\u0010\u0003*\u00020\u0007*\b\b\u0003\u0010\u0006*\u00020\b2\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00040\tB\u0015\u0012\u0006\u0010\n\u001a\u00028\u0001\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\b\u0010\u0017\u001a\u00020\u0018H\u0017J\b\u0010\u0019\u001a\u00020\u0018H\u0017J\r\u0010\u001a\u001a\u00028\u0003H&¢\u0006\u0002\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000b\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BasePresenterCalendar;", "M", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "ViewData", "V", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "ViewAction", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IPresenterCalendar;", "view", "model", "(Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;)V", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "getCallbackManager", "()Lcom/larksuite/framework/callback/CallbackManager;", "getModel", "()Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "getView", "()Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "create", "", "destroy", "getViewAction", "()Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.b.b */
public abstract class BasePresenterCalendar<M extends IModelCalendar<ViewData>, V extends IViewCalender<ViewData, ViewAction>, ViewData extends IViewCalender.IViewData, ViewAction extends IViewCalender.IViewAction> implements IPresenterCalendar<M, V> {

    /* renamed from: a */
    private final V f83304a;

    /* renamed from: b */
    private final M f83305b;

    /* renamed from: c */
    private final CallbackManager f83306c = new CallbackManager();

    /* renamed from: b */
    public abstract ViewAction mo109713b();

    /* renamed from: s */
    public final V mo118651s() {
        return this.f83304a;
    }

    /* renamed from: t */
    public final M mo118652t() {
        return this.f83305b;
    }

    /* renamed from: u */
    public final CallbackManager mo118653u() {
        return this.f83306c;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f83304a.create();
        this.f83305b.create();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f83306c.cancelCallbacks();
        this.f83304a.destroy();
        this.f83305b.destroy();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: V extends com.ss.android.lark.calendar.impl.framework.b.f<ViewData, ViewAction> */
    /* JADX WARN: Multi-variable type inference failed */
    public BasePresenterCalendar(V v, M m) {
        Intrinsics.checkParameterIsNotNull(v, "view");
        Intrinsics.checkParameterIsNotNull(m, "model");
        this.f83304a = v;
        this.f83305b = m;
        v.mo109795a(m.mo109793f(), mo109713b());
    }
}
