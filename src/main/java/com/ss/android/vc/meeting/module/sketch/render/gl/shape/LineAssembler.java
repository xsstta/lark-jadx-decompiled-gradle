package com.ss.android.vc.meeting.module.sketch.render.gl.shape;

import android.graphics.PointF;
import com.ss.android.vc.meeting.module.sketch.render.gl.mm.GLMemoryManager;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;

public class LineAssembler extends BaseAssembler {
    private static final float[] FAKE_CTRLS = {1001.0f, 1001.0f, 1001.0f, 1001.0f};
    private static final float[] POINT_IDS = {0.1f, 1.1f, 2.1f, 3.1f};
    public PointF direction;
    public float[] position = new float[4];
    public float[] translatedPosition = new float[4];
    public float width;

    @Override // com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender
    public String getId() {
        return "line";
    }

    private void translatePosition() {
        float[] fArr = FAKE_CTRLS;
        fArr[1] = this.model.translateX(this.direction.x);
        fArr[2] = this.model.translateY(this.direction.y);
        this.translatedPosition[0] = this.model.translateX(this.position[0]);
        this.translatedPosition[1] = this.model.translateY(this.position[1]);
        this.translatedPosition[2] = this.model.translateX(this.position[2]);
        this.translatedPosition[3] = this.model.translateY(this.position[3]);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public int dumpTriangles(GLMemoryManager gLMemoryManager) {
        if (!valid()) {
            return 0;
        }
        return dumpLine2TriangleData(gLMemoryManager);
    }

    private int dumpLine2TriangleData(GLMemoryManager gLMemoryManager) {
        translatePosition();
        int vertexCount = gLMemoryManager.vertexCount();
        float translateDimension = this.model.translateDimension(this.width);
        int i = 0;
        while (true) {
            float[] fArr = POINT_IDS;
            if (i < fArr.length) {
                gLMemoryManager.putVertexData(this.translatedPosition);
                gLMemoryManager.putVertexData(this.color);
                gLMemoryManager.putVertexData(translateDimension);
                gLMemoryManager.putVertexData(fArr[i]);
                gLMemoryManager.putVertexData(getZ());
                gLMemoryManager.putVertexData(FAKE_CTRLS);
                i++;
            } else {
                gLMemoryManager.putIndexData(vertexCount);
                int i2 = vertexCount + 1;
                gLMemoryManager.putIndexData(i2);
                int i3 = vertexCount + 2;
                gLMemoryManager.putIndexData(i3);
                gLMemoryManager.putIndexData(i2);
                gLMemoryManager.putIndexData(i3);
                gLMemoryManager.putIndexData(vertexCount + 3);
                return fArr.length;
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public void end(float f, float f2) {
        super.end(f, f2);
        float[] fArr = this.position;
        fArr[2] = f;
        fArr[3] = f2;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public void move(float f, float f2) {
        super.move(f, f2);
        float[] fArr = this.position;
        fArr[2] = f;
        fArr[3] = f2;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public void start(float f, float f2) {
        super.start(f, f2);
        float[] fArr = this.position;
        fArr[0] = f;
        fArr[1] = f2;
    }

    public LineAssembler(GLRenderModel gLRenderModel, float[] fArr, PointF pointF, PointF pointF2, float f, float f2, PointF pointF3) {
        super(gLRenderModel, fArr, f2);
        this.width = f;
        this.direction = pointF3;
        start(pointF.x, pointF.y);
        end(pointF2.x, pointF2.y);
    }
}
