package com.ss.android.ttve.nativePort;

import com.ss.android.vesdk.AbstractC64077u;
import com.ss.android.vesdk.AbstractC64081v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class TEVideoUtilsCallback {
    private AbstractC64081v frameDataListener;
    private AbstractC64077u frameListener;

    public AbstractC64077u getFrameAvailableListener() {
        return this.frameListener;
    }

    public void setFrameDataListener(Object obj) {
        this.frameDataListener = (AbstractC64081v) obj;
    }

    public void setListener(Object obj) {
        this.frameListener = (AbstractC64077u) obj;
    }

    public static ByteBuffer allocateBuffer(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static ByteBuffer allocateFrame(int i, int i2) {
        return ByteBuffer.allocateDirect(i * i2 * 4).order(ByteOrder.LITTLE_ENDIAN);
    }

    public boolean onFrameAvailable(ByteBuffer byteBuffer, int i, int i2, int i3) {
        AbstractC64077u uVar = this.frameListener;
        if (uVar == null || !uVar.processFrame(byteBuffer, i, i2, i3)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameAvailable(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        AbstractC64077u uVar;
        if (!(obj instanceof TEVideoUtilsCallback) || (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) == null || (uVar = tEVideoUtilsCallback.frameListener) == null || !uVar.processFrame(byteBuffer, i, i2, i3)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameAvailable2(Object obj, byte[] bArr, int i, int i2, int i3) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        AbstractC64077u uVar;
        if (!(obj instanceof TEVideoUtilsCallback) || (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) == null || (uVar = tEVideoUtilsCallback.frameListener) == null || !uVar.processFrame(ByteBuffer.wrap(bArr), i, i2, i3)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameDataAvailable(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        AbstractC64081v vVar;
        if (!(obj instanceof TEVideoUtilsCallback) || (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) == null || (vVar = tEVideoUtilsCallback.frameDataListener) == null || !vVar.mo221856a(byteBuffer, i, i2, i3, i4)) {
            return false;
        }
        return true;
    }
}
