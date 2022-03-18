package com.larksuite.component.universe_design.timepicker.impl.helper;

import com.larksuite.component.universe_design.timepicker.impl.data.PickerModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.helper.a */
public final /* synthetic */ class C25794a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f63738a;

    static {
        int[] iArr = new int[PickerModel.values().length];
        f63738a = iArr;
        iArr[PickerModel.HOUR_MINUTE_24H.ordinal()] = 1;
        iArr[PickerModel.HOUR_MINUTE_12H.ordinal()] = 2;
        iArr[PickerModel.YEAR_MONTH_DAY.ordinal()] = 3;
        iArr[PickerModel.MONTH_DAY.ordinal()] = 4;
        iArr[PickerModel.MONTHDAY_HOUR_MINUTE_24H.ordinal()] = 5;
        iArr[PickerModel.MONTHDAY_HOUR_MINUTE_12H.ordinal()] = 6;
    }
}
