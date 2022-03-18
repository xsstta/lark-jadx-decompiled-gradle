package com.ss.android.lark.calendar.impl.features.calendarview.main.fragments;

import android.os.Bundle;
import android.view.View;
import com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController;
import com.ss.android.lark.calendar.impl.features.calendarview.list.ListDiagramController;
import com.ss.android.lark.calendar.impl.features.calendarview.main.fragments.DiagramControllerAdapterFragment;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0014J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/ListDiagramFragment;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/DiagramControllerAdapterFragment;", "()V", "subTag", "", "getSubTag", "()Ljava/lang/String;", "createController", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramController;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.d */
public final class ListDiagramFragment extends DiagramControllerAdapterFragment {

    /* renamed from: c */
    private final String f77857c = "ListDiagram";

    /* renamed from: d */
    private HashMap f77858d;

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.fragments.DiagramControllerAdapterFragment
    /* renamed from: g */
    public void mo111924g() {
        HashMap hashMap = this.f77858d;
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
        return this.f77857c;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.fragments.DiagramControllerAdapterFragment
    /* renamed from: e */
    public IDiagramController mo111922e() {
        return new ListDiagramController();
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.features.calendarview.main.fragments.DiagramControllerAdapterFragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        DiagramControllerAdapterFragment.DiagramControllerAdapter d = mo111921d();
        if (d != null) {
            d.mo111928a(true);
        }
    }
}
