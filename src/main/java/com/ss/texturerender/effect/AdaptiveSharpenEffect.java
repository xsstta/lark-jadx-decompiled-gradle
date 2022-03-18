package com.ss.texturerender.effect;

import android.os.Bundle;
import android.os.SystemClock;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.texturerender.TextureRenderLog;

public class AdaptiveSharpenEffect extends AbsEffect {
    private float mAmount = -1.0f;
    private int mDiffImgSmoothEnable = -1;
    private float mEdgeWeightGamma = -1.0f;
    private boolean mInitSharpenError;
    private int mMaxHeight = 1080;
    private int mMaxWidth = 1920;
    private float mOverRatio = -1.0f;
    private int mPowerLevel;
    private int mProcessSuccess = Integer.MIN_VALUE;
    private float[] mSTMatrix;
    private int mSceneMode;
    private AdaptiveSharpenWrapper mWrapper;

    @Override // com.ss.texturerender.effect.AbsEffect
    public AbsEffect release() {
        AdaptiveSharpenWrapper adaptiveSharpenWrapper = this.mWrapper;
        if (adaptiveSharpenWrapper != null) {
            adaptiveSharpenWrapper.ReleaseAdaptiveSharpen();
            this.mWrapper = null;
            TextureRenderLog.m256492d("TR_AdaptiveSharpenEffect", "sharpen released");
        }
        return super.release();
    }

    public AdaptiveSharpenEffect() {
        super(1);
        TextureRenderLog.m256492d("TR_AdaptiveSharpenEffect", "new AdaptiveSharpenEffect");
        this.mOrder = 10;
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public int getIntOption(int i) {
        switch (i) {
            case UpdateDialogStatusCode.DISMISS:
                return this.mMaxWidth;
            case UpdateDialogStatusCode.SHOW:
                return this.mMaxHeight;
            case 10003:
                return this.mPowerLevel;
            case 10004:
                return this.mInTextureTarget;
            default:
                return super.getIntOption(i);
        }
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public int init(Bundle bundle) {
        boolean z;
        super.init(bundle);
        int i = bundle.getInt("texture_type");
        if (!((this.mPowerLevel == bundle.getInt("power_level") && this.mInTextureTarget == i) || this.mWrapper == null)) {
            TextureRenderLog.m256492d("TR_AdaptiveSharpenEffect", "release prev sharpen instance");
            this.mWrapper.ReleaseAdaptiveSharpen();
            this.mWrapper = null;
        }
        int i2 = 0;
        if (this.mWrapper == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.mInTextureTarget = i;
            if (this.mInTextureTarget == 36197 && this.mSTMatrix == null) {
                this.mSTMatrix = new float[16];
            }
            this.mMaxWidth = bundle.getInt("max_width");
            this.mMaxHeight = bundle.getInt("max_height");
            this.mPowerLevel = bundle.getInt("power_level");
            AdaptiveSharpenWrapper adaptiveSharpenWrapper = new AdaptiveSharpenWrapper();
            this.mWrapper = adaptiveSharpenWrapper;
            if (this.mInTextureTarget == 36197) {
                z = true;
            } else {
                z = false;
            }
            if (!adaptiveSharpenWrapper.InitAdaptiveSharpen(z, this.mMaxWidth, this.mMaxHeight, this.mPowerLevel)) {
                i2 = -1;
            }
            TextureRenderLog.m256492d("TR_AdaptiveSharpenEffect", "init sharpen, ret:" + i2 + ",cost:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
        if (i2 != 0) {
            this.mInitSharpenError = true;
            this.mWrapper.ReleaseAdaptiveSharpen();
            this.mWrapper = null;
            TextureRenderLog.m256492d("TR_AdaptiveSharpenEffect", "init sharpen fail, release");
        }
        TextureRenderLog.m256492d("TR_AdaptiveSharpenEffect", "sharpen init,ret:" + i2);
        return i2;
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public void setOption(int i, float f) {
        switch (i) {
            case 11:
                this.mAmount = f;
                break;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                this.mOverRatio = f;
                break;
            case 13:
                this.mEdgeWeightGamma = f;
                break;
            default:
                super.setOption(i, f);
                break;
        }
        TextureRenderLog.m256492d("TR_AdaptiveSharpenEffect", "setOption float, key:" + i + ",value:" + f);
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public void setOption(int i, int i2) {
        if (i == 14) {
            this.mDiffImgSmoothEnable = i2;
            TextureRenderLog.m256492d("TR_AdaptiveSharpenEffect", "set DiffImgSmoothEnable:" + i2);
        } else if (i != 17) {
            super.setOption(i, i2);
        } else {
            this.mSceneMode = i2;
            TextureRenderLog.m256492d("TR_AdaptiveSharpenEffect", "set SceneMode:" + i2);
        }
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public EffectTexture process(EffectTexture effectTexture, FrameBuffer frameBuffer) {
        int i;
        int i2;
        if (this.mSurfaceTexture == null) {
            return effectTexture;
        }
        if (this.mWrapper == null) {
            if (this.mInitSharpenError) {
                this.mSurfaceTexture.notifyError(3);
                this.mInitSharpenError = false;
            }
            TextureRenderLog.m256492d("TR_AdaptiveSharpenEffect", "sharpen empty");
            this.mSurfaceTexture.setOption(15, 0);
            return effectTexture;
        }
        if (this.mSurfaceTexture.getIntOption(16, -1) == 1) {
            int texWidth = this.mSurfaceTexture.getTexWidth();
            int texHeight = this.mSurfaceTexture.getTexHeight();
            if (this.mInTextureTarget == 36197) {
                this.mSurfaceTexture.getTransformMatrix(this.mSTMatrix);
                i = texHeight;
                i2 = this.mWrapper.AdaptiveSharpenOesProcess(effectTexture.getTexID(), texWidth, texHeight, this.mSTMatrix, true, this.mSceneMode, this.mAmount, this.mOverRatio, this.mEdgeWeightGamma, this.mDiffImgSmoothEnable);
            } else {
                i = texHeight;
                i2 = this.mWrapper.AdaptiveSharpenProcess(effectTexture.getTexID(), texWidth, i, true, this.mSceneMode, this.mAmount, this.mOverRatio, this.mEdgeWeightGamma, this.mDiffImgSmoothEnable);
            }
            if (i2 != 0) {
                if (this.mProcessSuccess != -1) {
                    TextureRenderLog.m256492d("TR_AdaptiveSharpenEffect", "process error,ret:" + i2 + ",width:" + texWidth + ",height:" + i);
                    this.mProcessSuccess = -1;
                }
                this.mSurfaceTexture.notifyError(4);
            } else {
                int GetAdaptiveSharpenOutput = this.mWrapper.GetAdaptiveSharpenOutput();
                if (this.mProcessSuccess != 0) {
                    TextureRenderLog.m256492d("TR_AdaptiveSharpenEffect", "process success,texid:" + GetAdaptiveSharpenOutput + ",width:" + texWidth + ",height:" + i);
                    this.mProcessSuccess = 0;
                }
                this.mSurfaceTexture.setOption(15, 1);
                effectTexture.giveBack();
                return new EffectTexture(null, GetAdaptiveSharpenOutput, texWidth, i, 3553);
            }
        }
        this.mSurfaceTexture.setOption(15, 0);
        return effectTexture;
    }
}
