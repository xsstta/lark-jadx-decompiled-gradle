package com.ss.android.vc.meeting.module.sketch.action;

import android.graphics.RectF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.sketch.AbsSketchControl;
import com.ss.android.vc.meeting.module.sketch.Sketch;
import com.ss.android.vc.meeting.module.sketch.SketchRenderModel;
import com.ss.android.vc.meeting.module.sketch.SketchRustImpl;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.arrow.ArrowDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.arrow.ArrowStyle;
import com.ss.android.vc.meeting.module.sketch.utils.CoordinateUtil;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;
import com.ss.android.vc.statistics.event.C63745b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 .2\u00020\u0001:\u0001.B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%H\u0016J*\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J*\u0010,\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J*\u0010-\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010+H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006/"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/action/ArrowAction;", "Lcom/ss/android/vc/meeting/module/sketch/action/ISketchAction;", "model", "Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;", "(Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;)V", "arrowStyle", "Lcom/ss/android/vc/meeting/module/sketch/dto/arrow/ArrowStyle;", "getArrowStyle", "()Lcom/ss/android/vc/meeting/module/sketch/dto/arrow/ArrowStyle;", "setArrowStyle", "(Lcom/ss/android/vc/meeting/module/sketch/dto/arrow/ArrowStyle;)V", "endDot", "Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;", "getEndDot", "()Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;", "setEndDot", "(Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;)V", "hasTouchDown", "", "lastX", "", "lastY", "mCurrentId", "", "getModel", "()Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;", "startDot", "getStartDot", "setStartDot", "enterScaleMode", "", "getCurrentId", "getMode", "Lcom/ss/android/vc/meeting/module/sketch/action/SketchMode;", "onSelected", "selected", "color", "", "touchDown", "posX", "posY", "scale", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "touchMove", "touchUp", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ArrowAction implements ISketchAction {
    public static final Companion Companion = new Companion(null);
    private ArrowStyle arrowStyle = new ArrowStyle(0, 3.0f);
    private Coord endDot;
    private boolean hasTouchDown;
    private float lastX = -1.0f;
    private float lastY = -1.0f;
    private String mCurrentId;
    private final SketchRenderModel model;
    private Coord startDot;

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public void enterScaleMode() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/action/ArrowAction$Companion;", "", "()V", "ARROW_DYNAMIC_KEY", "", "TAG", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ArrowStyle getArrowStyle() {
        return this.arrowStyle;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public String getCurrentId() {
        return this.mCurrentId;
    }

    public final Coord getEndDot() {
        return this.endDot;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public SketchMode getMode() {
        return SketchMode.ARROW;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public SketchRenderModel getModel() {
        return this.model;
    }

    public final Coord getStartDot() {
        return this.startDot;
    }

    public final void setEndDot(Coord coord) {
        this.endDot = coord;
    }

    public final void setStartDot(Coord coord) {
        this.startDot = coord;
    }

    public final void setArrowStyle(ArrowStyle arrowStyle2) {
        Intrinsics.checkParameterIsNotNull(arrowStyle2, "<set-?>");
        this.arrowStyle = arrowStyle2;
    }

    public ArrowAction(SketchRenderModel sketchRenderModel) {
        Intrinsics.checkParameterIsNotNull(sketchRenderModel, "model");
        this.model = sketchRenderModel;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public void onSelected(boolean z, int i) {
        this.arrowStyle.color = SketchUtilKt.argbToRgba$default(i, 0, 2, null);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public void touchDown(float f, float f2, float f3, C61303k kVar) {
        if (this.hasTouchDown) {
            C60700b.m235864f("[Sketch] [ArrowAction]", "[touchDown]", "has Touch Down, Error!!! x = " + f + ", y = " + f2 + ", scale = " + f3);
            touchUp(this.lastX, this.lastY, f3, kVar);
            return;
        }
        this.lastX = f;
        this.lastY = f2;
        this.hasTouchDown = true;
        this.startDot = new Coord(f, f2);
        this.arrowStyle.color = SketchUtilKt.argbToRgba$default(getModel().getColor(), 0, 2, null);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public void touchMove(float f, float f2, float f3, C61303k kVar) {
        if (!this.hasTouchDown) {
            C60700b.m235861e("[Sketch] [ArrowAction]", "[touchMove]", "No TouchDown, Error!!! x = " + f + ", y = " + f2);
            touchDown(f, f2, f3, kVar);
        }
        this.endDot = new Coord(f, f2);
        this.lastX = f;
        this.lastY = f2;
        this.mCurrentId = "arrow_dynamic";
        SketchRenderModel model2 = getModel();
        Coord coord = this.startDot;
        if (coord == null) {
            Intrinsics.throwNpe();
        }
        float[] flatCoord = SketchUtilKt.flatCoord(coord);
        Coord coord2 = this.endDot;
        if (coord2 == null) {
            Intrinsics.throwNpe();
        }
        model2.updateDynamicArrow(new ArrowDrawableData("arrow_dynamic", flatCoord, SketchUtilKt.flatCoord(coord2), this.arrowStyle, null));
        getModel().invalidate();
    }

    @Override // com.ss.android.vc.meeting.module.sketch.action.ISketchAction
    public boolean touchUp(float f, float f2, float f3, C61303k kVar) {
        String str;
        String str2;
        AbsSketchControl ag;
        if (this.hasTouchDown && !CoordinateUtil.isInContent(f, f2, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getModel().getSketchRange().mo210163b(), (float) getModel().getSketchRange().mo210165c()))) {
            C60700b.m235861e("[Sketch] [ArrowAction]", "[touchUp]", "point out of range");
            if (CoordinateUtil.isInContent(this.lastX, this.lastY, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getModel().getSketchRange().mo210163b(), (float) getModel().getSketchRange().mo210165c()))) {
                return touchUp(this.lastX, this.lastY, f3, kVar);
            }
        }
        if (!this.hasTouchDown) {
            C60700b.m235861e("[Sketch] [ArrowAction]", "[touchUp2]", "No TouchDown, Error!!! x = " + f + ", y = " + f2);
            touchDown(f, f2, f3, kVar);
        }
        this.endDot = new Coord(f, f2);
        getModel().removeDynamic("arrow_dynamic");
        VideoChat videoChat = null;
        this.mCurrentId = null;
        this.hasTouchDown = false;
        this.lastX = f;
        this.lastY = f2;
        String sketchInstanceId = getModel().getSketchControl().getSketchInstanceId();
        Coord coord = this.startDot;
        if (coord == null) {
            Intrinsics.throwNpe();
        }
        float[] flatCoord = SketchUtilKt.flatCoord(coord);
        Coord coord2 = this.endDot;
        if (coord2 == null) {
            Intrinsics.throwNpe();
        }
        ArrowDrawableData arrowFinish = Sketch.arrowFinish(sketchInstanceId, flatCoord, SketchUtilKt.flatCoord(coord2), this.arrowStyle);
        SketchRenderModel model2 = getModel();
        Intrinsics.checkExpressionValueIsNotNull(arrowFinish, "arrowDrawableData");
        model2.updateStaticArrow(arrowFinish, true);
        if (kVar != null) {
            str = kVar.mo212055d();
        } else {
            str = null;
        }
        if (kVar == null || (ag = kVar.ag()) == null) {
            str2 = null;
        } else {
            str2 = ag.curShareScreenId;
        }
        SketchRustImpl.sendArrow(str, str2, arrowFinish);
        int color = getModel().getColor();
        if (kVar != null) {
            videoChat = kVar.mo212056e();
        }
        C63745b.m250135a("arrow", color, videoChat);
        return true;
    }
}
