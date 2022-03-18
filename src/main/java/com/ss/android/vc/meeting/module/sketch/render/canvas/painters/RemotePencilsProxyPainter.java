package com.ss.android.vc.meeting.module.sketch.render.canvas.painters;

import com.ss.android.vc.meeting.module.sketch.render.IRemotePencilsProxyRenderer;
import com.ss.android.vc.meeting.module.sketch.render.canvas.model.CanvasRenderModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bH\u0016J\u0016\u0010\u001f\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0!H\u0016R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006#"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/RemotePencilsProxyPainter;", "Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/BasePainter;", "Lcom/ss/android/vc/meeting/module/sketch/render/IRemotePencilsProxyRenderer;", "model", "Lcom/ss/android/vc/meeting/module/sketch/render/canvas/model/CanvasRenderModel;", "(Lcom/ss/android/vc/meeting/module/sketch/render/canvas/model/CanvasRenderModel;)V", "mFinishedPencils", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/PencilPainter;", "getMFinishedPencils", "()Ljava/util/concurrent/ConcurrentHashMap;", "setMFinishedPencils", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "mPencils", "getMPencils", "setMPencils", "getModel", "()Lcom/ss/android/vc/meeting/module/sketch/render/canvas/model/CanvasRenderModel;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "boundary", "Landroid/graphics/RectF;", "sketchRange", "Lcom/ss/android/vc/entity/sketch/SketchRange;", "getId", "removePencil", "", "id", "removePencilsNotInList", "ids", "", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class RemotePencilsProxyPainter extends BasePainter implements IRemotePencilsProxyRenderer {
    public static final Companion Companion = new Companion(null);
    private ConcurrentHashMap<String, PencilPainter> mFinishedPencils = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, PencilPainter> mPencils = new ConcurrentHashMap<>();
    private final CanvasRenderModel model;

    @Override // com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender
    public String getId() {
        return "RemotePencils";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/canvas/painters/RemotePencilsProxyPainter$Companion;", "", "()V", "ID", "", "TAG", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ConcurrentHashMap<String, PencilPainter> getMFinishedPencils() {
        return this.mFinishedPencils;
    }

    public final ConcurrentHashMap<String, PencilPainter> getMPencils() {
        return this.mPencils;
    }

    public final CanvasRenderModel getModel() {
        return this.model;
    }

    public final void setMFinishedPencils(ConcurrentHashMap<String, PencilPainter> concurrentHashMap) {
        Intrinsics.checkParameterIsNotNull(concurrentHashMap, "<set-?>");
        this.mFinishedPencils = concurrentHashMap;
    }

    public final void setMPencils(ConcurrentHashMap<String, PencilPainter> concurrentHashMap) {
        Intrinsics.checkParameterIsNotNull(concurrentHashMap, "<set-?>");
        this.mPencils = concurrentHashMap;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.IRemotePencilsProxyRenderer
    public void removePencil(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.mPencils.remove(str);
        this.mFinishedPencils.remove(str);
    }

    public RemotePencilsProxyPainter(CanvasRenderModel canvasRenderModel) {
        Intrinsics.checkParameterIsNotNull(canvasRenderModel, "model");
        this.model = canvasRenderModel;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.IRemotePencilsProxyRenderer
    public void removePencilsNotInList(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "ids");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, PencilPainter> entry : this.mPencils.entrySet()) {
            if (list.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.mPencils.clear();
        this.mPencils.putAll(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, PencilPainter> entry2 : this.mFinishedPencils.entrySet()) {
            if (list.contains(entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.mFinishedPencils.clear();
        this.mFinishedPencils.putAll(linkedHashMap2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        if (r7 != false) goto L_0x0030;
     */
    @Override // com.ss.android.vc.meeting.module.sketch.render.canvas.painters.BasePainter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean draw(android.graphics.Canvas r17, android.graphics.RectF r18, com.ss.android.vc.entity.sketch.SketchRange r19) {
        /*
        // Method dump skipped, instructions count: 505
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.sketch.render.canvas.painters.RemotePencilsProxyPainter.draw(android.graphics.Canvas, android.graphics.RectF, com.ss.android.vc.entity.sketch.a):boolean");
    }
}
