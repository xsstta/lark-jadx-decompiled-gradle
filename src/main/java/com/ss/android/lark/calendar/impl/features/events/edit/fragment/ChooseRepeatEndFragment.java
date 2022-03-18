package com.ss.android.lark.calendar.impl.features.events.edit.fragment;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.events.edit.data.RepeatEndFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.MeetingRoomStrategyHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IRepeatEndChosenListener;
import com.ss.android.lark.calendar.impl.features.events.edit.p1517b.p1520c.AbstractC31542e;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.ListenableLinearLayout;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.C31920k;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.ttm.player.MediaPlayer;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0001\u0016\u0018\u0000 >2\u00020\u0001:\u0002>?B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u0006\u0010\u001e\u001a\u00020\u001cJ\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J\b\u0010\"\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001cH\u0002J\b\u0010%\u001a\u00020\u000fH\u0002J\b\u0010&\u001a\u00020\u000fH\u0002J\b\u0010'\u001a\u00020\u000fH\u0002J\b\u0010(\u001a\u00020\u000fH\u0016J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00103\u001a\u00020\u001cH\u0002J\u000e\u00104\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0006J\b\u00105\u001a\u00020\u001cH\u0002J\u0010\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020 H\u0002J\u0010\u00108\u001a\u00020\u001c2\u0006\u00107\u001a\u00020 H\u0002J\b\u00109\u001a\u00020\u001cH\u0002J\b\u0010:\u001a\u00020\u001cH\u0002J\b\u0010;\u001a\u00020\u001cH\u0002J\u0006\u0010<\u001a\u00020\u001cJ\b\u0010=\u001a\u00020\u001cH\u0002R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatEndFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "action", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatEndFragment$RepeatEndFragmentAction;", "repeatEndData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/RepeatEndFragmentData;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatEndFragment$RepeatEndFragmentAction;Lcom/ss/android/lark/calendar/impl/features/events/edit/data/RepeatEndFragmentData;)V", "mCurrentCalendar", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mFinishBtnAction", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "mHideTimeWheelsAnimation", "Landroid/view/animation/TranslateAnimation;", "mIsFromLocalRecover", "", "mRepeatEndAction", "mRepeatEndData", "mShowTimeWheelAction", "Ljava/lang/Runnable;", "mShowTimeWheelsAnimation", "mTimeChosenListener", "com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatEndFragment$mTimeChosenListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatEndFragment$mTimeChosenListener$1;", "mUnusableFinishBtnAction", "mWheelTime", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/pickerview/YearMonthDayWheelTime;", "backToEditView", "", "changeViewShowColor", "dismissTimeWheels", "generateShowText", "", "initContentView", "initListener", "initTitleBar", "initView", "isOutOfMeetingRoomLimitDate", "isRepeatEndBeforeStart", "isRepeatLimitEndBeforeStart", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "recoverData", "refreshData", "setData", "setRepeatContainerEndInvalidText", "repeatEndTip", "setRepeatContainerEndText", "setRepeatContainerTip", "showEndBeforeStartStatus", "showRoomInvalidateStatus", "showTimeWheels", "showValidateStatus", "Companion", "RepeatEndFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d */
public final class ChooseRepeatEndFragment extends View$OnClickListenerC31538b {

    /* renamed from: i */
    public static final Companion f80477i = new Companion(null);

    /* renamed from: a */
    public Runnable f80478a;

    /* renamed from: b */
    public C31920k f80479b;

    /* renamed from: e */
    public TranslateAnimation f80480e;

    /* renamed from: f */
    public CalendarDate f80481f;

    /* renamed from: g */
    public RepeatEndFragmentData f80482g;

    /* renamed from: h */
    public RepeatEndFragmentAction f80483h;

    /* renamed from: j */
    private boolean f80484j;

    /* renamed from: k */
    private TranslateAnimation f80485k;

    /* renamed from: l */
    private AbstractC32629e f80486l;

    /* renamed from: m */
    private AbstractC32629e f80487m;

