package com.ss.android.lark.money.redpacket.widget;

import android.content.Context;
import com.larksuite.component.universe_design.timepicker.impl.base.OnItemSelectedListener;
import com.larksuite.component.universe_design.timepicker.impl.base.WheelView;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder;
import com.larksuite.component.universe_design.timepicker.impl.helper.TimePickerHelper;
import com.larksuite.component.universe_design.timepicker.impl.helper.UtcDates;
import com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController;
import com.larksuite.component.universe_design.timepicker.impl.single.YearPicker;
import com.larksuite.component.universe_design.util.CalendarDate;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/money/redpacket/widget/RedPacketYearPanelController;", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController;", "context", "Landroid/content/Context;", "panelDependency", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;", "startYear", "", "endYear", "(Landroid/content/Context;Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;II)V", "chooseCalendar", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "yearWheelView", "Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;", "create", "", "builderList", "", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "getPickerBuilderList", "getPickerViewList", "setCurrentDate", "selectedDate", "Ljava/util/Calendar;", "setItemDividerVisibility", "isShow", "", "setItemVisibleNum", "visibleItemNum", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.money.redpacket.widget.b */
public final class RedPacketYearPanelController extends BaseTimePickerController {

    /* renamed from: a */
    public final int f121270a;

    /* renamed from: b */
    private WheelView f121271b;

    /* renamed from: c */
    private CalendarDate f121272c = new CalendarDate(getPickerPanelDependency().getSelectedDate());

    /* renamed from: d */
    private final int f121273d;

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public List<WheelView> getPickerViewList() {
        WheelView wheelView = this.f121271b;
        if (wheelView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yearWheelView");
        }
        return CollectionsKt.listOf(wheelView);
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public List<PickerBuilder> getPickerBuilderList() {
        PickerBuilder pickerBuilder = YearPicker.INSTANCE.getPickerBuilder(this.f121270a, this.f121273d, false);
        if (pickerBuilder != null) {
            return CollectionsKt.listOf(pickerBuilder);
        }
        throw new IllegalArgumentException(("startYear = " + this.f121270a + ", endYear = " + this.f121273d).toString());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/money/redpacket/widget/RedPacketYearPanelController$create$1", "Lcom/larksuite/component/universe_design/timepicker/impl/base/OnItemSelectedListener;", "onItemSelected", "", "index", "", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.widget.b$a */
    public static final class C48193a implements OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ RedPacketYearPanelController f121274a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48193a(RedPacketYearPanelController bVar) {
            this.f121274a = bVar;
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.OnItemSelectedListener
        public void onItemSelected(int i) {
            this.f121274a.getPickerPanelDependency().onSelected(UtcDates.INSTANCE.getCalendar(this.f121274a.f121270a + i, 1, 1));
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setItemVisibleNum(int i) {
        WheelView wheelView = this.f121271b;
        if (wheelView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yearWheelView");
        }
        wheelView.setItemVisible(i + 2);
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setCurrentDate(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "selectedDate");
        CalendarDate calendarDate = new CalendarDate(calendar);
        this.f121272c = calendarDate;
        WheelView wheelView = this.f121271b;
        if (wheelView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yearWheelView");
        }
        wheelView.setCurrentItem(calendarDate.getYear() - this.f121270a);
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setItemDividerVisibility(boolean z) {
        WheelView.DividerType dividerType;
        if (z) {
            dividerType = WheelView.DividerType.FILL;
        } else {
            dividerType = WheelView.DividerType.NONE;
        }
        WheelView wheelView = this.f121271b;
        if (wheelView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yearWheelView");
        }
        wheelView.setDividerType(dividerType);
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void create(Context context, List<PickerBuilder> list) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "builderList");
        WheelView createWheelView = TimePickerHelper.INSTANCE.createWheelView(context, list.get(0));
        this.f121271b = createWheelView;
        if (createWheelView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yearWheelView");
        }
        createWheelView.setOnItemSelectedListener(new C48193a(this));
        setItemVisibleNum(getPickerPanelDependency().getPanelStyleData().getVisibleItemNum());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RedPacketYearPanelController(Context context, BaseTimePickerController.PickerPanelDependency pickerPanelDependency, int i, int i2) {
        super(context, pickerPanelDependency);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(pickerPanelDependency, "panelDependency");
        this.f121270a = i;
        this.f121273d = i2;
    }
}
