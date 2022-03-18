package com.larksuite.component.universe_design.timepicker.impl.panel;

import android.content.Context;
import com.larksuite.component.universe_design.timepicker.impl.adapter.CustomNumericWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.base.ILoopChangeListener;
import com.larksuite.component.universe_design.timepicker.impl.base.OnItemSelectedListener;
import com.larksuite.component.universe_design.timepicker.impl.base.WheelView;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder;
import com.larksuite.component.universe_design.timepicker.impl.helper.TimePickerHelper;
import com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController;
import com.larksuite.component.universe_design.timepicker.impl.single.AMPMPicker;
import com.larksuite.component.universe_design.timepicker.impl.single.HourPicker;
import com.larksuite.component.universe_design.timepicker.impl.single.MinutePicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 .2\u00020\u0001:\u0001.B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001dH\u0016J\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0012H\u0016J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0007H\u0016J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\tH\u0016J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010,\u001a\u00020\u001bH\u0002J\b\u0010-\u001a\u00020\u001bH\u0002R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\u000e\u0010\u0016\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010¨\u0006/"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/panel/HourMinuteController;", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController;", "context", "Landroid/content/Context;", "pickerPanelDependency", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;", "isTwentyFourHours", "", "minuteInterval", "", "(Landroid/content/Context;Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;ZI)V", "aMPMWheelPicker", "Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;", "getAMPMWheelPicker", "()Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;", "setAMPMWheelPicker", "(Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;)V", "chooseCalendar", "Ljava/util/Calendar;", "hourWheelPicker", "getHourWheelPicker", "setHourWheelPicker", "isAMPMFirst", "minuteWheelPicker", "getMinuteWheelPicker", "setMinuteWheelPicker", "create", "", "builderList", "", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "getPickerBuilderList", "getPickerViewList", "initHourAMPMCorrelation", "initItemSelectedListener", "initView", "refreshCurrentTime", "setCurrentDate", "selectedDate", "setItemDividerVisibility", "isShow", "setItemVisibleNum", "visibleItemNum", "setMinuteWheelInterval", "updateHour", "updateMinute", "Companion", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.panel.a */
public final class HourMinuteController extends BaseTimePickerController {

    /* renamed from: b */
    public static final Companion f63739b = new Companion(null);

    /* renamed from: a */
    public Calendar f63740a;

    /* renamed from: c */
    private WheelView f63741c;

    /* renamed from: d */
    private WheelView f63742d;

    /* renamed from: e */
    private WheelView f63743e;

    /* renamed from: f */
    private final boolean f63744f = TimePickerHelper.INSTANCE.isLanguageAMPMAtFront();

    /* renamed from: g */
    private int f63745g;

    /* renamed from: h */
    private final boolean f63746h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/panel/HourMinuteController$Companion;", "", "()V", "AMPM", "", "HOURS", "MINUTES", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.panel.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo91623a() {
        m93165e();
        m93166f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/larksuite/component/universe_design/timepicker/impl/panel/HourMinuteController$initHourAMPMCorrelation$1", "Lcom/larksuite/component/universe_design/timepicker/impl/base/ILoopChangeListener;", "onChangeLoop", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.panel.a$b */
    public static final class C25795b implements ILoopChangeListener {

        /* renamed from: a */
        final /* synthetic */ WheelView f63747a;

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.ILoopChangeListener
        /* renamed from: a */
        public void mo91557a() {
            int i;
            if (this.f63747a.getCurrentItem() == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f63747a.setCurrentItem(i);
        }

        C25795b(WheelView wheelView) {
            this.f63747a = wheelView;
        }
    }

    /* renamed from: c */
    private final void m93163c() {
        WheelView wheelView;
        WheelView wheelView2;
        if (!this.f63746h && (wheelView = this.f63741c) != null && (wheelView2 = this.f63743e) != null) {
            wheelView.setLoopChangeListener(new C25795b(wheelView2));
        }
    }

    /* renamed from: f */
    private final void m93166f() {
        WheelView wheelView = this.f63742d;
        if (wheelView != null) {
            this.f63740a.set(12, wheelView.getCurrentItem() * this.f63745g);
        }
    }

    /* renamed from: b */
    private final void m93162b() {
        if (this.f63741c != null || this.f63742d != null) {
            setItemVisibleNum(getPickerPanelDependency().getPanelStyleData().getVisibleItemNum());
            setItemDividerVisibility(getPickerPanelDependency().getPanelStyleData().getItemDividerVisibility());
            m93164d();
            m93163c();
        }
    }

    /* renamed from: d */
    private final void m93164d() {
        C25796c cVar = new C25796c(this);
        WheelView wheelView = this.f63741c;
        if (wheelView != null) {
            wheelView.setOnItemSelectedListener(cVar);
        }
        WheelView wheelView2 = this.f63742d;
        if (wheelView2 != null) {
            wheelView2.setOnItemSelectedListener(cVar);
        }
        WheelView wheelView3 = this.f63743e;
        if (wheelView3 != null) {
            wheelView3.setOnItemSelectedListener(cVar);
        }
    }

