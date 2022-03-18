package com.ss.android.photoeditor.ve.paint.mosaic;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.photoeditor.ve.controller.IImageEditController;
import com.ss.android.photoeditor.ve.hitpoint.ImageEditorHitPoint;
import com.ss.android.photoeditor.ve.paint.PaintController;
import com.ss.android.photoeditor.ve.utils.VEStorageUtils;
import com.ss.android.vesdk.VEImage;
import com.ss.android.vesdk.bean.C63956a;
import com.ss.android.vesdk.bean.C63958b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001LB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u00105\u001a\u000206J\u0006\u00107\u001a\u000206J\u0006\u00108\u001a\u000206J\u0006\u00109\u001a\u00020\u000bJ\b\u0010:\u001a\u000206H\u0002J\b\u0010;\u001a\u000206H\u0002J\u0010\u0010<\u001a\u0002062\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u000206H\u0002J\b\u0010@\u001a\u000206H\u0002J\b\u0010A\u001a\u000206H\u0016J\b\u0010B\u001a\u000206H\u0016J\u001c\u0010C\u001a\u00020\u00122\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u000e\u0010F\u001a\u0002062\u0006\u0010G\u001a\u00020\u0015J\u000e\u0010H\u001a\u0002062\u0006\u0010I\u001a\u00020\u001eJ\b\u0010J\u001a\u000206H\u0016J\u0006\u0010K\u001a\u000206R\u000e\u0010\b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u000e\u0010'\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u00100\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/ss/android/photoeditor/ve/paint/mosaic/VEMosaicController;", "Lcom/ss/android/photoeditor/ve/paint/PaintController;", "Lcom/ss/android/photoeditor/ve/controller/IImageEditController;", "context", "Landroid/content/Context;", "veImage", "Lcom/ss/android/vesdk/VEImage;", "(Landroid/content/Context;Lcom/ss/android/vesdk/VEImage;)V", "commandTag", "", "currentRectSizeX", "", "currentRectSizeY", "glassMosaicResourcePath", "glassRectMosaicResourcePath", "initRectSizeX", "initRectSizeY", "isApparentMove", "", "mosaicActionList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "mosaicRectResourcePath", "mosaicResourcePath", "mosaicStyle", "mosaicType", "moveDiffX", "moveDiffY", "onPaintEventListener", "Lcom/ss/android/photoeditor/ve/paint/PaintController$OnPaintEventListener;", "paintMaxSize", "getPaintMaxSize", "()F", "setPaintMaxSize", "(F)V", "paintMinSize", "getPaintMinSize", "setPaintMinSize", "paintStarted", "rectMosaicList", "rectStickerIndex", "rectView", "Lcom/ss/android/photoeditor/ve/paint/mosaic/RectView;", "getRectView", "()Lcom/ss/android/photoeditor/ve/paint/mosaic/RectView;", "setRectView", "(Lcom/ss/android/photoeditor/ve/paint/mosaic/RectView;)V", "stickerIndex", "touchDownX", "touchDownY", "touchMoveX", "touchMoveY", "changeToGlassMosaicStyle", "", "changeToNormalMosaicStyle", "clearBrush", "getUndoCount", "handleDownEvent", "handleMoveEvent", "handleUpEvent", "event", "Landroid/view/MotionEvent;", "initBrushSticker", "initStatus", "onCancelBtnClick", "onConfirmBtnClick", "onOnePointerTouch", "v", "Landroid/view/View;", "setMosaicType", ShareHitPoint.f121869d, "setPaintEventListener", "listener", "toolbarShown", "undo", "Companion", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.paint.mosaic.a */
public final class VEMosaicController extends PaintController implements IImageEditController {

    /* renamed from: c */
    public static final Companion f149283c = new Companion(null);

    /* renamed from: A */
    private ArrayList<Integer> f149284A = new ArrayList<>();

    /* renamed from: B */
    private RectView f149285B;

    /* renamed from: C */
    private float f149286C = 12.0f;

    /* renamed from: D */
    private float f149287D = 32.0f;

    /* renamed from: d */
    private final String f149288d = "StickerBrush";

    /* renamed from: e */
    private int f149289e = -1;

    /* renamed from: f */
    private String f149290f = (mo203591s() + "/Brush2D_Mosiac_2");

    /* renamed from: g */
    private String f149291g = (mo203591s() + "/Sticker_Rect_Mosaic");

    /* renamed from: h */
    private String f149292h = (mo203591s() + "/Brush2D_Mosiac_Guass_2");

    /* renamed from: i */
    private String f149293i = (mo203591s() + "/Sticker_Rect_Guass");

    /* renamed from: j */
    private float f149294j;

    /* renamed from: k */
    private float f149295k;

