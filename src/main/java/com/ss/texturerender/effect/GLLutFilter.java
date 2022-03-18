package com.ss.texturerender.effect;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Bundle;
import com.ss.texturerender.TexGLUtils;
import com.ss.texturerender.TextureRenderLog;

public class GLLutFilter extends GLDefaultFilter {
    private final String fragmentShader = "precision mediump float;\nuniform sampler2D sTexture;\nuniform sampler2D lutTexture;\nvarying vec2 vTextureCoord;\nuniform float strength;\nvoid main() {\n    vec4 inputTexColor = texture2D(sTexture, vTextureCoord);\n    float blueColor = inputTexColor.b * 63.0;\n    vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n    vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 7.999);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n    vec2 texturePos1;\n    texturePos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.r);\n    texturePos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.g);\n    vec2 texturePos2;\n    texturePos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.r);\n    texturePos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.g);\n    vec4 newColor1 = texture2D(lutTexture, texturePos1);\n    vec4 newColor2 = texture2D(lutTexture, texturePos2);\n    vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n    gl_FragColor = mix(inputTexColor, vec4(newColor.rgb, inputTexColor.w), strength);\n}";
    private float mFilterStrength = 1.0f;
    private int mLutTexture = TexGLUtils.genTexture(3553);
    private int mLutTextureHandle;
    private int mStrengthHandle;

    @Override // com.ss.texturerender.effect.GLDefaultFilter
    public int onDrawFrameBefore() {
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.mLutTexture);
        GLES20.glUniform1i(this.mLutTextureHandle, 1);
        GLES20.glUniform1f(this.mStrengthHandle, this.mFilterStrength);
        return 0;
    }

    @Override // com.ss.texturerender.effect.AbsEffect, com.ss.texturerender.effect.GLDefaultFilter
    public AbsEffect release() {
        TexGLUtils.deleteTexture(this.mLutTexture);
        TextureRenderLog.m256492d("TR_GLLutFilter", "release,this:" + this);
        return super.release();
    }

    public GLLutFilter() {
        super(2);
        this.mOrder = 15;
        TextureRenderLog.m256492d("TR_GLLutFilter", "new GLLutFilter,this:" + this);
    }

    @Override // com.ss.texturerender.effect.AbsEffect, com.ss.texturerender.effect.GLDefaultFilter
    public String getStringOption(int i) {
        if (i != 11001) {
            return super.getStringOption(i);
        }
        return "precision mediump float;\nuniform sampler2D sTexture;\nuniform sampler2D lutTexture;\nvarying vec2 vTextureCoord;\nuniform float strength;\nvoid main() {\n    vec4 inputTexColor = texture2D(sTexture, vTextureCoord);\n    float blueColor = inputTexColor.b * 63.0;\n    vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n    vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 7.999);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n    vec2 texturePos1;\n    texturePos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.r);\n    texturePos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.g);\n    vec2 texturePos2;\n    texturePos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.r);\n    texturePos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.g);\n    vec4 newColor1 = texture2D(lutTexture, texturePos1);\n    vec4 newColor2 = texture2D(lutTexture, texturePos2);\n    vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n    gl_FragColor = mix(inputTexColor, vec4(newColor.rgb, inputTexColor.w), strength);\n}";
    }

    public void setBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            GLES20.glBindTexture(3553, this.mLutTexture);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            TextureRenderLog.m256492d("TR_GLLutFilter", "setBitmap:" + bitmap + ",this:" + this);
        }
    }

    @Override // com.ss.texturerender.effect.AbsEffect, com.ss.texturerender.effect.GLDefaultFilter
    public int init(Bundle bundle) {
        super.init(bundle);
        this.mStrengthHandle = GLES20.glGetUniformLocation(this.mProgram, "strength");
        this.mLutTextureHandle = GLES20.glGetUniformLocation(this.mProgram, "lutTexture");
        setBitmap((Bitmap) bundle.getParcelable("lut_bitmap"));
        if (bundle.containsKey("strength")) {
            this.mFilterStrength = bundle.getFloat("strength");
        }
        TextureRenderLog.m256492d("TR_GLLutFilter", "init,this:" + this);
        return 0;
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public void setOption(Bundle bundle) {
        if (bundle == null || this.mEffectType != bundle.getInt("effect_type")) {
            super.setOption(bundle);
        } else if (bundle.getInt("action") == 22) {
            setBitmap((Bitmap) bundle.getParcelable("lut_bitmap"));
        }
    }

    @Override // com.ss.texturerender.effect.AbsEffect
    public void setOption(int i, float f) {
        if (i != 20) {
            super.setOption(i, f);
            return;
        }
        this.mFilterStrength = f;
        TextureRenderLog.m256492d("TR_GLLutFilter", "set strength:" + this.mFilterStrength + ",this:" + this);
    }
}
