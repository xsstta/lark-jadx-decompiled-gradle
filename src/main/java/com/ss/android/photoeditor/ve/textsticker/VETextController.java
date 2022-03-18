package com.ss.android.photoeditor.ve.textsticker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.ve.base.VEBaseController;
import com.ss.android.photoeditor.ve.controller.IImageEditController;
import com.ss.android.photoeditor.ve.crop.p3015a.animationInterpolatorC59853c;
import com.ss.android.photoeditor.ve.hitpoint.ImageEditorHitPoint;
import com.ss.android.photoeditor.ve.p3018e.C59898c;
import com.ss.android.photoeditor.ve.p3018e.C59902f;
import com.ss.android.photoeditor.ve.p3018e.C59905h;
import com.ss.android.photoeditor.ve.p3018e.C59908j;
import com.ss.android.photoeditor.ve.p3018e.C59909l;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.ttve.utils.C60275a;
import com.ss.android.vesdk.VEImage;
import com.ss.android.vesdk.bean.C63956a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 t2\u00020\u00012\u00020\u0002:\u0002tuB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u0010H\u0002J\b\u0010C\u001a\u00020@H\u0002J\b\u0010D\u001a\u00020@H\u0002J\b\u0010E\u001a\u00020@H\u0002J\b\u0010F\u001a\u00020@H\u0002J\b\u0010G\u001a\u00020@H\u0002J\u0006\u0010H\u001a\u00020\nJ\u0006\u0010I\u001a\u000201J\u001a\u0010J\u001a\u0004\u0018\u00010\u000b2\u0006\u0010K\u001a\u0002012\u0006\u0010L\u001a\u000201H\u0016J\u0006\u0010M\u001a\u00020@J\b\u0010N\u001a\u00020\u000bH\u0002J\u0006\u0010O\u001a\u00020\u0010J\u0012\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020SH\u0002J\u0016\u0010T\u001a\u00020@2\u0006\u0010U\u001a\u0002012\u0006\u0010V\u001a\u000201J\u0018\u0010W\u001a\u00020@2\u0006\u0010X\u001a\u0002012\u0006\u0010Y\u001a\u000201H\u0016J\u0018\u0010Z\u001a\u00020@2\u0006\u0010U\u001a\u0002012\u0006\u0010V\u001a\u000201H\u0016J\u0018\u0010[\u001a\u00020@2\u0006\u0010\\\u001a\u0002012\u0006\u0010]\u001a\u000201H\u0016J\u0010\u0010^\u001a\u00020@2\u0006\u0010_\u001a\u000201H\u0016J \u0010`\u001a\u00020@2\u0006\u0010a\u001a\u0002012\u0006\u0010b\u001a\u0002012\u0006\u0010c\u001a\u000201H\u0016J\u0006\u0010d\u001a\u00020@J\b\u0010e\u001a\u00020@H\u0016J\b\u0010f\u001a\u00020\u0010H\u0002J\u0018\u0010g\u001a\u00020@2\u0006\u0010a\u001a\u0002012\u0006\u0010h\u001a\u000201H\u0002J\b\u0010i\u001a\u00020@H\u0002J\u0006\u0010j\u001a\u00020@J\b\u0010k\u001a\u00020@H\u0002J\u0006\u0010l\u001a\u00020@J\b\u0010m\u001a\u00020@H\u0002J)\u0010n\u001a\u00020@2\b\u0010o\u001a\u0004\u0018\u00010p2\b\u0010q\u001a\u0004\u0018\u00010\n2\b\u0010r\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010sR0\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201XD¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000201XD¢\u0006\u0002\n\u0000R\u001c\u00103\u001a\u0004\u0018\u000104X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010:X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006v"}, d2 = {"Lcom/ss/android/photoeditor/ve/textsticker/VETextController;", "Lcom/ss/android/photoeditor/ve/base/VEBaseController;", "Lcom/ss/android/photoeditor/ve/controller/IImageEditController;", "context", "Landroid/content/Context;", "veImage", "Lcom/ss/android/vesdk/VEImage;", "(Landroid/content/Context;Lcom/ss/android/vesdk/VEImage;)V", "addedStickerList", "Ljava/util/LinkedHashMap;", "", "Lcom/ss/android/photoeditor/ve/textsticker/TextStickerItem;", "Lkotlin/collections/LinkedHashMap;", "getAddedStickerList", "()Ljava/util/LinkedHashMap;", "autoDismiss", "", "autoDismissTime", "", "changePositionAnimator", "Landroid/animation/ValueAnimator;", "getChangePositionAnimator", "()Landroid/animation/ValueAnimator;", "setChangePositionAnimator", "(Landroid/animation/ValueAnimator;)V", "deleteCoverView", "Landroid/view/View;", "getDeleteCoverView", "()Landroid/view/View;", "setDeleteCoverView", "(Landroid/view/View;)V", "deleteTextStickerView", "Lcom/ss/android/photoeditor/ve/textsticker/DeleteTextStickerView;", "getDeleteTextStickerView", "()Lcom/ss/android/photoeditor/ve/textsticker/DeleteTextStickerView;", "setDeleteTextStickerView", "(Lcom/ss/android/photoeditor/ve/textsticker/DeleteTextStickerView;)V", "editText", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "setEditText", "(Landroid/widget/EditText;)V", "hideDeleteView", "hitSticker", "isStickerClicked", "lastSelectDeleteStickerIndex", "lastSelectUnDeleteStickerIndex", "maxScale", "", "minScale", "stickerChangeListener", "Lcom/ss/android/photoeditor/ve/textsticker/VETextController$OnStickerChangeListener;", "getStickerChangeListener", "()Lcom/ss/android/photoeditor/ve/textsticker/VETextController$OnStickerChangeListener;", "setStickerChangeListener", "(Lcom/ss/android/photoeditor/ve/textsticker/VETextController$OnStickerChangeListener;)V", "textBorderView", "Lcom/ss/android/photoeditor/ve/textsticker/TextBorderView;", "getTextBorderView", "()Lcom/ss/android/photoeditor/ve/textsticker/TextBorderView;", "setTextBorderView", "(Lcom/ss/android/photoeditor/ve/textsticker/TextBorderView;)V", "addTextSticker", "", "textStickerItem", "isUpdate", "autoDismissTextBorder", "bringStickerToFront", "cancelAutoDismiss", "changePositionToOrigin", "deleteSticker", "generateLayerIndex", "getMiniStickerSize", "getTouchedSticker", "x", "y", "hideTextBorder", "instanceEmptyTextSticker", "isStickerSelected", "mappingStickerBoundToScreenRect", "Landroid/graphics/RectF;", "boundBox", "", "moveSticker", "dx", "dy", "onClickAtPosition", "rawX", "rawY", "onMove", "onMoveEnd", "preX", "preY", "onRotate", "rotationDegreesDelta", "onScale", "scale", "anchorX", "anchorY", "onStickerClicked", "onTouchEnd", "positionIsInvalid", "scaleAndRotateSticker", "rotation", "showDeleteStickerView", "showTextBorder", "syncAndShowBorder", "syncStickerItem", "updateOriginPosition", "updateTextSticker", "content", "", "textColor", "bgColor", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Companion", "OnStickerChangeListener", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.textsticker.b */
public final class VETextController extends VEBaseController implements IImageEditController {

    /* renamed from: h */
    public static final Companion f149369h = new Companion(null);

    /* renamed from: b */
    public TextStickerItem f149370b;

    /* renamed from: c */
    public boolean f149371c;

    /* renamed from: d */
    public long f149372d;

    /* renamed from: e */
    public int f149373e = -1;

    /* renamed from: f */
    public int f149374f = -1;

    /* renamed from: g */
    public boolean f149375g;

    /* renamed from: i */
    private final LinkedHashMap<Integer, TextStickerItem> f149376i = new LinkedHashMap<>();

    /* renamed from: j */
    private TextBorderView f149377j;

    /* renamed from: k */
    private EditText f149378k;

    /* renamed from: l */
    private DeleteTextStickerView f149379l;

    /* renamed from: m */
    private View f149380m;

    /* renamed from: n */
    private final float f149381n = 0.33f;

    /* renamed from: o */
    private final float f149382o = 3.0f;

    /* renamed from: p */
    private boolean f149383p;

    /* renamed from: q */
    private OnStickerChangeListener f149384q;

    /* renamed from: r */
    private ValueAnimator f149385r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/photoeditor/ve/textsticker/VETextController$OnStickerChangeListener;", "", "onTextStickerIsMoving", "", "onTextStickerMoveStop", "onTextStickerSelected", "sticker", "Lcom/ss/android/photoeditor/ve/textsticker/TextStickerItem;", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.textsticker.b$b */
    public interface OnStickerChangeListener {
        /* renamed from: a */
        void mo203633a();

        /* renamed from: a */
        void mo203634a(TextStickerItem aVar);

        /* renamed from: b */
        void mo203635b();
    }

    /* renamed from: v */
    public final void mo203732v() {
        this.f149371c = false;
    }

    /* renamed from: w */
    public final float mo203993w() {
        return 10.0f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/photoeditor/ve/textsticker/VETextController$Companion;", "", "()V", "STICKER_MIN_SIZE", "", "TEXT_STICKER_AUTO_DISMISS_DURATION", "", "TEXT_STICKER_PARAM_BACKGROUND", "", "TEXT_STICKER_PARAM_BACKGROUND_COLOR", "TEXT_STICKER_PARAM_BACKGROUND_ROUND_CORNER", "TEXT_STICKER_PARAM_BACKGROUND_ROUND_RADIUS", "TEXT_STICKER_PARAM_BACKGROUND_WRAPPED", "TEXT_STICKER_PARAM_FONT_PATH", "TEXT_STICKER_PARAM_FONT_SIZE", "TEXT_STICKER_PARAM_INNER_PADDING", "TEXT_STICKER_PARAM_LINEMAXWIDTH", "TEXT_STICKER_PARAM_LINE_GAP", "TEXT_STICKER_PARAM_TEXT", "TEXT_STICKER_PARAM_TEXT_COLOR", "TEXT_STICKER_PARAM_VERSION", "TEXT_STICKER_VALUE_BACKGROUND_ROUND_RADIUS", "", "TEXT_STICKER_VALUE_FONT_SIZE", "TEXT_STICKER_VALUE_INNER_PADDING", "", "TEXT_STICKER_VALUE_LINE_GAP", "TEXT_STICKER_VALUE_VERSION", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.textsticker.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final LinkedHashMap<Integer, TextStickerItem> mo203591s() {
        return this.f149376i;
    }

    /* renamed from: t */
    public final View mo203592t() {
        return this.f149380m;
    }

    /* renamed from: I */
    private final TextStickerItem m232619I() {
        TextStickerItem aVar = new TextStickerItem();
        aVar.mo204087d(mo204102A());
        return aVar;
    }

    /* renamed from: u */
    public final boolean mo203731u() {
        TextBorderView textBorderView = this.f149377j;
        if (textBorderView == null || textBorderView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public final void mo204114x() {
        this.f149383p = true;
        OnStickerChangeListener bVar = this.f149384q;
        if (bVar != null) {
            bVar.mo203634a(this.f149370b);
        }
    }

    /* renamed from: y */
    public final void mo204115y() {
        TextBorderView textBorderView = this.f149377j;
        if (textBorderView != null) {
            textBorderView.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.textsticker.b$d */
    public static final class RunnableC59932d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VETextController f149386a;

        RunnableC59932d(VETextController bVar) {
            this.f149386a = bVar;
        }

        public final void run() {
            if (this.f149386a.f149371c && System.currentTimeMillis() >= this.f149386a.f149372d) {
                this.f149386a.mo204115y();
            }
        }
    }

    /* renamed from: D */
    private final void m232614D() {
        TextStickerItem aVar = this.f149370b;
        if (aVar != null) {
            aVar.mo204093g(aVar.mo204085d());
            aVar.mo204095h(aVar.mo204088e());
        }
    }

    /* renamed from: C */
    public final void mo204104C() {
        this.f149371c = true;
        this.f149372d = System.currentTimeMillis() + 1000;
        TextBorderView textBorderView = this.f149377j;
        if (textBorderView != null) {
            textBorderView.postDelayed(new RunnableC59932d(this), 1000);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/photoeditor/ve/textsticker/VETextController$addTextSticker$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.textsticker.b$c */
    public static final class C59930c extends Lambda implements Function0<Unit> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ boolean $isUpdate$inlined;
        final /* synthetic */ TextStickerItem $textStickerItem$inlined;
        final /* synthetic */ EditText $view;
        final /* synthetic */ VETextController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59930c(Bitmap bitmap, EditText editText, VETextController bVar, boolean z, TextStickerItem aVar) {
            super(0);
            this.$bitmap = bitmap;
            this.$view = editText;
            this.this$0 = bVar;
            this.$isUpdate$inlined = z;
            this.$textStickerItem$inlined = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            Bitmap bitmap = this.$bitmap;
            final String a = C59902f.m232473a(bitmap, C59902f.m232481b(this.this$0.mo203706q()) + System.currentTimeMillis() + ".jpg");
            if (a != null) {
                C59905h.m232490b(new Function0<Unit>() {
                    /* class com.ss.android.photoeditor.ve.textsticker.VETextController.C59930c.C599311 */

                    @Override // kotlin.jvm.functions.Function0
                    public final void invoke() {
                        float f;
                        float f2;
                        int i;
                        C63956a a = VEImage.m250735a(this.this$0.mo203707r(), false, false, 3, (Object) null);
                        if (a != null) {
                            float measuredWidth = ((float) this.$view.getMeasuredWidth()) / a.f161505g;
                            float measuredHeight = ((float) this.$view.getMeasuredHeight()) / a.f161506h;
                            if (this.$isUpdate$inlined) {
                                f = this.$textStickerItem$inlined.mo204100m() - (measuredWidth / 2.0f);
                            } else {
                                f = 0.5f - (measuredWidth / 2.0f);
                            }
                            if (this.$isUpdate$inlined) {
                                f2 = this.$textStickerItem$inlined.mo204101n() - (measuredHeight / 2.0f);
                            } else {
                                f2 = 0.5f - (measuredHeight / 2.0f);
                            }
                            TextStickerItem aVar = this.$textStickerItem$inlined;
                            Integer c = this.this$0.mo203707r().mo220792c(a, f, f2, measuredWidth, measuredHeight);
                            if (c != null) {
                                i = c.intValue();
                            } else {
                                i = -1;
                            }
                            aVar.mo204077a(i);
                            this.this$0.mo203707r().mo220766a(this.$textStickerItem$inlined.mo204075a(), this.$textStickerItem$inlined.mo204098k());
                            if (this.$textStickerItem$inlined.mo204082c() != 1.0f) {
                                this.this$0.mo203707r().mo220764a(this.$textStickerItem$inlined.mo204075a(), this.$textStickerItem$inlined.mo204082c());
                            }
                            if (this.$textStickerItem$inlined.mo204079b() != BitmapDescriptorFactory.HUE_RED) {
                                this.this$0.mo203707r().mo220786b(this.$textStickerItem$inlined.mo204075a(), this.$textStickerItem$inlined.mo204079b());
                            }
                            this.this$0.mo203694e();
                            this.this$0.mo203591s().put(Integer.valueOf(this.$textStickerItem$inlined.mo204075a()), this.$textStickerItem$inlined);
                            this.this$0.f149370b = this.$textStickerItem$inlined;
                            this.this$0.mo204116z();
                            this.this$0.mo204103B();
                            this.this$0.mo204104C();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: F */
    private final boolean m232616F() {
        TextStickerItem aVar = this.f149370b;
        if (aVar == null) {
            return false;
        }
        float f = (float) 0;
        if (aVar.mo204085d() >= f) {
            float f2 = (float) 1;
            if (aVar.mo204085d() > f2 || aVar.mo204088e() < f || aVar.mo204088e() > f2) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: G */
    private final void m232617G() {
        FrameLayout border;
        if (!this.f149375g) {
            DeleteTextStickerView deleteTextStickerView = this.f149379l;
            if (deleteTextStickerView != null) {
                deleteTextStickerView.setVisibility(0);
                TextBorderView textBorderView = this.f149377j;
                if (!(textBorderView == null || (border = textBorderView.getBorder()) == null)) {
                    border.post(new RunnableC59936h(border, textBorderView, deleteTextStickerView, this));
                }
            }
            View view = this.f149380m;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: J */
    private final void m232620J() {
        TextStickerItem aVar = this.f149370b;
        if (aVar != null) {
            this.f149376i.remove(Integer.valueOf(aVar.mo204075a()));
            mo203707r().mo220788b(aVar.mo204075a());
            VEImage.m250737a(mo203707r(), (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
        }
        this.f149370b = null;
        mo204115y();
    }

    /* renamed from: A */
    public final int mo204102A() {
        int i = 0;
        for (Map.Entry<Integer, TextStickerItem> entry : this.f149376i.entrySet()) {
            i = Math.max(i, entry.getValue().mo204098k());
        }
        return i + 1;
    }

    /* renamed from: z */
    public final void mo204116z() {
        float[] a;
        TextStickerItem aVar = this.f149370b;
        if (aVar != null && (a = mo203707r().mo220784a(aVar.mo204075a(), false)) != null) {
            aVar.mo204080b(a[2] - a[0]);
            aVar.mo204083c(a[1] - a[3]);
            aVar.mo204089e(a[0]);
            aVar.mo204093g(a[0]);
            aVar.mo204091f(a[3]);
            aVar.mo204095h(a[3]);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0005"}, d2 = {"<anonymous>", "", "run", "com/ss/android/photoeditor/ve/textsticker/VETextController$showDeleteStickerView$1$1$1$1", "com/ss/android/photoeditor/ve/textsticker/VETextController$$special$$inlined$let$lambda$1", "com/ss/android/photoeditor/ve/textsticker/VETextController$$special$$inlined$let$lambda$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.textsticker.b$h */
    public static final class RunnableC59936h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f149399a;

        /* renamed from: b */
        final /* synthetic */ TextBorderView f149400b;

        /* renamed from: c */
        final /* synthetic */ DeleteTextStickerView f149401c;

        /* renamed from: d */
        final /* synthetic */ VETextController f149402d;

        RunnableC59936h(FrameLayout frameLayout, TextBorderView textBorderView, DeleteTextStickerView deleteTextStickerView, VETextController bVar) {
            this.f149399a = frameLayout;
            this.f149400b = textBorderView;
            this.f149401c = deleteTextStickerView;
            this.f149402d = bVar;
        }

        public final void run() {
            if (C59909l.m232496a(this.f149399a, this.f149400b.getTextOutPadding(), this.f149401c)) {
                TextStickerItem aVar = this.f149402d.f149370b;
                if (aVar != null) {
                    this.f149402d.f149373e = aVar.mo204075a();
                }
                this.f149401c.mo204050a(true);
                if (this.f149402d.f149374f != -1 && this.f149402d.f149374f == this.f149402d.f149373e) {
                    this.f149401c.setVisibility(8);
                    View t = this.f149402d.mo203592t();
                    if (t != null) {
                        t.setVisibility(8);
                    }
                    this.f149402d.f149375g = true;
                    return;
                }
                return;
            }
            TextStickerItem aVar2 = this.f149402d.f149370b;
            if (!(aVar2 == null || this.f149402d.f149373e == -1 || this.f149402d.f149373e != aVar2.mo204075a())) {
                this.f149402d.f149374f = aVar2.mo204075a();
            }
            this.f149401c.mo204050a(false);
        }
    }

    /* renamed from: E */
    private final void m232615E() {
        ValueAnimator valueAnimator = this.f149385r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        TextStickerItem aVar = this.f149370b;
        if (aVar != null) {
            float f = aVar.mo204090f() - aVar.mo204085d();
            float g = aVar.mo204092g() - aVar.mo204088e();
            float d = aVar.mo204085d();
            float e = aVar.mo204088e();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            ofFloat.addUpdateListener(new C59933e(aVar, d, f, e, g, this));
            ofFloat.addListener(new C59934f(aVar, d, f, e, g, this));
            ofFloat.setInterpolator(new animationInterpolatorC59853c(4.0f));
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "this");
            ofFloat.setDuration(300L);
            ofFloat.start();
            this.f149385r = ofFloat;
        }
    }

    /* renamed from: B */
    public final void mo204103B() {
        float[] a;
        RectF a2;
        TextStickerItem aVar = this.f149370b;
        if (aVar != null && (a = mo203707r().mo220784a(aVar.mo204075a(), false)) != null && (a2 = mo203674a(a[0], a[1], a[2], a[3])) != null) {
            float f = a2.right - a2.left;
            float f2 = a2.top - a2.bottom;
            float f3 = (float) 2;
            PointF a3 = mo203673a(new PointF((a[0] + a[2]) / f3, (a[1] + a[3]) / f3));
            if (a3 != null) {
                TextBorderView textBorderView = this.f149377j;
                if (textBorderView != null) {
                    textBorderView.mo204052a((int) f, (int) f2, (int) a3.x, (int) a3.y, -aVar.mo204079b());
                }
                TextBorderView textBorderView2 = this.f149377j;
                if (textBorderView2 != null) {
                    textBorderView2.setVisibility(0);
                }
            }
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: g */
    public void mo203696g() {
        OnStickerChangeListener bVar;
        super.mo203696g();
        if (!(!mo203731u() || this.f149370b == null || (bVar = this.f149384q) == null)) {
            bVar.mo203635b();
        }
        DeleteTextStickerView deleteTextStickerView = this.f149379l;
        if (deleteTextStickerView != null) {
            if (deleteTextStickerView.mo204051a()) {
                m232620J();
                ImageEditorHitPoint.Companion.m232164a(ImageEditorHitPoint.f148823a, "text_delete", null, 2, null);
            } else if (!this.f149383p) {
                mo204104C();
            }
            deleteTextStickerView.mo204050a(false);
            deleteTextStickerView.setVisibility(8);
        }
        View view = this.f149380m;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f149373e = -1;
        this.f149374f = -1;
        this.f149375g = false;
    }

    /* renamed from: H */
    private final void m232618H() {
        TextStickerItem aVar = this.f149370b;
        if (aVar != null) {
            int k = aVar.mo204098k();
            for (Map.Entry<Integer, TextStickerItem> entry : this.f149376i.entrySet()) {
                k = Math.max(k, entry.getValue().mo204098k());
                if (entry.getValue().mo204098k() > aVar.mo204098k()) {
                    TextStickerItem value = entry.getValue();
                    value.mo204087d(value.mo204098k() - 1);
                    mo203707r().mo220766a(entry.getValue().mo204075a(), entry.getValue().mo204098k());
                }
            }
            if (k != aVar.mo204098k()) {
                aVar.mo204087d(k);
                mo203707r().mo220766a(aVar.mo204075a(), aVar.mo204098k());
                mo203694e();
                mo204103B();
            }
        }
    }

    /* renamed from: a */
    public final void mo204105a(EditText editText) {
        this.f149378k = editText;
    }

    /* renamed from: b */
    public final void mo204110b(ValueAnimator valueAnimator) {
        this.f149385r = valueAnimator;
    }

    /* renamed from: a */
    public final void mo204106a(DeleteTextStickerView deleteTextStickerView) {
        this.f149379l = deleteTextStickerView;
    }

    /* renamed from: b */
    public final void mo204111b(View view) {
        this.f149380m = view;
    }

    /* renamed from: a */
    public final void mo204107a(TextBorderView textBorderView) {
        this.f149377j = textBorderView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/photoeditor/ve/textsticker/VETextController$changePositionToOrigin$1$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "photoeditor_release", "com/ss/android/photoeditor/ve/textsticker/VETextController$$special$$inlined$apply$lambda$2"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.textsticker.b$f */
    public static final class C59934f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ TextStickerItem f149393a;

        /* renamed from: b */
        final /* synthetic */ float f149394b;

        /* renamed from: c */
        final /* synthetic */ float f149395c;

        /* renamed from: d */
        final /* synthetic */ float f149396d;

        /* renamed from: e */
        final /* synthetic */ float f149397e;

        /* renamed from: f */
        final /* synthetic */ VETextController f149398f;

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f149398f.mo204110b((ValueAnimator) null);
            this.f149398f.mo204104C();
        }

        C59934f(TextStickerItem aVar, float f, float f2, float f3, float f4, VETextController bVar) {
            this.f149393a = aVar;
            this.f149394b = f;
            this.f149395c = f2;
            this.f149396d = f3;
            this.f149397e = f4;
            this.f149398f = bVar;
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: a */
    public void mo203675a(float f) {
        if (this.f149370b != null) {
            m232623g(1.0f, -f);
            ImageEditorHitPoint.Companion.m232164a(ImageEditorHitPoint.f148823a, "text_rotation", null, 2, null);
            return;
        }
        super.mo203675a(f);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/photoeditor/ve/textsticker/VETextController$changePositionToOrigin$1$1$1", "com/ss/android/photoeditor/ve/textsticker/VETextController$$special$$inlined$apply$lambda$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.textsticker.b$e */
    public static final class C59933e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TextStickerItem f149387a;

        /* renamed from: b */
        final /* synthetic */ float f149388b;

        /* renamed from: c */
        final /* synthetic */ float f149389c;

        /* renamed from: d */
        final /* synthetic */ float f149390d;

        /* renamed from: e */
        final /* synthetic */ float f149391e;

        /* renamed from: f */
        final /* synthetic */ VETextController f149392f;

        C59933e(TextStickerItem aVar, float f, float f2, float f3, float f4, VETextController bVar) {
            this.f149387a = aVar;
            this.f149388b = f;
            this.f149389c = f2;
            this.f149390d = f3;
            this.f149391e = f4;
            this.f149392f = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                this.f149387a.mo204089e(this.f149388b + (this.f149389c * floatValue));
                this.f149387a.mo204091f(this.f149390d + (floatValue * this.f149391e));
                this.f149392f.mo203707r().mo220787b(this.f149387a.mo204075a(), this.f149387a.mo204100m(), this.f149387a.mo204101n());
                VEImage.m250737a(this.f149392f.mo203707r(), (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
                this.f149392f.mo204103B();
                this.f149392f.mo203732v();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: a */
    private final RectF m232621a(float[] fArr) {
        RectF f = mo203695f();
        if (f != null) {
            return new RectF((fArr[0] * f.width()) + f.left, (fArr[3] * f.height()) + f.top, (fArr[2] * f.width()) + f.left, (fArr[1] * f.height()) + f.top + C60275a.m234185a(mo203706q(), 30.0f));
        }
        return null;
    }

    /* renamed from: a */
    public final void mo204108a(OnStickerChangeListener bVar) {
        this.f149384q = bVar;
    }

    /* renamed from: a */
    private final void m232622a(TextStickerItem aVar, boolean z) {
        EditText editText = this.f149378k;
        if (editText != null) {
            C59905h.m232489a(new C59930c(C59898c.m232453a(editText), editText, this, z, aVar));
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: b */
    public void mo203589b(float f, float f2) {
        if (mo203731u() && this.f149370b != null) {
            mo204112e(f, f2);
            ImageEditorHitPoint.Companion.m232164a(ImageEditorHitPoint.f148823a, "text_move", null, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.textsticker.b$g */
    public static final class C59935g<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((TextStickerItem) t2.getValue()).mo204098k()), Integer.valueOf(((TextStickerItem) t.getValue()).mo204098k()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VETextController(Context context, VEImage vEImage) {
        super(context, vEImage);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(vEImage, "veImage");
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: d */
    public void mo203590d(float f, float f2) {
        super.mo203590d(f, f2);
        TextStickerItem f3 = mo204113f(f, f2);
        if (f3 != null) {
            if (!Intrinsics.areEqual(f3, this.f149370b)) {
                this.f149370b = f3;
                mo204103B();
                mo204104C();
            } else if (mo203731u()) {
                mo204114x();
                mo203732v();
            } else {
                mo204103B();
                mo204104C();
            }
            m232618H();
            return;
        }
        TextBorderView textBorderView = this.f149377j;
        if (textBorderView == null || textBorderView.getVisibility() != 0) {
            VEBaseController.OnSurfaceClickedListener c = mo203689c();
            if (c != null) {
                c.mo203632a();
                return;
            }
            return;
        }
        mo204115y();
    }

    /* renamed from: e */
    public final void mo204112e(float f, float f2) {
        C63956a a;
        TextStickerItem aVar = this.f149370b;
        if (aVar != null && (a = VEImage.m250735a(mo203707r(), false, false, 3, (Object) null)) != null) {
            float f3 = f2 / a.f161506h;
            aVar.mo204089e(aVar.mo204085d() + (f / a.f161505g));
            aVar.mo204091f(aVar.mo204088e() + f3);
            mo203707r().mo220787b(aVar.mo204075a(), aVar.mo204100m(), aVar.mo204101n());
            mo203694e();
            mo204103B();
            mo203732v();
            m232617G();
            OnStickerChangeListener bVar = this.f149384q;
            if (bVar != null) {
                bVar.mo203633a();
            }
        }
    }

    /* renamed from: f */
    public TextStickerItem mo204113f(float f, float f2) {
        RectF a;
        for (Map.Entry entry : CollectionsKt.sortedWith(this.f149376i.entrySet(), new C59935g())) {
            TextStickerItem aVar = (TextStickerItem) entry.getValue();
            float[] a2 = mo203707r().mo220784a(aVar.mo204075a(), false);
            if (!(a2 == null || (a = m232621a(a2)) == null)) {
                PointF a3 = C59908j.m232491a(new PointF(f, f2), a.centerX(), a.centerY(), aVar.mo204079b());
                if (a.contains(a3.x, a3.y)) {
                    return aVar;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    private final void m232623g(float f, float f2) {
        RectF a;
        TextStickerItem aVar = this.f149370b;
        if (aVar != null) {
            if (f != 1.0f) {
                float[] a2 = mo203707r().mo220784a(aVar.mo204075a(), false);
                if (a2 != null && (a = mo203674a(a2[0], a2[1], a2[2], a2[3])) != null) {
                    float f3 = a.right - a.left;
                    float f4 = a.top - a.bottom;
                    if (f >= ((float) 1) || Math.min(f3, f4) > C60275a.m234185a(mo203706q(), mo203993w())) {
                        float c = aVar.mo204082c() * f;
                        float f5 = this.f149381n;
                        float f6 = this.f149382o;
                        if (c >= f5 && c <= f6) {
                            mo203707r().mo220764a(aVar.mo204075a(), f);
                            aVar.mo204086d(c);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (f2 != BitmapDescriptorFactory.HUE_RED) {
                aVar.mo204076a(aVar.mo204079b() - f2);
                mo203707r().mo220786b(aVar.mo204075a(), aVar.mo204079b());
            }
            mo203694e();
            mo204103B();
            mo203732v();
            m232617G();
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: a */
    public void mo203676a(float f, float f2) {
        if (mo203731u() && this.f149370b != null) {
            if (m232616F()) {
                m232615E();
            } else {
                m232614D();
            }
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: a */
    public void mo203677a(float f, float f2, float f3) {
        if (this.f149370b != null) {
            m232623g(f * f, BitmapDescriptorFactory.HUE_RED);
            ImageEditorHitPoint.Companion.m232164a(ImageEditorHitPoint.f148823a, "text_zoom", null, 2, null);
            return;
        }
        super.mo203677a(f, f2, f3);
    }

    /* renamed from: a */
    public final void mo204109a(String str, Integer num, Integer num2) {
        boolean z = false;
        this.f149383p = false;
        boolean z2 = true;
        if (mo203731u()) {
            if (str != null) {
                if (str.length() == 0) {
                    z = true;
                }
                if (!z) {
                    TextStickerItem aVar = this.f149370b;
                    if (aVar != null) {
                        aVar.mo204078a(str);
                        if (num != null) {
                            aVar.mo204081b(num.intValue());
                        }
                        if (num2 != null) {
                            aVar.mo204084c(num2.intValue());
                        }
                        this.f149376i.remove(Integer.valueOf(aVar.mo204075a()));
                        mo203707r().mo220788b(aVar.mo204075a());
                        m232622a(aVar, true);
                        return;
                    }
                    return;
                }
            }
            mo204104C();
        } else if (str != null) {
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2 && num != null) {
                TextStickerItem I = m232619I();
                I.mo204078a(str);
                I.mo204081b(num.intValue());
                if (num2 != null) {
                    I.mo204084c(num2.intValue());
                }
                m232622a(I, false);
            }
        }
    }
}
