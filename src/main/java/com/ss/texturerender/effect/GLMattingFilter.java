package com.ss.texturerender.effect;

import android.opengl.GLES20;
import com.ss.texturerender.TextureRenderLog;

public class GLMattingFilter extends GLDefaultFilter {
    private final String fragmentShader = "precision mediump float;\nuniform sampler2D sTexture;\nvarying vec2 vTextureCoord;\nvoid main() {\n    vec4 tmpFrag = texture2D(sTexture, vTextureCoord);\n    float rbAver = tmpFrag.r * 0.5 + tmpFrag.b * 0.5;\n    float delta = tmpFrag.g - rbAver;\n    tmpFrag.a = 1.0 - smoothstep(0.0, 0.25, delta);\n    tmpFrag.a = tmpFrag.a * tmpFrag.a * tmpFrag.a;\n    gl_FragColor = tmpFrag;\n}";

    @Override // com.ss.texturerender.effect.GLDefaultFilter
    public int onDrawFrameBefore() {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        return 0;
    }

    public GLMattingFilter() {
        super(9);
        this.mOrder = 25;
        TextureRenderLog.m256492d("TR_GLMattingFilter", "new GLMattingFilter,this:" + this);
    }

    @Override // com.ss.texturerender.effect.AbsEffect, com.ss.texturerender.effect.GLDefaultFilter
    public String getStringOption(int i) {
        if (i != 11001) {
            return super.getStringOption(i);
        }
        return "precision mediump float;\nuniform sampler2D sTexture;\nvarying vec2 vTextureCoord;\nvoid main() {\n    vec4 tmpFrag = texture2D(sTexture, vTextureCoord);\n    float rbAver = tmpFrag.r * 0.5 + tmpFrag.b * 0.5;\n    float delta = tmpFrag.g - rbAver;\n    tmpFrag.a = 1.0 - smoothstep(0.0, 0.25, delta);\n    tmpFrag.a = tmpFrag.a * tmpFrag.a * tmpFrag.a;\n    gl_FragColor = tmpFrag;\n}";
    }
}
