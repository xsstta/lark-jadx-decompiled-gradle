package com.ss.texturerender.overlay;

import java.io.Serializable;
import java.util.LinkedList;

public class FrameTimeQueue {
    private LinkedList<FrameTime> mTimeQueue = new LinkedList<>();

    public void clear() {
        this.mTimeQueue.clear();
    }

    public int getSize() {
        return this.mTimeQueue.size();
    }

    public FrameTime getLast() {
        return this.mTimeQueue.getLast();
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < this.mTimeQueue.size(); i++) {
            str = str + "pts[" + i + "]:" + this.mTimeQueue.get(i).pts + ";";
        }
        return str;
    }

    public void add(FrameTime frameTime) {
        this.mTimeQueue.offer(frameTime);
    }

    public FrameTime poll(long j) {
        FrameTime frameTime = null;
        while (!this.mTimeQueue.isEmpty()) {
            FrameTime element = this.mTimeQueue.element();
            if (j <= element.updateClockTime) {
                if (frameTime == null) {
                    return this.mTimeQueue.poll();
                }
                if (j > frameTime.updateClockTime) {
                    if (j - frameTime.updateClockTime < element.updateClockTime - j) {
                        return frameTime;
                    }
                    return this.mTimeQueue.poll();
                }
            }
            frameTime = this.mTimeQueue.poll();
            if (this.mTimeQueue.isEmpty()) {
                return frameTime;
            }
        }
        return null;
    }

    public static class FrameTime implements Serializable {
        public long pts;
        public long updateClockTime;

        public FrameTime(long j, long j2) {
            this.pts = j;
            this.updateClockTime = j2;
        }
    }
}
