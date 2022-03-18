package com.smt.usbcam;

import java.nio.ByteBuffer;

public interface FrameCallback {
    void onFrameAvailable(ByteBuffer byteBuffer);
}
