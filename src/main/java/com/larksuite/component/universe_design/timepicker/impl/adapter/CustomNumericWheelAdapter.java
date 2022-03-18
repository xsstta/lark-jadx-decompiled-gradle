package com.larksuite.component.universe_design.timepicker.impl.adapter;

import com.huawei.hms.site.ActivityC23764o;
import com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0002\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/adapter/CustomNumericWheelAdapter;", "Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;", "", "minValue", "maxValue", "(II)V", "interval", "(III)V", "<set-?>", "getMaxValue", "()I", "getMinValue", "getItem", "index", "(I)Ljava/lang/Integer;", "getItemsCount", "indexOf", ActivityC23764o.f58839a, "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.a.b */
public final class CustomNumericWheelAdapter implements BaseWheelAdapter<Integer> {

    /* renamed from: a */
    private int f63685a;

    /* renamed from: b */
    private int f63686b;

    /* renamed from: c */
    private int f63687c;

    /* renamed from: b */
    public final int mo91455b() {
        return this.f63685a;
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
    /* renamed from: a */
    public int mo91448a() {
        return ((this.f63686b - this.f63685a) / this.f63687c) + 1;
    }

    /* renamed from: c */
    public int mo91456c(int i) {
        return (i - this.f63685a) / this.f63687c;
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
    /* renamed from: b */
    public int mo91452b(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "any");
        return BaseWheelAdapter.C25793a.m93151a(this, obj);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
    /* renamed from: a */
    public /* synthetic */ int mo91449a(Integer num) {
        return mo91456c(num.intValue());
    }

    /* renamed from: a */
    public Integer mo91453b(int i) {
        int i2;
        int a = mo91448a();
        if (i >= 0 && a > i) {
            i2 = this.f63685a + (i * this.f63687c);
        } else {
            i2 = 0;
        }
        return Integer.valueOf(i2);
    }

    public CustomNumericWheelAdapter(int i, int i2) {
        this.f63685a = i;
        this.f63686b = i2;
        this.f63687c = 1;
    }

    public CustomNumericWheelAdapter(int i, int i2, int i3) {
        this.f63685a = i;
        this.f63686b = i2;
        this.f63687c = i3;
    }
}
