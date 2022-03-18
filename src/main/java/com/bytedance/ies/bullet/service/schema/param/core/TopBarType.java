package com.bytedance.ies.bullet.service.schema.param.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/bullet/service/schema/param/core/TopBarType;", "", "VALUE", "", "(Ljava/lang/String;II)V", "getVALUE", "()I", "IMMERSIVE", "GRADUAL_CHANGE", "NORMAL", "Companion", "x-schema_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum TopBarType {
    IMMERSIVE(1),
    GRADUAL_CHANGE(2),
    NORMAL(3);
    
    public static final Companion Companion = new Companion(null);
    private final int VALUE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ies/bullet/service/schema/param/core/TopBarType$Companion;", "", "()V", "parse", "Lcom/bytedance/ies/bullet/service/schema/param/core/TopBarType;", "value", "", "", "x-schema_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.schema.param.core.TopBarType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TopBarType mo52819a(int i) {
            TopBarType[] values = TopBarType.values();
            for (TopBarType topBarType : values) {
                if (i == topBarType.getVALUE()) {
                    return topBarType;
                }
            }
            return null;
        }

        /* renamed from: a */
        public final TopBarType mo52820a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "value");
            Integer intOrNull = StringsKt.toIntOrNull(str);
            if (intOrNull == null) {
                return null;
            }
            return TopBarType.Companion.mo52819a(intOrNull.intValue());
        }
    }

    public final int getVALUE() {
        return this.VALUE;
    }

    private TopBarType(int i) {
        this.VALUE = i;
    }
}
