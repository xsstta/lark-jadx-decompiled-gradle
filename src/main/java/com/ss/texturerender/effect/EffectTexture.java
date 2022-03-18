package com.ss.texturerender.effect;

import com.ss.texturerender.VideoSurfaceTexture;

public class EffectTexture {
    private int height;
    private VideoSurfaceTexture surfaceTexture;
    private int texID;
    private int texTarget;
    private int width;

    public int getHeight() {
        return this.height;
    }

    public int getTexID() {
        return this.texID;
    }

    public int getTexTarget() {
        return this.texTarget;
    }

    public int getWidth() {
        return this.width;
    }

    public void giveBack() {
        VideoSurfaceTexture videoSurfaceTexture = this.surfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.enqueueTexture(this);
        }
    }

    public String toString() {
        return "[EffectTexture:" + this.surfaceTexture + "," + this.texID + "," + this.texTarget + "," + this.width + "," + this.height + "]";
    }

    public void setSurfaceTexture(VideoSurfaceTexture videoSurfaceTexture) {
        this.surfaceTexture = videoSurfaceTexture;
    }

    public EffectTexture(VideoSurfaceTexture videoSurfaceTexture, int i, int i2, int i3, int i4) {
        this.surfaceTexture = videoSurfaceTexture;
        this.texID = i;
        this.width = i2;
        this.height = i3;
        this.texTarget = i4;
    }
}
