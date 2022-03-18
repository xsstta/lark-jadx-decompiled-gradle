package com.larksuite.component.universe_design.timepicker.impl.single;

import android.content.Context;
import com.larksuite.component.universe_design.timepicker.impl.adapter.AMPMWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/single/AMPMPicker;", "", "()V", "getPickerBuilder", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "context", "Landroid/content/Context;", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.single.a */
public final class AMPMPicker {

    /* renamed from: a */
    public static final AMPMPicker f63771a = new AMPMPicker();

    private AMPMPicker() {
    }

    /* renamed from: a */
    public final PickerBuilder mo91631a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return new PickerBuilder(new AMPMWheelAdapter(new String[]{context.getResources().getString(R.string.Calendar_StandardTime_AM), context.getResources().getString(R.string.Calendar_StandardTime_PM)}));
    }
}
