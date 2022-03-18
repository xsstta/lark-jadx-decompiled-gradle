package com.larksuite.component.universe_design.timepicker.impl.helper;

import android.content.Context;
import android.widget.LinearLayout;
import com.larksuite.component.universe_design.timepicker.impl.base.WheelView;
import com.larksuite.component.universe_design.timepicker.impl.data.PanelStyleData;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerModel;
import com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController;
import com.larksuite.component.universe_design.timepicker.impl.panel.HourMinuteController;
import com.larksuite.component.universe_design.timepicker.impl.panel.MonthDayHourMinuteController;
import com.larksuite.component.universe_design.timepicker.impl.panel.MonthDayPanelController;
import com.larksuite.component.universe_design.timepicker.impl.panel.YearMonthDayPanelController;
import com.larksuite.component.universe_design.util.ResUtil;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\r\u001a\u00020\nJ&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u001a¨\u0006\u001b"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/helper/TimePickerHelper;", "", "()V", "createWheelView", "Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;", "context", "Landroid/content/Context;", "builder", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "createWheelViewLayoutParam", "Landroid/widget/LinearLayout$LayoutParams;", "builderLayoutParams", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder$LayoutParams;", "generalDefaultLayoutParam", "getPanelController", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController;", "pickerModel", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerModel;", "pickerPanelDependency", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;", "panelStyleData", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PanelStyleData;", "getValidWheelItemNum", "", "itemNum", "isLanguageAMPMAtFront", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TimePickerHelper {
    public static final TimePickerHelper INSTANCE = new TimePickerHelper();

    private TimePickerHelper() {
    }

    public final LinearLayout.LayoutParams generalDefaultLayoutParam() {
        return new LinearLayout.LayoutParams(0, -2, 1.0f);
    }

    public final boolean isLanguageAMPMAtFront() {
        Locale locale = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale, "local");
        if (ResUtil.m93303b(locale) || ResUtil.m93301a(locale) || ResUtil.m93304c(locale)) {
            return true;
        }
        return false;
    }

    public final int getValidWheelItemNum(int i) {
        return RangesKt.coerceAtLeast(1, i - ((i + 1) % 2));
    }

    private final LinearLayout.LayoutParams createWheelViewLayoutParam(PickerBuilder.LayoutParams aVar) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(aVar.mo91593a(), aVar.mo91595b());
        layoutParams.weight = aVar.mo91596c();
        layoutParams.rightMargin = aVar.mo91598e();
        layoutParams.leftMargin = aVar.mo91597d();
        return layoutParams;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.larksuite.component.universe_design.timepicker.impl.base.WheelView */
    /* JADX WARN: Multi-variable type inference failed */
    public final WheelView createWheelView(Context context, PickerBuilder pickerBuilder) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(pickerBuilder, "builder");
        WheelView wheelView = new WheelView(context, null, 2, null);
        wheelView.setTextColorCenter(pickerBuilder.getTextColorCenter());
        wheelView.setTextSize(pickerBuilder.getTextSize());
        wheelView.setTextSizeOuter(pickerBuilder.getOuterTextSize());
        wheelView.setShowTwoFigure(pickerBuilder.getShowTwoFigure());
        wheelView.setItemVisible(pickerBuilder.getVisibleItemNum() + 2);
        wheelView.setCyclic(pickerBuilder.isLoop());
        wheelView.setAdapter(pickerBuilder.getAdapter());
        wheelView.setLayoutParams(INSTANCE.createWheelViewLayoutParam(pickerBuilder.getLayoutParams()));
        return wheelView;
    }

    public final BaseTimePickerController getPanelController(Context context, PickerModel pickerModel, BaseTimePickerController.PickerPanelDependency pickerPanelDependency, PanelStyleData panelStyleData) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(pickerModel, "pickerModel");
        Intrinsics.checkParameterIsNotNull(pickerPanelDependency, "pickerPanelDependency");
        Intrinsics.checkParameterIsNotNull(panelStyleData, "panelStyleData");
        switch (C25794a.f63738a[pickerModel.ordinal()]) {
            case 1:
                return new HourMinuteController(context, pickerPanelDependency, true, panelStyleData.getMinuteInterval());
            case 2:
                return new HourMinuteController(context, pickerPanelDependency, false, panelStyleData.getMinuteInterval());
            case 3:
                return YearMonthDayPanelController.Companion.m93184a(YearMonthDayPanelController.f63758f, context, pickerPanelDependency, null, null, 12, null);
            case 4:
                return MonthDayPanelController.Companion.m93172a(MonthDayPanelController.f63752b, context, pickerPanelDependency, null, null, 12, null);
            case 5:
                return new MonthDayHourMinuteController(context, pickerPanelDependency, true);
            case 6:
                return new MonthDayHourMinuteController(context, pickerPanelDependency, false);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
