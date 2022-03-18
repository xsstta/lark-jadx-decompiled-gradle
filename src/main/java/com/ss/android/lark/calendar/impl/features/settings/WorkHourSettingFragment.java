package com.ss.android.lark.calendar.impl.features.settings;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.settings.widget.DialogC32478b;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarSettingHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSpan;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001EB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dH\u0002J\b\u0010)\u001a\u00020'H\u0002J\b\u0010*\u001a\u00020'H\u0002J\b\u0010+\u001a\u00020'H\u0002J\b\u0010,\u001a\u00020'H\u0002J\b\u0010-\u001a\u00020'H\u0002J\b\u0010.\u001a\u00020'H\u0002J\b\u0010/\u001a\u00020'H\u0002J\b\u00100\u001a\u00020'H\u0002J\u0010\u00101\u001a\u00020'2\u0006\u00102\u001a\u00020\u001dH\u0002J\b\u00103\u001a\u00020'H\u0002J\b\u00104\u001a\u00020'H\u0002J\b\u00105\u001a\u00020'H\u0002J\b\u00106\u001a\u00020\u001bH\u0016J&\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u001a\u0010?\u001a\u00020'2\u0006\u0010@\u001a\u0002082\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010A\u001a\u00020'H\u0002J\u0016\u0010B\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010C\u001a\u00020'2\u0006\u0010D\u001a\u00020\u001bR*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000eX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010X.¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R6\u0010\u0015\u001a(\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\b0\b \u0016*\u0014\u0012\u000e\b\u0001\u0012\n \u0016*\u0004\u0018\u00010\b0\b\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dXD¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dXD¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R6\u0010#\u001a(\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\b0\b \u0016*\u0014\u0012\u000e\b\u0001\u0012\n \u0016*\u0004\u0018\u00010\b0\b\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0017R6\u0010$\u001a(\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\b0\b \u0016*\u0014\u0012\u000e\b\u0001\u0012\n \u0016*\u0004\u0018\u00010\b0\b\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010%\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/WorkHourSettingFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "delegate", "Lcom/ss/android/lark/calendar/impl/features/settings/WorkHourSettingFragment$Delegate;", "workHourSettingData", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting;", "firstDayOfWeek", "", "(Lcom/ss/android/lark/calendar/impl/features/settings/WorkHourSettingFragment$Delegate;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting;Ljava/lang/String;)V", "mButtonListMap", "Ljava/util/HashMap;", "Landroid/widget/Button;", "Landroid/widget/RelativeLayout;", "Lkotlin/collections/HashMap;", "mDayWeekBtnArray", "", "[Landroid/widget/Button;", "mDayWeekBtnState", "", "mDelegate", "mFirstDayArray", "kotlin.jvm.PlatformType", "[Ljava/lang/String;", "mFirstDayOfWeek", "mHitPointArray", "mIsFirstEnter", "", "mLineHeight", "", "mOriginalEndTime", "mOriginalStartTime", "mTextMargin", "mTimePicker", "Lcom/ss/android/lark/calendar/impl/features/settings/widget/TimePickerMenu;", "mWeekDays", "mWeekStrs", "mWorkHourSettingData", "changeButtonStateByTag", "", "tagValue", "initButtonListMap", "initDayWeekListener", "initEnableListener", "initEnableWorkHour", "initListener", "initTimePicker", "initTitleBar", "initView", "initWeekDay", "startOfWeekIndex", "initWorkHourContainer", "initWorkHourListByMap", "modifyWorkHourSettingData", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshView", "refreshViewData", "setIsFirstEnter", "isFirstEnter", "Delegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.e */
public final class WorkHourSettingFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public Delegate f83218a;

    /* renamed from: b */
    public CalendarWorkHourSetting f83219b;

    /* renamed from: e */
    public String f83220e;

    /* renamed from: f */
    public DialogC32478b f83221f;

    /* renamed from: g */
    public final String[] f83222g = C32634ae.m125183c(R.array.weekly);

    /* renamed from: h */
    public boolean f83223h = true;

    /* renamed from: i */
    public final boolean[] f83224i = {false, false, false, false, false, false, false};

    /* renamed from: j */
    public final String[] f83225j = {"mon", "tue", "wed", "thur", "fri", "sat", "sun"};

    /* renamed from: k */
    public Button[] f83226k;

    /* renamed from: l */
    public HashMap<Button, RelativeLayout> f83227l = new HashMap<>();

    /* renamed from: m */
    public final int f83228m = 540;

    /* renamed from: n */
    public final int f83229n = 1020;

    /* renamed from: o */
    private final String[] f83230o = C32634ae.m125183c(R.array.weeks_abbr);

    /* renamed from: p */
    private final String[] f83231p = C32634ae.m125183c(R.array.start_of_week);

    /* renamed from: q */
    private int f83232q;

    /* renamed from: r */
    private int f83233r;

    /* renamed from: s */
    private HashMap f83234s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/WorkHourSettingFragment$Delegate;", "", "onBackPressed", "", "onSaveData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.e$a */
    public interface Delegate {
        /* renamed from: a */
        void mo118556a();

        /* renamed from: a */
        void mo118557a(CalendarWorkHourSetting calendarWorkHourSetting);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f83234s == null) {
            this.f83234s = new HashMap();
        }
        View view = (View) this.f83234s.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f83234s.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f83234s;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    /* renamed from: k */
    private final void m123955k() {
        m123957m();
        m123956l();
    }

    /* renamed from: n */
    private final void m123958n() {
        m123950f();
        m123951g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\u0003H\u0016J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/WorkHourSettingFragment$initTimePicker$1", "Lcom/ss/android/lark/calendar/impl/features/settings/widget/TimePickerMenu$ActionListener;", "changeWorkTime", "", "startMinute", "", "endMinute", "dayWeekBtn", "Landroid/widget/Button;", "onActionCancel", "onActionPerform", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.e$e */
    public static final class C32468e implements DialogC32478b.AbstractC32483a {

        /* renamed from: a */
        final /* synthetic */ WorkHourSettingFragment f83242a;

        @Override // com.ss.android.lark.calendar.impl.features.settings.widget.DialogC32478b.AbstractC32483a
        /* renamed from: a */
        public void mo118580a() {
            WorkHourSettingFragment.m123941a(this.f83242a).dismiss();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32468e(WorkHourSettingFragment eVar) {
            this.f83242a = eVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.settings.e$e$b */
        static final class DialogInterface$OnClickListenerC32470b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C32468e f83246a;

            /* renamed from: b */
            final /* synthetic */ int f83247b;

            /* renamed from: c */
            final /* synthetic */ int f83248c;

            /* renamed from: d */
            final /* synthetic */ Button f83249d;

            DialogInterface$OnClickListenerC32470b(C32468e eVar, int i, int i2, Button button) {
                this.f83246a = eVar;
                this.f83247b = i;
                this.f83248c = i2;
                this.f83249d = button;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f83246a.mo118582b(this.f83247b, this.f83248c, this.f83249d);
                CalendarHitPoint.m124157q("no");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.settings.e$e$a */
        static final class DialogInterface$OnClickListenerC32469a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C32468e f83243a;

            /* renamed from: b */
            final /* synthetic */ int f83244b;

            /* renamed from: c */
            final /* synthetic */ int f83245c;

            DialogInterface$OnClickListenerC32469a(C32468e eVar, int i, int i2) {
                this.f83243a = eVar;
                this.f83244b = i;
                this.f83245c = i2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                for (Map.Entry<Button, RelativeLayout> entry : this.f83243a.f83242a.f83227l.entrySet()) {
                    HashMap<CalendarSetting.DayOfWeek, CalendarWorkHourSpan> workHourItems = WorkHourSettingFragment.m123944c(this.f83243a.f83242a).getWorkHourItems();
                    Object tag = entry.getKey().getTag();
                    if (tag != null) {
                        CalendarWorkHourSpan calendarWorkHourSpan = workHourItems.get(CalendarSetting.DayOfWeek.forNumber(((Integer) tag).intValue()));
                        if (calendarWorkHourSpan != null) {
                            calendarWorkHourSpan.setStartMinute(this.f83244b);
                        }
                        if (calendarWorkHourSpan != null) {
                            calendarWorkHourSpan.setEndMinute(this.f83245c);
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                    }
                }
                WorkHourSettingFragment.m123941a(this.f83243a.f83242a).dismiss();
                WorkHourSettingFragment.m123944c(this.f83243a.f83242a).setFirstSet(false);
                WorkHourSettingFragment.m123947d(this.f83243a.f83242a).mo118557a(WorkHourSettingFragment.m123944c(this.f83243a.f83242a));
                this.f83243a.f83242a.mo118574a(WorkHourSettingFragment.m123944c(this.f83243a.f83242a), WorkHourSettingFragment.m123949e(this.f83243a.f83242a));
                CalendarHitPoint.m124157q("yes");
                GeneralHitPoint.m124234c();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.widget.DialogC32478b.AbstractC32483a
        /* renamed from: a */
        public void mo118581a(int i, int i2, Button button) {
            Intrinsics.checkParameterIsNotNull(button, "dayWeekBtn");
            if (this.f83242a.f83223h) {
                Context context = this.f83242a.mContext;
                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).message(R.string.Calendar_Workinghours_Popup)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC32469a(this, i, i2))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, new DialogInterface$OnClickListenerC32470b(this, i, i2, button))).show();
                this.f83242a.f83223h = false;
                return;
            }
            mo118582b(i, i2, button);
        }

        /* renamed from: b */
        public final void mo118582b(int i, int i2, Button button) {
            HashMap<CalendarSetting.DayOfWeek, CalendarWorkHourSpan> workHourItems = WorkHourSettingFragment.m123944c(this.f83242a).getWorkHourItems();
            Object tag = button.getTag();
            if (tag != null) {
                CalendarWorkHourSpan calendarWorkHourSpan = workHourItems.get(CalendarSetting.DayOfWeek.forNumber(((Integer) tag).intValue()));
                if (calendarWorkHourSpan != null) {
                    calendarWorkHourSpan.setStartMinute(i);
                }
                if (calendarWorkHourSpan != null) {
                    calendarWorkHourSpan.setEndMinute(i2);
                }
                WorkHourSettingFragment.m123941a(this.f83242a).dismiss();
                WorkHourSettingFragment.m123944c(this.f83242a).setFirstSet(false);
                WorkHourSettingFragment.m123947d(this.f83242a).mo118557a(WorkHourSettingFragment.m123944c(this.f83242a));
                WorkHourSettingFragment eVar = this.f83242a;
                eVar.mo118574a(WorkHourSettingFragment.m123944c(eVar), WorkHourSettingFragment.m123949e(this.f83242a));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: c */
    private final void m123945c() {
        m123948d();
        m123950f();
        m123951g();
        m123954j();
    }

    /* renamed from: j */
    private final void m123954j() {
        DialogC32478b bVar = new DialogC32478b(this.mContext, 2131886428);
        this.f83221f = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimePicker");
        }
        bVar.mo118622a(new C32468e(this));
    }

    /* renamed from: l */
    private final void m123956l() {
        for (int i = 0; i <= 6; i++) {
            Button[] buttonArr = this.f83226k;
            if (buttonArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDayWeekBtnArray");
            }
            buttonArr[i].setOnClickListener(new View$OnClickListenerC32466c(this, i));
        }
    }

    /* renamed from: m */
    private final void m123957m() {
        ((UDSwitch) mo109250a(R.id.enableBtn)).setOnCheckedChangeListener(new C32467d(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        Delegate aVar = this.f83218a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDelegate");
        }
        aVar.mo118556a();
        return true;
    }

    /* renamed from: d */
    private final void m123948d() {
        ((CommonTitleBar) mo109250a(R.id.workHourTitleBar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.workHourTitleBar)).setMainTitleTextStyle(1);
        ((CommonTitleBar) mo109250a(R.id.workHourTitleBar)).setTitle(C32634ae.m125182b(R.string.Calendar_NewSettings_WorkingHoursMobile));
        ((CommonTitleBar) mo109250a(R.id.workHourTitleBar)).setLeftClickListener(new View$OnClickListenerC32471f(this));
    }

    /* renamed from: g */
    private final void m123951g() {
        String[] strArr = this.f83231p;
        Intrinsics.checkExpressionValueIsNotNull(strArr, "mFirstDayArray");
        String str = this.f83220e;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFirstDayOfWeek");
        }
        int c = C69043h.m265770c(strArr, str);
        if (c != -1) {
            m123942b(c);
            m123952h();
            m123953i();
        }
    }

    /* renamed from: b */
    public final void mo118576b() {
        CalendarWorkHourSetting calendarWorkHourSetting = this.f83219b;
        if (calendarWorkHourSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWorkHourSettingData");
        }
        calendarWorkHourSetting.setFirstSet(false);
        Delegate aVar = this.f83218a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDelegate");
        }
        CalendarWorkHourSetting calendarWorkHourSetting2 = this.f83219b;
        if (calendarWorkHourSetting2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWorkHourSettingData");
        }
        aVar.mo118557a(calendarWorkHourSetting2);
        CalendarWorkHourSetting calendarWorkHourSetting3 = this.f83219b;
        if (calendarWorkHourSetting3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWorkHourSettingData");
        }
        String str = this.f83220e;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFirstDayOfWeek");
        }
        mo118574a(calendarWorkHourSetting3, str);
    }

    public WorkHourSettingFragment() {
    }

    /* renamed from: f */
    private final void m123950f() {
        CalendarWorkHourSetting calendarWorkHourSetting = this.f83219b;
        if (calendarWorkHourSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWorkHourSettingData");
        }
        boolean isEnable = calendarWorkHourSetting.isEnable();
        UDSwitch uDSwitch = (UDSwitch) mo109250a(R.id.enableBtn);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "enableBtn");
        uDSwitch.setChecked(isEnable);
        if (isEnable) {
            LinearLayout linearLayout = (LinearLayout) mo109250a(R.id.workHourContainer);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "workHourContainer");
            linearLayout.setVisibility(0);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) mo109250a(R.id.workHourContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "workHourContainer");
        linearLayout2.setVisibility(4);
    }

    /* renamed from: i */
    private final void m123953i() {
        ((LinearLayout) mo109250a(R.id.dayWorkTimeContainer)).removeAllViews();
        for (int i = 0; i <= 6; i++) {
            HashMap<Button, RelativeLayout> hashMap = this.f83227l;
            Button[] buttonArr = this.f83226k;
            if (buttonArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDayWeekBtnArray");
            }
            if (hashMap.get(buttonArr[i]) != null) {
                LinearLayout linearLayout = (LinearLayout) mo109250a(R.id.dayWorkTimeContainer);
                HashMap<Button, RelativeLayout> hashMap2 = this.f83227l;
                Button[] buttonArr2 = this.f83226k;
                if (buttonArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDayWeekBtnArray");
                }
                linearLayout.addView(hashMap2.get(buttonArr2[i]));
            }
        }
    }

    /* renamed from: h */
    private final void m123952h() {
        this.f83227l.clear();
        CalendarWorkHourSetting calendarWorkHourSetting = this.f83219b;
        if (calendarWorkHourSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWorkHourSettingData");
        }
        for (Map.Entry<CalendarSetting.DayOfWeek, CalendarWorkHourSpan> entry : calendarWorkHourSetting.getWorkHourItems().entrySet()) {
            int startMinute = entry.getValue().getStartMinute();
            int endMinute = entry.getValue().getEndMinute();
            RelativeLayout relativeLayout = new RelativeLayout(this.mContext);
            relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f83233r));
            TextView textView = new TextView(this.mContext);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(15);
            layoutParams.leftMargin = this.f83232q;
            textView.setLayoutParams(layoutParams);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(C32634ae.m125178a(R.color.text_title));
            textView.setText(this.f83222g[entry.getKey().getNumber()]);
            relativeLayout.addView(textView);
            TextView textView2 = new TextView(this.mContext);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(11);
            layoutParams2.addRule(15);
            layoutParams2.rightMargin = this.f83232q;
            textView2.setLayoutParams(layoutParams2);
            textView2.setTextSize(1, 16.0f);
            textView2.setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
            String id = timeZone.getID();
            Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
            TimePreciseness timePreciseness = TimePreciseness.MINUTE;
            AbstractC30037ag timeFormatDependency = C30022a.f74882a.timeFormatDependency();
            Intrinsics.checkExpressionValueIsNotNull(timeFormatDependency, "CalendarDependencyHolder…cy.timeFormatDependency()");
            Options aVar = new Options(id, null, null, null, timePreciseness, false, true ^ timeFormatDependency.mo108189a(), false, false, 302, null);
            CalendarDate calendarDate = new CalendarDate();
            calendarDate.setHour(startMinute / 60);
            calendarDate.setMinute(startMinute % 60);
            CalendarDate calendarDate2 = new CalendarDate();
            calendarDate2.setHour(endMinute / 60);
            calendarDate2.setMinute(endMinute % 60);
            Context a = C32634ae.m125179a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getAppContext()");
            textView2.setText(TimeFormatUtils.m219281a(a, new Date(calendarDate.getTimeInMilliSeconds()), new Date(calendarDate2.getTimeInMilliSeconds()), aVar));
            relativeLayout.addView(textView2);
            int i = 0;
            while (true) {
                if (i > 6) {
                    break;
                }
                Button[] buttonArr = this.f83226k;
                if (buttonArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDayWeekBtnArray");
                }
                if (Intrinsics.areEqual(buttonArr[i].getTag(), Integer.valueOf(entry.getKey().getNumber()))) {
                    relativeLayout.setTag(Integer.valueOf(i));
                    HashMap<Button, RelativeLayout> hashMap = this.f83227l;
                    Button[] buttonArr2 = this.f83226k;
                    if (buttonArr2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDayWeekBtnArray");
                    }
                    hashMap.put(buttonArr2[i], relativeLayout);
                } else {
                    i++;
                }
            }
            relativeLayout.setOnClickListener(new View$OnClickListenerC32465b(relativeLayout, startMinute, endMinute, this));
        }
    }

    /* renamed from: a */
    public final void mo118575a(boolean z) {
        this.f83223h = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.e$f */
    public static final class View$OnClickListenerC32471f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WorkHourSettingFragment f83250a;

        View$OnClickListenerC32471f(WorkHourSettingFragment eVar) {
            this.f83250a = eVar;
        }

        public final void onClick(View view) {
            this.f83250a.mo113714e();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ DialogC32478b m123941a(WorkHourSettingFragment eVar) {
        DialogC32478b bVar = eVar.f83221f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimePicker");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ Button[] m123943b(WorkHourSettingFragment eVar) {
        Button[] buttonArr = eVar.f83226k;
        if (buttonArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDayWeekBtnArray");
        }
        return buttonArr;
    }

    /* renamed from: c */
    public static final /* synthetic */ CalendarWorkHourSetting m123944c(WorkHourSettingFragment eVar) {
        CalendarWorkHourSetting calendarWorkHourSetting = eVar.f83219b;
        if (calendarWorkHourSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWorkHourSettingData");
        }
        return calendarWorkHourSetting;
    }

    /* renamed from: d */
    public static final /* synthetic */ Delegate m123947d(WorkHourSettingFragment eVar) {
        Delegate aVar = eVar.f83218a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDelegate");
        }
        return aVar;
    }

    /* renamed from: e */
    public static final /* synthetic */ String m123949e(WorkHourSettingFragment eVar) {
        String str = eVar.f83220e;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFirstDayOfWeek");
        }
        return str;
    }

    /* renamed from: c */
    private final void m123946c(int i) {
        Button[] buttonArr = this.f83226k;
        if (buttonArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDayWeekBtnArray");
        }
        int length = buttonArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Button[] buttonArr2 = this.f83226k;
            if (buttonArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDayWeekBtnArray");
            }
            if (Intrinsics.areEqual(buttonArr2[i2].getTag(), Integer.valueOf(i))) {
                this.f83224i[i2] = true;
                Button[] buttonArr3 = this.f83226k;
                if (buttonArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDayWeekBtnArray");
                }
                buttonArr3[i2].setActivated(true);
                return;
            }
        }
    }

    /* renamed from: b */
    private final void m123942b(int i) {
        int i2 = i + 6;
        int i3 = 0;
        while (i3 <= 6) {
            if (i2 >= 7) {
                i2 -= 7;
            }
            Button[] buttonArr = this.f83226k;
            if (buttonArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDayWeekBtnArray");
            }
            buttonArr[i3].setTag(Integer.valueOf(i2));
            Button[] buttonArr2 = this.f83226k;
            if (buttonArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDayWeekBtnArray");
            }
            buttonArr2[i3].setActivated(false);
            Button[] buttonArr3 = this.f83226k;
            if (buttonArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDayWeekBtnArray");
            }
            buttonArr3[i3].setText(this.f83230o[i2]);
            i3++;
            i2++;
        }
        CalendarWorkHourSetting calendarWorkHourSetting = this.f83219b;
        if (calendarWorkHourSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWorkHourSettingData");
        }
        for (Map.Entry<CalendarSetting.DayOfWeek, CalendarWorkHourSpan> entry : calendarWorkHourSetting.getWorkHourItems().entrySet()) {
            if (entry.getValue() != null) {
                m123946c(entry.getKey().getNumber());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/calendar/impl/features/settings/WorkHourSettingFragment$initButtonListMap$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.e$b */
    public static final class View$OnClickListenerC32465b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RelativeLayout f83235a;

        /* renamed from: b */
        final /* synthetic */ int f83236b;

        /* renamed from: c */
        final /* synthetic */ int f83237c;

        /* renamed from: d */
        final /* synthetic */ WorkHourSettingFragment f83238d;

        View$OnClickListenerC32465b(RelativeLayout relativeLayout, int i, int i2, WorkHourSettingFragment eVar) {
            this.f83235a = relativeLayout;
            this.f83236b = i;
            this.f83237c = i2;
            this.f83238d = eVar;
        }

        public final void onClick(View view) {
            CalendarHitPoint.m124110L();
            Object tag = this.f83235a.getTag();
            if (tag != null) {
                int intValue = ((Integer) tag).intValue();
                WorkHourSettingFragment.m123941a(this.f83238d).mo118621a(WorkHourSettingFragment.m123943b(this.f83238d)[intValue]);
                WorkHourSettingFragment.m123941a(this.f83238d).mo118620a(this.f83236b);
                WorkHourSettingFragment.m123941a(this.f83238d).mo118625b(this.f83237c);
                DialogC32478b a = WorkHourSettingFragment.m123941a(this.f83238d);
                String[] strArr = this.f83238d.f83222g;
                Object tag2 = WorkHourSettingFragment.m123943b(this.f83238d)[intValue].getTag();
                if (tag2 != null) {
                    a.mo118623a(strArr[((Integer) tag2).intValue()]);
                    WorkHourSettingFragment.m123941a(this.f83238d).mo118619a();
                    C58339d.m226194a(this.f83238d.mContext, WorkHourSettingFragment.m123941a(this.f83238d));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.e$c */
    public static final class View$OnClickListenerC32466c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WorkHourSettingFragment f83239a;

        /* renamed from: b */
        final /* synthetic */ int f83240b;

        View$OnClickListenerC32466c(WorkHourSettingFragment eVar, int i) {
            this.f83239a = eVar;
            this.f83240b = i;
        }

        public final void onClick(View view) {
            CalendarSettingHitPoint.m124371b("my_work_time");
            HashMap<CalendarSetting.DayOfWeek, CalendarWorkHourSpan> workHourItems = WorkHourSettingFragment.m123944c(this.f83239a).getWorkHourItems();
            Object tag = WorkHourSettingFragment.m123943b(this.f83239a)[this.f83240b].getTag();
            if (!(tag instanceof Integer)) {
                tag = null;
            }
            Integer num = (Integer) tag;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue > 0 && intValue < this.f83239a.f83225j.length) {
                    CalendarHitPoint.m124155p(this.f83239a.f83225j[intValue]);
                }
                CalendarSetting.DayOfWeek forNumber = CalendarSetting.DayOfWeek.forNumber(intValue);
                if (forNumber == null) {
                    return;
                }
                if (this.f83239a.f83224i[this.f83240b]) {
                    this.f83239a.f83224i[this.f83240b] = false;
                    WorkHourSettingFragment.m123943b(this.f83239a)[this.f83240b].setActivated(false);
                    if (workHourItems.containsKey(forNumber)) {
                        WorkHourSettingFragment.m123944c(this.f83239a).getWorkHourItems().remove(forNumber);
                        this.f83239a.mo118576b();
                        return;
                    }
                    return;
                }
                this.f83239a.f83224i[this.f83240b] = true;
                WorkHourSettingFragment.m123943b(this.f83239a)[this.f83240b].setActivated(true);
                workHourItems.put(forNumber, new CalendarWorkHourSpan(this.f83239a.f83228m, this.f83239a.f83229n));
                this.f83239a.mo118576b();
            }
        }
    }

    /* renamed from: a */
    public final void mo118574a(CalendarWorkHourSetting calendarWorkHourSetting, String str) {
        Intrinsics.checkParameterIsNotNull(calendarWorkHourSetting, "workHourSettingData");
        Intrinsics.checkParameterIsNotNull(str, "firstDayOfWeek");
        this.f83219b = calendarWorkHourSetting;
        this.f83220e = str;
        m123958n();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.e$d */
    public static final class C32467d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ WorkHourSettingFragment f83241a;

        C32467d(WorkHourSettingFragment eVar) {
            this.f83241a = eVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                GeneralHitPoint.m124260m("on");
                CalendarHitPoint.m124153o("on");
                LinearLayout linearLayout = (LinearLayout) this.f83241a.mo109250a(R.id.workHourContainer);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "workHourContainer");
                linearLayout.setVisibility(0);
                WorkHourSettingFragment.m123944c(this.f83241a).setEnable(true);
                if (WorkHourSettingFragment.m123944c(this.f83241a).isFirstSet()) {
                    HashMap<CalendarSetting.DayOfWeek, CalendarWorkHourSpan> workHourItems = WorkHourSettingFragment.m123944c(this.f83241a).getWorkHourItems();
                    if (workHourItems == null) {
                        workHourItems = new HashMap<>();
                    } else {
                        workHourItems.clear();
                    }
                    for (int i = 1; i <= 5; i++) {
                        CalendarSetting.DayOfWeek forNumber = CalendarSetting.DayOfWeek.forNumber(i);
                        Intrinsics.checkExpressionValueIsNotNull(forNumber, "DayOfWeek.forNumber(i)");
                        workHourItems.put(forNumber, new CalendarWorkHourSpan(this.f83241a.f83228m, this.f83241a.f83229n));
                    }
                    WorkHourSettingFragment.m123944c(this.f83241a).setFirstSet(false);
                }
                WorkHourSettingFragment.m123947d(this.f83241a).mo118557a(WorkHourSettingFragment.m123944c(this.f83241a));
                WorkHourSettingFragment eVar = this.f83241a;
                eVar.mo118574a(WorkHourSettingFragment.m123944c(eVar), WorkHourSettingFragment.m123949e(this.f83241a));
                CalendarSettingHitPoint.m124371b("my_work_time");
                return;
            }
            GeneralHitPoint.m124260m("off");
            CalendarHitPoint.m124153o("off");
            LinearLayout linearLayout2 = (LinearLayout) this.f83241a.mo109250a(R.id.workHourContainer);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "workHourContainer");
            linearLayout2.setVisibility(4);
            WorkHourSettingFragment.m123944c(this.f83241a).setEnable(false);
            WorkHourSettingFragment.m123944c(this.f83241a).setFirstSet(false);
            WorkHourSettingFragment.m123947d(this.f83241a).mo118557a(WorkHourSettingFragment.m123944c(this.f83241a));
            WorkHourSettingFragment eVar2 = this.f83241a;
            eVar2.mo118574a(WorkHourSettingFragment.m123944c(eVar2), WorkHourSettingFragment.m123949e(this.f83241a));
            CalendarSettingHitPoint.m124371b("my_work_time");
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Button button = (Button) mo109250a(R.id.first_btn);
        Intrinsics.checkExpressionValueIsNotNull(button, "first_btn");
        Button button2 = (Button) mo109250a(R.id.second_btn);
        Intrinsics.checkExpressionValueIsNotNull(button2, "second_btn");
        Button button3 = (Button) mo109250a(R.id.third_btn);
        Intrinsics.checkExpressionValueIsNotNull(button3, "third_btn");
        Button button4 = (Button) mo109250a(R.id.fourth_btn);
        Intrinsics.checkExpressionValueIsNotNull(button4, "fourth_btn");
        Button button5 = (Button) mo109250a(R.id.fifth_btn);
        Intrinsics.checkExpressionValueIsNotNull(button5, "fifth_btn");
        Button button6 = (Button) mo109250a(R.id.sixth_btn);
        Intrinsics.checkExpressionValueIsNotNull(button6, "sixth_btn");
        Button button7 = (Button) mo109250a(R.id.seventh_btn);
        Intrinsics.checkExpressionValueIsNotNull(button7, "seventh_btn");
        this.f83226k = new Button[]{button, button2, button3, button4, button5, button6, button7};
        this.f83232q = UIUtils.dp2px(getContext(), 16.0f);
        this.f83233r = UIUtils.dp2px(getContext(), 46.0f);
        m123945c();
        m123955k();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return View.inflate(this.mContext, R.layout.fragment_calendar_work_hour_setting, null);
    }

    public WorkHourSettingFragment(Delegate aVar, CalendarWorkHourSetting calendarWorkHourSetting, String str) {
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        Intrinsics.checkParameterIsNotNull(calendarWorkHourSetting, "workHourSettingData");
        Intrinsics.checkParameterIsNotNull(str, "firstDayOfWeek");
        this.f83218a = aVar;
        this.f83219b = calendarWorkHourSetting;
        this.f83220e = str;
    }
}
