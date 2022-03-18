package com.ss.android.lark.tangram.engine;

import com.C1711a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.tangram.base.node.BaseVirtualNode;
import com.ss.android.lark.tangram.base.node.IVirtualNode;
import java.util.concurrent.ConcurrentHashMap;

public class TangramNative {
    public static final ConcurrentHashMap<String, BaseVirtualNode> hashMap = new ConcurrentHashMap<>();

    public static native float[] calculateLayout(long j, float f, float f2);

    public static native void deepFreeNode(long j);

    public static native void freeNode(long j);

    public static native long[] getNodeChildren(long j);

    public static native float[] getNodeFrame(long j);

    public static native long newLinearLayoutNode();

    public static native long newTLNodeNative();

    public static native void setLayoutFunc(long j, String str);

    public static native void setLinearLayoutPropsAlign(long j, int i);

    public static native void setLinearLayoutPropsDirection(long j, int i);

    public static native void setLinearLayoutPropsJustify(long j, int i);

    public static native void setLinearLayoutPropsOrientation(long j, int i);

    public static native void setLinearLayoutPropsPadding(long j, float f);

    public static native void setLinearLayoutPropsSpace(long j, float f);

    public static native void setLinearLayoutPropsWrapWidth(long j, float f);

    public static native void setNodeChildren(long j, long[] jArr, int i);

    public static native void setStyleAspectRatio(long j, float f);

    public static native void setStyleGrowWeight(long j, int i);

    public static native void setStyleHeight(long j, float f, int i);

    public static native void setStyleMaxHeight(long j, float f, int i);

    public static native void setStyleMaxWidth(long j, float f, int i);

    public static native void setStyleMinHeight(long j, float f, int i);

    public static native void setStyleMinWidth(long j, float f, int i);

    public static native void setStyleShrinkWeight(long j, int i);

    public static native void setStyleWidth(long j, float f, int i);

    static {
        C1711a.m7628a("tangram");
    }

    public static float callBackHeight(String str, float f, float f2) {
        BaseVirtualNode aVar = hashMap.get(str);
        if (aVar == null || !aVar.mo188759c()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return aVar.mo188756c(new IVirtualNode.RectSize(f, f2)).mo188783b();
    }

    public static float callBackWidth(String str, float f, float f2) {
        BaseVirtualNode aVar = hashMap.get(str);
        if (aVar == null || !aVar.mo188759c()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return aVar.mo188756c(new IVirtualNode.RectSize(f, f2)).mo188782a();
    }
}
