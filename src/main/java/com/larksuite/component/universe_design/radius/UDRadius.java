package com.larksuite.component.universe_design.radius;

import android.content.Context;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/larksuite/component/universe_design/radius/UDRadius;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "getRadiusSize", "context", "Landroid/content/Context;", "NONE", "XS", "S", "M", "L", "XL", "XXL", "ROUND", "Companion", "universe-ui-core_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum UDRadius {
    NONE(0),
    XS(1),
    S(2),
    M(3),
    L(4),
    XL(5),
    XXL(6),
    ROUND(6);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/universe_design/radius/UDRadius$Companion;", "", "()V", "of", "Lcom/larksuite/component/universe_design/radius/UDRadius;", "value", "", "universe-ui-core_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.radius.UDRadius$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final UDRadius mo91123a(int i) {
            switch (i) {
                case 0:
                    return UDRadius.NONE;
                case 1:
                    return UDRadius.XS;
                case 2:
                    return UDRadius.S;
                case 3:
                    return UDRadius.M;
                case 4:
                    return UDRadius.L;
                case 5:
                    return UDRadius.XL;
                case 6:
                    return UDRadius.XXL;
                case 7:
                    return UDRadius.ROUND;
                default:
                    throw new IllegalArgumentException("no radius for value " + i + '!');
            }
        }
    }

    public final int getValue() {
        return this.value;
    }

    public final int getRadiusSize(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        switch (C25770a.f63532a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return UDDimenUtils.m93313d(context, R.dimen.ud_radius_xs);
            case 3:
                return UDDimenUtils.m93313d(context, R.dimen.ud_radius_s);
            case 4:
                return UDDimenUtils.m93313d(context, R.dimen.ud_radius_m);
            case 5:
                return UDDimenUtils.m93313d(context, R.dimen.ud_radius_l);
            case 6:
                return UDDimenUtils.m93313d(context, R.dimen.ud_radius_xl);
            case 7:
                return UDDimenUtils.m93313d(context, R.dimen.ud_radius_xxl);
            case 8:
                return -1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private UDRadius(int i) {
        this.value = i;
    }
}
