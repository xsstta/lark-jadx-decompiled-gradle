package com.ss.texturerender.effect;

import android.opengl.GLES20;
import android.os.Bundle;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.texturerender.TextureRenderLog;

public class GLGaussianBlurFilter extends GLDefaultFilter {
    private int mBlurRadius;
    private int mBlurRadiusLoc = -1;
    private float[] mGaussianWeights;
    private int mGaussianWeightsLoc = -1;
    private boolean mIsGaussianWeightsSet;
    private float mSigma = 2.0f;
    private float mTexelHeightOffset;
    private int mTexelHeightOffsetLoc = -1;
    private float mTexelWidthOffset;
    private int mTexelWidthOffsetLoc = -1;
    private final String vertexDefaultShader = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float gaussianWeights[44];\nuniform int radius;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\nvoid main() {\n    vec4 sum = texture2D(sTexture, vTextureCoord) * gaussianWeights[0];\n    for (int i = 1; i <= radius; i++) {\n        vec2 stepOffset = vec2(texelWidthOffset * float(i), texelHeightOffset * float(i));\n        sum += texture2D(sTexture, vTextureCoord + stepOffset) * gaussianWeights[i];\n        sum += texture2D(sTexture, vTextureCoord - stepOffset) * gaussianWeights[i];\n    }\n    gl_FragColor = sum;\n}\n";

    public GLGaussianBlurFilter() {
        super(10);
        this.mOrder = 6;
        TextureRenderLog.m256492d("TR_GLGaussianBlurFilter", "new GLGaussianBlurFilter,this:" + this);
    }

    @Override // com.ss.texturerender.effect.GLDefaultFilter
    public int onDrawFrameBefore() {
        if (!this.mIsGaussianWeightsSet) {
            GLES20.glUniform1fv(this.mGaussianWeightsLoc, this.mBlurRadius + 1, this.mGaussianWeights, 0);
            this.mIsGaussianWeightsSet = true;
        }
        GLES20.glUniform1i(this.mBlurRadiusLoc, this.mBlurRadius);
        GLES20.glUniform1f(this.mTexelWidthOffsetLoc, this.mTexelWidthOffset);
        GLES20.glUniform1f(this.mTexelHeightOffsetLoc, this.mTexelHeightOffset);
        return 0;
    }

    @Override // com.ss.texturerender.effect.AbsEffect, com.ss.texturerender.effect.GLDefaultFilter
    public String getStringOption(int i) {
        if (i != 11001) {
            return super.getStringOption(i);
        }
        return "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float gaussianWeights[44];\nuniform int radius;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\nvoid main() {\n    vec4 sum = texture2D(sTexture, vTextureCoord) * gaussianWeights[0];\n    for (int i = 1; i <= radius; i++) {\n        vec2 stepOffset = vec2(texelWidthOffset * float(i), texelHeightOffset * float(i));\n        sum += texture2D(sTexture, vTextureCoord + stepOffset) * gaussianWeights[i];\n        sum += texture2D(sTexture, vTextureCoord - stepOffset) * gaussianWeights[i];\n    }\n    gl_FragColor = sum;\n}\n";
    }

    @Override // com.ss.texturerender.effect.AbsEffect, com.ss.texturerender.effect.GLDefaultFilter
    public int init(Bundle bundle) {
        super.init(bundle);
        this.mGaussianWeightsLoc = GLES20.glGetUniformLocation(this.mProgram, "gaussianWeights");
        this.mTexelWidthOffsetLoc = GLES20.glGetUniformLocation(this.mProgram, "texelWidthOffset");
        this.mTexelHeightOffsetLoc = GLES20.glGetUniformLocation(this.mProgram, "texelHeightOffset");
        this.mBlurRadiusLoc = GLES20.glGetUniformLocation(this.mProgram, "radius");
        float f = bundle.getFloat("strength", -1.0f);
        if (f > 1.0f) {
            updateGaussianWeights(f);
        } else {
            updateGaussianWeights(2.0f);
        }
        TextureRenderLog.m256492d("TR_GLGaussianBlurFilter", "GLGaussianBlurFilter init,this:" + this);
        return 0;
    }

    private void updateGaussianWeights(float f) {
        float max = Math.max(Math.min(f, 26.0f), 1.0f);
        this.mSigma = max;
        this.mBlurRadius = (int) Math.floor(Math.sqrt(Math.pow((double) max, 2.0d) * -2.0d * Math.log(((double) 0.00390625f) * Math.sqrt(Math.pow((double) this.mSigma, 2.0d) * 6.283185307179586d))));
        TextureRenderLog.m256492d("TR_GLGaussianBlurFilter", "updateGaussianWeights sigma:" + this.mSigma + ",mBlurRadius:" + this.mBlurRadius);
        this.mGaussianWeights = new float[(this.mBlurRadius + 1)];
        for (int i = 0; i <= this.mBlurRadius; i++) {
            this.mGaussianWeights[i] = (float) getGaussianWeight(this.mSigma, i);
        }
        float f2 = this.mGaussianWeights[0];
        for (int i2 = 1; i2 <= this.mBlurRadius; i2++) {
            f2 += this.mGaussianWeights[i2] * 2.0f;
        }
        for (int i3 = 0; i3 <= this.mBlurRadius; i3++) {
            float[] fArr = this.mGaussianWeights;
            fArr[i3] = fArr[i3] / f2;
        }
        this.mIsGaussianWeightsSet = false;
    }

    private double getGaussianWeight(float f, int i) {
        double d = (double) f;
        return (1.0d / Math.sqrt(Math.pow(d, 2.0d) * 6.283185307179586d)) * Math.exp((-Math.pow((double) i, 2.0d)) / (Math.pow(d, 2.0d) * 2.0d));
    }

    @Override // com.ss.texturerender.effect.AbsEffect, com.ss.texturerender.effect.GLDefaultFilter
    public EffectTexture process(EffectTexture effectTexture, FrameBuffer frameBuffer) {
        if (this.mSigma == 1.0f) {
            return effectTexture;
        }
        this.mTexelWidthOffset = (float) (1.0d / ((double) this.mSurfaceTexture.getTexWidth()));
        this.mTexelHeightOffset = BitmapDescriptorFactory.HUE_RED;
        EffectTexture process = super.process(effectTexture, frameBuffer);
        this.mTexelWidthOffset = BitmapDescriptorFactory.HUE_RED;
        this.mTexelHeightOffset = (float) (1.0d / ((double) this.mSurfaceTexture.getTexHeight()));
        return super.process(process, frameBuffer);
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public void setOption(int i, float f) {
        if (i == 20 && f != this.mSigma) {
            updateGaussianWeights(f);
            TextureRenderLog.m256492d("TR_GLGaussianBlurFilter", "set strength:" + this.mSigma + ",this:" + this);
        }
    }
}
