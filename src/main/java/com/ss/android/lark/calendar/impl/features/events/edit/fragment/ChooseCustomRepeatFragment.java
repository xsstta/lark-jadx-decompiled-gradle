package com.ss.android.lark.calendar.impl.features.events.edit.fragment;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer;
import com.ss.android.lark.calendar.impl.features.events.edit.p1517b.p1520c.AbstractC31541a;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31917h;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.WheelView;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.C31903c;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.C31909g;
import com.ss.android.lark.calendar.impl.utils.C32632ac;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.EventRecurrence;
import com.ss.android.lark.calendar.impl.utils.RepeatMode;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 92\u00020\u0001:\u00029:B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B)\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001a\u001a\u00020\u001bH\u0002J \u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f2\u0006\u0010 \u001a\u00020\u0012H\u0002J\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u001bH\u0002J\b\u0010&\u001a\u00020\u001bH\u0002J\b\u0010'\u001a\u00020\bH\u0016J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u001a\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00102\u001a\u00020\u001bH\u0002J\b\u00103\u001a\u00020\u001bH\u0002J \u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u00106\u001a\u0004\u0018\u00010\nJ\u0006\u00107\u001a\u00020\u001bJ\b\u00108\u001a\u00020\u001bH\u0002R\u000e\u0010\f\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCustomRepeatFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "action", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCustomRepeatFragment$CustomRepeatFragmentAction;", "startCalendarDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "isSingleInMonth", "", "lastRepeatRule", "Lcom/ss/android/lark/calendar/impl/utils/RepeatMode;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCustomRepeatFragment$CustomRepeatFragmentAction;Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;ZLcom/ss/android/lark/calendar/impl/utils/RepeatMode;)V", "mCustomRepeatAction", "mIsFromLocalRecover", "mLastRepeatMode", "mRepeatFreAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/pickerview/adapter/StringWheelAdapter;", "mRepeatFreIndex", "", "mRepeatFreSingularAdapter", "mRepeatMode", "mRepeatModelTypes", "Landroid/util/SparseArray;", "mRepeatNumAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/pickerview/adapter/CustomNumericWheelAdapter;", "mStartCalendarDate", "clear", "", "getPluralListByNum", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "number", "initData", "initListener", "initRepeatModeAndRefresh", "initTitleBar", "initView", "initWheelView", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshBottomContainer", "refreshBottomContainerData", "refreshData", "startTime", "lastRepeatMode", "refreshPickerViewData", "refreshRepeatRule", "Companion", "CustomRepeatFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a */
public final class ChooseCustomRepeatFragment extends View$OnClickListenerC31538b {

    /* renamed from: j */
    public static final Companion f80300j = new Companion(null);

    /* renamed from: a */
    public CustomRepeatFragmentAction f80301a;

    /* renamed from: b */
    public int f80302b;

    /* renamed from: e */
    public C31903c f80303e;

    /* renamed from: f */
    public C31909g f80304f;

    /* renamed from: g */
    public C31909g f80305g;

    /* renamed from: h */
    public final RepeatMode f80306h;

    /* renamed from: i */
    public SparseArray<Integer> f80307i;

    /* renamed from: k */
    private boolean f80308k;

    /* renamed from: l */
    private CalendarDate f80309l;

    /* renamed from: m */
    private RepeatMode f80310m;

    /* renamed from: n */
    private HashMap f80311n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCustomRepeatFragment$CustomRepeatFragmentAction;", "", "onBackPressed", "", "onSavePressed", "customRRule", "Lcom/ss/android/lark/calendar/impl/utils/EventRecurrence;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a$b */
    public interface CustomRepeatFragmentAction {
        /* renamed from: a */
        void mo114355a();

