package com.ss.android.vc.meeting.module.sketch.action;

import android.graphics.RectF;
import android.os.Handler;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.sketch.AbsSketchControl;
import com.ss.android.vc.meeting.module.sketch.Sketch;
import com.ss.android.vc.meeting.module.sketch.SketchRenderModel;
import com.ss.android.vc.meeting.module.sketch.SketchRustImpl;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.CombinedAllPencilData;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilStyle;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilType;
import com.ss.android.vc.meeting.module.sketch.utils.CoordinateUtil;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;
import com.ss.android.vc.statistics.event.C63745b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002\u0010\u0014\u0018\u0000 12\u00020\u0001:\u00011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\n\u0010 \u001a\u0004\u0018\u00010\fH\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&H\u0016J\u000e\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0017J*\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J*\u0010/\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J*\u00100\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/action/PencilAction;", "Lcom/ss/android/vc/meeting/module/sketch/action/ISketchAction;", "model", "Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;", "(Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;)V", "hasTouchDown", "", "hasTouchMove", "lastX", "", "lastY", "mCurrentId", "", "mDrawHandler", "Landroid/os/Handler;", "mFitRunnable", "com/ss/android/vc/meeting/module/sketch/action/PencilAction$mFitRunnable$1", "Lcom/ss/android/vc/meeting/module/sketch/action/PencilAction$mFitRunnable$1;", "mSize", "mTransportRunnable", "com/ss/android/vc/meeting/module/sketch/action/PencilAction$mTransportRunnable$1", "Lcom/ss/android/vc/meeting/module/sketch/action/PencilAction$mTransportRunnable$1;", "value", "Lcom/ss/android/vc/meeting/module/sketch/dto/pencil/PencilType;", "mType", "setMType", "(Lcom/ss/android/vc/meeting/module/sketch/dto/pencil/PencilType;)V", "meetingId", "getModel", "()Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;", "enterScaleMode", "", "getCurrentId", "getMode", "Lcom/ss/android/vc/meeting/module/sketch/action/SketchMode;", "onSelected", "selected", "color", "", "setPencilType", ShareHitPoint.f121869d, "touchDown", "posX", "posY", "scale", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "touchMove", "touchUp", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class PencilAction implements ISketchAction {
    public static final Companion Companion = new Companion(null);
    public static ArrayList<Coord> mRawData = new ArrayList<>();
    private boolean hasTouchDown;
    private boolean hasTouchMove;
    private float lastX = -1.0f;
    private float lastY = -1.0f;
    public String mCurrentId;
    public Handler mDrawHandler;
    private final PencilAction$mFitRunnable$1 mFitRunnable = new PencilAction$mFitRunnable$1(this);
    private float mSize = 3.0f;
    private final PencilAction$mTransportRunnable$1 mTransportRunnable = new PencilAction$mTransportRunnable$1(this);
    private PencilType mType = PencilType.DEFAULT;
    public String meetingId;
    private final SketchRenderModel model;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/action/PencilAction$Companion;", "", "()V", "FIT_INTERNAL", "", "HIGHLIGHT_WIDTH", "", "MARKER_APLHA", "", "PENCIL_WIDTH", "TAG", "", "mRawData", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;", "Lkotlin/collections/ArrayList;", "getMRawData", "()Ljava/util/ArrayList;", "setMRawData", "(Ljava/util/ArrayList;)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public final ArrayList<Coord> getMRawData() {
            return PencilAction.mRawData;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void setMRawData(ArrayList<Coord> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
            PencilAction.mRawData = arrayList;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public String getCurrentId() {
        return this.mCurrentId;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public SketchMode getMode() {
        return SketchMode.PENCIL;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public SketchRenderModel getModel() {
        return this.model;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public void enterScaleMode() {
        synchronized (mRawData) {
            mRawData.clear();
            Unit unit = Unit.INSTANCE;
        }
        getModel().invalidate();
    }

    private final void setMType(PencilType pencilType) {
        float f;
        if (pencilType == PencilType.DEFAULT) {
            f = 3.0f;
        } else {
            f = 18.0f;
        }
        this.mSize = f;
        this.mType = pencilType;
    }

    public final void setPencilType(PencilType pencilType) {
        Intrinsics.checkParameterIsNotNull(pencilType, ShareHitPoint.f121869d);
        setMType(pencilType);
    }

    public PencilAction(SketchRenderModel sketchRenderModel) {
        Intrinsics.checkParameterIsNotNull(sketchRenderModel, "model");
        this.model = sketchRenderModel;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public void onSelected(boolean z, int i) {
        if (z) {
            this.mDrawHandler = C60735ab.m235995a("DrawThread");
            return;
        }
        Handler handler = this.mDrawHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quitSafely();
        }
        this.mDrawHandler = null;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public void touchDown(float f, float f2, float f3, C61303k kVar) {
        String str;
        if (kVar != null) {
            str = kVar.mo212055d();
        } else {
            str = null;
        }
        this.meetingId = str;
        if (this.hasTouchDown) {
            C60700b.m235864f("[Sketch] [PencilAction]", "[touchDown]", "has Touch Down, Error!!! x = " + f + ", y = " + f2 + ", scale = " + f3);
            touchUp(this.lastX, this.lastY, f3, kVar);
            return;
        }
        C60700b.m235843a("[Sketch] [PencilAction]", "[touchDown2]", "x = " + f + ", y = " + f2 + ", scale = " + f3);
        getModel().invalidate();
        this.hasTouchDown = true;
        this.lastX = f;
        this.lastY = f2;
        synchronized (mRawData) {
            mRawData.add(new Coord(f, f2));
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public void touchMove(float f, float f2, float f3, C61303k kVar) {
        String str;
        int i;
        Handler handler;
        AbsSketchControl ag;
        String str2 = null;
        if (kVar != null) {
            str = kVar.mo212055d();
        } else {
            str = null;
        }
        this.meetingId = str;
        if (!this.hasTouchDown) {
            C60700b.m235864f("[Sketch] [PencilAction]", "[touchMove]", "No TouchDown, Error!!! x = " + f + ", y = " + f2);
            touchDown(f, f2, f3, kVar);
        } else if (!this.hasTouchMove) {
            C60700b.m235851b("[Sketch] [PencilAction]", "[touchMove2]", "pencil Start");
            if (!(kVar == null || (ag = kVar.ag()) == null)) {
                str2 = ag.getSketchInstanceId();
            }
            int color = getModel().getColor();
            if (this.mType == PencilType.MARKER) {
                i = 102;
            } else {
                i = 255;
            }
            Sketch.pencilStart(str2, new PencilStyle(SketchUtilKt.argbToRgba(color, i), this.mSize, this.mType.getNumber()));
            Handler handler2 = this.mDrawHandler;
            if (handler2 != null) {
                handler2.post(this.mFitRunnable);
            }
            if (!getModel().getSketchControl().getTransferInVideo() && (handler = this.mDrawHandler) != null) {
                handler.post(this.mTransportRunnable);
            }
            this.hasTouchMove = true;
        }
        this.lastX = f;
        this.lastY = f2;
        synchronized (mRawData) {
            mRawData.add(new Coord(f, f2));
        }
        getModel().invalidate();
    }

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public boolean touchUp(float f, float f2, float f3, C61303k kVar) {
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        VideoChat videoChat;
        AbsSketchControl ag;
        if (kVar != null) {
            str = kVar.mo212055d();
        } else {
            str = null;
        }
        this.meetingId = str;
        if (this.hasTouchDown && !CoordinateUtil.isInContent(f, f2, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getModel().getSketchRange().mo210163b(), (float) getModel().getSketchRange().mo210165c()))) {
            C60700b.m235864f("[Sketch] [PencilAction]", "[touchUp]", "point out of range, x = " + f + ", y = " + f2 + ", windowWidth = " + ((float) getModel().getSketchRange().mo210163b()) + ", " + ((float) getModel().getSketchRange().mo210165c()));
            if (CoordinateUtil.isInContent(this.lastX, this.lastY, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getModel().getSketchRange().mo210163b(), (float) getModel().getSketchRange().mo210165c()))) {
                return touchUp(this.lastX, this.lastY, f3, kVar);
            }
        }
        if (!this.hasTouchDown) {
            C60700b.m235864f("[Sketch] [PencilAction]", "[touchUp2]", "No TouchDown, Error!!! x = " + f + ", y = " + f2);
            touchDown(f, f2, f3, kVar);
        }
        Handler handler = this.mDrawHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mFitRunnable);
        }
        Handler handler2 = this.mDrawHandler;
        if (handler2 != null) {
            handler2.removeCallbacks(this.mTransportRunnable);
        }
        boolean z2 = false;
        this.hasTouchDown = false;
        this.lastX = f;
        this.lastY = f2;
        if (!this.hasTouchMove) {
            mRawData.clear();
            return false;
        }
        this.hasTouchMove = false;
        synchronized (mRawData) {
            mRawData.add(new Coord(f, f2));
            Sketch.pencilAppend(getModel().getSketchControl().getSketchInstanceId(), SketchUtilKt.flatCoords(mRawData));
            mRawData.clear();
            ArrayList arrayList = new ArrayList();
            if (!getModel().getSketchControl().getTransferInVideo()) {
                arrayList.add(Sketch.pencilFitting(getModel().getSketchControl().getSketchInstanceId()));
            }
            CombinedAllPencilData pencilFinish = Sketch.pencilFinish(getModel().getSketchControl().getSketchInstanceId());
            arrayList.add(pencilFinish.transportData);
            if (kVar != null) {
                str2 = kVar.mo212055d();
            } else {
                str2 = null;
            }
            if (kVar == null || (ag = kVar.ag()) == null) {
                str3 = null;
            } else {
                str3 = ag.curShareScreenId;
            }
            SketchRustImpl.sendPencil(str2, str3, arrayList);
            PencilDrawableData pencilDrawableData = pencilFinish.transportData;
            if (pencilDrawableData.points != null) {
                float[] fArr = pencilDrawableData.points;
                Intrinsics.checkExpressionValueIsNotNull(fArr, "drawableData.points");
                if (fArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    SketchRenderModel model2 = getModel();
                    PencilDrawableData clone = pencilDrawableData.clone();
                    Intrinsics.checkExpressionValueIsNotNull(clone, "drawableData.clone()");
                    model2.updateStaticPencil(clone, true);
                    if (this.mType == PencilType.DEFAULT) {
                        str4 = "pen";
                    } else {
                        str4 = "highlighter";
                    }
                    int color = getModel().getColor();
                    if (kVar != null) {
                        videoChat = kVar.mo212056e();
                    } else {
                        videoChat = null;
                    }
                    C63745b.m250135a(str4, color, videoChat);
                    z2 = true;
                }
            }
            SketchRenderModel model3 = getModel();
            String str5 = pencilDrawableData.id;
            Intrinsics.checkExpressionValueIsNotNull(str5, "drawableData.id");
            model3.removeDynamic(str5);
            this.mCurrentId = null;
            Unit unit = Unit.INSTANCE;
        }
        C60700b.m235851b("[Sketch] [PencilAction]", "[touchUp3]", "pencilFinish");
        getModel().invalidate();
        return z2;
    }
}
