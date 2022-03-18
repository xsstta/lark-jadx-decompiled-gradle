package com.ss.ttm.player;

import java.nio.ByteBuffer;

public class AJCodecBuffer implements Cloneable {
    public ByteBuffer data;
    public int index;
    public long pts;
    public int size;

    @Override // java.lang.Object
    public AJCodecBuffer clone() {
        AJCodecBuffer aJCodecBuffer;
        try {
            aJCodecBuffer = (AJCodecBuffer) super.clone();
        } catch (Throwable th) {
            th.printStackTrace();
            aJCodecBuffer = null;
        }
        aJCodecBuffer.size = this.size;
        aJCodecBuffer.pts = this.pts;
        aJCodecBuffer.index = this.index;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.size);
        allocateDirect.put(this.data);
        aJCodecBuffer.data = allocateDirect;
        return aJCodecBuffer;
    }
}