        /* renamed from: a */
        void mo114356a(EventRecurrence eventRecurrence);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f80311n == null) {
            this.f80311n = new HashMap();
        }
        View view = (View) this.f80311n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80311n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f80311n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCustomRepeatFragment$Companion;", "", "()V", "INDEX_FRE_DAYS", "", "INDEX_FRE_MONTHS", "INDEX_FRE_WEEKS", "INDEX_FRE_YEARS", "ITEM_SINGULAR", "REPEAT_FRE_DEFAULT_INDEX", "REPEAT_NUM_DEFAULT_INDEX", "REPEAT_NUM_END", "REPEAT_NUM_START", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    private final void m119471g() {
        m119472h();
        m119476l();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016¨\u0006\u0013"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCustomRepeatFragment$initListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/ICustomRepeatListener;", "onCancelSelectMonthDay", "", "day", "", "onCancelSelectWeek", "week", "onCheckedListener", "result", "", "onSelectMonthDay", "onSelectMonthWeekDay", "weekDay", "onSelectMonthWeekNo", "weekNo", "onSelectWeek", "onSwitch2MonthDay", "onSwitch2MonthWeek", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a$c */
    public static final class C31633c implements AbstractC31541a {

        /* renamed from: a */
        final /* synthetic */ ChooseCustomRepeatFragment f80312a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.p1517b.p1520c.AbstractC31541a
        /* renamed from: a */
        public void mo114649a() {
            this.f80312a.f80306h.setRepeatType(9);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.p1517b.p1520c.AbstractC31541a
        /* renamed from: b */
        public void mo114652b() {
            this.f80312a.f80306h.setRepeatType(10);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31633c(ChooseCustomRepeatFragment aVar) {
            this.f80312a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.p1517b.p1520c.AbstractC31541a
        /* renamed from: a */
        public void mo114650a(int i) {
            this.f80312a.f80306h.addWeekList(i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.p1517b.p1520c.AbstractC31541a
        /* renamed from: b */
        public void mo114653b(int i) {
            this.f80312a.f80306h.removeWeekList(i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.p1517b.p1520c.AbstractC31541a
        /* renamed from: c */
        public void mo114655c(int i) {
            this.f80312a.f80306h.addMonthList(i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.p1517b.p1520c.AbstractC31541a
        /* renamed from: d */
        public void mo114657d(int i) {
            this.f80312a.f80306h.removeMonthList(i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.p1517b.p1520c.AbstractC31541a
        /* renamed from: c */
        public void mo114656c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "weekDay");
            this.f80312a.f80306h.setCustomerByMonthWeekDay(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.p1517b.p1520c.AbstractC31541a
        /* renamed from: a */
        public void mo114651a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "result");
            this.f80312a.mo115159d();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.p1517b.p1520c.AbstractC31541a
        /* renamed from: b */
        public void mo114654b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "weekNo");
            this.f80312a.f80306h.setCustomerByMonthWeekNo(str);
        }
    }

    public ChooseCustomRepeatFragment() {
        this.f80309l = new CalendarDate();
        this.f80306h = new RepeatMode();
        this.f80307i = new SparseArray<>();
        this.f80308k = true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        CustomRepeatFragmentAction bVar = this.f80301a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomRepeatAction");
        }
        bVar.mo114355a();
        mo115160f();
        return true;
    }

    /* renamed from: f */
    public final void mo115160f() {
        this.f80306h.clearRule();
        ((CustomRepeatBottomContainer) mo109250a(R.id.custom_repeat_bottom_container)).mo115929a();
    }

    /* renamed from: j */
    private final void m119474j() {
        CustomRepeatBottomContainer customRepeatBottomContainer = (CustomRepeatBottomContainer) mo109250a(R.id.custom_repeat_bottom_container);
        Intrinsics.checkExpressionValueIsNotNull(customRepeatBottomContainer, "custom_repeat_bottom_container");
        customRepeatBottomContainer.setMonthDaySingle(Boolean.valueOf(this.f80306h.getMonthDaySingle()));
        ((CustomRepeatBottomContainer) mo109250a(R.id.custom_repeat_bottom_container)).mo115930a(this.f80309l, this.f80310m);
    }

    /* renamed from: k */
    private final void m119475k() {
        ((WheelView) mo109250a(R.id.wheel_repeat_num)).setOnItemSelectedListener(new C31635e(this));
        ((WheelView) mo109250a(R.id.wheel_repeat_frequency_unit)).setOnItemSelectedListener(new C31634d(this));
        ((CustomRepeatBottomContainer) mo109250a(R.id.custom_repeat_bottom_container)).setOnCheckedListener(new C31633c(this));
    }

    /* renamed from: l */
    private final void m119476l() {
        ((WheelView) mo109250a(R.id.wheel_repeat_num)).setLineSpacingMultiplier(3.0f);
        ((WheelView) mo109250a(R.id.wheel_repeat_num)).setTextColorCenter(C32634ae.m125178a(R.color.text_title));
        ((WheelView) mo109250a(R.id.wheel_repeat_frequency_unit)).setLineSpacingMultiplier(3.0f);
        ((WheelView) mo109250a(R.id.wheel_repeat_frequency_unit)).setTextColorCenter(C32634ae.m125178a(R.color.text_title));
    }

    /* renamed from: d */
    public final void mo115159d() {
        String c = C32632ac.m125172c(this.f80306h.toER().toString());
        TextView textView = (TextView) mo109250a(R.id.tv_repeat_rule);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_repeat_rule");
        textView.setText(c);
    }

    /* renamed from: h */
    private final void m119472h() {
        ((CommonTitleBar) mo109250a(R.id.custom_repeat_title_bar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.custom_repeat_title_bar)).setLeftImageResource(R.drawable.ic_svg_titlebar_close);
        ((CommonTitleBar) mo109250a(R.id.custom_repeat_title_bar)).setLeftClickListener(new C31636f(this));
        ((CommonTitleBar) mo109250a(R.id.custom_repeat_title_bar)).addAction(new C31637g(this, C32634ae.m125182b(R.string.Calendar_Common_Done), R.color.primary_pri_500));
    }

    /* renamed from: m */
    private final void m119477m() {
        RepeatMode repeatMode = this.f80306h;
        Integer num = this.f80307i.get(0);
        Intrinsics.checkExpressionValueIsNotNull(num, "mRepeatModelTypes.get(REPEAT_FRE_DEFAULT_INDEX)");
        repeatMode.setRepeatType(num.intValue());
        RepeatMode repeatMode2 = this.f80306h;
        C31903c cVar = this.f80303e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatNumAdapter");
        }
        Integer a = cVar.mo116507b(0);
        Intrinsics.checkExpressionValueIsNotNull(a, "mRepeatNumAdapter.getIte…REPEAT_NUM_DEFAULT_INDEX)");
        repeatMode2.setInterval(a.intValue());
        this.f80302b = 0;
        WheelView wheelView = (WheelView) mo109250a(R.id.wheel_repeat_frequency_unit);
        Intrinsics.checkExpressionValueIsNotNull(wheelView, "wheel_repeat_frequency_unit");
        C31909g gVar = this.f80305g;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatFreSingularAdapter");
        }
        wheelView.setAdapter(gVar);
        WheelView wheelView2 = (WheelView) mo109250a(R.id.wheel_repeat_num);
        Intrinsics.checkExpressionValueIsNotNull(wheelView2, "wheel_repeat_num");
        wheelView2.setCurrentItem(0);
        WheelView wheelView3 = (WheelView) mo109250a(R.id.wheel_repeat_frequency_unit);
        Intrinsics.checkExpressionValueIsNotNull(wheelView3, "wheel_repeat_frequency_unit");
        wheelView3.setCurrentItem(0);
        mo115159d();
    }

    /* renamed from: b */
    public final void mo115157b() {
        CustomRepeatBottomContainer customRepeatBottomContainer = (CustomRepeatBottomContainer) mo109250a(R.id.custom_repeat_bottom_container);
        Intrinsics.checkExpressionValueIsNotNull(customRepeatBottomContainer, "custom_repeat_bottom_container");
        if (customRepeatBottomContainer.getVisibility() == 0) {
            CustomRepeatBottomContainer customRepeatBottomContainer2 = (CustomRepeatBottomContainer) mo109250a(R.id.custom_repeat_bottom_container);
            Intrinsics.checkExpressionValueIsNotNull(customRepeatBottomContainer2, "custom_repeat_bottom_container");
            ((WheelView) customRepeatBottomContainer2.findViewById(R.id.wheel_repeat_week_no)).mo116466b();
            CustomRepeatBottomContainer customRepeatBottomContainer3 = (CustomRepeatBottomContainer) mo109250a(R.id.custom_repeat_bottom_container);
            Intrinsics.checkExpressionValueIsNotNull(customRepeatBottomContainer3, "custom_repeat_bottom_container");
            ((WheelView) customRepeatBottomContainer3.findViewById(R.id.wheel_repeat_weeks)).mo116466b();
        }
        ((WheelView) mo109250a(R.id.wheel_repeat_num)).mo116466b();
        ((WheelView) mo109250a(R.id.wheel_repeat_frequency_unit)).mo116466b();
    }

    /* renamed from: i */
    private final void m119473i() {
        this.f80303e = new C31903c(1, 99);
        WheelView wheelView = (WheelView) mo109250a(R.id.wheel_repeat_num);
        Intrinsics.checkExpressionValueIsNotNull(wheelView, "wheel_repeat_num");
        C31903c cVar = this.f80303e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatNumAdapter");
        }
        wheelView.setAdapter(cVar);
        this.f80304f = new C31909g(m119468b(2));
        this.f80305g = new C31909g(m119468b(1));
        WheelView wheelView2 = (WheelView) mo109250a(R.id.wheel_repeat_frequency_unit);
        Intrinsics.checkExpressionValueIsNotNull(wheelView2, "wheel_repeat_frequency_unit");
        C31909g gVar = this.f80305g;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatFreSingularAdapter");
        }
        wheelView2.setAdapter(gVar);
        this.f80307i.put(0, 1);
        this.f80307i.put(1, 2);
        this.f80307i.put(2, 4);
        this.f80307i.put(3, 5);
        m119477m();
        m119474j();
    }

    /* renamed from: c */
    public final void mo115158c() {
        int i = this.f80302b;
        if (i == 0) {
            this.f80306h.setRepeatType(7);
            CustomRepeatBottomContainer customRepeatBottomContainer = (CustomRepeatBottomContainer) mo109250a(R.id.custom_repeat_bottom_container);
            Intrinsics.checkExpressionValueIsNotNull(customRepeatBottomContainer, "custom_repeat_bottom_container");
            customRepeatBottomContainer.setVisibility(8);
            View a = mo109250a(R.id.bottom_container_divider);
            Intrinsics.checkExpressionValueIsNotNull(a, "bottom_container_divider");
            a.setVisibility(8);
        } else if (i == 1) {
            this.f80306h.setRepeatType(8);
            CustomRepeatBottomContainer customRepeatBottomContainer2 = (CustomRepeatBottomContainer) mo109250a(R.id.custom_repeat_bottom_container);
            Intrinsics.checkExpressionValueIsNotNull(customRepeatBottomContainer2, "custom_repeat_bottom_container");
            customRepeatBottomContainer2.setVisibility(0);
            View a2 = mo109250a(R.id.bottom_container_divider);
            Intrinsics.checkExpressionValueIsNotNull(a2, "bottom_container_divider");
            a2.setVisibility(0);
            ((CustomRepeatBottomContainer) mo109250a(R.id.custom_repeat_bottom_container)).mo115932b();
        } else if (i == 2) {
            CustomRepeatBottomContainer customRepeatBottomContainer3 = (CustomRepeatBottomContainer) mo109250a(R.id.custom_repeat_bottom_container);
            Intrinsics.checkExpressionValueIsNotNull(customRepeatBottomContainer3, "custom_repeat_bottom_container");
            customRepeatBottomContainer3.setVisibility(0);
            View a3 = mo109250a(R.id.bottom_container_divider);
            Intrinsics.checkExpressionValueIsNotNull(a3, "bottom_container_divider");
            a3.setVisibility(0);
            ((CustomRepeatBottomContainer) mo109250a(R.id.custom_repeat_bottom_container)).mo115933c();
        } else if (i != 3) {
            this.f80306h.setRepeatType(7);
            CustomRepeatBottomContainer customRepeatBottomContainer4 = (CustomRepeatBottomContainer) mo109250a(R.id.custom_repeat_bottom_container);
            Intrinsics.checkExpressionValueIsNotNull(customRepeatBottomContainer4, "custom_repeat_bottom_container");
            customRepeatBottomContainer4.setVisibility(8);
            View a4 = mo109250a(R.id.bottom_container_divider);
            Intrinsics.checkExpressionValueIsNotNull(a4, "bottom_container_divider");
            a4.setVisibility(8);
        } else {
            CustomRepeatBottomContainer customRepeatBottomContainer5 = (CustomRepeatBottomContainer) mo109250a(R.id.custom_repeat_bottom_container);
            Intrinsics.checkExpressionValueIsNotNull(customRepeatBottomContainer5, "custom_repeat_bottom_container");
            customRepeatBottomContainer5.setVisibility(8);
            View a5 = mo109250a(R.id.bottom_container_divider);
            Intrinsics.checkExpressionValueIsNotNull(a5, "bottom_container_divider");
            a5.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCustomRepeatFragment$initTitleBar$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a$f */
    public static final class C31636f extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ChooseCustomRepeatFragment f80315a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31636f(ChooseCustomRepeatFragment aVar) {
            this.f80315a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f80315a.mo113714e();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CustomRepeatFragmentAction m119466a(ChooseCustomRepeatFragment aVar) {
        CustomRepeatFragmentAction bVar = aVar.f80301a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomRepeatAction");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C31903c m119467b(ChooseCustomRepeatFragment aVar) {
        C31903c cVar = aVar.f80303e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatNumAdapter");
        }
        return cVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ C31909g m119469c(ChooseCustomRepeatFragment aVar) {
        C31909g gVar = aVar.f80305g;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatFreSingularAdapter");
        }
        return gVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ C31909g m119470d(ChooseCustomRepeatFragment aVar) {
        C31909g gVar = aVar.f80304f;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatFreAdapter");
        }
        return gVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "index", "", "onItemSelected"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a$d */
    public static final class C31634d implements AbstractC31917h {

        /* renamed from: a */
        final /* synthetic */ ChooseCustomRepeatFragment f80313a;

        C31634d(ChooseCustomRepeatFragment aVar) {
            this.f80313a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31917h
        /* renamed from: a */
        public final void mo115161a(int i) {
            RepeatMode repeatMode = this.f80313a.f80306h;
            Integer num = this.f80313a.f80307i.get(i);
            Intrinsics.checkExpressionValueIsNotNull(num, "mRepeatModelTypes.get(index)");
            repeatMode.setRepeatType(num.intValue());
            this.f80313a.f80302b = i;
            this.f80313a.mo115158c();
            this.f80313a.mo115159d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCustomRepeatFragment$initTitleBar$2", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a$g */
    public static final class C31637g extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ ChooseCustomRepeatFragment f80316a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f80316a.mo115157b();
            CustomRepeatFragmentAction a = ChooseCustomRepeatFragment.m119466a(this.f80316a);
            EventRecurrence er = this.f80316a.f80306h.toER();
            Intrinsics.checkExpressionValueIsNotNull(er, "mRepeatMode.toER()");
            a.mo114356a(er);
            this.f80316a.mo115160f();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31637g(ChooseCustomRepeatFragment aVar, String str, int i) {
            super(str, i);
            this.f80316a = aVar;
        }
    }

    /* renamed from: b */
    private final ArrayList<String> m119468b(int i) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(C32634ae.m125180a(R.plurals.Calendar_Plural_RRuleDay, i));
        arrayList.add(C32634ae.m125180a(R.plurals.Calendar_Plural_RRuleWeek, i));
        arrayList.add(C32634ae.m125180a(R.plurals.Calendar_Plural_RRuleMonth, i));
        arrayList.add(C32634ae.m125180a(R.plurals.Calendar_Plural_RRuleYear, i));
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "index", "", "onItemSelected"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a$e */
    public static final class C31635e implements AbstractC31917h {

        /* renamed from: a */
        final /* synthetic */ ChooseCustomRepeatFragment f80314a;

        C31635e(ChooseCustomRepeatFragment aVar) {
            this.f80314a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31917h
        /* renamed from: a */
        public final void mo115161a(int i) {
            Integer a = ChooseCustomRepeatFragment.m119467b(this.f80314a).mo116507b(i);
            WheelView wheelView = (WheelView) this.f80314a.mo109250a(R.id.wheel_repeat_frequency_unit);
            Intrinsics.checkExpressionValueIsNotNull(wheelView, "wheel_repeat_frequency_unit");
            int currentItem = wheelView.getCurrentItem();
            if (a != null && a.intValue() == 1) {
                WheelView wheelView2 = (WheelView) this.f80314a.mo109250a(R.id.wheel_repeat_frequency_unit);
                Intrinsics.checkExpressionValueIsNotNull(wheelView2, "wheel_repeat_frequency_unit");
                wheelView2.setAdapter(ChooseCustomRepeatFragment.m119469c(this.f80314a));
            } else {
                WheelView wheelView3 = (WheelView) this.f80314a.mo109250a(R.id.wheel_repeat_frequency_unit);
                Intrinsics.checkExpressionValueIsNotNull(wheelView3, "wheel_repeat_frequency_unit");
                wheelView3.setAdapter(ChooseCustomRepeatFragment.m119470d(this.f80314a));
            }
            WheelView wheelView4 = (WheelView) this.f80314a.mo109250a(R.id.wheel_repeat_frequency_unit);
            Intrinsics.checkExpressionValueIsNotNull(wheelView4, "wheel_repeat_frequency_unit");
            wheelView4.setCurrentItem(currentItem);
            RepeatMode repeatMode = this.f80314a.f80306h;
            Integer a2 = ChooseCustomRepeatFragment.m119467b(this.f80314a).mo116507b(i);
            Intrinsics.checkExpressionValueIsNotNull(a2, "mRepeatNumAdapter.getItem(index)");
            repeatMode.setInterval(a2.intValue());
            this.f80314a.mo115159d();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f80308k) {
            m119471g();
            m119475k();
            m119473i();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_event_custom_repeat, (ViewGroup) null);
    }

    /* renamed from: a */
    public final void mo115156a(CalendarDate calendarDate, boolean z, RepeatMode repeatMode) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "startTime");
        this.f80310m = repeatMode;
        this.f80309l = calendarDate;
        m119477m();
        this.f80306h.setMonthDaySingle(z);
        m119474j();
        mo115158c();
    }

    public ChooseCustomRepeatFragment(CustomRepeatFragmentAction bVar, CalendarDate calendarDate, boolean z, RepeatMode repeatMode) {
        Intrinsics.checkParameterIsNotNull(bVar, "action");
        Intrinsics.checkParameterIsNotNull(calendarDate, "startCalendarDate");
        this.f80309l = new CalendarDate();
        RepeatMode repeatMode2 = new RepeatMode();
        this.f80306h = repeatMode2;
        this.f80307i = new SparseArray<>();
        this.f80301a = bVar;
        this.f80309l = calendarDate;
        this.f80308k = false;
        repeatMode2.setMonthDaySingle(z);
        this.f80310m = repeatMode;
    }
}
