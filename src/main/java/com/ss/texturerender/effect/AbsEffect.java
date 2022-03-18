package com.ss.texturerender.effect;

import android.os.Bundle;
import com.ss.texturerender.VideoSurfaceTexture;

public abstract class AbsEffect {
    protected Bundle mBundle;
    protected int mEffectType;
    protected int mInTextureTarget;
    protected AbsEffect mNext;
    protected int mOrder;
    protected AbsEffect mPrevious;
    protected VideoSurfaceTexture mSurfaceTexture;

    public String getStringOption(int i) {
        return "";
    }

    public abstract EffectTexture process(EffectTexture effectTexture, FrameBuffer frameBuffer);

    public Bundle getInitBundle() {
        return this.mBundle;
    }

    public AbsEffect getNextEffect() {
        return this.mNext;
    }

    public AbsEffect getPreviousEffect() {
        return this.mPrevious;
    }

    public AbsEffect release() {
        AbsEffect absEffect = this.mNext;
        removeEffect();
        return absEffect;
    }

    public void removeEffect() {
        AbsEffect absEffect = this.mPrevious;
        if (absEffect != null) {
            absEffect.mNext = this.mNext;
        }
        AbsEffect absEffect2 = this.mNext;
        if (absEffect2 != null) {
            absEffect2.mPrevious = absEffect;
        }
        this.mNext = null;
        this.mPrevious = null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        sb.append(this.mOrder);
        sb.append("]->");
        AbsEffect absEffect = this.mNext;
        if (absEffect != null) {
            str = absEffect.toString();
        } else {
            str = "end";
        }
        sb.append(str);
        return sb.toString();
    }

    public int init(Bundle bundle) {
        this.mBundle = bundle;
        return 0;
    }

    public void setSurfaceTexture(VideoSurfaceTexture videoSurfaceTexture) {
        this.mSurfaceTexture = videoSurfaceTexture;
    }

    public AbsEffect(int i) {
        this.mEffectType = i;
    }

    public int getIntOption(int i) {
        if (i == 10004) {
            return this.mInTextureTarget;
        }
        if (i == 10005) {
            return this.mEffectType;
        }
        if (i != 10011) {
            return -1;
        }
        return this.mOrder;
    }

    public void setOption(Bundle bundle) {
        AbsEffect absEffect = this.mNext;
        if (absEffect != null) {
            absEffect.setOption(bundle);
        }
    }

    public void insertEffect(AbsEffect absEffect) {
        int i = absEffect.mOrder;
        if (i <= this.mOrder) {
            AbsEffect absEffect2 = this.mNext;
            if (absEffect2 == null) {
                this.mNext = absEffect;
            } else if (absEffect2.mOrder >= i) {
                absEffect2.insertEffect(absEffect);
            } else {
                absEffect.mPrevious = this;
                absEffect.mNext = absEffect2;
                this.mNext.mPrevious = absEffect;
                this.mNext = absEffect;
            }
        } else {
            AbsEffect absEffect3 = this.mPrevious;
            if (absEffect3 == null) {
                this.mPrevious = absEffect;
            } else if (absEffect3.mOrder >= i) {
                absEffect3.mNext = absEffect;
                absEffect.mPrevious = absEffect3;
                absEffect.mNext = this;
                this.mPrevious = absEffect;
            } else {
                absEffect3.insertEffect(absEffect);
            }
        }
    }

    public void setOption(int i, float f) {
        AbsEffect absEffect = this.mNext;
        if (absEffect != null) {
            absEffect.setOption(i, f);
        }
    }

    public void setOption(int i, float[] fArr) {
        AbsEffect absEffect = this.mNext;
        if (absEffect != null) {
            absEffect.setOption(i, fArr);
        }
    }

    public void setOption(int i, int i2) {
        AbsEffect absEffect;
        if (i != 10011) {
            AbsEffect absEffect2 = this.mNext;
            if (absEffect2 != null) {
                absEffect2.setOption(i, i2);
                return;
            }
            return;
        }
        this.mOrder = i2;
        AbsEffect absEffect3 = this.mPrevious;
        if ((absEffect3 != null && i2 > absEffect3.mOrder) || ((absEffect = this.mNext) != null && i2 < absEffect.mOrder)) {
            removeEffect();
            insertEffect(this);
        }
    }
}