    /* renamed from: n */
    private final C31666g f80488n;

    /* renamed from: o */
    private HashMap f80489o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatEndFragment$RepeatEndFragmentAction;", "", "onBackPressed", "", "onSavePressed", "isNeverEnd", "", "year", "", "month", "day", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d$b */
    public interface RepeatEndFragmentAction {
        /* renamed from: a */
        void mo114386a();

        /* renamed from: a */
        void mo114387a(boolean z, int i, int i2, int i3);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f80489o == null) {
            this.f80489o = new HashMap();
        }
        View view = (View) this.f80489o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80489o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f80489o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatEndFragment$Companion;", "", "()V", "ONE_DAY_SECONDS", "", "REPEAT_END_DEFAULT_END_DAYS", "", "TIME_WHEEL_ANIM_DURATION", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: n */
    private final void m119755n() {
        m119757p();
        m119756o();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        m119759r();
        return true;
    }

    public ChooseRepeatEndFragment() {
        this.f80481f = new CalendarDate();
        this.f80488n = new C31666g(this);
        this.f80484j = true;
    }

    /* renamed from: q */
    private final void m119758q() {
        ((UDSwitch) mo109250a(R.id.switch_view_repeat_end)).setOnCheckedChangeListener(new C31662c(this));
    }

    /* renamed from: r */
    private final void m119759r() {
        mo115352h();
        RepeatEndFragmentAction bVar = this.f80483h;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndAction");
        }
        bVar.mo114386a();
        m119760s();
    }

    /* renamed from: i */
    private final boolean m119750i() {
        RepeatEndFragmentData fVar = this.f80482g;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        CalendarDate b = fVar.mo115102b();
        if (b == null) {
            return false;
        }
        RepeatEndFragmentData fVar2 = this.f80482g;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        if (fVar2.mo115107e() || this.f80481f.getJulianDay() > b.getJulianDay()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final boolean m119751j() {
        RepeatEndFragmentData fVar = this.f80482g;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        if (!fVar.mo115107e()) {
            int julianDay = this.f80481f.getJulianDay();
            RepeatEndFragmentData fVar2 = this.f80482g;
            if (fVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
            }
            if (julianDay < fVar2.mo115099a().getJulianDay()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private final boolean m119752k() {
        RepeatEndFragmentData fVar = this.f80482g;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        CalendarDate b = fVar.mo115102b();
        if (b == null) {
            return false;
        }
        int julianDay = b.getJulianDay();
        RepeatEndFragmentData fVar2 = this.f80482g;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        if (julianDay < fVar2.mo115099a().getJulianDay()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private final void m119753l() {
        boolean k = m119752k();
        MeetingRoomStrategyHelper fVar = MeetingRoomStrategyHelper.f79934a;
        RepeatEndFragmentData fVar2 = this.f80482g;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        CalendarDate b = fVar2.mo115102b();
        RepeatEndFragmentData fVar3 = this.f80482g;
        if (fVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        String c = fVar3.mo115104c();
        RepeatEndFragmentData fVar4 = this.f80482g;
        if (fVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        String a = fVar.mo114627a(b, c, k, fVar4.mo115106d());
        if (!k) {
            m119747a(a);
        } else {
            m119749b(a);
        }
    }

    /* renamed from: t */
    private final String m119761t() {
        CalendarDate calendarDate = new CalendarDate();
        RepeatEndFragmentData fVar = this.f80482g;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        calendarDate.setYear(fVar.mo115109f());
        RepeatEndFragmentData fVar2 = this.f80482g;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        calendarDate.setMonth(fVar2.mo115110g());
        RepeatEndFragmentData fVar3 = this.f80482g;
        if (fVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        calendarDate.setMonthDay(fVar3.mo115111h());
        String a = C32646c.m125258a(calendarDate, calendarDate.getTimeZone(), true);
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDateTimeShowUtil…ate, date.timeZone, true)");
        return a;
    }

    /* renamed from: b */
    public final void mo115347b() {
        if (m119750i()) {
            mo115348c();
        } else if (m119751j()) {
            m119754m();
        } else {
            mo115349d();
        }
    }

    /* renamed from: g */
    public final void mo115351g() {
        Runnable runnable = this.f80478a;
        if (runnable == null) {
            this.f80478a = new RunnableC31668i(this);
            ((ListenableLinearLayout) mo109250a(R.id.ll_repeat_time_choose_container)).setOnSizeChangedListener(new C31669j(this));
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: h */
    public final void mo115352h() {
        if (this.f80485k == null) {
            ListenableLinearLayout listenableLinearLayout = (ListenableLinearLayout) mo109250a(R.id.ll_repeat_time_choose_container);
            Intrinsics.checkExpressionValueIsNotNull(listenableLinearLayout, "ll_repeat_time_choose_container");
            TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) listenableLinearLayout.getHeight());
            this.f80485k = translateAnimation;
            if (translateAnimation != null) {
                translateAnimation.setDuration((long) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL);
            }
        }
        ((ListenableLinearLayout) mo109250a(R.id.ll_repeat_time_choose_container)).startAnimation(this.f80485k);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d$i */
    public static final class RunnableC31668i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChooseRepeatEndFragment f80495a;

        RunnableC31668i(ChooseRepeatEndFragment dVar) {
            this.f80495a = dVar;
        }

        public final void run() {
            if (this.f80495a.f80480e == null) {
                ChooseRepeatEndFragment dVar = this.f80495a;
                ListenableLinearLayout listenableLinearLayout = (ListenableLinearLayout) this.f80495a.mo109250a(R.id.ll_repeat_time_choose_container);
                Intrinsics.checkExpressionValueIsNotNull(listenableLinearLayout, "ll_repeat_time_choose_container");
                dVar.f80480e = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) listenableLinearLayout.getHeight(), BitmapDescriptorFactory.HUE_RED);
                TranslateAnimation translateAnimation = this.f80495a.f80480e;
                if (translateAnimation != null) {
                    translateAnimation.setDuration((long) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL);
                }
            }
            ((ListenableLinearLayout) this.f80495a.mo109250a(R.id.ll_repeat_time_choose_container)).startAnimation(this.f80495a.f80480e);
        }
    }

    /* renamed from: m */
    private final void m119754m() {
        ((TextView) mo109250a(R.id.tv_repeat_end_desc)).setTextColor(C32634ae.m125178a(R.color.function_danger_500));
        LinearLayout linearLayout = (LinearLayout) mo109250a(R.id.ll_change_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_change_repeat_end_date");
        linearLayout.setVisibility(0);
        TextView textView = (TextView) mo109250a(R.id.tv_change_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_change_repeat_end_date");
        textView.setVisibility(8);
        TextView textView2 = (TextView) mo109250a(R.id.tv_err_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_err_repeat_end_date");
        textView2.setVisibility(0);
        ((CommonTitleBar) mo109250a(R.id.repeat_end_title_bar)).removeAllActions();
        CommonTitleBar commonTitleBar = (CommonTitleBar) mo109250a(R.id.repeat_end_title_bar);
        AbstractC32629e eVar = this.f80486l;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnusableFinishBtnAction");
        }
        commonTitleBar.addAction(eVar);
    }

    /* renamed from: o */
    private final void m119756o() {
        View view;
        UDSwitch uDSwitch = (UDSwitch) mo109250a(R.id.switch_view_repeat_end);
        RepeatEndFragmentData fVar = this.f80482g;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        uDSwitch.setCheckedIgnoreEvent(fVar.mo115107e());
        C31920k kVar = new C31920k(getContext(), (FrameLayout) mo109250a(R.id.fl_time_picker), this.f80488n);
        this.f80479b = kVar;
        if (kVar != null) {
            kVar.mo116539d();
        }
        FrameLayout frameLayout = (FrameLayout) mo109250a(R.id.fl_time_picker);
        C31920k kVar2 = this.f80479b;
        if (kVar2 != null) {
            view = kVar2.mo116538c();
        } else {
            view = null;
        }
        frameLayout.addView(view, 0);
    }

    /* renamed from: p */
    private final void m119757p() {
        this.f80486l = new C31663d(C32634ae.m125182b(R.string.Calendar_Common_Done), R.color.text_disable);
        this.f80487m = new C31664e(this, C32634ae.m125182b(R.string.Calendar_Common_Done), R.color.primary_pri_500);
        ((CommonTitleBar) mo109250a(R.id.repeat_end_title_bar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.repeat_end_title_bar)).setTitle(R.string.Calendar_Edit_EndsDate);
        ((CommonTitleBar) mo109250a(R.id.repeat_end_title_bar)).setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        ((CommonTitleBar) mo109250a(R.id.repeat_end_title_bar)).setLeftClickListener(new C31665f(this));
    }

    /* renamed from: c */
    public final void mo115348c() {
        ((TextView) mo109250a(R.id.tv_repeat_end_desc)).setTextColor(C32634ae.m125178a(R.color.function_danger_500));
        LinearLayout linearLayout = (LinearLayout) mo109250a(R.id.ll_change_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_change_repeat_end_date");
        linearLayout.setVisibility(0);
        TextView textView = (TextView) mo109250a(R.id.tv_change_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_change_repeat_end_date");
        textView.setVisibility(0);
        TextView textView2 = (TextView) mo109250a(R.id.tv_err_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_err_repeat_end_date");
        textView2.setVisibility(8);
        ((CommonTitleBar) mo109250a(R.id.repeat_end_title_bar)).removeAllActions();
        CommonTitleBar commonTitleBar = (CommonTitleBar) mo109250a(R.id.repeat_end_title_bar);
        AbstractC32629e eVar = this.f80486l;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnusableFinishBtnAction");
        }
        commonTitleBar.addAction(eVar);
        m119753l();
    }

    /* renamed from: d */
    public final void mo115349d() {
        ((TextView) mo109250a(R.id.tv_repeat_end_desc)).setTextColor(C32634ae.m125178a(R.color.text_placeholder));
        LinearLayout linearLayout = (LinearLayout) mo109250a(R.id.ll_change_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_change_repeat_end_date");
        linearLayout.setVisibility(8);
        ((CommonTitleBar) mo109250a(R.id.repeat_end_title_bar)).removeAllActions();
        CommonTitleBar commonTitleBar = (CommonTitleBar) mo109250a(R.id.repeat_end_title_bar);
        AbstractC32629e eVar = this.f80487m;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFinishBtnAction");
        }
        commonTitleBar.addAction(eVar);
    }

    /* renamed from: s */
    private final void m119760s() {
        RepeatEndFragmentData fVar = this.f80482g;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        if (fVar.mo115107e()) {
            ((UDSwitch) mo109250a(R.id.switch_view_repeat_end)).setCheckedIgnoreEvent(true);
            TextView textView = (TextView) mo109250a(R.id.tv_repeat_end_desc);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_repeat_end_desc");
            textView.setText(C32634ae.m125182b(R.string.Calendar_RRule_NeverEnds));
            C31920k kVar = this.f80479b;
            if (kVar != null) {
                kVar.mo116539d();
            }
        } else {
            ((UDSwitch) mo109250a(R.id.switch_view_repeat_end)).setCheckedIgnoreEvent(false);
            TextView textView2 = (TextView) mo109250a(R.id.tv_repeat_end_desc);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_repeat_end_desc");
            textView2.setText(m119761t());
            CalendarDate calendarDate = new CalendarDate();
            RepeatEndFragmentData fVar2 = this.f80482g;
            if (fVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
            }
            calendarDate.setMonthDay(fVar2.mo115111h());
            RepeatEndFragmentData fVar3 = this.f80482g;
            if (fVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
            }
            calendarDate.setMonth(fVar3.mo115110g());
            RepeatEndFragmentData fVar4 = this.f80482g;
            if (fVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
            }
            calendarDate.setYear(fVar4.mo115109f());
            C31920k kVar2 = this.f80479b;
            if (kVar2 != null) {
                kVar2.mo116536a(calendarDate);
            }
            C31920k kVar3 = this.f80479b;
            if (kVar3 != null) {
                kVar3.mo116540e();
            }
        }
        mo115349d();
    }

    /* renamed from: f */
    public final void mo115350f() {
        String str;
        CalendarDate calendarDate = new CalendarDate();
        this.f80481f = calendarDate;
        this.f80481f.setTimeInSeconds((calendarDate.getTimeInSeconds() / 86400) * 86400);
        RepeatEndFragmentData fVar = this.f80482g;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        if (!fVar.mo115107e()) {
            CalendarDate calendarDate2 = this.f80481f;
            RepeatEndFragmentData fVar2 = this.f80482g;
            if (fVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
            }
            calendarDate2.setYear(fVar2.mo115109f());
            CalendarDate calendarDate3 = this.f80481f;
            RepeatEndFragmentData fVar3 = this.f80482g;
            if (fVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
            }
            calendarDate3.setMonth(fVar3.mo115110g());
            CalendarDate calendarDate4 = this.f80481f;
            RepeatEndFragmentData fVar4 = this.f80482g;
            if (fVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
            }
            calendarDate4.setMonthDay(fVar4.mo115111h());
            C31920k kVar = this.f80479b;
            if (kVar != null) {
                kVar.mo116540e();
            }
            C31920k kVar2 = this.f80479b;
            if (kVar2 != null) {
                kVar2.mo116536a(this.f80481f);
            }
            TextView textView = (TextView) mo109250a(R.id.tv_repeat_end_desc);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_repeat_end_desc");
            C31920k kVar3 = this.f80479b;
            if (kVar3 != null) {
                str = kVar3.mo116537b();
            } else {
                str = null;
            }
            textView.setText(str);
        } else {
            RepeatEndFragmentData fVar5 = this.f80482g;
            if (fVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
            }
            CalendarDate a = fVar5.mo115099a();
            if (a != null) {
                this.f80481f.setTimeInSeconds(a.getTimeInSeconds());
            }
            this.f80481f.setTimeInSeconds(((this.f80481f.getTimeInSeconds() / 86400) * 86400) + 7862400);
            C31920k kVar4 = this.f80479b;
            if (kVar4 != null) {
                kVar4.mo116539d();
            }
            C31920k kVar5 = this.f80479b;
            if (kVar5 != null) {
                kVar5.mo116536a(this.f80481f);
            }
            TextView textView2 = (TextView) mo109250a(R.id.tv_repeat_end_desc);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_repeat_end_desc");
            textView2.setText(C32634ae.m125182b(R.string.Calendar_RRule_NeverEnds));
        }
        UDSwitch uDSwitch = (UDSwitch) mo109250a(R.id.switch_view_repeat_end);
        RepeatEndFragmentData fVar6 = this.f80482g;
        if (fVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        uDSwitch.setCheckedIgnoreEvent(fVar6.mo115107e());
        mo115347b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatEndFragment$initTitleBar$3", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d$f */
    public static final class C31665f extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ChooseRepeatEndFragment f80492a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31665f(ChooseRepeatEndFragment dVar) {
            this.f80492a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f80492a.mo113714e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatEndFragment$mTimeChosenListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IRepeatEndChosenListener;", "onTimeChosen", "", "calendarDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d$g */
    public static final class C31666g implements IRepeatEndChosenListener {

        /* renamed from: a */
        final /* synthetic */ ChooseRepeatEndFragment f80493a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31666g(ChooseRepeatEndFragment dVar) {
            this.f80493a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IRepeatEndChosenListener
        /* renamed from: a */
        public void mo114658a(CalendarDate calendarDate) {
            String str;
            Intrinsics.checkParameterIsNotNull(calendarDate, "calendarDate");
            ((UDSwitch) this.f80493a.mo109250a(R.id.switch_view_repeat_end)).setCheckedIgnoreEvent(false);
            C31920k kVar = this.f80493a.f80479b;
            if (kVar != null) {
                kVar.mo116540e();
            }
            this.f80493a.f80481f = calendarDate;
            TextView textView = (TextView) this.f80493a.mo109250a(R.id.tv_repeat_end_desc);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_repeat_end_desc");
            C31920k kVar2 = this.f80493a.f80479b;
            if (kVar2 != null) {
                str = kVar2.mo116537b();
            } else {
                str = null;
            }
            textView.setText(str);
            ChooseRepeatEndFragment.m119746a(this.f80493a).mo115105c(this.f80493a.f80481f.getMonthDay());
            ChooseRepeatEndFragment.m119746a(this.f80493a).mo115103b(this.f80493a.f80481f.getMonth());
            ChooseRepeatEndFragment.m119746a(this.f80493a).mo115100a(this.f80493a.f80481f.getYear());
            ChooseRepeatEndFragment.m119746a(this.f80493a).mo115101a(false);
            this.f80493a.mo115347b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatEndFragment$setRepeatContainerEndText$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "view", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d$h */
    public static final class C31667h extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ ChooseRepeatEndFragment f80494a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31667h(ChooseRepeatEndFragment dVar) {
            this.f80494a = dVar;
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(C32634ae.m125178a(R.color.primary_pri_500));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            CalendarDate b = ChooseRepeatEndFragment.m119746a(this.f80494a).mo115102b();
            if (b != null) {
                ChooseRepeatEndFragment.m119746a(this.f80494a).mo115100a(b.getYear());
                ChooseRepeatEndFragment.m119746a(this.f80494a).mo115103b(b.getMonth());
                ChooseRepeatEndFragment.m119746a(this.f80494a).mo115105c(b.getMonthDay());
                ChooseRepeatEndFragment.m119746a(this.f80494a).mo115101a(false);
                this.f80494a.mo115350f();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatEndFragment$showTimeWheels$2", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/ISizeChangedListener;", "mOnRenderAction", "Ljava/lang/Runnable;", "getMOnRenderAction$calendar_impl_release", "()Ljava/lang/Runnable;", "setMOnRenderAction$calendar_impl_release", "(Ljava/lang/Runnable;)V", "onSizeChanged", "", "w", "", C14002h.f36692e, "oldw", "oldh", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d$j */
    public static final class C31669j implements AbstractC31542e {

        /* renamed from: a */
        final /* synthetic */ ChooseRepeatEndFragment f80496a;

        /* renamed from: b */
        private Runnable f80497b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31669j(ChooseRepeatEndFragment dVar) {
            this.f80496a = dVar;
            this.f80497b = dVar.f80478a;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.p1517b.p1520c.AbstractC31542e
        /* renamed from: a */
        public void mo114659a(int i, int i2, int i3, int i4) {
            Runnable runnable;
            if (i4 == 0 && i2 != 0 && (runnable = this.f80497b) != null) {
                if (runnable != null) {
                    runnable.run();
                }
                this.f80497b = null;
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RepeatEndFragmentData m119746a(ChooseRepeatEndFragment dVar) {
        RepeatEndFragmentData fVar = dVar.f80482g;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndData");
        }
        return fVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ RepeatEndFragmentAction m119748b(ChooseRepeatEndFragment dVar) {
        RepeatEndFragmentAction bVar = dVar.f80483h;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatEndAction");
        }
        return bVar;
    }

    /* renamed from: b */
    private final void m119749b(String str) {
        TextView textView = (TextView) mo109250a(R.id.tv_change_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_change_repeat_end_date");
        textView.setText(str);
    }

    /* renamed from: a */
    public final void mo115346a(RepeatEndFragmentData fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "repeatEndData");
        this.f80482g = fVar;
        mo115351g();
        mo115350f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatEndFragment$initTitleBar$2", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d$e */
    public static final class C31664e extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ ChooseRepeatEndFragment f80491a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f80491a.mo115352h();
            ChooseRepeatEndFragment.m119748b(this.f80491a).mo114387a(ChooseRepeatEndFragment.m119746a(this.f80491a).mo115107e(), ChooseRepeatEndFragment.m119746a(this.f80491a).mo115109f(), ChooseRepeatEndFragment.m119746a(this.f80491a).mo115110g(), ChooseRepeatEndFragment.m119746a(this.f80491a).mo115111h());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31664e(ChooseRepeatEndFragment dVar, String str, int i) {
            super(str, i);
            this.f80491a = dVar;
        }
    }

    /* renamed from: a */
    private final void m119747a(String str) {
        String str2 = str + C32634ae.m125182b(R.string.Calendar_Edit_AutoAdjust);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new C31667h(this), str.length(), str2.length(), 33);
        TextView textView = (TextView) mo109250a(R.id.tv_change_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_change_repeat_end_date");
        textView.setText(spannableStringBuilder);
        TextView textView2 = (TextView) mo109250a(R.id.tv_change_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_change_repeat_end_date");
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView3 = (TextView) mo109250a(R.id.tv_change_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "tv_change_repeat_end_date");
        textView3.setHighlightColor(C32634ae.m125178a(R.color.transparent));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatEndFragment$initTitleBar$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d$d */
    public static final class C31663d extends AbstractC32629e {
        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
        }

        C31663d(String str, int i) {
            super(str, i);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f80484j) {
            m119755n();
            mo115350f();
            m119758q();
            mo115351g();
        }
    }

    public ChooseRepeatEndFragment(RepeatEndFragmentAction bVar, RepeatEndFragmentData fVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "action");
        Intrinsics.checkParameterIsNotNull(fVar, "repeatEndData");
        this.f80481f = new CalendarDate();
        this.f80488n = new C31666g(this);
        this.f80483h = bVar;
        this.f80482g = fVar;
        this.f80484j = false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d$c */
    public static final class C31662c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ ChooseRepeatEndFragment f80490a;

        C31662c(ChooseRepeatEndFragment dVar) {
            this.f80490a = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str;
            if (z) {
                C31920k kVar = this.f80490a.f80479b;
                if (kVar != null) {
                    kVar.mo116539d();
                }
                TextView textView = (TextView) this.f80490a.mo109250a(R.id.tv_repeat_end_desc);
                Intrinsics.checkExpressionValueIsNotNull(textView, "tv_repeat_end_desc");
                textView.setText(C32634ae.m125182b(R.string.Calendar_RRule_NeverEnds));
                if (ChooseRepeatEndFragment.m119746a(this.f80490a).mo115102b() != null) {
                    this.f80490a.mo115348c();
                    return;
                }
                this.f80490a.mo115349d();
                ChooseRepeatEndFragment.m119746a(this.f80490a).mo115101a(true);
                return;
            }
            C31920k kVar2 = this.f80490a.f80479b;
            if (kVar2 != null) {
                kVar2.mo116540e();
            }
            TextView textView2 = (TextView) this.f80490a.mo109250a(R.id.tv_repeat_end_desc);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_repeat_end_desc");
            C31920k kVar3 = this.f80490a.f80479b;
            if (kVar3 != null) {
                str = kVar3.mo116537b();
            } else {
                str = null;
            }
            textView2.setText(str);
            ChooseRepeatEndFragment.m119746a(this.f80490a).mo115100a(this.f80490a.f80481f.getYear());
            ChooseRepeatEndFragment.m119746a(this.f80490a).mo115103b(this.f80490a.f80481f.getMonth());
            ChooseRepeatEndFragment.m119746a(this.f80490a).mo115105c(this.f80490a.f80481f.getMonthDay());
            ChooseRepeatEndFragment.m119746a(this.f80490a).mo115101a(false);
            this.f80490a.mo115347b();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_event_repeat_end, (ViewGroup) null);
    }
}
