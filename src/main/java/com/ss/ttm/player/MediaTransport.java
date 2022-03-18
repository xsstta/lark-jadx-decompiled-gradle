package com.ss.ttm.player;

import java.nio.ByteBuffer;

public abstract class MediaTransport extends NativeObject {
    private native void nativeSetFilterType(int i);

    /* access modifiers changed from: protected */
    public abstract void sendPacket(MediaPacket mediaPacket);

    public void setFilterType(int i) {
        nativeSetFilterType(i);
    }

    public static class MediaPacket {
        public ByteBuffer mBuffer;
        public int mCodecId;
        public int mFlags;
        public boolean mIsAccessUnit;
        public boolean mIsVideo;
        public int mOffset;
        public long mPresentationTimeMs;
        public int mSize;

        public void set(ByteBuffer byteBuffer, boolean z, boolean z2, int i, int i2, long j, int i3, int i4) {
            this.mBuffer = byteBuffer;
            this.mOffset = i;
            this.mSize = i2;
            this.mPresentationTimeMs = j;
            this.mFlags = i3;
            this.mIsVideo = z;
            this.mCodecId = i4;
            this.mIsAccessUnit = z2;
        }
    }
}
