package com.ss.ttm.player;

import java.nio.ByteBuffer;

public class AJMediaCodecFrame implements Cloneable {
    public ByteBuffer data;
    public int flags;
    public int index;
    public long pts = -269488145;
    public int size;

    @Override // java.lang.Object
    public AJMediaCodecFrame clone() {
        try {
            return (AJMediaCodecFrame) super.clone();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
