package com.ss.android.vc.meeting.module.sketch.render.gl.shape;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.sketch.Sketch;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.comet.CometDrawableData;
import com.ss.android.vc.meeting.module.sketch.render.ICometRender;
import com.ss.android.vc.meeting.module.sketch.render.gl.mm.GLMemoryManager;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;
import com.ss.android.vc.meeting.module.sketch.render.gl.util.GLUtils;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0006\u0010\u001c\u001a\u00020\u001aJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001eH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\""}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/gl/shape/CometAssembler;", "Lcom/ss/android/vc/meeting/module/sketch/render/gl/shape/BaseAssembler;", "Lcom/ss/android/vc/meeting/module/sketch/render/ICometRender;", "shapeId", "", "model", "Lcom/ss/android/vc/meeting/module/sketch/render/gl/model/GLRenderModel;", C60375c.f150914a, "", "(Ljava/lang/String;Lcom/ss/android/vc/meeting/module/sketch/render/gl/model/GLRenderModel;J)V", "mFinished", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mPaused", "mPausedData", "Lcom/ss/android/vc/meeting/module/sketch/dto/comet/CometDrawableData;", "getShapeId", "()Ljava/lang/String;", "setShapeId", "(Ljava/lang/String;)V", "dump", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "memoryManager", "Lcom/ss/android/vc/meeting/module/sketch/render/gl/mm/GLMemoryManager;", "dumpTriangles", "finish", "", "getId", "pause", "paused", "", "resume", "valid", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CometAssembler extends BaseAssembler implements ICometRender {
    public static final Companion Companion = new Companion(null);
    private AtomicBoolean mFinished = new AtomicBoolean(false);
    private AtomicBoolean mPaused = new AtomicBoolean(false);
    private CometDrawableData mPausedData;
    private String shapeId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/gl/shape/CometAssembler$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender
    public String getId() {
        return this.shapeId;
    }

    public final String getShapeId() {
        return this.shapeId;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.ICometRender
    public void finish() {
        this.mFinished.set(true);
    }

    public final void pause() {
        this.mPaused.set(true);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.ICometRender
    public boolean paused() {
        return this.mPaused.get();
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.ICometRender
    public void resume() {
        this.mPaused.set(false);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public boolean valid() {
        return !this.mFinished.get();
    }

    public final void setShapeId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.shapeId = str;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public int dumpTriangles(GLMemoryManager gLMemoryManager) {
        Intrinsics.checkParameterIsNotNull(gLMemoryManager, "memoryManager");
        if (this.mFinished.get()) {
            if (GLUtils.debugGL()) {
                C60700b.m235851b("[Sketch] [CometAssembler]", "[dumpTriangles]", "finished, skip dump");
            }
            return -1;
        }
        if (this.mPaused.get()) {
            if (GLUtils.debugGL()) {
                C60700b.m235851b("[Sketch] [CometAssembler]", "[dumpTriangles2]", "paused");
            }
            CometDrawableData cometDrawableData = this.mPausedData;
            if (cometDrawableData != null) {
                return dump(cometDrawableData, gLMemoryManager);
            }
        }
        CometDrawableData cometGetRemoteSnippet = Sketch.cometGetRemoteSnippet(this.model.getSketchControl().getSketchInstanceId());
        if (cometGetRemoteSnippet == null) {
            C60700b.m235861e("[Sketch] [CometAssembler]", "[dumpTriangles3]", "[cometGetRemoteSnippet] get null");
            return 0;
        } else if (cometGetRemoteSnippet.exit) {
            C60700b.m235843a("[Sketch] [CometAssembler]", "[dumpTriangles4]", "[draw] comet paused");
            finish();
            return -1;
        } else {
            if (cometGetRemoteSnippet.pause) {
                pause();
                this.mPausedData = cometGetRemoteSnippet;
            }
            return dump(cometGetRemoteSnippet, gLMemoryManager);
        }
    }

    private final int dump(CometDrawableData cometDrawableData, GLMemoryManager gLMemoryManager) {
        boolean z;
        int i = 0;
        if (!(cometDrawableData.points == null || cometDrawableData.radii == null)) {
            float[] fArr = cometDrawableData.points;
            Intrinsics.checkExpressionValueIsNotNull(fArr, "data.points");
            boolean z2 = true;
            if (fArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                float[] fArr2 = cometDrawableData.radii;
                Intrinsics.checkExpressionValueIsNotNull(fArr2, "data.radii");
                if (fArr2.length != 0) {
                    z2 = false;
                }
                if (!z2) {
                    float[] fArr3 = cometDrawableData.points;
                    Intrinsics.checkExpressionValueIsNotNull(fArr3, "data.points");
                    List<Coord> unflatCoords = SketchUtilKt.unflatCoords(fArr3);
                    ArrayList arrayList = new ArrayList(unflatCoords.size());
                    int size = unflatCoords.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        float f = cometDrawableData.radii[size];
                        float[] rgba2FloatArray = SketchUtilKt.rgba2FloatArray(cometDrawableData.style.color);
                        rgba2FloatArray[3] = (float) Math.pow(((double) cometDrawableData.radii[size]) / ((double) cometDrawableData.style.size), (double) 2);
                        Coord coord = unflatCoords.get(size);
                        RoundAssembler roundAssembler = new RoundAssembler(this.model, rgba2FloatArray, getZ());
                        roundAssembler.start(coord.f159003x - f, coord.f159004y - f);
                        roundAssembler.end(coord.f159003x + f, coord.f159004y + f);
                        arrayList.add(roundAssembler);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        i += ((RoundAssembler) it.next()).dumpTriangles(gLMemoryManager);
                    }
                    return i;
                }
            }
        }
        C60700b.m235861e("[Sketch] [CometAssembler]", "[dump]", "[drawInternal] data error");
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CometAssembler(String str, GLRenderModel gLRenderModel, long j) {
        super(gLRenderModel, SketchUtilKt.rgba2FloatArray(j), BitmapDescriptorFactory.HUE_RED);
        Intrinsics.checkParameterIsNotNull(str, "shapeId");
        Intrinsics.checkParameterIsNotNull(gLRenderModel, "model");
        this.shapeId = str;
    }
}
