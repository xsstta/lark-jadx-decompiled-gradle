package com.ss.texturerender.effect;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.texturerender.TextureRenderLog;
import com.ss.texturerender.VideoOCLSRWrapper;

public class VideoOCLSREffect extends AbsEffect {
    private boolean mIsMaliSync = true;
    private int mMaxHeight;
    private int mMaxWidth;
    private VideoOCLSRWrapper mOclSr;
    private int mProcessSuccess = Integer.MIN_VALUE;
    private float[] mSTMatrix;
    private int mSuperAlgType = -1;

    public VideoOCLSREffect() {
        super(5);
        TextureRenderLog.m256492d("TR_VideoOCLSREffect", "new VideoOCLSREffect");
        this.mOrder = 5;
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public AbsEffect release() {
        if (this.mOclSr != null) {
            TextureRenderLog.m256492d("TR_VideoOCLSREffect", "release video sr");
            this.mOclSr.ReleaseVideoOclSr();
            this.mOclSr = null;
        }
        return super.release();
    }

    private EffectTexture originTex(EffectTexture effectTexture) {
        this.mSurfaceTexture.setOption(6, 0);
        return effectTexture;
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public int init(Bundle bundle) {
        boolean z;
        super.init(bundle);
        int i = bundle.getInt("srAlgType");
        int i2 = bundle.getInt("texture_type");
        String string = bundle.getString("moduleName");
        boolean z2 = true;
        boolean z3 = bundle.getBoolean("srIsMaliSync", true);
        if (this.mSuperAlgType == i && this.mInTextureTarget == i2 && this.mIsMaliSync == z3) {
            return 0;
        }
        this.mInTextureTarget = i2;
        if (this.mInTextureTarget == 36197 && this.mSTMatrix == null) {
            this.mSTMatrix = new float[16];
        }
        this.mMaxWidth = bundle.getInt("srMaxSizeWidth");
        this.mMaxHeight = bundle.getInt("srMaxSizeHeight");
        String str = (String) bundle.getSerializable("kernelBinPath");
        if (TextUtils.isEmpty(str)) {
            TextureRenderLog.m256492d("TR_VideoOCLSREffect", "sr config is empty");
            return -1;
        }
        if (this.mOclSr != null) {
            TextureRenderLog.m256492d("TR_VideoOCLSREffect", "release prev SR instance");
            this.mOclSr.ReleaseVideoOclSr();
            this.mOclSr = null;
        }
        TextureRenderLog.m256492d("TR_VideoOCLSREffect", "start init sr");
        VideoOCLSRWrapper videoOCLSRWrapper = new VideoOCLSRWrapper();
        this.mOclSr = videoOCLSRWrapper;
        if (this.mMaxWidth <= 0 || this.mMaxHeight <= 0) {
            if (this.mInTextureTarget != 36197) {
                z2 = false;
            }
            if (!videoOCLSRWrapper.InitVideoOclSr(str, i, z2, string)) {
                TextureRenderLog.m256492d("TR_VideoOCLSREffect", "sr init failed");
                this.mOclSr.ReleaseVideoOclSr();
                this.mOclSr = null;
                return -1;
            }
        } else {
            if (this.mInTextureTarget == 36197) {
                z = true;
            } else {
                z = false;
            }
            if (!videoOCLSRWrapper.InitVideoOclSr(str, i, z, z3, this.mMaxHeight, this.mMaxWidth, string)) {
                TextureRenderLog.m256492d("TR_VideoOCLSREffect", "sr init set max texture size failed");
                this.mOclSr.ReleaseVideoOclSr();
                this.mOclSr = null;
                return -1;
            }
        }
        this.mSuperAlgType = i;
        this.mIsMaliSync = z3;
        TextureRenderLog.m256492d("TR_VideoOCLSREffect", "init sr success, texTarget:" + i2 + " bundle:" + bundle.toString());
        return 0;
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public EffectTexture process(EffectTexture effectTexture, FrameBuffer frameBuffer) {
        int i;
        if (this.mSurfaceTexture == null) {
            return effectTexture;
        }
        if (this.mOclSr == null) {
            return originTex(effectTexture);
        }
        if (this.mSuperAlgType < 0 || this.mSurfaceTexture.getUseSr() != 1) {
            return originTex(effectTexture);
        }
        int texWidth = this.mSurfaceTexture.getTexWidth();
        int texHeight = this.mSurfaceTexture.getTexHeight();
        if (!this.mSurfaceTexture.supportProcessResolution(texWidth, texHeight)) {
            return originTex(effectTexture);
        }
        if (this.mInTextureTarget == 36197) {
            this.mSurfaceTexture.getTransformMatrix(this.mSTMatrix);
            i = this.mOclSr.VideoOclSrOesProcess(effectTexture.getTexID(), texWidth, texHeight, this.mSTMatrix, true);
        } else {
            i = this.mOclSr.VideoOclSrProcess(effectTexture.getTexID(), texWidth, texHeight, true);
        }
        if (i == -1) {
            if (this.mProcessSuccess != -1) {
                TextureRenderLog.m256492d("TR_VideoOCLSREffect", "sr process failed,width:" + texWidth + ",height:" + texHeight);
                this.mProcessSuccess = -1;
            }
            this.mSurfaceTexture.notifyError(2);
            return originTex(effectTexture);
        }
        int GetVideoOclSrOutput = this.mOclSr.GetVideoOclSrOutput();
        this.mSurfaceTexture.setOption(6, 1);
        if (this.mProcessSuccess != 0) {
            TextureRenderLog.m256492d("TR_VideoOCLSREffect", "sr process success,sr tex:" + GetVideoOclSrOutput + ",width:" + (texWidth * 2) + ",height:" + (texHeight * 2));
            this.mProcessSuccess = 0;
        }
        effectTexture.giveBack();
        return new EffectTexture(null, GetVideoOclSrOutput, texWidth * 2, texHeight * 2, 3553);
    }
}
