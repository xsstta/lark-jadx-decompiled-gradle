package com.larksuite.component.universe_design.timepicker.impl.panel;

import android.content.Context;
import com.larksuite.component.universe_design.timepicker.impl.base.WheelView;
import com.larksuite.component.universe_design.timepicker.impl.data.PanelStyleData;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\"B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012H&J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u001fH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006#"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController;", "", "context", "Landroid/content/Context;", "pickerPanelDependency", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;", "(Landroid/content/Context;Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getPickerPanelDependency", "()Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;", "setPickerPanelDependency", "(Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;)V", "create", "", "builderList", "", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "getPickerBuilderList", "getPickerViewList", "Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;", "setCurrentDate", "selectedDate", "Ljava/util/Calendar;", "setItemDividerVisibility", "isShow", "", "setItemVisibleNum", "visibleItemNum", "", "setMinuteWheelInterval", "minuteInterval", "PickerPanelDependency", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseTimePickerController {
    private Context context;
    private PickerPanelDependency pickerPanelDependency;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;", "", "getPanelStyleData", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PanelStyleData;", "getSelectedDate", "Ljava/util/Calendar;", "onSelected", "", "selectedDate", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    public interface PickerPanelDependency {
        PanelStyleData getPanelStyleData();

        Calendar getSelectedDate();

        void onSelected(Calendar calendar);
    }

    public abstract void create(Context context2, List<PickerBuilder> list);

    public abstract List<PickerBuilder> getPickerBuilderList();

    public abstract List<WheelView> getPickerViewList();

    public abstract void setCurrentDate(Calendar calendar);

    public abstract void setItemDividerVisibility(boolean z);

    public abstract void setItemVisibleNum(int i);

    public void setMinuteWheelInterval(int i) {
    }

    public final Context getContext() {
        return this.context;
    }

    public final PickerPanelDependency getPickerPanelDependency() {
        return this.pickerPanelDependency;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkParameterIsNotNull(context2, "<set-?>");
        this.context = context2;
    }

    public final void setPickerPanelDependency(PickerPanelDependency pickerPanelDependency2) {
        Intrinsics.checkParameterIsNotNull(pickerPanelDependency2, "<set-?>");
        this.pickerPanelDependency = pickerPanelDependency2;
    }

    public BaseTimePickerController(Context context2, PickerPanelDependency pickerPanelDependency2) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(pickerPanelDependency2, "pickerPanelDependency");
        this.context = context2;
        this.pickerPanelDependency = pickerPanelDependency2;
    }
}
