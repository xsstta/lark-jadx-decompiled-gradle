package com.ss.android.lark.calendar.impl.features.settings.alternateCalendar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001 B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/alternateCalendar/AlternateCalendarFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "delegate", "Lcom/ss/android/lark/calendar/impl/features/settings/alternateCalendar/AlternateCalendarFragment$Delegate;", "currentCalendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$AlternateCalendar;", "(Lcom/ss/android/lark/calendar/impl/features/settings/alternateCalendar/AlternateCalendarFragment$Delegate;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$AlternateCalendar;)V", "mAdapter", "Lcom/ss/android/lark/calendar/impl/features/settings/alternateCalendar/AlternateCalendarAdapter;", "mAlternateCalendarData", "", "Lcom/ss/android/lark/calendar/impl/features/settings/alternateCalendar/AlternateCalendarData;", "mDelegate", "initAlternateCalendarRv", "", "initData", "initTitleBar", "initView", "onBackPressed", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshViewData", "Delegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.a.c */
public final class AlternateCalendarFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    private Delegate f83010a;

    /* renamed from: b */
    private List<AlternateCalendarData> f83011b = new ArrayList();

    /* renamed from: e */
    private AlternateCalendarAdapter f83012e;

    /* renamed from: f */
    private HashMap f83013f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/alternateCalendar/AlternateCalendarFragment$Delegate;", "", "onBackPressed", "", "onSaveData", "selectedCalendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$AlternateCalendar;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.a.c$a */
    public interface Delegate {
        /* renamed from: a */
        void mo118386a();

        /* renamed from: a */
        void mo118387a(CalendarSetting.AlternateCalendar alternateCalendar);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f83013f == null) {
            this.f83013f = new HashMap();
        }
        View view = (View) this.f83013f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f83013f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f83013f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    /* renamed from: c */
    private final void m123640c() {
        m123641d();
        m123642f();
    }

    public AlternateCalendarFragment() {
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        Delegate aVar = this.f83010a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDelegate");
        }
        aVar.mo118386a();
        return true;
    }

    /* renamed from: d */
    private final void m123641d() {
        ((CommonTitleBar) mo109250a(R.id.alternateTitleBar)).setTitle(R.string.Calendar_NewSettings_UseAlternateCalendar);
        ((CommonTitleBar) mo109250a(R.id.alternateTitleBar)).setMainTitleTextStyle(1);
        ((CommonTitleBar) mo109250a(R.id.alternateTitleBar)).setMainTitleSize(17.0f);
        ((CommonTitleBar) mo109250a(R.id.alternateTitleBar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.alternateTitleBar)).setLeftClickListener(new View$OnClickListenerC32398b(this));
    }

    /* renamed from: f */
    private final void m123642f() {
        RecyclerView recyclerView = (RecyclerView) mo109250a(R.id.calendarModelRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "calendarModelRV");
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        AlternateCalendarAdapter aVar = this.f83012e;
        if (aVar != null) {
            RecyclerView recyclerView2 = (RecyclerView) mo109250a(R.id.calendarModelRV);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "calendarModelRV");
            recyclerView2.setAdapter(aVar);
            aVar.mo118377a(this.f83011b);
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    private final void m123639b() {
        if (this.f83011b.isEmpty()) {
            List<AlternateCalendarData> list = this.f83011b;
            String string = UIUtils.getString(getContext(), R.string.Calendar_Alternate_No);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(contex…ng.Calendar_Alternate_No)");
            list.add(new AlternateCalendarData(string, CalendarSetting.AlternateCalendar.NONE_CALENDAR));
            List<AlternateCalendarData> list2 = this.f83011b;
            String string2 = UIUtils.getString(getContext(), R.string.Calendar_Alternate_Chinese);
            Intrinsics.checkExpressionValueIsNotNull(string2, "UIUtils.getString(contex…lendar_Alternate_Chinese)");
            list2.add(new AlternateCalendarData(string2, CalendarSetting.AlternateCalendar.CHINESE_LUNAR_CALENDAR));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.a.c$b */
    public static final class View$OnClickListenerC32398b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlternateCalendarFragment f83014a;

        View$OnClickListenerC32398b(AlternateCalendarFragment cVar) {
            this.f83014a = cVar;
        }

        public final void onClick(View view) {
            this.f83014a.mo113714e();
        }
    }

    /* renamed from: a */
    public final void mo118385a(CalendarSetting.AlternateCalendar alternateCalendar) {
        Intrinsics.checkParameterIsNotNull(alternateCalendar, "currentCalendar");
        AlternateCalendarAdapter aVar = this.f83012e;
        if (aVar != null) {
            aVar.mo118376a(alternateCalendar);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m123639b();
        m123640c();
    }

    public AlternateCalendarFragment(Delegate aVar, CalendarSetting.AlternateCalendar alternateCalendar) {
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        Intrinsics.checkParameterIsNotNull(alternateCalendar, "currentCalendar");
        this.f83010a = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDelegate");
        }
        AlternateCalendarAdapter aVar2 = new AlternateCalendarAdapter(aVar);
        this.f83012e = aVar2;
        if (aVar2 != null) {
            aVar2.mo118376a(alternateCalendar);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.fragment_alternate_calendar, (ViewGroup) null);
    }
}
