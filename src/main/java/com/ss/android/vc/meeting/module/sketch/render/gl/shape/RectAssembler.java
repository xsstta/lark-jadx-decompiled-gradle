package com.ss.android.vc.meeting.module.sketch.render.gl.shape;

import android.graphics.PointF;
import com.ss.android.vc.meeting.module.sketch.dto.rect.RectangleDrawableData;
import com.ss.android.vc.meeting.module.sketch.render.gl.mm.GLMemoryManager;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;

public class RectAssembler extends BaseAssembler {
    private String id;
    public LineAssembler[] lineAssemblers = new LineAssembler[4];
    public float width = 0.01f;

    @Override // com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender
    public String getId() {
        return this.id;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public boolean valid() {
        return super.valid();
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public int dumpTriangles(GLMemoryManager gLMemoryManager) {
        int i = 0;
        int i2 = 0;
        while (true) {
            LineAssembler[] lineAssemblerArr = this.lineAssemblers;
            if (i >= lineAssemblerArr.length) {
                return i2;
            }
            LineAssembler lineAssembler = lineAssemblerArr[i];
            if (lineAssembler != null) {
                i2 += lineAssembler.dumpTriangles(gLMemoryManager);
            }
            i++;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public void end(float f, float f2) {
        super.end(f, f2);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public void move(float f, float f2) {
        super.move(f, f2);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public void start(float f, float f2) {
        super.start(f, f2);
    }

    public RectAssembler(GLRenderModel gLRenderModel, RectangleDrawableData rectangleDrawableData) {
        super(gLRenderModel, SketchUtilKt.rgba2FloatArray(rectangleDrawableData.style.color));
        this.id = rectangleDrawableData.id;
        PointF pointF = new PointF(rectangleDrawableData.leftTop[0], rectangleDrawableData.leftTop[1]);
        PointF pointF2 = new PointF(rectangleDrawableData.rightBottom[0], rectangleDrawableData.rightBottom[1]);
        PointF pointF3 = new PointF(Math.min(pointF.x, pointF2.x), Math.min(pointF.y, pointF2.y));
        PointF pointF4 = new PointF(Math.max(pointF.x, pointF2.y), Math.max(pointF.y, pointF2.y));
        start(pointF3.x, pointF3.y);
        end(pointF4.x, pointF4.y);
        float z = getZ();
        this.lineAssemblers[0] = new LineAssembler(gLRenderModel, SketchUtilKt.rgba2FloatArray(rectangleDrawableData.style.color), pointF, new PointF(pointF2.x, pointF.y), rectangleDrawableData.style.size, z, new PointF((pointF2.x + pointF.x) / 2.0f, pointF.y + ((pointF2.x - pointF.x) / 2.0f)));
        this.lineAssemblers[1] = new LineAssembler(gLRenderModel, SketchUtilKt.rgba2FloatArray(rectangleDrawableData.style.color), new PointF(pointF2.x, pointF.y), pointF2, rectangleDrawableData.style.size, z, new PointF(pointF2.x - ((pointF2.y - pointF.y) / 2.0f), (pointF.y + pointF2.y) / 2.0f));
        this.lineAssemblers[2] = new LineAssembler(gLRenderModel, SketchUtilKt.rgba2FloatArray(rectangleDrawableData.style.color), pointF2, new PointF(pointF.x, pointF2.y), rectangleDrawableData.style.size, z, new PointF((pointF2.x + pointF.x) / 2.0f, pointF2.y - ((pointF2.x - pointF.x) / 2.0f)));
        this.lineAssemblers[3] = new LineAssembler(gLRenderModel, SketchUtilKt.rgba2FloatArray(rectangleDrawableData.style.color), new PointF(pointF.x, pointF2.y), pointF, rectangleDrawableData.style.size, z, new PointF(pointF.x + ((pointF2.y - pointF.y) / 2.0f), (pointF.y + pointF2.y) / 2.0f));
    }
}
