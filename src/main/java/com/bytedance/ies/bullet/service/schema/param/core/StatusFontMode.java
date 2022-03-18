package com.bytedance.ies.bullet.service.schema.param.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/bullet/service/schema/param/core/StatusFontMode;", "", "VALUE", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getVALUE", "()Ljava/lang/String;", "AUTO", "LIGHT", "DARK", "Companion", "x-schema_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum StatusFontMode {
    AUTO("auto"),
    LIGHT("light"),
    DARK("dark");
    
    public static final Companion Companion = new Companion(null);
    private final String VALUE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/bullet/service/schema/param/core/StatusFontMode$Companion;", "", "()V", "parse", "Lcom/bytedance/ies/bullet/service/schema/param/core/StatusFontMode;", "value", "", "x-schema_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.schema.param.core.StatusFontMode$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final StatusFontMode mo52817a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "value");
            StatusFontMode[] values = StatusFontMode.values();
            for (StatusFontMode statusFontMode : values) {
                if (Intrinsics.areEqual(str, statusFontMode.getVALUE())) {
                    return statusFontMode;
                }
            }
            return StatusFontMode.AUTO;
        }
    }

    public final String getVALUE() {
        return this.VALUE;
    }

    private StatusFontMode(String str) {
        this.VALUE = str;
    }
}
