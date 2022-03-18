package com.ss.android.vc.meeting.module.sketch.render.gl.shape;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.module.sketch.render.gl.mm.GLMemoryManager;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;

public class RoundAssembler extends BaseAssembler {
    private static final float[] FAKE_CTRLS = {1301.0f, 1301.0f, 1301.0f, 1301.0f};
    private static final float[] POINT_IDS;
    private boolean changed = true;
    public float[] position = new float[4];
    public float[] translatedPosition = new float[4];

    @Override // com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender
    public String getId() {
        return "round";
    }

    static {
        float[] fArr = new float[8];
        POINT_IDS = fArr;
        fArr[0] = 0.0f;
        for (int i = 1; i < 8; i++) {
            float[] fArr2 = POINT_IDS;
            fArr2[i] = fArr2[i - 1] + 0.16666667f;
        }
    }

    private void translatePosition() {
        this.translatedPosition[0] = this.model.translateX(this.position[0]);
        this.translatedPosition[1] = this.model.translateY(this.position[1]);
        this.translatedPosition[2] = this.model.translateX(this.position[2]);
        this.translatedPosition[3] = this.model.translateY(this.position[3]);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public int dumpTriangles(GLMemoryManager gLMemoryManager) {
        translatePosition();
        int vertexCount = gLMemoryManager.vertexCount();
        for (int i = 0; i <= 8; i++) {
            gLMemoryManager.putVertexData(this.translatedPosition);
            gLMemoryManager.putVertexData(this.color);
            gLMemoryManager.putVertexData(BitmapDescriptorFactory.HUE_RED);
            if (i == 0) {
                gLMemoryManager.putVertexData(-1.0f);
            } else {
                gLMemoryManager.putVertexData(POINT_IDS[i - 1]);
            }
            gLMemoryManager.putVertexData(getZ());
            gLMemoryManager.putVertexData(FAKE_CTRLS);
        }
        for (int i2 = 0; i2 < 8; i2++) {
            gLMemoryManager.putIndexData(vertexCount);
            int i3 = vertexCount + i2;
            gLMemoryManager.putIndexData(i3 + 1);
            if (i2 == 7) {
                gLMemoryManager.putIndexData(vertexCount + 1);
            } else {
                gLMemoryManager.putIndexData(i3 + 2);
            }
        }
        return 9;
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

    public RoundAssembler(GLRenderModel gLRenderModel, float[] fArr, float f) {
        super(gLRenderModel, fArr, f);
    }
}
