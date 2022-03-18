package com.ss.android.vc.meeting.module.sketch.render.gl.shape;

import com.huawei.hms.location.LocationRequest;
import com.ss.android.vc.meeting.module.sketch.dto.oval.OvalDrawableData;
import com.ss.android.vc.meeting.module.sketch.render.gl.mm.GLMemoryManager;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;

public class OvalAssembler extends BaseAssembler {
    private static final float[] FAKE_CTRLS = {1101.0f, 1101.0f, 1101.0f, 1101.0f};
    private static final float[] FAKE_CTRLS2 = {1101.0f, -1101.0f, 1101.0f, 1101.0f};
    private static final float[] POINT_IDS;
    private boolean changed = true;
    private String id;
    public float[] position = new float[4];
    public float[] translatedPosition = new float[4];
    public float width;

    @Override // com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender
    public String getId() {
        return this.id;
    }

    private void translatePosition() {
        this.translatedPosition[0] = this.model.translateX(this.position[0]);
        this.translatedPosition[1] = this.model.translateY(this.position[1]);
        this.translatedPosition[2] = this.model.translateX(this.position[2]);
        this.translatedPosition[3] = this.model.translateY(this.position[3]);
    }

    static {
        float[] fArr = new float[100];
        POINT_IDS = fArr;
        fArr[0] = 0.0f;
        for (int i = 1; i < 100; i++) {
            float[] fArr2 = POINT_IDS;
            fArr2[i] = fArr2[i - 1] + 0.010204081f;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public int dumpTriangles(GLMemoryManager gLMemoryManager) {
        translatePosition();
        float translateDimension = this.model.translateDimension(this.width);
        int vertexCount = gLMemoryManager.vertexCount();
        for (int i = 0; i < 100; i++) {
            gLMemoryManager.putVertexData(this.translatedPosition);
            gLMemoryManager.putVertexData(this.color);
            gLMemoryManager.putVertexData(translateDimension);
            float[] fArr = POINT_IDS;
            gLMemoryManager.putVertexData(fArr[i]);
            gLMemoryManager.putVertexData(getZ());
            gLMemoryManager.putVertexData(FAKE_CTRLS);
            gLMemoryManager.putVertexData(this.translatedPosition);
            gLMemoryManager.putVertexData(this.color);
            gLMemoryManager.putVertexData(translateDimension);
            gLMemoryManager.putVertexData(fArr[i]);
            gLMemoryManager.putVertexData(getZ());
            gLMemoryManager.putVertexData(FAKE_CTRLS2);
            if (i != 0) {
                int i2 = ((i - 1) * 2) + vertexCount;
                gLMemoryManager.putIndexData(i2);
                int i3 = i2 + 1;
                gLMemoryManager.putIndexData(i3);
                int i4 = i2 + 2;
                gLMemoryManager.putIndexData(i4);
                gLMemoryManager.putIndexData(i3);
                gLMemoryManager.putIndexData(i4);
                gLMemoryManager.putIndexData(i2 + 3);
            }
        }
        return LocationRequest.PRIORITY_HD_ACCURACY;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public void end(float f, float f2) {
        super.end(f, f2);
        float[] fArr = this.position;
        fArr[2] = f;
        fArr[3] = f2;
        this.changed = true;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public void move(float f, float f2) {
        super.move(f, f2);
        float[] fArr = this.position;
        fArr[2] = f;
        fArr[3] = f2;
        this.changed = true;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public void start(float f, float f2) {
        super.start(f, f2);
        float[] fArr = this.position;
        fArr[0] = f;
        fArr[1] = f2;
    }

    public OvalAssembler(GLRenderModel gLRenderModel, OvalDrawableData ovalDrawableData) {
        super(gLRenderModel, SketchUtilKt.rgba2FloatArray(ovalDrawableData.style.color));
        this.id = ovalDrawableData.id;
        this.width = ovalDrawableData.style.size;
        start(ovalDrawableData.getStartPoint().x, ovalDrawableData.getStartPoint().y);
        end(ovalDrawableData.getEndPoint().x, ovalDrawableData.getEndPoint().y);
    }
}
