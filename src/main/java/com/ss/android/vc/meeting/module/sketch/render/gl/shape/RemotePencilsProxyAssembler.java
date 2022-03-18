package com.ss.android.vc.meeting.module.sketch.render.gl.shape;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.module.sketch.render.IRemotePencilsProxyRenderer;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0016\u0010\u0014\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/gl/shape/RemotePencilsProxyAssembler;", "Lcom/ss/android/vc/meeting/module/sketch/render/gl/shape/BaseAssembler;", "Lcom/ss/android/vc/meeting/module/sketch/render/IRemotePencilsProxyRenderer;", "model", "Lcom/ss/android/vc/meeting/module/sketch/render/gl/model/GLRenderModel;", "(Lcom/ss/android/vc/meeting/module/sketch/render/gl/model/GLRenderModel;)V", "mFinishedPencils", "Ljava/util/LinkedHashMap;", "", "Lcom/ss/android/vc/meeting/module/sketch/render/gl/shape/PencilAssembler;", "Lkotlin/collections/LinkedHashMap;", "mPencils", "dumpTriangles", "", "memoryManger", "Lcom/ss/android/vc/meeting/module/sketch/render/gl/mm/GLMemoryManager;", "getId", "removePencil", "", "id", "removePencilsNotInList", "ids", "", "valid", "", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class RemotePencilsProxyAssembler extends BaseAssembler implements IRemotePencilsProxyRenderer {
    public static final Companion Companion = new Companion(null);
    private LinkedHashMap<String, PencilAssembler> mFinishedPencils = new LinkedHashMap<>();
    private LinkedHashMap<String, PencilAssembler> mPencils = new LinkedHashMap<>();

    @Override // com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender
    public String getId() {
        return "RemotePencils";
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    public boolean valid() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/gl/shape/RemotePencilsProxyAssembler$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.IRemotePencilsProxyRenderer
    public void removePencil(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.mPencils.remove(str);
        this.mFinishedPencils.remove(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemotePencilsProxyAssembler(GLRenderModel gLRenderModel) {
        super(gLRenderModel, null, BitmapDescriptorFactory.HUE_RED);
        Intrinsics.checkParameterIsNotNull(gLRenderModel, "model");
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.IRemotePencilsProxyRenderer
    public void removePencilsNotInList(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "ids");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, PencilAssembler> entry : this.mPencils.entrySet()) {
            if (list.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.mPencils.clear();
        this.mPencils.putAll(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, PencilAssembler> entry2 : this.mFinishedPencils.entrySet()) {
            if (list.contains(entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.mFinishedPencils.clear();
        this.mFinishedPencils.putAll(linkedHashMap2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r3 != false) goto L_0x001f;
     */
    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int dumpTriangles(com.ss.android.vc.meeting.module.sketch.render.gl.mm.GLMemoryManager r15) {
        /*
        // Method dump skipped, instructions count: 452
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.sketch.render.gl.shape.RemotePencilsProxyAssembler.dumpTriangles(com.ss.android.vc.meeting.module.sketch.render.gl.mm.GLMemoryManager):int");
    }
}
