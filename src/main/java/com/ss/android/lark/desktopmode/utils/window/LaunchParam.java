package com.ss.android.lark.desktopmode.utils.window;

import android.content.Context;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/desktopmode/utils/window/LaunchParam;", "", "coordinate", "", "launchMode", "", "windowWidth", "windowHeight", "clipChildren", "", "([IIIIZ)V", "getClipChildren", "()Z", "getCoordinate", "()[I", "getLaunchMode", "()I", "getWindowHeight", "getWindowWidth", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "desktop-mode_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.desktopmode.utils.d.c */
public final class LaunchParam {

    /* renamed from: a */
    public static final Companion f94151a = new Companion(null);

    /* renamed from: b */
    private final int[] f94152b;

    /* renamed from: c */
    private final int f94153c;

    /* renamed from: d */
    private final int f94154d;

    /* renamed from: e */
    private final int f94155e;

    /* renamed from: f */
    private final boolean f94156f;

    @JvmStatic
    /* renamed from: a */
    public static final LaunchParam m144350a(Context context, StandAloneParam standAloneParam) {
        return f94151a.mo134990a(context, standAloneParam);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LaunchParam) {
                LaunchParam cVar = (LaunchParam) obj;
                if (Intrinsics.areEqual(this.f94152b, cVar.f94152b)) {
                    if (this.f94153c == cVar.f94153c) {
                        if (this.f94154d == cVar.f94154d) {
                            if (this.f94155e == cVar.f94155e) {
                                if (this.f94156f == cVar.f94156f) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int[] iArr = this.f94152b;
        int hashCode = (((((((iArr != null ? Arrays.hashCode(iArr) : 0) * 31) + this.f94153c) * 31) + this.f94154d) * 31) + this.f94155e) * 31;
        boolean z = this.f94156f;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        return "LaunchParam(coordinate=" + Arrays.toString(this.f94152b) + ", launchMode=" + this.f94153c + ", windowWidth=" + this.f94154d + ", windowHeight=" + this.f94155e + ", clipChildren=" + this.f94156f + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/desktopmode/utils/window/LaunchParam$Companion;", "", "()V", "parseToLaunchParam", "Lcom/ss/android/lark/desktopmode/utils/window/LaunchParam;", "context", "Landroid/content/Context;", "standAloneParam", "Lcom/ss/android/lark/desktopmode/base/StandAloneParam;", "desktop-mode_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.desktopmode.utils.d.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final LaunchParam mo134990a(Context context, StandAloneParam standAloneParam) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(standAloneParam, "standAloneParam");
            int[] targetCoordination = standAloneParam.getTargetCoordination();
            Intrinsics.checkExpressionValueIsNotNull(targetCoordination, "standAloneParam.targetCoordination");
            return new LaunchParam(targetCoordination, standAloneParam.getLaunchMode(), UIUtils.dp2px(context, (float) standAloneParam.getTargetWindowWidth()), UIUtils.dp2px(context, (float) standAloneParam.getTargetWindowHeight()), standAloneParam.isClipChildren());
        }
    }

    /* renamed from: a */
    public final int[] mo134982a() {
        return this.f94152b;
    }

    /* renamed from: b */
    public final int mo134983b() {
        return this.f94153c;
    }

    /* renamed from: c */
    public final int mo134984c() {
        return this.f94154d;
    }

    /* renamed from: d */
    public final int mo134985d() {
        return this.f94155e;
    }

    /* renamed from: e */
    public final boolean mo134986e() {
        return this.f94156f;
    }

    public LaunchParam(int[] iArr, int i, int i2, int i3, boolean z) {
        Intrinsics.checkParameterIsNotNull(iArr, "coordinate");
        this.f94152b = iArr;
        this.f94153c = i;
        this.f94154d = i2;
        this.f94155e = i3;
        this.f94156f = z;
    }
}
