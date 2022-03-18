package com.bytedance.ee.bear.middleground.comment.export.bean;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentAnimationParam;", "", "horizontal", "", "startValue", "", "endValue", "exit", "shouldResetHeight", "showAnimWhenClickEmptyToDismiss", "listener", "Landroid/animation/Animator$AnimatorListener;", "interpolator", "Lkotlin/Function1;", "duration", "", "(ZFFZZZLandroid/animation/Animator$AnimatorListener;Lkotlin/jvm/functions/Function1;J)V", "clickEmptyToDismiss", "getClickEmptyToDismiss", "()Z", "setClickEmptyToDismiss", "(Z)V", "getDuration", "()J", "getEndValue", "()F", "getExit", "getHorizontal", "getInterpolator", "()Lkotlin/jvm/functions/Function1;", "getListener", "()Landroid/animation/Animator$AnimatorListener;", "getShouldResetHeight", "getShowAnimWhenClickEmptyToDismiss", "getStartValue", "middleground-comment-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.export.bean.a */
public final class CommentAnimationParam {

    /* renamed from: a */
    private boolean f24811a;

    /* renamed from: b */
    private final boolean f24812b;

    /* renamed from: c */
    private final float f24813c;

    /* renamed from: d */
    private final float f24814d;

    /* renamed from: e */
    private final boolean f24815e;

    /* renamed from: f */
    private final boolean f24816f;

    /* renamed from: g */
    private final boolean f24817g;

    /* renamed from: h */
    private final Animator.AnimatorListener f24818h;

    /* renamed from: i */
    private final Function1<Float, Float> f24819i;

    /* renamed from: j */
    private final long f24820j;

    public CommentAnimationParam(boolean z, float f, float f2, boolean z2, boolean z3, boolean z4, Animator.AnimatorListener animatorListener) {
        this(z, f, f2, z2, z3, z4, animatorListener, null, 0, 384, null);
    }

    /* renamed from: b */
    public final boolean mo35245b() {
        return this.f24812b;
    }

    /* renamed from: c */
    public final float mo35246c() {
        return this.f24813c;
    }

    /* renamed from: d */
    public final float mo35247d() {
        return this.f24814d;
    }

    /* renamed from: e */
    public final boolean mo35248e() {
        return this.f24815e;
    }

    /* renamed from: f */
    public final boolean mo35249f() {
        return this.f24816f;
    }

    /* renamed from: g */
    public final boolean mo35250g() {
        return this.f24817g;
    }

    /* renamed from: h */
    public final Animator.AnimatorListener mo35251h() {
        return this.f24818h;
    }

    /* renamed from: i */
    public final Function1<Float, Float> mo35252i() {
        return this.f24819i;
    }

    /* renamed from: j */
    public final long mo35253j() {
        return this.f24820j;
    }

    /* renamed from: a */
    public final boolean mo35244a() {
        return this.f24811a;
    }

    /* renamed from: a */
    public final void mo35243a(boolean z) {
        this.f24811a = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> */
    /* JADX WARN: Multi-variable type inference failed */
    public CommentAnimationParam(boolean z, float f, float f2, boolean z2, boolean z3, boolean z4, Animator.AnimatorListener animatorListener, Function1<? super Float, Float> function1, long j) {
        Intrinsics.checkParameterIsNotNull(function1, "interpolator");
        this.f24812b = z;
        this.f24813c = f;
        this.f24814d = f2;
        this.f24815e = z2;
        this.f24816f = z3;
        this.f24817g = z4;
        this.f24818h = animatorListener;
        this.f24819i = function1;
        this.f24820j = j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CommentAnimationParam(boolean r15, float r16, float r17, boolean r18, boolean r19, boolean r20, android.animation.Animator.AnimatorListener r21, kotlin.jvm.functions.Function1 r22, long r23, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 16
            r2 = 1
            if (r1 == 0) goto L_0x0009
            r8 = 1
            goto L_0x000b
        L_0x0009:
            r8 = r19
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r9 = 1
            goto L_0x0013
        L_0x0011:
            r9 = r20
        L_0x0013:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x001c
            r1 = 0
            android.animation.Animator$AnimatorListener r1 = (android.animation.Animator.AnimatorListener) r1
            r10 = r1
            goto L_0x001e
        L_0x001c:
            r10 = r21
        L_0x001e:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0028
            com.bytedance.ee.bear.middleground.comment.export.bean.a$1 r1 = com.bytedance.ee.bear.middleground.comment.export.bean.CommentAnimationParam.C92201.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r11 = r1
            goto L_0x002a
        L_0x0028:
            r11 = r22
        L_0x002a:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0032
            r0 = 300(0x12c, double:1.48E-321)
            r12 = r0
            goto L_0x0034
        L_0x0032:
            r12 = r23
        L_0x0034:
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.comment.export.bean.CommentAnimationParam.<init>(boolean, float, float, boolean, boolean, boolean, android.animation.Animator$AnimatorListener, kotlin.jvm.functions.Function1, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
