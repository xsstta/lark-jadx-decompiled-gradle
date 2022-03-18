package com.ss.android.lark.calendar.impl.features.calendarview.main.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.main.container.CalendarTabContainer;
import com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel;
import com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.ViewMode;
import com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramView;
import com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel;
import com.ss.android.lark.calendar.impl.framework.viewmodel.C32508b;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\u001a\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/fragments/MeetingRoomDiagramFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "isViewModeChanged", "", "logTag", "", "roomDiagramView", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramView;", "roomViewModel", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/RoomDiagramViewModel;", "shellViewModel", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/viewmodel/CalendarShellViewModel;", "subTag", "tabContainer", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarTabContainer;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onPause", "onResume", "onViewCreated", "view", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.e */
public final class MeetingRoomDiagramFragment extends BaseFragment {

    /* renamed from: a */
    public final CalendarShellViewModel f77859a = CalendarShellViewModel.f77899a;

    /* renamed from: b */
    public RoomDiagramView f77860b;

    /* renamed from: c */
    public boolean f77861c = true;

    /* renamed from: d */
    private final String f77862d = "CalendarShellView";

    /* renamed from: e */
    private final String f77863e = "MeetingRoomDiagram";

    /* renamed from: f */
    private RoomDiagramViewModel f77864f;

    /* renamed from: g */
    private CalendarTabContainer f77865g;

    /* renamed from: h */
    private HashMap f77866h;

    /* renamed from: a */
    public void mo111944a() {
        HashMap hashMap = this.f77866h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        RoomDiagramView dVar = this.f77860b;
        if (dVar != null) {
            dVar.mo112220d();
        }
        this.f77860b = null;
        mo111944a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        String str = this.f77862d;
        Log.m165389i(str, this.f77863e + ": onDestroy");
        RoomDiagramViewModel roomDiagramViewModel = this.f77864f;
        if (roomDiagramViewModel != null) {
            roomDiagramViewModel.destroy();
        }
        this.f77864f = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        String str = this.f77862d;
        Log.m165389i(str, this.f77863e + ": onPause");
        RoomDiagramView dVar = this.f77860b;
        if (dVar != null) {
            dVar.mo112217a(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        String str = this.f77862d;
        Log.m165389i(str, this.f77863e + ": onResume " + this.f77861c);
        RoomDiagramViewModel roomDiagramViewModel = this.f77864f;
        if (roomDiagramViewModel != null && this.f77861c) {
            this.f77861c = false;
            this.f77859a.mo111968b(roomDiagramViewModel.getSelectedDate().getJulianDay());
            CalendarTabContainer bVar = this.f77865g;
            if (bVar != null) {
                bVar.mo111884a(false, (float) roomDiagramViewModel.getSelectedDate().dayDiff(roomDiagramViewModel.getCurrentDate()));
            }
            roomDiagramViewModel.onRefreshInstanceManually();
        }
        RoomDiagramView dVar = this.f77860b;
        if (dVar != null) {
            dVar.mo112219c();
        }
        RoomDiagramView dVar2 = this.f77860b;
        if (dVar2 != null) {
            dVar2.mo112217a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/viewmodel/ViewMode;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.e$b */
    static final class C30920b extends Lambda implements Function1<ViewMode, Unit> {
        final /* synthetic */ MeetingRoomDiagramFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30920b(MeetingRoomDiagramFragment eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ViewMode aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ViewMode aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "it");
            this.this$0.f77861c = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "kotlin.jvm.PlatformType", "onChanged", "com/ss/android/lark/calendar/impl/features/calendarview/main/fragments/MeetingRoomDiagramFragment$onCreate$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.e$a */
    static final class C30919a<T> implements AbstractC1178x<CalendarDate> {

        /* renamed from: a */
        final /* synthetic */ RoomDiagramViewModel f77867a;

        /* renamed from: b */
        final /* synthetic */ MeetingRoomDiagramFragment f77868b;

        C30919a(RoomDiagramViewModel roomDiagramViewModel, MeetingRoomDiagramFragment eVar) {
            this.f77867a = roomDiagramViewModel;
            this.f77868b = eVar;
        }

        /* renamed from: a */
        public final void onChanged(CalendarDate calendarDate) {
            this.f77868b.f77859a.mo111968b(this.f77867a.getSelectedDate().getJulianDay());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b.e$c */
    static final class C30921c extends Lambda implements Function1<Object, Unit> {
        final /* synthetic */ MeetingRoomDiagramFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30921c(MeetingRoomDiagramFragment eVar) {
            super(1);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final void invoke(Object obj) {
            RoomDiagramView dVar;
            Intrinsics.checkParameterIsNotNull(obj, "it");
            if (this.this$0.isResumed() && (dVar = this.this$0.f77860b) != null) {
                dVar.mo112218b();
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = this.f77862d;
        Log.m165389i(str, this.f77863e + ": onCreate");
        RoomDiagramViewModel roomDiagramViewModel = (RoomDiagramViewModel) new C1144ai(this).mo6005a(RoomDiagramViewModel.class);
        roomDiagramViewModel.preLoadData();
        roomDiagramViewModel.create();
        roomDiagramViewModel.getSelectDateChangeLiveData().mo5923a(this, new C30919a(roomDiagramViewModel, this));
        this.f77864f = roomDiagramViewModel;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        this.f77865g = new CalendarTabContainer();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner, "viewLifecycleOwner");
        C32508b.m124448a(this.f77859a.mo111967b(), viewLifecycleOwner, new C30920b(this));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner2, "viewLifecycleOwner");
        C32508b.m124448a(this.f77859a.mo111980m(), viewLifecycleOwner2, new C30921c(this));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        RoomDiagramViewModel roomDiagramViewModel = this.f77864f;
        if (roomDiagramViewModel == null) {
            return null;
        }
        RoomDiagramView dVar = new RoomDiagramView(roomDiagramViewModel);
        dVar.mo112216a(layoutInflater.getContext());
        dVar.mo112319a((Activity) getActivity());
        this.f77860b = dVar;
        return dVar.mo112215a();
    }
}
