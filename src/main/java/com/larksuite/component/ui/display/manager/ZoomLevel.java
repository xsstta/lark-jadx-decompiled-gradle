package com.larksuite.component.ui.display.manager;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/larksuite/component/ui/display/manager/ZoomLevel;", "", "level", "", "multiplier", "", "(Ljava/lang/String;IIF)V", "getLevel", "()I", "getMultiplier", "()F", "SMALL", "NORMAL", "LARGE1", "LARGE2", "LARGE3", "LARGE4", "Companion", "display_manager_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum ZoomLevel {
    SMALL(-1, 0.92f),
    NORMAL(0, 1.0f),
    LARGE1(1, 1.08f),
    LARGE2(2, 1.17f),
    LARGE3(3, 1.28f),
    LARGE4(4, 1.38f);
    
    public static final Companion Companion = new Companion(null);
    private final int level;
    private final float multiplier;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/larksuite/component/ui/display/manager/ZoomLevel$Companion;", "", "()V", "fromValue", "Lcom/larksuite/component/ui/display/manager/ZoomLevel;", "value", "", "(Ljava/lang/Integer;)Lcom/larksuite/component/ui/display/manager/ZoomLevel;", "display_manager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.larksuite.component.ui.display.manager.ZoomLevel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ZoomLevel mo89305a(Integer num) {
            ZoomLevel[] values = ZoomLevel.values();
            for (ZoomLevel zoomLevel : values) {
                int level = zoomLevel.getLevel();
                if (num != null && num.intValue() == level) {
                    return zoomLevel;
                }
            }
            return ZoomLevel.NORMAL;
        }
    }

    public final int getLevel() {
        return this.level;
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    private ZoomLevel(int i, float f) {
        this.level = i;
        this.multiplier = f;
    }
}
