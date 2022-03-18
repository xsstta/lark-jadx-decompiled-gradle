package com.ss.android.lark.guide.ui.config;

import android.graphics.Point;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0012B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0017\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/guide/ui/config/AnchorConfig;", "", "anchorView", "Landroid/view/View;", "anchorDirect", "Lcom/ss/android/lark/guide/ui/config/AnchorConfig$AnchorGravity;", "anchorOffset", "Landroid/graphics/Point;", "(Landroid/view/View;Lcom/ss/android/lark/guide/ui/config/AnchorConfig$AnchorGravity;Landroid/graphics/Point;)V", "anchorViewRef", "Ljava/lang/ref/WeakReference;", "(Ljava/lang/ref/WeakReference;Lcom/ss/android/lark/guide/ui/config/AnchorConfig$AnchorGravity;)V", "getAnchorDirect", "()Lcom/ss/android/lark/guide/ui/config/AnchorConfig$AnchorGravity;", "getAnchorOffset", "()Landroid/graphics/Point;", "getAnchorViewRef", "()Ljava/lang/ref/WeakReference;", "AnchorGravity", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AnchorConfig {

    /* renamed from: a */
    private final WeakReference<? extends View> f99502a;

    /* renamed from: b */
    private final AnchorGravity f99503b;

    /* renamed from: c */
    private final Point f99504c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/guide/ui/config/AnchorConfig$AnchorGravity;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "START", "END", "TOP", "BOTTOM", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    public enum AnchorGravity {
        START(8388611),
        END(8388613),
        TOP(48),
        BOTTOM(80);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private AnchorGravity(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public final WeakReference<? extends View> mo141746a() {
        return this.f99502a;
    }

    /* renamed from: b */
    public final AnchorGravity mo141747b() {
        return this.f99503b;
    }

    /* renamed from: c */
    public final Point mo141748c() {
        return this.f99504c;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "No need to wrap it up in WeakReference object, it will be done inside the code. Directly use the view.")
    public AnchorConfig(WeakReference<? extends View> weakReference, AnchorGravity anchorGravity) {
        Intrinsics.checkParameterIsNotNull(weakReference, "anchorViewRef");
        Intrinsics.checkParameterIsNotNull(anchorGravity, "anchorDirect");
        this.f99502a = weakReference;
        this.f99503b = anchorGravity;
        this.f99504c = new Point();
    }

    public AnchorConfig(View view, AnchorGravity anchorGravity, Point point) {
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        Intrinsics.checkParameterIsNotNull(anchorGravity, "anchorDirect");
        Intrinsics.checkParameterIsNotNull(point, "anchorOffset");
        this.f99502a = new WeakReference<>(view);
        this.f99503b = anchorGravity;
        this.f99504c = point;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnchorConfig(View view, AnchorGravity anchorGravity, Point point, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, anchorGravity, (i & 4) != 0 ? new Point() : point);
    }
}
