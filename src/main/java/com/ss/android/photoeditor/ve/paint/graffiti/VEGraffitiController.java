package com.ss.android.photoeditor.ve.paint.graffiti;

import android.content.Context;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.ve.controller.IImageEditController;
import com.ss.android.photoeditor.ve.hitpoint.ImageEditorHitPoint;
import com.ss.android.photoeditor.ve.p3018e.C59900d;
import com.ss.android.photoeditor.ve.paint.PaintController;
import com.ss.android.photoeditor.ve.utils.VEStorageUtils;
import com.ss.android.vesdk.VEImage;
import com.ss.android.vesdk.bean.C63958b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\rJ\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u001cH\u0016J\u001c\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u000e\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0016J\u0017\u0010(\u001a\u00020\u001c2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u0010J\b\u0010,\u001a\u00020\u001cH\u0016J\u0006\u0010-\u001a\u00020\u001cR\u000e\u0010\b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/photoeditor/ve/paint/graffiti/VEGraffitiController;", "Lcom/ss/android/photoeditor/ve/paint/PaintController;", "Lcom/ss/android/photoeditor/ve/controller/IImageEditController;", "context", "Landroid/content/Context;", "veImage", "Lcom/ss/android/vesdk/VEImage;", "(Landroid/content/Context;Lcom/ss/android/vesdk/VEImage;)V", "commandTag", "", "isApparentMove", "", "moveDiffX", "", "moveDiffY", "onPaintEventListener", "Lcom/ss/android/photoeditor/ve/paint/PaintController$OnPaintEventListener;", "paintColor", "", "paintResourcePath", "paintStarted", "stickerIndex", "", "touchDownX", "touchDownY", "touchMoveX", "touchMoveY", "clearBrush", "", "getUndoCount", "initBrushSticker", "onCancelBtnClick", "onConfirmBtnClick", "onOnePointerTouch", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "setInitPaintColor", "color", "setPaintColor", "(Ljava/lang/Integer;)V", "setPaintEventListener", "listener", "toolbarShown", "undo", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.paint.graffiti.a */
public final class VEGraffitiController extends PaintController implements IImageEditController {

    /* renamed from: c */
    private final String f149240c = "StickerBrush";

    /* renamed from: d */
    private double[] f149241d;

    /* renamed from: e */
    private int f149242e = -1;

    /* renamed from: f */
    private String f149243f = (mo203591s() + "/Brush2D_Simple_2");

    /* renamed from: g */
    private float f149244g;

    /* renamed from: h */
    private float f149245h;

    /* renamed from: i */
    private float f149246i;

    /* renamed from: j */
    private float f149247j;

    /* renamed from: k */
    private float f149248k;

    /* renamed from: l */
    private float f149249l;

    /* renamed from: m */
    private boolean f149250m;

    /* renamed from: n */
    private boolean f149251n;

    /* renamed from: o */
    private PaintController.OnPaintEventListener f149252o;

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: p */
    public void mo203705p() {
        super.mo203705p();
        mo204016z();
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: l */
    public void mo203701l() {
        super.mo203701l();
        m232525A();
        ImageEditorHitPoint.f148823a.mo203720c();
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: o */
    public void mo203704o() {
        if (mo204014x() > ((float) 0)) {
            super.mo203704o();
            return;
        }
        mo203705p();
        mo204016z();
    }

    /* renamed from: x */
    public final float mo204014x() {
        C63958b a = mo203707r().mo220771a(this.f149242e);
        if (a != null) {
            return a.f161511a;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: y */
    public final void mo204015y() {
        mo203707r().mo220783a(true, this.f149242e);
        VEImage.m250737a(mo203707r(), (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
    }

    /* renamed from: z */
    public final void mo204016z() {
        mo203707r().mo220796d(this.f149242e);
        VEImage.m250737a(mo203707r(), (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
    }

    /* renamed from: A */
    private final void m232525A() {
        String b = VEStorageUtils.f149211a.mo203986b(mo203706q());
        if (b != null) {
            this.f149242e = mo203707r().mo220767a(b);
            mo203707r().mo220789b(this.f149243f);
            mo203707r().mo220793c(this.f149242e);
            mo203991b(mo203731u() + ((mo203732v() - mo203731u()) * 0.5f));
            mo203990a(this.f149241d);
            mo203707r().mo220802j();
            mo203687b(mo203695f());
            mo203681a(mo203686b());
        }
    }

    /* renamed from: a */
    public final void mo204011a(PaintController.OnPaintEventListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f149252o = bVar;
    }

    /* renamed from: b */
    public final void mo204013b(int i) {
        this.f149241d = C59900d.m232466a(i);
    }

    /* renamed from: a */
    public final void mo204012a(Integer num) {
        if (num != null) {
            num.intValue();
            double[] a = C59900d.m232466a(num.intValue());
            this.f149241d = a;
            mo203990a(a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VEGraffitiController(Context context, VEImage vEImage) {
        super(context, vEImage);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(vEImage, "veImage");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != 3) goto L_0x00e2;
     */
    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo203684a(android.view.View r17, android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.photoeditor.ve.paint.graffiti.VEGraffitiController.mo203684a(android.view.View, android.view.MotionEvent):boolean");
    }
}
