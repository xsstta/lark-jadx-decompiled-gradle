package com.larksuite.component.universe_design.timepicker.impl.base;

import com.huawei.hms.site.ActivityC23764o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0005H&J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;", "T", "", "getItem", "index", "", "(I)Ljava/lang/Object;", "getItemsCount", "indexOf", ActivityC23764o.f58839a, "(Ljava/lang/Object;)I", "indexOfAny", "any", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.base.a */
public interface BaseWheelAdapter<T> {
    /* renamed from: a */
    int mo91448a();

    /* renamed from: a */
    int mo91449a(T t);

    /* renamed from: b */
    int mo91452b(Object obj);

    /* renamed from: b */
    T mo91453b(int i);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.base.a$a */
    public static final class C25793a {
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static <T> int m93151a(BaseWheelAdapter<T> aVar, Object obj) {
            Intrinsics.checkParameterIsNotNull(obj, "any");
            if (obj != 0) {
                return aVar.mo91449a(obj);
            }
            return 0;
        }
    }
}
