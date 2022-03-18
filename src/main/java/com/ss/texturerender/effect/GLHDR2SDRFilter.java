package com.ss.texturerender.effect;

import android.opengl.GLES20;
import android.os.Bundle;
import com.ss.texturerender.TextureRenderLog;

public class GLHDR2SDRFilter extends GLDefaultFilter {
    private final String HdrFragmentShader = "precision highp float;\nuniform mat3 uCMSmatrix;\nuniform int hdrType;\nvec3 eotf_pq(vec3 color) {\n    color = max(color, 0.0);\n    color = pow(color, vec3(1.0/78.843750));\n    color = max(color - vec3(0.835938), 0.0) / (vec3(18.851562) - vec3(18.687500) * color);\n    color = pow(color, vec3(1.0/0.159302));\n    return color;\n}\nvec3 eotf_hlg(vec3 color) {\n    float HLG_A = 0.17883277;\n    float HLG_B = 0.28466892;\n    float HLG_C = 0.55991073;\n    vec3 mask = step(vec3(0.5), color);\n    color = mask * exp((color - vec3(HLG_C)) * vec3(1.0/HLG_A) + HLG_B) + (1.0 - mask) * vec3(4.0) * color * color;\n    color *= vec3(1.0/12.0);\n    color = clamp(color, 0.0, 1.0);\n    float lum = 0.2627 * color.r + 0.677998 * color.g + 0.059302 * color.b;\n    color = vec3(pow(lum, 0.2)) * color;\n    return color;\n}float _hable_3_0(float x) {\n    return ((x * (0.150000*x + 0.050000)+0.004000)/(x * (0.150000*x + 0.500000) + 0.060000)) - 0.066667;\n}\nvec3 toneMap(vec3 color, float peakLum) {\n    color = color * vec3(peakLum);\n    float sig = max(max(color.r, color.g), color.b);\n    float sig_peak = peakLum;\n    float luma = 0.2126368 * color.r + 0.715183 * color.g + 0.07218021 * color.b;\n    float coeff = max(sig - 0.18, 1e-6) / max(sig, 1e-6);\n    coeff = pow(coeff, 20.0);\n    sig = mix(sig, luma, coeff);\n    float sig_orig = max(sig, 1e-6);\n    sig = _hable_3_0(sig) / _hable_3_0(sig_peak);\n    sig = min(sig, 1.0);\n    color *= sig / sig_orig;\n    return color;\n}\nvec4 colorMapping(vec4 color) {\n    float peakLum = 0.0;    if (hdrType == 1) {\n        color.rgb = eotf_pq(color.rgb);\n        peakLum = 110.0;\n    } else {\n        color.rgb = eotf_hlg(color.rgb);\n        peakLum = 12.0;\n    } \n    color.rgb = uCMSmatrix * color.rgb;\n    color.rgb = toneMap(color.rgb, peakLum);\n    color.rgb = pow(color.rgb, vec3(1.0/2.2));\n    color.rgb = clamp(color.rgb, 0.0, 1.0);\n    return color;\n}\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main(void) {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = colorMapping(gl_FragColor);\n}\n";
    private int mCMSmatrixHandle;
    private int mHDRType;
    private int mHDRTypeHandle;
    protected final float[] mREC2020toREC709Matrix = {1.660497f, -0.1245471f, -0.01815368f, -0.5876567f, 1.132895f, -0.1005973f, -0.07283995f, -0.008347984f, 1.118751f};

    @Override // com.ss.texturerender.effect.GLDefaultFilter
    public int onDrawFrameBefore() {
        GLES20.glUniform1i(this.mHDRTypeHandle, this.mHDRType);
        return 0;
    }

    public GLHDR2SDRFilter() {
        super(4);
        this.mOrder = 20;
    }

