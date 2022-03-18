package com.ss.android.lark.guide.ui.config;

import android.graphics.Rect;
import android.util.Size;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0017B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/guide/ui/config/MaskConfig;", "", "shadowAlpha", "", "offset", "", "shapeType", "Lcom/ss/android/lark/guide/ui/config/MaskConfig$ShapeType;", "highlightRect", "Landroid/graphics/Rect;", "minSize", "Landroid/util/Size;", "(IFLcom/ss/android/lark/guide/ui/config/MaskConfig$ShapeType;Landroid/graphics/Rect;Landroid/util/Size;)V", "getHighlightRect", "()Landroid/graphics/Rect;", "getMinSize", "()Landroid/util/Size;", "getOffset", "()F", "getShadowAlpha", "()I", "getShapeType", "()Lcom/ss/android/lark/guide/ui/config/MaskConfig$ShapeType;", "ShapeType", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class MaskConfig {

    /* renamed from: a */
    private final int f99505a;

    /* renamed from: b */
    private final float f99506b;

    /* renamed from: c */
    private final ShapeType f99507c;

    /* renamed from: d */
    private final Rect f99508d;

    /* renamed from: e */
    private final Size f99509e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/guide/ui/config/MaskConfig$ShapeType;", "", "(Ljava/lang/String;I)V", "RECTANGLE", "CIRCLE", "SQUARE", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    public enum ShapeType {
        RECTANGLE,
        CIRCLE,
        SQUARE
    }

    public MaskConfig() {
        this(0, BitmapDescriptorFactory.HUE_RED, null, null, null, 31, null);
    }

    /* renamed from: a */
    public final int mo141750a() {
        return this.f99505a;
    }

    /* renamed from: b */
    public final float mo141751b() {
        return this.f99506b;
    }

    /* renamed from: c */
    public final ShapeType mo141752c() {
        return this.f99507c;
    }

    /* renamed from: d */
    public final Rect mo141753d() {
        return this.f99508d;
    }

    /* renamed from: e */
    public final Size mo141754e() {
        return this.f99509e;
    }

    public MaskConfig(int i, float f, ShapeType shapeType, Rect rect, Size size) {
        Intrinsics.checkParameterIsNotNull(shapeType, "shapeType");
        this.f99505a = i;
        this.f99506b = f;
        this.f99507c = shapeType;
        this.f99508d = rect;
        this.f99509e = size;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MaskConfig(int r4, float r5, com.ss.android.lark.guide.ui.config.MaskConfig.ShapeType r6, android.graphics.Rect r7, android.util.Size r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0005
            r4 = 0
        L_0x0005:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            r5 = 0
            r10 = 0
            goto L_0x000d
        L_0x000c:
            r10 = r5
        L_0x000d:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            com.ss.android.lark.guide.ui.config.MaskConfig$ShapeType r6 = com.ss.android.lark.guide.ui.config.MaskConfig.ShapeType.RECTANGLE
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            r6 = 0
            if (r5 == 0) goto L_0x001c
            r7 = r6
            android.graphics.Rect r7 = (android.graphics.Rect) r7
        L_0x001c:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0024
            r8 = r6
            android.util.Size r8 = (android.util.Size) r8
        L_0x0024:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.guide.ui.config.MaskConfig.<init>(int, float, com.ss.android.lark.guide.ui.config.MaskConfig$ShapeType, android.graphics.Rect, android.util.Size, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
