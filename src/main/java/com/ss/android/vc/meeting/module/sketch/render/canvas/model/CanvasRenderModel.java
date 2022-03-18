package com.ss.android.vc.meeting.module.sketch.render.canvas.model;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.module.sketch.AbsSketchControl;
import com.ss.android.vc.meeting.module.sketch.Sketch;
import com.ss.android.vc.meeting.module.sketch.SketchRemoteReceiver;
import com.ss.android.vc.meeting.module.sketch.SketchRenderModel;
import com.ss.android.vc.meeting.module.sketch.dto.MarkerDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.arrow.ArrowDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.comet.CometDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.oval.OvalDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.rect.RectangleDrawableData;
import com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender;
import com.ss.android.vc.meeting.module.sketch.render.IMarkRender;
import com.ss.android.vc.meeting.module.sketch.render.canvas.painters.ArrowPainter;
import com.ss.android.vc.meeting.module.sketch.render.canvas.painters.CometPainter;
import com.ss.android.vc.meeting.module.sketch.render.canvas.painters.MarkerPainter;
import com.ss.android.vc.meeting.module.sketch.render.canvas.painters.OvalPainter;
import com.ss.android.vc.meeting.module.sketch.render.canvas.painters.PencilPainter;
import com.ss.android.vc.meeting.module.sketch.render.canvas.painters.RectanglePainter;
import com.ss.android.vc.meeting.module.sketch.render.canvas.painters.RemotePencilsProxyPainter;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ,2\u00020\u0001:\u0001,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\fH\u0016J\u0010\u0010'\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010(\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010)\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u0006H\u0016J\u0018\u0010+\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0006H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006-"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/canvas/model/CanvasRenderModel;", "Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;", "sketchControl", "Lcom/ss/android/vc/meeting/module/sketch/AbsSketchControl;", "(Lcom/ss/android/vc/meeting/module/sketch/AbsSketchControl;)V", "dirty", "", "getDirty", "()Z", "setDirty", "(Z)V", "addMark", "", "key", "", "mark", "Lcom/ss/android/vc/meeting/module/sketch/render/IMarkRender;", "addRemotePencilsProxyRender", "clearCurrentAction", "createArrowRender", "Lcom/ss/android/vc/meeting/module/sketch/render/AbstractShapeRender;", "arrowDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/arrow/ArrowDrawableData;", "createCometRender", "cometDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/comet/CometDrawableData;", "createMarkRender", "markerDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/MarkerDrawableData;", "createOvalRender", "ovalDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/oval/OvalDrawableData;", "createPencilRender", "pencilDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/pencil/PencilDrawableData;", "createRectRender", "rectangleDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/rect/RectangleDrawableData;", "invalidate", "updateDynamicArrow", "updateDynamicPencil", "updateStaticArrow", "self", "updateStaticPencil", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CanvasRenderModel extends SketchRenderModel {
    public static final Companion Companion = new Companion(null);
    private volatile boolean dirty = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/canvas/model/CanvasRenderModel$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean getDirty() {
        return this.dirty;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void invalidate() {
        synchronized (this) {
            this.dirty = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void addRemotePencilsProxyRender() {
        synchronized (this) {
            if (!getVariateData().containsKey("RemotePencils")) {
                getVariateData().put("RemotePencils", new RemotePencilsProxyPainter(this));
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void clearCurrentAction() {
        boolean z;
        VideoChatModuleDependency.m236629b();
        synchronized (this) {
            LinkedList linkedList = new LinkedList();
            z = false;
            for (Map.Entry<String, AbstractShapeRender> entry : getDynamicData().entrySet()) {
                AbstractShapeRender value = entry.getValue();
                if (value instanceof PencilPainter) {
                    if (((PencilPainter) value).getData().extInfo != null && ParticipantUtil.m248722a(((PencilPainter) value).getData().extInfo.userId, ParticipantType.forNumber(((PencilPainter) value).getData().extInfo.userType), ((PencilPainter) value).getData().extInfo.deviceId)) {
                        C60700b.m235851b("[Sketch] [CanvasRenderModel]", "[clearCurrentAction]", "pencilFinish");
                        linkedList.add(entry.getKey());
                        z = true;
                    }
                } else if ((value instanceof ArrowPainter) && ((ArrowPainter) value).getData().extInfo != null && ParticipantUtil.m248722a(((ArrowPainter) value).getData().extInfo.userId, ParticipantType.forNumber(((ArrowPainter) value).getData().extInfo.userType), ((ArrowPainter) value).getData().extInfo.deviceId)) {
                    linkedList.add(entry.getKey());
                }
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                getDynamicData().remove((String) it.next());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z) {
            Sketch.pencilFinish(getSketchControl().getSketchInstanceId());
        }
    }

    public final void setDirty(boolean z) {
        this.dirty = z;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public AbstractShapeRender createArrowRender(ArrowDrawableData arrowDrawableData) {
        Intrinsics.checkParameterIsNotNull(arrowDrawableData, "arrowDrawableData");
        return new ArrowPainter(arrowDrawableData);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public IMarkRender createMarkRender(MarkerDrawableData markerDrawableData) {
        Intrinsics.checkParameterIsNotNull(markerDrawableData, "markerDrawableData");
        return new MarkerPainter(markerDrawableData);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public AbstractShapeRender createOvalRender(OvalDrawableData ovalDrawableData) {
        Intrinsics.checkParameterIsNotNull(ovalDrawableData, "ovalDrawableData");
        return new OvalPainter(ovalDrawableData);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public AbstractShapeRender createPencilRender(PencilDrawableData pencilDrawableData) {
        Intrinsics.checkParameterIsNotNull(pencilDrawableData, "pencilDrawableData");
        return new PencilPainter(pencilDrawableData);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public AbstractShapeRender createRectRender(RectangleDrawableData rectangleDrawableData) {
        Intrinsics.checkParameterIsNotNull(rectangleDrawableData, "rectangleDrawableData");
        return new RectanglePainter(rectangleDrawableData);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CanvasRenderModel(AbsSketchControl absSketchControl) {
        super(absSketchControl);
        Intrinsics.checkParameterIsNotNull(absSketchControl, "sketchControl");
        setRemoteReceiver(new SketchRemoteReceiver(this));
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public AbstractShapeRender createCometRender(CometDrawableData cometDrawableData) {
        Intrinsics.checkParameterIsNotNull(cometDrawableData, "cometDrawableData");
        String str = cometDrawableData.id;
        Intrinsics.checkExpressionValueIsNotNull(str, "cometDrawableData.id");
        return new CometPainter(str, getSketchControl().getSketchInstanceId());
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void updateDynamicArrow(ArrowDrawableData arrowDrawableData) {
        Intrinsics.checkParameterIsNotNull(arrowDrawableData, "arrowDrawableData");
        synchronized (this) {
            if (getDynamicData().get("arrow_dynamic") == null) {
                getDynamicData().put("arrow_dynamic", new ArrowPainter(arrowDrawableData));
                Unit unit = Unit.INSTANCE;
            } else {
                AbstractShapeRender abstractShapeRender = getDynamicData().get("arrow_dynamic");
                if (!(abstractShapeRender instanceof ArrowPainter)) {
                    abstractShapeRender = null;
                }
                ArrowPainter arrowPainter = (ArrowPainter) abstractShapeRender;
                if (arrowPainter != null) {
                    float[] fArr = arrowDrawableData.end;
                    Intrinsics.checkExpressionValueIsNotNull(fArr, "arrowDrawableData.end");
                    arrowPainter.updateEnd(SketchUtilKt.unflatCoord(fArr));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void updateDynamicPencil(PencilDrawableData pencilDrawableData) {
        Intrinsics.checkParameterIsNotNull(pencilDrawableData, "pencilDrawableData");
        synchronized (this) {
            if (getDynamicData().get(pencilDrawableData.id) == null) {
                String str = pencilDrawableData.id;
                Intrinsics.checkExpressionValueIsNotNull(str, "pencilDrawableData.id");
                getDynamicData().put(str, new PencilPainter(pencilDrawableData));
                Unit unit = Unit.INSTANCE;
            } else {
                AbstractShapeRender abstractShapeRender = getDynamicData().get(pencilDrawableData.id);
                if (!(abstractShapeRender instanceof PencilPainter)) {
                    abstractShapeRender = null;
                }
                PencilPainter pencilPainter = (PencilPainter) abstractShapeRender;
                if (pencilPainter != null) {
                    pencilPainter.update(pencilDrawableData);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void addMark(String str, IMarkRender iMarkRender) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(iMarkRender, "mark");
        synchronized (this) {
            if (iMarkRender instanceof AbstractShapeRender) {
                getVariateData().put(str, iMarkRender);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void updateStaticArrow(ArrowDrawableData arrowDrawableData, boolean z) {
        Intrinsics.checkParameterIsNotNull(arrowDrawableData, "arrowDrawableData");
        String str = arrowDrawableData.id;
        Intrinsics.checkExpressionValueIsNotNull(str, "arrowDrawableData.id");
        updateStatic(str, new ArrowPainter(arrowDrawableData), z);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void updateStaticPencil(PencilDrawableData pencilDrawableData, boolean z) {
        Intrinsics.checkParameterIsNotNull(pencilDrawableData, "pencilDrawableData");
        synchronized (this) {
            AbstractShapeRender abstractShapeRender = null;
            if (getStaticData().containsKey(pencilDrawableData.id)) {
                AbstractShapeRender abstractShapeRender2 = getStaticData().get(pencilDrawableData.id);
                if (abstractShapeRender2 instanceof PencilPainter) {
                    abstractShapeRender = abstractShapeRender2;
                }
                PencilPainter pencilPainter = (PencilPainter) abstractShapeRender;
                if (pencilPainter != null) {
                    pencilPainter.update(pencilDrawableData);
                }
                setStaticChanged(true);
                Unit unit = Unit.INSTANCE;
            } else if (getPendingStaticData().containsKey(pencilDrawableData.id)) {
                AbstractShapeRender abstractShapeRender3 = getPendingStaticData().get(pencilDrawableData.id);
                if (abstractShapeRender3 instanceof PencilPainter) {
                    abstractShapeRender = abstractShapeRender3;
                }
                PencilPainter pencilPainter2 = (PencilPainter) abstractShapeRender;
                if (pencilPainter2 != null) {
                    pencilPainter2.update(pencilDrawableData);
                    Unit unit2 = Unit.INSTANCE;
                }
            } else {
                String str = pencilDrawableData.id;
                Intrinsics.checkExpressionValueIsNotNull(str, "pencilDrawableData.id");
                getPendingStaticData().put(str, new PencilPainter(pencilDrawableData));
                Unit unit3 = Unit.INSTANCE;
            }
        }
        invalidate();
        if (z) {
            String str2 = pencilDrawableData.id;
            Intrinsics.checkExpressionValueIsNotNull(str2, "pencilDrawableData.id");
            onSelfShapeAdded(str2);
        }
    }
}
