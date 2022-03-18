package com.ss.android.vc.irtc.impl.widget.webrtc;

public class RenderInfo {
    private long frames;
    private long times;

    public synchronized void reset() {
        this.frames = 0;
        this.times = 0;
    }

    public synchronized long perRenderTime() {
        long j;
        long j2 = this.frames;
        j = 0;
        if (j2 > 0) {
            j = this.times / j2;
            reset();
        }
        return j;
    }

    public synchronized void statics(long j) {
        this.frames++;
        this.times += j;
    }
}
