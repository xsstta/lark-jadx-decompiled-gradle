package com.larksuite.component.universe_design.timepicker.impl.panel;

import android.content.Context;
import com.larksuite.component.universe_design.timepicker.impl.base.WheelView;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder;
import com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController;
import com.larksuite.component.universe_design.timepicker.impl.panel.MonthDayPanelController;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/panel/MonthDayHourMinuteController;", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController;", "context", "Landroid/content/Context;", "pickerPanelDependency", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;", "isTwentyFourHours", "", "(Landroid/content/Context;Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;Z)V", "hourMinuteController", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/HourMinuteController;", "monthDayPanelController", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/MonthDayPanelController;", "create", "", "builderList", "", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "getPickerBuilderList", "getPickerViewList", "Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;", "setCurrentDate", "selectedDate", "Ljava/util/Calendar;", "setItemDividerVisibility", "isShow", "setItemVisibleNum", "visibleItemNum", "", "setMinuteWheelInterval", "minuteInterval", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.panel.b */
public final class MonthDayHourMinuteController extends BaseTimePickerController {

    /* renamed from: a */
    private MonthDayPanelController f63749a;

    /* renamed from: b */
    private HourMinuteController f63750b;

    /* renamed from: c */
    private final boolean f63751c;

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public List<WheelView> getPickerViewList() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f63749a.getPickerViewList());
        arrayList.addAll(this.f63750b.getPickerViewList());
        return arrayList;
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public List<PickerBuilder> getPickerBuilderList() {
        ArrayList arrayList = new ArrayList();
        List<PickerBuilder> pickerBuilderList = this.f63749a.getPickerBuilderList();
        List<PickerBuilder> list = pickerBuilderList;
        if (!list.isEmpty()) {
            pickerBuilderList.get(0).getLayoutParams().mo91594a(2.0f);
        }
        arrayList.addAll(list);
        arrayList.addAll(this.f63750b.getPickerBuilderList());
        return arrayList;
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setMinuteWheelInterval(int i) {
        this.f63750b.setMinuteWheelInterval(i);
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setCurrentDate(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "selectedDate");
        this.f63749a.setCurrentDate(calendar);
        this.f63750b.setCurrentDate(calendar);
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setItemDividerVisibility(boolean z) {
        this.f63749a.setItemDividerVisibility(z);
        this.f63750b.setItemDividerVisibility(z);
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setItemVisibleNum(int i) {
        this.f63749a.setItemVisibleNum(i);
        this.f63750b.setItemVisibleNum(i);
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void create(Context context, List<PickerBuilder> list) {
        List<PickerBuilder> list2;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "builderList");
        this.f63749a.create(context, CollectionsKt.listOf(list.get(0)));
        if (this.f63751c) {
            list2 = list.subList(1, 3);
        } else {
            list2 = list.subList(1, 4);
        }
        this.f63750b.create(context, list2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonthDayHourMinuteController(Context context, BaseTimePickerController.PickerPanelDependency pickerPanelDependency, boolean z) {
        super(context, pickerPanelDependency);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(pickerPanelDependency, "pickerPanelDependency");
        this.f63751c = z;
        this.f63749a = MonthDayPanelController.Companion.m93172a(MonthDayPanelController.f63752b, context, pickerPanelDependency, null, null, 12, null);
        this.f63750b = new HourMinuteController(context, pickerPanelDependency, z, pickerPanelDependency.getPanelStyleData().getMinuteInterval());
    }
}
