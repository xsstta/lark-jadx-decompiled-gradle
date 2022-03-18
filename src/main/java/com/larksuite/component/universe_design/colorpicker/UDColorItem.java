package com.larksuite.component.universe_design.colorpicker;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/universe_design/colorpicker/UDColorItem;", "", "color", "", "(I)V", "getColor", "()I", "equals", "", "other", "hashCode", "universe-ui-colorpicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.colorpicker.d */
public class UDColorItem {

    /* renamed from: a */
    private final int f63170a;

    /* renamed from: a */
    public final int mo90416a() {
        return this.f63170a;
    }

    public int hashCode() {
        return this.f63170a;
    }

    public UDColorItem(int i) {
        this.f63170a = i;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.colorpicker.UDColorItem");
        } else if (this.f63170a != ((UDColorItem) obj).f63170a) {
            return false;
        } else {
            return true;
        }
    }
}
