package com.bytedance.ies.bullet.service.schema.param.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ies/bullet/service/schema/param/core/OutAnimationType;", "", "VALUE", "", "VALUE_INT", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getVALUE", "()Ljava/lang/String;", "getVALUE_INT", "()I", "AUTO", "BOTTOM", "RIGHT", "Companion", "x-schema_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum OutAnimationType {
    AUTO("auto", 0),
    BOTTOM("bottom", 1),
    RIGHT("right", 2);
    
    public static final Companion Companion = new Companion(null);
    private final String VALUE;
    private final int VALUE_INT;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ies/bullet/service/schema/param/core/OutAnimationType$Companion;", "", "()V", "parse", "Lcom/bytedance/ies/bullet/service/schema/param/core/OutAnimationType;", "value", "", "", "x-schema_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.schema.param.core.OutAnimationType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final OutAnimationType mo52814a(int i) {
            OutAnimationType[] values = OutAnimationType.values();
            for (OutAnimationType outAnimationType : values) {
                if (i == outAnimationType.getVALUE_INT()) {
                    return outAnimationType;
                }
            }
            return null;
        }

        /* renamed from: a */
        public final OutAnimationType mo52815a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "value");
            OutAnimationType[] values = OutAnimationType.values();
            for (OutAnimationType outAnimationType : values) {
                if (Intrinsics.areEqual(str, outAnimationType.getVALUE())) {
                    return outAnimationType;
                }
            }
            Integer intOrNull = StringsKt.toIntOrNull(str);
            if (intOrNull == null) {
                return null;
            }
            return OutAnimationType.Companion.mo52814a(intOrNull.intValue());
        }
    }

    public final String getVALUE() {
        return this.VALUE;
    }

    public final int getVALUE_INT() {
        return this.VALUE_INT;
    }

    private OutAnimationType(String str, int i) {
        this.VALUE = str;
        this.VALUE_INT = i;
    }
}
