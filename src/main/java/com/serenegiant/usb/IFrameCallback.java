package com.serenegiant.usb;

import java.nio.ByteBuffer;

interface IFrameCallback {
    void onFrame(ByteBuffer byteBuffer);
}
