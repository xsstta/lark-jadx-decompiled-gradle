package com.larksuite.component.universe_design.timepicker.impl.adapter;

import com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/adapter/TwelveHourWheelAdapter;", "Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;", "", "()V", "getItem", "index", "(I)Ljava/lang/Integer;", "getItemsCount", "indexOf", "item", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.a.f */
public final class TwelveHourWheelAdapter implements BaseWheelAdapter<Integer> {
    @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
    /* renamed from: a */
    public int mo91448a() {
        return 12;
    }

    /* renamed from: c */
    public int mo91472c(int i) {
        if (i != 12) {
            return i;
        }
        return 0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
    /* renamed from: a */
    public /* synthetic */ int mo91449a(Integer num) {
        return mo91472c(num.intValue());
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
    /* renamed from: b */
    public int mo91452b(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "any");
        return BaseWheelAdapter.C25793a.m93151a(this, obj);
    }

    /* renamed from: a */
    public Integer mo91453b(int i) {
        if (i == 0) {
            i = 12;
        } else {
            int a = mo91448a();
            if (i < 0 || a <= i) {
                i = 0;
            }
        }
        return Integer.valueOf(i);
    }
}
