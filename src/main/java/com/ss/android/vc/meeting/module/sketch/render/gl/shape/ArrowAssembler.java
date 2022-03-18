package com.ss.android.vc.meeting.module.sketch.render.gl.shape;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.sketch.dto.arrow.ArrowDrawableData;
import com.ss.android.vc.meeting.module.sketch.render.gl.mm.GLMemoryManager;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;
import com.ss.android.vc.meeting.module.sketch.render.gl.util.VertexUtils;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;

public class ArrowAssembler extends BaseAssembler {
    private static final float[] FAKE_CTRLS = {1201.0f, 1201.0f, 1201.0f, 16.1f};
    private static final float[] POINT_IDS;
    private boolean changed = true;
    public ArrowDrawableData data;
    public float[] position = new float[4];
    public float[] translatedPosition = new float[4];
    public float width = 21.0f;

    @Override // com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender
    public String getId() {
        return this.data.id;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public boolean valid() {
        if (!super.valid() || length() <= this.width) {
            return false;
        }
        return true;
    }

    private void translatePosition() {
        this.translatedPosition[0] = this.model.translateX(this.position[0]);
        this.translatedPosition[1] = this.model.translateY(this.position[1]);
        this.translatedPosition[2] = this.model.translateX(this.position[2]);
        this.translatedPosition[3] = this.model.translateY(this.position[3]);
    }

    static {
        float[] fArr = new float[24];
        POINT_IDS = fArr;
        fArr[0] = -1.0f;
        for (int i = 1; i <= 16; i++) {
            POINT_IDS[i] = ((float) i) * 0.0625f;
        }
        for (int i2 = 17; i2 < 24; i2++) {
            POINT_IDS[i2] = ((float) i2) + 0.5f;
        }
        C60700b.m235851b("[Sketch] [ArrowAssembler]", "[init]", "pointers: " + VertexUtils.floatArr2Str(POINT_IDS));
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public int dumpTriangles(GLMemoryManager gLMemoryManager) {
        int vertexCount = gLMemoryManager.vertexCount();
        translatePosition();
        float translateDimension = this.model.translateDimension(this.width);
        for (int i = 0; i < 24; i++) {
            gLMemoryManager.putVertexData(this.translatedPosition);
            gLMemoryManager.putVertexData(this.color);
            gLMemoryManager.putVertexData(translateDimension);
            gLMemoryManager.putVertexData(POINT_IDS[i]);
            gLMemoryManager.putVertexData(getZ());
            gLMemoryManager.putVertexData(FAKE_CTRLS);
        }
        for (int i2 = 0; i2 < 16; i2++) {
            gLMemoryManager.putIndexData(vertexCount);
            int i3 = vertexCount + i2;
            gLMemoryManager.putIndexData(i3 + 1);
            if (i2 == 15) {
                gLMemoryManager.putIndexData(vertexCount + 1);
            } else {
                gLMemoryManager.putIndexData(i3 + 2);
            }
        }
        int i4 = vertexCount + 17;
        gLMemoryManager.putIndexData(i4);
        int i5 = i4 + 1;
        gLMemoryManager.putIndexData(i5);
        int i6 = i4 + 2;
        gLMemoryManager.putIndexData(i6);
        gLMemoryManager.putIndexData(i5);
        gLMemoryManager.putIndexData(i6);
        gLMemoryManager.putIndexData(i4 + 3);
        gLMemoryManager.putIndexData(i4 + 4);
        gLMemoryManager.putIndexData(i4 + 5);
        gLMemoryManager.putIndexData(i4 + 6);
        return 24;
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

    public ArrowAssembler(GLRenderModel gLRenderModel, ArrowDrawableData arrowDrawableData) {
        super(gLRenderModel, SketchUtilKt.rgba2FloatArray(arrowDrawableData.style.color));
        this.data = arrowDrawableData;
        this.width = arrowDrawableData.style.size * 7.0f;
        start(this.data.origin[0], this.data.origin[1]);
        end(this.data.end[0], this.data.end[1]);
    }
}
