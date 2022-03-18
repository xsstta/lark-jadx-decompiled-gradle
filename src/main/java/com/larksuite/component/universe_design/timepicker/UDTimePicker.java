package com.larksuite.component.universe_design.timepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.timepicker.api.ITimePickerDelegate;
import com.larksuite.component.universe_design.timepicker.impl.base.WheelView;
import com.larksuite.component.universe_design.timepicker.impl.data.PanelStyleData;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerModel;
import com.larksuite.component.universe_design.timepicker.impl.helper.TimePickerHelper;
import com.larksuite.component.universe_design.timepicker.impl.helper.UtcDates;
import com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController;
import com.larksuite.component.universe_design.util.CalendarDate;
import com.larksuite.component.universe_design.util.DateTimeUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a*\u0001\u001b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\b\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002J\b\u0010*\u001a\u00020\u001eH\u0016J\b\u0010+\u001a\u00020$H\u0016J\"\u0010,\u001a\u00020$2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010-\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\b\u0010.\u001a\u00020$H\u0002J(\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\nH\u0014J\u0010\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020\u000fH\u0016J\u0010\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\"H\u0016J\u0010\u00107\u001a\u00020$2\u0006\u00108\u001a\u00020\nH\u0016J\u0010\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020\nH\u0016J\u0010\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020\u0011H\u0016J\u0010\u0010=\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020\u001eH\u0016J\b\u0010@\u001a\u00020$H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/UDTimePicker;", "Landroid/widget/LinearLayout;", "Lcom/larksuite/component/universe_design/timepicker/api/ITimePickerDelegate;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "autoAdjustVisibleNum", "", "baseController", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController;", "getBaseController", "()Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController;", "setBaseController", "(Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController;)V", "panelStyleData", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PanelStyleData;", "pickerModel", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerModel;", "pickerPanelListener", "com/larksuite/component/universe_design/timepicker/UDTimePicker$pickerPanelListener$1", "Lcom/larksuite/component/universe_design/timepicker/UDTimePicker$pickerPanelListener$1;", "selectedCalendar", "Ljava/util/Calendar;", "selectedTimeZone", "Ljava/util/TimeZone;", "timePickerListener", "Lcom/larksuite/component/universe_design/timepicker/api/ITimePickerDelegate$TimePickerListener;", "createView", "", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "getAdjustVisibleItem", "height", "getSelectedCalendar", "hideItemDivider", "init", "defStyle", "initController", "onSizeChanged", "width", "oldw", "oldh", "setAutoAdjustItemNum", "autoAdjust", "setDatePickerListener", "listener", "setItemVisibleNum", "visibleItemNum", "setMinuteInterval", "minuteInterval", "setPanelController", "panelController", "setPickerMode", "setSelectedCalendar", "calendarDate", "showItemDivider", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDTimePicker extends LinearLayout implements ITimePickerDelegate {
    private HashMap _$_findViewCache;
    private boolean autoAdjustVisibleNum;
    private BaseTimePickerController baseController;
    public PanelStyleData panelStyleData;
    private PickerModel pickerModel;
    private C25788b pickerPanelListener;
    public Calendar selectedCalendar;
    private TimeZone selectedTimeZone;
    public ITimePickerDelegate.TimePickerListener timePickerListener;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final BaseTimePickerController getBaseController() {
        return this.baseController;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.UDTimePicker$a */
    static final class RunnableC25787a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UDTimePicker f63681a;

        /* renamed from: b */
        final /* synthetic */ int f63682b;

        RunnableC25787a(UDTimePicker uDTimePicker, int i) {
            this.f63681a = uDTimePicker;
            this.f63682b = i;
        }

        public final void run() {
            this.f63681a.setItemVisibleNum(this.f63682b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/universe_design/timepicker/UDTimePicker$pickerPanelListener$1", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;", "getPanelStyleData", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PanelStyleData;", "getSelectedDate", "Ljava/util/Calendar;", "onSelected", "", "selectedDate", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.UDTimePicker$b */
    public static final class C25788b implements BaseTimePickerController.PickerPanelDependency {

        /* renamed from: a */
        final /* synthetic */ UDTimePicker f63683a;

        @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController.PickerPanelDependency
        public PanelStyleData getPanelStyleData() {
            return this.f63683a.panelStyleData;
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController.PickerPanelDependency
        public Calendar getSelectedDate() {
            return this.f63683a.selectedCalendar;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25788b(UDTimePicker uDTimePicker) {
            this.f63683a = uDTimePicker;
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController.PickerPanelDependency
        public void onSelected(Calendar calendar) {
            Intrinsics.checkParameterIsNotNull(calendar, "selectedDate");
            this.f63683a.selectedCalendar = calendar;
            CalendarDate calendarDate = new CalendarDate(calendar);
            ITimePickerDelegate.TimePickerListener aVar = this.f63683a.timePickerListener;
            if (aVar != null) {
                aVar.mo18000a(calendarDate.getYear(), calendarDate.getMonth() - 1, calendarDate.getMonthDay(), calendarDate.getHour(), calendarDate.getMinute());
            }
        }
    }

    public Calendar getSelectedCalendar() {
        return DateTimeUtils.f63877a.mo91836a(this.selectedCalendar, this.selectedTimeZone);
    }

    private final void createView() {
        if (getBackground() != null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            setBackgroundColor(UDColorUtils.getColor(context, R.color.bg_body));
        }
        initController();
    }

    private final void initController() {
        PickerModel pickerModel2 = this.pickerModel;
        if (pickerModel2 != null) {
            TimePickerHelper timePickerHelper = TimePickerHelper.INSTANCE;
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            setPanelController(timePickerHelper.getPanelController(context, pickerModel2, this.pickerPanelListener, this.panelStyleData));
        }
    }

    public void hideItemDivider() {
        this.panelStyleData.setItemDividerVisibility(false);
        BaseTimePickerController baseTimePickerController = this.baseController;
        if (baseTimePickerController != null) {
            baseTimePickerController.setItemDividerVisibility(false);
        }
        invalidate();
    }

    public void showItemDivider() {
        this.panelStyleData.setItemDividerVisibility(true);
        BaseTimePickerController baseTimePickerController = this.baseController;
        if (baseTimePickerController != null) {
            baseTimePickerController.setItemDividerVisibility(true);
        }
        invalidate();
    }

    public final void setBaseController(BaseTimePickerController baseTimePickerController) {
        this.baseController = baseTimePickerController;
    }

    public void setDatePickerListener(ITimePickerDelegate.TimePickerListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.timePickerListener = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDTimePicker(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setAutoAdjustItemNum(boolean z) {
        if (this.autoAdjustVisibleNum != z) {
            this.autoAdjustVisibleNum = z;
            requestLayout();
        }
    }

    public void setMinuteInterval(int i) {
        this.panelStyleData.setMinuteInterval(i);
        BaseTimePickerController baseTimePickerController = this.baseController;
        if (baseTimePickerController != null) {
            baseTimePickerController.setMinuteWheelInterval(i);
        }
        invalidate();
    }

    public void setPickerMode(PickerModel pickerModel2) {
        Intrinsics.checkParameterIsNotNull(pickerModel2, "pickerModel");
        this.pickerModel = pickerModel2;
        initController();
    }

    private final int getAdjustVisibleItem(int i) {
        TimePickerHelper timePickerHelper = TimePickerHelper.INSTANCE;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        return timePickerHelper.getValidWheelItemNum((int) (((float) i) / UDDimenUtils.m93308a(context, 48)));
    }

    public void setItemVisibleNum(int i) {
        this.panelStyleData.setVisibleItemNum(TimePickerHelper.INSTANCE.getValidWheelItemNum(i));
        BaseTimePickerController baseTimePickerController = this.baseController;
        if (baseTimePickerController != null) {
            baseTimePickerController.setItemVisibleNum(i);
        }
    }

    public void setSelectedCalendar(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendarDate");
        TimeZone timeZone = calendar.getTimeZone();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "calendarDate.timeZone");
        this.selectedTimeZone = timeZone;
        Calendar uTCCalendarOf = UtcDates.INSTANCE.getUTCCalendarOf(calendar);
        this.selectedCalendar = uTCCalendarOf;
        BaseTimePickerController baseTimePickerController = this.baseController;
        if (baseTimePickerController != null) {
            baseTimePickerController.setCurrentDate(uTCCalendarOf);
        }
    }

    public void setPanelController(BaseTimePickerController baseTimePickerController) {
        List<PickerBuilder> list;
        boolean z;
        List<WheelView> pickerViewList;
        BaseTimePickerController baseTimePickerController2;
        Intrinsics.checkParameterIsNotNull(baseTimePickerController, "panelController");
        removeAllViews();
        this.baseController = baseTimePickerController;
        if (baseTimePickerController != null) {
            list = baseTimePickerController.getPickerBuilderList();
        } else {
            list = null;
        }
        List<PickerBuilder> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (baseTimePickerController2 = this.baseController) != null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            baseTimePickerController2.create(context, list);
        }
        BaseTimePickerController baseTimePickerController3 = this.baseController;
        if (!(baseTimePickerController3 == null || (pickerViewList = baseTimePickerController3.getPickerViewList()) == null)) {
            for (T t : pickerViewList) {
                T t2 = t;
                LinearLayout.LayoutParams layoutParams = t.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = TimePickerHelper.INSTANCE.generalDefaultLayoutParam();
                }
                addView(t2, layoutParams);
            }
        }
        BaseTimePickerController baseTimePickerController4 = this.baseController;
        if (baseTimePickerController4 != null) {
            baseTimePickerController4.setCurrentDate(this.selectedCalendar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDTimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDTimePicker(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    private final void init(AttributeSet attributeSet, int i, int i2) {
        setOrientation(0);
        setGravity(16);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_timePicker_autoAdjustVisibleNum, R.attr.ud_timePicker_datePickerMode, R.attr.ud_timePicker_itemDividerVisibility, R.attr.ud_timePicker_itemVisibleNum, R.attr.ud_timePicker_minuteInternal, R.attr.ud_timePicker_showDayInfo}, i, i2);
        this.pickerModel = PickerModel.Companion.mo91600a(obtainStyledAttributes.getInt(1, 3));
        this.panelStyleData.setMinuteInterval(obtainStyledAttributes.getInt(4, 1));
        this.panelStyleData.setItemDividerVisibility(obtainStyledAttributes.getBoolean(2, true));
        this.panelStyleData.setShowDayInfo(obtainStyledAttributes.getBoolean(5, true));
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        this.autoAdjustVisibleNum = z;
        if (!z) {
            this.panelStyleData.setVisibleItemNum(TimePickerHelper.INSTANCE.getValidWheelItemNum(obtainStyledAttributes.getInt(3, 3)));
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        if (this.autoAdjustVisibleNum) {
            if (getLayoutParams().height != -2) {
                i5 = getAdjustVisibleItem(i2);
            } else {
                i5 = 3;
            }
            post(new RunnableC25787a(this, i5));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDTimePicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.selectedCalendar = UtcDates.INSTANCE.getTodayCalendar();
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        this.selectedTimeZone = timeZone;
        this.panelStyleData = new PanelStyleData(0, 0, false, false, 15, null);
        this.pickerPanelListener = new C25788b(this);
        init(attributeSet, i, i2);
        createView();
    }
}
