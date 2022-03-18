package com.larksuite.component.universe_design.timepicker.impl.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerModel;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "MONTHDAY_HOUR_MINUTE_12H", "MONTHDAY_HOUR_MINUTE_24H", "HOUR_MINUTE_12H", "HOUR_MINUTE_24H", "YEAR_MONTH_DAY", "MONTH_DAY", "Companion", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum PickerModel {
    MONTHDAY_HOUR_MINUTE_12H(0),
    MONTHDAY_HOUR_MINUTE_24H(1),
    HOUR_MINUTE_12H(2),
    HOUR_MINUTE_24H(3),
    YEAR_MONTH_DAY(4),
    MONTH_DAY(5);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerModel$Companion;", "", "()V", "valueOf", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerModel;", "value", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.data.PickerModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PickerModel mo91600a(int i) {
            if (i == 0) {
                return PickerModel.MONTHDAY_HOUR_MINUTE_12H;
            }
            if (i == 1) {
                return PickerModel.MONTHDAY_HOUR_MINUTE_24H;
            }
            if (i == 2) {
                return PickerModel.HOUR_MINUTE_12H;
            }
            if (i == 3) {
                return PickerModel.HOUR_MINUTE_24H;
            }
            if (i == 4) {
                return PickerModel.YEAR_MONTH_DAY;
            }
            if (i != 5) {
                return null;
            }
            return PickerModel.MONTH_DAY;
        }
    }

    public final int getValue() {
        return this.value;
    }

    private PickerModel(int i) {
        this.value = i;
    }
}
