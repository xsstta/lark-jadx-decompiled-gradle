package com.ss.android.lark.calendar.impl.features.events.edit.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.C31534a;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.events.edit.data.TimeData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimePresenter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeView;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.ListenableLinearLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\bH\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0006\u0010\u001d\u001a\u00020\u0011J\u0016\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditMultiTimeFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "action", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditMultiTimeFragment$EventTimeFragmentAction;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/TimeData;", "isChosenStartTime", "", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditMultiTimeFragment$EventTimeFragmentAction;Lcom/ss/android/lark/calendar/impl/features/events/edit/data/TimeData;Z)V", "mEditPresenter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimePresenter;", "mFragmentAction", "mIsChosenStartTime", "mIsFromLocalRecover", "mTimeData", "initMVP", "", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshOnTimeFormatChange", "refreshViewData", "EventTimeFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.j */
public final class EditMultiTimeFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    private boolean f80662a;

    /* renamed from: b */
    private TimeData f80663b;

    /* renamed from: e */
    private EventTimeFragmentAction f80664e;

    /* renamed from: f */
    private boolean f80665f;

    /* renamed from: g */
    private EditMultiTimePresenter f80666g;

    /* renamed from: h */
    private HashMap f80667h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditMultiTimeFragment$EventTimeFragmentAction;", "", "onBackPressed", "", "onSaveBtnPressed", "startTime", "", "endTime", "allDay", "", "timeZoneId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.j$a */
    public interface EventTimeFragmentAction {
        /* renamed from: a */
        void mo114382a();

        /* renamed from: a */
        void mo114383a(long j, long j2, boolean z, String str);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f80667h == null) {
            this.f80667h = new HashMap();
        }
        View view = (View) this.f80667h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80667h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f80667h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    /* renamed from: b */
    public final void mo115559b() {
        EditMultiTimePresenter cVar = this.f80666g;
        if (cVar != null) {
            cVar.mo115465a();
        }
    }

    public EditMultiTimeFragment() {
        this.f80665f = true;
        this.f80662a = true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        EventTimeFragmentAction aVar = this.f80664e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentAction");
        }
        aVar.mo114382a();
        return true;
    }

    /* renamed from: c */
    private final void m120108c() {
        ListenableLinearLayout listenableLinearLayout = (ListenableLinearLayout) mo109250a(R.id.chooseTimeRootView);
        Intrinsics.checkExpressionValueIsNotNull(listenableLinearLayout, "chooseTimeRootView");
        C31534a.AbstractC31535a aVar = this.f79937d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "mViewDependency");
        EditMultiTimeView dVar = new EditMultiTimeView(listenableLinearLayout, aVar);
        TimeData timeData = this.f80663b;
        if (timeData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeData");
        }
        EditMultiTimeView dVar2 = dVar;
        EditMultiTimeModel bVar = new EditMultiTimeModel(timeData, this.f80665f);
        EventTimeFragmentAction aVar2 = this.f80664e;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentAction");
        }
        EditMultiTimePresenter cVar = new EditMultiTimePresenter(dVar2, bVar, aVar2);
        this.f80666g = cVar;
        if (cVar != null) {
            cVar.create();
        }
    }

    /* renamed from: a */
    public final void mo115558a(TimeData timeData, boolean z) {
        Intrinsics.checkParameterIsNotNull(timeData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        EditMultiTimePresenter cVar = this.f80666g;
        if (cVar != null) {
            cVar.mo115466a(timeData, z);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f80662a) {
            m120108c();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_choose_multi_time, viewGroup, false);
    }

    public EditMultiTimeFragment(EventTimeFragmentAction aVar, TimeData timeData, boolean z) {
        Intrinsics.checkParameterIsNotNull(aVar, "action");
        Intrinsics.checkParameterIsNotNull(timeData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f80665f = true;
        this.f80664e = aVar;
        this.f80663b = timeData;
        this.f80665f = z;
        this.f80662a = false;
    }
}
