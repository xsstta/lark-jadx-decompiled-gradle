package com.larksuite.component.universe_design.timepicker.impl.single;

import com.larksuite.component.universe_design.timepicker.impl.adapter.CustomNumericWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.adapter.TwelveHourWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/single/HourPicker;", "", "()V", "getPickerBuilder", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "isTwentyFourHours", "", "isLoop", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.single.c */
public final class HourPicker {

    /* renamed from: a */
    public static final HourPicker f63773a = new HourPicker();

    private HourPicker() {
    }

    /* renamed from: a */
    public final PickerBuilder mo91633a(boolean z, boolean z2) {
        TwelveHourWheelAdapter fVar;
        if (z) {
            fVar = new CustomNumericWheelAdapter(0, 23);
        } else {
            fVar = new TwelveHourWheelAdapter();
        }
        PickerBuilder pickerBuilder = new PickerBuilder(fVar);
        pickerBuilder.setShowTwoFigure(true);
        pickerBuilder.setLoop(z2);
        return pickerBuilder;
    }
}
