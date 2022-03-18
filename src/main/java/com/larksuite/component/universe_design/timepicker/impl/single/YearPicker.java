package com.larksuite.component.universe_design.timepicker.impl.single;

import com.larksuite.component.universe_design.timepicker.impl.adapter.CustomNumericWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/single/YearPicker;", "", "()V", "getPickerBuilder", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "startYear", "", "endYear", "isLoop", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class YearPicker {
    public static final YearPicker INSTANCE = new YearPicker();

    private YearPicker() {
    }

    public final PickerBuilder getPickerBuilder(int i, int i2, boolean z) {
        if (i < 0 || i2 < 0 || i > i2) {
            return null;
        }
        PickerBuilder pickerBuilder = new PickerBuilder(new CustomNumericWheelAdapter(i, i2));
        pickerBuilder.setLoop(z);
        return pickerBuilder;
    }
}
