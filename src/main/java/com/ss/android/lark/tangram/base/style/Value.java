package com.ss.android.lark.tangram.base.style;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/tangram/base/style/Value;", "Ljava/io/Serializable;", "valueType", "Lcom/ss/android/lark/tangram/base/style/ValueType;", "value", "", "(Lcom/ss/android/lark/tangram/base/style/ValueType;Ljava/lang/Float;)V", "getValue", "()Ljava/lang/Float;", "setValue", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getValueType", "()Lcom/ss/android/lark/tangram/base/style/ValueType;", "setValueType", "(Lcom/ss/android/lark/tangram/base/style/ValueType;)V", "component1", "component2", "copy", "(Lcom/ss/android/lark/tangram/base/style/ValueType;Ljava/lang/Float;)Lcom/ss/android/lark/tangram/base/style/Value;", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class Value implements Serializable {
    public static final Companion Companion = new Companion(null);
    private Float value;
    private ValueType valueType;

    public Value() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Value copy$default(Value value2, ValueType valueType2, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            valueType2 = value2.valueType;
        }
        if ((i & 2) != 0) {
            f = value2.value;
        }
        return value2.copy(valueType2, f);
    }

    @JvmStatic
    /* renamed from: default  reason: not valid java name */
    public static final Value m270987default() {
        return Companion.mo188866a();
    }

    public final ValueType component1() {
        return this.valueType;
    }

    public final Float component2() {
        return this.value;
    }

    public final Value copy(ValueType valueType2, Float f) {
        return new Value(valueType2, f);
    }

    public String toString() {
        return "Value(valueType=" + this.valueType + ", value=" + this.value + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/tangram/base/style/Value$Companion;", "", "()V", "default", "Lcom/ss/android/lark/tangram/base/style/Value;", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.tangram.base.style.Value$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final Value mo188866a() {
            return new Value(null, null, 3, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Float getValue() {
        return this.value;
    }

    public final ValueType getValueType() {
        return this.valueType;
    }

    public int hashCode() {
        int i;
        ValueType valueType2 = this.valueType;
        int i2 = 0;
        if (valueType2 != null) {
            i = valueType2.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Float f = this.value;
        if (f != null) {
            i2 = f.hashCode();
        }
        return i3 + i2;
    }

    public final void setValue(Float f) {
        this.value = f;
    }

    public final void setValueType(ValueType valueType2) {
        this.valueType = valueType2;
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
        if (obj != null) {
            Value value2 = (Value) obj;
            if (this.valueType == value2.valueType && !(!Intrinsics.areEqual(this.value, value2.value))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.tangram.base.style.Value");
    }

    public Value(ValueType valueType2, Float f) {
        this.valueType = valueType2;
        this.value = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Value(ValueType valueType2, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ValueType.AUTO : valueType2, (i & 2) != 0 ? Float.valueOf((float) BitmapDescriptorFactory.HUE_RED) : f);
    }
}
