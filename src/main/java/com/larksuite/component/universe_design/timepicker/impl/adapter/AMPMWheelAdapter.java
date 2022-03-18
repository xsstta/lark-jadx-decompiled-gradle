package com.larksuite.component.universe_design.timepicker.impl.adapter;

import com.huawei.hms.site.ActivityC23764o;
import com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/adapter/AMPMWheelAdapter;", "Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;", "", "mAMPMArray", "", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "getItem", "index", "", "getItemsCount", "indexOf", ActivityC23764o.f58839a, "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.a.a */
public final class AMPMWheelAdapter implements BaseWheelAdapter<String> {

    /* renamed from: a */
    private final String[] f63684a;

    @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
    /* renamed from: a */
    public int mo91448a() {
        return 2;
    }

    public AMPMWheelAdapter(String[] strArr) {
        Intrinsics.checkParameterIsNotNull(strArr, "mAMPMArray");
        this.f63684a = strArr;
    }

    /* renamed from: a */
    public String mo91453b(int i) {
        if (i < 0 || i > 1) {
            return "";
        }
        return this.f63684a[i];
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
    /* renamed from: b */
    public int mo91452b(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "any");
        return BaseWheelAdapter.C25793a.m93151a(this, obj);
    }

    /* renamed from: a */
    public int mo91449a(String str) {
        Intrinsics.checkParameterIsNotNull(str, ActivityC23764o.f58839a);
        return !Intrinsics.areEqual(str, this.f63684a[0]) ? 1 : 0;
    }
}
