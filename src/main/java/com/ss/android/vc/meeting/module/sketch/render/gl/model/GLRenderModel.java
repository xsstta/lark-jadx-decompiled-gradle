package com.ss.android.vc.meeting.module.sketch.render.gl.model;

import android.graphics.PointF;
import android.opengl.Matrix;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.module.sketch.AbsSketchControl;
import com.ss.android.vc.meeting.module.sketch.Sketch;
import com.ss.android.vc.meeting.module.sketch.SketchRemoteReceiver;
import com.ss.android.vc.meeting.module.sketch.SketchRenderModel;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.MarkerDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.arrow.ArrowDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.comet.CometDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.oval.OvalDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilDrawableData;
import com.ss.android.vc.meeting.module.sketch.dto.rect.RectangleDrawableData;
import com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender;
import com.ss.android.vc.meeting.module.sketch.render.IMarkRender;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.Operation;
import com.ss.android.vc.meeting.module.sketch.render.gl.shape.ArrowAssembler;
import com.ss.android.vc.meeting.module.sketch.render.gl.shape.CometAssembler;
import com.ss.android.vc.meeting.module.sketch.render.gl.shape.GLMark;
import com.ss.android.vc.meeting.module.sketch.render.gl.shape.OvalAssembler;
import com.ss.android.vc.meeting.module.sketch.render.gl.shape.PencilAssembler;
import com.ss.android.vc.meeting.module.sketch.render.gl.shape.RectAssembler;
import com.ss.android.vc.meeting.module.sketch.render.gl.shape.RemotePencilsProxyAssembler;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0013\u0018\u0000 z2\u00020\u0001:\u0001zB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020:H\u0016J\u0010\u0010?\u001a\u00020:2\u0006\u0010@\u001a\u00020(H\u0002J\b\u0010A\u001a\u00020:H\u0002J\u001e\u0010B\u001a\u00020:2\u0006\u0010C\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006J\b\u0010D\u001a\u00020:H\u0016J\u0010\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020F2\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u00020=2\u0006\u0010M\u001a\u00020NH\u0016J\u0010\u0010O\u001a\u00020F2\u0006\u0010P\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u00020F2\u0006\u0010S\u001a\u00020TH\u0016J\u0010\u0010U\u001a\u00020F2\u0006\u0010V\u001a\u00020WH\u0016J\u0006\u0010X\u001a\u00020+J\u0006\u0010Y\u001a\u00020+J\b\u0010Z\u001a\u00020:H\u0016J\u0006\u0010[\u001a\u00020(J\b\u0010\\\u001a\u00020:H\u0016J\u000e\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020^J\u0006\u0010`\u001a\u00020:J\u0010\u0010a\u001a\u00020:2\u0006\u0010@\u001a\u00020(H\u0002J\u000e\u0010b\u001a\u00020:2\u0006\u0010;\u001a\u00020 J\u0012\u0010c\u001a\u0004\u0018\u00010\u00152\b\u0010d\u001a\u0004\u0018\u00010\u0015J\u0012\u0010c\u001a\u0004\u0018\u00010^2\b\u0010e\u001a\u0004\u0018\u00010^J\u0010\u0010c\u001a\u0004\u0018\u00010\u00152\u0006\u0010f\u001a\u00020\fJ\u001e\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0h2\u000e\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0hJ\u000e\u0010j\u001a\u00020\u00062\u0006\u0010k\u001a\u00020\u0006J\u001e\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150h2\u000e\u0010m\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150hJ\u000e\u0010n\u001a\u00020\u00062\u0006\u0010o\u001a\u00020\u0006J\u000e\u0010p\u001a\u00020\u00062\u0006\u0010q\u001a\u00020\u0006J\u0010\u0010r\u001a\u00020:2\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010s\u001a\u00020:2\u0006\u0010S\u001a\u00020TH\u0016J\u0016\u0010t\u001a\u00020:2\u0006\u0010;\u001a\u00020 2\u0006\u0010u\u001a\u00020^J\u0018\u0010v\u001a\u00020:2\u0006\u0010G\u001a\u00020H2\u0006\u0010w\u001a\u00020+H\u0016J\u0018\u0010x\u001a\u00020:2\u0006\u0010S\u001a\u00020T2\u0006\u0010w\u001a\u00020+H\u0016J\u0006\u0010y\u001a\u00020+R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\b\"\u0004\b2\u0010\nR\u001a\u00103\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\b\"\u0004\b5\u0010\nR\u001a\u00106\u001a\u00020+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010-\"\u0004\b8\u0010/¨\u0006{"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/gl/model/GLRenderModel;", "Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;", "sketchControl", "Lcom/ss/android/vc/meeting/module/sketch/AbsSketchControl;", "(Lcom/ss/android/vc/meeting/module/sketch/AbsSketchControl;)V", "axisScale", "", "getAxisScale", "()F", "setAxisScale", "(F)V", "currentMatrix", "", "getCurrentMatrix", "()[F", "setCurrentMatrix", "([F)V", "currentScale", "getCurrentScale", "setCurrentScale", "currentTranslate", "Landroid/graphics/PointF;", "getCurrentTranslate", "()Landroid/graphics/PointF;", "setCurrentTranslate", "(Landroid/graphics/PointF;)V", "initMaritx", "lineBorderWidth", "getLineBorderWidth", "setLineBorderWidth", "markers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/vc/meeting/module/sketch/render/gl/shape/GLMark;", "getMarkers", "()Ljava/util/concurrent/ConcurrentHashMap;", "setMarkers", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "operations", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/ss/android/vc/meeting/module/sketch/render/gl/model/Operation;", "recycleOperations", "scaleByX", "", "getScaleByX", "()Z", "setScaleByX", "(Z)V", "viewHeight", "getViewHeight", "setViewHeight", "viewWidth", "getViewWidth", "setViewWidth", "viewportChanged", "getViewportChanged", "setViewportChanged", "addMark", "", "key", "mark", "Lcom/ss/android/vc/meeting/module/sketch/render/IMarkRender;", "addRemotePencilsProxyRender", "appendOperation", "operation", "calcMatrix", "changeAxis", "axis", "clearCurrentAction", "createArrowRender", "Lcom/ss/android/vc/meeting/module/sketch/render/AbstractShapeRender;", "arrowDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/arrow/ArrowDrawableData;", "createCometRender", "cometDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/comet/CometDrawableData;", "createMarkRender", "markerDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/MarkerDrawableData;", "createOvalRender", "ovalDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/oval/OvalDrawableData;", "createPencilRender", "pencilDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/pencil/PencilDrawableData;", "createRectRender", "rectangleDrawableData", "Lcom/ss/android/vc/meeting/module/sketch/dto/rect/RectangleDrawableData;", "getAndResetViewportChanged", "hasMarks", "invalidate", "obtain", "onTransformed", "pcPoint2LocalPosition", "Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;", "pcPoint", "prepareDrawingData", "processOperation", "removeMark", "translate", "point", "coord", "arr", "translateCoords", "", "coordList", "translateDimension", "sz", "translatePoints", "pointList", "translateX", "x", "translateY", "y", "updateDynamicArrow", "updateDynamicPencil", "updateMark", "position", "updateStaticArrow", "self", "updateStaticPencil", "valid", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class GLRenderModel extends SketchRenderModel {
    public static final Companion Companion = new Companion(null);
    private float axisScale = 9.259259E-4f;
    private float[] currentMatrix = new float[16];
    private float currentScale = 1.0f;
    private PointF currentTranslate = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    private float[] initMaritx = new float[16];
    private float lineBorderWidth;
    private ConcurrentHashMap<String, GLMark> markers = new ConcurrentHashMap<>();
    private ConcurrentLinkedQueue<Operation> operations = new ConcurrentLinkedQueue<>();
    private ConcurrentLinkedQueue<Operation> recycleOperations = new ConcurrentLinkedQueue<>();
    private boolean scaleByX = true;
    private float viewHeight = 1920.0f;
    private float viewWidth = 1080.0f;
    private volatile boolean viewportChanged = true;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.Command.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Operation.Command.CHANGE_AXIS.ordinal()] = 1;
            iArr[Operation.Command.SCALE.ordinal()] = 2;
            iArr[Operation.Command.TRANSLATE.ordinal()] = 3;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void invalidate() {
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void onTransformed() {
        this.viewportChanged = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/gl/model/GLRenderModel$Companion;", "", "()V", "LINE_BORDER_WIDTH_PX", "", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final float getAxisScale() {
        return this.axisScale;
    }

    public final float[] getCurrentMatrix() {
        return this.currentMatrix;
    }

    public final float getCurrentScale() {
        return this.currentScale;
    }

    public final PointF getCurrentTranslate() {
        return this.currentTranslate;
    }

    public final float getLineBorderWidth() {
        return this.lineBorderWidth;
    }

    public final ConcurrentHashMap<String, GLMark> getMarkers() {
        return this.markers;
    }

    public final boolean getScaleByX() {
        return this.scaleByX;
    }

    public final float getViewHeight() {
        return this.viewHeight;
    }

    public final float getViewWidth() {
        return this.viewWidth;
    }

    public final boolean getViewportChanged() {
        return this.viewportChanged;
    }

    public final synchronized boolean getAndResetViewportChanged() {
        boolean z;
        z = this.viewportChanged;
        this.viewportChanged = false;
        return z;
    }

    public final synchronized boolean hasMarks() {
        return !this.markers.isEmpty();
    }

    public final Operation obtain() {
        Operation poll = this.recycleOperations.poll();
        if (poll == null) {
            return new Operation();
        }
        return poll;
    }

    public final void prepareDrawingData() {
        while (true) {
            Operation poll = this.operations.poll();
            if (poll != null) {
                processOperation(poll);
            } else {
                calcMatrix();
                return;
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void addRemotePencilsProxyRender() {
        synchronized (this) {
            if (!getVariateData().containsKey("RemotePencils")) {
                getVariateData().put("RemotePencils", new RemotePencilsProxyAssembler(this));
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final synchronized boolean valid() {
        boolean z;
        z = false;
        float f = (float) 0;
        if (this.axisScale > f && this.viewWidth > f && this.viewHeight > f && getSketchRange().mo210162a() && getOriginContentBoundary().width() > f && getOriginContentBoundary().height() > f) {
            z = true;
        }
        return z;
    }

    private final void calcMatrix() {
        this.currentScale = getContentBoundary().width() / getOriginContentBoundary().width();
        float f = (float) 2;
        float f2 = getOriginContentBoundary().left - (this.viewWidth / f);
        float f3 = (this.viewHeight / f) - getOriginContentBoundary().top;
        float f4 = getContentBoundary().left - (this.viewWidth / f);
        float f5 = (this.viewHeight / f) - getContentBoundary().top;
        float f6 = this.currentScale;
        float f7 = f4 - (f2 * f6);
        this.currentTranslate.x = (f7 * this.axisScale) / f6;
        PointF pointF = this.currentTranslate;
        pointF.y = ((f5 - (f3 * f6)) * this.axisScale) / this.currentScale;
        float[] fArr = this.currentMatrix;
        float[] fArr2 = this.initMaritx;
        float f8 = this.currentScale;
        Matrix.scaleM(fArr, 0, fArr2, 0, f8, f8, 1.0f);
        Matrix.translateM(this.currentMatrix, 0, this.currentTranslate.x, this.currentTranslate.y, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void clearCurrentAction() {
        boolean z;
        LinkedList linkedList = new LinkedList();
        synchronized (this) {
            z = false;
            for (Map.Entry<String, AbstractShapeRender> entry : getDynamicData().entrySet()) {
                AbstractShapeRender value = entry.getValue();
                if (value instanceof PencilAssembler) {
                    if (((PencilAssembler) value).data.extInfo != null && ParticipantUtil.m248722a(((PencilAssembler) value).data.extInfo.userId, ParticipantType.forNumber(((PencilAssembler) value).data.extInfo.userType), ((PencilAssembler) value).data.extInfo.deviceId)) {
                        C60700b.m235851b("[Sketch] [CanvasRenderModel]", "[clearCurrentAction]", "pencilFinish");
                        linkedList.add(entry.getKey());
                        z = true;
                    }
                } else if ((value instanceof ArrowAssembler) && ((ArrowAssembler) value).data.extInfo != null && ParticipantUtil.m248722a(((ArrowAssembler) value).data.extInfo.userId, ParticipantType.forNumber(((ArrowAssembler) value).data.extInfo.userType), ((ArrowAssembler) value).data.extInfo.deviceId)) {
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

    public final void setAxisScale(float f) {
        this.axisScale = f;
    }

    public final void setCurrentScale(float f) {
        this.currentScale = f;
    }

    public final void setLineBorderWidth(float f) {
        this.lineBorderWidth = f;
    }

    public final void setScaleByX(boolean z) {
        this.scaleByX = z;
    }

    public final void setViewHeight(float f) {
        this.viewHeight = f;
    }

    public final void setViewWidth(float f) {
        this.viewWidth = f;
    }

    public final void setViewportChanged(boolean z) {
        this.viewportChanged = z;
    }

    private final void appendOperation(Operation operation) {
        this.operations.add(operation);
    }

    public final void setCurrentMatrix(float[] fArr) {
        Intrinsics.checkParameterIsNotNull(fArr, "<set-?>");
        this.currentMatrix = fArr;
    }

    public final void setCurrentTranslate(PointF pointF) {
        Intrinsics.checkParameterIsNotNull(pointF, "<set-?>");
        this.currentTranslate = pointF;
    }

    public final void setMarkers(ConcurrentHashMap<String, GLMark> concurrentHashMap) {
        Intrinsics.checkParameterIsNotNull(concurrentHashMap, "<set-?>");
        this.markers = concurrentHashMap;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public AbstractShapeRender createArrowRender(ArrowDrawableData arrowDrawableData) {
        Intrinsics.checkParameterIsNotNull(arrowDrawableData, "arrowDrawableData");
        return new ArrowAssembler(this, arrowDrawableData);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public IMarkRender createMarkRender(MarkerDrawableData markerDrawableData) {
        Intrinsics.checkParameterIsNotNull(markerDrawableData, "markerDrawableData");
        return new GLMark(markerDrawableData);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public AbstractShapeRender createOvalRender(OvalDrawableData ovalDrawableData) {
        Intrinsics.checkParameterIsNotNull(ovalDrawableData, "ovalDrawableData");
        return new OvalAssembler(this, ovalDrawableData);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public AbstractShapeRender createPencilRender(PencilDrawableData pencilDrawableData) {
        Intrinsics.checkParameterIsNotNull(pencilDrawableData, "pencilDrawableData");
        return new PencilAssembler(this, pencilDrawableData);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public AbstractShapeRender createRectRender(RectangleDrawableData rectangleDrawableData) {
        Intrinsics.checkParameterIsNotNull(rectangleDrawableData, "rectangleDrawableData");
        return new RectAssembler(this, rectangleDrawableData);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public AbstractShapeRender createCometRender(CometDrawableData cometDrawableData) {
        Intrinsics.checkParameterIsNotNull(cometDrawableData, "cometDrawableData");
        String str = cometDrawableData.id;
        Intrinsics.checkExpressionValueIsNotNull(str, "cometDrawableData.id");
        return new CometAssembler(str, this, cometDrawableData.style.color);
    }

    public final void removeMark(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        synchronized (this.markers) {
            this.markers.remove(str);
        }
    }

    public final PointF translate(PointF pointF) {
        if (pointF == null) {
            return null;
        }
        pointF.set(translateX(pointF.x), translateY(pointF.y));
        return pointF;
    }

    public final PointF translate(float[] fArr) {
        Intrinsics.checkParameterIsNotNull(fArr, "arr");
        return translate(new PointF(fArr[0], fArr[1]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.vc.meeting.module.sketch.dto.Coord> */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<Coord> translateCoords(List<? extends Coord> list) {
        Intrinsics.checkParameterIsNotNull(list, "coordList");
        if (CollectionUtils.isEmpty(list)) {
            return list;
        }
        for (Coord coord : list) {
            translate(coord);
        }
        return list;
    }

    public final float translateDimension(float f) {
        float f2;
        int i;
        if (this.scaleByX) {
            f2 = f * this.viewWidth * this.axisScale;
            i = getSketchRange().mo210163b();
        } else {
            f2 = f * this.viewHeight * this.axisScale;
            i = getSketchRange().mo210165c();
        }
        return f2 / ((float) i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends android.graphics.PointF> */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<PointF> translatePoints(List<? extends PointF> list) {
        Intrinsics.checkParameterIsNotNull(list, "pointList");
        if (CollectionUtils.isEmpty(list)) {
            return list;
        }
        for (PointF pointF : list) {
            translate(pointF);
        }
        return list;
    }

    public final float translateX(float f) {
        float f2 = this.viewWidth * this.axisScale;
        return (((((f / ((float) getSketchRange().mo210163b())) * getOriginContentBoundary().width()) + getOriginContentBoundary().left) / this.viewWidth) * f2) - (f2 / ((float) 2));
    }

    public final float translateY(float f) {
        float f2 = this.viewHeight * this.axisScale;
        return (f2 / ((float) 2)) - (((((f / ((float) getSketchRange().mo210165c())) * getOriginContentBoundary().height()) + getOriginContentBoundary().top) / this.viewHeight) * f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GLRenderModel(AbsSketchControl absSketchControl) {
        super(absSketchControl);
        Intrinsics.checkParameterIsNotNull(absSketchControl, "sketchControl");
        setRemoteReceiver(new SketchRemoteReceiver(this));
        setCurrentColor(C60773o.m236126d(R.color.ud_R500));
        Matrix.orthoM(this.initMaritx, 0, -1.0f, 1.0f, -1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    public final Coord pcPoint2LocalPosition(Coord coord) {
        Intrinsics.checkParameterIsNotNull(coord, "pcPoint");
        return new Coord(((coord.f159003x / ((float) getSketchRange().mo210163b())) * getContentBoundary().width()) + getContentBoundary().left, ((coord.f159004y / ((float) getSketchRange().mo210165c())) * getContentBoundary().height()) + getContentBoundary().top);
    }

    public final Coord translate(Coord coord) {
        if (coord == null) {
            return null;
        }
        coord.f159003x = translateX(coord.f159003x);
        coord.f159004y = translateY(coord.f159004y);
        return coord;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void updateDynamicArrow(ArrowDrawableData arrowDrawableData) {
        Intrinsics.checkParameterIsNotNull(arrowDrawableData, "arrowDrawableData");
        synchronized (this) {
            if (getDynamicData().get("arrow_dynamic") == null) {
                getDynamicData().put("arrow_dynamic", new ArrowAssembler(this, arrowDrawableData));
                Unit unit = Unit.INSTANCE;
            } else {
                AbstractShapeRender abstractShapeRender = getDynamicData().get("arrow_dynamic");
                if (!(abstractShapeRender instanceof ArrowAssembler)) {
                    abstractShapeRender = null;
                }
                ArrowAssembler arrowAssembler = (ArrowAssembler) abstractShapeRender;
                if (arrowAssembler != null) {
                    arrowAssembler.end(arrowDrawableData.end[0], arrowDrawableData.end[1]);
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
                getDynamicData().put(str, new PencilAssembler(this, pencilDrawableData));
                Unit unit = Unit.INSTANCE;
            } else {
                AbstractShapeRender abstractShapeRender = getDynamicData().get(pencilDrawableData.id);
                if (!(abstractShapeRender instanceof PencilAssembler)) {
                    abstractShapeRender = null;
                }
                PencilAssembler pencilAssembler = (PencilAssembler) abstractShapeRender;
                if (pencilAssembler != null) {
                    pencilAssembler.update(pencilDrawableData);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }

    private final void processOperation(Operation operation) {
        Operation.Command command = operation.command;
        if (command != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[command.ordinal()];
            if (i == 1) {
                Matrix.orthoM(this.initMaritx, 0, -operation.position.x, operation.position.x, -operation.position.y, operation.position.y, -1.0f, 1.0f);
                float[] fArr = this.initMaritx;
                System.arraycopy(fArr, 0, this.currentMatrix, 0, fArr.length);
                this.viewWidth = operation.color[0];
                this.viewHeight = operation.color[1];
                if (operation.position.x < operation.position.y) {
                    this.axisScale = (operation.position.x * ((float) 2)) / this.viewWidth;
                    this.scaleByX = true;
                } else {
                    this.axisScale = (operation.position.y * ((float) 2)) / this.viewHeight;
                    this.scaleByX = false;
                }
                this.lineBorderWidth = this.axisScale * 2.0f;
                this.viewportChanged = true;
                C60700b.m235851b("[Sketch] [GLRenderModel]", "[processOperation]", "[width]" + this.viewWidth + "  [height]" + this.viewHeight + "  border width: " + this.lineBorderWidth);
            } else if (i == 2) {
                float f = operation.position.x;
                this.currentScale = f;
                this.currentTranslate.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                Matrix.scaleM(this.currentMatrix, 0, this.initMaritx, 0, f, f, f);
                C60700b.m235851b("[Sketch] [GLRenderModel]", "[processOperation2]", "scale: " + f);
            } else if (i == 3) {
                this.currentTranslate.set(operation.position);
                this.currentScale = 1.0f;
                Matrix.translateM(this.currentMatrix, 0, this.initMaritx, 0, this.currentTranslate.x, this.currentTranslate.y, BitmapDescriptorFactory.HUE_RED);
                C60700b.m235851b("[Sketch] [GLRenderModel]", "[processOperation3]", "translate: [x]" + operation.position.x + "  [y]" + operation.position.y);
            }
        }
        this.recycleOperations.offer(operation);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void addMark(String str, IMarkRender iMarkRender) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(iMarkRender, "mark");
        if (iMarkRender instanceof GLMark) {
            synchronized (this.markers) {
                this.markers.put(str, iMarkRender);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void updateStaticArrow(ArrowDrawableData arrowDrawableData, boolean z) {
        Intrinsics.checkParameterIsNotNull(arrowDrawableData, "arrowDrawableData");
        String str = arrowDrawableData.id;
        Intrinsics.checkExpressionValueIsNotNull(str, "arrowDrawableData.id");
        updateStatic(str, new ArrowAssembler(this, arrowDrawableData), z);
    }

    public final void updateMark(String str, Coord coord) {
        GLMark update;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(coord, "position");
        synchronized (this.markers) {
            GLMark gLMark = this.markers.get(str);
            if (!(gLMark == null || (update = gLMark.update(coord)) == null)) {
                update.expiresAfter(3000L);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel
    public void updateStaticPencil(PencilDrawableData pencilDrawableData, boolean z) {
        Intrinsics.checkParameterIsNotNull(pencilDrawableData, "pencilDrawableData");
        synchronized (this) {
            AbstractShapeRender abstractShapeRender = null;
            if (getStaticData().containsKey(pencilDrawableData.id)) {
                AbstractShapeRender abstractShapeRender2 = getStaticData().get(pencilDrawableData.id);
                if (abstractShapeRender2 instanceof PencilAssembler) {
                    abstractShapeRender = abstractShapeRender2;
                }
                PencilAssembler pencilAssembler = (PencilAssembler) abstractShapeRender;
                if (pencilAssembler != null) {
                    pencilAssembler.update(pencilDrawableData);
                }
                setStaticChanged(true);
                Unit unit = Unit.INSTANCE;
            } else if (getPendingStaticData().containsKey(pencilDrawableData.id)) {
                AbstractShapeRender abstractShapeRender3 = getPendingStaticData().get(pencilDrawableData.id);
                if (abstractShapeRender3 instanceof PencilAssembler) {
                    abstractShapeRender = abstractShapeRender3;
                }
                PencilAssembler pencilAssembler2 = (PencilAssembler) abstractShapeRender;
                if (pencilAssembler2 != null) {
                    pencilAssembler2.update(pencilDrawableData);
                    Unit unit2 = Unit.INSTANCE;
                }
            } else {
                String str = pencilDrawableData.id;
                Intrinsics.checkExpressionValueIsNotNull(str, "pencilDrawableData.id");
                getPendingStaticData().put(str, new PencilAssembler(this, pencilDrawableData));
                Unit unit3 = Unit.INSTANCE;
            }
        }
        if (z) {
            String str2 = pencilDrawableData.id;
            Intrinsics.checkExpressionValueIsNotNull(str2, "pencilDrawableData.id");
            onSelfShapeAdded(str2);
        }
    }

    public final void changeAxis(PointF pointF, float f, float f2) {
        Intrinsics.checkParameterIsNotNull(pointF, "axis");
        Operation obtain = obtain();
        obtain.command = Operation.Command.CHANGE_AXIS;
        obtain.position.set(pointF);
        obtain.color[0] = f;
        obtain.color[1] = f2;
        appendOperation(obtain);
    }
}
