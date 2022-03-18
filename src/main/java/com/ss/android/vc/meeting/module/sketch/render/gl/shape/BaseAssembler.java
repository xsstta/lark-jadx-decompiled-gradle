package com.ss.android.vc.meeting.module.sketch.render.gl.shape;

import android.graphics.PointF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender;
import com.ss.android.vc.meeting.module.sketch.render.gl.mm.GLMemoryManager;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;

public abstract class BaseAssembler extends AbstractShapeRender {
    private static int sCurrentShapeCount = 1;
    public float[] color;
    private boolean generateZ;
    private PointF mEndPoint;
    private boolean mFinished;
    private boolean mMoved;
    private PointF mStartPoint;
    private boolean mStarted;
    protected GLRenderModel model;
    public int order;

    /* renamed from: z */
    private float f159006z;

    public int dumpTriangles(GLMemoryManager gLMemoryManager) {
        return 0;
    }

    public boolean valid() {
        if (!this.mStarted || (!this.mMoved && !this.mFinished)) {
            return false;
        }
        return true;
    }

    public float getZ() {
        if (!this.generateZ) {
            return this.f159006z;
        }
        return 1.0f - (((float) this.order) / 1000.0f);
    }

    public float length() {
        return PointF.length(this.mStartPoint.x - this.mEndPoint.x, this.mStartPoint.y - this.mEndPoint.y);
    }

    public void end(float f, float f2) {
        this.mFinished = true;
        this.mEndPoint.set(f, f2);
    }

    public void move(float f, float f2) {
        this.mMoved = true;
        this.mEndPoint.set(f, f2);
    }

    public void start(float f, float f2) {
        this.mStarted = true;
        this.mStartPoint.set(f, f2);
    }

    public BaseAssembler(GLRenderModel gLRenderModel, float[] fArr) {
        this.color = new float[4];
        this.mStartPoint = new PointF();
        this.mEndPoint = new PointF();
        this.generateZ = true;
        this.f159006z = BitmapDescriptorFactory.HUE_RED;
        this.model = gLRenderModel;
        if (fArr != null && fArr.length > 0) {
            float[] fArr2 = this.color;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        }
        synchronized (BaseAssembler.class) {
            int i = sCurrentShapeCount;
            this.order = i;
            sCurrentShapeCount = i + 1;
        }
    }

    public BaseAssembler(GLRenderModel gLRenderModel, float[] fArr, float f) {
        this.color = new float[4];
        this.mStartPoint = new PointF();
        this.mEndPoint = new PointF();
        this.generateZ = true;
        this.f159006z = BitmapDescriptorFactory.HUE_RED;
        this.model = gLRenderModel;
        if (fArr != null && fArr.length > 0) {
            float[] fArr2 = this.color;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        }
        this.generateZ = false;
    }

    public void setColor(float f, float f2, float f3, float f4) {
        float[] fArr = this.color;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }
}