    /* renamed from: e */
    private final void m93165e() {
        WheelView wheelView = this.f63741c;
        if (wheelView != null) {
            WheelView wheelView2 = this.f63743e;
            if (this.f63746h || wheelView2 == null) {
                this.f63740a.set(11, wheelView.getCurrentItem());
                return;
            }
            this.f63740a.set(11, wheelView.getCurrentItem() + (wheelView2.getCurrentItem() * 12));
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public List<PickerBuilder> getPickerBuilderList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(HourPicker.f63773a.mo91633a(this.f63746h, true));
        MinutePicker dVar = MinutePicker.f63774a;
        int i = this.f63745g;
        arrayList.add(dVar.mo91634a(true, 0, 60 - i, i));
        if (!this.f63746h) {
            arrayList.add(AMPMPicker.f63771a.mo91631a(getContext()));
        }
        return arrayList;
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public List<WheelView> getPickerViewList() {
        WheelView wheelView;
        ArrayList arrayList = new ArrayList();
        WheelView wheelView2 = this.f63741c;
        if (wheelView2 != null) {
            arrayList.add(wheelView2);
        }
        WheelView wheelView3 = this.f63742d;
        if (wheelView3 != null) {
            arrayList.add(wheelView3);
        }
        if (!this.f63746h && (wheelView = this.f63743e) != null) {
            if (this.f63744f) {
                arrayList.add(0, wheelView);
            } else {
                arrayList.add(wheelView);
            }
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/larksuite/component/universe_design/timepicker/impl/panel/HourMinuteController$initItemSelectedListener$pickerListener$1", "Lcom/larksuite/component/universe_design/timepicker/impl/base/OnItemSelectedListener;", "onItemSelected", "", "index", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.panel.a$c */
    public static final class C25796c implements OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ HourMinuteController f63748a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25796c(HourMinuteController aVar) {
            this.f63748a = aVar;
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.OnItemSelectedListener
        public void onItemSelected(int i) {
            this.f63748a.mo91623a();
            this.f63748a.getPickerPanelDependency().onSelected(this.f63748a.f63740a);
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setItemDividerVisibility(boolean z) {
        WheelView.DividerType dividerType;
        if (z) {
            dividerType = WheelView.DividerType.FILL;
        } else {
            dividerType = WheelView.DividerType.NONE;
        }
        WheelView wheelView = this.f63741c;
        if (wheelView != null) {
            wheelView.setDividerType(dividerType);
        }
        WheelView wheelView2 = this.f63742d;
        if (wheelView2 != null) {
            wheelView2.setDividerType(dividerType);
        }
        WheelView wheelView3 = this.f63743e;
        if (wheelView3 != null) {
            wheelView3.setDividerType(dividerType);
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setItemVisibleNum(int i) {
        WheelView wheelView = this.f63741c;
        if (wheelView != null) {
            wheelView.setItemVisible(i + 2);
        }
        WheelView wheelView2 = this.f63742d;
        if (wheelView2 != null) {
            wheelView2.setItemVisible(i + 2);
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setMinuteWheelInterval(int i) {
        if (i <= 60 && 60 % i == 0) {
            this.f63745g = i;
            WheelView wheelView = this.f63742d;
            if (wheelView != null) {
                wheelView.setAdapter(new CustomNumericWheelAdapter(0, 60 - i, i));
            }
            setCurrentDate(getPickerPanelDependency().getSelectedDate());
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setCurrentDate(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "selectedDate");
        this.f63740a = calendar;
        if (this.f63746h) {
            WheelView wheelView = this.f63741c;
            if (wheelView != null) {
                wheelView.setCurrentItem(calendar.get(11));
            }
            WheelView wheelView2 = this.f63742d;
            if (wheelView2 != null) {
                wheelView2.setCurrentItem(calendar.get(12) / this.f63745g);
                return;
            }
            return;
        }
        WheelView wheelView3 = this.f63741c;
        if (wheelView3 != null) {
            wheelView3.setCurrentItem(calendar.get(10));
        }
        WheelView wheelView4 = this.f63742d;
        if (wheelView4 != null) {
            wheelView4.setCurrentItem(calendar.get(12) / this.f63745g);
        }
        WheelView wheelView5 = this.f63743e;
        if (wheelView5 != null) {
            wheelView5.setCurrentItem(calendar.get(9));
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void create(Context context, List<PickerBuilder> list) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "builderList");
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            if (i == 0) {
                this.f63741c = TimePickerHelper.INSTANCE.createWheelView(context, t2);
            } else if (i == 1) {
                this.f63742d = TimePickerHelper.INSTANCE.createWheelView(context, t2);
            } else if (i == 2 && !this.f63746h) {
                this.f63743e = TimePickerHelper.INSTANCE.createWheelView(context, t2);
            }
            i = i2;
        }
        m93162b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HourMinuteController(Context context, BaseTimePickerController.PickerPanelDependency pickerPanelDependency, boolean z, int i) {
        super(context, pickerPanelDependency);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(pickerPanelDependency, "pickerPanelDependency");
        this.f63746h = z;
        this.f63740a = pickerPanelDependency.getSelectedDate();
        this.f63745g = 1;
        setMinuteWheelInterval(i);
    }
}
