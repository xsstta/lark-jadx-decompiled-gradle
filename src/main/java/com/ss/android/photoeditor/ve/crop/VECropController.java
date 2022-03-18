package com.ss.android.photoeditor.ve.crop;

import android.content.Context;
import android.graphics.RectF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.ve.base.VEBaseController;
import com.ss.android.photoeditor.ve.controller.IImageEditController;
import com.ss.android.photoeditor.ve.crop.animate.VEAnimateChangeListener;
import com.ss.android.photoeditor.ve.crop.view.VECropView;
import com.ss.android.photoeditor.ve.crop.view.VEImageViewDelegate;
import com.ss.android.photoeditor.ve.hitpoint.ImageEditorHitPoint;
import com.ss.android.ttve.utils.C60275a;
import com.ss.android.vesdk.VEImage;
import com.ss.android.vesdk.bean.C63956a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013*\u0002\u0014&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001CB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010(\u001a\u00020\u000fH\u0016J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020,H\u0016J\b\u0010.\u001a\u00020,H\u0016J\u0018\u0010/\u001a\u00020,2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0016J \u00103\u001a\u00020,2\u0006\u00104\u001a\u0002012\u0006\u00105\u001a\u0002012\u0006\u00106\u001a\u000201H\u0016J\b\u00107\u001a\u00020,H\u0016J\b\u00108\u001a\u00020,H\u0016J\u0006\u00109\u001a\u00020,J\u000e\u0010:\u001a\u00020,2\u0006\u0010;\u001a\u00020\u001dJ\u0016\u0010<\u001a\u00020,2\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001dJ\u000e\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020\u000fJ\b\u0010A\u001a\u00020,H\u0016J\b\u0010B\u001a\u00020,H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u0010\u0010%\u001a\u00020&X\u0004¢\u0006\u0004\n\u0002\u0010'¨\u0006D"}, d2 = {"Lcom/ss/android/photoeditor/ve/crop/VECropController;", "Lcom/ss/android/photoeditor/ve/base/VEBaseController;", "Lcom/ss/android/photoeditor/ve/controller/IImageEditController;", "context", "Landroid/content/Context;", "veImage", "Lcom/ss/android/vesdk/VEImage;", "(Landroid/content/Context;Lcom/ss/android/vesdk/VEImage;)V", "cropFinishListener", "Lcom/ss/android/photoeditor/ve/crop/VECropController$CropFinishListener;", "getCropFinishListener", "()Lcom/ss/android/photoeditor/ve/crop/VECropController$CropFinishListener;", "setCropFinishListener", "(Lcom/ss/android/photoeditor/ve/crop/VECropController$CropFinishListener;)V", "value", "", "imageTranslateOrScale", "setImageTranslateOrScale", "(Z)V", "veCropAnimateChangeListener", "com/ss/android/photoeditor/ve/crop/VECropController$veCropAnimateChangeListener$1", "Lcom/ss/android/photoeditor/ve/crop/VECropController$veCropAnimateChangeListener$1;", "veCropView", "Lcom/ss/android/photoeditor/ve/crop/view/VECropView;", "getVeCropView", "()Lcom/ss/android/photoeditor/ve/crop/view/VECropView;", "setVeCropView", "(Lcom/ss/android/photoeditor/ve/crop/view/VECropView;)V", "veImageOriginHeight", "", "getVeImageOriginHeight", "()I", "setVeImageOriginHeight", "(I)V", "veImageOriginWidth", "getVeImageOriginWidth", "setVeImageOriginWidth", "veImageViewDelegate", "com/ss/android/photoeditor/ve/crop/VECropController$veImageViewDelegate$1", "Lcom/ss/android/photoeditor/ve/crop/VECropController$veImageViewDelegate$1;", "functionEnable", "getMarginRectF", "Landroid/graphics/RectF;", "initVECropData", "", "onCancelBtnClick", "onConfirmBtnClick", "onMove", "dx", "", "dy", "onScale", "scale", "anchorX", "anchorY", "onTouchEnd", "resetAnimateEnd", "revert", "rotate", "degrees", "setAspectRatio", "aspectRatioX", "aspectRatioY", "setFixedAspectRatio", "fixAspectRatio", "toolbarHide", "toolbarShown", "CropFinishListener", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.crop.a */
public final class VECropController extends VEBaseController implements IImageEditController {

    /* renamed from: b */
    private VECropView f148824b;

    /* renamed from: c */
    private int f148825c;

    /* renamed from: d */
    private int f148826d;

    /* renamed from: e */
    private CropFinishListener f148827e;

    /* renamed from: f */
    private boolean f148828f;

    /* renamed from: g */
    private final C59850d f148829g;

    /* renamed from: h */
    private final C59849c f148830h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/photoeditor/ve/crop/VECropController$CropFinishListener;", "", "onFinish", "", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.crop.a$a */
    public interface CropFinishListener {
        /* renamed from: a */
        void mo203636a();
    }

    /* renamed from: s */
    public final int mo203591s() {
        return this.f148825c;
    }

    /* renamed from: t */
    public final int mo203592t() {
        return this.f148826d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"com/ss/android/photoeditor/ve/crop/VECropController$veImageViewDelegate$1", "Lcom/ss/android/photoeditor/ve/crop/view/VEImageViewDelegate;", "getCurrentImageHeight", "", "getCurrentImageRectF", "Landroid/graphics/RectF;", "getCurrentImageScale", "", "getCurrentImageWidth", "getImageBoundPoints", "", "getImageHeight", "getImageWidth", "getMarginBottom", "getMarginLeftRight", "getMarginTop", "getMaxScale", "getRevertShow", "", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.crop.a$d */
    public static final class C59850d implements VEImageViewDelegate {

        /* renamed from: a */
        final /* synthetic */ VECropController f148833a;

        /* renamed from: b */
        final /* synthetic */ Context f148834b;

        /* renamed from: c */
        final /* synthetic */ VEImage f148835c;

        @Override // com.ss.android.photoeditor.ve.crop.view.VEImageViewDelegate
        /* renamed from: j */
        public float mo203748j() {
            return 5.0f;
        }

        @Override // com.ss.android.photoeditor.ve.crop.view.VEImageViewDelegate
        /* renamed from: a */
        public int mo203739a() {
            return this.f148833a.mo203591s();
        }

        @Override // com.ss.android.photoeditor.ve.crop.view.VEImageViewDelegate
        /* renamed from: b */
        public int mo203740b() {
            return this.f148833a.mo203592t();
        }

        @Override // com.ss.android.photoeditor.ve.crop.view.VEImageViewDelegate
        /* renamed from: h */
        public RectF mo203746h() {
            return this.f148833a.mo203695f();
        }

        @Override // com.ss.android.photoeditor.ve.crop.view.VEImageViewDelegate
        /* renamed from: c */
        public int mo203741c() {
            return (int) C60275a.m234185a(this.f148834b, 44.0f);
        }

        @Override // com.ss.android.photoeditor.ve.crop.view.VEImageViewDelegate
        /* renamed from: d */
        public int mo203742d() {
            return (int) C60275a.m234185a(this.f148834b, 26.0f);
        }

        @Override // com.ss.android.photoeditor.ve.crop.view.VEImageViewDelegate
        /* renamed from: e */
        public int mo203743e() {
            return (int) C60275a.m234185a(this.f148834b, 152.0f);
        }

        @Override // com.ss.android.photoeditor.ve.crop.view.VEImageViewDelegate
        /* renamed from: i */
        public float mo203747i() {
            C63956a.C63957a aVar;
            C63956a a = VEImage.m250735a(this.f148835c, false, false, 3, (Object) null);
            if (a == null || (aVar = a.f161504f) == null) {
                return 1.0f;
            }
            return aVar.f161509a;
        }

        @Override // com.ss.android.photoeditor.ve.crop.view.VEImageViewDelegate
        /* renamed from: f */
        public int mo203744f() {
            int i;
            float f;
            C63956a a = VEImage.m250735a(this.f148835c, false, false, 3, (Object) null);
            if (a != null) {
                i = (int) a.f161507i;
            } else {
                i = 0;
            }
            if (i % 180 == 0) {
                C63956a a2 = VEImage.m250735a(this.f148835c, false, false, 3, (Object) null);
                if (a2 == null) {
                    return this.f148833a.mo203592t();
                }
                f = a2.f161506h;
            } else {
                C63956a a3 = VEImage.m250735a(this.f148835c, false, false, 3, (Object) null);
                if (a3 == null) {
                    return this.f148833a.mo203591s();
                }
                f = a3.f161505g;
            }
            return (int) f;
        }

        @Override // com.ss.android.photoeditor.ve.crop.view.VEImageViewDelegate
        /* renamed from: g */
        public float[] mo203745g() {
            RectF f = this.f148833a.mo203695f();
            if (f == null) {
                return new float[8];
            }
            return new float[]{f.left, f.top, f.right, f.top, f.right, f.bottom, f.left, f.bottom};
        }

        C59850d(VECropController aVar, Context context, VEImage vEImage) {
            this.f148833a = aVar;
            this.f148834b = context;
            this.f148835c = vEImage;
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: h */
    public void mo203697h() {
        super.mo203697h();
        VECropView vECropView = this.f148824b;
        if (vECropView != null) {
            vECropView.mo203938b();
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: m */
    public void mo203702m() {
        super.mo203702m();
        CropFinishListener aVar = this.f148827e;
        if (aVar != null) {
            aVar.mo203636a();
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: n */
    public RectF mo203703n() {
        return new RectF(44.0f, 26.0f, 44.0f, 152.0f);
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: d */
    public boolean mo203693d() {
        VECropView vECropView;
        if (!super.mo203693d() || ((vECropView = this.f148824b) != null && vECropView.mo203937a())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: g */
    public void mo203696g() {
        super.mo203696g();
        if (this.f148828f) {
            m232179b(false);
        }
        VECropView vECropView = this.f148824b;
        if (vECropView != null) {
            vECropView.mo203935a(false);
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: l */
    public void mo203701l() {
        super.mo203701l();
        mo203731u();
        mo203707r().mo220806n();
        ImageEditorHitPoint.f148823a.mo203724e();
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: p */
    public void mo203705p() {
        if (mo203693d()) {
            super.mo203705p();
            mo203707r().mo220807o();
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: o */
    public void mo203704o() {
        RectF cropRectResult;
        if (mo203693d()) {
            mo203707r().mo220798f();
            VECropView vECropView = this.f148824b;
            if (vECropView != null && (cropRectResult = vECropView.getCropRectResult()) != null) {
                mo203691c(cropRectResult);
                mo203707r().mo220799g();
            }
        }
    }

    /* renamed from: u */
    public final void mo203731u() {
        RectF f = mo203695f();
        if (f != null) {
            this.f148825c = (int) f.width();
            this.f148826d = (int) f.height();
            VECropView vECropView = this.f148824b;
            if (vECropView != null) {
                vECropView.f149143a = this.f148829g;
            }
            VECropView vECropView2 = this.f148824b;
            if (vECropView2 != null) {
                vECropView2.f149144b = this.f148830h;
            }
            VECropView vECropView3 = this.f148824b;
            if (vECropView3 != null) {
                vECropView3.setInitCropRect(f);
            }
            VECropView vECropView4 = this.f148824b;
            if (vECropView4 != null) {
                vECropView4.setVisibility(0);
            }
        }
    }

    /* renamed from: v */
    public final void mo203732v() {
        VECropView vECropView = this.f148824b;
        if (vECropView != null) {
            vECropView.setVisibility(4);
        }
        mo203707r().mo220807o();
        mo203707r().mo220777a("translate", BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        VEImage.m250737a(mo203707r(), (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
        float a = C60275a.m234185a(mo203706q(), 26.0f);
        float a2 = C60275a.m234185a(mo203706q(), 44.0f);
        VEBaseController.m232112a(this, a, C60275a.m234185a(mo203706q(), 152.0f), a2, a2, false, 0, new C59848b(this), 32, null);
    }

    /* renamed from: a */
    public final void mo203727a(CropFinishListener aVar) {
        this.f148827e = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.crop.a$b */
    static final class C59848b extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ VECropController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59848b(VECropController aVar) {
            super(1);
            this.this$0 = aVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo203731u();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016J0\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¨\u0006\u0019"}, d2 = {"com/ss/android/photoeditor/ve/crop/VECropController$veCropAnimateChangeListener$1", "Lcom/ss/android/photoeditor/ve/crop/animate/VEAnimateChangeListener;", "doScaleAndRotate", "", "degree", "", "rotateAnchorX", "rotateAnchorY", "scale", "scaleAnchorX", "scaleAnchorY", "doScaleAndTransLate", "diffX", "diffY", "anchorX", "anchorY", "doTransLate", "flipX", "onCropChange", "showRevertButton", "visible", "", "updateActiveRectF", "rectF", "Landroid/graphics/RectF;", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.crop.a$c */
    public static final class C59849c implements VEAnimateChangeListener {

        /* renamed from: a */
        final /* synthetic */ VECropController f148831a;

        /* renamed from: b */
        final /* synthetic */ VEImage f148832b;

        @Override // com.ss.android.photoeditor.ve.crop.animate.VEAnimateChangeListener
        /* renamed from: a */
        public void mo203738a(boolean z) {
        }

        @Override // com.ss.android.photoeditor.ve.crop.animate.VEAnimateChangeListener
        /* renamed from: a */
        public void mo203737a(RectF rectF) {
            Intrinsics.checkParameterIsNotNull(rectF, "rectF");
            this.f148831a.mo203681a(rectF);
        }

        C59849c(VECropController aVar, VEImage vEImage) {
            this.f148831a = aVar;
            this.f148832b = vEImage;
        }

        @Override // com.ss.android.photoeditor.ve.crop.animate.VEAnimateChangeListener
        /* renamed from: a */
        public void mo203734a(float f, float f2, float f3) {
            RectF f4 = this.f148831a.mo203695f();
            if (f4 != null) {
                if (f != 1.0f) {
                    this.f148832b.mo220790b("scale", f, f, f4.centerX(), this.f148832b.mo220791c() - f4.centerY());
                }
                if (!(f2 == BitmapDescriptorFactory.HUE_RED && f3 == BitmapDescriptorFactory.HUE_RED)) {
                    this.f148832b.mo220777a("translate", f2, f3);
                }
                VEImage.m250737a(this.f148832b, (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
            }
        }

        @Override // com.ss.android.photoeditor.ve.crop.animate.VEAnimateChangeListener
        /* renamed from: a */
        public void mo203735a(float f, float f2, float f3, float f4, float f5) {
            if (f != 1.0f) {
                VEImage vEImage = this.f148832b;
                vEImage.mo220790b("scale", f, f, f2, vEImage.mo220791c() - f3);
            }
            if (!(f4 == BitmapDescriptorFactory.HUE_RED && f5 == BitmapDescriptorFactory.HUE_RED)) {
                this.f148832b.mo220777a("translate", f4, f5);
            }
            VEImage.m250737a(this.f148832b, (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
        }

        @Override // com.ss.android.photoeditor.ve.crop.animate.VEAnimateChangeListener
        /* renamed from: a */
        public void mo203736a(float f, float f2, float f3, float f4, float f5, float f6) {
            VEImage vEImage = this.f148832b;
            vEImage.mo220778a("rotation", f, f2, vEImage.mo220791c() - f3);
            VEImage vEImage2 = this.f148832b;
            vEImage2.mo220790b("scale", f4, f4, f5, vEImage2.mo220791c() - f6);
            VEImage.m250737a(this.f148832b, (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
        }
    }

    /* renamed from: b */
    private final void m232179b(boolean z) {
        this.f148828f = z;
        VECropView vECropView = this.f148824b;
        if (vECropView != null) {
            vECropView.setCropViewDisallowInterceptTouchEvent(Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public final void mo203728a(VECropView vECropView) {
        this.f148824b = vECropView;
    }

    /* renamed from: a */
    public final void mo203729a(boolean z) {
        VECropView vECropView = this.f148824b;
        if (vECropView != null) {
            vECropView.setFixedAspectRatio(z);
        }
    }

    /* renamed from: b */
    public final void mo203730b(int i) {
        VECropView vECropView;
        if (mo203693d() && (vECropView = this.f148824b) != null) {
            vECropView.mo203939b(i, 0);
        }
    }

    /* renamed from: a */
    public final void mo203726a(int i, int i2) {
        VECropView vECropView = this.f148824b;
        if (vECropView != null) {
            vECropView.mo203934a(i, i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VECropController(Context context, VEImage vEImage) {
        super(context, vEImage);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(vEImage, "veImage");
        this.f148829g = new C59850d(this, context, vEImage);
        this.f148830h = new C59849c(this, vEImage);
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: b */
    public void mo203589b(float f, float f2) {
        if (mo203693d()) {
            super.mo203589b(f, f2);
            if (!this.f148828f) {
                m232179b(true);
                VECropView vECropView = this.f148824b;
                if (vECropView != null) {
                    vECropView.mo203935a(true);
                }
            }
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: a */
    public void mo203677a(float f, float f2, float f3) {
        if (mo203693d()) {
            super.mo203677a(f, f2, f3);
            if (!this.f148828f) {
                m232179b(true);
                VECropView vECropView = this.f148824b;
                if (vECropView != null) {
                    vECropView.mo203935a(true);
                }
            }
        }
    }
}
