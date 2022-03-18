package com.ss.android.vc.meeting.module.sketch.render.gl.shape;

import android.graphics.PointF;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilDrawableData;
import com.ss.android.vc.meeting.module.sketch.render.gl.mm.GLMemoryManager;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PencilAssembler extends BaseAssembler {
    private static float[] sBzTValArray = new float[10];
    public PencilDrawableData data;
    public float lineWidth;
    public List<BezierVertex> mBezierVertexes = new ArrayList();
    private volatile boolean mBeziersNeedUpdate = true;
    private GLMark mBindMarker;
    private List<CubicBezier> mCubicBeziers = new LinkedList();
    private long mMarkerExpireDelay;
    public List<Coord> points;
    public float[] translatedCtrls;
    public float[] translatedPositions;

    public static class BezierVertex {
        public float[] ctrl = new float[4];
        public float[] position = new float[4];

        /* renamed from: t */
        public float f159007t;
    }

    public PencilAssembler unbind() {
        this.mBindMarker = null;
        return this;
    }

    public GLMark bind() {
        return this.mBindMarker;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender
    public String getId() {
        return this.data.id;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public boolean valid() {
        if (this.points.size() > 3) {
            return true;
        }
        return false;
    }

    static {
        for (int i = 1; i < 10; i++) {
            sBzTValArray[i] = (((float) i) * 1.0f) / 9.0f;
        }
    }

    public List<CubicBezier> calcBezierLines() {
        this.mCubicBeziers.clear();
        if (this.points.size() < 4) {
            return this.mCubicBeziers;
        }
        for (int i = 1; i < this.points.size() - 2; i += 3) {
            PointF point = this.points.get(i - 1).toPoint();
            PointF point2 = this.points.get(i).toPoint();
            PointF point3 = this.points.get(i + 1).toPoint();
            this.mCubicBeziers.add(new CubicBezier(point, this.points.get(i + 2).toPoint(), point2, point3));
        }
        return this.mCubicBeziers;
    }

    public List<BezierVertex> dump2VertexList() {
        if (!this.mBeziersNeedUpdate) {
            return this.mBezierVertexes;
        }
        this.mBezierVertexes.clear();
        calcBezierLines();
        for (int i = 0; i < this.mCubicBeziers.size(); i++) {
            CubicBezier cubicBezier = this.mCubicBeziers.get(i);
            for (int i2 = 0; i2 < 10; i2++) {
                BezierVertex bezierVertex = new BezierVertex();
                bezierVertex.f159007t = sBzTValArray[i2];
                System.arraycopy(cubicBezier.pos, 0, bezierVertex.position, 0, 4);
                System.arraycopy(cubicBezier.ctrl, 0, bezierVertex.ctrl, 0, 4);
                this.mBezierVertexes.add(bezierVertex);
            }
        }
        this.mBeziersNeedUpdate = false;
        return this.mBezierVertexes;
    }

    public void reset(PencilDrawableData pencilDrawableData) {
        List<Coord> unflatCoords = SketchUtilKt.unflatCoords(pencilDrawableData.points);
        this.points.clear();
        if (!CollectionUtils.isEmpty(unflatCoords)) {
            this.points.addAll(unflatCoords);
            if (this.mBindMarker != null) {
                this.model.updateMark(this.mBindMarker.getData().id, unflatCoords.get(unflatCoords.size() - 1));
            }
        }
        this.mBeziersNeedUpdate = true;
    }

    public void update(PencilDrawableData pencilDrawableData) {
        List<Coord> unflatCoords = SketchUtilKt.unflatCoords(pencilDrawableData.points);
        if (!CollectionUtils.isEmpty(unflatCoords)) {
            this.points.addAll(unflatCoords);
            if (this.mBindMarker != null) {
                this.model.updateMark(this.mBindMarker.getData().id, unflatCoords.get(unflatCoords.size() - 1));
            }
        }
        this.mBeziersNeedUpdate = true;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public int dumpTriangles(GLMemoryManager gLMemoryManager) {
        if (!valid()) {
            return 0;
        }
        int vertexCount = gLMemoryManager.vertexCount();
        List<BezierVertex> dump2VertexList = dump2VertexList();
        int i = 0;
        for (int i2 = 0; i2 < dump2VertexList.size(); i2++) {
            BezierVertex bezierVertex = dump2VertexList.get(i2);
            translatePosition(bezierVertex.position, this.translatedPositions);
            translatePosition(bezierVertex.ctrl, this.translatedCtrls);
            float translateDimension = this.model.translateDimension(this.lineWidth);
            gLMemoryManager.putVertexData(this.translatedPositions);
            gLMemoryManager.putVertexData(this.color);
            gLMemoryManager.putVertexData(translateDimension);
            gLMemoryManager.putVertexData(bezierVertex.f159007t);
            gLMemoryManager.putVertexData(getZ());
            gLMemoryManager.putVertexData(this.translatedCtrls);
            gLMemoryManager.putVertexData(this.translatedPositions);
            gLMemoryManager.putVertexData(this.color);
            gLMemoryManager.putVertexData(-translateDimension);
            gLMemoryManager.putVertexData(bezierVertex.f159007t);
            gLMemoryManager.putVertexData(getZ());
            gLMemoryManager.putVertexData(this.translatedCtrls);
            i += 2;
            if (i2 != 0) {
                int i3 = ((i2 - 1) * 2) + vertexCount;
                gLMemoryManager.putIndexData(i3);
                int i4 = i3 + 1;
                gLMemoryManager.putIndexData(i4);
                int i5 = i3 + 2;
                gLMemoryManager.putIndexData(i5);
                gLMemoryManager.putIndexData(i4);
                gLMemoryManager.putIndexData(i5);
                gLMemoryManager.putIndexData(i3 + 3);
            }
        }
        return i;
    }

    public PencilAssembler bind(GLMark gLMark, long j) {
        this.mBindMarker = gLMark;
        this.mMarkerExpireDelay = j;
        return this;
    }

    private void translatePosition(float[] fArr, float[] fArr2) {
        fArr2[0] = this.model.translateX(fArr[0]);
        fArr2[1] = this.model.translateY(fArr[1]);
        fArr2[2] = this.model.translateX(fArr[2]);
        fArr2[3] = this.model.translateY(fArr[3]);
    }

    public PencilAssembler(GLRenderModel gLRenderModel, PencilDrawableData pencilDrawableData) {
        super(gLRenderModel, SketchUtilKt.rgba2FloatArray(pencilDrawableData.style.color));
        ArrayList arrayList = new ArrayList();
        this.points = arrayList;
        this.translatedPositions = new float[4];
        this.translatedCtrls = new float[4];
        this.mMarkerExpireDelay = -1;
        this.data = pencilDrawableData;
        arrayList.addAll(SketchUtilKt.unflatCoords(pencilDrawableData.points));
        this.lineWidth = pencilDrawableData.style.size;
    }

    public static class CubicBezier {
        public float[] ctrl = new float[4];
        public float[] pos;

        public CubicBezier(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
            float[] fArr = new float[4];
            this.pos = fArr;
            fArr[0] = pointF.x;
            this.pos[1] = pointF.y;
            this.pos[2] = pointF2.x;
            this.pos[3] = pointF2.y;
            this.ctrl[0] = pointF3.x;
            this.ctrl[1] = pointF3.y;
            this.ctrl[2] = pointF4.x;
            this.ctrl[3] = pointF4.y;
        }
    }
}
