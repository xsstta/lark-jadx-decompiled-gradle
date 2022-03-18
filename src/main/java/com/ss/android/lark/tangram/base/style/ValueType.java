package com.ss.android.lark.tangram.base.style;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/tangram/base/style/ValueType;", "", "Ljava/io/Serializable;", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "AUTO", "POINT", "PERCENTAGE", "Companion", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum ValueType implements Serializable {
    AUTO(0),
    POINT(1),
    PERCENTAGE(2);
    
    public static final Companion Companion = new Companion(null);
    private int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/tangram/base/style/ValueType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/tangram/base/style/ValueType;", "value", "", "valueOf", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.tangram.base.style.ValueType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ValueType mo188869a(int i) {
            return m214817b(i);
        }

        /* renamed from: b */
        private final ValueType m214817b(int i) {
            if (i == 0) {
                return ValueType.AUTO;
            }
            if (i == 1) {
                return ValueType.POINT;
            }
            if (i != 2) {
                return ValueType.AUTO;
            }
            return ValueType.PERCENTAGE;
        }
    }

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    private ValueType(int i) {
        this.value = i;
    }
}
