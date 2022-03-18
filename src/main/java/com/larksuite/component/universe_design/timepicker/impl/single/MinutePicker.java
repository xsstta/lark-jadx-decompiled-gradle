package com.larksuite.component.universe_design.timepicker.impl.single;

import com.larksuite.component.universe_design.timepicker.impl.adapter.CustomNumericWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/single/MinutePicker;", "", "()V", "getPickerBuilder", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "isLoop", "", "minValue", "", "maxValue", "interval", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.single.d */
public final class MinutePicker {

    /* renamed from: a */
    public static final MinutePicker f63774a = new MinutePicker();

    private MinutePicker() {
    }

    /* renamed from: a */
    public final PickerBuilder mo91634a(boolean z, int i, int i2, int i3) {
        PickerBuilder pickerBuilder = new PickerBuilder(new CustomNumericWheelAdapter(i, i2, i3));
        pickerBuilder.setShowTwoFigure(true);
        pickerBuilder.setLoop(z);
        return pickerBuilder;
    }
}