    @Override // com.ss.texturerender.effect.AbsEffect, com.ss.texturerender.effect.GLDefaultFilter
    public String getStringOption(int i) {
        if (i != 11001) {
            return super.getStringOption(i);
        }
        return "precision highp float;\nuniform mat3 uCMSmatrix;\nuniform int hdrType;\nvec3 eotf_pq(vec3 color) {\n    color = max(color, 0.0);\n    color = pow(color, vec3(1.0/78.843750));\n    color = max(color - vec3(0.835938), 0.0) / (vec3(18.851562) - vec3(18.687500) * color);\n    color = pow(color, vec3(1.0/0.159302));\n    return color;\n}\nvec3 eotf_hlg(vec3 color) {\n    float HLG_A = 0.17883277;\n    float HLG_B = 0.28466892;\n    float HLG_C = 0.55991073;\n    vec3 mask = step(vec3(0.5), color);\n    color = mask * exp((color - vec3(HLG_C)) * vec3(1.0/HLG_A) + HLG_B) + (1.0 - mask) * vec3(4.0) * color * color;\n    color *= vec3(1.0/12.0);\n    color = clamp(color, 0.0, 1.0);\n    float lum = 0.2627 * color.r + 0.677998 * color.g + 0.059302 * color.b;\n    color = vec3(pow(lum, 0.2)) * color;\n    return color;\n}float _hable_3_0(float x) {\n    return ((x * (0.150000*x + 0.050000)+0.004000)/(x * (0.150000*x + 0.500000) + 0.060000)) - 0.066667;\n}\nvec3 toneMap(vec3 color, float peakLum) {\n    color = color * vec3(peakLum);\n    float sig = max(max(color.r, color.g), color.b);\n    float sig_peak = peakLum;\n    float luma = 0.2126368 * color.r + 0.715183 * color.g + 0.07218021 * color.b;\n    float coeff = max(sig - 0.18, 1e-6) / max(sig, 1e-6);\n    coeff = pow(coeff, 20.0);\n    sig = mix(sig, luma, coeff);\n    float sig_orig = max(sig, 1e-6);\n    sig = _hable_3_0(sig) / _hable_3_0(sig_peak);\n    sig = min(sig, 1.0);\n    color *= sig / sig_orig;\n    return color;\n}\nvec4 colorMapping(vec4 color) {\n    float peakLum = 0.0;    if (hdrType == 1) {\n        color.rgb = eotf_pq(color.rgb);\n        peakLum = 110.0;\n    } else {\n        color.rgb = eotf_hlg(color.rgb);\n        peakLum = 12.0;\n    } \n    color.rgb = uCMSmatrix * color.rgb;\n    color.rgb = toneMap(color.rgb, peakLum);\n    color.rgb = pow(color.rgb, vec3(1.0/2.2));\n    color.rgb = clamp(color.rgb, 0.0, 1.0);\n    return color;\n}\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main(void) {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = colorMapping(gl_FragColor);\n}\n";
    }

    @Override // com.ss.texturerender.effect.AbsEffect, com.ss.texturerender.effect.GLDefaultFilter
    public int init(Bundle bundle) {
        super.init(bundle);
        GLES20.glUseProgram(this.mProgram);
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.mProgram, "uCMSmatrix");
        this.mCMSmatrixHandle = glGetUniformLocation;
        GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, this.mREC2020toREC709Matrix, 0);
        this.mHDRTypeHandle = GLES20.glGetUniformLocation(this.mProgram, "hdrType");
        if (bundle != null) {
            this.mHDRType = bundle.getInt("hdr_type");
        }
        TextureRenderLog.m256492d("TR_GLLutFilter", "init bundle:" + bundle.toString());
        return 0;
    }

    @Override // com.ss.texturerender.effect.AbsEffect, com.ss.texturerender.effect.GLDefaultFilter
    public void setOption(int i, int i2) {
        if (i != 8) {
            super.setOption(i, i2);
            return;
        }
        this.mHDRType = i2;
        TextureRenderLog.m256492d("TR_GLLutFilter", "mHDRType:" + i2);
    }
}
