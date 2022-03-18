package com.ss.android.lark.calendar.impl.features.calendarview.main.fragments;

import com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController;
import com.ss.android.lark.calendar.impl.features.calendarview.days.DaysDiagramPresenter;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.HashMap;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/SingleDayDiagramFragment;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/DiagramControllerAdapterFragment;", "()V", "subTag", "", "getSubTag", "()Ljava/lang/String;", "createController", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramController;", "getTimeZone", "Ljava/util/TimeZone;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.i */
public final class SingleDayDiagramFragment extends DiagramControllerAdapterFragment {

    /* renamed from: c */
    private final String f77882c = "SingleDay";

    /* renamed from: d */
    private HashMap f77883d;

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.fragments.DiagramControllerAdapterFragment
    /* renamed from: g */
    public void mo111924g() {
        HashMap hashMap = this.f77883d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.features.calendarview.main.fragments.DiagramControllerAdapterFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo111924g();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.fragments.DiagramControllerAdapterFragment
    /* renamed from: b */
    public String mo111919b() {
        return this.f77882c;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.fragments.DiagramControllerAdapterFragment
    /* renamed from: f */
    public TimeZone mo111923f() {
        TimeZone safeMobileNormalViewTimezone = C30022a.f74884c.mo108456c().getSafeMobileNormalViewTimezone();
        Intrinsics.checkExpressionValueIsNotNull(safeMobileNormalViewTimezone, "CalendarDependencyHolder…eMobileNormalViewTimezone");
        return safeMobileNormalViewTimezone;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.fragments.DiagramControllerAdapterFragment
    /* renamed from: e */
    public IDiagramController mo111922e() {
        DaysDiagramPresenter a = DaysDiagramPresenter.f77048c.mo111011a(1);
        if (a == null) {
            a = DaysDiagramPresenter.f77048c.mo111010a();
        }
        return a;
    }
}
