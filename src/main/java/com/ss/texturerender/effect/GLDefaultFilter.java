package com.ss.texturerender.effect;

import android.opengl.GLES20;
import android.os.Bundle;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.texturerender.ShaderHelper;
import com.ss.texturerender.TextureRenderLog;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class GLDefaultFilter extends AbsEffect {
    public static float[] mTextureVerticesData = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f};
    public static float[] mTriangleVerticesData = {-1.0f, -1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, -1.0f, BitmapDescriptorFactory.HUE_RED, -1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};
    int FLOAT_SIZE_BYTES;
    int TEXTURE_VERTICES_DATA_STRIDE_BYTES;
    int TRIANGLE_VERTICES_DATA_POS_OFFSET;
    int TRIANGLE_VERTICES_DATA_STRIDE_BYTES;
    int TRIANGLE_VERTICES_DATA_UV_OFFSET;
    private final String fragmentDefaultShader;
    private int mInputTextureHandle;
    private boolean mNeedClear;
    protected int mProgram;
    private FloatBuffer mTextureVertices;
    private FloatBuffer mTriangleVertices;
    private int mViewPortHeight;
    private int mViewPortWidth;
    private int mViewPortX;
    private int mViewPortY;
    private int maPositionHandle;
    private int maTextureHandle;
    private final String vertexDefaultShader;

    public int onDrawFrameAfter() {
        return 0;
    }

    public int onDrawFrameBefore() {
        return 0;
    }

    public GLDefaultFilter() {
        this(7);
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public AbsEffect release() {
        int i = this.mProgram;
        if (i > 0) {
            GLES20.glDeleteProgram(i);
        }
        return super.release();
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public String getStringOption(int i) {
        if (i == 11000) {
            return "attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position =  aPosition;\n  vTextureCoord = aTextureCoord.xy;\n}\n";
        }
        if (i != 11001) {
            return super.getStringOption(i);
        }
        return "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    }

    public GLDefaultFilter(int i) {
        super(i);
        this.vertexDefaultShader = "attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position =  aPosition;\n  vTextureCoord = aTextureCoord.xy;\n}\n";
        this.fragmentDefaultShader = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        this.TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 12;
        this.TEXTURE_VERTICES_DATA_STRIDE_BYTES = 8;
        this.FLOAT_SIZE_BYTES = 4;
        this.mViewPortWidth = -1;
        this.mViewPortHeight = -1;
        this.mNeedClear = true;
        this.mInTextureTarget = 3553;
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public int init(Bundle bundle) {
        int createAndLinkProgram = ShaderHelper.createAndLinkProgram(ShaderHelper.compileShader(35633, getStringOption(11000)), ShaderHelper.compileShader(35632, getStringOption(11001)), null);
        this.mProgram = createAndLinkProgram;
        this.mInputTextureHandle = GLES20.glGetUniformLocation(createAndLinkProgram, "sTexture");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(mTextureVerticesData.length * this.FLOAT_SIZE_BYTES).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mTextureVertices = asFloatBuffer;
        asFloatBuffer.put(mTextureVerticesData).position(0);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(mTriangleVerticesData.length * this.FLOAT_SIZE_BYTES).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mTriangleVertices = asFloatBuffer2;
        asFloatBuffer2.put(mTriangleVerticesData).position(0);
        this.maPositionHandle = GLES20.glGetAttribLocation(this.mProgram, "aPosition");
        this.maTextureHandle = GLES20.glGetAttribLocation(this.mProgram, "aTextureCoord");
        return 0;
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public void setOption(int i, float[] fArr) {
        if (i != 13000) {
            super.setOption(i, fArr);
            return;
        }
        this.mTextureVertices.position(this.TRIANGLE_VERTICES_DATA_UV_OFFSET);
        this.mTextureVertices.put(fArr);
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public void setOption(int i, int i2) {
        switch (i) {
            case 10006:
                this.mViewPortWidth = i2;
                return;
            case 10007:
                this.mViewPortHeight = i2;
                return;
            case 10008:
                this.mViewPortX = i2;
                return;
            case 10009:
                this.mViewPortY = i2;
                return;
            case 10010:
                boolean z = true;
                if (i2 != 1) {
                    z = false;
                }
                this.mNeedClear = z;
                return;
            default:
                super.setOption(i, i2);
                return;
        }
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public EffectTexture process(EffectTexture effectTexture, FrameBuffer frameBuffer) {
        EffectTexture effectTexture2;
        if (effectTexture.getTexTarget() != this.mInTextureTarget) {
            TextureRenderLog.m256492d(getClass().getSimpleName(), "error, texture miss match, accept:" + this.mInTextureTarget + ",in:" + effectTexture.getTexTarget());
            return effectTexture;
        }
        if (frameBuffer != null) {
            effectTexture2 = this.mSurfaceTexture.dequeueTexture();
            frameBuffer.bindTexture2D(effectTexture2.getTexID());
        } else {
            effectTexture2 = null;
        }
        GLES20.glUseProgram(this.mProgram);
        if (this.mNeedClear) {
            GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            GLES20.glClear(16384);
        }
        if (this.mViewPortWidth <= 0) {
            if (frameBuffer != null) {
                this.mViewPortWidth = effectTexture.getWidth();
            } else {
                this.mViewPortWidth = this.mSurfaceTexture.getViewportWidth();
            }
        }
        if (this.mViewPortHeight <= 0) {
            if (frameBuffer != null) {
                this.mViewPortHeight = effectTexture.getHeight();
            } else {
                this.mViewPortHeight = this.mSurfaceTexture.getViewportHeight();
            }
        }
        GLES20.glViewport(this.mViewPortX, this.mViewPortY, this.mViewPortWidth, this.mViewPortHeight);
        this.mTriangleVertices.position(this.TRIANGLE_VERTICES_DATA_POS_OFFSET);
        GLES20.glVertexAttribPointer(this.maPositionHandle, 3, 5126, false, this.TRIANGLE_VERTICES_DATA_STRIDE_BYTES, (Buffer) this.mTriangleVertices);
        GLES20.glEnableVertexAttribArray(this.maPositionHandle);
        this.mTextureVertices.position(this.TRIANGLE_VERTICES_DATA_UV_OFFSET);
        GLES20.glVertexAttribPointer(this.maTextureHandle, 2, 5126, false, this.TEXTURE_VERTICES_DATA_STRIDE_BYTES, (Buffer) this.mTextureVertices);
        GLES20.glEnableVertexAttribArray(this.maTextureHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.mInTextureTarget, effectTexture.getTexID());
        GLES20.glUniform1i(this.mInputTextureHandle, 0);
        onDrawFrameBefore();
        GLES20.glDrawArrays(5, 0, 4);
        onDrawFrameAfter();
        GLES20.glBindTexture(this.mInTextureTarget, 0);
        GLES20.glDisableVertexAttribArray(this.maPositionHandle);
        GLES20.glDisableVertexAttribArray(this.maTextureHandle);
        this.mSurfaceTexture.setOption(19, this.mEffectType, 1);
        effectTexture.giveBack();
        if (frameBuffer == null) {
            return null;
        }
        frameBuffer.unbindTexture2D();
        return effectTexture2;
    }
}
