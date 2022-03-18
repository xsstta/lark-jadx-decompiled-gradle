package com.larksuite.component.universe_design.timepicker.impl.adapter;

import com.huawei.hms.site.ActivityC23764o;
import com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.base.IPickerViewData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0014\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0014\u0010\u0012\u001a\u00020\u00042\n\u0010\u0013\u001a\u00060\u0002R\u00020\u0000H\u0016R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/adapter/MonthWheelAdapter;", "Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;", "Lcom/larksuite/component/universe_design/timepicker/impl/adapter/MonthWheelAdapter$MonthItemData;", "minValue", "", "maxValue", "monthStringArray", "", "", "(II[Ljava/lang/String;)V", "<set-?>", "getMaxValue", "()I", "getMinValue", "[Ljava/lang/String;", "getItem", "index", "getItemsCount", "indexOf", ActivityC23764o.f58839a, "MonthItemData", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.a.e */
public final class MonthWheelAdapter implements BaseWheelAdapter<MonthItemData> {

    /* renamed from: a */
    public int f63704a;

    /* renamed from: b */
    public final String[] f63705b;

    /* renamed from: c */
    private int f63706c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/adapter/MonthWheelAdapter$MonthItemData;", "Lcom/larksuite/component/universe_design/timepicker/impl/base/IPickerViewData;", "index", "", "(Lcom/larksuite/component/universe_design/timepicker/impl/adapter/MonthWheelAdapter;I)V", "getIndex", "()I", "getPickerViewText", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.a.e$a */
    public final class MonthItemData implements IPickerViewData {

        /* renamed from: b */
        private final int f63708b;

        /* renamed from: b */
        public final int mo91470b() {
            return this.f63708b;
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.IPickerViewData
        /* renamed from: a */
        public String mo91459a() {
            int i;
            int a = MonthWheelAdapter.this.mo91448a();
            int i2 = this.f63708b;
            if (i2 >= 0 && a > i2) {
                i = (MonthWheelAdapter.this.mo91469b() + this.f63708b) - 1;
            } else {
                i = -1;
            }
            int length = MonthWheelAdapter.this.f63705b.length;
            if (i < 0 || length <= i) {
                return "";
            }
            return MonthWheelAdapter.this.f63705b[i];
        }

        public MonthItemData(int i) {
            this.f63708b = i;
        }
    }

    /* renamed from: b */
    public final int mo91469b() {
        return this.f63704a;
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
    /* renamed from: a */
    public int mo91448a() {
        return (this.f63706c - this.f63704a) + 1;
    }

    /* renamed from: a */
    public int mo91449a(MonthItemData aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, ActivityC23764o.f58839a);
        return aVar.mo91470b();
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
    /* renamed from: b */
    public int mo91452b(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "any");
        return BaseWheelAdapter.C25793a.m93151a(this, obj);
    }

    /* renamed from: a */
    public MonthItemData mo91453b(int i) {
        return new MonthItemData(i);
    }

    public MonthWheelAdapter(int i, int i2, String[] strArr) {
        Intrinsics.checkParameterIsNotNull(strArr, "monthStringArray");
        this.f63705b = strArr;
        this.f63704a = i;
        this.f63706c = i2;
    }
}
