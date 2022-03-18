package com.ss.texturerender;

import android.opengl.GLES20;
import android.util.AndroidRuntimeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Texture implements ITexture {
    private ReentrantLock mLock = new ReentrantLock();
    private IRef mRef = new Ref();
    private int mTexTarget;
    private int mTextureId;
    private OnTextureReturnListener mTextureReturnListener;

    public interface OnTextureReturnListener {
        void onTextureReturn(ITexture iTexture);
    }

    @Override // com.ss.texturerender.ITexture
    public int getTexTarget() {
        return this.mTexTarget;
    }

    @Override // com.ss.texturerender.IRef
    public int refCnt() {
        return this.mRef.refCnt();
    }

    @Override // com.ss.texturerender.ITexture
    public void unlock() {
        this.mLock.unlock();
    }

    @Override // com.ss.texturerender.IRef
    public int addRef() {
        int addRef = this.mRef.addRef();
        TextureRenderLog.m256492d("ITexture", this + " add ref " + addRef);
        return addRef;
    }

    @Override // com.ss.texturerender.ITexture
    public int lock() {
        if (!this.mLock.isHeldByCurrentThread()) {
            this.mLock.lock();
            return this.mTextureId;
        }
        throw new AndroidRuntimeException("Dead lock!!");
    }

    @Override // com.ss.texturerender.IRef
    public int decRef() {
        int decRef = this.mRef.decRef();
        TextureRenderLog.m256492d("ITexture", this + " dec ref " + decRef);
        if (decRef == 1) {
            this.mTextureReturnListener.onTextureReturn(this);
            return 0;
        } else if (decRef >= 1) {
            return 0;
        } else {
            throw new RuntimeException(new Exception("reference idx " + (decRef - 1) + " app abort!!"));
        }
    }

    public void release() {
        TextureRenderLog.m256492d("ITexture", this + "release = " + this.mTextureId);
        lock();
        GLES20.glDeleteTextures(1, new int[this.mTextureId], 0);
        unlock();
        TextureRenderLog.m256492d("ITexture", this + "release end = " + this.mTextureId);
    }

    @Override // com.ss.texturerender.ITexture
    public int tryLock(int i) {
        try {
            if (this.mLock.tryLock((long) i, TimeUnit.MILLISECONDS)) {
                return this.mTextureId;
            }
            return -1;
        } catch (InterruptedException unused) {
            return -1;
        }
    }

    public Texture(int i, int i2, OnTextureReturnListener onTextureReturnListener) {
        TextureRenderLog.m256492d("ITexture", "new texture = " + i);
        this.mTextureId = i;
        this.mTextureReturnListener = onTextureReturnListener;
        this.mTexTarget = i2;
    }
}
