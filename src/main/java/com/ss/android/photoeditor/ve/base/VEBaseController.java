package com.ss.android.photoeditor.ve.base;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.ve.controller.IImageEditController;
import com.ss.android.photoeditor.ve.crop.p3015a.animationInterpolatorC59853c;
import com.ss.android.photoeditor.ve.p3013b.C59831b;
import com.ss.android.photoeditor.ve.utils.ApparentMoveDetector;
import com.ss.android.ttve.utils.C60275a;
import com.ss.android.vesdk.VEImage;
import com.ss.android.vesdk.bean.C63956a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001a\b&\u0018\u0000 \u00012\u00020\u0001:\u0004\u0001\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J-\u0010Q\u001a\u00020R2%\b\u0002\u0010S\u001a\u001f\u0012\u0013\u0012\u00110\u001d¢\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(W\u0012\u0004\u0012\u00020R\u0018\u00010TJ_\u0010X\u001a\u00020R2\u0006\u0010Y\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u00122\u0006\u0010[\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010]\u001a\u00020\u001d2\b\b\u0002\u0010^\u001a\u00020_2%\b\u0002\u0010S\u001a\u001f\u0012\u0013\u0012\u00110\u001d¢\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(W\u0012\u0004\u0012\u00020R\u0018\u00010TJ\u0010\u0010`\u001a\u00020R2\u0006\u0010a\u001a\u00020\bH\u0016J\b\u0010b\u001a\u00020RH\u0016J\b\u0010c\u001a\u00020\u001dH\u0016J\b\u0010d\u001a\u00020\u001dH\u0016J\n\u0010e\u001a\u0004\u0018\u00010\bH\u0002J\n\u0010f\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010g\u001a\u00020\u0012H\u0002J\n\u0010h\u001a\u0004\u0018\u00010\bH\u0004J\u0010\u0010i\u001a\u0004\u0018\u00010j2\u0006\u0010k\u001a\u00020jJ\u0010\u0010l\u001a\u0004\u0018\u00010j2\u0006\u0010k\u001a\u00020jJ\b\u0010m\u001a\u00020RH\u0016J\u0012\u0010n\u001a\u00020\u001d2\b\u0010o\u001a\u0004\u0018\u00010pH\u0016J\u0018\u0010q\u001a\u00020R2\u0006\u0010r\u001a\u00020\u00122\u0006\u0010s\u001a\u00020\u0012H\u0016J\b\u0010t\u001a\u00020RH\u0016J\u0018\u0010u\u001a\u00020R2\u0006\u0010v\u001a\u00020\u00122\u0006\u0010w\u001a\u00020\u0012H\u0016J\u0018\u0010x\u001a\u00020R2\u0006\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u0012H\u0016J\u001c\u0010y\u001a\u00020\u001d2\b\u0010o\u001a\u0004\u0018\u00010p2\b\u0010z\u001a\u0004\u0018\u00010{H\u0016J\u0010\u0010|\u001a\u00020R2\u0006\u0010}\u001a\u00020\u0012H\u0016J\"\u0010~\u001a\u00020R2\u0006\u0010\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020\u0012H\u0016J\t\u0010\u0001\u001a\u00020RH\u0016J#\u0010\u0001\u001a\u0004\u0018\u00010\u001d2\b\u0010o\u001a\u0004\u0018\u00010p2\u0006\u0010z\u001a\u00020{H\u0016¢\u0006\u0003\u0010\u0001J\u001d\u0010\u0001\u001a\u00020\u001d2\b\u0010o\u001a\u0004\u0018\u00010p2\b\u0010z\u001a\u0004\u0018\u00010{H\u0016J\t\u0010\u0001\u001a\u00020RH\u0016J.\u0010\u0001\u001a\u00020R2%\b\u0002\u0010S\u001a\u001f\u0012\u0013\u0012\u00110\u001d¢\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(W\u0012\u0004\u0012\u00020R\u0018\u00010TJ\t\u0010\u0001\u001a\u00020RH\u0002J\t\u0010\u0001\u001a\u00020RH\u0002J#\u0010\u0001\u001a\u00020R2\u0006\u0010\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020\u0012H\u0002J\u0007\u0010\u0001\u001a\u00020RJ\t\u0010\u0001\u001a\u00020RH\u0016J\u0007\u0010\u0001\u001a\u00020RJ\t\u0010\u0001\u001a\u00020RH\u0016JR\u0010\u0001\u001a\u00020R2\u0006\u0010v\u001a\u00020\u00122\u0006\u0010w\u001a\u00020\u00122\u0006\u0010\u001a\u00020\u00122\b\b\u0002\u0010^\u001a\u00020_2%\b\u0002\u0010S\u001a\u001f\u0012\u0013\u0012\u00110\u001d¢\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(W\u0012\u0004\u0012\u00020R\u0018\u00010TH\u0002J\u0019\u0010\u0001\u001a\u00020R2\u0006\u0010v\u001a\u00020\u00122\u0006\u0010w\u001a\u00020\u0012H\u0014J\t\u0010\u0001\u001a\u00020RH\u0002J)\u0010\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010[\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001c\u0010%\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\n\"\u0004\b'\u0010\fR\u000e\u0010(\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0014\"\u0004\b3\u0010\u0016R\u000e\u00104\u001a\u000205X\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u000e¢\u0006\u0002\n\u0000R\u001a\u00108\u001a\u000209X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010?\u001a\u000209¢\u0006\b\n\u0000\u001a\u0004\b@\u0010;R\u001a\u0010A\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0014\"\u0004\bC\u0010\u0016R\u001a\u0010D\u001a\u000209X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010;\"\u0004\bF\u0010=R\u000e\u0010G\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010I\u001a\u0004\u0018\u00010JX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u0010P¨\u0006\u0001"}, d2 = {"Lcom/ss/android/photoeditor/ve/base/VEBaseController;", "Lcom/ss/android/photoeditor/ve/controller/IImageEditController;", "context", "Landroid/content/Context;", "veImage", "Lcom/ss/android/vesdk/VEImage;", "(Landroid/content/Context;Lcom/ss/android/vesdk/VEImage;)V", "activeRectF", "Landroid/graphics/RectF;", "getActiveRectF", "()Landroid/graphics/RectF;", "setActiveRectF", "(Landroid/graphics/RectF;)V", "apparentMoveDetector", "Lcom/ss/android/photoeditor/ve/utils/ApparentMoveDetector;", "getApparentMoveDetector", "()Lcom/ss/android/photoeditor/ve/utils/ApparentMoveDetector;", "bottomMargin", "", "getBottomMargin", "()F", "setBottomMargin", "(F)V", "getContext", "()Landroid/content/Context;", "defaultScale", "getDefaultScale", "setDefaultScale", "isToolbarShow", "", "()Z", "setToolbarShow", "(Z)V", "isTwoPointer", "leftMargin", "getLeftMargin", "setLeftMargin", "miniActiveRectF", "getMiniActiveRectF", "setMiniActiveRectF", "needRender", "onClickedListener", "Lcom/ss/android/photoeditor/ve/base/VEBaseController$OnSurfaceClickedListener;", "getOnClickedListener", "()Lcom/ss/android/photoeditor/ve/base/VEBaseController$OnSurfaceClickedListener;", "setOnClickedListener", "(Lcom/ss/android/photoeditor/ve/base/VEBaseController$OnSurfaceClickedListener;)V", "preX", "preY", "rightMargin", "getRightMargin", "setRightMargin", "rotateGestureDetector", "Lcom/ss/android/photoeditor/ve/gecture/RotateGestureDetector;", "scaleGestureDetector", "Landroid/view/ScaleGestureDetector;", "screenHeight", "", "getScreenHeight", "()I", "setScreenHeight", "(I)V", "screenRatio", "screenWidth", "getScreenWidth", "topMargin", "getTopMargin", "setTopMargin", "touchMode", "getTouchMode", "setTouchMode", "twoPointX", "twoPointY", "valueAnimator", "Landroid/animation/ValueAnimator;", "getValueAnimator", "()Landroid/animation/ValueAnimator;", "setValueAnimator", "(Landroid/animation/ValueAnimator;)V", "getVeImage", "()Lcom/ss/android/vesdk/VEImage;", "adaptScreen", "", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "success", "adjustScreenWithAnimate", "top", "bottom", "left", "right", "reset", "duration", "", "cutVEImage", "rectF", "doRenderVEImage", "enableTwoPointMove", "functionEnable", "getLeftDownOriginVEImageRect", "getMarginRectF", "getRealLayerHeight", "getRealVEImageRect", "mappingPointToVEImage", "Landroid/graphics/PointF;", "point", "mappingVEImagePointToScreenForSticker", "onCancelBtnClick", "onClick", "v", "Landroid/view/View;", "onClickAtPosition", "rawX", "rawY", "onConfirmBtnClick", "onMove", "dx", "dy", "onMoveEnd", "onOnePointerTouch", "event", "Landroid/view/MotionEvent;", "onRotate", "rotationDegreesDelta", "onScale", "scale", "anchorX", "anchorY", "onTouchEnd", "onTouchEvent", "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;", "onTwoPointerTouch", "resetAnimateEnd", "resetScreenWithAnimate", "resetTwoPointXY", "resetXY", "scaleVEImage", "toolbarBeginHide", "toolbarHide", "toolbarShow", "toolbarShown", "translateScaleWithAnimate", "translateVEImage", "updateActiveRectF", "veStickerPosToSurfaceSizeF", "Companion", "OnSurfaceClickedListener", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.base.a */
public abstract class VEBaseController implements IImageEditController {

    /* renamed from: a */
    public static final Companion f148779a = new Companion(null);

    /* renamed from: b */
    private float f148780b;

    /* renamed from: c */
    private float f148781c;

    /* renamed from: d */
    private float f148782d;

    /* renamed from: e */
    private float f148783e;

    /* renamed from: f */
    private float f148784f = -1.0f;

    /* renamed from: g */
    private float f148785g = -1.0f;

    /* renamed from: h */
    private float f148786h = 1.0f;

    /* renamed from: i */
    private final int f148787i;

    /* renamed from: j */
    private int f148788j;

    /* renamed from: k */
    private final float f148789k;

    /* renamed from: l */
    private int f148790l;

    /* renamed from: m */
    private float f148791m;

    /* renamed from: n */
    private float f148792n;

    /* renamed from: o */
    private RectF f148793o;

    /* renamed from: p */
    private RectF f148794p;

    /* renamed from: q */
    private ValueAnimator f148795q;

    /* renamed from: r */
    private boolean f148796r;

    /* renamed from: s */
    private final ApparentMoveDetector f148797s;

    /* renamed from: t */
    private ScaleGestureDetector f148798t;

    /* renamed from: u */
    private C59831b f148799u;

    /* renamed from: v */
    private OnSurfaceClickedListener f148800v;

    /* renamed from: w */
    private final Context f148801w;

    /* renamed from: x */
    private final VEImage f148802x;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/photoeditor/ve/base/VEBaseController$OnSurfaceClickedListener;", "", "onClick", "", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.a$b */
    public interface OnSurfaceClickedListener {
        /* renamed from: a */
        void mo203632a();
    }

    /* renamed from: a */
    public void mo203675a(float f) {
    }

    /* renamed from: a */
    public void mo203676a(float f, float f2) {
    }

    @Override // com.ss.android.photoeditor.ve.controller.IImageEditController
    /* renamed from: a */
    public boolean mo203586a(View view) {
        return false;
    }

    /* renamed from: d */
    public void mo203590d(float f, float f2) {
    }

    /* renamed from: h */
    public void mo203697h() {
    }

    /* renamed from: i */
    public boolean mo203698i() {
        return false;
    }

    /* renamed from: l */
    public void mo203701l() {
    }

    /* renamed from: m */
    public void mo203702m() {
    }

    /* renamed from: n */
    public RectF mo203703n() {
        return null;
    }

    /* renamed from: p */
    public void mo203705p() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/photoeditor/ve/base/VEBaseController$Companion;", "", "()V", "ANIMATE_DURATION", "", "MAX_SCALE", "", "NO_POINTER_MODE", "", "ONE_POINTER_MODE", "TAG", "", "TWO_POINTER_MODE", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo203672a() {
        return this.f148787i;
    }

    /* renamed from: b */
    public final RectF mo203686b() {
        return this.f148794p;
    }

    /* renamed from: c */
    public final OnSurfaceClickedListener mo203689c() {
        return this.f148800v;
    }

    /* renamed from: q */
    public final Context mo203706q() {
        return this.f148801w;
    }

    /* renamed from: r */
    public final VEImage mo203707r() {
        return this.f148802x;
    }

    /* renamed from: a */
    public final void mo203681a(RectF rectF) {
        this.f148793o = rectF;
    }

    /* renamed from: a */
    public final void mo203680a(ValueAnimator valueAnimator) {
        this.f148795q = valueAnimator;
    }

    /* renamed from: a */
    public final void mo203682a(OnSurfaceClickedListener bVar) {
        this.f148800v = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r0 != 3) goto L_0x005f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo203684a(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            r4 = 0
            if (r5 == 0) goto L_0x005f
            com.ss.android.photoeditor.ve.e.b r0 = r3.f148797s
            r0.mo203979a(r5)
            int r0 = r5.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x0053
            r1 = 1
            if (r0 == r1) goto L_0x0038
            r2 = 2
            if (r0 == r2) goto L_0x001a
            r5 = 3
            if (r0 == r5) goto L_0x0038
            goto L_0x005f
        L_0x001a:
            float r4 = r5.getRawX()
            float r0 = r3.f148784f
            float r4 = r4 - r0
            float r0 = r5.getRawY()
            float r2 = r3.f148785g
            float r0 = r0 - r2
            float r2 = r5.getRawX()
            r3.f148784f = r2
            float r5 = r5.getRawY()
            r3.f148785g = r5
            r3.mo203589b(r4, r0)
            return r1
        L_0x0038:
            com.ss.android.photoeditor.ve.e.b r5 = r3.f148797s
            boolean r5 = r5.mo203980a()
            if (r5 != 0) goto L_0x0048
            float r5 = r3.f148784f
            float r0 = r3.f148785g
            r3.mo203590d(r5, r0)
            goto L_0x004f
        L_0x0048:
            float r5 = r3.f148784f
            float r0 = r3.f148785g
            r3.mo203676a(r5, r0)
        L_0x004f:
            r3.mo203731u()
            goto L_0x005f
        L_0x0053:
            float r0 = r5.getRawX()
            r3.f148784f = r0
            float r5 = r5.getRawY()
            r3.f148785g = r5
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.photoeditor.ve.base.VEBaseController.mo203684a(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void mo203683a(Function1<? super Boolean, Unit> function1) {
        m232112a(this, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, true, 0, function1, 32, null);
    }

    /* renamed from: u */
    private final void mo203731u() {
        this.f148784f = -1.0f;
        this.f148785g = -1.0f;
    }

    /* renamed from: v */
    private final void mo203732v() {
        this.f148791m = -1.0f;
        this.f148792n = -1.0f;
    }

    /* renamed from: t */
    private final float mo203592t() {
        return (this.f148802x.mo220791c() - this.f148780b) - this.f148781c;
    }

    /* renamed from: d */
    public boolean mo203693d() {
        ValueAnimator valueAnimator = this.f148795q;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo203694e() {
        VEImage.m250737a(this.f148802x, (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
    }

    /* renamed from: k */
    public final void mo203700k() {
        this.f148796r = false;
        mo203683a(new C59844h(this));
    }

    /* renamed from: o */
    public void mo203704o() {
        this.f148802x.mo220799g();
        this.f148802x.mo220800h();
    }

    /* renamed from: s */
    private final void mo203591s() {
        RectF rectF;
        RectF f = mo203695f();
        if (f != null) {
            if (f.width() <= ((float) this.f148787i) || f.height() <= mo203592t()) {
                rectF = this.f148794p;
            } else {
                rectF = new RectF(BitmapDescriptorFactory.HUE_RED, this.f148780b, (float) this.f148787i, mo203592t());
            }
            this.f148793o = rectF;
        }
    }

    /* renamed from: w */
    private final RectF mo203993w() {
        C63956a.C63957a aVar;
        C63956a a = VEImage.m250735a(this.f148802x, false, false, 3, (Object) null);
        if (a == null || (aVar = a.f161503e) == null) {
            return null;
        }
        RectF rectF = new RectF();
        float f = (float) 2;
        rectF.left = aVar.f161509a - (a.f161505g / f);
        rectF.top = aVar.f161510b + (a.f161506h / f);
        rectF.right = aVar.f161509a + (a.f161505g / f);
        rectF.bottom = aVar.f161510b - (a.f161506h / f);
        return rectF;
    }

    /* renamed from: j */
    public final void mo203699j() {
        this.f148796r = true;
        RectF n = mo203703n();
        if (n == null) {
            n = new RectF();
        }
        float a = C60275a.m234185a(this.f148801w, n.top);
        float a2 = C60275a.m234185a(this.f148801w, n.bottom);
        float a3 = C60275a.m234185a(this.f148801w, n.left);
        m232112a(this, a, a2, a3, a3, false, 0, new C59845i(this), 32, null);
    }

    /* renamed from: f */
    public final RectF mo203695f() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        C63956a a = VEImage.m250735a(this.f148802x, false, false, 3, (Object) null);
        if (a == null) {
            return null;
        }
        C63956a.C63957a aVar = a.f161499a;
        float f16 = BitmapDescriptorFactory.HUE_RED;
        if (aVar != null) {
            f = aVar.f161509a;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        C63956a.C63957a aVar2 = a.f161500b;
        if (aVar2 != null) {
            f2 = aVar2.f161509a;
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        float min = Math.min(f, f2);
        C63956a.C63957a aVar3 = a.f161502d;
        if (aVar3 != null) {
            f3 = aVar3.f161509a;
        } else {
            f3 = BitmapDescriptorFactory.HUE_RED;
        }
        C63956a.C63957a aVar4 = a.f161501c;
        if (aVar4 != null) {
            f4 = aVar4.f161509a;
        } else {
            f4 = BitmapDescriptorFactory.HUE_RED;
        }
        float min2 = Math.min(min, Math.min(f3, f4));
        C63956a.C63957a aVar5 = a.f161499a;
        if (aVar5 != null) {
            f5 = aVar5.f161509a;
        } else {
            f5 = BitmapDescriptorFactory.HUE_RED;
        }
        C63956a.C63957a aVar6 = a.f161500b;
        if (aVar6 != null) {
            f6 = aVar6.f161509a;
        } else {
            f6 = BitmapDescriptorFactory.HUE_RED;
        }
        float max = Math.max(f5, f6);
        C63956a.C63957a aVar7 = a.f161502d;
        if (aVar7 != null) {
            f7 = aVar7.f161509a;
        } else {
            f7 = BitmapDescriptorFactory.HUE_RED;
        }
        C63956a.C63957a aVar8 = a.f161501c;
        if (aVar8 != null) {
            f8 = aVar8.f161509a;
        } else {
            f8 = BitmapDescriptorFactory.HUE_RED;
        }
        float max2 = Math.max(max, Math.max(f7, f8));
        float f17 = (float) this.f148788j;
        C63956a.C63957a aVar9 = a.f161499a;
        if (aVar9 != null) {
            f9 = aVar9.f161510b;
        } else {
            f9 = BitmapDescriptorFactory.HUE_RED;
        }
        C63956a.C63957a aVar10 = a.f161500b;
        if (aVar10 != null) {
            f10 = aVar10.f161510b;
        } else {
            f10 = BitmapDescriptorFactory.HUE_RED;
        }
        float max3 = Math.max(f9, f10);
        C63956a.C63957a aVar11 = a.f161502d;
        if (aVar11 != null) {
            f11 = aVar11.f161510b;
        } else {
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        C63956a.C63957a aVar12 = a.f161501c;
        if (aVar12 != null) {
            f12 = aVar12.f161510b;
        } else {
            f12 = BitmapDescriptorFactory.HUE_RED;
        }
        float max4 = f17 - Math.max(max3, Math.max(f11, f12));
        float f18 = (float) this.f148788j;
        C63956a.C63957a aVar13 = a.f161499a;
        if (aVar13 != null) {
            f13 = aVar13.f161510b;
        } else {
            f13 = BitmapDescriptorFactory.HUE_RED;
        }
        C63956a.C63957a aVar14 = a.f161500b;
        if (aVar14 != null) {
            f14 = aVar14.f161510b;
        } else {
            f14 = BitmapDescriptorFactory.HUE_RED;
        }
        float min3 = Math.min(f13, f14);
        C63956a.C63957a aVar15 = a.f161502d;
        if (aVar15 != null) {
            f15 = aVar15.f161510b;
        } else {
            f15 = BitmapDescriptorFactory.HUE_RED;
        }
        C63956a.C63957a aVar16 = a.f161501c;
        if (aVar16 != null) {
            f16 = aVar16.f161510b;
        }
        return new RectF(min2, max4, max2, f18 - Math.min(min3, Math.min(f15, f16)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo203696g() {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.photoeditor.ve.base.VEBaseController.mo203696g():void");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/photoeditor/ve/base/VEBaseController$onTouchEnd$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.a$d */
    public static final class C59840d extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ VEBaseController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59840d(VEBaseController aVar) {
            super(1);
            this.this$0 = aVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo203697h();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/photoeditor/ve/base/VEBaseController$onTouchEnd$1$2$1", "com/ss/android/photoeditor/ve/base/VEBaseController$$special$$inlined$let$lambda$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.a$e */
    public static final class C59841e extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ RectF $rect$inlined;
        final /* synthetic */ VEBaseController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59841e(RectF rectF, VEBaseController aVar) {
            super(1);
            this.$rect$inlined = rectF;
            this.this$0 = aVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo203697h();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/photoeditor/ve/base/VEBaseController$rotateGestureDetector$1", "Lcom/ss/android/photoeditor/ve/gecture/RotateGestureDetector$OnRotateGestureListener;", "onRotate", "", "detector", "Lcom/ss/android/photoeditor/ve/gecture/RotateGestureDetector;", "onRotateBegin", "onRotateEnd", "", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.a$f */
    public static final class C59842f implements C59831b.AbstractC59832a {

        /* renamed from: a */
        final /* synthetic */ VEBaseController f148803a;

        @Override // com.ss.android.photoeditor.ve.p3013b.C59831b.AbstractC59832a
        /* renamed from: b */
        public void mo203645b(C59831b bVar) {
        }

        @Override // com.ss.android.photoeditor.ve.p3013b.C59831b.AbstractC59832a
        /* renamed from: c */
        public boolean mo203646c(C59831b bVar) {
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59842f(VEBaseController aVar) {
            this.f148803a = aVar;
        }

        @Override // com.ss.android.photoeditor.ve.p3013b.C59831b.AbstractC59832a
        /* renamed from: a */
        public boolean mo203644a(C59831b bVar) {
            float f;
            VEBaseController aVar = this.f148803a;
            if (bVar != null) {
                f = bVar.mo203643b();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            aVar.mo203675a(f);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/photoeditor/ve/base/VEBaseController$scaleGestureDetector$1", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "onScale", "", "detector", "Landroid/view/ScaleGestureDetector;", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.a$g */
    public static final class C59843g extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* renamed from: a */
        final /* synthetic */ VEBaseController f148804a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59843g(VEBaseController aVar) {
            this.f148804a = aVar;
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (scaleGestureDetector != null) {
                this.f148804a.mo203677a(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.a$h */
    public static final class C59844h extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ VEBaseController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59844h(VEBaseController aVar) {
            super(1);
            this.this$0 = aVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo203702m();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.a$i */
    public static final class C59845i extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ VEBaseController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59845i(VEBaseController aVar) {
            super(1);
            this.this$0 = aVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo203701l();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.a$c */
    public static final class C59839c extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ Function1 $callback;
        final /* synthetic */ boolean $reset;
        final /* synthetic */ VEBaseController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59839c(VEBaseController aVar, boolean z, Function1 function1) {
            super(1);
            this.this$0 = aVar;
            this.$reset = z;
            this.$callback = function1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (!this.$reset) {
                VEBaseController aVar = this.this$0;
                aVar.mo203687b(aVar.mo203695f());
                VEBaseController aVar2 = this.this$0;
                aVar2.mo203681a(aVar2.mo203686b());
            } else {
                RectF rectF = null;
                this.this$0.mo203681a(rectF);
                this.this$0.mo203687b(rectF);
            }
            Function1 function1 = this.$callback;
            if (function1 != null) {
                Unit unit = (Unit) function1.invoke(true);
            }
        }
    }

    /* renamed from: b */
    public final void mo203687b(RectF rectF) {
        this.f148794p = rectF;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/photoeditor/ve/base/VEBaseController$translateScaleWithAnimate$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.a$k */
    public static final class C59847k extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VEBaseController f148814a;

        /* renamed from: b */
        final /* synthetic */ float f148815b;

        /* renamed from: c */
        final /* synthetic */ float f148816c;

        /* renamed from: d */
        final /* synthetic */ Ref.FloatRef f148817d;

        /* renamed from: e */
        final /* synthetic */ Ref.FloatRef f148818e;

        /* renamed from: f */
        final /* synthetic */ float f148819f;

        /* renamed from: g */
        final /* synthetic */ Ref.FloatRef f148820g;

        /* renamed from: h */
        final /* synthetic */ Function1 f148821h;

        /* renamed from: i */
        final /* synthetic */ long f148822i;

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Function1 function1 = this.f148821h;
            if (function1 != null) {
                Unit unit = (Unit) function1.invoke(true);
            }
            this.f148814a.mo203680a((ValueAnimator) null);
        }

        C59847k(VEBaseController aVar, float f, float f2, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f3, Ref.FloatRef floatRef3, Function1 function1, long j) {
            this.f148814a = aVar;
            this.f148815b = f;
            this.f148816c = f2;
            this.f148817d = floatRef;
            this.f148818e = floatRef2;
            this.f148819f = f3;
            this.f148820g = floatRef3;
            this.f148821h = function1;
            this.f148822i = j;
        }
    }

    /* renamed from: c */
    public void mo203691c(RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "rectF");
        this.f148802x.mo220779a("scissor", rectF.left, rectF.right, rectF.top, rectF.bottom);
    }

    /* renamed from: b */
    public final PointF mo203685b(PointF pointF) {
        Intrinsics.checkParameterIsNotNull(pointF, "point");
        pointF.y = ((float) this.f148788j) - pointF.y;
        RectF w = mo203993w();
        if (w != null) {
            return new PointF((pointF.x - w.left) / Math.abs(w.width()), (pointF.y - w.bottom) / Math.abs(w.height()));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/photoeditor/ve/base/VEBaseController$translateScaleWithAnimate$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.a$j */
    public static final class C59846j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ VEBaseController f148805a;

        /* renamed from: b */
        final /* synthetic */ float f148806b;

        /* renamed from: c */
        final /* synthetic */ float f148807c;

        /* renamed from: d */
        final /* synthetic */ Ref.FloatRef f148808d;

        /* renamed from: e */
        final /* synthetic */ Ref.FloatRef f148809e;

        /* renamed from: f */
        final /* synthetic */ float f148810f;

        /* renamed from: g */
        final /* synthetic */ Ref.FloatRef f148811g;

        /* renamed from: h */
        final /* synthetic */ Function1 f148812h;

        /* renamed from: i */
        final /* synthetic */ long f148813i;

        C59846j(VEBaseController aVar, float f, float f2, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f3, Ref.FloatRef floatRef3, Function1 function1, long j) {
            this.f148805a = aVar;
            this.f148806b = f;
            this.f148807c = f2;
            this.f148808d = floatRef;
            this.f148809e = floatRef2;
            this.f148810f = f3;
            this.f148811g = floatRef3;
            this.f148812h = function1;
            this.f148813i = j;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            C63956a.C63957a aVar;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                float f2 = this.f148806b;
                if (!(f2 == BitmapDescriptorFactory.HUE_RED && this.f148807c == BitmapDescriptorFactory.HUE_RED)) {
                    float f3 = this.f148807c * floatValue;
                    float f4 = f2 * floatValue;
                    this.f148805a.mo203707r().mo220777a("translate", f3 - this.f148808d.element, f4 - this.f148809e.element);
                    this.f148808d.element = f3;
                    this.f148809e.element = f4;
                }
                float f5 = this.f148810f;
                if (f5 != 1.0f) {
                    float f6 = (float) 1;
                    float f7 = (((f5 - f6) * floatValue) + f6) / this.f148811g.element;
                    RectF f8 = this.f148805a.mo203695f();
                    if (f8 != null) {
                        C63956a a = VEImage.m250735a(this.f148805a.mo203707r(), false, false, 3, (Object) null);
                        if (a == null || (aVar = a.f161503e) == null) {
                            f = BitmapDescriptorFactory.HUE_RED;
                        } else {
                            f = aVar.f161510b;
                        }
                        this.f148805a.mo203707r().mo220790b("scale", f7, f7, f8.centerX(), f);
                    }
                    this.f148811g.element = (floatValue * (this.f148810f - f6)) + f6;
                }
                VEImage.m250737a(this.f148805a.mo203707r(), (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: a */
    public final PointF mo203673a(PointF pointF) {
        Intrinsics.checkParameterIsNotNull(pointF, "point");
        RectF f = mo203695f();
        if (f != null) {
            return new PointF(f.left + (f.width() * pointF.x), f.top + (f.height() * pointF.y));
        }
        return null;
    }

    /* renamed from: b */
    public final void mo203688b(Function1<? super Boolean, Unit> function1) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        C63956a.C63957a aVar;
        C63956a.C63957a aVar2;
        float c = this.f148802x.mo220791c();
        float b = this.f148802x.mo220785b();
        C63956a a = VEImage.m250735a(this.f148802x, false, false, 3, (Object) null);
        if (a == null || (aVar2 = a.f161503e) == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = aVar2.f161510b;
        }
        float f7 = (float) 2;
        float f8 = c / f7;
        float f9 = b / f7;
        RectF f10 = mo203695f();
        if (f10 != null) {
            f2 = f10.centerX();
        } else {
            f2 = f9;
        }
        float f11 = f9 - f2;
        float f12 = b / c;
        C63956a a2 = VEImage.m250735a(this.f148802x, false, false, 3, (Object) null);
        if (a2 != null) {
            f3 = a2.f161506h;
        } else {
            f3 = BitmapDescriptorFactory.HUE_RED;
        }
        C63956a a3 = VEImage.m250735a(this.f148802x, false, false, 3, (Object) null);
        if (a3 != null) {
            f4 = a3.f161505g;
        } else {
            f4 = BitmapDescriptorFactory.HUE_RED;
        }
        if (f4 != BitmapDescriptorFactory.HUE_RED && f3 != BitmapDescriptorFactory.HUE_RED) {
            if (f12 <= f4 / f3) {
                f5 = b / f4;
            } else {
                f5 = c / f3;
            }
            float f13 = f8 - f;
            if (!(f13 == BitmapDescriptorFactory.HUE_RED && f11 == BitmapDescriptorFactory.HUE_RED)) {
                this.f148802x.mo220777a("translate", f11, f13);
            }
            RectF f14 = mo203695f();
            if (f14 != null) {
                C63956a a4 = VEImage.m250735a(this.f148802x, false, false, 3, (Object) null);
                if (a4 == null || (aVar = a4.f161503e) == null) {
                    f6 = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f6 = aVar.f161510b;
                }
                this.f148802x.mo220790b("scale", f5, f5, f14.centerX(), f6);
            }
            VEImage.m250737a(this.f148802x, (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
            this.f148780b = BitmapDescriptorFactory.HUE_RED;
            this.f148781c = BitmapDescriptorFactory.HUE_RED;
            this.f148782d = BitmapDescriptorFactory.HUE_RED;
            this.f148783e = BitmapDescriptorFactory.HUE_RED;
            if (function1 != null) {
                function1.invoke(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo203679a(int i) {
        this.f148788j = i;
    }

    /* renamed from: b */
    public void mo203589b(float f, float f2) {
        mo203690c(f, f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo203690c(float f, float f2) {
        if (mo203695f() != null) {
            this.f148802x.mo220777a("translate", f, -f2);
            mo203694e();
        }
    }

    public VEBaseController(Context context, VEImage vEImage) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(vEImage, "veImage");
        this.f148801w = context;
        this.f148802x = vEImage;
        int a = C60275a.m234186a(context);
        this.f148787i = a;
        int b = C60275a.m234187b(context);
        this.f148788j = b;
        this.f148789k = ((float) b) / ((float) a);
        this.f148791m = -1.0f;
        this.f148792n = -1.0f;
        this.f148797s = new ApparentMoveDetector(context);
        this.f148798t = new ScaleGestureDetector(context, new C59843g(this));
        this.f148799u = new C59831b(context, new C59842f(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r0 != 3) goto L_0x0070;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo203692c(android.view.View r4, android.view.MotionEvent r5) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.photoeditor.ve.base.VEBaseController.mo203692c(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.ss.android.photoeditor.ve.controller.IImageEditController
    /* renamed from: b */
    public Boolean mo203587b(View view, MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int i = this.f148790l;
                    if (i == 1) {
                        return Boolean.valueOf(mo203684a(view, motionEvent));
                    }
                    if (i == 2) {
                        return Boolean.valueOf(mo203692c(view, motionEvent));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        this.f148790l = 2;
                        mo203692c(view, motionEvent);
                    } else if (action == 6) {
                        mo203692c(view, motionEvent);
                    }
                }
            }
            int i2 = this.f148790l;
            if (i2 == 1) {
                mo203684a(view, motionEvent);
            } else if (i2 == 2) {
                mo203692c(view, motionEvent);
            }
            mo203696g();
            this.f148790l = 0;
        } else {
            this.f148790l = 1;
            mo203684a(view, motionEvent);
            mo203692c(view, motionEvent);
        }
        return false;
    }

    /* renamed from: a */
    public void mo203677a(float f, float f2, float f3) {
        m232114b(f, f2, f3);
    }

    /* renamed from: b */
    private final void m232114b(float f, float f2, float f3) {
        C63956a.C63957a aVar;
        float f4;
        C63956a a = VEImage.m250735a(this.f148802x, false, false, 3, (Object) null);
        if (a != null && (aVar = a.f161504f) != null) {
            float f5 = aVar.f161509a;
            if (f <= ((float) 1) || f5 < 5.0f) {
                f4 = f;
            } else {
                f4 = 1.0f;
            }
            this.f148802x.mo220790b("scale", f4, f4, f2, this.f148802x.mo220791c() - f3);
            VEImage.m250737a(this.f148802x, (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
            mo203591s();
        }
    }

    /* renamed from: a */
    public final RectF mo203674a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        RectF f7 = mo203695f();
        if (f7 != null) {
            f5 = f7.width();
        } else {
            f5 = this.f148802x.mo220785b();
        }
        RectF f8 = mo203695f();
        if (f8 != null) {
            f6 = f8.height();
        } else {
            f6 = this.f148802x.mo220791c();
        }
        return new RectF(f * f5, f2 * f6, f3 * f5, f4 * f6);
    }

    /* renamed from: a */
    private final void m232111a(float f, float f2, float f3, long j, Function1<? super Boolean, Unit> function1) {
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = BitmapDescriptorFactory.HUE_RED;
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        floatRef2.element = BitmapDescriptorFactory.HUE_RED;
        Ref.FloatRef floatRef3 = new Ref.FloatRef();
        floatRef3.element = 1.0f;
        ValueAnimator valueAnimator = this.f148795q;
        if (!(valueAnimator == null || valueAnimator == null)) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.addUpdateListener(new C59846j(this, f2, f, floatRef, floatRef2, f3, floatRef3, function1, j));
        ofFloat.addListener(new C59847k(this, f2, f, floatRef, floatRef2, f3, floatRef3, function1, j));
        ofFloat.setInterpolator(new animationInterpolatorC59853c(4.0f));
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "this");
        ofFloat.setDuration(j);
        ofFloat.start();
        this.f148795q = ofFloat;
    }

    /* renamed from: a */
    public final void mo203678a(float f, float f2, float f3, float f4, boolean z, long j, Function1<? super Boolean, Unit> function1) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        C63956a.C63957a aVar;
        float c = this.f148802x.mo220791c();
        float b = this.f148802x.mo220785b();
        C63956a a = VEImage.m250735a(this.f148802x, false, false, 3, (Object) null);
        if (a == null || (aVar = a.f161503e) == null) {
            f5 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f5 = aVar.f161510b;
        }
        float f11 = (c - f) - f2;
        float f12 = (float) 2;
        float f13 = (f11 / f12) + f2;
        float f14 = b / f12;
        RectF f15 = mo203695f();
        if (f15 != null) {
            f6 = f15.centerX();
        } else {
            f6 = f14;
        }
        float f16 = f14 - f6;
        float f17 = (b - f3) - f4;
        float f18 = f17 / f11;
        C63956a a2 = VEImage.m250735a(this.f148802x, false, false, 3, (Object) null);
        if (a2 != null) {
            f7 = a2.f161506h;
        } else {
            f7 = BitmapDescriptorFactory.HUE_RED;
        }
        C63956a a3 = VEImage.m250735a(this.f148802x, false, false, 3, (Object) null);
        if (a3 != null) {
            f8 = a3.f161505g;
        } else {
            f8 = BitmapDescriptorFactory.HUE_RED;
        }
        if (f8 != BitmapDescriptorFactory.HUE_RED && f7 != BitmapDescriptorFactory.HUE_RED) {
            if (f18 <= f8 / f7) {
                f9 = f17 / f8;
            } else {
                if (z) {
                    f10 = f11 / f7;
                } else {
                    f10 = Math.min(f11 / f7, 1.0f);
                }
                f9 = f10;
            }
            m232111a(f16, f13 - f5, f9, j, new C59839c(this, z, function1));
            if (!z) {
                this.f148780b = f;
                this.f148781c = f2;
                this.f148782d = f3;
                this.f148783e = f4;
                return;
            }
            this.f148780b = BitmapDescriptorFactory.HUE_RED;
            this.f148781c = BitmapDescriptorFactory.HUE_RED;
            this.f148782d = BitmapDescriptorFactory.HUE_RED;
            this.f148783e = BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.ss.android.photoeditor.ve.base.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ void m232113a(VEBaseController aVar, float f, float f2, float f3, long j, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                j = 300;
            }
            if ((i & 16) != 0) {
                function1 = null;
            }
            aVar.m232111a(f, f2, f3, j, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translateScaleWithAnimate");
    }

    /* renamed from: a */
    public static /* synthetic */ void m232112a(VEBaseController aVar, float f, float f2, float f3, float f4, boolean z, long j, Function1 function1, int i, Object obj) {
        long j2;
        Function1 function12;
        if (obj == null) {
            if ((i & 32) != 0) {
                j2 = 300;
            } else {
                j2 = j;
            }
            if ((i & 64) != 0) {
                function12 = null;
            } else {
                function12 = function1;
            }
            aVar.mo203678a(f, f2, f3, f4, z, j2, function12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: adjustScreenWithAnimate");
    }
}
