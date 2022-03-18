package com.ss.android.lark.calendar.impl.features.calendarview.manager;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0006\u0010\u0015\u001a\u00020\u000fJ\b\u0010\u0016\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/manager/CalendarFirstTabLauncher;", "", "()V", "isDataPrepared", "", "()Z", "setDataPrepared", "(Z)V", "isSettingPrepared", "setSettingPrepared", "isViewPrepared", "setViewPrepared", "mainPresenter", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter;", "createView", "", "destroy", "loadData", "loadSetting", "preloadTabPageData", "preloadTabPageView", "prepareCalendarData", "resetData", "setMainPresenter", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.b.a */
public final class CalendarFirstTabLauncher {

    /* renamed from: a */
    public CalendarPresenter f76825a;

    /* renamed from: b */
    private volatile boolean f76826b;

    /* renamed from: c */
    private volatile boolean f76827c;

    /* renamed from: d */
    private volatile boolean f76828d;

    /* renamed from: e */
    public final void mo110722e() {
        m114007f();
    }

    /* renamed from: f */
    private final void m114007f() {
        this.f76826b = false;
        this.f76828d = false;
        this.f76827c = false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.b.a$a */
    public static final class RunnableC30665a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarFirstTabLauncher f76829a;

        RunnableC30665a(CalendarFirstTabLauncher aVar) {
            this.f76829a = aVar;
        }

        public final void run() {
            this.f76829a.mo110716a();
            CalendarPresenter calendarPresenter = this.f76829a.f76825a;
            if (calendarPresenter != null) {
                calendarPresenter.mo111815e();
            }
            this.f76829a.mo110718a(true);
        }
    }

    /* renamed from: a */
    public final void mo110716a() {
        LaunchPerfMonitor.m124428c("load_setting");
        C30022a.f74884c.mo108452a(true);
        this.f76828d = true;
        LaunchPerfMonitor.m124430d("load_setting");
    }

    /* renamed from: b */
    public final void mo110719b() {
        C30076a.m111290a().mo108431c();
        C32583e.m124816a().mo119040b();
        AbstractC30037ag timeFormatDependency = C30022a.f74882a.timeFormatDependency();
        Intrinsics.checkExpressionValueIsNotNull(timeFormatDependency, "CalendarDependencyHolder…cy.timeFormatDependency()");
        timeFormatDependency.mo108189a();
    }

    /* renamed from: c */
    public final void mo110720c() {
        if (!this.f76827c) {
            LaunchPerfMonitor.m124428c("init_view");
            CalendarPresenter calendarPresenter = this.f76825a;
            if (calendarPresenter != null) {
                calendarPresenter.mo111816f();
            }
            LaunchPerfMonitor.m124430d("init_view");
            CalendarPresenter calendarPresenter2 = this.f76825a;
            if (calendarPresenter2 != null) {
                calendarPresenter2.mo111819i();
            }
            this.f76827c = true;
        }
    }

    /* renamed from: d */
    public final void mo110721d() {
        if (!this.f76826b) {
            CalendarPresenter calendarPresenter = this.f76825a;
            if (calendarPresenter != null) {
                calendarPresenter.mo111814d();
            }
            mo110719b();
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().submit(new RunnableC30665a(this));
        }
    }

    /* renamed from: a */
    public final void mo110717a(CalendarPresenter calendarPresenter) {
        this.f76825a = calendarPresenter;
    }

    /* renamed from: a */
    public final void mo110718a(boolean z) {
        this.f76826b = z;
    }
}
