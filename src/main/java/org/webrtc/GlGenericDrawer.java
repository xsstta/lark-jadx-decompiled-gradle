package org.webrtc;

import android.opengl.GLES20;
import android.util.Log;
import com.bytedance.realx.base.RXLogging;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.webrtc.RendererCommon;

/* access modifiers changed from: package-private */
public class GlGenericDrawer implements RendererCommon.GlDrawer {
    private static final FloatBuffer FULL_RECTANGLE_BUFFER = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer FULL_RECTANGLE_TEXTURE_BUFFER = GlUtil.createFloatBuffer(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f});
    private FilterType currentScaleFilter;
    private GlShader currentShader;
    private ShaderType currentShaderType;
    private final String genericFragmentSource;
    private int inPosLocation;
    private int inTcLocation;
    private int oriTexSizeLocation;
    private final ShaderCallbacks shaderCallbacks;
    private int tarTexSizeLocation;
    private int texMatrixLocation;
    private final String vertexShader;

    public interface ShaderCallbacks {
        void onNewShader(GlShader glShader);

        void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4);
    }

    public enum ShaderType {
        OES,
        RGB,
        YUV
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void release() {
        GlShader glShader = this.currentShader;
        if (glShader != null) {
            glShader.release();
            this.currentShader = null;
            this.currentShaderType = null;
        }
    }

    public GlGenericDrawer(String str, ShaderCallbacks shaderCallbacks2) {
        this("varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n", str, shaderCallbacks2);
    }

    /* access modifiers changed from: package-private */
    public GlShader createShader(ShaderType shaderType, FilterType filterType) {
        return new GlShader(this.vertexShader, createFragmentShaderString(this.genericFragmentSource, shaderType, filterType));
    }

    public GlGenericDrawer(String str, String str2, ShaderCallbacks shaderCallbacks2) {
        this.vertexShader = str;
        this.genericFragmentSource = str2;
        this.shaderCallbacks = shaderCallbacks2;
    }

    static String createFragmentShaderString(String str, ShaderType shaderType, FilterType filterType) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (shaderType == ShaderType.OES) {
            sb.append("#extension GL_OES_EGL_image_external : require\n");
        }
        sb.append("precision mediump float;\n");
        sb.append("varying vec2 tc;\n");
        if (filterType == FilterType.Bilinear) {
            sb.append("uniform vec2 tar_tex_size;\n");
            sb.append("uniform vec2 ori_tex_size;\n");
        } else if (filterType == FilterType.Bicubic) {
            sb.append("uniform vec2 tar_tex_size;\n");
            sb.append("uniform vec2 ori_tex_size;\n");
        }
        if (shaderType == ShaderType.YUV) {
            sb.append("uniform sampler2D y_tex;\n");
            sb.append("uniform sampler2D u_tex;\n");
            sb.append("uniform sampler2D v_tex;\n");
            if (filterType == FilterType.Bilinear) {
                sb.append("float bilinearTextureSample(sampler2D tex, vec2 p) {\n");
                sb.append("        vec2 c_onePixel =  vec2(1.0 / ori_tex_size.y - tar_tex_size.x + tar_tex_size.x, 1.0 / ori_tex_size.y);\n");
                sb.append("    vec2 frac = vec2(0.5, 0.5);\n");
                sb.append("    float C11 = texture2D(tex, p - c_onePixel).r;\n");
                sb.append("    float C21 = texture2D(tex, p + vec2( c_onePixel.x , -c_onePixel.y)).r;\n");
                sb.append("    float C12 = texture2D(tex, p + vec2( -c_onePixel.x , c_onePixel.y)).r;\n");
                sb.append("    float C22 = texture2D(tex, p + c_onePixel).r;\n");
                sb.append("    float x1 = mix(C11, C21, frac.x);\n");
                sb.append("    float x2 = mix(C12, C22, frac.x);\n");
                sb.append("    return mix(x1, x2, frac.y);\n");
                sb.append("}\n");
                sb.append("vec4 sample(vec2 p) {\n");
                sb.append("  float y = bilinearTextureSample(y_tex, p) * 1.16438;\n");
                sb.append("  float u = bilinearTextureSample(u_tex, p);\n");
                sb.append("  float v = bilinearTextureSample(v_tex, p);\n");
                sb.append("  return vec4(y + 1.59603 * v - 0.874202,\n");
                sb.append("    y - 0.391762 * u - 0.812968 * v + 0.531668,\n");
                sb.append("    y + 2.01723 * u - 1.08563, 1);\n");
                sb.append("}\n");
            } else if (filterType == FilterType.Bicubic) {
                sb.append("vec3 cubic_hermite (vec3 A, vec3 B, vec3 C, vec3 D, float t) {\n");
                sb.append("\t  float t2 = t*t;\n");
                sb.append("    float t3 = t*t*t;\n");
                sb.append("    vec3 a = -A/2.0 + (3.0*B)/2.0 - (3.0*C)/2.0 + D/2.0;\n");
                sb.append("    vec3 b = A - (5.0*B)/2.0 + 2.0*C - D / 2.0;\n");
                sb.append("    vec3 c = -A/2.0 + C/2.0;\n");
                sb.append("   \tvec3 d = B;\n");
                sb.append("    return a*t3 + b*t2 + c*t + d;\n");
                sb.append("}\n");
                sb.append("vec4 bicubic_sample (sampler2D tex, , vec2 P) {\n");
                sb.append("    float c_onePixel_x = 1.0 / ori_tex_size.x - tar_tex_size.x + tar_tex_size.x;\n");
                sb.append("    float c_onePixel_y = 1.0 / ori_tex_size.y;\n");
                sb.append("    float c_twoPixels_x = 2.0 / ori_tex_size.x;\n");
                sb.append("    float c_twoPixels_y = 2.0 / ori_tex_size.y;\n");
                sb.append("    vec2 pixel = vec2(P.x * ori_tex_size.x, P.y * ori_tex_size.y) + 0.5;\n");
                sb.append("    vec2 frac = fract(pixel);\n");
                sb.append("    pixel = floor(pixel);\n");
                sb.append("    pixel = vec2(pixel.x / ori_tex_size.x, pixel.y / ori_tex_size.y) - vec2(c_onePixel_x, c_onePixel_y) / 2.0;\n");
                sb.append("    vec3 C00 = texture2D(tex, pixel + vec2(-c_onePixel_x ,-c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C10 = texture2D(tex, pixel + vec2( 0.0        ,-c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C20 = texture2D(tex, pixel + vec2( c_onePixel_x ,-c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C30 = texture2D(tex, pixel + vec2( c_twoPixels_x,-c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C01 = texture2D(tex, pixel + vec2(-c_onePixel_x , 0.0)).rgb;\n");
                sb.append("    vec3 C11 = texture2D(tex, pixel + vec2( 0.0        , 0.0)).rgb;\n");
                sb.append("    vec3 C21 = texture2D(tex, pixel + vec2( c_onePixel_x , 0.0)).rgb;\n");
                sb.append("    vec3 C31 = texture2D(tex, pixel + vec2( c_twoPixels_x, 0.0)).rgb;\n");
                sb.append("    vec3 C02 = texture2D(tex, pixel + vec2(-c_onePixel_x , c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C12 = texture2D(tex, pixel + vec2( 0.0        , c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C22 = texture2D(tex, pixel + vec2( c_onePixel_x , c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C32 = texture2D(tex, pixel + vec2( c_twoPixels_x, c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C03 = texture2D(tex, pixel + vec2(-c_onePixel_x , c_twoPixels_y)).rgb;\n");
                sb.append("    vec3 C13 = texture2D(tex, pixel + vec2( 0.0        , c_twoPixels_y)).rgb;\n");
                sb.append("    vec3 C23 = texture2D(tex, pixel + vec2( c_onePixel_x , c_twoPixels_y)).rgb;\n");
                sb.append("    vec3 C33 = texture2D(tex, pixel + vec2( c_twoPixels_x, c_twoPixels_y)).rgb;  \n");
                sb.append("    vec3 CP0X = cubic_hermite(C00, C10, C20, C30, frac.x);\n");
                sb.append("    vec3 CP1X = cubic_hermite(C01, C11, C21, C31, frac.x);\n");
                sb.append("    vec3 CP2X = cubic_hermite(C02, C12, C22, C32, frac.x);\n");
                sb.append("    vec3 CP3X = cubic_hermite(C03, C13, C23, C33, frac.x);\n");
                sb.append("    return vec4(cubic_hermite(CP0X, CP1X, CP2X, CP3X, frac.y), 1.0);");
                sb.append("}\n");
                sb.append("vec4 sample(vec2 p) {\n");
                sb.append("  float y = bicubic_sample(y_tex, p) * 1.16438;\n");
                sb.append("  float u = bicubic_sample(u_tex, p);\n");
                sb.append("  float v = bicubic_sample(v_tex, p);\n");
                sb.append("  return vec4(y + 1.59603 * v - 0.874202,\n");
                sb.append("    y - 0.391762 * u - 0.812968 * v + 0.531668,\n");
                sb.append("    y + 2.01723 * u - 1.08563, 1);\n");
                sb.append("}\n");
            } else {
                sb.append("vec4 sample(vec2 p) {\n");
                sb.append("  float y = texture2D(y_tex, p).r * 1.16438;\n");
                sb.append("  float u = texture2D(u_tex, p).r;\n");
                sb.append("  float v = texture2D(v_tex, p).r;\n");
                sb.append("  return vec4(y + 1.59603 * v - 0.874202,\n");
                sb.append("    y - 0.391762 * u - 0.812968 * v + 0.531668,\n");
                sb.append("    y + 2.01723 * u - 1.08563, 1);\n");
                sb.append("}\n");
            }
            sb.append(str);
        } else {
            if (shaderType == ShaderType.OES) {
                str2 = "samplerExternalOES";
            } else {
                str2 = "sampler2D";
            }
            sb.append("uniform ");
            sb.append(str2);
            sb.append(" tex;\n");
            if (filterType == FilterType.Bilinear) {
                sb.append("vec4 sample(vec2 p) {\n");
                sb.append("    vec2 c_onePixel =  vec2(1.0 / ori_tex_size.y - tar_tex_size.x + tar_tex_size.x, 1.0 / ori_tex_size.y);\n");
                sb.append("    vec2 frac = vec2(0.5, 0.5);\n");
                sb.append("    vec3 C11 = texture2D(tex, p - c_onePixel).rgb;\n");
                sb.append("    vec3 C21 = texture2D(tex, p + vec2( c_onePixel.x , -c_onePixel.y)).rgb;\n");
                sb.append("    vec3 C12 = texture2D(tex, p + vec2( -c_onePixel.x , c_onePixel.y)).rgb;\n");
                sb.append("    vec3 C22 = texture2D(tex, p + c_onePixel).rgb;\n");
                sb.append("    vec3 x1 = mix(C11, C21, frac.x);\n");
                sb.append("    vec3 x2 = mix(C12, C22, frac.x);\n");
                sb.append("    return vec4(mix(x1, x2, frac.y), 1);\n");
                sb.append("}\n");
                sb.append(str);
            } else if (filterType == FilterType.Bicubic) {
                sb.append("vec3 cubic_hermite (vec3 A, vec3 B, vec3 C, vec3 D, float t) {\n");
                sb.append("\t  float t2 = t*t;\n");
                sb.append("    float t3 = t*t*t;\n");
                sb.append("    vec3 a = -A/2.0 + (3.0*B)/2.0 - (3.0*C)/2.0 + D/2.0;\n");
                sb.append("    vec3 b = A - (5.0*B)/2.0 + 2.0*C - D / 2.0;\n");
                sb.append("    vec3 c = -A/2.0 + C/2.0;\n");
                sb.append("   \tvec3 d = B;\n");
                sb.append("    return a*t3 + b*t2 + c*t + d;\n");
                sb.append("}\n");
                sb.append("vec4 sample (vec2 P) {\n");
                sb.append("    float c_onePixel_x = 1.0 / ori_tex_size.x - tar_tex_size.x + tar_tex_size.x;\n");
                sb.append("    float c_onePixel_y = 1.0 / ori_tex_size.y;\n");
                sb.append("    float c_twoPixels_x = 2.0 / ori_tex_size.x;\n");
                sb.append("    float c_twoPixels_y = 2.0 / ori_tex_size.y;\n");
                sb.append("    vec2 pixel = vec2(P.x * ori_tex_size.x, P.y * ori_tex_size.y) + 0.5;\n");
                sb.append("    vec2 frac = fract(pixel);\n");
                sb.append("    pixel = floor(pixel);\n");
                sb.append("    pixel = vec2(pixel.x / ori_tex_size.x, pixel.y / ori_tex_size.y) - vec2(c_onePixel_x, c_onePixel_y) / 2.0;\n");
                sb.append("    vec3 C00 = texture2D(tex, pixel + vec2(-c_onePixel_x ,-c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C10 = texture2D(tex, pixel + vec2( 0.0        ,-c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C20 = texture2D(tex, pixel + vec2( c_onePixel_x ,-c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C30 = texture2D(tex, pixel + vec2( c_twoPixels_x,-c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C01 = texture2D(tex, pixel + vec2(-c_onePixel_x , 0.0)).rgb;\n");
                sb.append("    vec3 C11 = texture2D(tex, pixel + vec2( 0.0        , 0.0)).rgb;\n");
                sb.append("    vec3 C21 = texture2D(tex, pixel + vec2( c_onePixel_x , 0.0)).rgb;\n");
                sb.append("    vec3 C31 = texture2D(tex, pixel + vec2( c_twoPixels_x, 0.0)).rgb;\n");
                sb.append("    vec3 C02 = texture2D(tex, pixel + vec2(-c_onePixel_x , c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C12 = texture2D(tex, pixel + vec2( 0.0        , c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C22 = texture2D(tex, pixel + vec2( c_onePixel_x , c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C32 = texture2D(tex, pixel + vec2( c_twoPixels_x, c_onePixel_y)).rgb;\n");
                sb.append("    vec3 C03 = texture2D(tex, pixel + vec2(-c_onePixel_x , c_twoPixels_y)).rgb;\n");
                sb.append("    vec3 C13 = texture2D(tex, pixel + vec2( 0.0        , c_twoPixels_y)).rgb;\n");
                sb.append("    vec3 C23 = texture2D(tex, pixel + vec2( c_onePixel_x , c_twoPixels_y)).rgb;\n");
                sb.append("    vec3 C33 = texture2D(tex, pixel + vec2( c_twoPixels_x, c_twoPixels_y)).rgb;  \n");
                sb.append("    vec3 CP0X = cubic_hermite(C00, C10, C20, C30, frac.x);\n");
                sb.append("    vec3 CP1X = cubic_hermite(C01, C11, C21, C31, frac.x);\n");
                sb.append("    vec3 CP2X = cubic_hermite(C02, C12, C22, C32, frac.x);\n");
                sb.append("    vec3 CP3X = cubic_hermite(C03, C13, C23, C33, frac.x);\n");
                sb.append("    return vec4(cubic_hermite(CP0X, CP1X, CP2X, CP3X, frac.y), 1.0);");
                sb.append("}\n");
                sb.append(str);
            } else {
                sb.append(str.replace("sample(", "texture2D(tex, "));
            }
        }
        return sb.toString();
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        drawOes(i, fArr, i2, i3, i4, i5, i6, i7, FilterType.Origin, 0, 0);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        drawRgb(i, fArr, i2, i3, i4, i5, i6, i7, FilterType.Origin, 0, 0);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6) {
        drawYuv(iArr, fArr, i, i2, i3, i4, i5, i6, FilterType.Origin, 0, 0);
    }

    private void prepareShader(ShaderType shaderType, float[] fArr, int i, int i2, int i3, int i4, FilterType filterType, int i5, int i6) {
        int i7;
        int i8;
        FilterType filterType2;
        GlShader glShader;
        if (filterType == null || i5 == 0 || i6 == 0) {
            filterType2 = FilterType.Origin;
            i8 = 0;
            i7 = 0;
        } else {
            filterType2 = filterType;
            i8 = i5;
            i7 = i6;
        }
        if (!shaderType.equals(this.currentShaderType) || !filterType2.equals(this.currentScaleFilter)) {
            this.currentShaderType = shaderType;
            GlShader glShader2 = this.currentShader;
            if (glShader2 != null) {
                glShader2.release();
            }
            GlShader createShader = createShader(shaderType, filterType2);
            this.currentShader = createShader;
            this.currentScaleFilter = filterType2;
            createShader.useProgram();
            if (shaderType == ShaderType.YUV) {
                GLES20.glUniform1i(createShader.getUniformLocation("y_tex"), 0);
                GLES20.glUniform1i(createShader.getUniformLocation("u_tex"), 1);
                GLES20.glUniform1i(createShader.getUniformLocation("v_tex"), 2);
            } else {
                GLES20.glUniform1i(createShader.getUniformLocation("tex"), 0);
            }
            GlUtil.checkNoGLES2Error("Create shader");
            this.shaderCallbacks.onNewShader(createShader);
            this.texMatrixLocation = createShader.getUniformLocation("tex_mat");
            if (filterType2 != FilterType.Origin) {
                this.tarTexSizeLocation = createShader.getUniformLocation("tar_tex_size");
                this.oriTexSizeLocation = createShader.getUniformLocation("ori_tex_size");
            }
            this.inPosLocation = createShader.getAttribLocation("in_pos");
            this.inTcLocation = createShader.getAttribLocation("in_tc");
            glShader = createShader;
        } else {
            glShader = this.currentShader;
        }
        GlUtil.checkNoGLES2Error("before useProgram ");
        glShader.useProgram();
        GLES20.glEnableVertexAttribArray(this.inPosLocation);
        GLES20.glVertexAttribPointer(this.inPosLocation, 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_BUFFER);
        GLES20.glEnableVertexAttribArray(this.inTcLocation);
        GLES20.glVertexAttribPointer(this.inTcLocation, 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_TEXTURE_BUFFER);
        GLES20.glUniformMatrix4fv(this.texMatrixLocation, 1, false, fArr, 0);
        if (filterType2 != FilterType.Origin && i8 > 0 && i8 > 0) {
            GLES20.glUniform2f(this.tarTexSizeLocation, (float) i, (float) i2);
            GLES20.glUniform2f(this.oriTexSizeLocation, (float) i8, (float) i7);
        }
        this.shaderCallbacks.onPrepareShader(glShader, fArr, i, i2, i3, i4);
        GlUtil.checkNoGLES2Error("Prepare shader");
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, FilterType filterType, int i8, int i9) {
        prepareShader(ShaderType.OES, fArr, i2, i3, i6, i7, filterType, i8, i9);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("GlGenericDrawer", "drawOes glBindTexture error: " + glGetError);
            RXLogging.m74904e("GlGenericDrawer", "drawOes glBindTexture error: " + glGetError);
            return;
        }
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
        GlUtil.checkNoGLES2Error("drawOes done");
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, FilterType filterType, int i8, int i9) {
        prepareShader(ShaderType.RGB, fArr, i2, i3, i6, i7, filterType, i8, i9);
        GlUtil.checkNoGLES2Error("after prepare shader");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("GlGenericDrawer", "drawRgb glBindTexture error: " + glGetError);
            RXLogging.m74904e("GlGenericDrawer", "drawRgb glBindTexture error: " + glGetError);
            return;
        }
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        GlUtil.checkNoGLES2Error("drawRgb done");
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6, FilterType filterType, int i7, int i8) {
        prepareShader(ShaderType.YUV, fArr, i, i2, i5, i6, filterType, i7, i8);
        for (int i9 = 0; i9 < 3; i9++) {
            GLES20.glActiveTexture(33984 + i9);
            GLES20.glBindTexture(3553, iArr[i9]);
        }
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("GlGenericDrawer", "drawYuv glBindTexture error: " + glGetError);
            RXLogging.m74904e("GlGenericDrawer", "drawYuv glBindTexture error: " + glGetError);
            return;
        }
        GLES20.glViewport(i3, i4, i5, i6);
        GLES20.glDrawArrays(5, 0, 4);
        for (int i10 = 0; i10 < 3; i10++) {
            GLES20.glActiveTexture(i10 + 33984);
            GLES20.glBindTexture(3553, 0);
        }
        GlUtil.checkNoGLES2Error("drawYuv done");
    }
}
