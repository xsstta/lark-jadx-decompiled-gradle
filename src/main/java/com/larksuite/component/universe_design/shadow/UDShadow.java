package com.larksuite.component.universe_design.shadow;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001a\b\u0001\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001eB/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001f"}, d2 = {"Lcom/larksuite/component/universe_design/shadow/UDShadow;", "", "value", "", "alpha", "", "size", "offsetX", "offsetY", "(Ljava/lang/String;IIFIII)V", "getAlpha", "()F", "getOffsetX", "()I", "getOffsetY", "getSize", "getValue", "NONE", "S_UP", "S_DOWN", "S_LEFT", "S_RIGHT", "M_UP", "M_DOWN", "M_LEFT", "M_RIGHT", "L_UP", "L_DOWN", "L_LEFT", "L_RIGHT", "Companion", "universe-ui-core_release"}, mo238835k = 1, mv = {1, 1, 16})
@Deprecated(message = "请使用 UDShadowLayout", replaceWith = @ReplaceWith(expression = "UDShadowLayout", imports = {}))
public enum UDShadow {
    NONE(0, BitmapDescriptorFactory.HUE_RED, 0, 0, 0),
    S_UP(1, 0.12f, 4, 0, -2),
    S_DOWN(2, 0.12f, 4, 0, 2),
    S_LEFT(3, 0.12f, 4, -2, 0),
    S_RIGHT(4, 0.12f, 4, 2, 0),
    M_UP(5, 0.1f, 8, 0, -4),
    M_DOWN(6, 0.1f, 8, 0, 4),
    M_LEFT(7, 0.1f, 8, -4, 0),
    M_RIGHT(8, 0.1f, 8, -4, 0),
    L_UP(9, 0.08f, 24, 0, -6),
    L_DOWN(10, 0.08f, 24, 0, 6),
    L_LEFT(11, 0.08f, 24, -6, 0),
    L_RIGHT(12, 0.08f, 24, 6, 0);
    
    public static final Companion Companion = new Companion(null);
    private final float alpha;
    private final int offsetX;
    private final int offsetY;
    private final int size;
    private final int value;

    @JvmStatic
    public static final UDShadow of(int i) {
        return Companion.mo91195a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/universe_design/shadow/UDShadow$Companion;", "", "()V", "of", "Lcom/larksuite/component/universe_design/shadow/UDShadow;", "value", "", "universe-ui-core_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.shadow.UDShadow$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final UDShadow mo91195a(int i) {
            switch (i) {
                case 0:
                    return UDShadow.NONE;
                case 1:
                    return UDShadow.S_UP;
                case 2:
                    return UDShadow.S_DOWN;
                case 3:
                    return UDShadow.S_LEFT;
                case 4:
                    return UDShadow.S_RIGHT;
                case 5:
                    return UDShadow.M_UP;
                case 6:
                    return UDShadow.M_DOWN;
                case 7:
                    return UDShadow.M_LEFT;
                case 8:
                    return UDShadow.M_RIGHT;
                case 9:
                    return UDShadow.L_UP;
                case 10:
                    return UDShadow.L_DOWN;
                case 11:
                    return UDShadow.L_LEFT;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return UDShadow.L_RIGHT;
                default:
                    throw new IllegalArgumentException("no shadow for value " + i);
            }
        }
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final int getOffsetX() {
        return this.offsetX;
    }

    public final int getOffsetY() {
        return this.offsetY;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getValue() {
        return this.value;
    }

    private UDShadow(int i, float f, int i2, int i3, int i4) {
        this.value = i;
        this.alpha = f;
        this.size = i2;
        this.offsetX = i3;
        this.offsetY = i4;
    }
}
