package com.ss.texturerender.effect;

import android.opengl.GLES20;
import com.ss.texturerender.TexGLUtils;
import com.ss.texturerender.TextureRenderLog;
import java.util.Iterator;
import java.util.LinkedList;

public class EffectTextureManager {
    private int mMaxSize = 4;
    private LinkedList<EffectTexture> mTextureList = new LinkedList<>();

    public void release() {
        while (!this.mTextureList.isEmpty()) {
            EffectTexture poll = this.mTextureList.poll();
            TexGLUtils.deleteTexture(poll.getTexID());
            TextureRenderLog.m256492d("TR_EffectTextureManager", "release delTex:" + poll);
        }
    }

    public void onTextureReturn(EffectTexture effectTexture) {
        this.mTextureList.offer(effectTexture);
        TextureRenderLog.m256492d("TR_EffectTextureManager", "onTextureReturn:" + effectTexture);
        while (this.mTextureList.size() > this.mMaxSize) {
            EffectTexture poll = this.mTextureList.poll();
            TexGLUtils.deleteTexture(poll.getTexID());
            TextureRenderLog.m256492d("TR_EffectTextureManager", "onTextureReturn delTex:" + poll);
        }
    }

    public EffectTexture genTexture(int i, int i2) {
        int i3;
        Iterator<EffectTexture> it = this.mTextureList.iterator();
        while (it.hasNext()) {
            EffectTexture next = it.next();
            if (i == next.getWidth()) {
                if (i2 == next.getHeight()) {
                    it.remove();
                    return next;
                }
            }
        }
        EffectTexture poll = this.mTextureList.poll();
        if (poll == null) {
            i3 = TexGLUtils.genTexture(3553);
        } else {
            i3 = poll.getTexID();
        }
        GLES20.glBindTexture(3553, i3);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        EffectTexture effectTexture = new EffectTexture(null, i3, i, i2, 3553);
        TextureRenderLog.m256492d("TR_EffectTextureManager", "genTexture:" + effectTexture.toString());
        return effectTexture;
    }
}
