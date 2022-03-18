package com.ss.android.lark.mail.impl.widget.time.mvp;

import com.ss.android.lark.mail.impl.widget.time.mvp.IModelCalendar;
import com.ss.android.lark.mail.impl.widget.time.mvp.IViewCalender;
import com.ss.android.lark.mail.impl.widget.time.mvp.IViewCalender.IViewAction;
import com.ss.android.lark.mail.impl.widget.time.mvp.IViewCalender.IViewData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00060\u0005*\b\b\u0002\u0010\u0003*\u00020\u0007*\b\b\u0003\u0010\u0006*\u00020\b2\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00040\tB\u0015\u0012\u0006\u0010\n\u001a\u00028\u0001\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\r\u0010\u0016\u001a\u00028\u0003H&¢\u0006\u0002\u0010\u0017R\u0013\u0010\u000b\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/mvp/BasePresenterCalendar;", "M", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IModelCalendar;", "ViewData", "V", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender;", "ViewAction", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender$IViewData;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender$IViewAction;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IPresenterCalendar;", "view", "model", "(Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender;Lcom/ss/android/lark/mail/impl/widget/time/mvp/IModelCalendar;)V", "getModel", "()Lcom/ss/android/lark/mail/impl/widget/time/mvp/IModelCalendar;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IModelCalendar;", "getView", "()Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender;", "create", "", "destroy", "getViewAction", "()Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender$IViewAction;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.a.c */
public abstract class BasePresenterCalendar<M extends IModelCalendar<ViewData>, V extends IViewCalender<ViewData, ViewAction>, ViewData extends IViewCalender.IViewData, ViewAction extends IViewCalender.IViewAction> implements IPresenterCalendar<M, V> {

    /* renamed from: a */
    private final V f111884a;

    /* renamed from: b */
    private final M f111885b;

    /* renamed from: b */
    public abstract ViewAction mo156852b();

    /* renamed from: d */
    public final V mo156853d() {
        return this.f111884a;
    }

    /* renamed from: e */
    public final M mo156854e() {
        return this.f111885b;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f111884a.create();
        this.f111885b.create();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f111884a.destroy();
        this.f111885b.destroy();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: V extends com.ss.android.lark.mail.impl.widget.time.a.g<ViewData, ViewAction> */
    /* JADX WARN: Multi-variable type inference failed */
    public BasePresenterCalendar(V v, M m) {
        Intrinsics.checkParameterIsNotNull(v, "view");
        Intrinsics.checkParameterIsNotNull(m, "model");
        this.f111884a = v;
        this.f111885b = m;
        v.mo156855a(m.mo156858q(), mo156852b());
    }
}