    /* renamed from: l */
    private float f149296l;

    /* renamed from: m */
    private float f149297m;

    /* renamed from: n */
    private float f149298n;

    /* renamed from: o */
    private float f149299o;

    /* renamed from: p */
    private boolean f149300p;

    /* renamed from: q */
    private boolean f149301q;

    /* renamed from: r */
    private PaintController.OnPaintEventListener f149302r;

    /* renamed from: s */
    private int f149303s;

    /* renamed from: t */
    private int f149304t;

    /* renamed from: u */
    private int f149305u = -1;

    /* renamed from: v */
    private float f149306v;

    /* renamed from: w */
    private float f149307w;

    /* renamed from: x */
    private float f149308x;

    /* renamed from: y */
    private float f149309y;

    /* renamed from: z */
    private ArrayList<Integer> f149310z = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/photoeditor/ve/paint/mosaic/VEMosaicController$Companion;", "", "()V", "MOSAIC_STYLE_GLASS", "", "MOSAIC_STYLE_NORMAL", "MOSAIC_TYPE_DRAW", "MOSAIC_TYPE_RECT", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.mosaic.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.photoeditor.ve.paint.PaintController
    /* renamed from: u */
    public float mo203731u() {
        return this.f149286C;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.photoeditor.ve.paint.PaintController
    /* renamed from: v */
    public float mo203732v() {
        return this.f149287D;
    }

    /* renamed from: x */
    public final RectView mo204014x() {
        return this.f149285B;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.mosaic.a$b */
    public static final class RunnableC59923b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VEMosaicController f149311a;

        RunnableC59923b(VEMosaicController aVar) {
            this.f149311a = aVar;
        }

        public final void run() {
            RectView x = this.f149311a.mo204014x();
            if (x != null) {
                x.setVisibility(8);
            }
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: l */
    public void mo203701l() {
        super.mo203701l();
        m232549E();
        ImageEditorHitPoint.f148823a.mo203718b();
        m232548D();
    }

    /* renamed from: D */
    private final void m232548D() {
        this.f149303s = 0;
        this.f149304t = 0;
        this.f149305u = -1;
        this.f149306v = BitmapDescriptorFactory.HUE_RED;
        this.f149307w = BitmapDescriptorFactory.HUE_RED;
        this.f149308x = BitmapDescriptorFactory.HUE_RED;
        this.f149309y = BitmapDescriptorFactory.HUE_RED;
        this.f149310z.clear();
        this.f149284A.clear();
    }

    /* renamed from: A */
    public final void mo204035A() {
        mo203707r().mo220796d(this.f149289e);
        VEImage.m250737a(mo203707r(), (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
    }

    /* renamed from: B */
    public final void mo204036B() {
        this.f149304t = 0;
        mo203707r().mo220789b(this.f149290f);
        PaintController.m232497a(this, (double[]) null, 1, (Object) null);
    }

    /* renamed from: C */
    public final void mo204037C() {
        this.f149304t = 1;
        mo203707r().mo220789b(this.f149292h);
        PaintController.m232497a(this, (double[]) null, 1, (Object) null);
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: o */
    public void mo203704o() {
        if (mo204041y() > ((float) 0)) {
            super.mo203704o();
        } else {
            mo203705p();
        }
    }

    /* renamed from: y */
    public final float mo204041y() {
        float f;
        C63958b a = mo203707r().mo220771a(this.f149289e);
        if (a != null) {
            f = a.f161511a;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        return f + ((float) this.f149310z.size());
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: p */
    public void mo203705p() {
        super.mo203705p();
        mo204035A();
        if (this.f149310z.size() > 0) {
            Iterator<Integer> it = this.f149310z.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                VEImage r = mo203707r();
                Intrinsics.checkExpressionValueIsNotNull(next, "rectIndex");
                r.mo220788b(next.intValue());
            }
            VEImage.m250737a(mo203707r(), (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
        }
    }

    /* renamed from: E */
    private final void m232549E() {
        String b = VEStorageUtils.f149211a.mo203986b(mo203706q());
        if (b != null) {
            this.f149289e = mo203707r().mo220767a(b);
            mo203707r().mo220789b(this.f149290f);
            mo203707r().mo220793c(this.f149289e);
            mo203991b(mo203731u() + ((mo203732v() - mo203731u()) * 0.5f));
            PaintController.m232497a(this, (double[]) null, 1, (Object) null);
            mo203707r().mo220802j();
            mo203687b(mo203695f());
            mo203681a(mo203686b());
        }
    }

    /* renamed from: G */
    private final void m232551G() {
        int i;
        if (this.f149303s == 0) {
            mo203707r().mo220781a(this.f149288d, this.f149290f, 1, this.f149294j, this.f149295k, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 2);
            return;
        }
        if (this.f149304t == 0) {
            i = VEImage.m250734a(mo203707r(), this.f149291g, (String[]) null, 2, (Object) null);
        } else {
            i = VEImage.m250734a(mo203707r(), this.f149293i, (String[]) null, 2, (Object) null);
        }
        this.f149305u = i;
        float[] a = VEImage.m250738a(mo203707r(), this.f149305u, false, 2, (Object) null);
        if (a != null) {
            this.f149306v = Math.abs(a[2] - a[0]);
            this.f149307w = Math.abs(a[1] - a[3]);
        }
    }

    /* renamed from: z */
    public final void mo204042z() {
        if (this.f149284A.size() > 0) {
            ArrayList<Integer> arrayList = this.f149284A;
            Integer num = arrayList.get(arrayList.size() - 1);
            Intrinsics.checkExpressionValueIsNotNull(num, "mosaicActionList[mosaicActionList.size - 1]");
            if (num.intValue() == 0) {
                mo203707r().mo220783a(true, this.f149289e);
                VEImage.m250737a(mo203707r(), (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
            } else if (this.f149310z.size() - 1 >= 0) {
                ArrayList<Integer> arrayList2 = this.f149310z;
                Integer num2 = arrayList2.get(arrayList2.size() - 1);
                Intrinsics.checkExpressionValueIsNotNull(num2, "rectMosaicList[rectMosaicList.size - 1]");
                int intValue = num2.intValue();
                mo203707r().mo220788b(intValue);
                VEImage.m250737a(mo203707r(), (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
                this.f149310z.remove(Integer.valueOf(intValue));
            }
            ArrayList<Integer> arrayList3 = this.f149284A;
            arrayList3.remove(arrayList3.size() - 1);
        }
    }

    /* renamed from: F */
    private final void m232550F() {
        if (this.f149303s == 0) {
            mo203707r().mo220781a(this.f149288d, this.f149290f, 4, this.f149296l, this.f149297m, this.f149298n, this.f149299o, BitmapDescriptorFactory.HUE_RED, 2);
            VEImage.m250737a(mo203707r(), (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
            return;
        }
        PointF b = mo203685b(new PointF(this.f149294j, this.f149295k));
        PointF b2 = mo203685b(new PointF(this.f149296l, this.f149297m));
        if (b != null && b2 != null) {
            PointF pointF = new PointF((b.x + b2.x) / 2.0f, (b.y + b2.y) / 2.0f);
            mo203707r().mo220787b(this.f149305u, pointF.x, ((float) 1) - pointF.y);
            C63956a a = VEImage.m250735a(mo203707r(), false, false, 3, (Object) null);
            if (a != null) {
                this.f149308x = Math.abs(this.f149296l - this.f149294j) / a.f161505g;
                this.f149309y = Math.abs(this.f149297m - this.f149295k) / a.f161506h;
                mo203707r().mo220765a(this.f149305u, this.f149308x / this.f149306v, this.f149309y / this.f149307w);
            }
            VEImage.m250737a(mo203707r(), (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
            this.f149306v = this.f149308x;
            this.f149307w = this.f149309y;
            RectView rectView = this.f149285B;
            if (rectView != null) {
                rectView.mo204017a(this.f149294j, this.f149295k, this.f149296l, this.f149297m);
            }
            RectView rectView2 = this.f149285B;
            if (rectView2 != null) {
                rectView2.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo204039a(RectView rectView) {
        this.f149285B = rectView;
    }

    /* renamed from: b */
    public final void mo204040b(int i) {
        this.f149303s = i;
    }

    /* renamed from: a */
    public final void mo204038a(PaintController.OnPaintEventListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f149302r = bVar;
    }

    /* renamed from: a */
    private final void m232552a(MotionEvent motionEvent) {
        if (this.f149303s == 0) {
            mo203707r().mo220781a(this.f149288d, this.f149290f, 2, motionEvent.getX(), motionEvent.getY(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 2);
            this.f149284A.add(0);
            return;
        }
        this.f149284A.add(1);
        this.f149310z.add(Integer.valueOf(this.f149305u));
        RectView rectView = this.f149285B;
        if (rectView != null) {
            rectView.postDelayed(new RunnableC59923b(this), 300);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VEMosaicController(Context context, VEImage vEImage) {
        super(context, vEImage);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(vEImage, "veImage");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r0 != 3) goto L_0x009a;
     */
    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo203684a(android.view.View r4, android.view.MotionEvent r5) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.photoeditor.ve.paint.mosaic.VEMosaicController.mo203684a(android.view.View, android.view.MotionEvent):boolean");
    }
}
